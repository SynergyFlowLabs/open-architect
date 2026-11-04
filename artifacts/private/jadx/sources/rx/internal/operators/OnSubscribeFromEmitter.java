package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.AsyncEmitter;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action1;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeFromEmitter<T> implements Observable.OnSubscribe<T> {
    final Action1<AsyncEmitter<T>> asyncEmitter;
    final AsyncEmitter.BackpressureMode backpressure;

    /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeFromEmitter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$rx$AsyncEmitter$BackpressureMode;

        static {
            int[] iArr = new int[AsyncEmitter.BackpressureMode.values().length];
            $SwitchMap$rx$AsyncEmitter$BackpressureMode = iArr;
            try {
                iArr[AsyncEmitter.BackpressureMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$rx$AsyncEmitter$BackpressureMode[AsyncEmitter.BackpressureMode.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$rx$AsyncEmitter$BackpressureMode[AsyncEmitter.BackpressureMode.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$rx$AsyncEmitter$BackpressureMode[AsyncEmitter.BackpressureMode.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static abstract class BaseAsyncEmitter<T> extends AtomicLong implements AsyncEmitter<T>, Producer, Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        final Subscriber<? super T> actual;
        final SerialSubscription serial = new SerialSubscription();

        public BaseAsyncEmitter(Subscriber<? super T> subscriber) {
            this.actual = subscriber;
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.serial.isUnsubscribed();
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.actual.isUnsubscribed()) {
                return;
            }
            try {
                this.actual.onCompleted();
                SerialSubscription serialSubscription = this.serial;
            } finally {
                this.serial.unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (this.actual.isUnsubscribed()) {
                return;
            }
            try {
                this.actual.onError(th2);
            } finally {
                this.serial.unsubscribe();
            }
        }

        void onRequested() {
        }

        void onUnsubscribed() {
        }

        @Override // rx.Producer
        public final void request(long j10) {
            if (BackpressureUtils.validate(j10)) {
                BackpressureUtils.getAndAddRequest(this, j10);
                onRequested();
            }
        }

        @Override // rx.AsyncEmitter
        public final long requested() {
            return get();
        }

        @Override // rx.AsyncEmitter
        public final void setCancellation(AsyncEmitter.Cancellable cancellable) {
            setSubscription(new CancellableSubscription(cancellable));
        }

        @Override // rx.AsyncEmitter
        public final void setSubscription(Subscription subscription) {
            this.serial.set(subscription);
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            this.serial.unsubscribe();
            onUnsubscribed();
        }
    }

    static final class BufferAsyncEmitter<T> extends BaseAsyncEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366751nl;
        final Queue<Object> queue;
        final AtomicInteger wip;

        public BufferAsyncEmitter(Subscriber<? super T> subscriber, int i10) {
            super(subscriber);
            this.queue = UnsafeAccess.isUnsafeAvailable() ? new SpscUnboundedArrayQueue<>(i10) : new SpscUnboundedAtomicArrayQueue<>(i10);
            this.wip = new AtomicInteger();
            this.f366751nl = NotificationLite.instance();
        }

        void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.actual;
            Queue<Object> queue = this.queue;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (j11 != j10) {
                    if (subscriber.isUnsubscribed()) {
                        queue.clear();
                        return;
                    }
                    boolean z10 = this.done;
                    Object objPoll = queue.poll();
                    boolean z11 = objPoll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            super.onError(th2);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(this.f366751nl.getValue(objPoll));
                    j11++;
                }
                if (j11 == j10) {
                    if (subscriber.isUnsubscribed()) {
                        queue.clear();
                        return;
                    }
                    boolean z12 = this.done;
                    boolean zIsEmpty = queue.isEmpty();
                    if (z12 && zIsEmpty) {
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            super.onError(th3);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    BackpressureUtils.produced(this, j11);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.BaseAsyncEmitter, rx.Observer
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.BaseAsyncEmitter, rx.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            this.queue.offer(this.f366751nl.next(t10));
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.BaseAsyncEmitter
        void onRequested() {
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.BaseAsyncEmitter
        void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }

    static final class CancellableSubscription extends AtomicReference<AsyncEmitter.Cancellable> implements Subscription {
        private static final long serialVersionUID = 5718521705281392066L;

        public CancellableSubscription(AsyncEmitter.Cancellable cancellable) {
            super(cancellable);
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() == null;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            AsyncEmitter.Cancellable andSet;
            if (get() == null || (andSet = getAndSet(null)) == null) {
                return;
            }
            try {
                andSet.cancel();
            } catch (Exception e10) {
                Exceptions.throwIfFatal(e10);
                RxJavaHooks.onError(e10);
            }
        }
    }

    static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public DropAsyncEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.NoOverflowBaseAsyncEmitter
        void onOverflow() {
        }
    }

    static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;
        private boolean done;

        public ErrorAsyncEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.BaseAsyncEmitter, rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            this.done = true;
            super.onCompleted();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.BaseAsyncEmitter, rx.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaHooks.onError(th2);
            } else {
                this.done = true;
                super.onError(th2);
            }
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.NoOverflowBaseAsyncEmitter, rx.Observer
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            super.onNext(t10);
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.NoOverflowBaseAsyncEmitter
        void onOverflow() {
            onError(new MissingBackpressureException("fromEmitter: could not emit value due to lack of requests"));
        }
    }

    static final class LatestAsyncEmitter<T> extends BaseAsyncEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366752nl;
        final AtomicReference<Object> queue;
        final AtomicInteger wip;

        public LatestAsyncEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
            this.queue = new AtomicReference<>();
            this.wip = new AtomicInteger();
            this.f366752nl = NotificationLite.instance();
        }

        void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.actual;
            AtomicReference<Object> atomicReference = this.queue;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (subscriber.isUnsubscribed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z10 = this.done;
                    Object andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (z10 && z11) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            super.onError(th2);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(this.f366752nl.getValue(andSet));
                    j11++;
                }
                if (j11 == j10) {
                    if (subscriber.isUnsubscribed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z12 = this.done;
                    boolean z13 = atomicReference.get() == null;
                    if (z12 && z13) {
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            super.onError(th3);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    BackpressureUtils.produced(this, j11);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.BaseAsyncEmitter, rx.Observer
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.BaseAsyncEmitter, rx.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            this.queue.set(this.f366752nl.next(t10));
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.BaseAsyncEmitter
        void onRequested() {
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.BaseAsyncEmitter
        void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }
    }

    static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseAsyncEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public NoOverflowBaseAsyncEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onNext(T t10) {
            if (this.actual.isUnsubscribed()) {
                return;
            }
            if (get() == 0) {
                onOverflow();
            } else {
                this.actual.onNext(t10);
                BackpressureUtils.produced(this, 1L);
            }
        }

        abstract void onOverflow();
    }

    static final class NoneAsyncEmitter<T> extends BaseAsyncEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public NoneAsyncEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            long j10;
            if (!this.actual.isUnsubscribed()) {
                this.actual.onNext(t10);
                do {
                    j10 = get();
                    if (j10 == 0) {
                        break;
                    }
                } while (!compareAndSet(j10, j10 - 1));
            }
        }
    }

    public OnSubscribeFromEmitter(Action1<AsyncEmitter<T>> action1, AsyncEmitter.BackpressureMode backpressureMode) {
        this.asyncEmitter = action1;
        this.backpressure = backpressureMode;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        BaseAsyncEmitter noneAsyncEmitter;
        int i10 = AnonymousClass1.$SwitchMap$rx$AsyncEmitter$BackpressureMode[this.backpressure.ordinal()];
        if (i10 == 1) {
            noneAsyncEmitter = new NoneAsyncEmitter(subscriber);
        } else if (i10 == 2) {
            noneAsyncEmitter = new ErrorAsyncEmitter(subscriber);
        } else if (i10 != 3) {
            noneAsyncEmitter = i10 != 4 ? new BufferAsyncEmitter(subscriber, RxRingBuffer.SIZE) : new LatestAsyncEmitter(subscriber);
        } else {
            noneAsyncEmitter = new DropAsyncEmitter(subscriber);
        }
        subscriber.add(noneAsyncEmitter);
        subscriber.setProducer(noneAsyncEmitter);
        this.asyncEmitter.call(noneAsyncEmitter);
    }
}
