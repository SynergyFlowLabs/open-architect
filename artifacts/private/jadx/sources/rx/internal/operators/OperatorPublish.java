package rx.internal.operators;

import androidx.compose.animation.core.z1;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.SynchronizedQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.observables.ConnectableObservable;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorPublish<T> extends ConnectableObservable<T> {
    final AtomicReference<PublishSubscriber<T>> current;
    final Observable<? extends T> source;

    static final class InnerProducer<T> extends AtomicLong implements Producer, Subscription {
        static final long NOT_REQUESTED = -4611686018427387904L;
        static final long UNSUBSCRIBED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final Subscriber<? super T> child;
        final PublishSubscriber<T> parent;

        public InnerProducer(PublishSubscriber<T> publishSubscriber, Subscriber<? super T> subscriber) {
            this.parent = publishSubscriber;
            this.child = subscriber;
            lazySet(-4611686018427387904L);
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public long produced(long j10) {
            long j11;
            long j12;
            if (j10 <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            do {
                j11 = get();
                if (j11 == -4611686018427387904L) {
                    throw new IllegalStateException("Produced without request");
                }
                if (j11 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j12 = j11 - j10;
                if (j12 < 0) {
                    throw new IllegalStateException("More produced (" + j10 + ") than requested (" + j11 + ")");
                }
            } while (!compareAndSet(j11, j12));
            return j12;
        }

        @Override // rx.Producer
        public void request(long j10) throws Throwable {
            long j11;
            long j12;
            if (j10 < 0) {
                return;
            }
            do {
                j11 = get();
                if (j11 == Long.MIN_VALUE) {
                    return;
                }
                if (j11 >= 0 && j10 == 0) {
                    return;
                }
                if (j11 == -4611686018427387904L) {
                    j12 = j10;
                } else {
                    j12 = j11 + j10;
                    if (j12 < 0) {
                        j12 = Long.MAX_VALUE;
                    }
                }
            } while (!compareAndSet(j11, j12));
            this.parent.dispatch();
        }

        @Override // rx.Subscription
        public void unsubscribe() throws Throwable {
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.parent.remove(this);
            this.parent.dispatch();
        }
    }

    static final class PublishSubscriber<T> extends Subscriber<T> implements Subscription {
        static final InnerProducer[] EMPTY = new InnerProducer[0];
        static final InnerProducer[] TERMINATED = new InnerProducer[0];
        final AtomicReference<PublishSubscriber<T>> current;
        boolean emitting;
        boolean missed;

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366762nl;
        final AtomicReference<InnerProducer[]> producers;
        final Queue<Object> queue;
        final AtomicBoolean shouldConnect;
        volatile Object terminalEvent;

        public PublishSubscriber(AtomicReference<PublishSubscriber<T>> atomicReference) {
            this.queue = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(RxRingBuffer.SIZE) : new SynchronizedQueue<>(RxRingBuffer.SIZE);
            this.f366762nl = NotificationLite.instance();
            this.producers = new AtomicReference<>(EMPTY);
            this.current = atomicReference;
            this.shouldConnect = new AtomicBoolean();
        }

        boolean add(InnerProducer<T> innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            innerProducer.getClass();
            do {
                innerProducerArr = this.producers.get();
                if (innerProducerArr == TERMINATED) {
                    return false;
                }
                int length = innerProducerArr.length;
                innerProducerArr2 = new InnerProducer[length + 1];
                System.arraycopy(innerProducerArr, 0, innerProducerArr2, 0, length);
                innerProducerArr2[length] = innerProducer;
            } while (!z1.a(this.producers, innerProducerArr, innerProducerArr2));
            return true;
        }

        boolean checkTerminated(Object obj, boolean z10) {
            int i10 = 0;
            if (obj != null) {
                if (!this.f366762nl.isCompleted(obj)) {
                    Throwable error = this.f366762nl.getError(obj);
                    z1.a(this.current, this, null);
                    try {
                        InnerProducer[] andSet = this.producers.getAndSet(TERMINATED);
                        int length = andSet.length;
                        while (i10 < length) {
                            andSet[i10].child.onError(error);
                            i10++;
                        }
                        unsubscribe();
                        return true;
                    } catch (Throwable th2) {
                        unsubscribe();
                        throw th2;
                    }
                }
                if (z10) {
                    z1.a(this.current, this, null);
                    try {
                        InnerProducer[] andSet2 = this.producers.getAndSet(TERMINATED);
                        int length2 = andSet2.length;
                        while (i10 < length2) {
                            andSet2[i10].child.onCompleted();
                            i10++;
                        }
                        unsubscribe();
                        return true;
                    } catch (Throwable th3) {
                        unsubscribe();
                        throw th3;
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x00ee */
        /* JADX WARN: Code duplicated, block: B:102:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void dispatch() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorPublish.PublishSubscriber.dispatch():void");
        }

        void init() {
            add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorPublish.PublishSubscriber.1
                @Override // rx.functions.Action0
                public void call() {
                    PublishSubscriber.this.producers.getAndSet(PublishSubscriber.TERMINATED);
                    PublishSubscriber publishSubscriber = PublishSubscriber.this;
                    z1.a(publishSubscriber.current, publishSubscriber, null);
                }
            }));
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            if (this.terminalEvent == null) {
                this.terminalEvent = this.f366762nl.completed();
                dispatch();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) throws Throwable {
            if (this.terminalEvent == null) {
                this.terminalEvent = this.f366762nl.error(th2);
                dispatch();
            }
        }

        @Override // rx.Observer
        public void onNext(T t10) throws Throwable {
            if (this.queue.offer(this.f366762nl.next(t10))) {
                dispatch();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(RxRingBuffer.SIZE);
        }

        void remove(InnerProducer<T> innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            do {
                innerProducerArr = this.producers.get();
                if (innerProducerArr != EMPTY && innerProducerArr != TERMINATED) {
                    int length = innerProducerArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        } else if (innerProducerArr[i10].equals(innerProducer)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 < 0) {
                        break;
                    }
                    if (length == 1) {
                        innerProducerArr2 = EMPTY;
                    } else {
                        InnerProducer[] innerProducerArr3 = new InnerProducer[length - 1];
                        System.arraycopy(innerProducerArr, 0, innerProducerArr3, 0, i10);
                        System.arraycopy(innerProducerArr, i10 + 1, innerProducerArr3, i10, (length - i10) - 1);
                        innerProducerArr2 = innerProducerArr3;
                    }
                } else {
                    break;
                    break;
                }
            } while (!z1.a(this.producers, innerProducerArr, innerProducerArr2));
        }
    }

    private OperatorPublish(Observable.OnSubscribe<T> onSubscribe, Observable<? extends T> observable, AtomicReference<PublishSubscriber<T>> atomicReference) {
        super(onSubscribe);
        this.source = observable;
        this.current = atomicReference;
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable) {
        final AtomicReference atomicReference = new AtomicReference();
        return new OperatorPublish(new Observable.OnSubscribe<T>() { // from class: rx.internal.operators.OperatorPublish.1
            @Override // rx.functions.Action1
            public void call(Subscriber<? super T> subscriber) {
                while (true) {
                    PublishSubscriber publishSubscriber = (PublishSubscriber) atomicReference.get();
                    if (publishSubscriber == null || publishSubscriber.isUnsubscribed()) {
                        PublishSubscriber publishSubscriber2 = new PublishSubscriber(atomicReference);
                        publishSubscriber2.init();
                        if (z1.a(atomicReference, publishSubscriber, publishSubscriber2)) {
                            publishSubscriber = publishSubscriber2;
                        } else {
                            continue;
                        }
                    }
                    InnerProducer<T> innerProducer = new InnerProducer<>(publishSubscriber, subscriber);
                    if (publishSubscriber.add((InnerProducer) innerProducer)) {
                        subscriber.add(innerProducer);
                        subscriber.setProducer(innerProducer);
                        return;
                    }
                }
            }
        }, observable, atomicReference);
    }

    @Override // rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        PublishSubscriber<T> publishSubscriber;
        while (true) {
            publishSubscriber = this.current.get();
            if (publishSubscriber != null && !publishSubscriber.isUnsubscribed()) {
                break;
            }
            PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.current);
            publishSubscriber2.init();
            if (z1.a(this.current, publishSubscriber, publishSubscriber2)) {
                publishSubscriber = publishSubscriber2;
                break;
            }
        }
        boolean z10 = false;
        if (!publishSubscriber.shouldConnect.get() && publishSubscriber.shouldConnect.compareAndSet(false, true)) {
            z10 = true;
        }
        action1.call(publishSubscriber);
        if (z10) {
            this.source.unsafeSubscribe(publishSubscriber);
        }
    }

    public static <T, R> Observable<R> create(Observable<? extends T> observable, Func1<? super Observable<T>, ? extends Observable<R>> func1) {
        return create(observable, func1, false);
    }

    public static <T, R> Observable<R> create(final Observable<? extends T> observable, final Func1<? super Observable<T>, ? extends Observable<R>> func1, final boolean z10) {
        return Observable.create(new Observable.OnSubscribe<R>() { // from class: rx.internal.operators.OperatorPublish.2
            @Override // rx.functions.Action1
            public void call(final Subscriber<? super R> subscriber) {
                final OnSubscribePublishMulticast onSubscribePublishMulticast = new OnSubscribePublishMulticast(RxRingBuffer.SIZE, z10);
                Subscriber<R> subscriber2 = new Subscriber<R>() { // from class: rx.internal.operators.OperatorPublish.2.1
                    @Override // rx.Observer
                    public void onCompleted() {
                        onSubscribePublishMulticast.unsubscribe();
                        subscriber.onCompleted();
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th2) {
                        onSubscribePublishMulticast.unsubscribe();
                        subscriber.onError(th2);
                    }

                    @Override // rx.Observer
                    public void onNext(R r10) {
                        subscriber.onNext(r10);
                    }

                    @Override // rx.Subscriber
                    public void setProducer(Producer producer) {
                        subscriber.setProducer(producer);
                    }
                };
                subscriber.add(onSubscribePublishMulticast);
                subscriber.add(subscriber2);
                ((Observable) func1.call(Observable.create(onSubscribePublishMulticast))).unsafeSubscribe(subscriber2);
                observable.unsafeSubscribe(onSubscribePublishMulticast.subscriber());
            }
        });
    }
}
