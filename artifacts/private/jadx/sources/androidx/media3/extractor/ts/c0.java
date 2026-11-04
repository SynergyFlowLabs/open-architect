package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.w0;
import androidx.media3.common.v0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c0 implements androidx.media3.extractor.r {
    public static final int A = 240;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final androidx.media3.extractor.w f69010o = new androidx.media3.extractor.w() { // from class: androidx.media3.extractor.ts.b0
        @Override // androidx.media3.extractor.w
        public final androidx.media3.extractor.r[] c() {
            return c0.d();
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f69011p = 442;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f69012q = 443;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f69013r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f69014s = 441;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f69015t = 256;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f69016u = 1048576;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f69017v = 8192;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f69018w = 189;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f69019x = 192;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f69020y = 224;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f69021z = 224;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w0 f69022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<a> f69023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a0 f69025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f69026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f69027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f69029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private z f69030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.media3.extractor.t f69031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f69032n;

    private static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f69033i = 64;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f69034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w0 f69035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.common.util.n0 f69036c = new androidx.media3.common.util.n0(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f69037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f69038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f69039f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f69040g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f69041h;

        public a(m mVar, w0 w0Var) {
            this.f69034a = mVar;
            this.f69035b = w0Var;
        }

        private void b() {
            this.f69036c.s(8);
            this.f69037d = this.f69036c.g();
            this.f69038e = this.f69036c.g();
            this.f69036c.s(6);
            this.f69040g = this.f69036c.h(8);
        }

        private void c() {
            this.f69041h = 0L;
            if (this.f69037d) {
                this.f69036c.s(4);
                long jH = ((long) this.f69036c.h(3)) << 30;
                this.f69036c.s(1);
                long jH2 = jH | ((long) (this.f69036c.h(15) << 15));
                this.f69036c.s(1);
                long jH3 = jH2 | ((long) this.f69036c.h(15));
                this.f69036c.s(1);
                if (!this.f69039f && this.f69038e) {
                    this.f69036c.s(4);
                    long jH4 = ((long) this.f69036c.h(3)) << 30;
                    this.f69036c.s(1);
                    long jH5 = jH4 | ((long) (this.f69036c.h(15) << 15));
                    this.f69036c.s(1);
                    long jH6 = jH5 | ((long) this.f69036c.h(15));
                    this.f69036c.s(1);
                    this.f69035b.b(jH6);
                    this.f69039f = true;
                }
                this.f69041h = this.f69035b.b(jH3);
            }
        }

        public void a(androidx.media3.common.util.o0 o0Var) throws v0 {
            o0Var.n(this.f69036c.f61581a, 0, 3);
            this.f69036c.q(0);
            b();
            o0Var.n(this.f69036c.f61581a, 0, this.f69040g);
            this.f69036c.q(0);
            c();
            this.f69034a.c(this.f69041h, 4);
            this.f69034a.b(o0Var);
            this.f69034a.e(false);
        }

        public void d() {
            this.f69039f = false;
            this.f69034a.a();
        }
    }

    public c0() {
        this(new w0(0L));
    }

    public static /* synthetic */ androidx.media3.extractor.r[] d() {
        boolean z10 = true | false;
        return new androidx.media3.extractor.r[]{new c0()};
    }

    @il.m({"output"})
    private void e(long j10) {
        if (this.f69032n) {
            return;
        }
        this.f69032n = true;
        if (this.f69025g.c() == -9223372036854775807L) {
            this.f69031m.u(new androidx.media3.extractor.p0.b(this.f69025g.c()));
            return;
        }
        z zVar = new z(this.f69025g.d(), this.f69025g.c(), j10);
        this.f69030l = zVar;
        this.f69031m.u(zVar.b());
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        boolean z10 = this.f69022d.f() == -9223372036854775807L;
        if (!z10) {
            long jD = this.f69022d.d();
            z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
        }
        if (z10) {
            this.f69022d.i(j11);
        }
        z zVar = this.f69030l;
        if (zVar != null) {
            zVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f69023e.size(); i10++) {
            this.f69023e.valueAt(i10).d();
        }
    }

    @Override // androidx.media3.extractor.r
    public int f(androidx.media3.extractor.s sVar, androidx.media3.extractor.n0 n0Var) throws IOException {
        m nVar;
        androidx.media3.common.util.a.k(this.f69031m);
        long length = sVar.getLength();
        if (length != -1 && !this.f69025g.e()) {
            return this.f69025g.g(sVar, n0Var);
        }
        e(length);
        z zVar = this.f69030l;
        if (zVar != null && zVar.d()) {
            return this.f69030l.c(sVar, n0Var);
        }
        sVar.l();
        long jM = length != -1 ? length - sVar.m() : -1L;
        if ((jM != -1 && jM < 4) || !sVar.k(this.f69024f.e(), 0, 4, true)) {
            return -1;
        }
        this.f69024f.a0(0);
        int iS = this.f69024f.s();
        if (iS == f69014s) {
            return -1;
        }
        if (iS == f69011p) {
            sVar.i(this.f69024f.e(), 0, 10);
            this.f69024f.a0(9);
            sVar.o((this.f69024f.L() & 7) + 14);
            return 0;
        }
        if (iS == 443) {
            sVar.i(this.f69024f.e(), 0, 2);
            this.f69024f.a0(0);
            sVar.o(this.f69024f.T() + 6);
            return 0;
        }
        if (((iS & (-256)) >> 8) != 1) {
            sVar.o(1);
            return 0;
        }
        int i10 = iS & 255;
        a aVar = this.f69023e.get(i10);
        if (!this.f69026h) {
            if (aVar == null) {
                if (i10 == 189) {
                    nVar = new c(s0.f61335s);
                    this.f69027i = true;
                    this.f69029k = sVar.getPosition();
                } else if ((iS & 224) == 192) {
                    nVar = new t(s0.f61335s);
                    this.f69027i = true;
                    this.f69029k = sVar.getPosition();
                } else if ((iS & 240) == 224) {
                    nVar = new n(s0.f61335s);
                    this.f69028j = true;
                    this.f69029k = sVar.getPosition();
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    nVar.d(this.f69031m, new m0.e(i10, 256));
                    aVar = new a(nVar, this.f69022d);
                    this.f69023e.put(i10, aVar);
                }
            }
            if (sVar.getPosition() > ((this.f69027i && this.f69028j) ? this.f69029k + 8192 : 1048576L)) {
                this.f69026h = true;
                this.f69031m.l();
            }
        }
        sVar.i(this.f69024f.e(), 0, 2);
        this.f69024f.a0(0);
        int iT = this.f69024f.T() + 6;
        if (aVar == null) {
            sVar.o(iT);
        } else {
            this.f69024f.W(iT);
            sVar.readFully(this.f69024f.e(), 0, iT);
            this.f69024f.a0(6);
            aVar.a(this.f69024f);
            androidx.media3.common.util.o0 o0Var = this.f69024f;
            o0Var.Z(o0Var.b());
        }
        return 0;
    }

    @Override // androidx.media3.extractor.r
    public boolean g(androidx.media3.extractor.s sVar) throws IOException {
        byte[] bArr = new byte[14];
        sVar.i(bArr, 0, 14);
        if (f69011p == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & org.msgpack.core.h.a.f339273i) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            sVar.n(bArr[13] & 7);
            sVar.i(bArr, 0, 3);
            return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
        }
        return false;
    }

    @Override // androidx.media3.extractor.r
    public void h(androidx.media3.extractor.t tVar) {
        this.f69031m = tVar;
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }

    public c0(w0 w0Var) {
        this.f69022d = w0Var;
        this.f69024f = new androidx.media3.common.util.o0(4096);
        this.f69023e = new SparseArray<>();
        this.f69025g = new a0();
    }
}
