package rx.internal.util;

import rx.Scheduler;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.schedulers.EventLoopsScheduler;

/* JADX INFO: loaded from: classes14.dex */
public final class ScalarSynchronousSingle<T> extends Single<T> {
    final T value;

    static final class DirectScheduledEmission<T> implements Single.OnSubscribe<T> {
        private final EventLoopsScheduler es;
        private final T value;

        DirectScheduledEmission(EventLoopsScheduler eventLoopsScheduler, T t10) {
            this.es = eventLoopsScheduler;
            this.value = t10;
        }

        @Override // rx.functions.Action1
        public void call(SingleSubscriber<? super T> singleSubscriber) {
            singleSubscriber.add(this.es.scheduleDirect(new ScalarSynchronousSingleAction(singleSubscriber, this.value)));
        }
    }

    static final class NormalScheduledEmission<T> implements Single.OnSubscribe<T> {
        private final Scheduler scheduler;
        private final T value;

        NormalScheduledEmission(Scheduler scheduler, T t10) {
            this.scheduler = scheduler;
            this.value = t10;
        }

        @Override // rx.functions.Action1
        public void call(SingleSubscriber<? super T> singleSubscriber) {
            Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
            singleSubscriber.add(workerCreateWorker);
            workerCreateWorker.schedule(new ScalarSynchronousSingleAction(singleSubscriber, this.value));
        }
    }

    static final class ScalarSynchronousSingleAction<T> implements Action0 {
        private final SingleSubscriber<? super T> subscriber;
        private final T value;

        ScalarSynchronousSingleAction(SingleSubscriber<? super T> singleSubscriber, T t10) {
            this.subscriber = singleSubscriber;
            this.value = t10;
        }

        @Override // rx.functions.Action0
        public void call() {
            try {
                this.subscriber.onSuccess(this.value);
            } catch (Throwable th2) {
                this.subscriber.onError(th2);
            }
        }
    }

    protected ScalarSynchronousSingle(final T t10) {
        super(new Single.OnSubscribe<T>() { // from class: rx.internal.util.ScalarSynchronousSingle.1
            @Override // rx.functions.Action1
            public void call(SingleSubscriber<? super T> singleSubscriber) {
                singleSubscriber.onSuccess((Object) t10);
            }
        });
        this.value = t10;
    }

    public static <T> ScalarSynchronousSingle<T> create(T t10) {
        return new ScalarSynchronousSingle<>(t10);
    }

    public T get() {
        return this.value;
    }

    public <R> Single<R> scalarFlatMap(final Func1<? super T, ? extends Single<? extends R>> func1) {
        return Single.create(new Single.OnSubscribe<R>() { // from class: rx.internal.util.ScalarSynchronousSingle.2
            @Override // rx.functions.Action1
            public void call(final SingleSubscriber<? super R> singleSubscriber) {
                Single single = (Single) func1.call(ScalarSynchronousSingle.this.value);
                if (single instanceof ScalarSynchronousSingle) {
                    singleSubscriber.onSuccess(((ScalarSynchronousSingle) single).value);
                    return;
                }
                Subscriber<R> subscriber = new Subscriber<R>() { // from class: rx.internal.util.ScalarSynchronousSingle.2.1
                    @Override // rx.Observer
                    public void onCompleted() {
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th2) {
                        singleSubscriber.onError(th2);
                    }

                    @Override // rx.Observer
                    public void onNext(R r10) {
                        singleSubscriber.onSuccess(r10);
                    }
                };
                singleSubscriber.add(subscriber);
                single.unsafeSubscribe(subscriber);
            }
        });
    }

    public Single<T> scalarScheduleOn(Scheduler scheduler) {
        return scheduler instanceof EventLoopsScheduler ? Single.create(new DirectScheduledEmission((EventLoopsScheduler) scheduler, this.value)) : Single.create(new NormalScheduledEmission(scheduler, this.value));
    }
}
