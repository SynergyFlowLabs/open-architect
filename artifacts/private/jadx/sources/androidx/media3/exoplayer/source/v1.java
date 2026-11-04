package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.b4;
import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.t3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class v1 extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f65485j = "SilenceMediaSource";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f65486k = 44100;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f65487l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f65488m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final androidx.media3.common.w f65489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final androidx.media3.common.k0 f65490o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f65491s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f65492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private androidx.media3.common.k0 f65493i;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f65494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f65495b;

        public v1 a() {
            androidx.media3.common.util.a.i(this.f65494a > 0);
            return new v1(this.f65494a, v1.f65490o.a().L(this.f65495b).a());
        }

        @z7.a
        public b b(@androidx.annotation.g0(from = 1) long j10) {
            this.f65494a = j10;
            return this;
        }

        @z7.a
        public b c(@androidx.annotation.p0 Object obj) {
            this.f65495b = obj;
            return this;
        }
    }

    private static final class c implements s0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final h2 f65496c = new h2(new b4(v1.f65489n));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f65497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<s1> f65498b = new ArrayList<>();

        public c(long j10) {
            this.f65497a = j10;
        }

        private long a(long j10) {
            return androidx.media3.common.util.k1.x(j10, 0L, this.f65497a);
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public long b() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public void c(long j10) {
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public boolean d() {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public long e() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.s0
        public long g(long j10, f5 f5Var) {
            return a(j10);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public long h(long j10) {
            long jA = a(j10);
            for (int i10 = 0; i10 < this.f65498b.size(); i10++) {
                ((d) this.f65498b.get(i10)).b(jA);
            }
            return jA;
        }

        @Override // androidx.media3.exoplayer.source.s0
        public long i() {
            return -9223372036854775807L;
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public boolean k(t3 t3Var) {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.s0
        public h2 m() {
            return f65496c;
        }

        @Override // androidx.media3.exoplayer.source.s0
        public void o() {
        }

        @Override // androidx.media3.exoplayer.source.s0
        public void p(long j10, boolean z10) {
        }

        @Override // androidx.media3.exoplayer.source.s0
        public long t(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
            long jA = a(j10);
            for (int i10 = 0; i10 < c0VarArr.length; i10++) {
                s1 s1Var = s1VarArr[i10];
                if (s1Var != null && (c0VarArr[i10] == null || !zArr[i10])) {
                    this.f65498b.remove(s1Var);
                    s1VarArr[i10] = null;
                }
                if (s1VarArr[i10] == null && c0VarArr[i10] != null) {
                    d dVar = new d(this.f65497a);
                    dVar.b(jA);
                    this.f65498b.add(dVar);
                    s1VarArr[i10] = dVar;
                    zArr2[i10] = true;
                }
            }
            return jA;
        }

        @Override // androidx.media3.exoplayer.source.s0
        public void v(s0.a aVar, long j10) {
            aVar.j(this);
        }
    }

    private static final class d implements s1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f65499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f65500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f65501c;

        public d(long j10) {
            this.f65499a = v1.z0(j10);
            b(0L);
        }

        @Override // androidx.media3.exoplayer.source.s1
        public void a() {
        }

        public void b(long j10) {
            this.f65501c = androidx.media3.common.util.k1.x(v1.z0(j10), 0L, this.f65499a);
        }

        @Override // androidx.media3.exoplayer.source.s1
        public boolean isReady() {
            return true;
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int l(long j10) {
            long j11 = this.f65501c;
            b(j10);
            return (int) ((this.f65501c - j11) / ((long) v1.f65491s.length));
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int r(p3 p3Var, androidx.media3.decoder.g gVar, int i10) {
            if (this.f65500b && (i10 & 2) == 0) {
                long j10 = this.f65499a;
                long j11 = this.f65501c;
                long j12 = j10 - j11;
                if (j12 == 0) {
                    gVar.c(4);
                    return -4;
                }
                gVar.f62702f = v1.A0(j11);
                gVar.c(1);
                int iMin = (int) Math.min(v1.f65491s.length, j12);
                if ((i10 & 4) == 0) {
                    gVar.E(iMin);
                    gVar.f62700d.put(v1.f65491s, 0, iMin);
                }
                if ((i10 & 1) == 0) {
                    this.f65501c += (long) iMin;
                }
                return -4;
            }
            p3Var.f64600b = v1.f65489n;
            this.f65500b = true;
            return -5;
        }
    }

    static {
        androidx.media3.common.w wVarN = new androidx.media3.common.w.b().u0("audio/raw").R(2).v0(44100).o0(2).N();
        f65489n = wVarN;
        f65490o = new androidx.media3.common.k0.c().E(f65485j).M(Uri.EMPTY).G(wVarN.f61761o).a();
        f65491s = new byte[androidx.media3.common.util.k1.E0(2, 2) * 1024];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long A0(long j10) {
        return ((j10 / ((long) androidx.media3.common.util.k1.E0(2, 2))) * 1000000) / 44100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long z0(long j10) {
        return ((long) androidx.media3.common.util.k1.E0(2, 2)) * ((j10 * 44100) / 1000000);
    }

    @Override // androidx.media3.exoplayer.source.t0
    public synchronized void K(androidx.media3.common.k0 k0Var) {
        this.f65493i = k0Var;
    }

    @Override // androidx.media3.exoplayer.source.t0
    public boolean O(androidx.media3.common.k0 k0Var) {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void a() {
    }

    @Override // androidx.media3.exoplayer.source.t0
    public synchronized androidx.media3.common.k0 g() {
        return this.f65493i;
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void j0(@androidx.annotation.p0 androidx.media3.datasource.r1 r1Var) {
        k0(new w1(this.f65492h, true, false, false, (Object) null, g()));
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void l0() {
    }

    @Override // androidx.media3.exoplayer.source.t0
    public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        return new c(this.f65492h);
    }

    public v1(long j10) {
        this(j10, f65490o);
    }

    private v1(long j10, androidx.media3.common.k0 k0Var) {
        androidx.media3.common.util.a.a(j10 >= 0);
        this.f65492h = j10;
        this.f65493i = k0Var;
    }
}
