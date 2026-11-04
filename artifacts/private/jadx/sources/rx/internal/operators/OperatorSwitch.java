package rx.internal.operators;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.functions.Action0;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.atomic.SpscLinkedArrayQueue;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorSwitch<T> implements Observable.Operator<T, Observable<? extends T>> {
    final boolean delayError;

    static final class Holder {
        static final OperatorSwitch<Object> INSTANCE = new OperatorSwitch<>(false);

        Holder() {
        }
    }

    static final class HolderDelayError {
        static final OperatorSwitch<Object> INSTANCE = new OperatorSwitch<>(true);

        HolderDelayError() {
        }
    }

    static final class InnerSubscriber<T> extends Subscriber<T> {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f366767id;
        private final SwitchSubscriber<T> parent;

        InnerSubscriber(long j10, SwitchSubscriber<T> switchSubscriber) {
            this.f366767id = j10;
            this.parent = switchSubscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.parent.complete(this.f366767id);
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.parent.error(th2, this.f366767id);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            this.parent.emit(t10, this);
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.parent.innerProducer(producer, this.f366767id);
        }
    }

    static final class SwitchSubscriber<T> extends Subscriber<Observable<? extends T>> {
        static final Throwable TERMINAL_ERROR = new Throwable("Terminal error");
        final Subscriber<? super T> child;
        final boolean delayError;
        boolean emitting;
        Throwable error;
        boolean innerActive;
        volatile boolean mainDone;
        boolean missed;
        Producer producer;
        long requested;
        final SerialSubscription serial = new SerialSubscription();
        final AtomicLong index = new AtomicLong();
        final SpscLinkedArrayQueue<Object> queue = new SpscLinkedArrayQueue<>(RxRingBuffer.SIZE);

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366768nl = NotificationLite.instance();

        SwitchSubscriber(Subscriber<? super T> subscriber, boolean z10) {
            this.child = subscriber;
            this.delayError = z10;
        }

        protected boolean checkTerminated(boolean z10, boolean z11, Throwable th2, SpscLinkedArrayQueue<Object> spscLinkedArrayQueue, Subscriber<? super T> subscriber, boolean z12) {
            if (this.delayError) {
                if (z10 && !z11 && z12) {
                    if (th2 != null) {
                        subscriber.onError(th2);
                    } else {
                        subscriber.onCompleted();
                    }
                    return true;
                }
            } else {
                if (th2 != null) {
                    spscLinkedArrayQueue.clear();
                    subscriber.onError(th2);
                    return true;
                }
                if (z10 && !z11 && z12) {
                    subscriber.onCompleted();
                    return true;
                }
            }
            return false;
        }

        void childRequested(long j10) {
            Producer producer;
            synchronized (this) {
                producer = this.producer;
                this.requested = BackpressureUtils.addCap(this.requested, j10);
            }
            if (producer != null) {
                producer.request(j10);
            }
            drain();
        }

        void clearProducer() {
            synchronized (this) {
                this.producer = null;
            }
        }

        void complete(long j10) {
            synchronized (this) {
                try {
                    if (this.index.get() != j10) {
                        return;
                    }
                    this.innerActive = false;
                    this.producer = null;
                    drain();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void drain() {
            Throwable th2;
            Throwable th3;
            synchronized (this) {
                try {
                    if (this.emitting) {
                        this.missed = true;
                        return;
                    }
                    this.emitting = true;
                    boolean z10 = this.innerActive;
                    long j10 = this.requested;
                    Throwable th4 = this.error;
                    if (th4 != null && th4 != (th3 = TERMINAL_ERROR) && !this.delayError) {
                        this.error = th3;
                    }
                    SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                    AtomicLong atomicLong = this.index;
                    Subscriber<? super T> subscriber = this.child;
                    long j11 = j10;
                    boolean z11 = this.mainDone;
                    boolean z12 = z10;
                    while (true) {
                        long j12 = 0;
                        while (j12 != j11) {
                            if (subscriber.isUnsubscribed()) {
                                return;
                            }
                            boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                            if (checkTerminated(z11, z12, th4, spscLinkedArrayQueue, subscriber, zIsEmpty)) {
                                return;
                            }
                            if (zIsEmpty) {
                                break;
                            }
                            InnerSubscriber innerSubscriber = (InnerSubscriber) spscLinkedArrayQueue.poll();
                            T value = this.f366768nl.getValue(spscLinkedArrayQueue.poll());
                            if (atomicLong.get() == innerSubscriber.f366767id) {
                                subscriber.onNext(value);
                                j12++;
                            }
                        }
                        if (j12 == j11 && (subscriber.isUnsubscribed() || checkTerminated(this.mainDone, z12, th4, spscLinkedArrayQueue, subscriber, spscLinkedArrayQueue.isEmpty()))) {
                            return;
                        }
                        synchronized (this) {
                            try {
                                long j13 = this.requested;
                                if (j13 != Long.MAX_VALUE) {
                                    j13 -= j12;
                                    this.requested = j13;
                                }
                                j11 = j13;
                                if (!this.missed) {
                                    this.emitting = false;
                                    return;
                                }
                                this.missed = false;
                                z11 = this.mainDone;
                                z12 = this.innerActive;
                                th4 = this.error;
                                if (th4 != null && th4 != (th2 = TERMINAL_ERROR) && !this.delayError) {
                                    this.error = th2;
                                }
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }

        void emit(T t10, InnerSubscriber<T> innerSubscriber) {
            synchronized (this) {
                try {
                    if (this.index.get() != ((InnerSubscriber) innerSubscriber).f366767id) {
                        return;
                    }
                    this.queue.offer(innerSubscriber, this.f366768nl.next(t10));
                    drain();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void error(Throwable th2, long j10) {
            boolean zUpdateError;
            synchronized (this) {
                try {
                    if (this.index.get() == j10) {
                        zUpdateError = updateError(th2);
                        this.innerActive = false;
                        this.producer = null;
                    } else {
                        zUpdateError = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (zUpdateError) {
                drain();
            } else {
                pluginError(th2);
            }
        }

        void init() {
            this.child.add(this.serial);
            this.child.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorSwitch.SwitchSubscriber.1
                @Override // rx.functions.Action0
                public void call() {
                    SwitchSubscriber.this.clearProducer();
                }
            }));
            this.child.setProducer(new Producer() { // from class: rx.internal.operators.OperatorSwitch.SwitchSubscriber.2
                @Override // rx.Producer
                public void request(long j10) {
                    if (j10 > 0) {
                        SwitchSubscriber.this.childRequested(j10);
                    } else {
                        if (j10 >= 0) {
                            return;
                        }
                        throw new IllegalArgumentException("n >= 0 expected but it was " + j10);
                    }
                }
            });
        }

        void innerProducer(Producer producer, long j10) {
            synchronized (this) {
                try {
                    if (this.index.get() != j10) {
                        return;
                    }
                    long j11 = this.requested;
                    this.producer = producer;
                    producer.request(j11);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.mainDone = true;
            drain();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            boolean zUpdateError;
            synchronized (this) {
                try {
                    zUpdateError = updateError(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (!zUpdateError) {
                pluginError(th2);
            } else {
                this.mainDone = true;
                drain();
            }
        }

        void pluginError(Throwable th2) {
            RxJavaHooks.onError(th2);
        }

        boolean updateError(Throwable th2) {
            Throwable th3 = this.error;
            if (th3 == TERMINAL_ERROR) {
                return false;
            }
            if (th3 == null) {
                this.error = th2;
            } else if (th3 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th3).getExceptions());
                arrayList.add(th2);
                this.error = new CompositeException(arrayList);
            } else {
                this.error = new CompositeException(th3, th2);
            }
            return true;
        }

        @Override // rx.Observer
        public void onNext(Observable<? extends T> observable) {
            InnerSubscriber innerSubscriber;
            long jIncrementAndGet = this.index.incrementAndGet();
            Subscription subscription = this.serial.get();
            if (subscription != null) {
                subscription.unsubscribe();
            }
            synchronized (this) {
                innerSubscriber = new InnerSubscriber(jIncrementAndGet, this);
                this.innerActive = true;
                this.producer = null;
            }
            this.serial.set(innerSubscriber);
            observable.unsafeSubscribe(innerSubscriber);
        }
    }

    OperatorSwitch(boolean z10) {
        this.delayError = z10;
    }

    public static <T> OperatorSwitch<T> instance(boolean z10) {
        return z10 ? (OperatorSwitch<T>) HolderDelayError.INSTANCE : (OperatorSwitch<T>) Holder.INSTANCE;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super Observable<? extends T>> call(Subscriber<? super T> subscriber) {
        SwitchSubscriber switchSubscriber = new SwitchSubscriber(subscriber, this.delayError);
        subscriber.add(switchSubscriber);
        switchSubscriber.init();
        return switchSubscriber;
    }
}
