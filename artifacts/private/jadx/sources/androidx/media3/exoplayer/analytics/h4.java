package androidx.media3.exoplayer.analytics;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class h4 {
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 3;
    public static final int S = 4;
    public static final int T = 5;
    public static final int U = 6;
    public static final int V = 7;
    public static final int W = 9;
    public static final int X = 10;
    public static final int Y = 11;
    public static final int Z = 12;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f62921a0 = 13;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f62922b0 = 14;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f62923c0 = 15;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    static final int f62924d0 = 16;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h4 f62925e0 = W(new h4[0]);
    public final int A;
    public final long B;
    public final int C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final int I;
    public final int J;
    public final int K;
    public final List<a> L;
    public final List<a> M;
    private final long[] N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f62927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<long[]> f62928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f62929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f62930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f62931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f62932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f62933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f62934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f62935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f62936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f62937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f62938m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f62939n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f62940o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f62941p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<b> f62942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<b> f62943r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f62944s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f62945t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f62946u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f62947v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f62948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f62949x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f62950y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f62951z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.analytics.b.C0577b f62952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Exception f62953b;

        public a(androidx.media3.exoplayer.analytics.b.C0577b c0577b, Exception exc) {
            this.f62952a = c0577b;
            this.f62953b = exc;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f62952a.equals(aVar.f62952a)) {
                    return this.f62953b.equals(aVar.f62953b);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (this.f62952a.hashCode() * 31) + this.f62953b.hashCode();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.analytics.b.C0577b f62954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final androidx.media3.common.w f62955b;

        public b(androidx.media3.exoplayer.analytics.b.C0577b c0577b, @androidx.annotation.p0 androidx.media3.common.w wVar) {
            this.f62954a = c0577b;
            this.f62955b = wVar;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (!this.f62954a.equals(bVar.f62954a)) {
                    return false;
                }
                androidx.media3.common.w wVar = this.f62955b;
                if (wVar != null) {
                    return wVar.equals(bVar.f62955b);
                }
                if (bVar.f62955b == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = this.f62954a.hashCode() * 31;
            androidx.media3.common.w wVar = this.f62955b;
            return iHashCode + (wVar != null ? wVar.hashCode() : 0);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.analytics.b.C0577b f62956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62957b;

        public c(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10) {
            this.f62956a = c0577b;
            this.f62957b = i10;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f62957b != cVar.f62957b) {
                return false;
            }
            return this.f62956a.equals(cVar.f62956a);
        }

        public int hashCode() {
            return (this.f62956a.hashCode() * 31) + this.f62957b;
        }
    }

    h4(int i10, long[] jArr, List<c> list, List<long[]> list2, long j10, int i11, int i12, int i13, int i14, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, List<b> list3, List<b> list4, long j13, long j14, long j15, long j16, long j17, long j18, int i21, int i22, int i23, long j19, int i24, long j20, long j21, long j22, long j23, long j24, int i25, int i26, int i27, List<a> list5, List<a> list6) {
        this.f62926a = i10;
        this.N = jArr;
        this.f62927b = Collections.unmodifiableList(list);
        this.f62928c = Collections.unmodifiableList(list2);
        this.f62929d = j10;
        this.f62930e = i11;
        this.f62931f = i12;
        this.f62932g = i13;
        this.f62933h = i14;
        this.f62934i = j11;
        this.f62935j = i15;
        this.f62936k = i16;
        this.f62937l = i17;
        this.f62938m = i18;
        this.f62939n = i19;
        this.f62940o = j12;
        this.f62941p = i20;
        this.f62942q = Collections.unmodifiableList(list3);
        this.f62943r = Collections.unmodifiableList(list4);
        this.f62944s = j13;
        this.f62945t = j14;
        this.f62946u = j15;
        this.f62947v = j16;
        this.f62948w = j17;
        this.f62949x = j18;
        this.f62950y = i21;
        this.f62951z = i22;
        this.A = i23;
        this.B = j19;
        this.C = i24;
        this.D = j20;
        this.E = j21;
        this.F = j22;
        this.G = j23;
        this.H = j24;
        this.I = i25;
        this.J = i26;
        this.K = i27;
        this.L = Collections.unmodifiableList(list5);
        this.M = Collections.unmodifiableList(list6);
    }

    public static h4 W(h4... h4VarArr) {
        int i10;
        h4[] h4VarArr2 = h4VarArr;
        long[] jArr = new long[16];
        int length = h4VarArr2.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = -1;
        long j21 = -1;
        long jMax = -9223372036854775807L;
        long jMin = -9223372036854775807L;
        long j22 = -9223372036854775807L;
        int i25 = -1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (i26 < length) {
            h4 h4Var = h4VarArr2[i26];
            i11 += h4Var.f62926a;
            for (int i30 = 0; i30 < 16; i30++) {
                jArr[i30] = jArr[i30] + h4Var.N[i30];
            }
            if (jMin == -9223372036854775807L) {
                jMin = h4Var.f62929d;
            } else {
                long j23 = h4Var.f62929d;
                if (j23 != -9223372036854775807L) {
                    jMin = Math.min(jMin, j23);
                }
            }
            i27 += h4Var.f62930e;
            i28 += h4Var.f62931f;
            i29 += h4Var.f62932g;
            i12 += h4Var.f62933h;
            if (j22 == -9223372036854775807L) {
                j22 = h4Var.f62934i;
            } else {
                long j24 = h4Var.f62934i;
                if (j24 != -9223372036854775807L) {
                    j22 += j24;
                }
            }
            i13 += h4Var.f62935j;
            i14 += h4Var.f62936k;
            i15 += h4Var.f62937l;
            i16 += h4Var.f62938m;
            i17 += h4Var.f62939n;
            if (jMax == -9223372036854775807L) {
                jMax = h4Var.f62940o;
            } else {
                long j25 = h4Var.f62940o;
                if (j25 != -9223372036854775807L) {
                    jMax = Math.max(jMax, j25);
                }
            }
            i18 += h4Var.f62941p;
            j10 += h4Var.f62944s;
            j11 += h4Var.f62945t;
            j12 += h4Var.f62946u;
            j13 += h4Var.f62947v;
            j14 += h4Var.f62948w;
            j15 += h4Var.f62949x;
            i19 += h4Var.f62950y;
            i20 += h4Var.f62951z;
            int i31 = i25;
            if (i31 == -1) {
                i25 = h4Var.A;
            } else {
                i25 = i31;
                int i32 = h4Var.A;
                if (i32 != -1) {
                    i25 += i32;
                }
            }
            if (j20 == -1) {
                i10 = length;
                j20 = h4Var.B;
            } else {
                i10 = length;
                long j26 = h4Var.B;
                if (j26 != -1) {
                    j20 += j26;
                }
            }
            i21 += h4Var.C;
            if (j21 == -1) {
                j21 = h4Var.D;
            } else {
                long j27 = h4Var.D;
                if (j27 != -1) {
                    j21 += j27;
                }
            }
            j16 += h4Var.E;
            j17 += h4Var.F;
            j18 += h4Var.G;
            j19 += h4Var.H;
            i22 += h4Var.I;
            i23 += h4Var.J;
            i24 += h4Var.K;
            i26++;
            length = i10;
            h4VarArr2 = h4VarArr;
        }
        long j28 = jMin;
        long j29 = jMax;
        List list = Collections.EMPTY_LIST;
        return new h4(i11, jArr, list, list, j28, i27, i28, i29, i12, j22, i13, i14, i15, i16, i17, j29, i18, list, list, j10, j11, j12, j13, j14, j15, i19, i20, i25, j20, i21, j21, j16, j17, j18, j19, i22, i23, i24, list, list);
    }

    public float A() {
        return 1.0f / e();
    }

    public float B() {
        return 1.0f / H();
    }

    public float C() {
        return 1.0f / K();
    }

    public int D() {
        long j10 = this.f62946u;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.f62947v / j10);
    }

    public int E() {
        long j10 = this.f62944s;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.f62945t / j10);
    }

    public long F() {
        if (this.f62930e == 0) {
            return -9223372036854775807L;
        }
        return U() / ((long) this.f62930e);
    }

    public long G(long j10) {
        if (this.f62928c.isEmpty()) {
            return -9223372036854775807L;
        }
        int i10 = 0;
        while (i10 < this.f62928c.size() && this.f62928c.get(i10)[0] <= j10) {
            i10++;
        }
        if (i10 == 0) {
            return this.f62928c.get(0)[1];
        }
        if (i10 == this.f62928c.size()) {
            List<long[]> list = this.f62928c;
            return list.get(list.size() - 1)[1];
        }
        int i11 = i10 - 1;
        long j11 = this.f62928c.get(i11)[0];
        long j12 = this.f62928c.get(i11)[1];
        long j13 = this.f62928c.get(i10)[0];
        long j14 = this.f62928c.get(i10)[1];
        long j15 = j13 - j11;
        if (j15 == 0) {
            return j12;
        }
        return j12 + ((long) ((j14 - j12) * ((j10 - j11) / j15)));
    }

    public float H() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.K * 1000.0f) / jR;
    }

    public int I(long j10) {
        int i10 = 0;
        for (c cVar : this.f62927b) {
            if (cVar.f62956a.f62838a > j10) {
                break;
            }
            i10 = cVar.f62957b;
        }
        return i10;
    }

    public long J(int i10) {
        return this.N[i10];
    }

    public float K() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.f62939n * 1000.0f) / jR;
    }

    public float L() {
        long jQ = Q();
        if (jQ == 0) {
            return 0.0f;
        }
        return S() / jQ;
    }

    public float M() {
        long jQ = Q();
        if (jQ == 0) {
            return 0.0f;
        }
        return T() / jQ;
    }

    public long N() {
        long j10 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            j10 += this.N[i10];
        }
        return j10;
    }

    public long O() {
        return J(2);
    }

    public long P() {
        return J(4) + J(7);
    }

    public long Q() {
        return R() + U();
    }

    public long R() {
        return J(3);
    }

    public long S() {
        return J(6);
    }

    public long T() {
        return J(5);
    }

    public long U() {
        return J(2) + J(6) + J(5);
    }

    public float V() {
        long jQ = Q();
        if (jQ == 0) {
            return 0.0f;
        }
        return U() / jQ;
    }

    public float a() {
        int i10 = this.f62931f;
        int i11 = this.f62926a;
        int i12 = this.f62930e;
        int i13 = i10 - (i11 - i12);
        if (i12 == 0) {
            return 0.0f;
        }
        return i13 / i12;
    }

    public float b() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.H * 1000.0f) / jR;
    }

    public float c() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.G * 1000.0f) / jR;
    }

    public float d() {
        int i10 = this.f62930e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f62932g / i10;
    }

    public float e() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.J * 1000.0f) / jR;
    }

    public float f() {
        int i10 = this.f62930e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.I / i10;
    }

    public float g() {
        long jQ = Q();
        if (jQ == 0) {
            return 0.0f;
        }
        return O() / jQ;
    }

    public int h() {
        long j10 = this.f62948w;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.f62949x / j10);
    }

    public int i() {
        long j10 = this.E;
        if (j10 == 0) {
            return -1;
        }
        return (int) ((this.F * 8000) / j10);
    }

    public long j() {
        if (this.f62926a == 0) {
            return -9223372036854775807L;
        }
        return N() / ((long) this.f62926a);
    }

    public int k() {
        int i10 = this.C;
        if (i10 == 0) {
            return -1;
        }
        return (int) (this.D / ((long) i10));
    }

    public int l() {
        int i10 = this.f62951z;
        if (i10 == 0) {
            return -1;
        }
        return (int) (this.B / ((long) i10));
    }

    public int m() {
        int i10 = this.f62950y;
        if (i10 == 0) {
            return -1;
        }
        return this.A / i10;
    }

    public long n() {
        int i10 = this.f62935j;
        if (i10 == 0) {
            return -9223372036854775807L;
        }
        return this.f62934i / ((long) i10);
    }

    public float o() {
        int i10 = this.f62930e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.K / i10;
    }

    public float p() {
        int i10 = this.f62930e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f62937l / i10;
    }

    public float q() {
        int i10 = this.f62930e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f62936k / i10;
    }

    public long r() {
        if (this.f62930e == 0) {
            return -9223372036854775807L;
        }
        return P() / ((long) this.f62930e);
    }

    public long s() {
        if (this.f62930e == 0) {
            return -9223372036854775807L;
        }
        return Q() / ((long) this.f62930e);
    }

    public long t() {
        if (this.f62930e == 0) {
            return -9223372036854775807L;
        }
        return R() / ((long) this.f62930e);
    }

    public float u() {
        int i10 = this.f62930e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f62939n / i10;
    }

    public long v() {
        if (this.f62930e == 0) {
            return -9223372036854775807L;
        }
        return S() / ((long) this.f62930e);
    }

    public float w() {
        int i10 = this.f62930e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f62938m / i10;
    }

    public long x() {
        if (this.f62930e == 0) {
            return -9223372036854775807L;
        }
        return T() / ((long) this.f62930e);
    }

    public long y() {
        if (this.f62939n == 0) {
            return -9223372036854775807L;
        }
        return (J(6) + J(7)) / ((long) this.f62939n);
    }

    public long z() {
        if (this.f62938m == 0) {
            return -9223372036854775807L;
        }
        return T() / ((long) this.f62938m);
    }
}
