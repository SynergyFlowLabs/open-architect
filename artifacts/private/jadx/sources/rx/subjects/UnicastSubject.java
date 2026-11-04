package rx.subjects;

import androidx.compose.animation.core.z1;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.annotations.Experimental;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Action0;
import rx.internal.operators.BackpressureUtils;
import rx.internal.operators.NotificationLite;
import rx.internal.util.atomic.SpscLinkedAtomicQueue;
import rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes14.dex */
@Experimental
public final class UnicastSubject<T> extends Subject<T, T> {
    final State<T> state;

    static final class State<T> extends AtomicLong implements Producer, Observer<T>, Observable.OnSubscribe<T>, Subscription {
        private static final long serialVersionUID = -9044104859202255786L;
        volatile boolean caughtUp;
        volatile boolean done;
        boolean emitting;
        Throwable error;
        boolean missed;
        final Queue<Object> queue;
        final AtomicReference<Action0> terminateOnce;

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366794nl = NotificationLite.instance();
        final AtomicReference<Subscriber<? super T>> subscriber = new AtomicReference<>();

        public State(int i10, Action0 action0) {
            Queue<Object> spscLinkedQueue;
            this.terminateOnce = action0 != null ? new AtomicReference<>(action0) : null;
            if (i10 > 1) {
                spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscUnboundedArrayQueue<>(i10) : new SpscUnboundedAtomicArrayQueue<>(i10);
            } else {
                spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue<>() : new SpscLinkedAtomicQueue<>();
            }
            this.queue = spscLinkedQueue;
        }

        boolean checkTerminated(boolean z10, boolean z11, Subscriber<? super T> subscriber) {
            if (subscriber.isUnsubscribed()) {
                this.queue.clear();
                return true;
            }
            if (z10) {
                Throwable th2 = this.error;
                if (th2 != null) {
                    this.queue.clear();
                    subscriber.onError(th2);
                    return true;
                }
                if (z11) {
                    subscriber.onCompleted();
                    return true;
                }
            }
            return false;
        }

        void doTerminate() {
            Action0 action0;
            AtomicReference<Action0> atomicReference = this.terminateOnce;
            if (atomicReference != null && (action0 = atomicReference.get()) != null && z1.a(atomicReference, action0, null)) {
                action0.call();
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.done;
        }

        @Override // rx.Observer
        public void onCompleted() {
            boolean z10;
            if (!this.done) {
                doTerminate();
                int i10 = 7 | 1;
                this.done = true;
                if (!this.caughtUp) {
                    synchronized (this) {
                        z10 = this.caughtUp;
                    }
                    if (!z10) {
                        replay();
                        return;
                    }
                }
                this.subscriber.get().onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            boolean z10;
            if (this.done) {
                return;
            }
            doTerminate();
            this.error = th2;
            this.done = true;
            if (!this.caughtUp) {
                synchronized (this) {
                    try {
                        z10 = this.caughtUp;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (!z10) {
                    replay();
                    return;
                }
            }
            this.subscriber.get().onError(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            boolean z10;
            if (this.done) {
                return;
            }
            if (!this.caughtUp) {
                synchronized (this) {
                    try {
                        if (this.caughtUp) {
                            z10 = false;
                        } else {
                            this.queue.offer(this.f366794nl.next(t10));
                            z10 = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    replay();
                    return;
                }
            }
            Subscriber<? super T> subscriber = this.subscriber.get();
            try {
                subscriber.onNext(t10);
            } catch (Throwable th3) {
                Exceptions.throwOrReport(th3, subscriber, t10);
            }
        }

        void replay() {
            boolean z10;
            synchronized (this) {
                try {
                    if (this.emitting) {
                        this.missed = true;
                        return;
                    }
                    this.emitting = true;
                    Queue<Object> queue = this.queue;
                    while (true) {
                        Subscriber<? super T> subscriber = this.subscriber.get();
                        if (subscriber == null) {
                            z10 = false;
                        } else {
                            if (checkTerminated(this.done, queue.isEmpty(), subscriber)) {
                                return;
                            }
                            long j10 = get();
                            z10 = j10 == Long.MAX_VALUE;
                            long j11 = 0;
                            while (j10 != 0) {
                                boolean z11 = this.done;
                                Object objPoll = queue.poll();
                                boolean z12 = objPoll == null;
                                if (checkTerminated(z11, z12, subscriber)) {
                                    return;
                                }
                                if (z12) {
                                    break;
                                }
                                T value = this.f366794nl.getValue(objPoll);
                                try {
                                    subscriber.onNext(value);
                                    j10--;
                                    j11++;
                                } catch (Throwable th2) {
                                    queue.clear();
                                    Exceptions.throwIfFatal(th2);
                                    subscriber.onError(OnErrorThrowable.addValueAsLastCause(th2, value));
                                    return;
                                }
                            }
                            if (!z10 && j11 != 0) {
                                addAndGet(-j11);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (!this.missed) {
                                    if (z10 && queue.isEmpty()) {
                                        this.caughtUp = true;
                                    }
                                    this.emitting = false;
                                    return;
                                }
                                this.missed = false;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
            if (j10 > 0) {
                BackpressureUtils.getAndAddRequest(this, j10);
                replay();
            } else if (this.done) {
                replay();
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            doTerminate();
            this.done = true;
            synchronized (this) {
                try {
                    if (this.emitting) {
                        return;
                    }
                    this.emitting = true;
                    this.queue.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            if (!z1.a(this.subscriber, null, subscriber)) {
                subscriber.onError(new IllegalStateException("Only a single subscriber is allowed"));
            } else {
                subscriber.add(this);
                subscriber.setProducer(this);
            }
        }
    }

    private UnicastSubject(State<T> state) {
        super(state);
        this.state = state;
    }

    public static <T> UnicastSubject<T> create() {
        return create(16);
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.state.subscriber.get() != null;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.state.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        this.state.onError(th2);
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        this.state.onNext(t10);
    }

    public static <T> UnicastSubject<T> create(int i10) {
        return new UnicastSubject<>(new State(i10, null));
    }

    public static <T> UnicastSubject<T> create(int i10, Action0 action0) {
        return new UnicastSubject<>(new State(i10, action0));
    }
}
