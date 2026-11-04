package rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.internal.util.SubscriptionList;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class ScheduledAction extends AtomicReference<Thread> implements Runnable, Subscription {
    private static final long serialVersionUID = -3962399486978279857L;
    final Action0 action;
    final SubscriptionList cancel;

    final class FutureCompleter implements Subscription {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Future<?> f366772f;

        FutureCompleter(Future<?> future) {
            this.f366772f = future;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.f366772f.isCancelled();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (ScheduledAction.this.get() != Thread.currentThread()) {
                this.f366772f.cancel(true);
            } else {
                this.f366772f.cancel(false);
            }
        }
    }

    static final class Remover extends AtomicBoolean implements Subscription {
        private static final long serialVersionUID = 247232374289553518L;
        final CompositeSubscription parent;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final ScheduledAction f366773s;

        public Remover(ScheduledAction scheduledAction, CompositeSubscription compositeSubscription) {
            this.f366773s = scheduledAction;
            this.parent = compositeSubscription;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.f366773s.isUnsubscribed();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.remove(this.f366773s);
            }
        }
    }

    static final class Remover2 extends AtomicBoolean implements Subscription {
        private static final long serialVersionUID = 247232374289553518L;
        final SubscriptionList parent;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final ScheduledAction f366774s;

        public Remover2(ScheduledAction scheduledAction, SubscriptionList subscriptionList) {
            this.f366774s = scheduledAction;
            this.parent = subscriptionList;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.f366774s.isUnsubscribed();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.remove(this.f366774s);
            }
        }
    }

    public ScheduledAction(Action0 action0) {
        this.action = action0;
        this.cancel = new SubscriptionList();
    }

    public void add(Subscription subscription) {
        this.cancel.add(subscription);
    }

    public void addParent(CompositeSubscription compositeSubscription) {
        this.cancel.add(new Remover(this, compositeSubscription));
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.cancel.isUnsubscribed();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                lazySet(Thread.currentThread());
                this.action.call();
                unsubscribe();
            } catch (Throwable th2) {
                unsubscribe();
                throw th2;
            }
        } catch (OnErrorNotImplementedException e10) {
            signalError(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e10));
            unsubscribe();
        } catch (Throwable th3) {
            signalError(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th3));
            unsubscribe();
        }
    }

    void signalError(Throwable th2) {
        RxJavaHooks.onError(th2);
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        if (!this.cancel.isUnsubscribed()) {
            this.cancel.unsubscribe();
        }
    }

    public void add(Future<?> future) {
        this.cancel.add(new FutureCompleter(future));
    }

    public void addParent(SubscriptionList subscriptionList) {
        this.cancel.add(new Remover2(this, subscriptionList));
    }

    public ScheduledAction(Action0 action0, CompositeSubscription compositeSubscription) {
        this.action = action0;
        this.cancel = new SubscriptionList(new Remover(this, compositeSubscription));
    }

    public ScheduledAction(Action0 action0, SubscriptionList subscriptionList) {
        this.action = action0;
        this.cancel = new SubscriptionList(new Remover2(this, subscriptionList));
    }
}
