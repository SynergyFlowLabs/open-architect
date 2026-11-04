package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Subscriber;
import rx.functions.Func1;
import rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes14.dex */
public final class BackpressureUtils {
    static final long COMPLETED_MASK = Long.MIN_VALUE;
    static final long REQUESTED_MASK = Long.MAX_VALUE;

    private BackpressureUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static long addCap(long j10, long j11) {
        long j12 = j10 + j11;
        if (j12 < 0) {
            return Long.MAX_VALUE;
        }
        return j12;
    }

    public static long getAndAddRequest(AtomicLong atomicLong, long j10) {
        long j11;
        do {
            j11 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j11, addCap(j11, j10)));
        return j11;
    }

    public static long multiplyCap(long j10, long j11) {
        long j12 = j10 * j11;
        if (((j10 | j11) >>> 31) == 0 || j11 == 0 || j12 / j11 == j10) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    public static <T> void postCompleteDone(AtomicLong atomicLong, Queue<T> queue, Subscriber<? super T> subscriber) {
        postCompleteDone(atomicLong, queue, subscriber, UtilityFunctions.identity());
    }

    static <T, R> void postCompleteDrain(AtomicLong atomicLong, Queue<T> queue, Subscriber<? super R> subscriber, Func1<? super T, ? extends R> func1) {
        long jAddAndGet = atomicLong.get();
        if (jAddAndGet == Long.MAX_VALUE) {
            while (!subscriber.isUnsubscribed()) {
                Object objPoll = queue.poll();
                if (objPoll == null) {
                    subscriber.onCompleted();
                    return;
                }
                subscriber.onNext(func1.call(objPoll));
            }
            return;
        }
        do {
            long j10 = Long.MIN_VALUE;
            while (true) {
                if (j10 == jAddAndGet) {
                    if (j10 == jAddAndGet) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        if (queue.isEmpty()) {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                    jAddAndGet = atomicLong.get();
                    if (jAddAndGet == j10) {
                        break;
                    }
                } else {
                    if (subscriber.isUnsubscribed()) {
                        return;
                    }
                    Object objPoll2 = queue.poll();
                    if (objPoll2 == null) {
                        subscriber.onCompleted();
                        return;
                    } else {
                        subscriber.onNext(func1.call(objPoll2));
                        j10++;
                    }
                }
            }
            jAddAndGet = atomicLong.addAndGet(-(j10 & Long.MAX_VALUE));
        } while (jAddAndGet != Long.MIN_VALUE);
    }

    public static <T> boolean postCompleteRequest(AtomicLong atomicLong, long j10, Queue<T> queue, Subscriber<? super T> subscriber) {
        return postCompleteRequest(atomicLong, j10, queue, subscriber, UtilityFunctions.identity());
    }

    public static long produced(AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j12 = j11 - j10;
            if (j12 < 0) {
                throw new IllegalStateException("More produced than requested: " + j12);
            }
        } while (!atomicLong.compareAndSet(j11, j12));
        return j12;
    }

    public static boolean validate(long j10) {
        if (j10 >= 0) {
            return j10 != 0;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + j10);
    }

    public static <T, R> void postCompleteDone(AtomicLong atomicLong, Queue<T> queue, Subscriber<? super R> subscriber, Func1<? super T, ? extends R> func1) {
        long j10;
        do {
            j10 = atomicLong.get();
            if ((j10 & Long.MIN_VALUE) != 0) {
                return;
            }
        } while (!atomicLong.compareAndSet(j10, Long.MIN_VALUE | j10));
        if (j10 != 0) {
            postCompleteDrain(atomicLong, queue, subscriber, func1);
        }
    }

    public static <T, R> boolean postCompleteRequest(AtomicLong atomicLong, long j10, Queue<T> queue, Subscriber<? super R> subscriber, Func1<? super T, ? extends R> func1) {
        long j11;
        long j12;
        if (j10 < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j10);
        }
        if (j10 == 0) {
            return (atomicLong.get() & Long.MIN_VALUE) == 0;
        }
        do {
            j11 = atomicLong.get();
            j12 = j11 & Long.MIN_VALUE;
        } while (!atomicLong.compareAndSet(j11, addCap(Long.MAX_VALUE & j11, j10) | j12));
        if (j11 != Long.MIN_VALUE) {
            return j12 == 0;
        }
        postCompleteDrain(atomicLong, queue, subscriber, func1);
        return false;
    }
}
