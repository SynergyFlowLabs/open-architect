package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.internal.util.unsafe.MpscLinkedQueue;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class CompletableOnSubscribeMergeDelayErrorIterable implements Completable.OnSubscribe {
    final Iterable<? extends Completable> sources;

    public CompletableOnSubscribeMergeDelayErrorIterable(Iterable<? extends Completable> iterable) {
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
            final MpscLinkedQueue mpscLinkedQueue = new MpscLinkedQueue();
            while (!compositeSubscription.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() != 0) {
                            break;
                        }
                        if (mpscLinkedQueue.isEmpty()) {
                            completableSubscriber.onCompleted();
                            return;
                        } else {
                            completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(mpscLinkedQueue));
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
                            mpscLinkedQueue.offer(new NullPointerException("A completable source is null"));
                            if (atomicInteger.decrementAndGet() != 0) {
                                break;
                            }
                            if (mpscLinkedQueue.isEmpty()) {
                                completableSubscriber.onCompleted();
                                return;
                            } else {
                                completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(mpscLinkedQueue));
                                return;
                            }
                        }
                        atomicInteger.getAndIncrement();
                        next.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeMergeDelayErrorIterable.1
                            @Override // rx.CompletableSubscriber
                            public void onCompleted() {
                                tryTerminate();
                            }

                            @Override // rx.CompletableSubscriber
                            public void onError(Throwable th2) {
                                mpscLinkedQueue.offer(th2);
                                tryTerminate();
                            }

                            @Override // rx.CompletableSubscriber
                            public void onSubscribe(Subscription subscription) {
                                compositeSubscription.add(subscription);
                            }

                            void tryTerminate() {
                                if (atomicInteger.decrementAndGet() == 0) {
                                    if (mpscLinkedQueue.isEmpty()) {
                                        completableSubscriber.onCompleted();
                                        return;
                                    }
                                    completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(mpscLinkedQueue));
                                }
                            }
                        });
                    } catch (Throwable th2) {
                        mpscLinkedQueue.offer(th2);
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (mpscLinkedQueue.isEmpty()) {
                                completableSubscriber.onCompleted();
                            } else {
                                completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(mpscLinkedQueue));
                            }
                        }
                    }
                } catch (Throwable th3) {
                    mpscLinkedQueue.offer(th3);
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (mpscLinkedQueue.isEmpty()) {
                            completableSubscriber.onCompleted();
                        } else {
                            completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(mpscLinkedQueue));
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            completableSubscriber.onError(th4);
        }
    }
}
