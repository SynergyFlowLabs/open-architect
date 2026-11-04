package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class CompletableOnSubscribeMergeIterable implements Completable.OnSubscribe {
    final Iterable<? extends Completable> sources;

    public CompletableOnSubscribeMergeIterable(Iterable<? extends Completable> iterable) {
        this.sources = iterable;
    }

    @Override // rx.functions.Action1
    public void call(final CompletableSubscriber completableSubscriber) {
        final CompositeSubscription compositeSubscription = new CompositeSubscription();
        completableSubscriber.onSubscribe(compositeSubscription);
        try {
            Iterator<? extends Completable> it = this.sources.iterator();
            if (it == null) {
                completableSubscriber.onError(new NullPointerException("The source iterator returned is null"));
                return;
            }
            final AtomicInteger atomicInteger = new AtomicInteger(1);
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            while (!compositeSubscription.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() != 0 || !atomicBoolean.compareAndSet(false, true)) {
                            break;
                            break;
                        } else {
                            completableSubscriber.onCompleted();
                            return;
                        }
                    }
                    if (compositeSubscription.isUnsubscribed()) {
                        break;
                    }
                    try {
                        Completable next = it.next();
                        if (compositeSubscription.isUnsubscribed()) {
                            break;
                        }
                        if (next == null) {
                            compositeSubscription.unsubscribe();
                            Throwable nullPointerException = new NullPointerException("A completable source is null");
                            if (atomicBoolean.compareAndSet(false, true)) {
                                completableSubscriber.onError(nullPointerException);
                                return;
                            } else {
                                RxJavaHooks.onError(nullPointerException);
                                return;
                            }
                        }
                        atomicInteger.getAndIncrement();
                        next.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeMergeIterable.1
                            @Override // rx.CompletableSubscriber
                            public void onCompleted() {
                                if (atomicInteger.decrementAndGet() == 0) {
                                    int i10 = 4 >> 1;
                                    if (atomicBoolean.compareAndSet(false, true)) {
                                        completableSubscriber.onCompleted();
                                    }
                                }
                            }

                            @Override // rx.CompletableSubscriber
                            public void onError(Throwable th2) {
                                compositeSubscription.unsubscribe();
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
                    } catch (Throwable th2) {
                        compositeSubscription.unsubscribe();
                        if (atomicBoolean.compareAndSet(false, true)) {
                            completableSubscriber.onError(th2);
                        } else {
                            RxJavaHooks.onError(th2);
                        }
                    }
                } catch (Throwable th3) {
                    compositeSubscription.unsubscribe();
                    if (atomicBoolean.compareAndSet(false, true)) {
                        completableSubscriber.onError(th3);
                    } else {
                        RxJavaHooks.onError(th3);
                    }
                }
            }
        } catch (Throwable th4) {
            completableSubscriber.onError(th4);
        }
    }
}
