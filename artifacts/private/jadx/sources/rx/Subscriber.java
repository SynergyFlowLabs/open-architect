package rx;

import rx.internal.util.SubscriptionList;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Subscriber<T> implements Observer<T>, Subscription {
    private static final long NOT_SET = Long.MIN_VALUE;
    private Producer producer;
    private long requested;
    private final Subscriber<?> subscriber;
    private final SubscriptionList subscriptions;

    protected Subscriber() {
        this(null, false);
    }

    private void addToRequested(long j10) {
        long j11 = this.requested;
        if (j11 == Long.MIN_VALUE) {
            this.requested = j10;
            return;
        }
        long j12 = j11 + j10;
        if (j12 < 0) {
            this.requested = Long.MAX_VALUE;
        } else {
            this.requested = j12;
        }
    }

    public final void add(Subscription subscription) {
        this.subscriptions.add(subscription);
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public void onStart() {
    }

    protected final void request(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("number requested cannot be negative: " + j10);
        }
        synchronized (this) {
            try {
                Producer producer = this.producer;
                if (producer != null) {
                    producer.request(j10);
                } else {
                    addToRequested(j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setProducer(Producer producer) {
        long j10;
        Subscriber<?> subscriber;
        boolean z10;
        synchronized (this) {
            try {
                j10 = this.requested;
                this.producer = producer;
                subscriber = this.subscriber;
                z10 = subscriber != null && j10 == Long.MIN_VALUE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            subscriber.setProducer(producer);
        } else if (j10 == Long.MIN_VALUE) {
            producer.request(Long.MAX_VALUE);
        } else {
            producer.request(j10);
        }
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    protected Subscriber(Subscriber<?> subscriber) {
        this(subscriber, true);
    }

    protected Subscriber(Subscriber<?> subscriber, boolean z10) {
        this.requested = Long.MIN_VALUE;
        this.subscriber = subscriber;
        this.subscriptions = (!z10 || subscriber == null) ? new SubscriptionList() : subscriber.subscriptions;
    }
}
