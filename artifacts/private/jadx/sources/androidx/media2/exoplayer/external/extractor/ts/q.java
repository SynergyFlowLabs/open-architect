package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class q implements m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f55040g = "Id3Reader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f55041a = new androidx.media2.exoplayer.external.util.x(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s f55042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f55043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f55044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f55046f;

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void a() {
        this.f55043c = false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void c(long pesTimeUs, int flags) {
        if ((flags & 4) == 0) {
            return;
        }
        this.f55043c = true;
        this.f55044d = pesTimeUs;
        this.f55045e = 0;
        this.f55046f = 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void d(androidx.media2.exoplayer.external.util.x data) {
        if (this.f55043c) {
            int iA = data.a();
            int i10 = this.f55046f;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(data.f57720a, data.c(), this.f55041a.f57720a, this.f55046f, iMin);
                if (this.f55046f + iMin == 10) {
                    this.f55041a.Q(0);
                    if (73 == this.f55041a.D() && 68 == this.f55041a.D() && 51 == this.f55041a.D()) {
                        this.f55041a.R(3);
                        this.f55045e = this.f55041a.C() + 10;
                    }
                    androidx.media2.exoplayer.external.util.p.l(f55040g, "Discarding invalid ID3 tag");
                    this.f55043c = false;
                    return;
                }
            }
            int iMin2 = Math.min(iA, this.f55045e - this.f55046f);
            this.f55042b.d(data, iMin2);
            this.f55046f += iMin2;
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void e(androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        idGenerator.a();
        androidx.media2.exoplayer.external.extractor.s sVarA = extractorOutput.a(idGenerator.c(), 4);
        this.f55042b = sVarA;
        sVarA.c(Format.x(idGenerator.b(), "application/id3", null, -1, null));
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void f() {
        int i10;
        if (this.f55043c && (i10 = this.f55045e) != 0 && this.f55046f == i10) {
            this.f55042b.b(this.f55044d, 1, i10, 0, null);
            this.f55043c = false;
        }
    }
}
