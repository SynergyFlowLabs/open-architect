package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorTakeLastTimed<T> implements Observable.Operator<T, T> {
    final long ageMillis;
    final int count;
    final Scheduler scheduler;

    static final class TakeLastTimedSubscriber<T> extends Subscriber<T> implements Func1<Object, T> {
        final Subscriber<? super T> actual;
        final long ageMillis;
        final int count;
        final Scheduler scheduler;
        final AtomicLong requested = new AtomicLong();
        final ArrayDeque<Object> queue = new ArrayDeque<>();
        final ArrayDeque<Long> queueTimes = new ArrayDeque<>();

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366770nl = NotificationLite.instance();

        public TakeLastTimedSubscriber(Subscriber<? super T> subscriber, int i10, long j10, Scheduler scheduler) {
            this.actual = subscriber;
            this.count = i10;
            this.ageMillis = j10;
            this.scheduler = scheduler;
        }

        @Override // rx.functions.Func1
        public T call(Object obj) {
            return this.f366770nl.getValue(obj);
        }

        protected void evictOld(long j10) {
            long j11 = j10 - this.ageMillis;
            while (true) {
                Long lPeek = this.queueTimes.peek();
                if (lPeek == null || lPeek.longValue() >= j11) {
                    return;
                }
                this.queue.poll();
                this.queueTimes.poll();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            evictOld(this.scheduler.now());
            this.queueTimes.clear();
            BackpressureUtils.postCompleteDone(this.requested, this.queue, this.actual, this);
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.queue.clear();
            this.queueTimes.clear();
            this.actual.onError(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            if (this.count != 0) {
                long jNow = this.scheduler.now();
                if (this.queue.size() == this.count) {
                    this.queue.poll();
                    this.queueTimes.poll();
                }
                evictOld(jNow);
                this.queue.offer(this.f366770nl.next(t10));
                this.queueTimes.offer(Long.valueOf(jNow));
            }
        }

        void requestMore(long j10) {
            BackpressureUtils.postCompleteRequest(this.requested, j10, this.queue, this.actual, this);
        }
    }

    public OperatorTakeLastTimed(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.ageMillis = timeUnit.toMillis(j10);
        this.scheduler = scheduler;
        this.count = -1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        final TakeLastTimedSubscriber takeLastTimedSubscriber = new TakeLastTimedSubscriber(subscriber, this.count, this.ageMillis, this.scheduler);
        subscriber.add(takeLastTimedSubscriber);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorTakeLastTimed.1
            @Override // rx.Producer
            public void request(long j10) {
                takeLastTimedSubscriber.requestMore(j10);
            }
        });
        return takeLastTimedSubscriber;
    }

    public OperatorTakeLastTimed(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        if (i10 >= 0) {
            this.ageMillis = timeUnit.toMillis(j10);
            this.scheduler = scheduler;
            this.count = i10;
            return;
        }
        throw new IndexOutOfBoundsException("count could not be negative");
    }
}
