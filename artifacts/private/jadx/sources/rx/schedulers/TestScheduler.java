package rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.subscriptions.BooleanSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public class TestScheduler extends Scheduler {
    static long counter;
    final Queue<TimedAction> queue = new PriorityQueue(11, new CompareActionsByTime());
    long time;

    static final class CompareActionsByTime implements Comparator<TimedAction> {
        CompareActionsByTime() {
        }

        @Override // java.util.Comparator
        public int compare(TimedAction timedAction, TimedAction timedAction2) {
            long j10 = timedAction.time;
            long j11 = timedAction2.time;
            if (j10 == j11) {
                if (timedAction.count < timedAction2.count) {
                    return -1;
                }
                return timedAction.count > timedAction2.count ? 1 : 0;
            }
            if (j10 < j11) {
                return -1;
            }
            return j10 > j11 ? 1 : 0;
        }
    }

    static final class TimedAction {
        final Action0 action;
        private final long count;
        final Scheduler.Worker scheduler;
        final long time;

        TimedAction(Scheduler.Worker worker, long j10, Action0 action0) {
            long j11 = TestScheduler.counter;
            TestScheduler.counter = 1 + j11;
            this.count = j11;
            this.time = j10;
            this.action = action0;
            this.scheduler = worker;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.time), this.action.toString());
        }
    }

    public void advanceTimeBy(long j10, TimeUnit timeUnit) {
        advanceTimeTo(this.time + timeUnit.toNanos(j10), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j10, TimeUnit timeUnit) {
        triggerActions(timeUnit.toNanos(j10));
    }

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new InnerTestScheduler();
    }

    @Override // rx.Scheduler
    public long now() {
        return TimeUnit.NANOSECONDS.toMillis(this.time);
    }

    public void triggerActions() {
        triggerActions(this.time);
    }

    private void triggerActions(long j10) {
        while (!this.queue.isEmpty()) {
            TimedAction timedActionPeek = this.queue.peek();
            long j11 = timedActionPeek.time;
            if (j11 > j10) {
                break;
            }
            if (j11 == 0) {
                j11 = this.time;
            }
            this.time = j11;
            this.queue.remove();
            if (!timedActionPeek.scheduler.isUnsubscribed()) {
                timedActionPeek.action.call();
            }
        }
        this.time = j10;
    }

    final class InnerTestScheduler extends Scheduler.Worker {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final BooleanSubscription f366790s = new BooleanSubscription();

        InnerTestScheduler() {
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.f366790s.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public long now() {
            return TestScheduler.this.now();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j10, TimeUnit timeUnit) {
            final TimedAction timedAction = new TimedAction(this, TestScheduler.this.time + timeUnit.toNanos(j10), action0);
            TestScheduler.this.queue.add(timedAction);
            return Subscriptions.create(new Action0() { // from class: rx.schedulers.TestScheduler.InnerTestScheduler.1
                @Override // rx.functions.Action0
                public void call() {
                    TestScheduler.this.queue.remove(timedAction);
                }
            });
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.f366790s.unsubscribe();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            final TimedAction timedAction = new TimedAction(this, 0L, action0);
            TestScheduler.this.queue.add(timedAction);
            return Subscriptions.create(new Action0() { // from class: rx.schedulers.TestScheduler.InnerTestScheduler.2
                @Override // rx.functions.Action0
                public void call() {
                    TestScheduler.this.queue.remove(timedAction);
                }
            });
        }
    }
}
