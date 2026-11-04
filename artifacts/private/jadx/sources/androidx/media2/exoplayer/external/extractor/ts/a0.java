package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.k0;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a0 implements h0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f54708j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f54709k = 32;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f54710l = 4098;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f54711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f54712e = new androidx.media2.exoplayer.external.util.x(32);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f54715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f54716i;

    public a0(z reader) {
        this.f54711d = reader;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.h0
    public void a() {
        this.f54716i = true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.h0
    public void b(k0 timestampAdjuster, androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        this.f54711d.b(timestampAdjuster, extractorOutput, idGenerator);
        this.f54716i = true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.h0
    public void c(androidx.media2.exoplayer.external.util.x data, int flags) {
        int iC;
        boolean z10 = (flags & 1) != 0;
        if (z10) {
            iC = data.c() + data.D();
        } else {
            iC = -1;
        }
        if (this.f54716i) {
            if (!z10) {
                return;
            }
            this.f54716i = false;
            data.Q(iC);
            this.f54714g = 0;
        }
        while (data.a() > 0) {
            int i10 = this.f54714g;
            if (i10 < 3) {
                if (i10 == 0) {
                    int iD = data.D();
                    data.Q(data.c() - 1);
                    if (iD == 255) {
                        this.f54716i = true;
                        return;
                    }
                }
                int iMin = Math.min(data.a(), 3 - this.f54714g);
                data.i(this.f54712e.f57720a, this.f54714g, iMin);
                int i11 = this.f54714g + iMin;
                this.f54714g = i11;
                if (i11 == 3) {
                    this.f54712e.M(3);
                    this.f54712e.R(1);
                    int iD2 = this.f54712e.D();
                    int iD3 = this.f54712e.D();
                    this.f54715h = (iD2 & 128) != 0;
                    this.f54713f = (((iD2 & 15) << 8) | iD3) + 3;
                    int iB = this.f54712e.b();
                    int i12 = this.f54713f;
                    if (iB < i12) {
                        androidx.media2.exoplayer.external.util.x xVar = this.f54712e;
                        byte[] bArr = xVar.f57720a;
                        xVar.M(Math.min(4098, Math.max(i12, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f54712e.f57720a, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(data.a(), this.f54713f - this.f54714g);
                data.i(this.f54712e.f57720a, this.f54714g, iMin2);
                int i13 = this.f54714g + iMin2;
                this.f54714g = i13;
                int i14 = this.f54713f;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.f54715h) {
                        this.f54712e.M(i14);
                    } else {
                        if (q0.u(this.f54712e.f57720a, 0, i14, -1) != 0) {
                            this.f54716i = true;
                            return;
                        }
                        this.f54712e.M(this.f54713f - 4);
                    }
                    this.f54711d.d(this.f54712e);
                    this.f54714g = 0;
                }
            }
        }
    }
}
