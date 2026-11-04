package androidx.media2.exoplayer.external.extractor.ts;

import android.util.Pair;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.k0;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class i implements m {
    private static final int A = 4;
    private static final int B = 5;
    private static final int C = 2;
    private static final int D = 8;
    private static final int E = 256;
    private static final int F = 512;
    private static final int G = 768;
    private static final int H = 1024;
    private static final int I = 10;
    private static final int J = 6;
    private static final byte[] K = {73, 68, 51};
    private static final int L = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f54857v = "AdtsReader";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f54858w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f54859x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f54860y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f54861z = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f54862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.w f54863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f54864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f54865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f54866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s f54867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s f54868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f54870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f54872k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f54873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f54874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f54875n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f54876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f54877p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f54878q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f54879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f54880s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s f54881t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f54882u;

    public i(boolean exposeId3) {
        this(exposeId3, null);
    }

    private void b(androidx.media2.exoplayer.external.util.x buffer) {
        if (buffer.a() == 0) {
            return;
        }
        this.f54863b.f57716a[0] = buffer.f57720a[buffer.c()];
        this.f54863b.n(2);
        int iH = this.f54863b.h(4);
        int i10 = this.f54875n;
        if (i10 != -1 && iH != i10) {
            p();
            return;
        }
        if (!this.f54873l) {
            this.f54873l = true;
            this.f54874m = this.f54876o;
            this.f54875n = iH;
        }
        s();
    }

    private boolean g(androidx.media2.exoplayer.external.util.x pesBuffer, int syncPositionCandidate) {
        pesBuffer.Q(syncPositionCandidate + 1);
        int i10 = 4 ^ 1;
        if (!v(pesBuffer, this.f54863b.f57716a, 1)) {
            return false;
        }
        this.f54863b.n(4);
        int iH = this.f54863b.h(1);
        int i11 = this.f54874m;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f54875n != -1) {
            if (!v(pesBuffer, this.f54863b.f57716a, 1)) {
                return true;
            }
            this.f54863b.n(2);
            if (this.f54863b.h(4) != this.f54875n) {
                return false;
            }
            pesBuffer.Q(syncPositionCandidate + 2);
        }
        if (!v(pesBuffer, this.f54863b.f57716a, 4)) {
            return true;
        }
        this.f54863b.n(14);
        int iH2 = this.f54863b.h(13);
        if (iH2 <= 6) {
            return false;
        }
        int i12 = syncPositionCandidate + iH2;
        int i13 = i12 + 1;
        if (i13 >= pesBuffer.d()) {
            return true;
        }
        byte[] bArr = pesBuffer.f57720a;
        return k(bArr[i12], bArr[i13]) && (this.f54874m == -1 || ((pesBuffer.f57720a[i13] & 8) >> 3) == iH);
    }

    private boolean h(androidx.media2.exoplayer.external.util.x source, byte[] target, int targetLength) {
        int iMin = Math.min(source.a(), targetLength - this.f54870i);
        source.i(target, this.f54870i, iMin);
        int i10 = this.f54870i + iMin;
        this.f54870i = i10;
        return i10 == targetLength;
    }

    private void i(androidx.media2.exoplayer.external.util.x pesBuffer) {
        byte[] bArr = pesBuffer.f57720a;
        int iC = pesBuffer.c();
        int iD = pesBuffer.d();
        while (iC < iD) {
            int i10 = iC + 1;
            byte b10 = bArr[iC];
            int i11 = b10 & 255;
            if (this.f54871j == 512 && k((byte) -1, (byte) i11) && (this.f54873l || g(pesBuffer, iC - 1))) {
                this.f54876o = (b10 & 8) >> 3;
                this.f54872k = (b10 & 1) == 0;
                if (this.f54873l) {
                    s();
                } else {
                    q();
                }
                pesBuffer.Q(i10);
                return;
            }
            int i12 = this.f54871j;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f54871j = 768;
            } else if (i13 == 511) {
                this.f54871j = 512;
            } else if (i13 == 836) {
                this.f54871j = 1024;
            } else if (i13 == 1075) {
                t();
                pesBuffer.Q(i10);
                return;
            } else if (i12 != 256) {
                this.f54871j = 256;
            }
            iC = i10;
        }
        pesBuffer.Q(iC);
    }

    private boolean k(byte firstByte, byte secondByte) {
        return l(((firstByte & 255) << 8) | (secondByte & 255));
    }

    public static boolean l(int candidateSyncWord) {
        return (candidateSyncWord & 65526) == 65520;
    }

    private void m() throws k0 {
        this.f54863b.n(0);
        if (this.f54877p) {
            this.f54863b.p(10);
        } else {
            int i10 = 2;
            int iH = this.f54863b.h(2) + 1;
            if (iH != 2) {
                StringBuilder sb2 = new StringBuilder(61);
                sb2.append("Detected audio object type: ");
                sb2.append(iH);
                sb2.append(", but assuming AAC LC.");
                androidx.media2.exoplayer.external.util.p.l(f54857v, sb2.toString());
            } else {
                i10 = iH;
            }
            this.f54863b.p(5);
            byte[] bArrA = androidx.media2.exoplayer.external.util.d.a(i10, this.f54875n, this.f54863b.h(3));
            Pair<Integer, Integer> pairJ = androidx.media2.exoplayer.external.util.d.j(bArrA);
            Format formatS = Format.s(this.f54866e, "audio/mp4a-latm", null, -1, -1, ((Integer) pairJ.second).intValue(), ((Integer) pairJ.first).intValue(), Collections.singletonList(bArrA), null, 0, this.f54865d);
            this.f54878q = 1024000000 / ((long) formatS.f53112p0);
            this.f54867f.c(formatS);
            this.f54877p = true;
        }
        this.f54863b.p(4);
        int iH2 = this.f54863b.h(13);
        int i11 = iH2 - 7;
        if (this.f54872k) {
            i11 = iH2 - 9;
        }
        u(this.f54867f, this.f54878q, 0, i11);
    }

    private void n() {
        this.f54868g.d(this.f54864c, 10);
        this.f54864c.Q(6);
        u(this.f54868g, 0L, 10, this.f54864c.C() + 10);
    }

    private void o(androidx.media2.exoplayer.external.util.x data) {
        int iMin = Math.min(data.a(), this.f54879r - this.f54870i);
        this.f54881t.d(data, iMin);
        int i10 = this.f54870i + iMin;
        this.f54870i = i10;
        int i11 = this.f54879r;
        if (i10 == i11) {
            this.f54881t.b(this.f54880s, 1, i11, 0, null);
            this.f54880s += this.f54882u;
            r();
        }
    }

    private void p() {
        this.f54873l = false;
        r();
    }

    private void q() {
        this.f54869h = 1;
        this.f54870i = 0;
    }

    private void r() {
        this.f54869h = 0;
        this.f54870i = 0;
        this.f54871j = 256;
    }

    private void s() {
        this.f54869h = 3;
        this.f54870i = 0;
    }

    private void t() {
        this.f54869h = 2;
        this.f54870i = K.length;
        this.f54879r = 0;
        this.f54864c.Q(0);
    }

    private void u(androidx.media2.exoplayer.external.extractor.s outputToUse, long currentSampleDuration, int priorReadBytes, int sampleSize) {
        this.f54869h = 4;
        this.f54870i = priorReadBytes;
        this.f54881t = outputToUse;
        this.f54882u = currentSampleDuration;
        this.f54879r = sampleSize;
    }

    private boolean v(androidx.media2.exoplayer.external.util.x source, byte[] target, int targetLength) {
        if (source.a() < targetLength) {
            return false;
        }
        source.i(target, 0, targetLength);
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void a() {
        p();
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void c(long pesTimeUs, int flags) {
        this.f54880s = pesTimeUs;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void d(androidx.media2.exoplayer.external.util.x data) throws k0 {
        while (data.a() > 0) {
            int i10 = this.f54869h;
            if (i10 == 0) {
                i(data);
            } else if (i10 == 1) {
                b(data);
            } else if (i10 != 2) {
                if (i10 != 3) {
                    int i11 = 3 | 4;
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    o(data);
                } else {
                    if (h(data, this.f54863b.f57716a, this.f54872k ? 7 : 5)) {
                        m();
                    }
                }
            } else if (h(data, this.f54864c.f57720a, 10)) {
                n();
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void e(androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        idGenerator.a();
        this.f54866e = idGenerator.b();
        this.f54867f = extractorOutput.a(idGenerator.c(), 1);
        if (!this.f54862a) {
            this.f54868g = new androidx.media2.exoplayer.external.extractor.h();
            return;
        }
        idGenerator.a();
        androidx.media2.exoplayer.external.extractor.s sVarA = extractorOutput.a(idGenerator.c(), 4);
        this.f54868g = sVarA;
        sVarA.c(Format.x(idGenerator.b(), "application/id3", null, -1, null));
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void f() {
    }

    public long j() {
        return this.f54878q;
    }

    public i(boolean exposeId3, String language) {
        int i10 = 0 | 7;
        this.f54863b = new androidx.media2.exoplayer.external.util.w(new byte[7]);
        this.f54864c = new androidx.media2.exoplayer.external.util.x(Arrays.copyOf(K, 10));
        r();
        this.f54874m = -1;
        this.f54875n = -1;
        this.f54878q = -9223372036854775807L;
        this.f54862a = exposeId3;
        this.f54865d = language;
    }
}
