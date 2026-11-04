package rx.observers;

import rx.CompletableSubscriber;
import rx.Subscription;
import rx.annotations.Experimental;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
@Experimental
public final class SafeCompletableSubscriber implements CompletableSubscriber, Subscription {
    final CompletableSubscriber actual;
    boolean done;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Subscription f366787s;

    public SafeCompletableSubscriber(CompletableSubscriber completableSubscriber) {
        this.actual = completableSubscriber;
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.done || this.f366787s.isUnsubscribed();
    }

    @Override // rx.CompletableSubscriber
    public void onCompleted() {
        if (this.done) {
            return;
        }
        this.done = true;
        try {
            this.actual.onCompleted();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            throw new OnCompletedFailedException(th2);
        }
    }

    @Override // rx.CompletableSubscriber
    public void onError(Throwable th2) {
        RxJavaHooks.onError(th2);
        if (this.done) {
            return;
        }
        this.done = true;
        try {
            this.actual.onError(th2);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            throw new OnErrorFailedException(new CompositeException(th2, th3));
        }
    }

    @Override // rx.CompletableSubscriber
    public void onSubscribe(Subscription subscription) {
        this.f366787s = subscription;
        try {
            this.actual.onSubscribe(this);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            subscription.unsubscribe();
            onError(th2);
        }
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.f366787s.unsubscribe();
    }
}
