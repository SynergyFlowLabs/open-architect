package androidx.media2.exoplayer.external.extractor.ts;

import android.util.Pair;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.k0;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class r implements m {
    private static final int A = 224;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f55047u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f55048v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f55049w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f55050x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f55051y = 1024;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f55052z = 86;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f55053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f55054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.w f55055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s f55056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Format f55057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f55058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f55059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f55060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f55061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f55062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f55063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f55064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f55065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f55066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f55067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f55068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f55069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f55070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f55071s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f55072t;

    public r(@p0 String language) {
        this.f55053a = language;
        androidx.media2.exoplayer.external.util.x xVar = new androidx.media2.exoplayer.external.util.x(1024);
        this.f55054b = xVar;
        this.f55055c = new androidx.media2.exoplayer.external.util.w(xVar.f57720a);
    }

    private static long b(androidx.media2.exoplayer.external.util.w data) {
        return data.h((data.h(2) + 1) * 8);
    }

    private void g(androidx.media2.exoplayer.external.util.w data) throws k0 {
        if (!data.g()) {
            this.f55064l = true;
            l(data);
        } else if (!this.f55064l) {
            return;
        }
        if (this.f55065m != 0) {
            throw new k0();
        }
        if (this.f55066n != 0) {
            throw new k0();
        }
        k(data, j(data));
        if (this.f55068p) {
            data.p((int) this.f55069q);
        }
    }

    private int h(androidx.media2.exoplayer.external.util.w data) throws k0 {
        int iB = data.b();
        Pair<Integer, Integer> pairI = androidx.media2.exoplayer.external.util.d.i(data, true);
        this.f55070r = ((Integer) pairI.first).intValue();
        this.f55072t = ((Integer) pairI.second).intValue();
        return iB - data.b();
    }

    private void i(androidx.media2.exoplayer.external.util.w data) {
        int iH = data.h(3);
        this.f55067o = iH;
        if (iH == 0) {
            data.p(8);
            return;
        }
        if (iH == 1) {
            data.p(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            data.p(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            data.p(1);
        }
    }

    private int j(androidx.media2.exoplayer.external.util.w data) throws k0 {
        int iH;
        if (this.f55067o != 0) {
            throw new k0();
        }
        int i10 = 0;
        do {
            iH = data.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    private void k(androidx.media2.exoplayer.external.util.w data, int muxLengthBytes) {
        int iE = data.e();
        if ((iE & 7) == 0) {
            this.f55054b.Q(iE >> 3);
        } else {
            data.i(this.f55054b.f57720a, 0, muxLengthBytes * 8);
            this.f55054b.Q(0);
        }
        this.f55056d.d(this.f55054b, muxLengthBytes);
        this.f55056d.b(this.f55063k, 1, muxLengthBytes, 0, null);
        this.f55063k += this.f55071s;
    }

    private void l(androidx.media2.exoplayer.external.util.w data) throws k0 {
        boolean zG;
        int iH = data.h(1);
        int iH2 = iH == 1 ? data.h(1) : 0;
        this.f55065m = iH2;
        if (iH2 != 0) {
            throw new k0();
        }
        if (iH == 1) {
            b(data);
        }
        if (!data.g()) {
            throw new k0();
        }
        this.f55066n = data.h(6);
        int iH3 = data.h(4);
        int iH4 = data.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw new k0();
        }
        if (iH == 0) {
            int iE = data.e();
            int iH5 = h(data);
            data.n(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            data.i(bArr, 0, iH5);
            Format formatS = Format.s(this.f55058f, "audio/mp4a-latm", null, -1, -1, this.f55072t, this.f55070r, Collections.singletonList(bArr), null, 0, this.f55053a);
            if (!formatS.equals(this.f55057e)) {
                this.f55057e = formatS;
                this.f55071s = 1024000000 / ((long) formatS.f53112p0);
                this.f55056d.c(formatS);
            }
        } else {
            data.p(((int) b(data)) - h(data));
        }
        i(data);
        boolean zG2 = data.g();
        this.f55068p = zG2;
        this.f55069q = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f55069q = b(data);
            } else {
                do {
                    zG = data.g();
                    this.f55069q = (this.f55069q << 8) + ((long) data.h(8));
                } while (zG);
            }
        }
        if (data.g()) {
            data.p(8);
        }
    }

    private void m(int newSize) {
        this.f55054b.M(newSize);
        this.f55055c.l(this.f55054b.f57720a);
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void a() {
        this.f55059g = 0;
        this.f55064l = false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void c(long pesTimeUs, int flags) {
        this.f55063k = pesTimeUs;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void d(androidx.media2.exoplayer.external.util.x data) throws k0 {
        while (data.a() > 0) {
            int i10 = this.f55059g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iD = data.D();
                    if ((iD & 224) == 224) {
                        this.f55062j = iD;
                        this.f55059g = 2;
                    } else if (iD != 86) {
                        this.f55059g = 0;
                    }
                } else if (i10 == 2) {
                    int iD2 = ((this.f55062j & (-225)) << 8) | data.D();
                    this.f55061i = iD2;
                    if (iD2 > this.f55054b.f57720a.length) {
                        m(iD2);
                    }
                    this.f55060h = 0;
                    this.f55059g = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(data.a(), this.f55061i - this.f55060h);
                    data.i(this.f55055c.f57716a, this.f55060h, iMin);
                    int i11 = this.f55060h + iMin;
                    this.f55060h = i11;
                    if (i11 == this.f55061i) {
                        this.f55055c.n(0);
                        g(this.f55055c);
                        this.f55059g = 0;
                    }
                }
            } else if (data.D() == 86) {
                this.f55059g = 1;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void e(androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        idGenerator.a();
        this.f55056d = extractorOutput.a(idGenerator.c(), 1);
        this.f55058f = idGenerator.b();
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void f() {
    }
}
