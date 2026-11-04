package rx.observables;

import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.annotations.Beta;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Action2;
import rx.functions.Func0;
import rx.functions.Func2;
import rx.internal.operators.BackpressureUtils;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public abstract class SyncOnSubscribe<S, T> implements Observable.OnSubscribe<T> {

    static final class SubscriptionProducer<S, T> extends AtomicLong implements Producer, Subscription, Observer<T> {
        private static final long serialVersionUID = -3736864024352728072L;
        private final Subscriber<? super T> actualSubscriber;
        private boolean hasTerminated;
        private boolean onNextCalled;
        private final SyncOnSubscribe<S, T> parent;
        private S state;

        SubscriptionProducer(Subscriber<? super T> subscriber, SyncOnSubscribe<S, T> syncOnSubscribe, S s10) {
            this.actualSubscriber = subscriber;
            this.parent = syncOnSubscribe;
            this.state = s10;
        }

        private void doUnsubscribe() {
            try {
                this.parent.onUnsubscribe(this.state);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaHooks.onError(th2);
            }
        }

        private void fastPath() {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.parent;
            Subscriber<? super T> subscriber = this.actualSubscriber;
            do {
                try {
                    this.onNextCalled = false;
                    nextIteration(syncOnSubscribe);
                } catch (Throwable th2) {
                    handleThrownError(subscriber, th2);
                    return;
                }
            } while (!tryUnsubscribe());
        }

        private void handleThrownError(Subscriber<? super T> subscriber, Throwable th2) {
            if (this.hasTerminated) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.hasTerminated = true;
            subscriber.onError(th2);
            unsubscribe();
        }

        private void nextIteration(SyncOnSubscribe<S, T> syncOnSubscribe) {
            this.state = syncOnSubscribe.next(this.state, this);
        }

        private void slowPath(long j10) {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.parent;
            Subscriber<? super T> subscriber = this.actualSubscriber;
            do {
                long j11 = j10;
                do {
                    try {
                        this.onNextCalled = false;
                        nextIteration(syncOnSubscribe);
                        if (tryUnsubscribe()) {
                            return;
                        }
                        if (this.onNextCalled) {
                            j11--;
                        }
                    } catch (Throwable th2) {
                        handleThrownError(subscriber, th2);
                        return;
                    }
                } while (j11 != 0);
                j10 = addAndGet(-j10);
            } while (j10 > 0);
            tryUnsubscribe();
        }

        private boolean tryUnsubscribe() {
            if (!this.hasTerminated && get() >= -1) {
                return false;
            }
            set(-1L);
            doUnsubscribe();
            return true;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.hasTerminated) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.hasTerminated = true;
            if (!this.actualSubscriber.isUnsubscribed()) {
                this.actualSubscriber.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (this.hasTerminated) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.hasTerminated = true;
            if (this.actualSubscriber.isUnsubscribed()) {
                return;
            }
            this.actualSubscriber.onError(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            if (this.onNextCalled) {
                throw new IllegalStateException("onNext called multiple times!");
            }
            this.onNextCalled = true;
            this.actualSubscriber.onNext(t10);
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (j10 <= 0 || BackpressureUtils.getAndAddRequest(this, j10) != 0) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                fastPath();
            } else {
                slowPath(j10);
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            long j10;
            do {
                j10 = get();
                if (compareAndSet(0L, -1L)) {
                    doUnsubscribe();
                    return;
                }
            } while (!compareAndSet(j10, -2L));
        }
    }

    @Beta
    public static <S, T> SyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, final Action2<? super S, ? super Observer<? super T>> action2) {
        return new SyncOnSubscribeImpl(func0, new Func2<S, Observer<? super T>, S>() { // from class: rx.observables.SyncOnSubscribe.1
            @Override // rx.functions.Func2
            public S call(S s10, Observer<? super T> observer) {
                action2.call(s10, observer);
                return s10;
            }
        });
    }

    @Beta
    public static <S, T> SyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2, Action1<? super S> action1) {
        return new SyncOnSubscribeImpl(func0, func2, action1);
    }

    @Beta
    public static <T> SyncOnSubscribe<Void, T> createStateless(final Action1<? super Observer<? super T>> action1) {
        return new SyncOnSubscribeImpl(new Func2<Void, Observer<? super T>, Void>() { // from class: rx.observables.SyncOnSubscribe.3
            @Override // rx.functions.Func2
            public Void call(Void r10, Observer<? super T> observer) {
                action1.call(observer);
                return r10;
            }
        });
    }

    protected abstract S generateState();

    protected abstract S next(S s10, Observer<? super T> observer);

    protected void onUnsubscribe(S s10) {
    }

    @Beta
    public static <S, T> SyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2) {
        return new SyncOnSubscribeImpl(func0, func2);
    }

    @Override // rx.functions.Action1
    public final void call(Subscriber<? super T> subscriber) {
        try {
            SubscriptionProducer subscriptionProducer = new SubscriptionProducer(subscriber, this, generateState());
            subscriber.add(subscriptionProducer);
            subscriber.setProducer(subscriptionProducer);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            subscriber.onError(th2);
        }
    }

    @Beta
    public static <S, T> SyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, final Action2<? super S, ? super Observer<? super T>> action2, Action1<? super S> action1) {
        return new SyncOnSubscribeImpl(func0, new Func2<S, Observer<? super T>, S>() { // from class: rx.observables.SyncOnSubscribe.2
            @Override // rx.functions.Func2
            public S call(S s10, Observer<? super T> observer) {
                action2.call(s10, observer);
                return s10;
            }
        }, action1);
    }

    @Beta
    public static <T> SyncOnSubscribe<Void, T> createStateless(final Action1<? super Observer<? super T>> action1, final Action0 action0) {
        return new SyncOnSubscribeImpl(new Func2<Void, Observer<? super T>, Void>() { // from class: rx.observables.SyncOnSubscribe.4
            @Override // rx.functions.Func2
            public Void call(Void r10, Observer<? super T> observer) {
                action1.call(observer);
                return null;
            }
        }, new Action1<Void>() { // from class: rx.observables.SyncOnSubscribe.5
            @Override // rx.functions.Action1
            public void call(Void r10) {
                action0.call();
            }
        });
    }

    static final class SyncOnSubscribeImpl<S, T> extends SyncOnSubscribe<S, T> {
        private final Func0<? extends S> generator;
        private final Func2<? super S, ? super Observer<? super T>, ? extends S> next;
        private final Action1<? super S> onUnsubscribe;

        SyncOnSubscribeImpl(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2, Action1<? super S> action1) {
            this.generator = func0;
            this.next = func2;
            this.onUnsubscribe = action1;
        }

        @Override // rx.observables.SyncOnSubscribe, rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Object obj) {
            super.call((Subscriber) obj);
        }

        @Override // rx.observables.SyncOnSubscribe
        protected S generateState() {
            Func0<? extends S> func0 = this.generator;
            if (func0 == null) {
                return null;
            }
            return func0.call();
        }

        @Override // rx.observables.SyncOnSubscribe
        protected S next(S s10, Observer<? super T> observer) {
            return this.next.call(s10, observer);
        }

        @Override // rx.observables.SyncOnSubscribe
        protected void onUnsubscribe(S s10) {
            Action1<? super S> action1 = this.onUnsubscribe;
            if (action1 != null) {
                action1.call(s10);
            }
        }

        public SyncOnSubscribeImpl(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2) {
            this(func0, func2, null);
        }

        public SyncOnSubscribeImpl(Func2<S, Observer<? super T>, S> func2, Action1<? super S> action1) {
            this(null, func2, action1);
        }

        public SyncOnSubscribeImpl(Func2<S, Observer<? super T>, S> func2) {
            this(null, func2, null);
        }
    }
}
