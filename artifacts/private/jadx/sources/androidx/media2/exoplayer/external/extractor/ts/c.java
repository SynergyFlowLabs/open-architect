package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c implements m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f54726m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f54727n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f54728o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f54729p = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.w f54730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f54731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f54732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f54733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s f54734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f54737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f54738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Format f54739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f54740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f54741l;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface a {
    }

    public c() {
        this(null);
    }

    private boolean b(androidx.media2.exoplayer.external.util.x source, byte[] target, int targetLength) {
        int iMin = Math.min(source.a(), targetLength - this.f54736g);
        source.i(target, this.f54736g, iMin);
        int i10 = this.f54736g + iMin;
        this.f54736g = i10;
        return i10 == targetLength;
    }

    private void g() {
        this.f54730a.n(0);
        androidx.media2.exoplayer.external.audio.a.b bVarE = androidx.media2.exoplayer.external.audio.a.e(this.f54730a);
        Format format = this.f54739j;
        if (format == null || bVarE.f53247d != format.Z || bVarE.f53246c != format.f53112p0 || bVarE.f53244a != format.f53103i) {
            Format formatS = Format.s(this.f54733d, bVarE.f53244a, null, -1, -1, bVarE.f53247d, bVarE.f53246c, null, null, 0, this.f54732c);
            this.f54739j = formatS;
            this.f54734e.c(formatS);
        }
        this.f54740k = bVarE.f53248e;
        this.f54738i = (((long) bVarE.f53249f) * 1000000) / ((long) this.f54739j.f53112p0);
    }

    private boolean h(androidx.media2.exoplayer.external.util.x pesBuffer) {
        while (true) {
            if (pesBuffer.a() <= 0) {
                return false;
            }
            if (this.f54737h) {
                int iD = pesBuffer.D();
                if (iD == 119) {
                    this.f54737h = false;
                    return true;
                }
                this.f54737h = iD == 11;
            } else {
                this.f54737h = pesBuffer.D() == 11;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void a() {
        this.f54735f = 0;
        this.f54736g = 0;
        this.f54737h = false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void c(long pesTimeUs, int flags) {
        this.f54741l = pesTimeUs;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void d(androidx.media2.exoplayer.external.util.x data) {
        while (data.a() > 0) {
            int i10 = this.f54735f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(data.a(), this.f54740k - this.f54736g);
                        this.f54734e.d(data, iMin);
                        int i11 = this.f54736g + iMin;
                        this.f54736g = i11;
                        int i12 = this.f54740k;
                        if (i11 == i12) {
                            this.f54734e.b(this.f54741l, 1, i12, 0, null);
                            this.f54741l += this.f54738i;
                            this.f54735f = 0;
                        }
                    }
                } else if (b(data, this.f54731b.f57720a, 128)) {
                    g();
                    this.f54731b.Q(0);
                    this.f54734e.d(this.f54731b, 128);
                    this.f54735f = 2;
                }
            } else if (h(data)) {
                this.f54735f = 1;
                byte[] bArr = this.f54731b.f57720a;
                bArr[0] = 11;
                bArr[1] = 119;
                this.f54736g = 2;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void e(androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e generator) {
        generator.a();
        this.f54733d = generator.b();
        this.f54734e = extractorOutput.a(generator.c(), 1);
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void f() {
    }

    public c(String language) {
        androidx.media2.exoplayer.external.util.w wVar = new androidx.media2.exoplayer.external.util.w(new byte[128]);
        this.f54730a = wVar;
        this.f54731b = new androidx.media2.exoplayer.external.util.x(wVar.f57716a);
        this.f54735f = 0;
        this.f54732c = language;
    }
}
