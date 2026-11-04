package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b implements androidx.media3.extractor.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final androidx.media3.extractor.w f68985g = new androidx.media3.extractor.w() { // from class: androidx.media3.extractor.ts.a
        @Override // androidx.media3.extractor.w
        public final androidx.media3.extractor.r[] c() {
            return b.d();
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f68986h = 8192;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f68987i = 2935;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f68988j = 2786;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f68989d = new c("audio/ac3");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f68990e = new androidx.media3.common.util.o0(f68988j);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f68991f;

    public static /* synthetic */ androidx.media3.extractor.r[] d() {
        return new androidx.media3.extractor.r[]{new b()};
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f68991f = false;
        this.f68989d.a();
    }

    @Override // androidx.media3.extractor.r
    public int f(androidx.media3.extractor.s sVar, androidx.media3.extractor.n0 n0Var) throws IOException {
        int i10 = 4 << 0;
        int i11 = sVar.read(this.f68990e.e(), 0, f68988j);
        if (i11 == -1) {
            return -1;
        }
        this.f68990e.a0(0);
        this.f68990e.Z(i11);
        if (!this.f68991f) {
            this.f68989d.c(0L, 4);
            this.f68991f = true;
        }
        this.f68989d.b(this.f68990e);
        return 0;
    }

    @Override // androidx.media3.extractor.r
    public boolean g(androidx.media3.extractor.s sVar) throws IOException {
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(10);
        int i10 = 0;
        while (true) {
            sVar.i(o0Var.e(), 0, 10);
            o0Var.a0(0);
            if (o0Var.O() != 4801587) {
                break;
            }
            o0Var.b0(3);
            int iK = o0Var.K();
            i10 += iK + 10;
            sVar.n(iK);
        }
        sVar.l();
        sVar.n(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            sVar.i(o0Var.e(), 0, 6);
            o0Var.a0(0);
            if (o0Var.T() != f68987i) {
                sVar.l();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                sVar.n(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG = androidx.media3.extractor.b.g(o0Var.e());
                if (iG == -1) {
                    return false;
                }
                sVar.n(iG - 6);
            }
        }
    }

    @Override // androidx.media3.extractor.r
    public void h(androidx.media3.extractor.t tVar) {
        this.f68989d.d(tVar, new m0.e(0, 1));
        tVar.l();
        tVar.u(new androidx.media3.extractor.p0.b(-9223372036854775807L));
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }
}
