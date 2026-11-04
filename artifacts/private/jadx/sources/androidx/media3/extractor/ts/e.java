package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class e implements androidx.media3.extractor.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final androidx.media3.extractor.w f69042g = new androidx.media3.extractor.w() { // from class: androidx.media3.extractor.ts.d
        @Override // androidx.media3.extractor.w
        public final androidx.media3.extractor.r[] c() {
            return e.d();
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f69043h = 8192;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f69044i = 16384;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f69045j = 7;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f69046d = new f("audio/ac4");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69047e = new androidx.media3.common.util.o0(16384);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f69048f;

    public static /* synthetic */ androidx.media3.extractor.r[] d() {
        return new androidx.media3.extractor.r[]{new e()};
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f69048f = false;
        this.f69046d.a();
    }

    @Override // androidx.media3.extractor.r
    public int f(androidx.media3.extractor.s sVar, androidx.media3.extractor.n0 n0Var) throws IOException {
        int i10 = sVar.read(this.f69047e.e(), 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        this.f69047e.a0(0);
        this.f69047e.Z(i10);
        if (!this.f69048f) {
            this.f69046d.c(0L, 4);
            this.f69048f = true;
        }
        this.f69046d.b(this.f69047e);
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
            sVar.i(o0Var.e(), 0, 7);
            o0Var.a0(0);
            int iT = o0Var.T();
            if (iT == 44096 || iT == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG = androidx.media3.extractor.c.g(o0Var.e(), iT);
                if (iG == -1) {
                    return false;
                }
                sVar.n(iG - 7);
            } else {
                sVar.l();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                sVar.n(i12);
                i11 = 0;
            }
        }
    }

    @Override // androidx.media3.extractor.r
    public void h(androidx.media3.extractor.t tVar) {
        this.f69046d.d(tVar, new m0.e(0, 1));
        tVar.l();
        tVar.u(new androidx.media3.extractor.p0.b(-9223372036854775807L));
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }
}
