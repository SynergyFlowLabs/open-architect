package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.common.v0;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class h implements androidx.media3.extractor.r {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final androidx.media3.extractor.w f69081p = new androidx.media3.extractor.w() { // from class: androidx.media3.extractor.ts.g
        @Override // androidx.media3.extractor.w
        public final androidx.media3.extractor.r[] c() {
            return h.d();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f69082q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f69083r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f69084s = 2048;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f69085t = 8192;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f69086u = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f69087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f69088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media3.common.util.n0 f69091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.media3.extractor.t f69092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f69093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f69094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f69095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f69096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f69097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f69098o;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public h() {
        this(0);
    }

    public static /* synthetic */ androidx.media3.extractor.r[] d() {
        return new androidx.media3.extractor.r[]{new h()};
    }

    private void e(androidx.media3.extractor.s sVar) throws IOException {
        if (this.f69096m) {
            return;
        }
        this.f69095l = -1;
        sVar.l();
        long j10 = 0;
        if (sVar.getPosition() == 0) {
            l(sVar);
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                if (sVar.k(this.f69090g.e(), 0, 2, true)) {
                    this.f69090g.a0(0);
                    if (!i.m(this.f69090g.T())) {
                        break;
                    }
                    if (sVar.k(this.f69090g.e(), 0, 4, true)) {
                        this.f69091h.q(14);
                        int iH = this.f69091h.h(13);
                        if (iH <= 6) {
                            this.f69096m = true;
                            throw v0.a("Malformed ADTS stream", null);
                        }
                        j10 += (long) iH;
                        i11++;
                        if (i11 != 1000 && sVar.p(iH - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i10 = i11;
            break;
        }
        sVar.l();
        if (i10 > 0) {
            this.f69095l = (int) (j10 / ((long) i10));
        } else {
            this.f69095l = -1;
        }
        this.f69096m = true;
    }

    private static int i(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private androidx.media3.extractor.p0 j(long j10, boolean z10) {
        return new androidx.media3.extractor.h(j10, this.f69094k, i(this.f69095l, this.f69088e.k()), this.f69095l, z10);
    }

    @il.m({"extractorOutput"})
    private void k(long j10, boolean z10) {
        if (!this.f69098o) {
            boolean z11 = (this.f69087d & 1) != 0 && this.f69095l > 0;
            if (!z11 || this.f69088e.k() != -9223372036854775807L || z10) {
                if (!z11 || this.f69088e.k() == -9223372036854775807L) {
                    this.f69092i.u(new androidx.media3.extractor.p0.b(-9223372036854775807L));
                } else {
                    this.f69092i.u(j(j10, (this.f69087d & 2) != 0));
                }
                this.f69098o = true;
            }
        }
    }

    private int l(androidx.media3.extractor.s sVar) throws IOException {
        int i10 = 0;
        while (true) {
            sVar.i(this.f69090g.e(), 0, 10);
            this.f69090g.a0(0);
            if (this.f69090g.O() != 4801587) {
                break;
            }
            this.f69090g.b0(3);
            int iK = this.f69090g.K();
            i10 += iK + 10;
            sVar.n(iK);
        }
        sVar.l();
        sVar.n(i10);
        if (this.f69094k == -1) {
            this.f69094k = i10;
        }
        return i10;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f69097n = false;
        this.f69088e.a();
        this.f69093j = j11;
    }

    @Override // androidx.media3.extractor.r
    public int f(androidx.media3.extractor.s sVar, androidx.media3.extractor.n0 n0Var) throws IOException {
        androidx.media3.common.util.a.k(this.f69092i);
        long length = sVar.getLength();
        int i10 = this.f69087d;
        if ((i10 & 2) != 0 || ((i10 & 1) != 0 && length != -1)) {
            e(sVar);
        }
        int i11 = sVar.read(this.f69089f.e(), 0, 2048);
        boolean z10 = i11 == -1;
        k(length, z10);
        if (z10) {
            return -1;
        }
        this.f69089f.a0(0);
        this.f69089f.Z(i11);
        if (!this.f69097n) {
            this.f69088e.c(this.f69093j, 4);
            this.f69097n = true;
        }
        this.f69088e.b(this.f69089f);
        return 0;
    }

    @Override // androidx.media3.extractor.r
    public boolean g(androidx.media3.extractor.s sVar) throws IOException {
        int iL = l(sVar);
        int i10 = iL;
        int i11 = 0;
        int i12 = 0;
        do {
            sVar.i(this.f69090g.e(), 0, 2);
            this.f69090g.a0(0);
            if (i.m(this.f69090g.T())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                sVar.i(this.f69090g.e(), 0, 4);
                this.f69091h.q(14);
                int iH = this.f69091h.h(13);
                if (iH <= 6) {
                    i10++;
                    sVar.l();
                    sVar.n(i10);
                } else {
                    sVar.n(iH - 6);
                    i12 += iH;
                }
            } else {
                i10++;
                sVar.l();
                sVar.n(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iL < 8192);
        return false;
    }

    @Override // androidx.media3.extractor.r
    public void h(androidx.media3.extractor.t tVar) {
        this.f69092i = tVar;
        this.f69088e.d(tVar, new m0.e(0, 1));
        tVar.l();
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }

    public h(int i10) {
        this.f69087d = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f69088e = new i(true, "audio/mp4a-latm");
        this.f69089f = new androidx.media3.common.util.o0(2048);
        this.f69095l = -1;
        this.f69094k = -1L;
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(10);
        this.f69090g = o0Var;
        this.f69091h = new androidx.media3.common.util.n0(o0Var.e());
    }
}
