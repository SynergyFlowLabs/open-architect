package com.google.common.util.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b(emulated = true)
public final class f3 {
    private f3() {
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static void a(ExecutorService executor) {
        com.google.common.base.y0.a(b(executor, Long.MAX_VALUE, TimeUnit.NANOSECONDS));
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static boolean b(ExecutorService executor, long timeout, TimeUnit unit) {
        boolean zAwaitTermination;
        boolean z10 = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwaitTermination = executor.awaitTermination(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return zAwaitTermination;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static void c(CountDownLatch latch) {
        boolean z10 = false;
        while (true) {
            try {
                latch.await();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static boolean d(CountDownLatch latch, long timeout, TimeUnit unit) {
        boolean zAwait;
        boolean z10 = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = latch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static boolean e(Condition condition, long timeout, TimeUnit unit) {
        boolean zAwait;
        boolean z10 = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = condition.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @d2
    @z7.a
    public static <V> V f(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    @com.google.common.annotations.c
    @d2
    @com.google.common.annotations.d
    @z7.a
    public static <V> V g(Future<V> future, long timeout, TimeUnit unit) throws ExecutionException, TimeoutException {
        V v10;
        boolean z10 = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    v10 = future.get(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return v10;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static void h(Thread toJoin) {
        boolean z10 = false;
        while (true) {
            try {
                toJoin.join();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static void i(Thread toJoin, long timeout, TimeUnit unit) {
        com.google.common.base.j0.E(toJoin);
        boolean z10 = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.timedJoin(toJoin, nanos);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> void j(BlockingQueue<E> queue, E element) {
        boolean z10 = false;
        while (true) {
            try {
                queue.put(element);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static void k(long sleepFor, TimeUnit unit) {
        boolean z10 = false;
        try {
            long nanos = unit.toNanos(sleepFor);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(nanos);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> E l(BlockingQueue<E> queue) {
        E eTake;
        boolean z10 = false;
        while (true) {
            try {
                eTake = queue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static boolean m(Semaphore semaphore, int permits, long timeout, TimeUnit unit) {
        boolean zTryAcquire;
        boolean z10 = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zTryAcquire = semaphore.tryAcquire(permits, nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return zTryAcquire;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static boolean n(Semaphore semaphore, long timeout, TimeUnit unit) {
        return m(semaphore, 1, timeout, unit);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static boolean o(Lock lock, long timeout, TimeUnit unit) {
        boolean zTryLock;
        boolean z10 = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zTryLock = lock.tryLock(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }
}
