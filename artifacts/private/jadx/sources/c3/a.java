package c3;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.i;
import androidx.media2.exoplayer.external.extractor.j;
import androidx.media2.exoplayer.external.extractor.k;
import androidx.media2.exoplayer.external.extractor.p;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a implements i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f82395l = 9;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f82396m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f82397n = 1380139777;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f82398o = 4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f82399p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f82400q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f82401r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f82402s = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Format f82403d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s f82405f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f82407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f82408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f82409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f82410k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f82404e = new x(9);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f82406g = 0;

    public a(Format format) {
        this.f82403d = format;
    }

    private boolean d(j input) throws InterruptedException, IOException {
        this.f82404e.L();
        if (!input.e(this.f82404e.f57720a, 0, 8, true)) {
            return false;
        }
        if (this.f82404e.l() != f82397n) {
            throw new IOException("Input not RawCC");
        }
        this.f82407h = this.f82404e.D();
        return true;
    }

    private void e(j input) throws InterruptedException, IOException {
        while (this.f82409j > 0) {
            this.f82404e.L();
            input.readFully(this.f82404e.f57720a, 0, 3);
            this.f82405f.d(this.f82404e, 3);
            this.f82410k += 3;
            this.f82409j--;
        }
        int i10 = this.f82410k;
        if (i10 > 0) {
            this.f82405f.b(this.f82408i, 1, i10, 0, null);
        }
    }

    private boolean g(j input) throws InterruptedException, IOException {
        this.f82404e.L();
        int i10 = this.f82407h;
        if (i10 == 0) {
            if (!input.e(this.f82404e.f57720a, 0, 5, true)) {
                return false;
            }
            this.f82408i = (this.f82404e.F() * 1000) / 45;
        } else {
            if (i10 != 1) {
                int i11 = this.f82407h;
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Unsupported version number: ");
                sb2.append(i11);
                throw new k0(sb2.toString());
            }
            if (!input.e(this.f82404e.f57720a, 0, 9, true)) {
                return false;
            }
            this.f82408i = this.f82404e.w();
        }
        this.f82409j = this.f82404e.D();
        this.f82410k = 0;
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void a(long position, long timeUs) {
        this.f82406g = 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public boolean b(j input) throws InterruptedException, IOException {
        this.f82404e.L();
        input.i(this.f82404e.f57720a, 0, 8);
        return this.f82404e.l() == f82397n;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void c(k output) {
        output.q(new q.b(-9223372036854775807L));
        this.f82405f = output.a(0, 3);
        output.l();
        this.f82405f.c(this.f82403d);
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public int f(j input, p seekPosition) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.f82406g;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    e(input);
                    this.f82406g = 1;
                    return 0;
                }
                if (!g(input)) {
                    this.f82406g = 0;
                    return -1;
                }
                this.f82406g = 2;
            } else {
                if (!d(input)) {
                    return -1;
                }
                this.f82406g = 1;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void release() {
    }
}
