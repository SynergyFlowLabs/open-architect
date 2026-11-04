package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorEagerConcatMap<T, R> implements Observable.Operator<R, T> {
    final int bufferSize;
    final Func1<? super T, ? extends Observable<? extends R>> mapper;
    private final int maxConcurrent;

    static final class EagerInnerSubscriber<T> extends Subscriber<T> {
        volatile boolean done;
        Throwable error;

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366758nl;
        final EagerOuterSubscriber<?, T> parent;
        final Queue<Object> queue;

        public EagerInnerSubscriber(EagerOuterSubscriber<?, T> eagerOuterSubscriber, int i10) {
            this.parent = eagerOuterSubscriber;
            this.queue = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i10) : new SpscAtomicArrayQueue<>(i10);
            this.f366758nl = NotificationLite.instance();
            request(i10);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.done = true;
            this.parent.drain();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            this.parent.drain();
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            this.queue.offer(this.f366758nl.next(t10));
            this.parent.drain();
        }

        void requestMore(long j10) {
            request(j10);
        }
    }

    static final class EagerOuterProducer extends AtomicLong implements Producer {
        private static final long serialVersionUID = -657299606803478389L;
        final EagerOuterSubscriber<?, ?> parent;

        public EagerOuterProducer(EagerOuterSubscriber<?, ?> eagerOuterSubscriber) {
            this.parent = eagerOuterSubscriber;
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (j10 < 0) {
                throw new IllegalStateException("n >= 0 required but it was " + j10);
            }
            if (j10 > 0) {
                BackpressureUtils.getAndAddRequest(this, j10);
                this.parent.drain();
            }
        }
    }

    static final class EagerOuterSubscriber<T, R> extends Subscriber<T> {
        final Subscriber<? super R> actual;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        Throwable error;
        final Func1<? super T, ? extends Observable<? extends R>> mapper;
        private EagerOuterProducer sharedProducer;
        final Queue<EagerInnerSubscriber<R>> subscribers = new LinkedList();
        final AtomicInteger wip = new AtomicInteger();

        public EagerOuterSubscriber(Func1<? super T, ? extends Observable<? extends R>> func1, int i10, int i11, Subscriber<? super R> subscriber) {
            this.mapper = func1;
            this.bufferSize = i10;
            this.actual = subscriber;
            request(i11 == Integer.MAX_VALUE ? Long.MAX_VALUE : i11);
        }

        void cleanup() {
            ArrayList arrayList;
            synchronized (this.subscribers) {
                arrayList = new ArrayList(this.subscribers);
                this.subscribers.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Subscription) it.next()).unsubscribe();
            }
        }

        /* JADX WARN: Code duplicated, block: B:48:0x0087  */
        void drain() {
            EagerInnerSubscriber<R> eagerInnerSubscriberPeek;
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            EagerOuterProducer eagerOuterProducer = this.sharedProducer;
            Subscriber<? super R> subscriber = this.actual;
            NotificationLite notificationLiteInstance = NotificationLite.instance();
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z10 = this.done;
                synchronized (this.subscribers) {
                    eagerInnerSubscriberPeek = this.subscribers.peek();
                }
                boolean z11 = false;
                boolean z12 = eagerInnerSubscriberPeek == null;
                if (z10) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cleanup();
                        subscriber.onError(th2);
                        return;
                    } else if (z12) {
                        subscriber.onCompleted();
                        return;
                    }
                }
                if (!z12) {
                    long j10 = eagerOuterProducer.get();
                    Queue<Object> queue = eagerInnerSubscriberPeek.queue;
                    long j11 = 0;
                    while (true) {
                        boolean z13 = eagerInnerSubscriberPeek.done;
                        Object objPeek = queue.peek();
                        boolean z14 = objPeek == null;
                        if (!z13) {
                            if (!z14 || j10 == j11) {
                                break;
                            }
                            queue.poll();
                            try {
                                subscriber.onNext((Object) notificationLiteInstance.getValue(objPeek));
                                j11++;
                            } catch (Throwable th3) {
                                Exceptions.throwOrReport(th3, subscriber, objPeek);
                                return;
                            }
                        } else {
                            Throwable th4 = eagerInnerSubscriberPeek.error;
                            if (th4 != null) {
                                cleanup();
                                subscriber.onError(th4);
                                return;
                            }
                            if (z14) {
                                synchronized (this.subscribers) {
                                    this.subscribers.poll();
                                }
                                eagerInnerSubscriberPeek.unsubscribe();
                                request(1L);
                                z11 = true;
                                break;
                            }
                            if (!z14) {
                                break;
                            }
                            queue.poll();
                            subscriber.onNext((Object) notificationLiteInstance.getValue(objPeek));
                            j11++;
                        }
                    }
                    if (j11 != 0) {
                        if (j10 != Long.MAX_VALUE) {
                            BackpressureUtils.produced(eagerOuterProducer, j11);
                        }
                        if (!z11) {
                            eagerInnerSubscriberPeek.requestMore(j11);
                        }
                    }
                    if (z11) {
                        continue;
                    }
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            cleanup();
        }

        void init() {
            this.sharedProducer = new EagerOuterProducer(this);
            add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorEagerConcatMap.EagerOuterSubscriber.1
                @Override // rx.functions.Action0
                public void call() {
                    EagerOuterSubscriber.this.cancelled = true;
                    if (EagerOuterSubscriber.this.wip.getAndIncrement() == 0) {
                        EagerOuterSubscriber.this.cleanup();
                    }
                }
            }));
            this.actual.add(this);
            this.actual.setProducer(this.sharedProducer);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            try {
                Observable<? extends R> observableCall = this.mapper.call(t10);
                if (!this.cancelled) {
                    EagerInnerSubscriber<R> eagerInnerSubscriber = new EagerInnerSubscriber<>(this, this.bufferSize);
                    synchronized (this.subscribers) {
                        try {
                            if (this.cancelled) {
                                return;
                            }
                            this.subscribers.add(eagerInnerSubscriber);
                            if (!this.cancelled) {
                                observableCall.unsafeSubscribe(eagerInnerSubscriber);
                                drain();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwOrReport(th3, this.actual, t10);
            }
        }
    }

    public OperatorEagerConcatMap(Func1<? super T, ? extends Observable<? extends R>> func1, int i10, int i11) {
        this.mapper = func1;
        this.bufferSize = i10;
        this.maxConcurrent = i11;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        EagerOuterSubscriber eagerOuterSubscriber = new EagerOuterSubscriber(this.mapper, this.bufferSize, this.maxConcurrent, subscriber);
        eagerOuterSubscriber.init();
        return eagerOuterSubscriber;
    }
}
