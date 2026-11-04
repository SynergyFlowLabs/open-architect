package org.apache.commons.collections4;

import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes14.dex */
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Queue f336233a = org.apache.commons.collections4.queue.f.k(new LinkedList());

    private o0() {
    }

    public static <E> Queue<E> a() {
        return f336233a;
    }

    public static <E> Queue<E> b(Queue<E> queue, l0<? super E> l0Var) {
        return org.apache.commons.collections4.queue.c.p(queue, l0Var);
    }

    public static <E> Queue<E> c(Queue<E> queue) {
        return org.apache.commons.collections4.queue.d.k(queue);
    }

    public static <E> Queue<E> d(Queue<E> queue, w0<? super E, ? extends E> w0Var) {
        return org.apache.commons.collections4.queue.e.r(queue, w0Var);
    }

    public static <E> Queue<E> e(Queue<? extends E> queue) {
        return org.apache.commons.collections4.queue.f.k(queue);
    }
}
