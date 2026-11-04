package androidx.media3.exoplayer.source;

import androidx.media3.common.b4;
import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.t3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class x1 implements s0, androidx.media3.exoplayer.upstream.o.b<c> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f65526o = "SingleSampleMediaPeriod";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f65527s = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.x f65528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.p.a f65529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final androidx.media3.datasource.r1 f65530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.m f65531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b1.a f65532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h2 f65533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f65534g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f65535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final androidx.media3.exoplayer.upstream.o f65536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final androidx.media3.common.w f65537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f65538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f65539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    byte[] f65540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f65541n;

    private final class b implements s1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f65542d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f65543e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f65544f = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f65545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f65546b;

        private b() {
        }

        private void b() {
            if (!this.f65546b) {
                x1.this.f65532e.j(androidx.media3.common.s0.m(x1.this.f65537j.f61761o), x1.this.f65537j, 0, null, 0L);
                this.f65546b = true;
            }
        }

        @Override // androidx.media3.exoplayer.source.s1
        public void a() throws IOException {
            x1 x1Var = x1.this;
            if (x1Var.f65538k) {
                return;
            }
            x1Var.f65536i.a();
        }

        public void c() {
            if (this.f65545a == 2) {
                this.f65545a = 1;
            }
        }

        @Override // androidx.media3.exoplayer.source.s1
        public boolean isReady() {
            return x1.this.f65539l;
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int l(long j10) {
            b();
            if (j10 <= 0 || this.f65545a == 2) {
                return 0;
            }
            this.f65545a = 2;
            return 1;
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int r(p3 p3Var, androidx.media3.decoder.g gVar, int i10) {
            b();
            x1 x1Var = x1.this;
            boolean z10 = x1Var.f65539l;
            if (z10 && x1Var.f65540m == null) {
                this.f65545a = 2;
            }
            int i11 = this.f65545a;
            if (i11 == 2) {
                int i12 = 2 & 4;
                gVar.c(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                p3Var.f64600b = x1Var.f65537j;
                this.f65545a = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            androidx.media3.common.util.a.g(x1Var.f65540m);
            gVar.c(1);
            gVar.f62702f = 0L;
            if ((i10 & 4) == 0) {
                gVar.E(x1.this.f65541n);
                ByteBuffer byteBuffer = gVar.f62700d;
                x1 x1Var2 = x1.this;
                byteBuffer.put(x1Var2.f65540m, 0, x1Var2.f65541n);
            }
            if ((i10 & 1) == 0) {
                this.f65545a = 2;
            }
            return -4;
        }
    }

    static final class c implements androidx.media3.exoplayer.upstream.o.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f65548a = d0.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.datasource.x f65549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.datasource.p1 f65550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private byte[] f65551d;

        public c(androidx.media3.datasource.x xVar, androidx.media3.datasource.p pVar) {
            this.f65549b = xVar;
            this.f65550c = new androidx.media3.datasource.p1(pVar);
        }

        @Override // androidx.media3.exoplayer.upstream.o.e
        public void a() throws IOException {
            this.f65550c.x();
            try {
                this.f65550c.c(this.f65549b);
                int i10 = 0;
                while (i10 != -1) {
                    int iU = (int) this.f65550c.u();
                    byte[] bArr = this.f65551d;
                    if (bArr == null) {
                        this.f65551d = new byte[1024];
                    } else if (iU == bArr.length) {
                        this.f65551d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    androidx.media3.datasource.p1 p1Var = this.f65550c;
                    byte[] bArr2 = this.f65551d;
                    i10 = p1Var.read(bArr2, iU, bArr2.length - iU);
                }
                androidx.media3.datasource.w.a(this.f65550c);
            } catch (Throwable th2) {
                androidx.media3.datasource.w.a(this.f65550c);
                throw th2;
            }
        }

        @Override // androidx.media3.exoplayer.upstream.o.e
        public void b() {
        }
    }

    public x1(androidx.media3.datasource.x xVar, androidx.media3.datasource.p.a aVar, @androidx.annotation.p0 androidx.media3.datasource.r1 r1Var, androidx.media3.common.w wVar, long j10, androidx.media3.exoplayer.upstream.m mVar, b1.a aVar2, boolean z10, @androidx.annotation.p0 androidx.media3.exoplayer.util.c cVar) {
        this.f65528a = xVar;
        this.f65529b = aVar;
        this.f65530c = r1Var;
        this.f65537j = wVar;
        this.f65535h = j10;
        this.f65531d = mVar;
        this.f65532e = aVar2;
        this.f65538k = z10;
        this.f65533f = new h2(new b4(wVar));
        this.f65536i = cVar != null ? new androidx.media3.exoplayer.upstream.o(cVar) : new androidx.media3.exoplayer.upstream.o(f65526o);
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long b() {
        return this.f65539l ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public void c(long j10) {
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean d() {
        return this.f65536i.k();
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long e() {
        return (this.f65539l || this.f65536i.k()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long g(long j10, f5 f5Var) {
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long h(long j10) {
        for (int i10 = 0; i10 < this.f65534g.size(); i10++) {
            this.f65534g.get(i10).c();
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long i() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.upstream.o.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void s(c cVar, long j10, long j11, boolean z10) {
        androidx.media3.datasource.p1 p1Var = cVar.f65550c;
        d0 d0Var = new d0(cVar.f65548a, cVar.f65549b, p1Var.v(), p1Var.w(), j10, j11, p1Var.u());
        this.f65531d.b(cVar.f65548a);
        this.f65532e.m(d0Var, 1, -1, null, 0, null, 0L, this.f65535h);
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean k(t3 t3Var) {
        if (this.f65539l || this.f65536i.k() || this.f65536i.j()) {
            return false;
        }
        androidx.media3.datasource.p pVarA = this.f65529b.a();
        androidx.media3.datasource.r1 r1Var = this.f65530c;
        if (r1Var != null) {
            pVarA.s(r1Var);
        }
        this.f65536i.n(new c(this.f65528a, pVarA), this, this.f65531d.a(1));
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.o.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void w(c cVar, long j10, long j11) {
        this.f65541n = (int) cVar.f65550c.u();
        this.f65540m = (byte[]) androidx.media3.common.util.a.g(cVar.f65551d);
        this.f65539l = true;
        androidx.media3.datasource.p1 p1Var = cVar.f65550c;
        d0 d0Var = new d0(cVar.f65548a, cVar.f65549b, p1Var.v(), p1Var.w(), j10, j11, this.f65541n);
        this.f65531d.b(cVar.f65548a);
        this.f65532e.p(d0Var, 1, -1, this.f65537j, 0, null, 0L, this.f65535h);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public h2 m() {
        return this.f65533f;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void o() {
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void p(long j10, boolean z10) {
    }

    @Override // androidx.media3.exoplayer.upstream.o.b
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public androidx.media3.exoplayer.upstream.o.c n(c cVar, long j10, long j11, IOException iOException, int i10) {
        androidx.media3.exoplayer.upstream.o.c cVarI;
        androidx.media3.datasource.p1 p1Var = cVar.f65550c;
        d0 d0Var = new d0(cVar.f65548a, cVar.f65549b, p1Var.v(), p1Var.w(), j10, j11, p1Var.u());
        long jD = this.f65531d.d(new androidx.media3.exoplayer.upstream.m.d(d0Var, new h0(1, -1, this.f65537j, 0, null, 0L, androidx.media3.common.util.k1.A2(this.f65535h)), iOException, i10));
        boolean z10 = jD == -9223372036854775807L || i10 >= this.f65531d.a(1);
        if (this.f65538k && z10) {
            androidx.media3.common.util.z.o(f65526o, "Loading failed, treating as end-of-stream.", iOException);
            this.f65539l = true;
            cVarI = androidx.media3.exoplayer.upstream.o.f66130k;
        } else {
            cVarI = jD != -9223372036854775807L ? androidx.media3.exoplayer.upstream.o.i(false, jD) : androidx.media3.exoplayer.upstream.o.f66131l;
        }
        androidx.media3.exoplayer.upstream.o.c cVar2 = cVarI;
        boolean zC = cVar2.c();
        this.f65532e.r(d0Var, 1, -1, this.f65537j, 0, null, 0L, this.f65535h, iOException, !zC);
        if (!zC) {
            this.f65531d.b(cVar.f65548a);
        }
        return cVar2;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long t(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < c0VarArr.length; i10++) {
            s1 s1Var = s1VarArr[i10];
            if (s1Var != null && (c0VarArr[i10] == null || !zArr[i10])) {
                this.f65534g.remove(s1Var);
                s1VarArr[i10] = null;
            }
            if (s1VarArr[i10] == null && c0VarArr[i10] != null) {
                b bVar = new b();
                this.f65534g.add(bVar);
                s1VarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.upstream.o.b
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void q(c cVar, long j10, long j11, int i10) {
        androidx.media3.datasource.p1 p1Var = cVar.f65550c;
        this.f65532e.x(i10 == 0 ? new d0(cVar.f65548a, cVar.f65549b, j10) : new d0(cVar.f65548a, cVar.f65549b, p1Var.v(), p1Var.w(), j10, j11, p1Var.u()), 1, -1, this.f65537j, 0, null, 0L, this.f65535h, i10);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void v(s0.a aVar, long j10) {
        aVar.j(this);
    }

    public void x() {
        this.f65536i.l();
    }
}
