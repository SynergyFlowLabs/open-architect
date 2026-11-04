package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.k0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class h implements androidx.media2.exoplayer.external.extractor.i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final androidx.media2.exoplayer.external.extractor.l f54824p = g.f54785a;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f54825q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f54826r = 2048;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f54827s = 8192;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f54828t = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f54829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f54830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f54831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f54832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.w f54833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private androidx.media2.exoplayer.external.extractor.k f54834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f54835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f54836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f54837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f54838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f54839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f54840o;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public h() {
        this(0);
    }

    private void d(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        if (this.f54838m) {
            return;
        }
        this.f54837l = -1;
        input.l();
        long j10 = 0;
        if (input.getPosition() == 0) {
            j(input);
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (input.k(this.f54832g.f57720a, 0, 2, true)) {
                this.f54832g.Q(0);
                if (!i.l(this.f54832g.J())) {
                    break;
                }
                if (input.k(this.f54832g.f57720a, 0, 4, true)) {
                    this.f54833h.n(14);
                    int iH = this.f54833h.h(13);
                    if (iH <= 6) {
                        this.f54838m = true;
                        throw new k0("Malformed ADTS stream");
                    }
                    j10 += (long) iH;
                    i11++;
                    if (i11 != 1000 && input.p(iH - 6, true)) {
                    }
                }
            }
            i10 = i11;
            break;
        }
        input.l();
        if (i10 > 0) {
            this.f54837l = (int) (j10 / ((long) i10));
        } else {
            this.f54837l = -1;
        }
        this.f54838m = true;
    }

    private static int e(int frameSize, long durationUsPerFrame) {
        return (int) ((((long) (frameSize * 8)) * 1000000) / durationUsPerFrame);
    }

    private androidx.media2.exoplayer.external.extractor.q g(long inputLength) {
        return new androidx.media2.exoplayer.external.extractor.d(inputLength, this.f54836k, e(this.f54837l, this.f54830e.j()), this.f54837l);
    }

    static final /* synthetic */ androidx.media2.exoplayer.external.extractor.i[] h() {
        return new androidx.media2.exoplayer.external.extractor.i[]{new h()};
    }

    private void i(long inputLength, boolean canUseConstantBitrateSeeking, boolean readEndOfStream) {
        if (this.f54840o) {
            return;
        }
        boolean z10 = canUseConstantBitrateSeeking && this.f54837l > 0;
        if (z10 && this.f54830e.j() == -9223372036854775807L && !readEndOfStream) {
            return;
        }
        androidx.media2.exoplayer.external.extractor.k kVar = (androidx.media2.exoplayer.external.extractor.k) androidx.media2.exoplayer.external.util.a.g(this.f54834i);
        if (!z10 || this.f54830e.j() == -9223372036854775807L) {
            kVar.q(new androidx.media2.exoplayer.external.extractor.q.b(-9223372036854775807L));
        } else {
            kVar.q(g(inputLength));
        }
        this.f54840o = true;
    }

    private int j(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        int i10 = 0;
        while (true) {
            input.i(this.f54832g.f57720a, 0, 10);
            this.f54832g.Q(0);
            if (this.f54832g.G() != 4801587) {
                break;
            }
            this.f54832g.R(3);
            int iC = this.f54832g.C();
            i10 += iC + 10;
            input.n(iC);
        }
        input.l();
        input.n(i10);
        if (this.f54836k == -1) {
            this.f54836k = i10;
        }
        return i10;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void a(long position, long timeUs) {
        this.f54839n = false;
        this.f54830e.a();
        this.f54835j = timeUs;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public boolean b(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        int iJ = j(input);
        int i10 = iJ;
        while (true) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                input.i(this.f54832g.f57720a, 0, 2);
                this.f54832g.Q(0);
                if (!i.l(this.f54832g.J())) {
                    break;
                }
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                input.i(this.f54832g.f57720a, 0, 4);
                this.f54833h.n(14);
                int iH = this.f54833h.h(13);
                if (iH <= 6) {
                    return false;
                }
                input.n(iH - 6);
                i12 += iH;
            }
            input.l();
            i10++;
            if (i10 - iJ >= 8192) {
                return false;
            }
            input.n(i10);
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void c(androidx.media2.exoplayer.external.extractor.k output) {
        this.f54834i = output;
        this.f54830e.e(output, new h0.e(0, 1));
        output.l();
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public int f(androidx.media2.exoplayer.external.extractor.j input, androidx.media2.exoplayer.external.extractor.p seekPosition) throws InterruptedException, IOException {
        long length = input.getLength();
        boolean z10 = ((this.f54829d & 1) == 0 || length == -1) ? false : true;
        if (z10) {
            d(input);
        }
        int i10 = input.read(this.f54831f.f57720a, 0, 2048);
        boolean z11 = i10 == -1;
        i(length, z10, z11);
        if (z11) {
            return -1;
        }
        this.f54831f.Q(0);
        this.f54831f.P(i10);
        if (!this.f54839n) {
            this.f54830e.c(this.f54835j, 4);
            this.f54839n = true;
        }
        this.f54830e.d(this.f54831f);
        return 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void release() {
    }

    public h(int flags) {
        this.f54829d = flags;
        this.f54830e = new i(true);
        this.f54831f = new androidx.media2.exoplayer.external.util.x(2048);
        this.f54837l = -1;
        this.f54836k = -1L;
        androidx.media2.exoplayer.external.util.x xVar = new androidx.media2.exoplayer.external.util.x(10);
        this.f54832g = xVar;
        this.f54833h = new androidx.media2.exoplayer.external.util.w(xVar.f57720a);
    }
}
