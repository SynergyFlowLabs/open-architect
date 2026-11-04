package androidx.media3.extractor.flac;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import androidx.media3.extractor.u0;
import androidx.media3.extractor.w;
import androidx.media3.extractor.x;
import androidx.media3.extractor.y;
import androidx.media3.extractor.z;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class e implements r {
    private static final int A = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final w f67245r = new w() { // from class: androidx.media3.extractor.flac.d
        @Override // androidx.media3.extractor.w
        public final r[] c() {
            return e.d();
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f67246s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f67247t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f67248u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f67249v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f67250w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f67251x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f67252y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f67253z = 32768;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f67254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o0 f67255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f67256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x.a f67257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private t f67258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u0 f67259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f67260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private r0 f67261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a0 f67262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f67263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f67264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f67265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f67266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f67267q;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public e() {
        this(0);
    }

    public static /* synthetic */ r[] d() {
        return new r[]{new e()};
    }

    private long e(o0 o0Var, boolean z10) {
        boolean zD;
        androidx.media3.common.util.a.g(this.f67262l);
        int iF = o0Var.f();
        while (iF <= o0Var.g() - 16) {
            o0Var.a0(iF);
            if (x.d(o0Var, this.f67262l, this.f67264n, this.f67257g)) {
                o0Var.a0(iF);
                return this.f67257g.f69631a;
            }
            iF++;
        }
        if (z10) {
            while (iF <= o0Var.g() - this.f67263m) {
                o0Var.a0(iF);
                boolean z11 = false;
                try {
                    zD = x.d(o0Var, this.f67262l, this.f67264n, this.f67257g);
                } catch (IndexOutOfBoundsException unused) {
                    zD = false;
                }
                if (o0Var.f() <= o0Var.g()) {
                    z11 = zD;
                }
                if (z11) {
                    o0Var.a0(iF);
                    return this.f67257g.f69631a;
                }
                iF++;
            }
            o0Var.a0(o0Var.g());
        } else {
            o0Var.a0(iF);
        }
        return -1L;
    }

    private void i(s sVar) throws IOException {
        this.f67264n = y.b(sVar);
        ((t) k1.o(this.f67258h)).u(j(sVar.getPosition(), sVar.getLength()));
        this.f67260j = 5;
    }

    private androidx.media3.extractor.p0 j(long j10, long j11) {
        androidx.media3.common.util.a.g(this.f67262l);
        a0 a0Var = this.f67262l;
        if (a0Var.f67022k != null) {
            return new z(a0Var, j10);
        }
        if (j11 == -1 || a0Var.f67021j <= 0) {
            return new androidx.media3.extractor.p0.b(a0Var.h());
        }
        b bVar = new b(a0Var, this.f67264n, j10, j11);
        this.f67265o = bVar;
        return bVar.b();
    }

    private void k(s sVar) throws IOException {
        byte[] bArr = this.f67254d;
        sVar.i(bArr, 0, bArr.length);
        sVar.l();
        this.f67260j = 2;
    }

    private void l() {
        int i10 = 4 & 0;
        ((u0) k1.o(this.f67259i)).g((this.f67267q * 1000000) / ((long) ((a0) k1.o(this.f67262l)).f67016e), 1, this.f67266p, 0, null);
    }

    private int m(s sVar, n0 n0Var) throws IOException {
        boolean z10;
        androidx.media3.common.util.a.g(this.f67259i);
        androidx.media3.common.util.a.g(this.f67262l);
        b bVar = this.f67265o;
        if (bVar != null && bVar.d()) {
            return this.f67265o.c(sVar, n0Var);
        }
        if (this.f67267q == -1) {
            this.f67267q = x.i(sVar, this.f67262l);
            return 0;
        }
        int iG = this.f67255e.g();
        if (iG < 32768) {
            int i10 = sVar.read(this.f67255e.e(), iG, 32768 - iG);
            z10 = i10 == -1;
            if (!z10) {
                this.f67255e.Z(iG + i10);
            } else if (this.f67255e.a() == 0) {
                l();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iF = this.f67255e.f();
        int i11 = this.f67266p;
        int i12 = this.f67263m;
        if (i11 < i12) {
            o0 o0Var = this.f67255e;
            o0Var.b0(Math.min(i12 - i11, o0Var.a()));
        }
        long jE = e(this.f67255e, z10);
        int iF2 = this.f67255e.f() - iF;
        this.f67255e.a0(iF);
        this.f67259i.b(this.f67255e, iF2);
        this.f67266p += iF2;
        if (jE != -1) {
            l();
            this.f67266p = 0;
            this.f67267q = jE;
        }
        if (this.f67255e.a() < 16) {
            int iA = this.f67255e.a();
            System.arraycopy(this.f67255e.e(), this.f67255e.f(), this.f67255e.e(), 0, iA);
            this.f67255e.a0(0);
            this.f67255e.Z(iA);
        }
        return 0;
    }

    private void n(s sVar) throws IOException {
        this.f67261k = y.d(sVar, !this.f67256f);
        this.f67260j = 1;
    }

    private void o(s sVar) throws IOException {
        y.a aVar = new y.a(this.f67262l);
        boolean zE = false;
        while (!zE) {
            zE = y.e(sVar, aVar);
            this.f67262l = (a0) k1.o(aVar.f69653a);
        }
        androidx.media3.common.util.a.g(this.f67262l);
        this.f67263m = Math.max(this.f67262l.f67014c, 6);
        ((u0) k1.o(this.f67259i)).e(this.f67262l.i(this.f67254d, this.f67261k).b().U("audio/flac").N());
        ((u0) k1.o(this.f67259i)).c(this.f67262l.h());
        this.f67260j = 4;
    }

    private void p(s sVar) throws IOException {
        y.i(sVar);
        this.f67260j = 3;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f67260j = 0;
        } else {
            b bVar = this.f67265o;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f67267q = j12;
        this.f67266p = 0;
        this.f67255e.W(0);
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        int i10 = this.f67260j;
        if (i10 == 0) {
            n(sVar);
            return 0;
        }
        if (i10 == 1) {
            k(sVar);
            return 0;
        }
        if (i10 == 2) {
            p(sVar);
            return 0;
        }
        if (i10 == 3) {
            o(sVar);
            return 0;
        }
        if (i10 == 4) {
            i(sVar);
            return 0;
        }
        if (i10 == 5) {
            return m(sVar, n0Var);
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws Throwable {
        y.c(sVar, false);
        return y.a(sVar);
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f67258h = tVar;
        this.f67259i = tVar.a(0, 1);
        tVar.l();
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }

    public e(int i10) {
        this.f67254d = new byte[42];
        this.f67255e = new o0(new byte[32768], 0);
        boolean z10 = true;
        if ((i10 & 1) == 0) {
            z10 = false;
        }
        this.f67256f = z10;
        this.f67257g = new x.a();
        this.f67260j = 0;
    }
}
