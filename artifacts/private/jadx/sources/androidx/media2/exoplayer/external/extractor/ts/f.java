package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class f implements m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f54768n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f54769o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f54770p = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.w f54771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f54772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f54773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f54774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s f54775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f54778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f54779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f54780j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Format f54781k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f54782l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f54783m;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface a {
    }

    public f() {
        this(null);
    }

    private boolean b(androidx.media2.exoplayer.external.util.x source, byte[] target, int targetLength) {
        int iMin = Math.min(source.a(), targetLength - this.f54777g);
        source.i(target, this.f54777g, iMin);
        int i10 = this.f54777g + iMin;
        this.f54777g = i10;
        return i10 == targetLength;
    }

    private void g() {
        this.f54771a.n(0);
        androidx.media2.exoplayer.external.audio.b.C0503b c0503bD = androidx.media2.exoplayer.external.audio.b.d(this.f54771a);
        Format format = this.f54781k;
        if (format == null || c0503bD.f53259c != format.Z || c0503bD.f53258b != format.f53112p0 || !"audio/ac4".equals(format.f53103i)) {
            int i10 = (-1) >> 0;
            Format formatS = Format.s(this.f54774d, "audio/ac4", null, -1, -1, c0503bD.f53259c, c0503bD.f53258b, null, null, 0, this.f54773c);
            this.f54781k = formatS;
            this.f54775e.c(formatS);
        }
        this.f54782l = c0503bD.f53260d;
        this.f54780j = (((long) c0503bD.f53261e) * 1000000) / ((long) this.f54781k.f53112p0);
    }

    private boolean h(androidx.media2.exoplayer.external.util.x pesBuffer) {
        while (true) {
            if (pesBuffer.a() <= 0) {
                return false;
            }
            if (this.f54778h) {
                int iD = pesBuffer.D();
                this.f54778h = iD == 172;
                if (iD == 64 || iD == 65) {
                    this.f54779i = iD == 65;
                    return true;
                }
            } else {
                this.f54778h = pesBuffer.D() == 172;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void a() {
        this.f54776f = 0;
        this.f54777g = 0;
        this.f54778h = false;
        this.f54779i = false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void c(long pesTimeUs, int flags) {
        this.f54783m = pesTimeUs;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void d(androidx.media2.exoplayer.external.util.x data) {
        while (data.a() > 0) {
            int i10 = this.f54776f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(data.a(), this.f54782l - this.f54777g);
                        this.f54775e.d(data, iMin);
                        int i11 = this.f54777g + iMin;
                        this.f54777g = i11;
                        int i12 = this.f54782l;
                        if (i11 == i12) {
                            this.f54775e.b(this.f54783m, 1, i12, 0, null);
                            this.f54783m += this.f54780j;
                            this.f54776f = 0;
                        }
                    }
                } else if (b(data, this.f54772b.f57720a, 16)) {
                    g();
                    this.f54772b.Q(0);
                    this.f54775e.d(this.f54772b, 16);
                    this.f54776f = 2;
                }
            } else if (h(data)) {
                this.f54776f = 1;
                byte[] bArr = this.f54772b.f57720a;
                bArr[0] = -84;
                bArr[1] = (byte) (this.f54779i ? 65 : 64);
                this.f54777g = 2;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void e(androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e generator) {
        generator.a();
        this.f54774d = generator.b();
        this.f54775e = extractorOutput.a(generator.c(), 1);
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void f() {
    }

    public f(String language) {
        androidx.media2.exoplayer.external.util.w wVar = new androidx.media2.exoplayer.external.util.w(new byte[16]);
        this.f54771a = wVar;
        this.f54772b = new androidx.media2.exoplayer.external.util.x(wVar.f57716a);
        this.f54776f = 0;
        this.f54777g = 0;
        this.f54778h = false;
        this.f54779i = false;
        this.f54773c = language;
    }
}
