package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class CompletableOnSubscribeConcatArray implements Completable.OnSubscribe {
    final Completable[] sources;

    static final class ConcatInnerSubscriber extends AtomicInteger implements CompletableSubscriber {
        private static final long serialVersionUID = -7965400327305809232L;
        final CompletableSubscriber actual;
        int index;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        final SerialSubscription f366745sd = new SerialSubscription();
        final Completable[] sources;

        public ConcatInnerSubscriber(CompletableSubscriber completableSubscriber, Completable[] completableArr) {
            this.actual = completableSubscriber;
            this.sources = completableArr;
        }

        void next() {
            if (!this.f366745sd.isUnsubscribed() && getAndIncrement() == 0) {
                Completable[] completableArr = this.sources;
                while (!this.f366745sd.isUnsubscribed()) {
                    int i10 = this.index;
                    this.index = i10 + 1;
                    if (i10 == completableArr.length) {
                        this.actual.onCompleted();
                        return;
                    } else {
                        completableArr[i10].unsafeSubscribe(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            next();
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.actual.onError(th2);
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f366745sd.set(subscription);
        }
    }

    public CompletableOnSubscribeConcatArray(Completable[] completableArr) {
        this.sources = completableArr;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        ConcatInnerSubscriber concatInnerSubscriber = new ConcatInnerSubscriber(completableSubscriber, this.sources);
        completableSubscriber.onSubscribe(concatInnerSubscriber.f366745sd);
        concatInnerSubscriber.next();
    }
}
