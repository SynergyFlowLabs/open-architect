package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class k implements m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f54896l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f54897m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f54898n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f54899o = 18;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f54902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s f54903d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f54907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Format f54908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f54910k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f54900a = new androidx.media2.exoplayer.external.util.x(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54904e = 0;

    public k(String language) {
        this.f54901b = language;
    }

    private boolean b(androidx.media2.exoplayer.external.util.x source, byte[] target, int targetLength) {
        int iMin = Math.min(source.a(), targetLength - this.f54905f);
        source.i(target, this.f54905f, iMin);
        int i10 = this.f54905f + iMin;
        this.f54905f = i10;
        return i10 == targetLength;
    }

    private void g() {
        byte[] bArr = this.f54900a.f57720a;
        if (this.f54908i == null) {
            Format formatG = androidx.media2.exoplayer.external.audio.z.g(bArr, this.f54902c, this.f54901b, null);
            this.f54908i = formatG;
            this.f54903d.c(formatG);
        }
        this.f54909j = androidx.media2.exoplayer.external.audio.z.a(bArr);
        this.f54907h = (int) ((((long) androidx.media2.exoplayer.external.audio.z.f(bArr)) * 1000000) / ((long) this.f54908i.f53112p0));
    }

    private boolean h(androidx.media2.exoplayer.external.util.x pesBuffer) {
        while (pesBuffer.a() > 0) {
            int i10 = this.f54906g << 8;
            this.f54906g = i10;
            int iD = i10 | pesBuffer.D();
            this.f54906g = iD;
            if (androidx.media2.exoplayer.external.audio.z.d(iD)) {
                byte[] bArr = this.f54900a.f57720a;
                int i11 = this.f54906g;
                bArr[0] = (byte) ((i11 >> 24) & 255);
                bArr[1] = (byte) ((i11 >> 16) & 255);
                bArr[2] = (byte) ((i11 >> 8) & 255);
                bArr[3] = (byte) (i11 & 255);
                this.f54905f = 4;
                this.f54906g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void a() {
        this.f54904e = 0;
        this.f54905f = 0;
        this.f54906g = 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void c(long pesTimeUs, int flags) {
        this.f54910k = pesTimeUs;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void d(androidx.media2.exoplayer.external.util.x data) {
        while (data.a() > 0) {
            int i10 = this.f54904e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(data.a(), this.f54909j - this.f54905f);
                    this.f54903d.d(data, iMin);
                    int i11 = this.f54905f + iMin;
                    this.f54905f = i11;
                    int i12 = this.f54909j;
                    if (i11 == i12) {
                        this.f54903d.b(this.f54910k, 1, i12, 0, null);
                        this.f54910k += this.f54907h;
                        this.f54904e = 0;
                    }
                } else if (b(data, this.f54900a.f57720a, 18)) {
                    g();
                    this.f54900a.Q(0);
                    this.f54903d.d(this.f54900a, 18);
                    this.f54904e = 2;
                }
            } else if (h(data)) {
                this.f54904e = 1;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void e(androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        idGenerator.a();
        this.f54902c = idGenerator.b();
        this.f54903d = extractorOutput.a(idGenerator.c(), 1);
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void f() {
    }
}
