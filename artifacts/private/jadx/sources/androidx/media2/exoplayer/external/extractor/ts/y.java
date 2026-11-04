package androidx.media2.exoplayer.external.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.k0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class y implements androidx.media2.exoplayer.external.extractor.i {
    public static final int A = 240;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final androidx.media2.exoplayer.external.extractor.l f55129o = x.f55128a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f55130p = 442;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f55131q = 443;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f55132r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f55133s = 441;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f55134t = 256;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f55135u = 1048576;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f55136v = 8192;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f55137w = 189;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f55138x = 192;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f55139y = 224;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f55140z = 224;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k0 f55141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<a> f55142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f55143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f55144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f55145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f55146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f55147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f55148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v f55149l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.k f55150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f55151n;

    private static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f55152i = 64;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f55153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k0 f55154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.util.w f55155c = new androidx.media2.exoplayer.external.util.w(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f55156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f55157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f55158f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f55159g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f55160h;

        public a(m pesPayloadReader, k0 timestampAdjuster) {
            this.f55153a = pesPayloadReader;
            this.f55154b = timestampAdjuster;
        }

        private void b() {
            this.f55155c.p(8);
            this.f55156d = this.f55155c.g();
            this.f55157e = this.f55155c.g();
            this.f55155c.p(6);
            this.f55159g = this.f55155c.h(8);
        }

        private void c() {
            this.f55160h = 0L;
            if (this.f55156d) {
                this.f55155c.p(4);
                long jH = ((long) this.f55155c.h(3)) << 30;
                this.f55155c.p(1);
                long jH2 = jH | ((long) (this.f55155c.h(15) << 15));
                this.f55155c.p(1);
                long jH3 = jH2 | ((long) this.f55155c.h(15));
                this.f55155c.p(1);
                if (!this.f55158f && this.f55157e) {
                    this.f55155c.p(4);
                    long jH4 = ((long) this.f55155c.h(3)) << 30;
                    this.f55155c.p(1);
                    long jH5 = jH4 | ((long) (this.f55155c.h(15) << 15));
                    this.f55155c.p(1);
                    long jH6 = jH5 | ((long) this.f55155c.h(15));
                    this.f55155c.p(1);
                    this.f55154b.b(jH6);
                    this.f55158f = true;
                }
                this.f55160h = this.f55154b.b(jH3);
            }
        }

        public void a(androidx.media2.exoplayer.external.util.x data) throws androidx.media2.exoplayer.external.k0 {
            data.i(this.f55155c.f57716a, 0, 3);
            this.f55155c.n(0);
            b();
            data.i(this.f55155c.f57716a, 0, this.f55159g);
            this.f55155c.n(0);
            c();
            this.f55153a.c(this.f55160h, 4);
            this.f55153a.d(data);
            this.f55153a.f();
        }

        public void d() {
            this.f55158f = false;
            this.f55153a.a();
        }
    }

    public y() {
        this(new k0(0L));
    }

    static final /* synthetic */ androidx.media2.exoplayer.external.extractor.i[] d() {
        return new androidx.media2.exoplayer.external.extractor.i[]{new y()};
    }

    private void e(long inputLength) {
        if (!this.f55151n) {
            this.f55151n = true;
            if (this.f55144g.c() != -9223372036854775807L) {
                v vVar = new v(this.f55144g.d(), this.f55144g.c(), inputLength);
                this.f55149l = vVar;
                this.f55150m.q(vVar.b());
                return;
            }
            this.f55150m.q(new androidx.media2.exoplayer.external.extractor.q.b(this.f55144g.c()));
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void a(long position, long timeUs) {
        if (this.f55141d.e() == -9223372036854775807L || (this.f55141d.c() != 0 && this.f55141d.c() != timeUs)) {
            this.f55141d.g();
            this.f55141d.h(timeUs);
        }
        v vVar = this.f55149l;
        if (vVar != null) {
            vVar.h(timeUs);
        }
        for (int i10 = 0; i10 < this.f55142e.size(); i10++) {
            this.f55142e.valueAt(i10).d();
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public boolean b(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        byte[] bArr = new byte[14];
        input.i(bArr, 0, 14);
        if (f55130p == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & org.msgpack.core.h.a.f339273i) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            input.n(bArr[13] & 7);
            input.i(bArr, 0, 3);
            return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
        }
        return false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void c(androidx.media2.exoplayer.external.extractor.k output) {
        this.f55150m = output;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public int f(androidx.media2.exoplayer.external.extractor.j input, androidx.media2.exoplayer.external.extractor.p seekPosition) throws InterruptedException, IOException {
        long length = input.getLength();
        if (length != -1 && !this.f55144g.e()) {
            return this.f55144g.g(input, seekPosition);
        }
        e(length);
        v vVar = this.f55149l;
        m nVar = null;
        if (vVar != null && vVar.d()) {
            return this.f55149l.c(input, seekPosition, null);
        }
        input.l();
        long jM = length != -1 ? length - input.m() : -1L;
        if (jM != -1 && jM < 4) {
            return -1;
        }
        boolean z10 = true & false;
        if (!input.k(this.f55143f.f57720a, 0, 4, true)) {
            return -1;
        }
        this.f55143f.Q(0);
        int iL = this.f55143f.l();
        if (iL == f55133s) {
            return -1;
        }
        if (iL == f55130p) {
            input.i(this.f55143f.f57720a, 0, 10);
            this.f55143f.Q(9);
            input.o((this.f55143f.D() & 7) + 14);
            return 0;
        }
        if (iL == 443) {
            input.i(this.f55143f.f57720a, 0, 2);
            this.f55143f.Q(0);
            input.o(this.f55143f.J() + 6);
            return 0;
        }
        if (((iL & (-256)) >> 8) != 1) {
            input.o(1);
            return 0;
        }
        int i10 = iL & 255;
        a aVar = this.f55142e.get(i10);
        if (!this.f55145h) {
            if (aVar == null) {
                if (i10 == 189) {
                    nVar = new c();
                    this.f55146i = true;
                    this.f55148k = input.getPosition();
                } else if ((iL & 224) == 192) {
                    nVar = new s();
                    this.f55146i = true;
                    this.f55148k = input.getPosition();
                } else if ((iL & 240) == 224) {
                    nVar = new n();
                    this.f55147j = true;
                    this.f55148k = input.getPosition();
                }
                if (nVar != null) {
                    nVar.e(this.f55150m, new h0.e(i10, 256));
                    aVar = new a(nVar, this.f55141d);
                    this.f55142e.put(i10, aVar);
                }
            }
            if (input.getPosition() > ((this.f55146i && this.f55147j) ? this.f55148k + 8192 : 1048576L)) {
                this.f55145h = true;
                this.f55150m.l();
            }
        }
        input.i(this.f55143f.f57720a, 0, 2);
        this.f55143f.Q(0);
        int iJ = this.f55143f.J() + 6;
        if (aVar == null) {
            input.o(iJ);
        } else {
            this.f55143f.M(iJ);
            input.readFully(this.f55143f.f57720a, 0, iJ);
            this.f55143f.Q(6);
            aVar.a(this.f55143f);
            androidx.media2.exoplayer.external.util.x xVar = this.f55143f;
            xVar.P(xVar.b());
        }
        return 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void release() {
    }

    public y(k0 timestampAdjuster) {
        this.f55141d = timestampAdjuster;
        this.f55143f = new androidx.media2.exoplayer.external.util.x(4096);
        this.f55142e = new SparseArray<>();
        this.f55144g = new w();
    }
}
