package androidx.media3.exoplayer.source;

import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.t3;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class c2 implements s0, s0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f64844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f64845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s0.a f64846c;

    private static final class a implements s1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s1 f64847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f64848b;

        public a(s1 s1Var, long j10) {
            this.f64847a = s1Var;
            this.f64848b = j10;
        }

        @Override // androidx.media3.exoplayer.source.s1
        public void a() throws IOException {
            this.f64847a.a();
        }

        public s1 b() {
            return this.f64847a;
        }

        @Override // androidx.media3.exoplayer.source.s1
        public boolean isReady() {
            return this.f64847a.isReady();
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int l(long j10) {
            return this.f64847a.l(j10 - this.f64848b);
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int r(p3 p3Var, androidx.media3.decoder.g gVar, int i10) {
            int iR = this.f64847a.r(p3Var, gVar, i10);
            if (iR == -4) {
                gVar.f62702f += this.f64848b;
            }
            return iR;
        }
    }

    public c2(s0 s0Var, long j10) {
        this.f64844a = s0Var;
        this.f64845b = j10;
    }

    public s0 a() {
        return this.f64844a;
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long b() {
        long jB = this.f64844a.b();
        if (jB == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jB + this.f64845b;
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public void c(long j10) {
        this.f64844a.c(j10 - this.f64845b);
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean d() {
        return this.f64844a.d();
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long e() {
        long jE = this.f64844a.e();
        if (jE == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jE + this.f64845b;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public List<StreamKey> f(List<androidx.media3.exoplayer.trackselection.c0> list) {
        return this.f64844a.f(list);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long g(long j10, f5 f5Var) {
        return this.f64844a.g(j10 - this.f64845b, f5Var) + this.f64845b;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long h(long j10) {
        return this.f64844a.h(j10 - this.f64845b) + this.f64845b;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long i() {
        long jI = this.f64844a.i();
        if (jI == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jI + this.f64845b;
    }

    @Override // androidx.media3.exoplayer.source.s0.a
    public void j(s0 s0Var) {
        ((s0.a) androidx.media3.common.util.a.g(this.f64846c)).j(this);
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean k(t3 t3Var) {
        return this.f64844a.k(t3Var.a().f(t3Var.f65600a - this.f64845b).d());
    }

    @Override // androidx.media3.exoplayer.source.s0
    public h2 m() {
        return this.f64844a.m();
    }

    @Override // androidx.media3.exoplayer.source.t1.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void l(s0 s0Var) {
        ((s0.a) androidx.media3.common.util.a.g(this.f64846c)).l(this);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void o() throws IOException {
        this.f64844a.o();
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void p(long j10, boolean z10) {
        this.f64844a.p(j10 - this.f64845b, z10);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long t(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
        s1[] s1VarArr2 = new s1[s1VarArr.length];
        int i10 = 0;
        while (true) {
            s1 s1VarB = null;
            if (i10 >= s1VarArr.length) {
                break;
            }
            a aVar = (a) s1VarArr[i10];
            if (aVar != null) {
                s1VarB = aVar.b();
            }
            s1VarArr2[i10] = s1VarB;
            i10++;
        }
        long jT = this.f64844a.t(c0VarArr, zArr, s1VarArr2, zArr2, j10 - this.f64845b);
        for (int i11 = 0; i11 < s1VarArr.length; i11++) {
            s1 s1Var = s1VarArr2[i11];
            if (s1Var == null) {
                s1VarArr[i11] = null;
            } else {
                s1 s1Var2 = s1VarArr[i11];
                if (s1Var2 == null || ((a) s1Var2).b() != s1Var) {
                    s1VarArr[i11] = new a(s1Var, this.f64845b);
                }
            }
        }
        return jT + this.f64845b;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void v(s0.a aVar, long j10) {
        this.f64846c = aVar;
        this.f64844a.v(this, j10 - this.f64845b);
    }
}
