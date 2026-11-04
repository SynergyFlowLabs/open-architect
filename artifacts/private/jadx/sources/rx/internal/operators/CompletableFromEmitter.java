package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.AsyncEmitter;
import rx.Completable;
import rx.CompletableEmitter;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.internal.subscriptions.SequentialSubscription;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public final class CompletableFromEmitter implements Completable.OnSubscribe {
    final Action1<CompletableEmitter> producer;

    static final class FromEmitter extends AtomicBoolean implements CompletableEmitter, Subscription {
        private static final long serialVersionUID = 5539301318568668881L;
        final CompletableSubscriber actual;
        final SequentialSubscription resource = new SequentialSubscription();

        public FromEmitter(CompletableSubscriber completableSubscriber) {
            this.actual = completableSubscriber;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // rx.CompletableEmitter
        public void onCompleted() {
            if (compareAndSet(false, true)) {
                try {
                    this.actual.onCompleted();
                    this.resource.unsubscribe();
                } catch (Throwable th2) {
                    this.resource.unsubscribe();
                    throw th2;
                }
            }
        }

        @Override // rx.CompletableEmitter
        public void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                RxJavaHooks.onError(th2);
                return;
            }
            try {
                this.actual.onError(th2);
                this.resource.unsubscribe();
            } catch (Throwable th3) {
                this.resource.unsubscribe();
                throw th3;
            }
        }

        @Override // rx.CompletableEmitter
        public void setCancellation(AsyncEmitter.Cancellable cancellable) {
            setSubscription(new OnSubscribeFromEmitter.CancellableSubscription(cancellable));
        }

        @Override // rx.CompletableEmitter
        public void setSubscription(Subscription subscription) {
            this.resource.update(subscription);
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.resource.unsubscribe();
            }
        }
    }

    public CompletableFromEmitter(Action1<CompletableEmitter> action1) {
        this.producer = action1;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        FromEmitter fromEmitter = new FromEmitter(completableSubscriber);
        completableSubscriber.onSubscribe(fromEmitter);
        try {
            this.producer.call(fromEmitter);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            fromEmitter.onError(th2);
        }
    }
}
