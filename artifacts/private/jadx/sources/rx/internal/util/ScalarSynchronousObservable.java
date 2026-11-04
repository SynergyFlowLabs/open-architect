package rx.internal.util;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.producers.SingleProducer;
import rx.internal.schedulers.EventLoopsScheduler;
import rx.observers.Subscribers;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public final class ScalarSynchronousObservable<T> extends Observable<T> {
    static final boolean STRONG_MODE = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final T f366775t;

    static final class JustOnSubscribe<T> implements Observable.OnSubscribe<T> {
        final T value;

        JustOnSubscribe(T t10) {
            this.value = t10;
        }

        @Override // rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            subscriber.setProducer(ScalarSynchronousObservable.createProducer(subscriber, this.value));
        }
    }

    static final class ScalarAsyncOnSubscribe<T> implements Observable.OnSubscribe<T> {
        final Func1<Action0, Subscription> onSchedule;
        final T value;

        ScalarAsyncOnSubscribe(T t10, Func1<Action0, Subscription> func1) {
            this.value = t10;
            this.onSchedule = func1;
        }

        @Override // rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            subscriber.setProducer(new ScalarAsyncProducer(subscriber, this.value, this.onSchedule));
        }
    }

    static final class ScalarAsyncProducer<T> extends AtomicBoolean implements Producer, Action0 {
        private static final long serialVersionUID = -2466317989629281651L;
        final Subscriber<? super T> actual;
        final Func1<Action0, Subscription> onSchedule;
        final T value;

        public ScalarAsyncProducer(Subscriber<? super T> subscriber, T t10, Func1<Action0, Subscription> func1) {
            this.actual = subscriber;
            this.value = t10;
            this.onSchedule = func1;
        }

        @Override // rx.functions.Action0
        public void call() {
            Subscriber<? super T> subscriber = this.actual;
            if (!subscriber.isUnsubscribed()) {
                T t10 = this.value;
                try {
                    subscriber.onNext(t10);
                    if (!subscriber.isUnsubscribed()) {
                        subscriber.onCompleted();
                    }
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, subscriber, t10);
                }
            }
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (j10 >= 0) {
                if (j10 != 0 && compareAndSet(false, true)) {
                    this.actual.add(this.onSchedule.call(this));
                }
            } else {
                throw new IllegalArgumentException("n >= 0 required but it was " + j10);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.value + ", " + get() + "]";
        }
    }

    static final class WeakSingleProducer<T> implements Producer {
        final Subscriber<? super T> actual;
        boolean once;
        final T value;

        public WeakSingleProducer(Subscriber<? super T> subscriber, T t10) {
            this.actual = subscriber;
            this.value = t10;
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (this.once) {
                return;
            }
            if (j10 < 0) {
                throw new IllegalStateException("n >= required but it was " + j10);
            }
            if (j10 == 0) {
                return;
            }
            this.once = true;
            Subscriber<? super T> subscriber = this.actual;
            if (subscriber.isUnsubscribed()) {
                return;
            }
            T t10 = this.value;
            try {
                subscriber.onNext(t10);
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onCompleted();
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, subscriber, t10);
            }
        }
    }

    protected ScalarSynchronousObservable(T t10) {
        super(RxJavaHooks.onCreate(new JustOnSubscribe(t10)));
        this.f366775t = t10;
    }

    public static <T> ScalarSynchronousObservable<T> create(T t10) {
        return new ScalarSynchronousObservable<>(t10);
    }

    static <T> Producer createProducer(Subscriber<? super T> subscriber, T t10) {
        return STRONG_MODE ? new SingleProducer(subscriber, t10) : new WeakSingleProducer(subscriber, t10);
    }

    public T get() {
        return this.f366775t;
    }

    public <R> Observable<R> scalarFlatMap(final Func1<? super T, ? extends Observable<? extends R>> func1) {
        return Observable.create(new Observable.OnSubscribe<R>() { // from class: rx.internal.util.ScalarSynchronousObservable.3
            @Override // rx.functions.Action1
            public void call(Subscriber<? super R> subscriber) {
                Observable observable = (Observable) func1.call(ScalarSynchronousObservable.this.f366775t);
                if (observable instanceof ScalarSynchronousObservable) {
                    subscriber.setProducer(ScalarSynchronousObservable.createProducer(subscriber, ((ScalarSynchronousObservable) observable).f366775t));
                } else {
                    observable.unsafeSubscribe(Subscribers.wrap(subscriber));
                }
            }
        });
    }

    public Observable<T> scalarScheduleOn(final Scheduler scheduler) {
        Func1<Action0, Subscription> func1;
        if (scheduler instanceof EventLoopsScheduler) {
            final EventLoopsScheduler eventLoopsScheduler = (EventLoopsScheduler) scheduler;
            func1 = new Func1<Action0, Subscription>() { // from class: rx.internal.util.ScalarSynchronousObservable.1
                @Override // rx.functions.Func1
                public Subscription call(Action0 action0) {
                    return eventLoopsScheduler.scheduleDirect(action0);
                }
            };
        } else {
            func1 = new Func1<Action0, Subscription>() { // from class: rx.internal.util.ScalarSynchronousObservable.2
                @Override // rx.functions.Func1
                public Subscription call(final Action0 action0) {
                    final Scheduler.Worker workerCreateWorker = scheduler.createWorker();
                    workerCreateWorker.schedule(new Action0() { // from class: rx.internal.util.ScalarSynchronousObservable.2.1
                        @Override // rx.functions.Action0
                        public void call() {
                            try {
                                action0.call();
                                workerCreateWorker.unsubscribe();
                            } catch (Throwable th2) {
                                workerCreateWorker.unsubscribe();
                                throw th2;
                            }
                        }
                    });
                    return workerCreateWorker;
                }
            };
        }
        return Observable.create(new ScalarAsyncOnSubscribe(this.f366775t, func1));
    }
}
