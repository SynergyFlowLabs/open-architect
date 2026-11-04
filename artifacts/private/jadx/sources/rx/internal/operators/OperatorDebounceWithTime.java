package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorDebounceWithTime<T> implements Observable.Operator<T, T> {
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    /* JADX INFO: renamed from: rx.internal.operators.OperatorDebounceWithTime$1, reason: invalid class name */
    class AnonymousClass1 extends Subscriber<T> {
        final Subscriber<?> self;
        final DebounceState<T> state;
        final /* synthetic */ SerializedSubscriber val$s;
        final /* synthetic */ SerialSubscription val$serial;
        final /* synthetic */ Scheduler.Worker val$worker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Subscriber subscriber, SerialSubscription serialSubscription, Scheduler.Worker worker, SerializedSubscriber serializedSubscriber) {
            super(subscriber);
            this.val$serial = serialSubscription;
            this.val$worker = worker;
            this.val$s = serializedSubscriber;
            this.state = new DebounceState<>();
            this.self = this;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.state.emitAndComplete(this.val$s, this);
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.val$s.onError(th2);
            unsubscribe();
            this.state.clear();
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            final int next = this.state.next(t10);
            SerialSubscription serialSubscription = this.val$serial;
            Scheduler.Worker worker = this.val$worker;
            Action0 action0 = new Action0() { // from class: rx.internal.operators.OperatorDebounceWithTime.1.1
                @Override // rx.functions.Action0
                public void call() {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    anonymousClass1.state.emit(next, anonymousClass1.val$s, anonymousClass1.self);
                }
            };
            OperatorDebounceWithTime operatorDebounceWithTime = OperatorDebounceWithTime.this;
            serialSubscription.set(worker.schedule(action0, operatorDebounceWithTime.timeout, operatorDebounceWithTime.unit));
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    static final class DebounceState<T> {
        boolean emitting;
        boolean hasValue;
        int index;
        boolean terminate;
        T value;

        DebounceState() {
        }

        public synchronized void clear() {
            this.index++;
            this.value = null;
            this.hasValue = false;
        }

        public void emit(int i10, Subscriber<T> subscriber, Subscriber<?> subscriber2) {
            synchronized (this) {
                try {
                    if (!this.emitting && this.hasValue && i10 == this.index) {
                        T t10 = this.value;
                        this.value = null;
                        this.hasValue = false;
                        this.emitting = true;
                        try {
                            subscriber.onNext(t10);
                            synchronized (this) {
                                try {
                                    if (this.terminate) {
                                        subscriber.onCompleted();
                                    } else {
                                        this.emitting = false;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwOrReport(th3, subscriber2, t10);
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        public void emitAndComplete(Subscriber<T> subscriber, Subscriber<?> subscriber2) {
            synchronized (this) {
                try {
                    if (this.emitting) {
                        this.terminate = true;
                        return;
                    }
                    T t10 = this.value;
                    boolean z10 = this.hasValue;
                    this.value = null;
                    boolean z11 = true | false;
                    this.hasValue = false;
                    this.emitting = true;
                    if (z10) {
                        try {
                            subscriber.onNext(t10);
                        } catch (Throwable th2) {
                            Exceptions.throwOrReport(th2, subscriber2, t10);
                            return;
                        }
                    }
                    subscriber.onCompleted();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public synchronized int next(T t10) {
            int i10;
            this.value = t10;
            this.hasValue = true;
            i10 = this.index + 1;
            this.index = i10;
            return i10;
        }
    }

    public OperatorDebounceWithTime(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.timeout = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        serializedSubscriber.add(workerCreateWorker);
        serializedSubscriber.add(serialSubscription);
        return new AnonymousClass1(subscriber, serialSubscription, workerCreateWorker, serializedSubscriber);
    }
}
