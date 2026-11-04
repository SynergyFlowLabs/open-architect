package org.apache.commons.lang3.concurrent;

import androidx.compose.animation.core.z1;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public class o extends org.apache.commons.lang3.concurrent.a<Integer> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<org.apache.commons.lang3.concurrent.a.b, c> f337107i = h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference<b> f337108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f337109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f337110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f337111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f337112h;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f337113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f337114b;

        b(int i10, long j10) {
            this.f337113a = i10;
            this.f337114b = j10;
        }

        public long a() {
            return this.f337114b;
        }

        public int b() {
            return this.f337113a;
        }

        public b c(int i10) {
            return i10 != 0 ? new b(b() + i10, a()) : this;
        }
    }

    private static abstract class c {
        private c() {
        }

        protected abstract long a(o oVar);

        public boolean b(o oVar, b bVar, long j10) {
            return j10 - bVar.a() > a(oVar);
        }

        public abstract boolean c(o oVar, b bVar, b bVar2);
    }

    private static class d extends c {
        private d() {
            super();
        }

        @Override // org.apache.commons.lang3.concurrent.o.c
        protected long a(o oVar) {
            return oVar.k();
        }

        @Override // org.apache.commons.lang3.concurrent.o.c
        public boolean c(o oVar, b bVar, b bVar2) {
            return bVar2.b() > oVar.l();
        }
    }

    private static class e extends c {
        private e() {
            super();
        }

        @Override // org.apache.commons.lang3.concurrent.o.c
        protected long a(o oVar) {
            return oVar.i();
        }

        @Override // org.apache.commons.lang3.concurrent.o.c
        public boolean c(o oVar, b bVar, b bVar2) {
            return bVar2.a() != bVar.a() && bVar.b() < oVar.j();
        }
    }

    public o(int i10, long j10, TimeUnit timeUnit, int i11, long j11, TimeUnit timeUnit2) {
        this.f337108d = new AtomicReference<>(new b(0, 0L));
        this.f337109e = i10;
        this.f337110f = timeUnit.toNanos(j10);
        this.f337111g = i11;
        this.f337112h = timeUnit2.toNanos(j11);
    }

    private void g(org.apache.commons.lang3.concurrent.a.b bVar) {
        d(bVar);
        this.f337108d.set(new b(0, p()));
    }

    private static Map<org.apache.commons.lang3.concurrent.a.b, c> h() {
        EnumMap enumMap = new EnumMap(org.apache.commons.lang3.concurrent.a.b.class);
        enumMap.put(org.apache.commons.lang3.concurrent.a.b.f337078a, new d());
        enumMap.put(org.apache.commons.lang3.concurrent.a.b.f337079b, new e());
        return enumMap;
    }

    private b o(int i10, b bVar, org.apache.commons.lang3.concurrent.a.b bVar2, long j10) {
        return r(bVar2).b(this, bVar, j10) ? new b(i10, j10) : bVar.c(i10);
    }

    private boolean q(int i10) {
        org.apache.commons.lang3.concurrent.a.b bVarK;
        b bVar;
        o oVar;
        b bVarO;
        while (true) {
            long jP = this.p();
            bVarK = this.f337076a.get();
            bVar = this.f337108d.get();
            oVar = this;
            int i11 = i10;
            bVarO = oVar.o(i11, bVar, bVarK, jP);
            if (oVar.s(bVar, bVarO)) {
                break;
            }
            this = oVar;
            i10 = i11;
        }
        if (r(bVarK).c(oVar, bVar, bVarO)) {
            bVarK = bVarK.k();
            oVar.g(bVarK);
        }
        return !org.apache.commons.lang3.concurrent.a.e(bVarK);
    }

    private static c r(org.apache.commons.lang3.concurrent.a.b bVar) {
        return f337107i.get(bVar);
    }

    private boolean s(b bVar, b bVar2) {
        return bVar == bVar2 || z1.a(this.f337108d, bVar, bVar2);
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    public boolean a() {
        return q(0);
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    public void close() {
        super.close();
        this.f337108d.set(new b(0, p()));
    }

    public long i() {
        return this.f337112h;
    }

    public int j() {
        return this.f337111g;
    }

    public long k() {
        return this.f337110f;
    }

    public int l() {
        return this.f337109e;
    }

    public boolean m() {
        return b(1);
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) throws h {
        return q(1);
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    public void open() {
        super.open();
        this.f337108d.set(new b(0, p()));
    }

    long p() {
        return System.nanoTime();
    }

    public o(int i10, long j10, TimeUnit timeUnit, int i11) {
        this(i10, j10, timeUnit, i11, j10, timeUnit);
    }

    public o(int i10, long j10, TimeUnit timeUnit) {
        this(i10, j10, timeUnit, i10);
    }
}
