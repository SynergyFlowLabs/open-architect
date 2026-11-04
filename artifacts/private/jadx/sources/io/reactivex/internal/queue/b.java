package io.reactivex.internal.queue;

import cj.g;
import ej.n;
import io.reactivex.internal.util.t;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class b<E> extends AtomicReferenceArray<E> implements n<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f303156f = -1296597691183856449L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Integer f303157g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f303158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicLong f303159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f303160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicLong f303161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f303162e;

    public b(int i10) {
        super(t.b(i10));
        this.f303158a = length() - 1;
        this.f303159b = new AtomicLong();
        this.f303161d = new AtomicLong();
        this.f303162e = Math.min(i10 / 4, f303157g.intValue());
    }

    int a(long j10) {
        return this.f303158a & ((int) j10);
    }

    int b(long j10, int i10) {
        return ((int) j10) & i10;
    }

    E c(int i10) {
        return get(i10);
    }

    @Override // ej.o
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    void d(long j10) {
        this.f303161d.lazySet(j10);
    }

    void e(int i10, E e10) {
        lazySet(i10, e10);
    }

    void f(long j10) {
        this.f303159b.lazySet(j10);
    }

    @Override // ej.o
    public boolean isEmpty() {
        return this.f303159b.get() == this.f303161d.get();
    }

    @Override // ej.o
    public boolean offer(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.f303158a;
        long j10 = this.f303159b.get();
        int iB = b(j10, i10);
        if (j10 >= this.f303160c) {
            long j11 = ((long) this.f303162e) + j10;
            if (c(b(j11, i10)) == null) {
                this.f303160c = j11;
            } else if (c(iB) != null) {
                return false;
            }
        }
        e(iB, e10);
        f(j10 + 1);
        return true;
    }

    @Override // ej.n, ej.o
    @g
    public E poll() {
        long j10 = this.f303161d.get();
        int iA = a(j10);
        E eC = c(iA);
        if (eC == null) {
            return null;
        }
        d(j10 + 1);
        e(iA, null);
        return eC;
    }

    @Override // ej.o
    public boolean r(E e10, E e11) {
        return offer(e10) && offer(e11);
    }
}
