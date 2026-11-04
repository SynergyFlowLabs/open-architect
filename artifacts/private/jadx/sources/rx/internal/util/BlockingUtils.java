package rx.internal.util;

import java.util.concurrent.CountDownLatch;
import rx.Subscription;
import rx.annotations.Experimental;

/* JADX INFO: loaded from: classes14.dex */
@Experimental
public final class BlockingUtils {
    private BlockingUtils() {
    }

    @Experimental
    public static void awaitForComplete(CountDownLatch countDownLatch, Subscription subscription) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            subscription.unsubscribe();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e10);
        }
    }
}
