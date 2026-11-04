package androidx.media3.exoplayer.analytics;

import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.n4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class i4 implements androidx.media3.exoplayer.analytics.b, g4.a {
    private long A0;

    @androidx.annotation.p0
    private androidx.media3.common.w B0;

    @androidx.annotation.p0
    private androidx.media3.common.w C0;
    private n4 D0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final g4 f62963n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final Map<String, b> f62964o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final Map<String, androidx.media3.exoplayer.analytics.b.C0577b> f62965p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @androidx.annotation.p0
    private final a f62966q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final boolean f62967r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final androidx.media3.common.z3.b f62968s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private h4 f62969t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @androidx.annotation.p0
    private String f62970u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f62971v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f62972w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f62973x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @androidx.annotation.p0
    private Exception f62974y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private long f62975z0;

    public interface a {
        void a(androidx.media3.exoplayer.analytics.b.C0577b c0577b, h4 h4Var);
    }

    private static final class b {
        private long A;
        private long B;
        private long C;
        private long D;
        private long E;
        private int F;
        private int G;
        private int H;
        private long I;
        private boolean J;
        private boolean K;
        private boolean L;
        private boolean M;
        private boolean N;
        private long O;

        @androidx.annotation.p0
        private androidx.media3.common.w P;

        @androidx.annotation.p0
        private androidx.media3.common.w Q;
        private long R;
        private long S;
        private float T;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f62976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f62977b = new long[16];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<h4.c> f62978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<long[]> f62979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<h4.b> f62980e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<h4.b> f62981f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List<h4.a> f62982g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List<h4.a> f62983h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f62984i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f62985j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f62986k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f62987l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f62988m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f62989n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f62990o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f62991p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f62992q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f62993r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f62994s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f62995t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private long f62996u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private long f62997v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private long f62998w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private long f62999x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private long f63000y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private long f63001z;

        public b(boolean z10, androidx.media3.exoplayer.analytics.b.C0577b c0577b) {
            this.f62976a = z10;
            this.f62978c = z10 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.f62979d = z10 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.f62980e = z10 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.f62981f = z10 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.f62982g = z10 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.f62983h = z10 ? new ArrayList<>() : Collections.EMPTY_LIST;
            boolean z11 = false;
            this.H = 0;
            this.I = c0577b.f62838a;
            this.f62985j = -9223372036854775807L;
            this.f62993r = -9223372036854775807L;
            androidx.media3.exoplayer.source.t0.b bVar = c0577b.f62841d;
            if (bVar != null && bVar.c()) {
                z11 = true;
            }
            this.f62984i = z11;
            this.f62996u = -1L;
            this.f62995t = -1L;
            this.f62994s = -1;
            this.T = 1.0f;
        }

        private long[] b(long j10) {
            List<long[]> list = this.f62979d;
            long[] jArr = list.get(list.size() - 1);
            return new long[]{j10, jArr[1] + ((long) ((j10 - jArr[0]) * this.T))};
        }

        private static boolean c(int i10, int i11) {
            return ((i10 != 1 && i10 != 2 && i10 != 14) || i11 == 1 || i11 == 2 || i11 == 14 || i11 == 3 || i11 == 4 || i11 == 9 || i11 == 11) ? false : true;
        }

        private static boolean d(int i10) {
            if (i10 != 4 && i10 != 7) {
                return false;
            }
            return true;
        }

        private static boolean e(int i10) {
            return i10 == 3 || i10 == 4 || i10 == 9;
        }

        private static boolean f(int i10) {
            return i10 == 6 || i10 == 7 || i10 == 10;
        }

        private void g(long j10) {
            androidx.media3.common.w wVar;
            int i10;
            if (this.H == 3 && (wVar = this.Q) != null && (i10 = wVar.f61756j) != -1) {
                long j11 = (long) ((j10 - this.S) * this.T);
                this.f63001z += j11;
                this.A += j11 * ((long) i10);
            }
            this.S = j10;
        }

        private void h(long j10) {
            androidx.media3.common.w wVar;
            if (this.H == 3 && (wVar = this.P) != null) {
                long j11 = (long) ((j10 - this.R) * this.T);
                int i10 = wVar.f61769w;
                if (i10 != -1) {
                    this.f62997v += j11;
                    this.f62998w += ((long) i10) * j11;
                }
                int i11 = wVar.f61756j;
                if (i11 != -1) {
                    this.f62999x += j11;
                    this.f63000y += j11 * ((long) i11);
                }
            }
            this.R = j10;
        }

        private void i(androidx.media3.exoplayer.analytics.b.C0577b c0577b, @androidx.annotation.p0 androidx.media3.common.w wVar) {
            int i10;
            if (Objects.equals(this.Q, wVar)) {
                return;
            }
            g(c0577b.f62838a);
            if (wVar != null && this.f62996u == -1 && (i10 = wVar.f61756j) != -1) {
                this.f62996u = i10;
            }
            this.Q = wVar;
            if (this.f62976a) {
                this.f62981f.add(new h4.b(c0577b, wVar));
            }
        }

        private void j(long j10) {
            if (f(this.H)) {
                long j11 = j10 - this.O;
                long j12 = this.f62993r;
                if (j12 == -9223372036854775807L || j11 > j12) {
                    this.f62993r = j11;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:19:0x0058  */
        /* JADX WARN: Code duplicated, block: B:21:0x0060  */
        private void k(long j10, long j11) {
            if (this.f62976a) {
                if (this.H == 3) {
                    if (j11 != -9223372036854775807L) {
                        this.f62979d.add(new long[]{j10, j11});
                    } else if (!this.f62979d.isEmpty()) {
                        this.f62979d.add(b(j10));
                    }
                } else if (j11 != -9223372036854775807L) {
                    if (!this.f62979d.isEmpty()) {
                        List<long[]> list = this.f62979d;
                        long j12 = list.get(list.size() - 1)[1];
                        if (j12 != j11) {
                            this.f62979d.add(new long[]{j10, j12});
                        }
                    }
                    if (j11 != -9223372036854775807L) {
                        this.f62979d.add(new long[]{j10, j11});
                    } else if (!this.f62979d.isEmpty()) {
                        this.f62979d.add(b(j10));
                    }
                }
            }
        }

        private void l(androidx.media3.exoplayer.analytics.b.C0577b c0577b, @androidx.annotation.p0 androidx.media3.common.w wVar) {
            int i10;
            int i11;
            if (Objects.equals(this.P, wVar)) {
                return;
            }
            h(c0577b.f62838a);
            if (wVar != null) {
                if (this.f62994s == -1 && (i11 = wVar.f61769w) != -1) {
                    this.f62994s = i11;
                }
                if (this.f62995t == -1 && (i10 = wVar.f61756j) != -1) {
                    this.f62995t = i10;
                }
            }
            this.P = wVar;
            if (this.f62976a) {
                this.f62980e.add(new h4.b(c0577b, wVar));
            }
        }

        private int q(androidx.media3.common.z0 z0Var) {
            int iH = z0Var.H();
            if (this.J && this.K) {
                return 5;
            }
            if (this.M) {
                return 13;
            }
            if (!this.K) {
                return this.N ? 1 : 0;
            }
            if (this.L) {
                return 14;
            }
            if (iH == 4) {
                return 11;
            }
            if (iH != 2) {
                if (iH == 3) {
                    if (z0Var.J()) {
                        return z0Var.V1() != 0 ? 9 : 3;
                    }
                    return 4;
                }
                if (iH != 1 || this.H == 0) {
                    return this.H;
                }
                return 12;
            }
            int i10 = this.H;
            if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 14) {
                if (z0Var.J()) {
                    return z0Var.V1() != 0 ? 10 : 6;
                }
                return 7;
            }
            return 2;
        }

        private void r(int i10, androidx.media3.exoplayer.analytics.b.C0577b c0577b) {
            androidx.media3.common.util.a.a(c0577b.f62838a >= this.I);
            long j10 = c0577b.f62838a;
            long j11 = j10 - this.I;
            long[] jArr = this.f62977b;
            int i11 = this.H;
            jArr[i11] = jArr[i11] + j11;
            if (this.f62985j == -9223372036854775807L) {
                this.f62985j = j10;
            }
            this.f62988m |= c(i11, i10);
            this.f62986k |= e(i10);
            this.f62987l |= i10 == 11;
            if (!d(this.H) && d(i10)) {
                this.f62989n++;
            }
            if (i10 == 5) {
                this.f62991p++;
            }
            if (!f(this.H) && f(i10)) {
                this.f62992q++;
                this.O = c0577b.f62838a;
            }
            if (f(this.H) && this.H != 7 && i10 == 7) {
                this.f62990o++;
            }
            j(c0577b.f62838a);
            this.H = i10;
            this.I = c0577b.f62838a;
            if (this.f62976a) {
                this.f62978c.add(new h4.c(c0577b, i10));
            }
        }

        public h4 a(boolean z10) {
            long[] jArr;
            List<long[]> list;
            long[] jArr2 = this.f62977b;
            List<long[]> list2 = this.f62979d;
            if (z10) {
                jArr = jArr2;
                list = list2;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long[] jArrCopyOf = Arrays.copyOf(this.f62977b, 16);
                long jMax = Math.max(0L, jElapsedRealtime - this.I);
                int i10 = this.H;
                jArrCopyOf[i10] = jArrCopyOf[i10] + jMax;
                j(jElapsedRealtime);
                h(jElapsedRealtime);
                g(jElapsedRealtime);
                ArrayList arrayList = new ArrayList(this.f62979d);
                if (this.f62976a && this.H == 3) {
                    arrayList.add(b(jElapsedRealtime));
                }
                jArr = jArrCopyOf;
                list = arrayList;
            }
            int i11 = (this.f62988m || !this.f62986k) ? 1 : 0;
            long j10 = i11 != 0 ? -9223372036854775807L : jArr[2];
            int i12 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z10 ? this.f62980e : new ArrayList(this.f62980e);
            List arrayList3 = z10 ? this.f62981f : new ArrayList(this.f62981f);
            List arrayList4 = z10 ? this.f62978c : new ArrayList(this.f62978c);
            long j11 = this.f62985j;
            boolean z11 = this.K;
            int i13 = !this.f62986k ? 1 : 0;
            boolean z12 = this.f62987l;
            int i14 = i11 ^ 1;
            int i15 = this.f62989n;
            int i16 = this.f62990o;
            int i17 = this.f62991p;
            int i18 = this.f62992q;
            long j12 = this.f62993r;
            boolean z13 = this.f62984i;
            long j13 = this.f62997v;
            long j14 = this.f62998w;
            long j15 = this.f62999x;
            long j16 = this.f63000y;
            long j17 = this.f63001z;
            long j18 = this.A;
            int i19 = this.f62994s;
            int i20 = i19 == -1 ? 0 : 1;
            long j19 = this.f62995t;
            int i21 = j19 == -1 ? 0 : 1;
            long j20 = this.f62996u;
            int i22 = j20 == -1 ? 0 : 1;
            long j21 = this.B;
            long j22 = this.C;
            long j23 = this.D;
            long j24 = this.E;
            int i23 = this.F;
            return new h4(1, jArr, arrayList4, list, j11, z11 ? 1 : 0, i13, z12 ? 1 : 0, i12, j10, i14, i15, i16, i17, i18, j12, z13 ? 1 : 0, arrayList2, arrayList3, j13, j14, j15, j16, j17, j18, i20, i21, i19, j19, i22, j20, j21, j22, j23, j24, i23 > 0 ? 1 : 0, i23, this.G, this.f62982g, this.f62983h);
        }

        public void m(androidx.media3.common.z0 z0Var, androidx.media3.exoplayer.analytics.b.C0577b c0577b, boolean z10, long j10, boolean z11, int i10, boolean z12, boolean z13, @androidx.annotation.p0 androidx.media3.common.x0 x0Var, @androidx.annotation.p0 Exception exc, long j11, long j12, @androidx.annotation.p0 androidx.media3.common.w wVar, @androidx.annotation.p0 androidx.media3.common.w wVar2, @androidx.annotation.p0 n4 n4Var) {
            if (j10 != -9223372036854775807L) {
                k(c0577b.f62838a, j10);
                this.J = true;
            }
            if (z0Var.H() != 2) {
                this.J = false;
            }
            int iH = z0Var.H();
            if (iH == 1 || iH == 4 || z11) {
                this.L = false;
            }
            if (x0Var != null) {
                this.M = true;
                this.F++;
                if (this.f62976a) {
                    this.f62982g.add(new h4.a(c0577b, x0Var));
                }
            } else if (z0Var.a() == null) {
                this.M = false;
            }
            if (this.K && !this.L) {
                androidx.media3.common.i4 i4VarM0 = z0Var.M0();
                if (!i4VarM0.e(2)) {
                    l(c0577b, null);
                }
                if (!i4VarM0.e(1)) {
                    i(c0577b, null);
                }
            }
            if (wVar != null) {
                l(c0577b, wVar);
            }
            if (wVar2 != null) {
                i(c0577b, wVar2);
            }
            androidx.media3.common.w wVar3 = this.P;
            if (wVar3 != null && wVar3.f61769w == -1 && n4Var != null) {
                l(c0577b, wVar3.b().B0(n4Var.f60997a).d0(n4Var.f60998b).N());
            }
            if (z13) {
                this.N = true;
            }
            if (z12) {
                this.E++;
            }
            this.D += (long) i10;
            this.B += j11;
            this.C += j12;
            if (exc != null) {
                this.G++;
                if (this.f62976a) {
                    this.f62983h.add(new h4.a(c0577b, exc));
                }
            }
            int iQ = q(z0Var);
            float f10 = z0Var.c().f61874a;
            if (this.H != iQ || this.T != f10) {
                k(c0577b.f62838a, z10 ? c0577b.f62842e : -9223372036854775807L);
                h(c0577b.f62838a);
                g(c0577b.f62838a);
            }
            this.T = f10;
            if (this.H != iQ) {
                r(iQ, c0577b);
            }
        }

        public void n(androidx.media3.exoplayer.analytics.b.C0577b c0577b, boolean z10, long j10) {
            int i10 = 11;
            if (this.H != 11 && !z10) {
                i10 = 15;
            }
            k(c0577b.f62838a, j10);
            h(c0577b.f62838a);
            g(c0577b.f62838a);
            r(i10, c0577b);
        }

        public void o() {
            this.K = true;
        }

        public void p() {
            this.L = true;
            this.J = false;
        }
    }

    public i4(boolean z10, @androidx.annotation.p0 a aVar) {
        this.f62966q0 = aVar;
        this.f62967r0 = z10;
        y1 y1Var = new y1();
        this.f62963n0 = y1Var;
        this.f62964o0 = new HashMap();
        this.f62965p0 = new HashMap();
        this.f62969t0 = h4.f62925e0;
        this.f62968s0 = new androidx.media3.common.z3.b();
        this.D0 = n4.f60993h;
        y1Var.b(this);
    }

    private Pair<androidx.media3.exoplayer.analytics.b.C0577b, Boolean> D0(androidx.media3.exoplayer.analytics.b.c cVar, String str) {
        androidx.media3.exoplayer.source.t0.b bVar;
        androidx.media3.exoplayer.analytics.b.C0577b c0577b = null;
        boolean zF = false;
        for (int i10 = 0; i10 < cVar.e(); i10++) {
            androidx.media3.exoplayer.analytics.b.C0577b c0577bD = cVar.d(cVar.c(i10));
            boolean zF2 = this.f62963n0.f(c0577bD, str);
            if (c0577b == null || ((zF2 && !zF) || (zF2 == zF && c0577bD.f62838a > c0577b.f62838a))) {
                c0577b = c0577bD;
                zF = zF2;
            }
        }
        androidx.media3.common.util.a.g(c0577b);
        if (!zF && (bVar = c0577b.f62841d) != null && bVar.c()) {
            long jG = c0577b.f62839b.l(c0577b.f62841d.f65467a, this.f62968s0).g(c0577b.f62841d.f65468b);
            if (jG == Long.MIN_VALUE) {
                jG = this.f62968s0.f61970d;
            }
            long jQ = jG + this.f62968s0.q();
            long j10 = c0577b.f62838a;
            androidx.media3.common.z3 z3Var = c0577b.f62839b;
            int i11 = c0577b.f62840c;
            androidx.media3.exoplayer.source.t0.b bVar2 = c0577b.f62841d;
            androidx.media3.exoplayer.analytics.b.C0577b c0577b2 = new androidx.media3.exoplayer.analytics.b.C0577b(j10, z3Var, i11, new androidx.media3.exoplayer.source.t0.b(bVar2.f65467a, bVar2.f65470d, bVar2.f65468b), androidx.media3.common.util.k1.A2(jQ), c0577b.f62839b, c0577b.f62844g, c0577b.f62845h, c0577b.f62846i, c0577b.f62847j);
            zF = this.f62963n0.f(c0577b2, str);
            c0577b = c0577b2;
        }
        return Pair.create(c0577b, Boolean.valueOf(zF));
    }

    private boolean G0(androidx.media3.exoplayer.analytics.b.c cVar, String str, int i10) {
        return cVar.a(i10) && this.f62963n0.f(cVar.d(i10), str);
    }

    private void H0(androidx.media3.exoplayer.analytics.b.c cVar) {
        for (int i10 = 0; i10 < cVar.e(); i10++) {
            int iC = cVar.c(i10);
            androidx.media3.exoplayer.analytics.b.C0577b c0577bD = cVar.d(iC);
            if (iC == 0) {
                this.f62963n0.g(c0577bD);
            } else if (iC == 11) {
                this.f62963n0.c(c0577bD, this.f62972w0);
            } else {
                this.f62963n0.a(c0577bD);
            }
        }
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void B(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10, long j10) {
        this.f62973x0 = i10;
    }

    @Override // androidx.media3.exoplayer.analytics.g4.a
    public void B0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str) {
        ((b) androidx.media3.common.util.a.g(this.f62964o0.get(str))).o();
    }

    public h4 E0() {
        int i10 = 1;
        h4[] h4VarArr = new h4[this.f62964o0.size() + 1];
        h4VarArr[0] = this.f62969t0;
        Iterator<b> it = this.f62964o0.values().iterator();
        while (it.hasNext()) {
            h4VarArr[i10] = it.next().a(false);
            i10++;
        }
        return h4.W(h4VarArr);
    }

    @Override // androidx.media3.exoplayer.analytics.g4.a
    public void F(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str, boolean z10) {
        b bVar = (b) androidx.media3.common.util.a.g(this.f62964o0.remove(str));
        androidx.media3.exoplayer.analytics.b.C0577b c0577b2 = (androidx.media3.exoplayer.analytics.b.C0577b) androidx.media3.common.util.a.g(this.f62965p0.remove(str));
        bVar.n(c0577b, z10, str.equals(this.f62970u0) ? this.f62971v0 : -9223372036854775807L);
        h4 h4VarA = bVar.a(true);
        this.f62969t0 = h4.W(this.f62969t0, h4VarA);
        a aVar = this.f62966q0;
        if (aVar != null) {
            aVar.a(c0577b2, h4VarA);
        }
    }

    @androidx.annotation.p0
    public h4 F0() {
        String strD = this.f62963n0.d();
        b bVar = strD == null ? null : this.f62964o0.get(strD);
        if (bVar == null) {
            return null;
        }
        return bVar.a(false);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void G(androidx.media3.exoplayer.analytics.b.C0577b c0577b, n4 n4Var) {
        this.D0 = n4Var;
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void J(androidx.media3.exoplayer.analytics.b.C0577b c0577b, androidx.media3.exoplayer.source.h0 h0Var) {
        int i10 = h0Var.f65066b;
        if (i10 == 2 || i10 == 0) {
            this.B0 = h0Var.f65067c;
        } else if (i10 == 1) {
            this.C0 = h0Var.f65067c;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void K(androidx.media3.common.z0 z0Var, androidx.media3.exoplayer.analytics.b.c cVar) {
        if (cVar.e() == 0) {
            return;
        }
        H0(cVar);
        Iterator<String> it = this.f62964o0.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Pair<androidx.media3.exoplayer.analytics.b.C0577b, Boolean> pairD0 = D0(cVar, next);
            b bVar = this.f62964o0.get(next);
            boolean zG0 = G0(cVar, next, 11);
            boolean zG1 = G0(cVar, next, 1018);
            boolean zG2 = G0(cVar, next, 1011);
            boolean zG3 = G0(cVar, next, 1000);
            boolean zG4 = G0(cVar, next, 10);
            boolean z10 = G0(cVar, next, 1003) || G0(cVar, next, 1024);
            boolean zG5 = G0(cVar, next, 1006);
            boolean zG6 = G0(cVar, next, 1004);
            boolean zG7 = G0(cVar, next, 25);
            Iterator<String> it2 = it;
            bVar.m(z0Var, (androidx.media3.exoplayer.analytics.b.C0577b) pairD0.first, ((Boolean) pairD0.second).booleanValue(), next.equals(this.f62970u0) ? this.f62971v0 : -9223372036854775807L, zG0, zG1 ? this.f62973x0 : 0, zG2, zG3, zG4 ? z0Var.a() : null, z10 ? this.f62974y0 : null, zG5 ? this.f62975z0 : 0L, zG5 ? this.A0 : 0L, zG6 ? this.B0 : null, zG6 ? this.C0 : null, zG7 ? this.D0 : null);
            it = it2;
        }
        this.B0 = null;
        this.C0 = null;
        this.f62970u0 = null;
        if (cVar.a(androidx.media3.exoplayer.analytics.b.f62814h0)) {
            this.f62963n0.h(cVar.d(androidx.media3.exoplayer.analytics.b.f62814h0));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.g4.a
    public void a(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str, String str2) {
        ((b) androidx.media3.common.util.a.g(this.f62964o0.get(str))).p();
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void b0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, androidx.media3.common.z0.k kVar, androidx.media3.common.z0.k kVar2, int i10) {
        if (this.f62970u0 == null) {
            this.f62970u0 = this.f62963n0.d();
            this.f62971v0 = kVar.f61952g;
        }
        this.f62972w0 = i10;
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void f(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10, long j10, long j11) {
        this.f62975z0 = i10;
        this.A0 = j10;
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void f0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, androidx.media3.exoplayer.source.d0 d0Var, androidx.media3.exoplayer.source.h0 h0Var, IOException iOException, boolean z10) {
        this.f62974y0 = iOException;
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void k(androidx.media3.exoplayer.analytics.b.C0577b c0577b, Exception exc) {
        this.f62974y0 = exc;
    }

    @Override // androidx.media3.exoplayer.analytics.g4.a
    public void z0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str) {
        this.f62964o0.put(str, new b(this.f62967r0, c0577b));
        this.f62965p0.put(str, c0577b);
    }
}
