package io.reactivex.internal.queue;

import cj.g;
import ej.n;
import io.reactivex.internal.util.t;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class c<T> implements n<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f303163i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f303164j = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f303166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f303167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f303168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    AtomicReferenceArray<Object> f303169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f303170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    AtomicReferenceArray<Object> f303171g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicLong f303165a = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final AtomicLong f303172h = new AtomicLong();

    public c(int i10) {
        int iB = t.b(Math.max(8, i10));
        int i11 = iB - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iB + 1);
        this.f303169e = atomicReferenceArray;
        this.f303168d = i11;
        a(iB);
        this.f303171g = atomicReferenceArray;
        this.f303170f = i11;
        this.f303167c = iB - 2;
        v(0L);
    }

    private void a(int i10) {
        this.f303166b = Math.min(i10 / 4, f303163i);
    }

    private static int b(int i10) {
        return i10;
    }

    private static int c(long j10, int i10) {
        return b(((int) j10) & i10);
    }

    private long d() {
        return this.f303172h.get();
    }

    private long e() {
        return this.f303165a.get();
    }

    private long f() {
        return this.f303172h.get();
    }

    private static <E> Object g(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    private AtomicReferenceArray<Object> h(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        int iB = b(i10);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) g(atomicReferenceArray, iB);
        q(atomicReferenceArray, iB, null);
        return atomicReferenceArray2;
    }

    private long i() {
        return this.f303165a.get();
    }

    private T j(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f303171g = atomicReferenceArray;
        return (T) g(atomicReferenceArray, c(j10, i10));
    }

    private T k(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f303171g = atomicReferenceArray;
        int iC = c(j10, i10);
        T t10 = (T) g(atomicReferenceArray, iC);
        if (t10 != null) {
            q(atomicReferenceArray, iC, null);
            o(j10 + 1);
        }
        return t10;
    }

    private void l(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10, T t10, long j11) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f303169e = atomicReferenceArray2;
        this.f303167c = (j11 + j10) - 1;
        q(atomicReferenceArray2, i10, t10);
        u(atomicReferenceArray, atomicReferenceArray2);
        q(atomicReferenceArray, i10, f303164j);
        v(j10 + 1);
    }

    private void o(long j10) {
        this.f303172h.lazySet(j10);
    }

    private static void q(AtomicReferenceArray<Object> atomicReferenceArray, int i10, Object obj) {
        atomicReferenceArray.lazySet(i10, obj);
    }

    private void u(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        q(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void v(long j10) {
        this.f303165a.lazySet(j10);
    }

    private boolean w(AtomicReferenceArray<Object> atomicReferenceArray, T t10, long j10, int i10) {
        q(atomicReferenceArray, i10, t10);
        v(j10 + 1);
        return true;
    }

    @Override // ej.o
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // ej.o
    public boolean isEmpty() {
        if (i() != f()) {
            return false;
        }
        int i10 = 7 ^ 1;
        return true;
    }

    public int m() {
        long jF = f();
        while (true) {
            long jI = i();
            long jF2 = f();
            if (jF == jF2) {
                return (int) (jI - jF2);
            }
            jF = jF2;
        }
    }

    @Override // ej.o
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f303169e;
        long jE = e();
        int i10 = this.f303168d;
        int iC = c(jE, i10);
        if (jE < this.f303167c) {
            return w(atomicReferenceArray, t10, jE, iC);
        }
        long j10 = ((long) this.f303166b) + jE;
        if (g(atomicReferenceArray, c(j10, i10)) == null) {
            this.f303167c = j10 - 1;
            return w(atomicReferenceArray, t10, jE, iC);
        }
        if (g(atomicReferenceArray, c(jE + 1, i10)) == null) {
            return w(atomicReferenceArray, t10, jE, iC);
        }
        l(atomicReferenceArray, jE, iC, t10, i10);
        return true;
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f303171g;
        long jD = d();
        int i10 = this.f303170f;
        T t10 = (T) g(atomicReferenceArray, c(jD, i10));
        return t10 == f303164j ? j(h(atomicReferenceArray, i10 + 1), jD, i10) : t10;
    }

    @Override // ej.n, ej.o
    @g
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f303171g;
        long jD = d();
        int i10 = this.f303170f;
        int iC = c(jD, i10);
        T t10 = (T) g(atomicReferenceArray, iC);
        boolean z10 = t10 == f303164j;
        if (t10 == null || z10) {
            if (z10) {
                return k(h(atomicReferenceArray, i10 + 1), jD, i10);
            }
            return null;
        }
        q(atomicReferenceArray, iC, null);
        o(jD + 1);
        return t10;
    }

    @Override // ej.o
    public boolean r(T t10, T t11) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f303169e;
        long jI = i();
        int i10 = this.f303168d;
        long j10 = 2 + jI;
        if (g(atomicReferenceArray, c(j10, i10)) == null) {
            int iC = c(jI, i10);
            q(atomicReferenceArray, iC + 1, t11);
            q(atomicReferenceArray, iC, t10);
            v(j10);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f303169e = atomicReferenceArray2;
        int iC2 = c(jI, i10);
        q(atomicReferenceArray2, iC2 + 1, t11);
        q(atomicReferenceArray2, iC2, t10);
        u(atomicReferenceArray, atomicReferenceArray2);
        q(atomicReferenceArray, iC2, f303164j);
        v(j10);
        return true;
    }
}
