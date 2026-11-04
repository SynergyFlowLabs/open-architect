package rx.internal.operators;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.FuncN;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class SingleOperatorZip {
    private SingleOperatorZip() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, R> Single<R> zip(final Single<? extends T>[] singleArr, final FuncN<? extends R> funcN) {
        return Single.create(new Single.OnSubscribe<R>() { // from class: rx.internal.operators.SingleOperatorZip.1
            @Override // rx.functions.Action1
            public void call(SingleSubscriber<? super R> singleSubscriber) {
                if (singleArr.length == 0) {
                    singleSubscriber.onError(new NoSuchElementException("Can't zip 0 Singles."));
                    return;
                }
                final AtomicInteger atomicInteger = new AtomicInteger(singleArr.length);
                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                final Object[] objArr = new Object[singleArr.length];
                CompositeSubscription compositeSubscription = new CompositeSubscription();
                singleSubscriber.add(compositeSubscription);
                final int i10 = 0;
                while (i10 < singleArr.length && !compositeSubscription.isUnsubscribed() && !atomicBoolean.get()) {
                    AnonymousClass1<R> anonymousClass1 = this;
                    final SingleSubscriber<? super R> singleSubscriber2 = singleSubscriber;
                    Subscription subscription = new SingleSubscriber<T>() { // from class: rx.internal.operators.SingleOperatorZip.1.1
                        @Override // rx.SingleSubscriber
                        public void onError(Throwable th2) {
                            if (atomicBoolean.compareAndSet(false, true)) {
                                singleSubscriber2.onError(th2);
                            } else {
                                RxJavaHooks.onError(th2);
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // rx.SingleSubscriber
                        public void onSuccess(T t10) {
                            objArr[i10] = t10;
                            if (atomicInteger.decrementAndGet() == 0) {
                                try {
                                    singleSubscriber2.onSuccess(funcN.call(objArr));
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    onError(th2);
                                }
                            }
                        }
                    };
                    compositeSubscription.add(subscription);
                    if (compositeSubscription.isUnsubscribed() || atomicBoolean.get()) {
                        return;
                    }
                    singleArr[i10].subscribe((SingleSubscriber) subscription);
                    i10++;
                    this = anonymousClass1;
                    singleSubscriber = singleSubscriber2;
                }
            }
        });
    }
}
