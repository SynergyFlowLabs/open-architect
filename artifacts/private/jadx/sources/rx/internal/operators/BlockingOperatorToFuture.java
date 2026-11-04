package rx.internal.operators;

import androidx.compose.animation.core.z1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;

/* JADX INFO: loaded from: classes14.dex */
public final class BlockingOperatorToFuture {
    private BlockingOperatorToFuture() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Future<T> toFuture(Observable<? extends T> observable) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final Subscription subscriptionSubscribe = observable.single().subscribe((Subscriber<? super Object>) new Subscriber<T>() { // from class: rx.internal.operators.BlockingOperatorToFuture.1
            @Override // rx.Observer
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                z1.a(atomicReference2, null, th2);
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                atomicReference.set(t10);
            }
        });
        return new Future<T>() { // from class: rx.internal.operators.BlockingOperatorToFuture.2
            private volatile boolean cancelled;

            private T getValue() throws ExecutionException {
                Throwable th2 = (Throwable) atomicReference2.get();
                if (th2 != null) {
                    throw new ExecutionException("Observable onError", th2);
                }
                if (this.cancelled) {
                    throw new CancellationException("Subscription unsubscribed");
                }
                return (T) atomicReference.get();
            }

            @Override // java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                if (countDownLatch.getCount() <= 0) {
                    return false;
                }
                this.cancelled = true;
                subscriptionSubscribe.unsubscribe();
                countDownLatch.countDown();
                return true;
            }

            @Override // java.util.concurrent.Future
            public T get() throws ExecutionException, InterruptedException {
                countDownLatch.await();
                return getValue();
            }

            @Override // java.util.concurrent.Future
            public boolean isCancelled() {
                return this.cancelled;
            }

            @Override // java.util.concurrent.Future
            public boolean isDone() {
                return countDownLatch.getCount() == 0;
            }

            @Override // java.util.concurrent.Future
            public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
                if (countDownLatch.await(j10, timeUnit)) {
                    return getValue();
                }
                throw new TimeoutException("Timed out after " + timeUnit.toMillis(j10) + "ms waiting for underlying Observable.");
            }
        };
    }
}
