package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class s implements m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f55073m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f55074n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f55075o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f55076p = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f55077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.extractor.o f55078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f55079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f55080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s f55081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f55082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f55083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f55084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f55085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f55086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f55087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f55088l;

    public s() {
        this(null);
    }

    private void b(androidx.media2.exoplayer.external.util.x source) {
        byte[] bArr = source.f57720a;
        int iD = source.d();
        for (int iC = source.c(); iC < iD; iC++) {
            byte b10 = bArr[iC];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f55085i && (b10 & org.msgpack.core.h.a.K) == 224;
            this.f55085i = z10;
            if (z11) {
                source.Q(iC + 1);
                this.f55085i = false;
                this.f55077a.f57720a[1] = bArr[iC];
                this.f55083g = 2;
                this.f55082f = 1;
                return;
            }
        }
        source.Q(iD);
    }

    private void g(androidx.media2.exoplayer.external.util.x source) {
        int iMin = Math.min(source.a(), this.f55087k - this.f55083g);
        this.f55081e.d(source, iMin);
        int i10 = this.f55083g + iMin;
        this.f55083g = i10;
        int i11 = this.f55087k;
        if (i10 < i11) {
            return;
        }
        int i12 = 2 ^ 0;
        this.f55081e.b(this.f55088l, 1, i11, 0, null);
        this.f55088l += this.f55086j;
        this.f55083g = 0;
        this.f55082f = 0;
    }

    private void h(androidx.media2.exoplayer.external.util.x source) {
        int iMin = Math.min(source.a(), 4 - this.f55083g);
        source.i(this.f55077a.f57720a, this.f55083g, iMin);
        int i10 = this.f55083g + iMin;
        this.f55083g = i10;
        if (i10 < 4) {
            return;
        }
        this.f55077a.Q(0);
        if (!androidx.media2.exoplayer.external.extractor.o.b(this.f55077a.l(), this.f55078b)) {
            this.f55083g = 0;
            this.f55082f = 1;
            return;
        }
        androidx.media2.exoplayer.external.extractor.o oVar = this.f55078b;
        this.f55087k = oVar.f54569c;
        if (!this.f55084h) {
            long j10 = ((long) oVar.f54573g) * 1000000;
            int i11 = oVar.f54570d;
            this.f55086j = j10 / ((long) i11);
            this.f55081e.c(Format.s(this.f55080d, oVar.f54568b, null, -1, 4096, oVar.f54571e, i11, null, null, 0, this.f55079c));
            this.f55084h = true;
        }
        this.f55077a.Q(0);
        this.f55081e.d(this.f55077a, 4);
        this.f55082f = 2;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void a() {
        this.f55082f = 0;
        this.f55083g = 0;
        this.f55085i = false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void c(long pesTimeUs, int flags) {
        this.f55088l = pesTimeUs;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void d(androidx.media2.exoplayer.external.util.x data) {
        while (data.a() > 0) {
            int i10 = this.f55082f;
            if (i10 == 0) {
                b(data);
            } else if (i10 == 1) {
                h(data);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                g(data);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void e(androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        idGenerator.a();
        this.f55080d = idGenerator.b();
        this.f55081e = extractorOutput.a(idGenerator.c(), 1);
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void f() {
    }

    public s(String language) {
        this.f55082f = 0;
        androidx.media2.exoplayer.external.util.x xVar = new androidx.media2.exoplayer.external.util.x(4);
        this.f55077a = xVar;
        xVar.f57720a[0] = -1;
        this.f55078b = new androidx.media2.exoplayer.external.extractor.o();
        this.f55079c = language;
    }
}
