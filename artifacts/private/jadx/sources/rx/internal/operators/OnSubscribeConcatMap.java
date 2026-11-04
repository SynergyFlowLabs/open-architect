package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Func1;
import rx.internal.producers.ProducerArbiter;
import rx.internal.util.ExceptionsUtils;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.observers.SerializedSubscriber;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeConcatMap<T, R> implements Observable.OnSubscribe<R> {
    public static final int BOUNDARY = 1;
    public static final int END = 2;
    public static final int IMMEDIATE = 0;
    final int delayErrorMode;
    final Func1<? super T, ? extends Observable<? extends R>> mapper;
    final int prefetch;
    final Observable<? extends T> source;

    static final class ConcatMapInnerScalarProducer<T, R> implements Producer {
        boolean once;
        final ConcatMapSubscriber<T, R> parent;
        final R value;

        public ConcatMapInnerScalarProducer(R r10, ConcatMapSubscriber<T, R> concatMapSubscriber) {
            this.value = r10;
            this.parent = concatMapSubscriber;
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (this.once || j10 <= 0) {
                return;
            }
            this.once = true;
            ConcatMapSubscriber<T, R> concatMapSubscriber = this.parent;
            concatMapSubscriber.innerNext(this.value);
            concatMapSubscriber.innerCompleted(1L);
        }
    }

    static final class ConcatMapInnerSubscriber<T, R> extends Subscriber<R> {
        final ConcatMapSubscriber<T, R> parent;
        long produced;

        public ConcatMapInnerSubscriber(ConcatMapSubscriber<T, R> concatMapSubscriber) {
            this.parent = concatMapSubscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.parent.innerCompleted(this.produced);
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.parent.innerError(th2, this.produced);
        }

        @Override // rx.Observer
        public void onNext(R r10) {
            this.produced++;
            this.parent.innerNext(r10);
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.parent.arbiter.setProducer(producer);
        }
    }

    static final class ConcatMapSubscriber<T, R> extends Subscriber<T> {
        volatile boolean active;
        final Subscriber<? super R> actual;
        final int delayErrorMode;
        volatile boolean done;
        final SerialSubscription inner;
        final Func1<? super T, ? extends Observable<? extends R>> mapper;
        final Queue<Object> queue;
        final ProducerArbiter arbiter = new ProducerArbiter();
        final AtomicInteger wip = new AtomicInteger();
        final AtomicReference<Throwable> error = new AtomicReference<>();

        public ConcatMapSubscriber(Subscriber<? super R> subscriber, Func1<? super T, ? extends Observable<? extends R>> func1, int i10, int i11) {
            this.actual = subscriber;
            this.mapper = func1;
            this.delayErrorMode = i11;
            this.queue = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i10) : new SpscAtomicArrayQueue<>(i10);
            this.inner = new SerialSubscription();
            request(i10);
        }

        void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            int i10 = this.delayErrorMode;
            while (!this.actual.isUnsubscribed()) {
                if (!this.active) {
                    if (i10 == 1 && this.error.get() != null) {
                        Throwable thTerminate = ExceptionsUtils.terminate(this.error);
                        if (ExceptionsUtils.isTerminated(thTerminate)) {
                            return;
                        }
                        this.actual.onError(thTerminate);
                        return;
                    }
                    boolean z10 = this.done;
                    Object objPoll = this.queue.poll();
                    boolean z11 = objPoll == null;
                    if (z10 && z11) {
                        Throwable thTerminate2 = ExceptionsUtils.terminate(this.error);
                        if (thTerminate2 == null) {
                            this.actual.onCompleted();
                            return;
                        } else {
                            if (ExceptionsUtils.isTerminated(thTerminate2)) {
                                return;
                            }
                            this.actual.onError(thTerminate2);
                            return;
                        }
                    }
                    if (!z11) {
                        try {
                            Observable<? extends R> observableCall = this.mapper.call((Object) NotificationLite.instance().getValue(objPoll));
                            if (observableCall == null) {
                                drainError(new NullPointerException("The source returned by the mapper was null"));
                                return;
                            }
                            if (observableCall != Observable.empty()) {
                                if (observableCall instanceof ScalarSynchronousObservable) {
                                    this.active = true;
                                    this.arbiter.setProducer(new ConcatMapInnerScalarProducer(((ScalarSynchronousObservable) observableCall).get(), this));
                                } else {
                                    ConcatMapInnerSubscriber concatMapInnerSubscriber = new ConcatMapInnerSubscriber(this);
                                    this.inner.set(concatMapInnerSubscriber);
                                    if (concatMapInnerSubscriber.isUnsubscribed()) {
                                        return;
                                    }
                                    this.active = true;
                                    observableCall.unsafeSubscribe(concatMapInnerSubscriber);
                                }
                                request(1L);
                            } else {
                                request(1L);
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            drainError(th2);
                            return;
                        }
                    }
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        void drainError(Throwable th2) {
            unsubscribe();
            if (!ExceptionsUtils.addThrowable(this.error, th2)) {
                pluginError(th2);
                return;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.error);
            if (!ExceptionsUtils.isTerminated(thTerminate)) {
                this.actual.onError(thTerminate);
            }
        }

        void innerCompleted(long j10) {
            if (j10 != 0) {
                this.arbiter.produced(j10);
            }
            this.active = false;
            drain();
        }

        void innerError(Throwable th2, long j10) {
            if (!ExceptionsUtils.addThrowable(this.error, th2)) {
                pluginError(th2);
                return;
            }
            if (this.delayErrorMode == 0) {
                Throwable thTerminate = ExceptionsUtils.terminate(this.error);
                if (!ExceptionsUtils.isTerminated(thTerminate)) {
                    this.actual.onError(thTerminate);
                }
                unsubscribe();
                return;
            }
            if (j10 != 0) {
                this.arbiter.produced(j10);
            }
            this.active = false;
            drain();
        }

        void innerNext(R r10) {
            this.actual.onNext(r10);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (!ExceptionsUtils.addThrowable(this.error, th2)) {
                pluginError(th2);
                return;
            }
            this.done = true;
            if (this.delayErrorMode != 0) {
                drain();
                return;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.error);
            if (!ExceptionsUtils.isTerminated(thTerminate)) {
                this.actual.onError(thTerminate);
            }
            this.inner.unsubscribe();
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            if (this.queue.offer(NotificationLite.instance().next(t10))) {
                drain();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }

        void pluginError(Throwable th2) {
            RxJavaHooks.onError(th2);
        }

        void requestMore(long j10) {
            if (j10 > 0) {
                this.arbiter.request(j10);
            } else {
                if (j10 >= 0) {
                    return;
                }
                throw new IllegalArgumentException("n >= 0 required but it was " + j10);
            }
        }
    }

    public OnSubscribeConcatMap(Observable<? extends T> observable, Func1<? super T, ? extends Observable<? extends R>> func1, int i10, int i11) {
        this.source = observable;
        this.mapper = func1;
        this.prefetch = i10;
        this.delayErrorMode = i11;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        final ConcatMapSubscriber concatMapSubscriber = new ConcatMapSubscriber(this.delayErrorMode == 0 ? new SerializedSubscriber<>(subscriber) : subscriber, this.mapper, this.prefetch, this.delayErrorMode);
        subscriber.add(concatMapSubscriber);
        subscriber.add(concatMapSubscriber.inner);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OnSubscribeConcatMap.1
            @Override // rx.Producer
            public void request(long j10) {
                concatMapSubscriber.requestMore(j10);
            }
        });
        if (subscriber.isUnsubscribed()) {
            return;
        }
        this.source.unsafeSubscribe(concatMapSubscriber);
    }
}
