package rx.internal.operators;

import rx.Subscriber;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public abstract class DeferredScalarSubscriberSafe<T, R> extends DeferredScalarSubscriber<T, R> {
    protected boolean done;

    public DeferredScalarSubscriberSafe(Subscriber<? super R> subscriber) {
        super(subscriber);
    }

    @Override // rx.internal.operators.DeferredScalarSubscriber, rx.Observer
    public void onCompleted() {
        if (this.done) {
            return;
        }
        this.done = true;
        super.onCompleted();
    }

    @Override // rx.internal.operators.DeferredScalarSubscriber, rx.Observer
    public void onError(Throwable th2) {
        if (this.done) {
            RxJavaHooks.onError(th2);
            return;
        }
        int i10 = 5 | 1;
        this.done = true;
        super.onError(th2);
    }
}
