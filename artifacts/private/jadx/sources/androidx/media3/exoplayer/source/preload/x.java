package androidx.media3.exoplayer.source.preload;

import androidx.annotation.p0;
import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.source.h2;
import androidx.media3.exoplayer.source.s0;
import androidx.media3.exoplayer.source.s1;
import androidx.media3.exoplayer.t3;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class x implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f65384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f65385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f65386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private s0.a f65387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private b f65388e;

    class a implements s0.a {
        a() {
        }

        @Override // androidx.media3.exoplayer.source.t1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void l(s0 s0Var) {
            ((s0.a) androidx.media3.common.util.a.g(x.this.f65387d)).l(x.this);
        }

        @Override // androidx.media3.exoplayer.source.s0.a
        public void j(s0 s0Var) {
            x xVar = x.this;
            xVar.f65385b = true;
            ((s0.a) androidx.media3.common.util.a.g(xVar.f65387d)).j(x.this);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.trackselection.c0[] f65390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f65391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s1[] f65392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f65393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f65394e;

        public b(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
            this.f65390a = c0VarArr;
            this.f65391b = zArr;
            this.f65392c = s1VarArr;
            this.f65393d = zArr2;
            this.f65394e = j10;
        }
    }

    public x(s0 s0Var) {
        this.f65384a = s0Var;
    }

    private static boolean j(androidx.media3.exoplayer.trackselection.c0 c0Var, androidx.media3.exoplayer.trackselection.c0 c0Var2) {
        if (!Objects.equals(c0Var.g(), c0Var2.g()) || c0Var.length() != c0Var2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < c0Var.length(); i10++) {
            if (c0Var.b(i10) != c0Var2.b(i10)) {
                return false;
            }
        }
        return true;
    }

    private static boolean n(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, b bVar) {
        androidx.media3.exoplayer.trackselection.c0[] c0VarArr2 = ((b) androidx.media3.common.util.a.g(bVar)).f65390a;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < c0VarArr.length) {
            androidx.media3.exoplayer.trackselection.c0 c0Var = c0VarArr[i10];
            androidx.media3.exoplayer.trackselection.c0 c0Var2 = c0VarArr2[i10];
            if (c0Var != null || c0Var2 != null) {
                bVar.f65391b[i10] = false;
                if (c0Var == null) {
                    bVar.f65390a[i10] = null;
                } else if (c0Var2 == null || !j(c0Var, c0Var2)) {
                    bVar.f65390a[i10] = c0Var;
                } else if (c0Var.g().f60461c == 2 || c0Var.g().f60461c == 1 || c0Var.j() == c0Var2.j()) {
                    bVar.f65391b[i10] = true;
                } else {
                    bVar.f65390a[i10] = c0Var;
                }
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    private void r(long j10) {
        this.f65386c = true;
        this.f65384a.v(new a(), j10);
    }

    private long u(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
        b bVar = this.f65388e;
        if (bVar == null) {
            return this.f65384a.t(c0VarArr, zArr, s1VarArr, zArr2, j10);
        }
        androidx.media3.common.util.a.i(s1VarArr.length == bVar.f65392c.length);
        b bVar2 = this.f65388e;
        if (j10 == bVar2.f65394e) {
            b bVar3 = (b) androidx.media3.common.util.a.g(bVar2);
            long jT = bVar3.f65394e;
            boolean[] zArr3 = bVar3.f65393d;
            if (n(c0VarArr, bVar3)) {
                boolean[] zArr4 = new boolean[zArr3.length];
                jT = this.f65384a.t(bVar3.f65390a, bVar3.f65391b, bVar3.f65392c, zArr4, bVar3.f65394e);
                int i10 = 0;
                while (true) {
                    boolean[] zArr5 = bVar3.f65391b;
                    if (i10 >= zArr5.length) {
                        break;
                    }
                    if (zArr5[i10]) {
                        zArr4[i10] = true;
                    }
                    i10++;
                }
                zArr3 = zArr4;
            }
            s1[] s1VarArr2 = bVar3.f65392c;
            System.arraycopy(s1VarArr2, 0, s1VarArr, 0, s1VarArr2.length);
            System.arraycopy(zArr3, 0, zArr2, 0, zArr3.length);
            this.f65388e = null;
            return jT;
        }
        int i11 = 0;
        while (true) {
            s1[] s1VarArr3 = this.f65388e.f65392c;
            if (i11 >= s1VarArr3.length) {
                this.f65388e = null;
                return this.f65384a.t(c0VarArr, zArr, s1VarArr, zArr2, j10);
            }
            s1 s1Var = s1VarArr3[i11];
            if (s1Var != null) {
                s1VarArr[i11] = s1Var;
                zArr[i11] = false;
            }
            i11++;
        }
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long b() {
        return this.f65384a.b();
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public void c(long j10) {
        this.f65384a.c(j10);
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean d() {
        return this.f65384a.d();
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long e() {
        return this.f65384a.e();
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long g(long j10, f5 f5Var) {
        return this.f65384a.g(j10, f5Var);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long h(long j10) {
        return this.f65384a.h(j10);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long i() {
        return this.f65384a.i();
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean k(t3 t3Var) {
        return this.f65384a.k(t3Var);
    }

    public void l() throws IOException {
        androidx.media3.common.util.a.i(this.f65385b);
        b bVar = this.f65388e;
        if (bVar != null) {
            for (s1 s1Var : bVar.f65392c) {
                if (s1Var != null) {
                    s1Var.a();
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.s0
    public h2 m() {
        return this.f65384a.m();
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void o() throws IOException {
        this.f65384a.o();
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void p(long j10, boolean z10) {
        this.f65384a.p(j10, z10);
    }

    public void q(s0.a aVar, long j10) {
        this.f65387d = aVar;
        if (this.f65385b) {
            aVar.j(this);
        }
        if (this.f65386c) {
            return;
        }
        r(j10);
    }

    public long s(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, long j10) {
        s1[] s1VarArr = new s1[c0VarArr.length];
        boolean[] zArr = new boolean[c0VarArr.length];
        boolean[] zArr2 = new boolean[c0VarArr.length];
        long jU = u(c0VarArr, zArr2, s1VarArr, zArr, j10);
        this.f65388e = new b(c0VarArr, zArr2, s1VarArr, zArr, jU);
        return jU;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long t(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
        return u(c0VarArr, zArr, s1VarArr, zArr2, j10);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void v(s0.a aVar, long j10) {
        this.f65387d = aVar;
        if (this.f65385b) {
            aVar.j(this);
        } else {
            if (!this.f65386c) {
                r(j10);
            }
        }
    }
}
