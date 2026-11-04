package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeTimerPeriodically implements Observable.OnSubscribe<Long> {
    final long initialDelay;
    final long period;
    final Scheduler scheduler;
    final TimeUnit unit;

    public OnSubscribeTimerPeriodically(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        this.initialDelay = j10;
        this.period = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // rx.functions.Action1
    public void call(final Subscriber<? super Long> subscriber) {
        final Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        subscriber.add(workerCreateWorker);
        workerCreateWorker.schedulePeriodically(new Action0() { // from class: rx.internal.operators.OnSubscribeTimerPeriodically.1
            long counter;

            @Override // rx.functions.Action0
            public void call() {
                try {
                    Subscriber subscriber2 = subscriber;
                    long j10 = this.counter;
                    this.counter = 1 + j10;
                    subscriber2.onNext(Long.valueOf(j10));
                } catch (Throwable th2) {
                    try {
                        workerCreateWorker.unsubscribe();
                        Exceptions.throwOrReport(th2, subscriber);
                    } catch (Throwable th3) {
                        Exceptions.throwOrReport(th2, subscriber);
                        throw th3;
                    }
                }
            }
        }, this.initialDelay, this.period, this.unit);
    }
}
