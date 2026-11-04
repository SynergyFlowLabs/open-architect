package rx.subscriptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import rx.Subscription;
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes14.dex */
public final class CompositeSubscription implements Subscription {
    private Set<Subscription> subscriptions;
    private volatile boolean unsubscribed;

    public CompositeSubscription() {
    }

    private static void unsubscribeFromAll(Collection<Subscription> collection) {
        if (collection == null) {
            return;
        }
        Iterator<Subscription> it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().unsubscribe();
            } catch (Throwable th2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        Exceptions.throwIfAny(arrayList);
    }

    public void add(Subscription subscription) {
        if (subscription.isUnsubscribed()) {
            return;
        }
        if (!this.unsubscribed) {
            synchronized (this) {
                try {
                    if (!this.unsubscribed) {
                        if (this.subscriptions == null) {
                            this.subscriptions = new HashSet(4);
                        }
                        this.subscriptions.add(subscription);
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        subscription.unsubscribe();
    }

    public void addAll(Subscription... subscriptionArr) {
        int i10 = 0;
        if (!this.unsubscribed) {
            synchronized (this) {
                try {
                    if (!this.unsubscribed) {
                        if (this.subscriptions == null) {
                            this.subscriptions = new HashSet(subscriptionArr.length);
                        }
                        int length = subscriptionArr.length;
                        while (i10 < length) {
                            Subscription subscription = subscriptionArr[i10];
                            if (!subscription.isUnsubscribed()) {
                                this.subscriptions.add(subscription);
                            }
                            i10++;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        int length2 = subscriptionArr.length;
        while (i10 < length2) {
            subscriptionArr[i10].unsubscribe();
            i10++;
        }
    }

    public void clear() {
        Set<Subscription> set;
        if (this.unsubscribed) {
            return;
        }
        synchronized (this) {
            if (!this.unsubscribed && (set = this.subscriptions) != null) {
                this.subscriptions = null;
                unsubscribeFromAll(set);
            }
        }
    }

    public boolean hasSubscriptions() {
        Set<Subscription> set;
        boolean z10 = false;
        if (this.unsubscribed) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.unsubscribed && (set = this.subscriptions) != null && !set.isEmpty()) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.unsubscribed;
    }

    public void remove(Subscription subscription) {
        Set<Subscription> set;
        if (this.unsubscribed) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.unsubscribed && (set = this.subscriptions) != null) {
                    boolean zRemove = set.remove(subscription);
                    if (zRemove) {
                        subscription.unsubscribe();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        if (this.unsubscribed) {
            return;
        }
        synchronized (this) {
            try {
                if (this.unsubscribed) {
                    return;
                }
                this.unsubscribed = true;
                Set<Subscription> set = this.subscriptions;
                this.subscriptions = null;
                unsubscribeFromAll(set);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public CompositeSubscription(Subscription... subscriptionArr) {
        this.subscriptions = new HashSet(Arrays.asList(subscriptionArr));
    }
}
