package androidx.media3.exoplayer;

import android.util.Pair;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class c4 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f63520s = 1000000000000L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f63521t = 100;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final int f63522u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final int f63523v = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.exoplayer.analytics.a f63526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.common.util.u f63527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z3.a f63528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f63529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f63530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f63531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ExoPlayer.c f63532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private z3 f63533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private z3 f63534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private z3 f63535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private z3 f63536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private z3 f63537n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f63538o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private Object f63539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f63540q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.common.z3.b f63524a = new androidx.media3.common.z3.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.common.z3.d f63525b = new androidx.media3.common.z3.d();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<z3> f63541r = new ArrayList();

    public c4(androidx.media3.exoplayer.analytics.a aVar, androidx.media3.common.util.u uVar, z3.a aVar2, ExoPlayer.c cVar) {
        this.f63526c = aVar;
        this.f63527d = uVar;
        this.f63528e = aVar2;
        this.f63532i = cVar;
    }

    private boolean A(Object obj, androidx.media3.common.z3 z3Var) {
        int iD = z3Var.l(obj, this.f63524a).d();
        int iR = this.f63524a.r();
        return iD > 0 && this.f63524a.u(iR) && (iD > 1 || this.f63524a.g(iR) != Long.MIN_VALUE);
    }

    private boolean C(androidx.media3.exoplayer.source.t0.b bVar) {
        return !bVar.c() && bVar.f65471e == -1;
    }

    private boolean D(androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar, boolean z10) {
        int iF = z3Var.f(bVar.f65467a);
        return !z3Var.t(z3Var.j(iF, this.f63524a).f61969c, this.f63525b).f61996i && z3Var.x(iF, this.f63524a, this.f63525b, this.f63530g, this.f63531h) && z10;
    }

    private boolean E(androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar) {
        if (C(bVar)) {
            return z3Var.t(z3Var.l(bVar.f65467a, this.f63524a).f61969c, this.f63525b).f62002o == z3Var.f(bVar.f65467a);
        }
        return false;
    }

    private static boolean H(androidx.media3.common.z3.b bVar) {
        int iD = bVar.d();
        if (iD != 0 && ((iD != 1 || !bVar.t(0)) && bVar.u(bVar.r()))) {
            long jK = 0;
            if (bVar.f(0L) == -1) {
                if (bVar.f61970d == 0) {
                    return true;
                }
                int i10 = iD - (bVar.t(iD + (-1)) ? 2 : 1);
                for (int i11 = 0; i11 <= i10; i11++) {
                    jK += bVar.k(i11);
                }
                if (bVar.f61970d <= jK) {
                    return true;
                }
            }
        }
        return false;
    }

    private void J() {
        final l6.a aVarS = l6.s();
        for (z3 z3VarK = this.f63533j; z3VarK != null; z3VarK = z3VarK.k()) {
            aVarS.a(z3VarK.f66958h.f62779a);
        }
        z3 z3Var = this.f63534k;
        final androidx.media3.exoplayer.source.t0.b bVar = z3Var == null ? null : z3Var.f66958h.f62779a;
        this.f63527d.g(new Runnable() { // from class: androidx.media3.exoplayer.b4
            @Override // java.lang.Runnable
            public final void run() {
                this.f63505a.f63526c.J(aVarS.e(), bVar);
            }
        });
    }

    private void L(List<z3> list) {
        for (int i10 = 0; i10 < this.f63541r.size(); i10++) {
            this.f63541r.get(i10).x();
        }
        this.f63541r = list;
        this.f63537n = null;
        I();
    }

    @androidx.annotation.p0
    private z3 O(a4 a4Var) {
        for (int i10 = 0; i10 < this.f63541r.size(); i10++) {
            if (this.f63541r.get(i10).d(a4Var)) {
                return this.f63541r.remove(i10);
            }
        }
        return null;
    }

    private static androidx.media3.exoplayer.source.t0.b Q(androidx.media3.common.z3 z3Var, Object obj, long j10, long j11, androidx.media3.common.z3.d dVar, androidx.media3.common.z3.b bVar) {
        z3Var.l(obj, bVar);
        z3Var.t(bVar.f61969c, dVar);
        for (int iF = z3Var.f(obj); H(bVar) && iF <= dVar.f62002o; iF++) {
            z3Var.k(iF, bVar, true);
            obj = androidx.media3.common.util.a.g(bVar.f61968b);
        }
        z3Var.l(obj, bVar);
        int iF2 = bVar.f(j10);
        return iF2 == -1 ? new androidx.media3.exoplayer.source.t0.b(obj, j11, bVar.e(j10)) : new androidx.media3.exoplayer.source.t0.b(obj, iF2, bVar.n(iF2), j11);
    }

    private long S(androidx.media3.common.z3 z3Var, Object obj) {
        int iF;
        int i10 = z3Var.l(obj, this.f63524a).f61969c;
        Object obj2 = this.f63539p;
        if (obj2 != null && (iF = z3Var.f(obj2)) != -1 && z3Var.j(iF, this.f63524a).f61969c == i10) {
            return this.f63540q;
        }
        for (z3 z3VarK = this.f63533j; z3VarK != null; z3VarK = z3VarK.k()) {
            if (z3VarK.f66952b.equals(obj)) {
                return z3VarK.f66958h.f62779a.f65470d;
            }
        }
        for (z3 z3VarK2 = this.f63533j; z3VarK2 != null; z3VarK2 = z3VarK2.k()) {
            int iF2 = z3Var.f(z3VarK2.f66952b);
            if (iF2 != -1 && z3Var.j(iF2, this.f63524a).f61969c == i10) {
                return z3VarK2.f66958h.f62779a.f65470d;
            }
        }
        long jT = T(obj);
        if (jT != -1) {
            return jT;
        }
        long j10 = this.f63529f;
        this.f63529f = 1 + j10;
        if (this.f63533j == null) {
            this.f63539p = obj;
            this.f63540q = j10;
        }
        return j10;
    }

    private long T(Object obj) {
        for (int i10 = 0; i10 < this.f63541r.size(); i10++) {
            z3 z3Var = this.f63541r.get(i10);
            if (z3Var.f66952b.equals(obj)) {
                return z3Var.f66958h.f62779a.f65470d;
            }
        }
        return -1L;
    }

    private int V(androidx.media3.common.z3 z3Var) {
        androidx.media3.common.z3 z3Var2;
        z3 z3VarK = this.f63533j;
        if (z3VarK == null) {
            return 0;
        }
        int iF = z3Var.f(z3VarK.f66952b);
        while (true) {
            z3Var2 = z3Var;
            iF = z3Var2.h(iF, this.f63524a, this.f63525b, this.f63530g, this.f63531h);
            while (((z3) androidx.media3.common.util.a.g(z3VarK)).k() != null && !z3VarK.f66958h.f62786h) {
                z3VarK = z3VarK.k();
            }
            z3 z3VarK2 = z3VarK.k();
            if (iF == -1 || z3VarK2 == null || z3Var2.f(z3VarK2.f66952b) != iF) {
                break;
                break;
                break;
            }
            z3VarK = z3VarK2;
            z3Var = z3Var2;
        }
        int iN = N(z3VarK);
        z3VarK.f66958h = z(z3Var2, z3VarK.f66958h);
        return iN;
    }

    static boolean e(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean f(a4 a4Var, a4 a4Var2) {
        return a4Var.f62780b == a4Var2.f62780b && a4Var.f62779a.equals(a4Var2.f62779a);
    }

    @androidx.annotation.p0
    private Pair<Object, Long> i(androidx.media3.common.z3 z3Var, Object obj, long j10) {
        int i10 = z3Var.i(z3Var.l(obj, this.f63524a).f61969c, this.f63530g, this.f63531h);
        if (i10 != -1) {
            return z3Var.q(this.f63525b, this.f63524a, i10, -9223372036854775807L, j10);
        }
        return null;
    }

    @androidx.annotation.p0
    private a4 j(u4 u4Var) {
        return o(u4Var.f65817a, u4Var.f65818b, u4Var.f65819c, u4Var.f65835s);
    }

    @androidx.annotation.p0
    private a4 k(androidx.media3.common.z3 z3Var, z3 z3Var2, long j10) {
        Object obj;
        long j11;
        a4 a4Var = z3Var2.f66958h;
        int iH = z3Var.h(z3Var.f(a4Var.f62779a.f65467a), this.f63524a, this.f63525b, this.f63530g, this.f63531h);
        if (iH == -1) {
            return null;
        }
        int i10 = z3Var.k(iH, this.f63524a, true).f61969c;
        Object objG = androidx.media3.common.util.a.g(this.f63524a.f61968b);
        long j12 = a4Var.f62779a.f65470d;
        long j13 = 0;
        if (z3Var.t(i10, this.f63525b).f62001n == iH) {
            Pair<Object, Long> pairQ = z3Var.q(this.f63525b, this.f63524a, i10, -9223372036854775807L, Math.max(0L, j10));
            if (pairQ == null) {
                return null;
            }
            Object obj2 = pairQ.first;
            long jLongValue = ((Long) pairQ.second).longValue();
            z3 z3VarK = z3Var2.k();
            if (z3VarK == null || !z3VarK.f66952b.equals(obj2)) {
                long jT = T(obj2);
                if (jT == -1) {
                    jT = this.f63529f;
                    this.f63529f = 1 + jT;
                }
                j12 = jT;
            } else {
                j12 = z3VarK.f66958h.f62779a.f65470d;
            }
            obj = obj2;
            j11 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            obj = objG;
            j11 = 0;
        }
        androidx.media3.exoplayer.source.t0.b bVarQ = Q(z3Var, obj, j11, j12, this.f63525b, this.f63524a);
        if (j13 != -9223372036854775807L && a4Var.f62781c != -9223372036854775807L) {
            boolean zA = A(a4Var.f62779a.f65467a, z3Var);
            if (bVarQ.c() && zA) {
                j13 = a4Var.f62781c;
            } else if (zA) {
                j11 = a4Var.f62781c;
            }
        }
        return o(z3Var, bVarQ, j13, j11);
    }

    @androidx.annotation.p0
    private a4 l(androidx.media3.common.z3 z3Var, z3 z3Var2, long j10) {
        a4 a4Var = z3Var2.f66958h;
        long jM = (z3Var2.m() + a4Var.f62783e) - j10;
        return a4Var.f62786h ? k(z3Var, z3Var2, jM) : m(z3Var, z3Var2, jM);
    }

    @androidx.annotation.p0
    private a4 m(androidx.media3.common.z3 z3Var, z3 z3Var2, long j10) {
        a4 a4Var = z3Var2.f66958h;
        androidx.media3.exoplayer.source.t0.b bVar = a4Var.f62779a;
        z3Var.l(bVar.f65467a, this.f63524a);
        boolean z10 = a4Var.f62785g;
        if (!bVar.c()) {
            int i10 = bVar.f65471e;
            if (i10 != -1 && this.f63524a.t(i10)) {
                return k(z3Var, z3Var2, j10);
            }
            int iN = this.f63524a.n(bVar.f65471e);
            boolean z11 = this.f63524a.u(bVar.f65471e) && this.f63524a.i(bVar.f65471e, iN) == 3;
            if (iN == this.f63524a.b(bVar.f65471e) || z11) {
                return q(z3Var, bVar.f65467a, s(z3Var, bVar.f65467a, bVar.f65471e), a4Var.f62783e, bVar.f65470d, false);
            }
            return p(z3Var, bVar.f65467a, bVar.f65471e, iN, a4Var.f62783e, bVar.f65470d, z10);
        }
        int i11 = bVar.f65468b;
        int iB = this.f63524a.b(i11);
        if (iB == -1) {
            return null;
        }
        int iO = this.f63524a.o(i11, bVar.f65469c);
        if (iO < iB) {
            return p(z3Var, bVar.f65467a, i11, iO, a4Var.f62781c, bVar.f65470d, z10);
        }
        long jLongValue = a4Var.f62781c;
        if (jLongValue == -9223372036854775807L) {
            androidx.media3.common.z3.d dVar = this.f63525b;
            androidx.media3.common.z3.b bVar2 = this.f63524a;
            Pair<Object, Long> pairQ = z3Var.q(dVar, bVar2, bVar2.f61969c, -9223372036854775807L, Math.max(0L, j10));
            if (pairQ == null) {
                return null;
            }
            jLongValue = ((Long) pairQ.second).longValue();
        }
        return q(z3Var, bVar.f65467a, Math.max(s(z3Var, bVar.f65467a, bVar.f65468b), jLongValue), a4Var.f62781c, bVar.f65470d, z10);
    }

    private a4 o(androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar, long j10, long j11) {
        z3Var.l(bVar.f65467a, this.f63524a);
        return bVar.c() ? p(z3Var, bVar.f65467a, bVar.f65468b, bVar.f65469c, j10, bVar.f65470d, false) : q(z3Var, bVar.f65467a, j11, j10, bVar.f65470d, false);
    }

    private a4 p(androidx.media3.common.z3 z3Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        androidx.media3.exoplayer.source.t0.b bVar = new androidx.media3.exoplayer.source.t0.b(obj, i10, i11, j11);
        long jC = z3Var.l(bVar.f65467a, this.f63524a).c(bVar.f65468b, bVar.f65469c);
        long jH = i11 == this.f63524a.n(i10) ? this.f63524a.h() : 0L;
        boolean zU = this.f63524a.u(bVar.f65468b);
        if (jC != -9223372036854775807L && jH >= jC) {
            jH = Math.max(0L, jC - 1);
        }
        return new a4(bVar, jH, j10, -9223372036854775807L, jC, z10, zU, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    private a4 q(androidx.media3.common.z3 z3Var, Object obj, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        long j13;
        long jG;
        long j14;
        long jMax;
        z3Var.l(obj, this.f63524a);
        int iE = this.f63524a.e(j10);
        boolean z12 = iE != -1 && this.f63524a.t(iE);
        if (iE == -1) {
            if (this.f63524a.d() > 0) {
                androidx.media3.common.z3.b bVar = this.f63524a;
                if (bVar.u(bVar.r())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        } else if (this.f63524a.u(iE)) {
            long jG2 = this.f63524a.g(iE);
            androidx.media3.common.z3.b bVar2 = this.f63524a;
            if (jG2 == bVar2.f61970d && bVar2.s(iE)) {
                z11 = true;
                iE = -1;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        androidx.media3.exoplayer.source.t0.b bVar3 = new androidx.media3.exoplayer.source.t0.b(obj, j12, iE);
        boolean zC = C(bVar3);
        boolean zE = E(z3Var, bVar3);
        boolean zD = D(z3Var, bVar3, zC);
        boolean z13 = (iE == -1 || !this.f63524a.u(iE) || z12) ? false : true;
        if (iE == -1 || z12) {
            if (z11) {
                jG = this.f63524a.f61970d;
            } else {
                j13 = -9223372036854775807L;
            }
            if (j13 != -9223372036854775807L || j13 == Long.MIN_VALUE) {
                j14 = this.f63524a.f61970d;
            } else {
                j14 = j13;
            }
            if (j14 != -9223372036854775807L || j10 < j14) {
                jMax = j10;
            } else {
                jMax = Math.max(0L, j14 - ((long) ((zD || !z11) ? 1 : 0)));
            }
            return new a4(bVar3, jMax, j11, j13, j14, z10, z13, zC, zE, zD);
        }
        jG = this.f63524a.g(iE);
        j13 = jG;
        if (j13 != -9223372036854775807L) {
            j14 = this.f63524a.f61970d;
        } else {
            j14 = this.f63524a.f61970d;
        }
        if (j14 != -9223372036854775807L) {
            jMax = j10;
        } else {
            jMax = j10;
        }
        return new a4(bVar3, jMax, j11, j13, j14, z10, z13, zC, zE, zD);
    }

    private a4 r(androidx.media3.common.z3 z3Var, Object obj, long j10, long j11) {
        androidx.media3.exoplayer.source.t0.b bVarQ = Q(z3Var, obj, j10, j11, this.f63525b, this.f63524a);
        return bVarQ.c() ? p(z3Var, bVarQ.f65467a, bVarQ.f65468b, bVarQ.f65469c, j10, bVarQ.f65470d, false) : q(z3Var, bVarQ.f65467a, j10, -9223372036854775807L, bVarQ.f65470d, false);
    }

    private long s(androidx.media3.common.z3 z3Var, Object obj, int i10) {
        z3Var.l(obj, this.f63524a);
        long jG = this.f63524a.g(i10);
        return jG == Long.MIN_VALUE ? this.f63524a.f61970d : jG + this.f63524a.k(i10);
    }

    public void B(androidx.media3.common.z3 z3Var) {
        z3 z3Var2;
        c4 c4Var;
        if (this.f63532i.f62771a == -9223372036854775807L || (z3Var2 = this.f63536m) == null) {
            M();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> pairI = i(z3Var, z3Var2.f66958h.f62779a.f65467a, 0L);
        if (pairI == null || z3Var.t(z3Var.l(pairI.first, this.f63524a).f61969c, this.f63525b).i()) {
            c4Var = this;
        } else {
            long jT = T(pairI.first);
            if (jT == -1) {
                jT = this.f63529f;
                this.f63529f = 1 + jT;
            }
            c4Var = this;
            a4 a4VarR = c4Var.r(z3Var, pairI.first, ((Long) pairI.second).longValue(), jT);
            z3 z3VarO = c4Var.O(a4VarR);
            if (z3VarO == null) {
                z3VarO = c4Var.f63528e.a(a4VarR, (z3Var2.m() + z3Var2.f66958h.f62783e) - a4VarR.f62780b);
            }
            arrayList.add(z3VarO);
        }
        c4Var.L(arrayList);
    }

    public boolean F(androidx.media3.exoplayer.source.s0 s0Var) {
        z3 z3Var = this.f63536m;
        return z3Var != null && z3Var.f66951a == s0Var;
    }

    public boolean G(androidx.media3.exoplayer.source.s0 s0Var) {
        z3 z3Var = this.f63537n;
        return z3Var != null && z3Var.f66951a == s0Var;
    }

    public void I() {
        z3 z3Var = this.f63537n;
        if (z3Var == null || z3Var.t()) {
            this.f63537n = null;
            for (int i10 = 0; i10 < this.f63541r.size(); i10++) {
                z3 z3Var2 = this.f63541r.get(i10);
                if (!z3Var2.t()) {
                    this.f63537n = z3Var2;
                    return;
                }
            }
        }
    }

    public void K(long j10) {
        z3 z3Var = this.f63536m;
        if (z3Var != null) {
            z3Var.w(j10);
        }
    }

    public void M() {
        if (this.f63541r.isEmpty()) {
            return;
        }
        L(new ArrayList());
    }

    public int N(z3 z3Var) {
        androidx.media3.common.util.a.k(z3Var);
        int i10 = 0;
        if (z3Var.equals(this.f63536m)) {
            return 0;
        }
        this.f63536m = z3Var;
        while (z3Var.k() != null) {
            z3Var = (z3) androidx.media3.common.util.a.g(z3Var.k());
            if (z3Var == this.f63534k) {
                z3 z3Var2 = this.f63533j;
                this.f63534k = z3Var2;
                this.f63535l = z3Var2;
                i10 = 3;
            }
            if (z3Var == this.f63535l) {
                this.f63535l = this.f63534k;
                i10 |= 2;
            }
            z3Var.x();
            this.f63538o--;
        }
        ((z3) androidx.media3.common.util.a.g(this.f63536m)).A(null);
        J();
        return i10;
    }

    public androidx.media3.exoplayer.source.t0.b P(androidx.media3.common.z3 z3Var, Object obj, long j10) {
        return Q(z3Var, obj, j10, S(z3Var, obj), this.f63525b, this.f63524a);
    }

    public androidx.media3.exoplayer.source.t0.b R(androidx.media3.common.z3 z3Var, Object obj, long j10) {
        long jS = S(z3Var, obj);
        z3Var.l(obj, this.f63524a);
        z3Var.t(this.f63524a.f61969c, this.f63525b);
        boolean z10 = false;
        for (int iF = z3Var.f(obj); iF >= this.f63525b.f62001n; iF--) {
            boolean z11 = true;
            z3Var.k(iF, this.f63524a, true);
            if (this.f63524a.d() <= 0) {
                z11 = false;
            }
            z10 |= z11;
            androidx.media3.common.z3.b bVar = this.f63524a;
            if (bVar.f(bVar.f61970d) != -1) {
                obj = androidx.media3.common.util.a.g(this.f63524a.f61968b);
            }
            if (z10 && (!z11 || this.f63524a.f61970d != 0)) {
                break;
            }
        }
        return Q(z3Var, obj, j10, jS, this.f63525b, this.f63524a);
    }

    public boolean U() {
        z3 z3Var = this.f63536m;
        return z3Var == null || (!z3Var.f66958h.f62788j && z3Var.s() && this.f63536m.f66958h.f62783e != -9223372036854775807L && this.f63538o < 100);
    }

    public void W(androidx.media3.common.z3 z3Var, ExoPlayer.c cVar) {
        this.f63532i = cVar;
        B(z3Var);
    }

    public int X(androidx.media3.common.z3 z3Var, long j10, long j11, long j12) {
        a4 a4VarZ;
        z3 z3VarK = this.f63533j;
        z3 z3Var2 = null;
        while (true) {
            boolean z10 = false;
            if (z3VarK == null) {
                return 0;
            }
            a4 a4Var = z3VarK.f66958h;
            if (z3Var2 == null) {
                a4VarZ = z(z3Var, a4Var);
            } else {
                a4 a4VarL = l(z3Var, z3Var2, j10);
                if (a4VarL == null || !f(a4Var, a4VarL)) {
                    return N(z3Var2);
                }
                a4VarZ = a4VarL;
            }
            z3VarK.f66958h = a4VarZ.a(a4Var.f62781c);
            if (!e(a4Var.f62783e, a4VarZ.f62783e)) {
                z3VarK.E();
                long j13 = a4VarZ.f62783e;
                long jD = j13 == -9223372036854775807L ? Long.MAX_VALUE : z3VarK.D(j13);
                int i10 = (z3VarK != this.f63534k || z3VarK.f66958h.f62785g || (j11 != Long.MIN_VALUE && j11 < jD)) ? 0 : 1;
                if (z3VarK == this.f63535l && (j12 == Long.MIN_VALUE || j12 >= jD)) {
                    z10 = true;
                }
                int iN = N(z3VarK);
                if (iN != 0) {
                    return iN;
                }
                return z10 ? i10 | 2 : i10;
            }
            z3Var2 = z3VarK;
            z3VarK = z3VarK.k();
        }
    }

    public int Y(androidx.media3.common.z3 z3Var, int i10) {
        this.f63530g = i10;
        return V(z3Var);
    }

    public int Z(androidx.media3.common.z3 z3Var, boolean z10) {
        this.f63531h = z10;
        return V(z3Var);
    }

    @androidx.annotation.p0
    public z3 b() {
        z3 z3Var = this.f63533j;
        if (z3Var == null) {
            return null;
        }
        if (z3Var == this.f63534k) {
            this.f63534k = z3Var.k();
        }
        z3 z3Var2 = this.f63533j;
        if (z3Var2 == this.f63535l) {
            this.f63535l = z3Var2.k();
        }
        this.f63533j.x();
        int i10 = this.f63538o - 1;
        this.f63538o = i10;
        if (i10 == 0) {
            this.f63536m = null;
            z3 z3Var3 = this.f63533j;
            this.f63539p = z3Var3.f66952b;
            this.f63540q = z3Var3.f66958h.f62779a.f65470d;
        }
        this.f63533j = this.f63533j.k();
        J();
        return this.f63533j;
    }

    public z3 c() {
        this.f63535l = ((z3) androidx.media3.common.util.a.k(this.f63535l)).k();
        J();
        return (z3) androidx.media3.common.util.a.k(this.f63535l);
    }

    public z3 d() {
        z3 z3Var = this.f63535l;
        z3 z3Var2 = this.f63534k;
        if (z3Var == z3Var2) {
            this.f63535l = ((z3) androidx.media3.common.util.a.k(z3Var2)).k();
        }
        this.f63534k = ((z3) androidx.media3.common.util.a.k(this.f63534k)).k();
        J();
        return (z3) androidx.media3.common.util.a.k(this.f63534k);
    }

    public void g() {
        if (this.f63538o == 0) {
            return;
        }
        z3 z3VarK = (z3) androidx.media3.common.util.a.k(this.f63533j);
        this.f63539p = z3VarK.f66952b;
        this.f63540q = z3VarK.f66958h.f62779a.f65470d;
        while (z3VarK != null) {
            z3VarK.x();
            z3VarK = z3VarK.k();
        }
        this.f63533j = null;
        this.f63536m = null;
        this.f63534k = null;
        this.f63535l = null;
        this.f63538o = 0;
        J();
    }

    public z3 h(a4 a4Var) {
        z3 z3Var = this.f63536m;
        long jM = z3Var == null ? f63520s : (z3Var.m() + this.f63536m.f66958h.f62783e) - a4Var.f62780b;
        z3 z3VarO = O(a4Var);
        if (z3VarO == null) {
            z3VarO = this.f63528e.a(a4Var, jM);
        } else {
            z3VarO.f66958h = a4Var;
            z3VarO.B(jM);
        }
        z3 z3Var2 = this.f63536m;
        if (z3Var2 != null) {
            z3Var2.A(z3VarO);
        } else {
            this.f63533j = z3VarO;
            this.f63534k = z3VarO;
            this.f63535l = z3VarO;
        }
        this.f63539p = null;
        this.f63536m = z3VarO;
        this.f63538o++;
        J();
        return z3VarO;
    }

    @androidx.annotation.p0
    public z3 n() {
        return this.f63536m;
    }

    @androidx.annotation.p0
    public a4 t(long j10, u4 u4Var) {
        z3 z3Var = this.f63536m;
        return z3Var == null ? j(u4Var) : l(u4Var.f65817a, z3Var, j10);
    }

    @androidx.annotation.p0
    public z3 u() {
        return this.f63533j;
    }

    @androidx.annotation.p0
    public z3 v(androidx.media3.exoplayer.source.s0 s0Var) {
        for (int i10 = 0; i10 < this.f63541r.size(); i10++) {
            z3 z3Var = this.f63541r.get(i10);
            if (z3Var.f66951a == s0Var) {
                return z3Var;
            }
        }
        return null;
    }

    @androidx.annotation.p0
    public z3 w() {
        return this.f63537n;
    }

    @androidx.annotation.p0
    public z3 x() {
        return this.f63535l;
    }

    @androidx.annotation.p0
    public z3 y() {
        return this.f63534k;
    }

    public a4 z(androidx.media3.common.z3 z3Var, a4 a4Var) {
        long jM;
        boolean zU;
        int i10;
        androidx.media3.exoplayer.source.t0.b bVar = a4Var.f62779a;
        boolean zC = C(bVar);
        boolean zE = E(z3Var, bVar);
        boolean zD = D(z3Var, bVar, zC);
        z3Var.l(a4Var.f62779a.f65467a, this.f63524a);
        long jG = (bVar.c() || (i10 = bVar.f65471e) == -1) ? -9223372036854775807L : this.f63524a.g(i10);
        if (bVar.c()) {
            jM = this.f63524a.c(bVar.f65468b, bVar.f65469c);
        } else {
            jM = (jG == -9223372036854775807L || jG == Long.MIN_VALUE) ? this.f63524a.m() : jG;
        }
        if (bVar.c()) {
            zU = this.f63524a.u(bVar.f65468b);
        } else {
            int i11 = bVar.f65471e;
            zU = i11 != -1 && this.f63524a.u(i11);
        }
        return new a4(bVar, a4Var.f62780b, a4Var.f62781c, jG, jM, a4Var.f62784f, zU, zC, zE, zD);
    }
}
