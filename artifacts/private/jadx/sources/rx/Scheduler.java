package rx;

import java.util.concurrent.TimeUnit;
import rx.annotations.Experimental;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.schedulers.SchedulerWhen;
import rx.internal.subscriptions.SequentialSubscription;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Scheduler {
    static final long CLOCK_DRIFT_TOLERANCE_NANOS = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    public static abstract class Worker implements Subscription {
        public long now() {
            return System.currentTimeMillis();
        }

        public abstract Subscription schedule(Action0 action0);

        public abstract Subscription schedule(Action0 action0, long j10, TimeUnit timeUnit);

        public Subscription schedulePeriodically(Action0 action0, long j10, long j11, TimeUnit timeUnit) {
            long nanos = timeUnit.toNanos(j11);
            long nanos2 = TimeUnit.MILLISECONDS.toNanos(now());
            long nanos3 = nanos2 + timeUnit.toNanos(j10);
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            SequentialSubscription sequentialSubscription2 = new SequentialSubscription(sequentialSubscription);
            sequentialSubscription.replace(schedule(new Action0(nanos2, nanos3, action0, sequentialSubscription2, nanos) { // from class: rx.Scheduler.Worker.1
                long count;
                long lastNowNanos;
                long startInNanos;
                final /* synthetic */ Action0 val$action;
                final /* synthetic */ long val$firstNowNanos;
                final /* synthetic */ long val$firstStartInNanos;
                final /* synthetic */ SequentialSubscription val$mas;
                final /* synthetic */ long val$periodInNanos;

                {
                    this.val$firstNowNanos = nanos2;
                    this.val$firstStartInNanos = nanos3;
                    this.val$action = action0;
                    this.val$mas = sequentialSubscription2;
                    this.val$periodInNanos = nanos;
                    this.lastNowNanos = nanos2;
                    this.startInNanos = nanos3;
                }

                @Override // rx.functions.Action0
                public void call() {
                    long j12;
                    this.val$action.call();
                    if (!this.val$mas.isUnsubscribed()) {
                        long nanos4 = TimeUnit.MILLISECONDS.toNanos(Worker.this.now());
                        long j13 = Scheduler.CLOCK_DRIFT_TOLERANCE_NANOS;
                        long j14 = nanos4 + j13;
                        long j15 = this.lastNowNanos;
                        if (j14 >= j15) {
                            long j16 = this.val$periodInNanos;
                            if (nanos4 >= j15 + j16 + j13) {
                                long j17 = this.val$periodInNanos;
                                long j18 = nanos4 + j17;
                                long j19 = this.count + 1;
                                this.count = j19;
                                this.startInNanos = j18 - (j17 * j19);
                                j12 = j18;
                            } else {
                                long j20 = this.startInNanos;
                                long j21 = this.count + 1;
                                this.count = j21;
                                j12 = j20 + (j21 * j16);
                            }
                        } else {
                            long j110 = this.val$periodInNanos;
                            long j111 = nanos4 + j110;
                            long j112 = this.count + 1;
                            this.count = j112;
                            this.startInNanos = j111 - (j110 * j112);
                            j12 = j111;
                        }
                        this.lastNowNanos = nanos4;
                        this.val$mas.replace(Worker.this.schedule(this, j12 - nanos4, TimeUnit.NANOSECONDS));
                    }
                }
            }, j10, timeUnit));
            return sequentialSubscription2;
        }
    }

    public abstract Worker createWorker();

    public long now() {
        return System.currentTimeMillis();
    }

    @Experimental
    public <S extends Scheduler & Subscription> S when(Func1<Observable<Observable<Completable>>, Completable> func1) {
        return new SchedulerWhen(func1, this);
    }
}
