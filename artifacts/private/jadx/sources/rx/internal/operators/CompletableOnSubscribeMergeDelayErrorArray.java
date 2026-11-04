package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class CompletableOnSubscribeMergeDelayErrorArray implements Completable.OnSubscribe {
    final Completable[] sources;

    public CompletableOnSubscribeMergeDelayErrorArray(Completable[] completableArr) {
        this.sources = completableArr;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompletableOnSubscribeMergeDelayErrorArray completableOnSubscribeMergeDelayErrorArray;
        final CompletableSubscriber completableSubscriber2;
        final CompositeSubscription compositeSubscription = new CompositeSubscription();
        final AtomicInteger atomicInteger = new AtomicInteger(this.sources.length + 1);
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        completableSubscriber.onSubscribe(compositeSubscription);
        Completable[] completableArr = this.sources;
        int length = completableArr.length;
        int i10 = 0;
        while (i10 < length) {
            Completable completable = completableArr[i10];
            if (compositeSubscription.isUnsubscribed()) {
                return;
            }
            if (completable == null) {
                concurrentLinkedQueue.offer(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
                completableOnSubscribeMergeDelayErrorArray = this;
                completableSubscriber2 = completableSubscriber;
            } else {
                completableOnSubscribeMergeDelayErrorArray = this;
                completableSubscriber2 = completableSubscriber;
                completable.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeMergeDelayErrorArray.1
                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        tryTerminate();
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(Throwable th2) {
                        concurrentLinkedQueue.offer(th2);
                        tryTerminate();
                    }

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(Subscription subscription) {
                        compositeSubscription.add(subscription);
                    }

                    void tryTerminate() {
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (concurrentLinkedQueue.isEmpty()) {
                                completableSubscriber2.onCompleted();
                                return;
                            }
                            completableSubscriber2.onError(CompletableOnSubscribeMerge.collectErrors(concurrentLinkedQueue));
                        }
                    }
                });
            }
            i10++;
            this = completableOnSubscribeMergeDelayErrorArray;
            completableSubscriber = completableSubscriber2;
        }
        CompletableSubscriber completableSubscriber3 = completableSubscriber;
        if (atomicInteger.decrementAndGet() == 0) {
            if (concurrentLinkedQueue.isEmpty()) {
                completableSubscriber3.onCompleted();
            } else {
                completableSubscriber3.onError(CompletableOnSubscribeMerge.collectErrors(concurrentLinkedQueue));
            }
        }
    }
}
