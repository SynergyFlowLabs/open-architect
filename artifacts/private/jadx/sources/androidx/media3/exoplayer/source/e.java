package androidx.media3.exoplayer.source;

import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.t3;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class e implements s0, s0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f64963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private s0.a f64964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a[] f64965c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f64966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f64967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f64968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private f.d f64969g;

    private final class a implements s1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s1 f64970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f64971b;

        public a(s1 s1Var) {
            this.f64970a = s1Var;
        }

        @Override // androidx.media3.exoplayer.source.s1
        public void a() throws IOException {
            this.f64970a.a();
        }

        public void b() {
            this.f64971b = false;
        }

        @Override // androidx.media3.exoplayer.source.s1
        public boolean isReady() {
            return !e.this.q() && this.f64970a.isReady();
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int l(long j10) {
            if (e.this.q()) {
                return -3;
            }
            return this.f64970a.l(j10);
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int r(p3 p3Var, androidx.media3.decoder.g gVar, int i10) {
            if (e.this.q()) {
                return -3;
            }
            if (this.f64971b) {
                gVar.z(4);
                return -4;
            }
            long jB = e.this.b();
            int iR = this.f64970a.r(p3Var, gVar, i10);
            if (iR == -5) {
                androidx.media3.common.w wVar = (androidx.media3.common.w) androidx.media3.common.util.a.g(p3Var.f64600b);
                int i11 = wVar.H;
                if (i11 != 0 || wVar.I != 0) {
                    e eVar = e.this;
                    if (eVar.f64967e != 0) {
                        i11 = 0;
                    }
                    p3Var.f64600b = wVar.b().Z(i11).a0(eVar.f64968f == Long.MIN_VALUE ? wVar.I : 0).N();
                }
                return -5;
            }
            long j10 = e.this.f64968f;
            if (j10 == Long.MIN_VALUE || ((iR != -4 || gVar.f62702f < j10) && !(iR == -3 && jB == Long.MIN_VALUE && !gVar.f62701e))) {
                return iR;
            }
            gVar.o();
            gVar.z(4);
            this.f64971b = true;
            return -4;
        }
    }

    public e(s0 s0Var, boolean z10, long j10, long j11) {
        this.f64963a = s0Var;
        this.f64966d = z10 ? j10 : -9223372036854775807L;
        this.f64967e = j10;
        this.f64968f = j11;
    }

    private f5 a(long j10, f5 f5Var) {
        long jX = androidx.media3.common.util.k1.x(f5Var.f63792a, 0L, j10 - this.f64967e);
        long j11 = f5Var.f63793b;
        long j12 = this.f64968f;
        long jX2 = androidx.media3.common.util.k1.x(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jX == f5Var.f63792a && jX2 == f5Var.f63793b) ? f5Var : new f5(jX, jX2);
    }

    private static long n(long j10, long j11, long j12) {
        long jMax = Math.max(j10, j11);
        if (j12 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j12);
        }
        return jMax;
    }

    private static boolean u(long j10, long j11, androidx.media3.exoplayer.trackselection.c0[] c0VarArr) {
        if (j10 < j11) {
            return true;
        }
        if (j10 != 0) {
            for (androidx.media3.exoplayer.trackselection.c0 c0Var : c0VarArr) {
                if (c0Var != null) {
                    androidx.media3.common.w wVarK = c0Var.k();
                    if (!androidx.media3.common.s0.a(wVarK.f61761o, wVarK.f61757k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long b() {
        long jB = this.f64963a.b();
        if (jB != Long.MIN_VALUE) {
            long j10 = this.f64968f;
            if (j10 == Long.MIN_VALUE || jB < j10) {
                return jB;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public void c(long j10) {
        this.f64963a.c(j10);
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean d() {
        return this.f64963a.d();
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long e() {
        long jE = this.f64963a.e();
        if (jE != Long.MIN_VALUE) {
            long j10 = this.f64968f;
            if (j10 == Long.MIN_VALUE || jE < j10) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public List<StreamKey> f(List<androidx.media3.exoplayer.trackselection.c0> list) {
        return this.f64963a.f(list);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long g(long j10, f5 f5Var) {
        long j11 = this.f64967e;
        if (j10 == j11) {
            return j11;
        }
        return this.f64963a.g(j10, a(j10, f5Var));
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long h(long j10) {
        this.f64966d = -9223372036854775807L;
        for (a aVar : this.f64965c) {
            if (aVar != null) {
                aVar.b();
            }
        }
        return n(this.f64963a.h(j10), this.f64967e, this.f64968f);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long i() {
        if (q()) {
            long j10 = this.f64966d;
            this.f64966d = -9223372036854775807L;
            long jI = i();
            return jI != -9223372036854775807L ? jI : j10;
        }
        long jI2 = this.f64963a.i();
        if (jI2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n(jI2, this.f64967e, this.f64968f);
    }

    @Override // androidx.media3.exoplayer.source.s0.a
    public void j(s0 s0Var) {
        if (this.f64969g != null) {
            return;
        }
        ((s0.a) androidx.media3.common.util.a.g(this.f64964b)).j(this);
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean k(t3 t3Var) {
        return this.f64963a.k(t3Var);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public h2 m() {
        return this.f64963a.m();
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void o() throws IOException {
        f.d dVar = this.f64969g;
        if (dVar != null) {
            throw dVar;
        }
        this.f64963a.o();
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void p(long j10, boolean z10) {
        this.f64963a.p(j10, z10);
    }

    boolean q() {
        return this.f64966d != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.t1.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void l(s0 s0Var) {
        ((s0.a) androidx.media3.common.util.a.g(this.f64964b)).l(this);
    }

    public void s(f.d dVar) {
        this.f64969g = dVar;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long t(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
        this.f64965c = new a[s1VarArr.length];
        s1[] s1VarArr2 = new s1[s1VarArr.length];
        int i10 = 0;
        while (true) {
            s1 s1Var = null;
            if (i10 >= s1VarArr.length) {
                break;
            }
            a[] aVarArr = this.f64965c;
            a aVar = (a) s1VarArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                s1Var = aVar.f64970a;
            }
            s1VarArr2[i10] = s1Var;
            i10++;
        }
        long jT = this.f64963a.t(c0VarArr, zArr, s1VarArr2, zArr2, j10);
        long jN = n(jT, j10, this.f64968f);
        this.f64966d = (q() && u(jT, j10, c0VarArr)) ? jN : -9223372036854775807L;
        for (int i11 = 0; i11 < s1VarArr.length; i11++) {
            s1 s1Var2 = s1VarArr2[i11];
            if (s1Var2 == null) {
                this.f64965c[i11] = null;
            } else {
                a[] aVarArr2 = this.f64965c;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f64970a != s1Var2) {
                    aVarArr2[i11] = new a(s1Var2);
                }
            }
            s1VarArr[i11] = this.f64965c[i11];
        }
        return jN;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void v(s0.a aVar, long j10) {
        this.f64964b = aVar;
        this.f64963a.v(this, j10);
    }

    public void w(long j10, long j11) {
        this.f64967e = j10;
        this.f64968f = j11;
    }
}
