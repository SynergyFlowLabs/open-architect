package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public final class e9 {
    private e9() {
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @z7.a
    public static <E> int a(BlockingQueue<E> q10, Collection<? super E> buffer, int numElements, long timeout, TimeUnit unit) throws InterruptedException {
        com.google.common.base.j0.E(buffer);
        long jNanoTime = System.nanoTime() + unit.toNanos(timeout);
        int iDrainTo = 0;
        int i10 = 7 >> 0;
        while (iDrainTo < numElements) {
            iDrainTo += q10.drainTo(buffer, numElements - iDrainTo);
            if (iDrainTo < numElements) {
                E ePoll = q10.poll(jNanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                if (ePoll == null) {
                    return iDrainTo;
                }
                buffer.add(ePoll);
                iDrainTo++;
            }
        }
        return iDrainTo;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @z7.a
    public static <E> int b(BlockingQueue<E> q10, Collection<? super E> buffer, int numElements, long timeout, TimeUnit unit) {
        E ePoll;
        com.google.common.base.j0.E(buffer);
        long jNanoTime = System.nanoTime() + unit.toNanos(timeout);
        int iDrainTo = 0;
        boolean z10 = false;
        while (iDrainTo < numElements) {
            try {
                iDrainTo += q10.drainTo(buffer, numElements - iDrainTo);
                if (iDrainTo < numElements) {
                    while (true) {
                        try {
                            ePoll = q10.poll(jNanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            z10 = true;
                        }
                    }
                    if (ePoll == null) {
                        break;
                    }
                    buffer.add(ePoll);
                    iDrainTo++;
                }
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
        return iDrainTo;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> ArrayBlockingQueue<E> c(int capacity) {
        return new ArrayBlockingQueue<>(capacity);
    }

    public static <E> ArrayDeque<E> d() {
        return new ArrayDeque<>();
    }

    public static <E> ArrayDeque<E> e(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new ArrayDeque<>((Collection) elements);
        }
        ArrayDeque<E> arrayDeque = new ArrayDeque<>();
        o7.a(arrayDeque, elements);
        return arrayDeque;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> ConcurrentLinkedQueue<E> f() {
        return new ConcurrentLinkedQueue<>();
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> ConcurrentLinkedQueue<E> g(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new ConcurrentLinkedQueue<>((Collection) elements);
        }
        ConcurrentLinkedQueue<E> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        o7.a(concurrentLinkedQueue, elements);
        return concurrentLinkedQueue;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> LinkedBlockingDeque<E> h() {
        return new LinkedBlockingDeque<>();
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> LinkedBlockingDeque<E> i(int capacity) {
        return new LinkedBlockingDeque<>(capacity);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> LinkedBlockingDeque<E> j(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new LinkedBlockingDeque<>((Collection) elements);
        }
        LinkedBlockingDeque<E> linkedBlockingDeque = new LinkedBlockingDeque<>();
        o7.a(linkedBlockingDeque, elements);
        return linkedBlockingDeque;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> LinkedBlockingQueue<E> k() {
        return new LinkedBlockingQueue<>();
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> LinkedBlockingQueue<E> l(int capacity) {
        return new LinkedBlockingQueue<>(capacity);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> LinkedBlockingQueue<E> m(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new LinkedBlockingQueue<>((Collection) elements);
        }
        LinkedBlockingQueue<E> linkedBlockingQueue = new LinkedBlockingQueue<>();
        o7.a(linkedBlockingQueue, elements);
        return linkedBlockingQueue;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E extends Comparable> PriorityBlockingQueue<E> n() {
        return new PriorityBlockingQueue<>();
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E extends Comparable> PriorityBlockingQueue<E> o(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new PriorityBlockingQueue<>((Collection) elements);
        }
        PriorityBlockingQueue<E> priorityBlockingQueue = new PriorityBlockingQueue<>();
        o7.a(priorityBlockingQueue, elements);
        return priorityBlockingQueue;
    }

    public static <E extends Comparable> PriorityQueue<E> p() {
        return new PriorityQueue<>();
    }

    public static <E extends Comparable> PriorityQueue<E> q(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new PriorityQueue<>((Collection) elements);
        }
        PriorityQueue<E> priorityQueue = new PriorityQueue<>();
        o7.a(priorityQueue, elements);
        return priorityQueue;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> SynchronousQueue<E> r() {
        return new SynchronousQueue<>();
    }

    @com.google.common.annotations.d
    public static <E> Deque<E> s(Deque<E> deque) {
        return na.i(deque, null);
    }

    @com.google.common.annotations.d
    public static <E> Queue<E> t(Queue<E> queue) {
        return na.t(queue, null);
    }
}
