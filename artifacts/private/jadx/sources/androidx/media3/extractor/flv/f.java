package androidx.media3.extractor.flv;

import androidx.media3.common.s0;
import androidx.media3.common.util.o0;
import androidx.media3.common.v0;
import androidx.media3.common.w;
import androidx.media3.extractor.u0;

/* JADX INFO: loaded from: classes3.dex */
final class f extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67318h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f67319i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f67320j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f67321k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f67322l = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f67323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f67324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f67325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f67326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f67327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f67328g;

    public f(u0 u0Var) {
        super(u0Var);
        this.f67323b = new o0(androidx.media3.container.f.C);
        this.f67324c = new o0(4);
    }

    @Override // androidx.media3.extractor.flv.e
    protected boolean b(o0 o0Var) throws e.a {
        int iL = o0Var.L();
        int i10 = (iL >> 4) & 15;
        int i11 = iL & 15;
        if (i11 == 7) {
            this.f67328g = i10;
            return i10 != 5;
        }
        throw new e.a("Video format not supported: " + i11);
    }

    @Override // androidx.media3.extractor.flv.e
    protected boolean c(o0 o0Var, long j10) throws v0 {
        int iL = o0Var.L();
        long jT = j10 + (((long) o0Var.t()) * 1000);
        if (iL == 0 && !this.f67326e) {
            o0 o0Var2 = new o0(new byte[o0Var.a()]);
            o0Var.n(o0Var2.e(), 0, o0Var.a());
            androidx.media3.extractor.d dVarB = androidx.media3.extractor.d.b(o0Var2);
            this.f67325d = dVarB.f67183b;
            this.f67317a.e(new w.b().U(s0.f61343w).u0("video/avc").S(dVarB.f67193l).B0(dVarB.f67184c).d0(dVarB.f67185d).q0(dVarB.f67192k).g0(dVarB.f67182a).N());
            this.f67326e = true;
            return false;
        }
        if (iL != 1 || !this.f67326e) {
            return false;
        }
        int i10 = this.f67328g == 1 ? 1 : 0;
        if (!this.f67327f && i10 == 0) {
            return false;
        }
        byte[] bArrE = this.f67324c.e();
        bArrE[0] = 0;
        bArrE[1] = 0;
        bArrE[2] = 0;
        int i11 = 4 - this.f67325d;
        int i12 = 0;
        while (o0Var.a() > 0) {
            o0Var.n(this.f67324c.e(), i11, this.f67325d);
            this.f67324c.a0(0);
            int iP = this.f67324c.P();
            this.f67323b.a0(0);
            this.f67317a.b(this.f67323b, 4);
            this.f67317a.b(o0Var, iP);
            i12 = i12 + 4 + iP;
        }
        this.f67317a.g(jT, i10, i12, 0, null);
        this.f67327f = true;
        return true;
    }

    @Override // androidx.media3.extractor.flv.e
    public void d() {
        this.f67327f = false;
    }
}
