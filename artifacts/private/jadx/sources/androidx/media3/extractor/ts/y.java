package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.w0;
import androidx.media3.common.v0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class y implements m0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f69529p = "PesReader";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f69530q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f69531r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f69532s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f69533t = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f69534u = 9;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f69535v = 10;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f69536w = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f69537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.common.util.n0 f69538e = new androidx.media3.common.util.n0(new byte[10]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69539f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w0 f69541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f69542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f69544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f69545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f69547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f69548o;

    public y(m mVar) {
        this.f69537d = mVar;
    }

    private boolean e(androidx.media3.common.util.o0 o0Var, @androidx.annotation.p0 byte[] bArr, int i10) {
        int iMin = Math.min(o0Var.a(), i10 - this.f69540g);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            o0Var.b0(iMin);
        } else {
            o0Var.n(bArr, this.f69540g, iMin);
        }
        int i11 = this.f69540g + iMin;
        this.f69540g = i11;
        return i11 == i10;
    }

    private boolean f() {
        this.f69538e.q(0);
        int iH = this.f69538e.h(24);
        if (iH != 1) {
            androidx.media3.common.util.z.n(f69529p, "Unexpected start code prefix: " + iH);
            this.f69546m = -1;
            return false;
        }
        this.f69538e.s(8);
        int iH2 = this.f69538e.h(16);
        this.f69538e.s(5);
        this.f69547n = this.f69538e.g();
        this.f69538e.s(2);
        this.f69542i = this.f69538e.g();
        this.f69543j = this.f69538e.g();
        this.f69538e.s(6);
        int iH3 = this.f69538e.h(8);
        this.f69545l = iH3;
        if (iH2 == 0) {
            this.f69546m = -1;
        } else {
            int i10 = (iH2 - 3) - iH3;
            this.f69546m = i10;
            if (i10 < 0) {
                androidx.media3.common.util.z.n(f69529p, "Found negative packet payload size: " + this.f69546m);
                this.f69546m = -1;
            }
        }
        return true;
    }

    @il.m({"timestampAdjuster"})
    private void g() {
        this.f69538e.q(0);
        this.f69548o = -9223372036854775807L;
        if (this.f69542i) {
            this.f69538e.s(4);
            long jH = ((long) this.f69538e.h(3)) << 30;
            this.f69538e.s(1);
            long jH2 = jH | ((long) (this.f69538e.h(15) << 15));
            this.f69538e.s(1);
            long jH3 = jH2 | ((long) this.f69538e.h(15));
            this.f69538e.s(1);
            if (!this.f69544k && this.f69543j) {
                this.f69538e.s(4);
                long jH4 = ((long) this.f69538e.h(3)) << 30;
                this.f69538e.s(1);
                long jH5 = jH4 | ((long) (this.f69538e.h(15) << 15));
                this.f69538e.s(1);
                long jH6 = jH5 | ((long) this.f69538e.h(15));
                this.f69538e.s(1);
                this.f69541h.b(jH6);
                this.f69544k = true;
            }
            this.f69548o = this.f69541h.b(jH3);
        }
    }

    private void h(int i10) {
        this.f69539f = i10;
        this.f69540g = 0;
    }

    @Override // androidx.media3.extractor.ts.m0
    public void a() {
        this.f69539f = 0;
        this.f69540g = 0;
        this.f69544k = false;
        this.f69537d.a();
    }

    @Override // androidx.media3.extractor.ts.m0
    public void b(androidx.media3.common.util.o0 o0Var, int i10) throws v0 {
        androidx.media3.common.util.a.k(this.f69541h);
        if ((i10 & 1) != 0) {
            int i11 = this.f69539f;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    androidx.media3.common.util.z.n(f69529p, "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f69546m != -1) {
                        androidx.media3.common.util.z.n(f69529p, "Unexpected start indicator: expected " + this.f69546m + " more bytes");
                    }
                    this.f69537d.e(o0Var.g() == 0);
                }
            }
            h(1);
        }
        while (o0Var.a() > 0) {
            int i12 = this.f69539f;
            if (i12 == 0) {
                o0Var.b0(o0Var.a());
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (e(o0Var, this.f69538e.f61581a, Math.min(10, this.f69545l)) && e(o0Var, null, this.f69545l)) {
                        g();
                        i10 |= this.f69547n ? 4 : 0;
                        this.f69537d.c(this.f69548o, i10);
                        h(3);
                    }
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int iA = o0Var.a();
                    int i13 = this.f69546m;
                    int i14 = i13 == -1 ? 0 : iA - i13;
                    if (i14 > 0) {
                        iA -= i14;
                        o0Var.Z(o0Var.f() + iA);
                    }
                    this.f69537d.b(o0Var);
                    int i15 = this.f69546m;
                    if (i15 != -1) {
                        int i16 = i15 - iA;
                        this.f69546m = i16;
                        if (i16 == 0) {
                            this.f69537d.e(false);
                            h(1);
                        }
                    }
                }
            } else if (e(o0Var, this.f69538e.f61581a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    @Override // androidx.media3.extractor.ts.m0
    public void c(w0 w0Var, androidx.media3.extractor.t tVar, m0.e eVar) {
        this.f69541h = w0Var;
        this.f69537d.d(tVar, eVar);
    }

    public boolean d(boolean z10) {
        return this.f69539f == 3 && this.f69546m == -1 && !(z10 && (this.f69537d instanceof n)) && (!z10 || f());
    }
}
