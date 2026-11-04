package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.w0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class e0 implements m0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f69049j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f69050k = 32;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f69051l = 4098;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f69052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69053e = new androidx.media3.common.util.o0(32);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f69056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f69057i;

    public e0(d0 d0Var) {
        this.f69052d = d0Var;
    }

    @Override // androidx.media3.extractor.ts.m0
    public void a() {
        this.f69057i = true;
    }

    @Override // androidx.media3.extractor.ts.m0
    public void b(androidx.media3.common.util.o0 o0Var, int i10) {
        int iF;
        boolean z10 = (i10 & 1) != 0;
        if (z10) {
            iF = o0Var.f() + o0Var.L();
        } else {
            iF = -1;
        }
        if (this.f69057i) {
            if (!z10) {
                return;
            }
            this.f69057i = false;
            o0Var.a0(iF);
            this.f69055g = 0;
        }
        while (o0Var.a() > 0) {
            int i11 = this.f69055g;
            int i12 = 4 << 3;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iL = o0Var.L();
                    o0Var.a0(o0Var.f() - 1);
                    if (iL == 255) {
                        this.f69057i = true;
                        return;
                    }
                }
                int iMin = Math.min(o0Var.a(), 3 - this.f69055g);
                o0Var.n(this.f69053e.e(), this.f69055g, iMin);
                int i13 = this.f69055g + iMin;
                this.f69055g = i13;
                if (i13 == 3) {
                    this.f69053e.a0(0);
                    this.f69053e.Z(3);
                    this.f69053e.b0(1);
                    int iL2 = this.f69053e.L();
                    int iL3 = this.f69053e.L();
                    this.f69056h = (iL2 & 128) != 0;
                    this.f69054f = (((iL2 & 15) << 8) | iL3) + 3;
                    int iB = this.f69053e.b();
                    int i14 = this.f69054f;
                    if (iB < i14) {
                        this.f69053e.c(Math.min(4098, Math.max(i14, this.f69053e.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(o0Var.a(), this.f69054f - this.f69055g);
                o0Var.n(this.f69053e.e(), this.f69055g, iMin2);
                int i15 = this.f69055g + iMin2;
                this.f69055g = i15;
                int i16 = this.f69054f;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.f69056h) {
                        this.f69053e.Z(i16);
                    } else {
                        if (k1.E(this.f69053e.e(), 0, this.f69054f, -1) != 0) {
                            this.f69057i = true;
                            return;
                        }
                        this.f69053e.Z(this.f69054f - 4);
                    }
                    this.f69053e.a0(0);
                    this.f69052d.b(this.f69053e);
                    this.f69055g = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.m0
    public void c(w0 w0Var, androidx.media3.extractor.t tVar, m0.e eVar) {
        this.f69052d.c(w0Var, tVar, eVar);
        this.f69057i = true;
    }
}
