package androidx.media3.extractor.ts;

import androidx.media3.common.util.k1;
import androidx.media3.common.util.w0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class i0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f69131j = "TsDurationReader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69132a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f69135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f69136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f69137f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w0 f69133b = new w0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f69138g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f69139h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f69140i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69134c = new androidx.media3.common.util.o0();

    i0(int i10) {
        this.f69132a = i10;
    }

    private int a(androidx.media3.extractor.s sVar) {
        this.f69134c.X(k1.f61545f);
        this.f69135d = true;
        sVar.l();
        return 0;
    }

    private int f(androidx.media3.extractor.s sVar, androidx.media3.extractor.n0 n0Var, int i10) throws IOException {
        int iMin = (int) Math.min(this.f69132a, sVar.getLength());
        long j10 = 0;
        if (sVar.getPosition() != j10) {
            n0Var.f68159a = j10;
            return 1;
        }
        this.f69134c.W(iMin);
        sVar.l();
        sVar.i(this.f69134c.e(), 0, iMin);
        this.f69138g = g(this.f69134c, i10);
        this.f69136e = true;
        return 0;
    }

    private long g(androidx.media3.common.util.o0 o0Var, int i10) {
        int iG = o0Var.g();
        for (int iF = o0Var.f(); iF < iG; iF++) {
            if (o0Var.e()[iF] == 71) {
                long jC = n0.c(o0Var, iF, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(androidx.media3.extractor.s sVar, androidx.media3.extractor.n0 n0Var, int i10) throws IOException {
        long length = sVar.getLength();
        int iMin = (int) Math.min(this.f69132a, length);
        long j10 = length - ((long) iMin);
        if (sVar.getPosition() != j10) {
            n0Var.f68159a = j10;
            return 1;
        }
        this.f69134c.W(iMin);
        sVar.l();
        sVar.i(this.f69134c.e(), 0, iMin);
        this.f69139h = i(this.f69134c, i10);
        this.f69137f = true;
        return 0;
    }

    private long i(androidx.media3.common.util.o0 o0Var, int i10) {
        int iF = o0Var.f();
        int iG = o0Var.g();
        for (int i11 = iG - 188; i11 >= iF; i11--) {
            if (n0.b(o0Var.e(), iF, iG, i11)) {
                long jC = n0.c(o0Var, i11, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f69140i;
    }

    public w0 c() {
        return this.f69133b;
    }

    public boolean d() {
        return this.f69135d;
    }

    public int e(androidx.media3.extractor.s sVar, androidx.media3.extractor.n0 n0Var, int i10) throws IOException {
        if (i10 <= 0) {
            return a(sVar);
        }
        if (!this.f69137f) {
            return h(sVar, n0Var, i10);
        }
        if (this.f69139h == -9223372036854775807L) {
            return a(sVar);
        }
        if (!this.f69136e) {
            return f(sVar, n0Var, i10);
        }
        long j10 = this.f69138g;
        if (j10 == -9223372036854775807L) {
            return a(sVar);
        }
        this.f69140i = this.f69133b.c(this.f69139h) - this.f69133b.b(j10);
        return a(sVar);
    }
}
