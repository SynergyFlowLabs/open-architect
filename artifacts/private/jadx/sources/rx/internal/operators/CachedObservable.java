package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.internal.util.LinkedArrayList;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class CachedObservable<T> extends Observable<T> {
    private final CacheState<T> state;

    static final class CacheState<T> extends LinkedArrayList implements Observer<T> {
        static final ReplayProducer<?>[] EMPTY = new ReplayProducer[0];
        final SerialSubscription connection;
        volatile boolean isConnected;

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366744nl;
        volatile ReplayProducer<?>[] producers;
        final Observable<? extends T> source;
        boolean sourceDone;

        public CacheState(Observable<? extends T> observable, int i10) {
            super(i10);
            this.source = observable;
            this.producers = EMPTY;
            this.f366744nl = NotificationLite.instance();
            this.connection = new SerialSubscription();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void addProducer(ReplayProducer<T> replayProducer) {
            synchronized (this.connection) {
                ReplayProducer<?>[] replayProducerArr = this.producers;
                int length = replayProducerArr.length;
                ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[length + 1];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
                this.producers = replayProducerArr2;
            }
        }

        public void connect() {
            Subscriber<T> subscriber = new Subscriber<T>() { // from class: rx.internal.operators.CachedObservable.CacheState.1
                @Override // rx.Observer
                public void onCompleted() throws Throwable {
                    CacheState.this.onCompleted();
                }

                @Override // rx.Observer
                public void onError(Throwable th2) throws Throwable {
                    CacheState.this.onError(th2);
                }

                @Override // rx.Observer
                public void onNext(T t10) throws Throwable {
                    CacheState.this.onNext(t10);
                }
            };
            this.connection.set(subscriber);
            this.source.unsafeSubscribe(subscriber);
            this.isConnected = true;
        }

        void dispatch() throws Throwable {
            for (ReplayProducer<?> replayProducer : this.producers) {
                replayProducer.replay();
            }
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            if (this.sourceDone) {
                return;
            }
            this.sourceDone = true;
            add(this.f366744nl.completed());
            this.connection.unsubscribe();
            dispatch();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) throws Throwable {
            if (this.sourceDone) {
                return;
            }
            this.sourceDone = true;
            add(this.f366744nl.error(th2));
            this.connection.unsubscribe();
            dispatch();
        }

        @Override // rx.Observer
        public void onNext(T t10) throws Throwable {
            if (this.sourceDone) {
                return;
            }
            add(this.f366744nl.next(t10));
            dispatch();
        }

        public void removeProducer(ReplayProducer<T> replayProducer) {
            synchronized (this.connection) {
                try {
                    ReplayProducer<?>[] replayProducerArr = this.producers;
                    int length = replayProducerArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        } else if (replayProducerArr[i10].equals(replayProducer)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 < 0) {
                        return;
                    }
                    if (length == 1) {
                        this.producers = EMPTY;
                        return;
                    }
                    ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[length - 1];
                    System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, i10);
                    System.arraycopy(replayProducerArr, i10 + 1, replayProducerArr2, i10, (length - i10) - 1);
                    this.producers = replayProducerArr2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static final class CachedSubscribe<T> extends AtomicBoolean implements Observable.OnSubscribe<T> {
        private static final long serialVersionUID = -2817751667698696782L;
        final CacheState<T> state;

        public CachedSubscribe(CacheState<T> cacheState) {
            this.state = cacheState;
        }

        @Override // rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            ReplayProducer<T> replayProducer = new ReplayProducer<>(subscriber, this.state);
            this.state.addProducer(replayProducer);
            subscriber.add(replayProducer);
            subscriber.setProducer(replayProducer);
            if (!get() && compareAndSet(false, true)) {
                this.state.connect();
            }
        }
    }

    static final class ReplayProducer<T> extends AtomicLong implements Producer, Subscription {
        private static final long serialVersionUID = -2557562030197141021L;
        final Subscriber<? super T> child;
        Object[] currentBuffer;
        int currentIndexInBuffer;
        boolean emitting;
        int index;
        boolean missed;
        final CacheState<T> state;

        public ReplayProducer(Subscriber<? super T> subscriber, CacheState<T> cacheState) {
            this.child = subscriber;
            this.state = cacheState;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        public long produced(long j10) {
            return addAndGet(-j10);
        }

        public void replay() throws Throwable {
            boolean z10;
            synchronized (this) {
                try {
                    boolean z11 = true;
                    if (this.emitting) {
                        this.missed = true;
                        return;
                    }
                    this.emitting = true;
                    try {
                        NotificationLite<T> notificationLite = this.state.f366744nl;
                        Subscriber<? super T> subscriber = this.child;
                        while (true) {
                            long j10 = get();
                            if (j10 < 0) {
                                return;
                            }
                            int size = this.state.size();
                            try {
                                if (size != 0) {
                                    Object[] objArrHead = this.currentBuffer;
                                    if (objArrHead == null) {
                                        objArrHead = this.state.head();
                                        this.currentBuffer = objArrHead;
                                    }
                                    int length = objArrHead.length - 1;
                                    int i10 = this.index;
                                    int i11 = this.currentIndexInBuffer;
                                    if (j10 == 0) {
                                        Object obj = objArrHead[i11];
                                        if (notificationLite.isCompleted(obj)) {
                                            subscriber.onCompleted();
                                            unsubscribe();
                                            return;
                                        } else if (notificationLite.isError(obj)) {
                                            subscriber.onError(notificationLite.getError(obj));
                                            unsubscribe();
                                            return;
                                        }
                                    } else if (j10 > 0) {
                                        int i12 = 0;
                                        while (i10 < size && j10 > 0) {
                                            if (subscriber.isUnsubscribed()) {
                                                return;
                                            }
                                            if (i11 == length) {
                                                objArrHead = (Object[]) objArrHead[length];
                                                i11 = 0;
                                            }
                                            Object obj2 = objArrHead[i11];
                                            try {
                                                if (notificationLite.accept(subscriber, obj2)) {
                                                    try {
                                                        unsubscribe();
                                                        return;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        z10 = true;
                                                        try {
                                                            Exceptions.throwIfFatal(th);
                                                            unsubscribe();
                                                            if (notificationLite.isError(obj2) || notificationLite.isCompleted(obj2)) {
                                                                return;
                                                            }
                                                            subscriber.onError(OnErrorThrowable.addValueAsLastCause(th, notificationLite.getValue(obj2)));
                                                            return;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            z11 = z10;
                                                            if (!z11) {
                                                                synchronized (this) {
                                                                    this.emitting = false;
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                i11++;
                                                i10++;
                                                j10--;
                                                i12++;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                z10 = false;
                                            }
                                        }
                                        if (subscriber.isUnsubscribed()) {
                                            return;
                                        }
                                        this.index = i10;
                                        this.currentIndexInBuffer = i11;
                                        this.currentBuffer = objArrHead;
                                        produced(i12);
                                    }
                                }
                                try {
                                    synchronized (this) {
                                        try {
                                            if (!this.missed) {
                                                this.emitting = false;
                                                return;
                                            }
                                            this.missed = false;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        z11 = false;
                    }
                } catch (Throwable th9) {
                    throw th9;
                }
            }
        }

        @Override // rx.Producer
        public void request(long j10) throws Throwable {
            long j11;
            long j12;
            do {
                j11 = get();
                if (j11 < 0) {
                    return;
                }
                j12 = j11 + j10;
                if (j12 < 0) {
                    j12 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j11, j12));
            replay();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (get() < 0 || getAndSet(-1L) < 0) {
                return;
            }
            this.state.removeProducer(this);
        }
    }

    private CachedObservable(Observable.OnSubscribe<T> onSubscribe, CacheState<T> cacheState) {
        super(onSubscribe);
        this.state = cacheState;
    }

    public static <T> CachedObservable<T> from(Observable<? extends T> observable) {
        return from(observable, 16);
    }

    boolean hasObservers() {
        return this.state.producers.length != 0;
    }

    boolean isConnected() {
        return this.state.isConnected;
    }

    public static <T> CachedObservable<T> from(Observable<? extends T> observable, int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacityHint > 0 required");
        }
        CacheState cacheState = new CacheState(observable, i10);
        return new CachedObservable<>(new CachedSubscribe(cacheState), cacheState);
    }
}
