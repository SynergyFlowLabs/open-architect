package androidx.media2.exoplayer.external.extractor.flv;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.extractor.i;
import androidx.media2.exoplayer.external.extractor.j;
import androidx.media2.exoplayer.external.extractor.k;
import androidx.media2.exoplayer.external.extractor.l;
import androidx.media2.exoplayer.external.extractor.p;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c implements i {
    private static final int A = 8;
    private static final int B = 9;
    private static final int C = 18;
    private static final int D = 4607062;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f54029t = b.f54028a;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f54030u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f54031v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f54032w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f54033x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f54034y = 9;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f54035z = 11;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k f54041i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f54043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f54044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f54045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f54046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f54047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f54048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f54049q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.flv.a f54050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private f f54051s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f54036d = new x(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f54037e = new x(9);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f54038f = new x(11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f54039g = new x();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f54040h = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54042j = 1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface a {
    }

    private void d() {
        if (this.f54049q) {
            return;
        }
        this.f54041i.q(new q.b(-9223372036854775807L));
        this.f54049q = true;
    }

    private long e() {
        if (this.f54043k) {
            return this.f54044l + this.f54048p;
        }
        if (this.f54040h.e() == -9223372036854775807L) {
            return 0L;
        }
        return this.f54048p;
    }

    static final /* synthetic */ i[] g() {
        return new i[]{new c()};
    }

    private x h(j input) throws InterruptedException, IOException {
        if (this.f54047o > this.f54039g.b()) {
            x xVar = this.f54039g;
            xVar.O(new byte[Math.max(xVar.b() * 2, this.f54047o)], 0);
        } else {
            this.f54039g.Q(0);
        }
        this.f54039g.P(this.f54047o);
        input.readFully(this.f54039g.f57720a, 0, this.f54047o);
        return this.f54039g;
    }

    private boolean i(j input) throws InterruptedException, IOException {
        if (!input.e(this.f54037e.f57720a, 0, 9, true)) {
            return false;
        }
        this.f54037e.Q(0);
        this.f54037e.R(4);
        int iD = this.f54037e.D();
        boolean z10 = (iD & 4) != 0;
        boolean z11 = (iD & 1) != 0;
        if (z10 && this.f54050r == null) {
            this.f54050r = new androidx.media2.exoplayer.external.extractor.flv.a(this.f54041i.a(8, 1));
        }
        if (z11 && this.f54051s == null) {
            this.f54051s = new f(this.f54041i.a(9, 2));
        }
        this.f54041i.l();
        this.f54045m = this.f54037e.l() - 5;
        this.f54042j = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    private boolean j(j input) throws InterruptedException, IOException {
        boolean zA;
        boolean z10;
        long j10;
        long jE = e();
        int i10 = this.f54046n;
        if (i10 == 8 && this.f54050r != null) {
            d();
            zA = this.f54050r.a(h(input), jE);
        } else {
            if (i10 != 9 || this.f54051s == null) {
                if (i10 != 18 || this.f54049q) {
                    input.o(this.f54047o);
                    zA = false;
                    z10 = false;
                } else {
                    zA = this.f54040h.a(h(input), jE);
                    long jE2 = this.f54040h.e();
                    if (jE2 != -9223372036854775807L) {
                        this.f54041i.q(new q.b(jE2));
                        this.f54049q = true;
                    }
                }
                if (!this.f54043k && zA) {
                    this.f54043k = true;
                    if (this.f54040h.e() == -9223372036854775807L) {
                        j10 = -this.f54048p;
                    } else {
                        j10 = 0;
                    }
                    this.f54044l = j10;
                }
                this.f54045m = 4;
                this.f54042j = 2;
                return z10;
            }
            d();
            zA = this.f54051s.a(h(input), jE);
        }
        z10 = true;
        if (!this.f54043k) {
            this.f54043k = true;
            if (this.f54040h.e() == -9223372036854775807L) {
                j10 = -this.f54048p;
            } else {
                j10 = 0;
            }
            this.f54044l = j10;
        }
        this.f54045m = 4;
        this.f54042j = 2;
        return z10;
    }

    private boolean k(j input) throws InterruptedException, IOException {
        if (!input.e(this.f54038f.f57720a, 0, 11, true)) {
            return false;
        }
        this.f54038f.Q(0);
        this.f54046n = this.f54038f.D();
        this.f54047o = this.f54038f.G();
        this.f54048p = this.f54038f.G();
        this.f54048p = (((long) (this.f54038f.D() << 24)) | this.f54048p) * 1000;
        this.f54038f.R(3);
        this.f54042j = 4;
        return true;
    }

    private void l(j input) throws InterruptedException, IOException {
        input.o(this.f54045m);
        this.f54045m = 0;
        this.f54042j = 3;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void a(long position, long timeUs) {
        this.f54042j = 1;
        this.f54043k = false;
        this.f54045m = 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public boolean b(j input) throws InterruptedException, IOException {
        input.i(this.f54036d.f57720a, 0, 3);
        this.f54036d.Q(0);
        if (this.f54036d.G() != D) {
            return false;
        }
        input.i(this.f54036d.f57720a, 0, 2);
        this.f54036d.Q(0);
        if ((this.f54036d.J() & 250) != 0) {
            return false;
        }
        input.i(this.f54036d.f57720a, 0, 4);
        this.f54036d.Q(0);
        int iL = this.f54036d.l();
        input.l();
        input.n(iL);
        input.i(this.f54036d.f57720a, 0, 4);
        this.f54036d.Q(0);
        return this.f54036d.l() == 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void c(k output) {
        this.f54041i = output;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public int f(j input, p seekPosition) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.f54042j;
            if (i10 != 1) {
                if (i10 == 2) {
                    l(input);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (j(input)) {
                        return 0;
                    }
                } else if (!k(input)) {
                    return -1;
                }
            } else if (!i(input)) {
                return -1;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void release() {
    }
}
