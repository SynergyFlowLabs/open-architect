package io.grpc.okhttp;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes13.dex */
class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f290378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.okhttp.internal.framed.c f290379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f290380c = 65535;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f290381d = new c(0, 65535, null);

    public interface b {
        void h(int i10);
    }

    public final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f290383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f290384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f290385d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f290386e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f290387f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final okio.l f290382a = new okio.l();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f290388g = false;

        c(int i10, int i11, b bVar) {
            this.f290384c = i10;
            this.f290385d = i11;
            this.f290387f = bVar;
        }

        void a(int i10) {
            this.f290386e += i10;
        }

        int b() {
            return this.f290386e;
        }

        void c() {
            this.f290386e = 0;
        }

        void d(okio.l lVar, int i10, boolean z10) {
            this.f290382a.Ga(lVar, i10);
            this.f290388g |= z10;
        }

        boolean e() {
            return this.f290382a.size() > 0;
        }

        int f(int i10) {
            if (i10 <= 0 || Integer.MAX_VALUE - i10 >= this.f290385d) {
                int i11 = this.f290385d + i10;
                this.f290385d = i11;
                return i11;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f290384c);
        }

        void g(Runnable runnable) {
            com.google.common.base.j0.h0(this.f290383b == null, "pending data notification already requested");
            this.f290383b = runnable;
        }

        int h() {
            return Math.max(0, Math.min(this.f290385d, (int) this.f290382a.size()));
        }

        int i() {
            return h() - this.f290386e;
        }

        int j() {
            return this.f290385d;
        }

        int k() {
            return Math.min(this.f290385d, i0.this.f290381d.j());
        }

        void l(okio.l lVar, int i10, boolean z10) {
            do {
                int iMin = Math.min(i10, i0.this.f290379b.Tb());
                int i11 = -iMin;
                i0.this.f290381d.f(i11);
                f(i11);
                try {
                    i0.this.f290379b.F9(lVar.size() == ((long) iMin) && z10, this.f290384c, lVar, iMin);
                    this.f290387f.h(iMin);
                    i10 -= iMin;
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } while (i10 > 0);
        }

        int m(int i10, e eVar) {
            Runnable runnable;
            int iMin = Math.min(i10, k());
            int size = 0;
            while (e() && iMin > 0) {
                if (iMin >= this.f290382a.size()) {
                    size += (int) this.f290382a.size();
                    okio.l lVar = this.f290382a;
                    l(lVar, (int) lVar.size(), this.f290388g);
                } else {
                    size += iMin;
                    l(this.f290382a, iMin, false);
                }
                eVar.b();
                iMin = Math.min(i10 - size, k());
            }
            if (!e() && (runnable = this.f290383b) != null) {
                runnable.run();
                this.f290383b = null;
            }
            return size;
        }
    }

    public interface d {
        c[] b();
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f290390a;

        private e() {
        }

        boolean a() {
            return this.f290390a > 0;
        }

        void b() {
            this.f290390a++;
        }
    }

    public i0(d dVar, io.grpc.okhttp.internal.framed.c cVar) {
        this.f290378a = (d) com.google.common.base.j0.F(dVar, androidx.core.app.w.O0);
        this.f290379b = (io.grpc.okhttp.internal.framed.c) com.google.common.base.j0.F(cVar, "frameWriter");
    }

    public c c(b bVar, int i10) {
        return new c(i10, this.f290380c, (b) com.google.common.base.j0.F(bVar, "stream"));
    }

    public void d(boolean z10, c cVar, okio.l lVar, boolean z11) {
        com.google.common.base.j0.F(lVar, "source");
        int iK = cVar.k();
        boolean zE = cVar.e();
        int size = (int) lVar.size();
        if (zE || iK < size) {
            if (!zE && iK > 0) {
                cVar.l(lVar, iK, false);
            }
            cVar.d(lVar, (int) lVar.size(), z10);
        } else {
            cVar.l(lVar, size, z10);
        }
        if (z11) {
            e();
        }
    }

    public void e() {
        try {
            this.f290379b.flush();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean f(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + i10);
        }
        int i11 = i10 - this.f290380c;
        this.f290380c = i10;
        for (c cVar : this.f290378a.b()) {
            cVar.f(i11);
        }
        return i11 > 0;
    }

    public void g(c cVar, Runnable runnable) {
        com.google.common.base.j0.F(runnable, "noPendingDataRunnable");
        if (cVar.e()) {
            cVar.g(runnable);
        } else {
            runnable.run();
        }
    }

    public int h(@fj.h c cVar, int i10) {
        if (cVar == null) {
            int iF = this.f290381d.f(i10);
            i();
            return iF;
        }
        int iF2 = cVar.f(i10);
        e eVar = new e();
        cVar.m(cVar.k(), eVar);
        if (eVar.a()) {
            e();
        }
        return iF2;
    }

    public void i() {
        int i10;
        c[] cVarArrB = this.f290378a.b();
        Collections.shuffle(Arrays.asList(cVarArrB));
        int iJ = this.f290381d.j();
        int length = cVarArrB.length;
        while (true) {
            i10 = 0;
            if (length <= 0 || iJ <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(iJ / length);
            for (int i11 = 0; i11 < length && iJ > 0; i11++) {
                c cVar = cVarArrB[i11];
                int iMin = Math.min(iJ, Math.min(cVar.i(), iCeil));
                if (iMin > 0) {
                    cVar.a(iMin);
                    iJ -= iMin;
                }
                if (cVar.i() > 0) {
                    cVarArrB[i10] = cVar;
                    i10++;
                }
            }
            length = i10;
        }
        e eVar = new e();
        c[] cVarArrB2 = this.f290378a.b();
        int length2 = cVarArrB2.length;
        while (i10 < length2) {
            c cVar2 = cVarArrB2[i10];
            cVar2.m(cVar2.b(), eVar);
            cVar2.c();
            i10++;
        }
        if (eVar.a()) {
            e();
        }
    }
}
