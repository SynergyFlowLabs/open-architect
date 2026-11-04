package rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Func1;
import rx.internal.util.ExceptionsUtils;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.atomic.SpscLinkedArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeFlattenIterable<T, R> implements Observable.OnSubscribe<R> {
    final Func1<? super T, ? extends Iterable<? extends R>> mapper;
    final int prefetch;
    final Observable<? extends T> source;

    static final class FlattenIterableSubscriber<T, R> extends Subscriber<T> {
        Iterator<? extends R> active;
        final Subscriber<? super R> actual;
        volatile boolean done;
        final long limit;
        final Func1<? super T, ? extends Iterable<? extends R>> mapper;
        long produced;
        final Queue<Object> queue;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger wip = new AtomicInteger();
        final AtomicLong requested = new AtomicLong();

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366750nl = NotificationLite.instance();

        public FlattenIterableSubscriber(Subscriber<? super R> subscriber, Func1<? super T, ? extends Iterable<? extends R>> func1, int i10) {
            this.actual = subscriber;
            this.mapper = func1;
            if (i10 == Integer.MAX_VALUE) {
                this.limit = Long.MAX_VALUE;
                this.queue = new SpscLinkedArrayQueue(RxRingBuffer.SIZE);
            } else {
                this.limit = i10 - (i10 >> 2);
                if (UnsafeAccess.isUnsafeAvailable()) {
                    this.queue = new SpscArrayQueue(i10);
                } else {
                    this.queue = new SpscAtomicArrayQueue(i10);
                }
            }
            request(i10);
        }

        boolean checkTerminated(boolean z10, boolean z11, Subscriber<?> subscriber, Queue<?> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                this.active = null;
                return true;
            }
            if (z10) {
                if (this.error.get() != null) {
                    Throwable thTerminate = ExceptionsUtils.terminate(this.error);
                    unsubscribe();
                    queue.clear();
                    this.active = null;
                    subscriber.onError(thTerminate);
                    return true;
                }
                if (z11) {
                    subscriber.onCompleted();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x006c  */
        /* JADX WARN: Code duplicated, block: B:31:0x0077  */
        /* JADX WARN: Code duplicated, block: B:34:0x0080  */
        /* JADX WARN: Code duplicated, block: B:39:0x0091  */
        /* JADX WARN: Code duplicated, block: B:50:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:59:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:75:0x00d4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x00dd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x00dd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:78:0x00dd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x00d4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x00dd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x0014 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x0014 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x0098 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:? A[LOOP:1: B:29:0x0073->B:89:?, LOOP_END, SYNTHETIC] */
        void drain() {
            long j10;
            long j11;
            boolean z10;
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.actual;
            Queue<?> queue = this.queue;
            int iAddAndGet = 1;
            while (true) {
                Iterator<? extends R> it = this.active;
                boolean z11 = false;
                if (it == null) {
                    boolean z12 = this.done;
                    Object objPoll = queue.poll();
                    boolean z13 = objPoll == null;
                    if (checkTerminated(z12, z13, subscriber, queue)) {
                        return;
                    }
                    if (!z13) {
                        long j12 = this.produced + 1;
                        if (j12 == this.limit) {
                            this.produced = 0L;
                            request(j12);
                        } else {
                            this.produced = j12;
                        }
                        try {
                            it = this.mapper.call(this.f366750nl.getValue(objPoll)).iterator();
                            if (it.hasNext()) {
                                this.active = it;
                                if (it != null) {
                                    j10 = this.requested.get();
                                    j11 = 0;
                                    while (j11 != j10) {
                                        if (checkTerminated(this.done, false, subscriber, queue)) {
                                            return;
                                        }
                                        try {
                                            subscriber.onNext(it.next());
                                            if (checkTerminated(this.done, false, subscriber, queue)) {
                                                return;
                                            }
                                            j11++;
                                            try {
                                                if (!it.hasNext()) {
                                                    this.active = null;
                                                    it = null;
                                                    break;
                                                }
                                            } catch (Throwable th2) {
                                                Exceptions.throwIfFatal(th2);
                                                this.active = null;
                                                onError(th2);
                                            }
                                        } catch (Throwable th3) {
                                            Exceptions.throwIfFatal(th3);
                                            this.active = null;
                                            onError(th3);
                                        }
                                    }
                                    if (j11 == j10) {
                                        z10 = this.done;
                                        if (queue.isEmpty() && it == null) {
                                            z11 = true;
                                        }
                                        if (checkTerminated(z10, z11, subscriber, queue)) {
                                            return;
                                        }
                                    }
                                    if (j11 != 0) {
                                        BackpressureUtils.produced(this.requested, j11);
                                    }
                                    if (it == null) {
                                        continue;
                                    }
                                }
                                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                                if (iAddAndGet == 0) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            onError(th4);
                        }
                    }
                }
                if (it != null) {
                    j10 = this.requested.get();
                    j11 = 0;
                    while (j11 != j10) {
                        if (checkTerminated(this.done, false, subscriber, queue)) {
                            return;
                        }
                        subscriber.onNext(it.next());
                        if (checkTerminated(this.done, false, subscriber, queue)) {
                            return;
                        }
                        j11++;
                        if (!it.hasNext()) {
                            this.active = null;
                            it = null;
                            break;
                        }
                    }
                    if (j11 == j10) {
                        z10 = this.done;
                        if (queue.isEmpty()) {
                            z11 = true;
                        }
                        if (checkTerminated(z10, z11, subscriber, queue)) {
                            return;
                        }
                    }
                    if (j11 != 0) {
                        BackpressureUtils.produced(this.requested, j11);
                    }
                    if (it == null) {
                        continue;
                    }
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (!ExceptionsUtils.addThrowable(this.error, th2)) {
                RxJavaHooks.onError(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            if (this.queue.offer(this.f366750nl.next(t10))) {
                drain();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }

        void requestMore(long j10) {
            if (j10 > 0) {
                BackpressureUtils.getAndAddRequest(this.requested, j10);
                drain();
            } else {
                if (j10 >= 0) {
                    return;
                }
                throw new IllegalStateException("n >= 0 required but it was " + j10);
            }
        }
    }

    static final class OnSubscribeScalarFlattenIterable<T, R> implements Observable.OnSubscribe<R> {
        final Func1<? super T, ? extends Iterable<? extends R>> mapper;
        final T value;

        public OnSubscribeScalarFlattenIterable(T t10, Func1<? super T, ? extends Iterable<? extends R>> func1) {
            this.value = t10;
            this.mapper = func1;
        }

        @Override // rx.functions.Action1
        public void call(Subscriber<? super R> subscriber) {
            try {
                Iterator<? extends R> it = this.mapper.call(this.value).iterator();
                if (it.hasNext()) {
                    subscriber.setProducer(new OnSubscribeFromIterable.IterableProducer(subscriber, it));
                } else {
                    subscriber.onCompleted();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, subscriber, this.value);
            }
        }
    }

    protected OnSubscribeFlattenIterable(Observable<? extends T> observable, Func1<? super T, ? extends Iterable<? extends R>> func1, int i10) {
        this.source = observable;
        this.mapper = func1;
        this.prefetch = i10;
    }

    public static <T, R> Observable<R> createFrom(Observable<? extends T> observable, Func1<? super T, ? extends Iterable<? extends R>> func1, int i10) {
        return observable instanceof ScalarSynchronousObservable ? Observable.create(new OnSubscribeScalarFlattenIterable(((ScalarSynchronousObservable) observable).get(), func1)) : Observable.create(new OnSubscribeFlattenIterable(observable, func1, i10));
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        final FlattenIterableSubscriber flattenIterableSubscriber = new FlattenIterableSubscriber(subscriber, this.mapper, this.prefetch);
        subscriber.add(flattenIterableSubscriber);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OnSubscribeFlattenIterable.1
            @Override // rx.Producer
            public void request(long j10) {
                flattenIterableSubscriber.requestMore(j10);
            }
        });
        this.source.unsafeSubscribe(flattenIterableSubscriber);
    }
}
