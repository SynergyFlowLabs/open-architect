package com.google.common.util.concurrent;

import com.google.common.collect.l6;
import com.google.common.collect.x7;
import com.google.common.collect.z7;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public abstract class w2<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f120347a = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f120348b = -1;

    private static class b<L> extends f<L> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object[] f120349d;

        @Override // com.google.common.util.concurrent.w2
        public L j(int i10) {
            return (L) this.f120349d[i10];
        }

        @Override // com.google.common.util.concurrent.w2
        public int s() {
            return this.f120349d.length;
        }

        private b(int stripes, com.google.common.base.s0<L> supplier) {
            super(stripes);
            int i10 = 0;
            com.google.common.base.j0.e(stripes <= 1073741824, "Stripes must be <= 2^30)");
            this.f120349d = new Object[this.f120359c + 1];
            while (true) {
                Object[] objArr = this.f120349d;
                if (i10 >= objArr.length) {
                    return;
                }
                objArr[i10] = supplier.get();
                i10++;
            }
        }
    }

    @com.google.common.annotations.e
    static class c<L> extends f<L> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ConcurrentMap<Integer, L> f120350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final com.google.common.base.s0<L> f120351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f120352f;

        c(int stripes, com.google.common.base.s0<L> supplier) {
            super(stripes);
            int i10 = this.f120359c;
            int i11 = 0 ^ (-1);
            this.f120352f = i10 == -1 ? Integer.MAX_VALUE : i10 + 1;
            this.f120351e = supplier;
            this.f120350d = new z7().m().i();
        }

        @Override // com.google.common.util.concurrent.w2
        public L j(int i10) {
            if (this.f120352f != Integer.MAX_VALUE) {
                com.google.common.base.j0.C(i10, s());
            }
            L l10 = this.f120350d.get(Integer.valueOf(i10));
            if (l10 != null) {
                return l10;
            }
            L l11 = this.f120351e.get();
            return (L) com.google.common.base.b0.a(this.f120350d.putIfAbsent(Integer.valueOf(i10), l11), l11);
        }

        @Override // com.google.common.util.concurrent.w2
        public int s() {
            return this.f120352f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d extends ReentrantLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f120353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f120354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f120355c;

        d() {
            super(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e extends Semaphore {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f120356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f120357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f120358c;

        e(int permits) {
            super(permits, false);
        }
    }

    private static abstract class f<L> extends w2<L> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f120359c;

        f(int stripes) {
            super();
            com.google.common.base.j0.e(stripes > 0, "Stripes must be positive");
            this.f120359c = stripes > 1073741824 ? -1 : w2.g(stripes) - 1;
        }

        @Override // com.google.common.util.concurrent.w2
        public final L i(Object key) {
            return j(k(key));
        }

        @Override // com.google.common.util.concurrent.w2
        final int k(Object key) {
            return this.f120359c & w2.t(key.hashCode());
        }
    }

    @com.google.common.annotations.e
    static class g<L> extends f<L> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceArray<a<? extends L>> f120360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final com.google.common.base.s0<L> f120361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f120362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final ReferenceQueue<L> f120363g;

        private static final class a<L> extends WeakReference<L> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final int f120364a;

            a(L referent, int index, ReferenceQueue<L> queue) {
                super(referent, queue);
                this.f120364a = index;
            }
        }

        g(int stripes, com.google.common.base.s0<L> supplier) {
            super(stripes);
            this.f120363g = new ReferenceQueue<>();
            int i10 = this.f120359c;
            int i11 = i10 == -1 ? Integer.MAX_VALUE : i10 + 1;
            this.f120362f = i11;
            this.f120360d = new AtomicReferenceArray<>(i11);
            this.f120361e = supplier;
        }

        private void u() {
            while (true) {
                Reference<? extends L> referencePoll = this.f120363g.poll();
                if (referencePoll == null) {
                    return;
                }
                a aVar = (a) referencePoll;
                x2.a(this.f120360d, aVar.f120364a, aVar, null);
            }
        }

        @Override // com.google.common.util.concurrent.w2
        public L j(int index) {
            if (this.f120362f != Integer.MAX_VALUE) {
                com.google.common.base.j0.C(index, s());
            }
            a<? extends L> aVar = this.f120360d.get(index);
            L l10 = aVar == null ? null : aVar.get();
            if (l10 != null) {
                return l10;
            }
            L l11 = this.f120361e.get();
            a aVar2 = new a(l11, index, this.f120363g);
            while (!x2.a(this.f120360d, index, aVar, aVar2)) {
                aVar = this.f120360d.get(index);
                L l12 = aVar == null ? null : aVar.get();
                if (l12 != null) {
                    return l12;
                }
            }
            u();
            return l11;
        }

        @Override // com.google.common.util.concurrent.w2
        public int s() {
            return this.f120362f;
        }
    }

    private static final class h extends x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Condition f120365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j f120366b;

        h(Condition delegate, j strongReference) {
            this.f120365a = delegate;
            this.f120366b = strongReference;
        }

        @Override // com.google.common.util.concurrent.x0
        Condition a() {
            return this.f120365a;
        }
    }

    private static final class i extends d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Lock f120367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j f120368b;

        i(Lock delegate, j strongReference) {
            this.f120367a = delegate;
            this.f120368b = strongReference;
        }

        @Override // com.google.common.util.concurrent.d1
        Lock a() {
            return this.f120367a;
        }

        @Override // com.google.common.util.concurrent.d1, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new h(this.f120367a.newCondition(), this.f120368b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class j implements ReadWriteLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReadWriteLock f120369a = new ReentrantReadWriteLock();

        j() {
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new i(this.f120369a.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new i(this.f120369a.writeLock(), this);
        }
    }

    public static /* synthetic */ Semaphore a(int i10) {
        return new e(i10);
    }

    public static /* synthetic */ Lock b() {
        return new ReentrantLock(false);
    }

    public static /* synthetic */ Semaphore c(int i10) {
        return new Semaphore(i10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(int x10) {
        return 1 << com.google.common.math.f.p(x10, RoundingMode.CEILING);
    }

    static <L> w2<L> h(int stripes, com.google.common.base.s0<L> supplier) {
        return new b(stripes, supplier);
    }

    static <L> w2<L> l(int stripes, com.google.common.base.s0<L> supplier) {
        return stripes < 1024 ? new g(stripes, supplier) : new c(stripes, supplier);
    }

    public static w2<Lock> m(int stripes) {
        return l(stripes, new com.google.common.base.s0() { // from class: com.google.common.util.concurrent.u2
            @Override // com.google.common.base.s0
            public final Object get() {
                return w2.b();
            }
        });
    }

    public static w2<ReadWriteLock> n(int stripes) {
        return l(stripes, new com.google.common.base.s0() { // from class: com.google.common.util.concurrent.q2
            @Override // com.google.common.base.s0
            public final Object get() {
                return new w2.j();
            }
        });
    }

    public static w2<Semaphore> o(int stripes, final int permits) {
        return l(stripes, new com.google.common.base.s0() { // from class: com.google.common.util.concurrent.t2
            @Override // com.google.common.base.s0
            public final Object get() {
                return w2.c(permits);
            }
        });
    }

    public static w2<Lock> p(int stripes) {
        return h(stripes, new com.google.common.base.s0() { // from class: com.google.common.util.concurrent.r2
            @Override // com.google.common.base.s0
            public final Object get() {
                return new w2.d();
            }
        });
    }

    public static w2<ReadWriteLock> q(int stripes) {
        return h(stripes, new com.google.common.base.s0() { // from class: com.google.common.util.concurrent.v2
            @Override // com.google.common.base.s0
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static w2<Semaphore> r(int stripes, final int permits) {
        return h(stripes, new com.google.common.base.s0() { // from class: com.google.common.util.concurrent.s2
            @Override // com.google.common.base.s0
            public final Object get() {
                return w2.a(permits);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int t(int hashCode) {
        int i10 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        return (i10 >>> 4) ^ ((i10 >>> 7) ^ i10);
    }

    public Iterable<L> f(Iterable<? extends Object> keys) {
        ArrayList arrayListR = x7.r(keys);
        if (arrayListR.isEmpty()) {
            return l6.F();
        }
        int[] iArr = new int[arrayListR.size()];
        for (int i10 = 0; i10 < arrayListR.size(); i10++) {
            iArr[i10] = k(arrayListR.get(i10));
        }
        Arrays.sort(iArr);
        int i11 = iArr[0];
        arrayListR.set(0, j(i11));
        for (int i12 = 1; i12 < arrayListR.size(); i12++) {
            int i13 = iArr[i12];
            if (i13 == i11) {
                arrayListR.set(i12, arrayListR.get(i12 - 1));
            } else {
                arrayListR.set(i12, j(i13));
                i11 = i13;
            }
        }
        return Collections.unmodifiableList(arrayListR);
    }

    public abstract L i(Object key);

    public abstract L j(int index);

    abstract int k(Object key);

    public abstract int s();

    private w2() {
    }
}
