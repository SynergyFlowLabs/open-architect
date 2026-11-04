package androidx.media3.extractor.flv;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;
import androidx.media3.extractor.j0;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.p0;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import androidx.media3.extractor.w;
import il.m;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c implements r {
    private static final int A = 8;
    private static final int B = 9;
    private static final int C = 18;
    private static final int D = 4607062;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final w f67278t = new w() { // from class: androidx.media3.extractor.flv.b
        @Override // androidx.media3.extractor.w
        public final r[] c() {
            return c.d();
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f67279u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f67280v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f67281w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f67282x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f67283y = 9;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f67284z = 11;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t f67290i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f67292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f67293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f67294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f67295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f67296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f67297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f67298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f67299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private f f67300s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o0 f67285d = new o0(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o0 f67286e = new o0(9);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o0 f67287f = new o0(11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o0 f67288g = new o0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f67289h = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f67291j = 1;

    public static /* synthetic */ r[] d() {
        return new r[]{new c()};
    }

    @m({"extractorOutput"})
    private void e() {
        if (this.f67298q) {
            return;
        }
        this.f67290i.u(new p0.b(-9223372036854775807L));
        this.f67298q = true;
    }

    private long i() {
        if (this.f67292k) {
            return this.f67293l + this.f67297p;
        }
        if (this.f67289h.e() == -9223372036854775807L) {
            return 0L;
        }
        return this.f67297p;
    }

    private o0 j(s sVar) throws IOException {
        if (this.f67296o > this.f67288g.b()) {
            o0 o0Var = this.f67288g;
            o0Var.Y(new byte[Math.max(o0Var.b() * 2, this.f67296o)], 0);
        } else {
            this.f67288g.a0(0);
        }
        this.f67288g.Z(this.f67296o);
        sVar.readFully(this.f67288g.e(), 0, this.f67296o);
        return this.f67288g;
    }

    @m({"extractorOutput"})
    private boolean k(s sVar) throws IOException {
        if (!sVar.e(this.f67286e.e(), 0, 9, true)) {
            return false;
        }
        this.f67286e.a0(0);
        this.f67286e.b0(4);
        int iL = this.f67286e.L();
        boolean z10 = (iL & 4) != 0;
        boolean z11 = (iL & 1) != 0;
        if (z10 && this.f67299r == null) {
            this.f67299r = new a(this.f67290i.a(8, 1));
        }
        if (z11 && this.f67300s == null) {
            this.f67300s = new f(this.f67290i.a(9, 2));
        }
        this.f67290i.l();
        this.f67294m = this.f67286e.s() - 5;
        this.f67291j = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    @m({"extractorOutput"})
    private boolean l(s sVar) throws IOException {
        boolean zA;
        boolean z10;
        long j10;
        long jI = i();
        int i10 = this.f67295n;
        if (i10 == 8 && this.f67299r != null) {
            e();
            zA = this.f67299r.a(j(sVar), jI);
        } else {
            if (i10 != 9 || this.f67300s == null) {
                if (i10 != 18 || this.f67298q) {
                    sVar.o(this.f67296o);
                    zA = false;
                    z10 = false;
                } else {
                    zA = this.f67289h.a(j(sVar), jI);
                    long jE = this.f67289h.e();
                    if (jE != -9223372036854775807L) {
                        this.f67290i.u(new j0(this.f67289h.f(), this.f67289h.g(), jE));
                        this.f67298q = true;
                    }
                }
                if (!this.f67292k && zA) {
                    this.f67292k = true;
                    if (this.f67289h.e() == -9223372036854775807L) {
                        j10 = -this.f67297p;
                    } else {
                        j10 = 0;
                    }
                    this.f67293l = j10;
                }
                this.f67294m = 4;
                this.f67291j = 2;
                return z10;
            }
            e();
            zA = this.f67300s.a(j(sVar), jI);
        }
        z10 = true;
        if (!this.f67292k) {
            this.f67292k = true;
            if (this.f67289h.e() == -9223372036854775807L) {
                j10 = -this.f67297p;
            } else {
                j10 = 0;
            }
            this.f67293l = j10;
        }
        this.f67294m = 4;
        this.f67291j = 2;
        return z10;
    }

    private boolean m(s sVar) throws IOException {
        if (!sVar.e(this.f67287f.e(), 0, 11, true)) {
            return false;
        }
        this.f67287f.a0(0);
        this.f67295n = this.f67287f.L();
        this.f67296o = this.f67287f.O();
        this.f67297p = this.f67287f.O();
        this.f67297p = (((long) (this.f67287f.L() << 24)) | this.f67297p) * 1000;
        this.f67287f.b0(3);
        this.f67291j = 4;
        return true;
    }

    private void n(s sVar) throws IOException {
        sVar.o(this.f67294m);
        this.f67294m = 0;
        this.f67291j = 3;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f67291j = 1;
            this.f67292k = false;
        } else {
            this.f67291j = 3;
        }
        this.f67294m = 0;
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        androidx.media3.common.util.a.k(this.f67290i);
        while (true) {
            int i10 = this.f67291j;
            if (i10 != 1) {
                if (i10 == 2) {
                    n(sVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (l(sVar)) {
                        return 0;
                    }
                } else if (!m(sVar)) {
                    return -1;
                }
            } else if (!k(sVar)) {
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        sVar.i(this.f67285d.e(), 0, 3);
        this.f67285d.a0(0);
        if (this.f67285d.O() != D) {
            return false;
        }
        sVar.i(this.f67285d.e(), 0, 2);
        this.f67285d.a0(0);
        if ((this.f67285d.T() & 250) != 0) {
            return false;
        }
        sVar.i(this.f67285d.e(), 0, 4);
        this.f67285d.a0(0);
        int iS = this.f67285d.s();
        sVar.l();
        sVar.n(iS);
        sVar.i(this.f67285d.e(), 0, 4);
        this.f67285d.a0(0);
        return this.f67285d.s() == 0;
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f67290i = tVar;
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }
}
