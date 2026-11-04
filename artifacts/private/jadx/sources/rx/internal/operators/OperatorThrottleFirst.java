package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorThrottleFirst<T> implements Observable.Operator<T, T> {
    final Scheduler scheduler;
    final long timeInMilliseconds;

    public OperatorThrottleFirst(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.timeInMilliseconds = timeUnit.toMillis(j10);
        this.scheduler = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorThrottleFirst.1
            private long lastOnNext = -1;

            @Override // rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                subscriber.onError(th2);
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                long jNow = OperatorThrottleFirst.this.scheduler.now();
                long j10 = this.lastOnNext;
                if (j10 == -1 || jNow - j10 >= OperatorThrottleFirst.this.timeInMilliseconds) {
                    this.lastOnNext = jNow;
                    subscriber.onNext(t10);
                }
            }

            @Override // rx.Subscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }
        };
    }
}
