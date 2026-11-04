package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes14.dex */
public abstract class DeferredScalarSubscriber<T, R> extends Subscriber<T> {
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 1;
    static final int NO_REQUEST_HAS_VALUE = 2;
    static final int NO_REQUEST_NO_VALUE = 0;
    protected final Subscriber<? super R> actual;
    protected boolean hasValue;
    final AtomicInteger state = new AtomicInteger();
    protected R value;

    static final class InnerProducer implements Producer {
        final DeferredScalarSubscriber<?, ?> parent;

        public InnerProducer(DeferredScalarSubscriber<?, ?> deferredScalarSubscriber) {
            this.parent = deferredScalarSubscriber;
        }

        @Override // rx.Producer
        public void request(long j10) {
            this.parent.downstreamRequest(j10);
        }
    }

    public DeferredScalarSubscriber(Subscriber<? super R> subscriber) {
        this.actual = subscriber;
    }

    protected final void complete() {
        this.actual.onCompleted();
    }

    final void downstreamRequest(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j10);
        }
        if (j10 != 0) {
            Subscriber<? super R> subscriber = this.actual;
            do {
                int i10 = this.state.get();
                if (i10 == 1 || i10 == 3 || subscriber.isUnsubscribed()) {
                    return;
                }
                if (i10 == 2) {
                    if (this.state.compareAndSet(2, 3)) {
                        subscriber.onNext(this.value);
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        subscriber.onCompleted();
                        return;
                    }
                    return;
                }
            } while (!this.state.compareAndSet(0, 1));
        }
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            complete();
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        this.value = null;
        this.actual.onError(th2);
    }

    @Override // rx.Subscriber
    public final void setProducer(Producer producer) {
        producer.request(Long.MAX_VALUE);
    }

    final void setupDownstream() {
        Subscriber<? super R> subscriber = this.actual;
        subscriber.add(this);
        subscriber.setProducer(new InnerProducer(this));
    }

    public final void subscribeTo(Observable<? extends T> observable) {
        setupDownstream();
        observable.unsafeSubscribe(this);
    }

    protected final void complete(R r10) {
        Subscriber<? super R> subscriber = this.actual;
        do {
            int i10 = this.state.get();
            if (i10 == 2 || i10 == 3 || subscriber.isUnsubscribed()) {
                return;
            }
            if (i10 == 1) {
                subscriber.onNext(r10);
                if (!subscriber.isUnsubscribed()) {
                    subscriber.onCompleted();
                }
                this.state.lazySet(3);
                return;
            }
            this.value = r10;
        } while (!this.state.compareAndSet(0, 2));
    }
}
