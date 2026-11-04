package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class CompletableOnSubscribeMergeArray implements Completable.OnSubscribe {
    final Completable[] sources;

    public CompletableOnSubscribeMergeArray(Completable[] completableArr) {
        this.sources = completableArr;
    }

    @Override // rx.functions.Action1
    public void call(final CompletableSubscriber completableSubscriber) {
        final CompositeSubscription compositeSubscription = new CompositeSubscription();
        final AtomicInteger atomicInteger = new AtomicInteger(this.sources.length + 1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        completableSubscriber.onSubscribe(compositeSubscription);
        for (Completable completable : this.sources) {
            if (compositeSubscription.isUnsubscribed()) {
            }
            if (completable == null) {
                compositeSubscription.unsubscribe();
                Throwable nullPointerException = new NullPointerException("A completable source is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    completableSubscriber.onError(nullPointerException);
                    return;
                }
                RxJavaHooks.onError(nullPointerException);
            }
            completable.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeMergeArray.1
                @Override // rx.CompletableSubscriber
                public void onCompleted() {
                    if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
                        completableSubscriber.onCompleted();
                    }
                }

                @Override // rx.CompletableSubscriber
                public void onError(Throwable th2) {
                    compositeSubscription.unsubscribe();
                    int i10 = 6 >> 1;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        completableSubscriber.onError(th2);
                    } else {
                        RxJavaHooks.onError(th2);
                    }
                }

                @Override // rx.CompletableSubscriber
                public void onSubscribe(Subscription subscription) {
                    compositeSubscription.add(subscription);
                }
            });
        }
        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
            completableSubscriber.onCompleted();
        }
    }
}
