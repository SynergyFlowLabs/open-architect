package androidx.media3.exoplayer.source;

import android.util.Pair;
import androidx.media3.common.z3;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class g0 extends j2 {
    private boolean X;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f65044m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final z3.d f65045n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final z3.b f65046o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f65047s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.p0
    private f0 f65048t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f65049v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f65050w;

    private static final class a extends b0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f65051h = new Object();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private final Object f65052f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private final Object f65053g;

        private a(z3 z3Var, @androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
            super(z3Var);
            this.f65052f = obj;
            this.f65053g = obj2;
        }

        public static a B(androidx.media3.common.k0 k0Var) {
            return new a(new b(k0Var), z3.d.f61978q, f65051h);
        }

        public static a C(z3 z3Var, @androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
            return new a(z3Var, obj, obj2);
        }

        public a A(z3 z3Var) {
            return new a(z3Var, this.f65052f, this.f65053g);
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public int f(Object obj) {
            Object obj2;
            z3 z3Var = this.f64829e;
            if (f65051h.equals(obj) && (obj2 = this.f65053g) != null) {
                obj = obj2;
            }
            return z3Var.f(obj);
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public z3.b k(int i10, z3.b bVar, boolean z10) {
            this.f64829e.k(i10, bVar, z10);
            if (Objects.equals(bVar.f61968b, this.f65053g) && z10) {
                bVar.f61968b = f65051h;
            }
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public Object s(int i10) {
            Object objS = this.f64829e.s(i10);
            return Objects.equals(objS, this.f65053g) ? f65051h : objS;
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public z3.d u(int i10, z3.d dVar, long j10) {
            this.f64829e.u(i10, dVar, j10);
            if (Objects.equals(dVar.f61988a, this.f65052f)) {
                dVar.f61988a = z3.d.f61978q;
            }
            return dVar;
        }
    }

    @androidx.annotation.l1
    public static final class b extends z3 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.media3.common.k0 f65054e;

        public b(androidx.media3.common.k0 k0Var) {
            this.f65054e = k0Var;
        }

        @Override // androidx.media3.common.z3
        public int f(Object obj) {
            return obj == a.f65051h ? 0 : -1;
        }

        @Override // androidx.media3.common.z3
        public z3.b k(int i10, z3.b bVar, boolean z10) {
            bVar.w(z10 ? 0 : null, z10 ? a.f65051h : null, 0, -9223372036854775807L, 0L, androidx.media3.common.b.f60416l, true);
            return bVar;
        }

        @Override // androidx.media3.common.z3
        public int m() {
            return 1;
        }

        @Override // androidx.media3.common.z3
        public Object s(int i10) {
            return a.f65051h;
        }

        @Override // androidx.media3.common.z3
        public z3.d u(int i10, z3.d dVar, long j10) {
            dVar.j(z3.d.f61978q, this.f65054e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f61998k = true;
            return dVar;
        }

        @Override // androidx.media3.common.z3
        public int v() {
            return 1;
        }
    }

    public g0(t0 t0Var, boolean z10) {
        super(t0Var);
        this.f65044m = z10 && t0Var.N();
        this.f65045n = new z3.d();
        this.f65046o = new z3.b();
        z3 z3VarU = t0Var.u();
        if (z3VarU == null) {
            this.f65047s = a.B(t0Var.g());
        } else {
            this.f65047s = a.C(z3VarU, null, null);
            this.X = true;
        }
    }

    private Object R0(Object obj) {
        return (this.f65047s.f65053g == null || !this.f65047s.f65053g.equals(obj)) ? obj : a.f65051h;
    }

    private Object S0(Object obj) {
        return (this.f65047s.f65053g == null || !obj.equals(a.f65051h)) ? obj : this.f65047s.f65053g;
    }

    @il.m({"unpreparedMaskingMediaPeriod"})
    private boolean U0(long j10) {
        f0 f0Var = this.f65048t;
        int iF = this.f65047s.f(f0Var.f65016a.f65467a);
        if (iF == -1) {
            return false;
        }
        long j11 = this.f65047s.j(iF, this.f65046o).f61970d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        f0Var.u(j10);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.j2
    @androidx.annotation.p0
    protected t0.b F0(t0.b bVar) {
        return bVar.a(R0(bVar.f65467a));
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    public void K(androidx.media3.common.k0 k0Var) {
        if (this.X) {
            this.f65047s = this.f65047s.A(new d2(this.f65047s.f64829e, k0Var));
        } else {
            this.f65047s = a.B(k0Var);
        }
        this.f65088k.K(k0Var);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.j2
    protected void L0(z3 z3Var) {
        long j10;
        t0.b bVarA;
        if (this.f65050w) {
            this.f65047s = this.f65047s.A(z3Var);
            f0 f0Var = this.f65048t;
            if (f0Var != null) {
                U0(f0Var.n());
            }
        } else {
            if (!z3Var.w()) {
                z3Var.t(0, this.f65045n);
                long jD = this.f65045n.d();
                Object obj = this.f65045n.f61988a;
                f0 f0Var2 = this.f65048t;
                if (f0Var2 != null) {
                    long jQ = f0Var2.q();
                    this.f65047s.l(this.f65048t.f65016a.f65467a, this.f65046o);
                    long jQ2 = this.f65046o.q() + jQ;
                    if (jQ2 != this.f65047s.t(0, this.f65045n).d()) {
                        j10 = jQ2;
                    } else {
                        j10 = jD;
                    }
                } else {
                    j10 = jD;
                }
                Pair<Object, Long> pairP = z3Var.p(this.f65045n, this.f65046o, 0, j10);
                Object obj2 = pairP.first;
                long jLongValue = ((Long) pairP.second).longValue();
                this.f65047s = this.X ? this.f65047s.A(z3Var) : a.C(z3Var, obj, obj2);
                f0 f0Var3 = this.f65048t;
                if (f0Var3 != null && U0(jLongValue)) {
                    t0.b bVar = f0Var3.f65016a;
                    bVarA = bVar.a(S0(bVar.f65467a));
                }
                this.X = true;
                this.f65050w = true;
                k0(this.f65047s);
                if (bVarA != null) {
                    ((f0) androidx.media3.common.util.a.g(this.f65048t)).a(bVarA);
                }
            }
            this.f65047s = this.X ? this.f65047s.A(z3Var) : a.C(z3Var, z3.d.f61978q, a.f65051h);
        }
        bVarA = null;
        this.X = true;
        this.f65050w = true;
        k0(this.f65047s);
        if (bVarA != null) {
            ((f0) androidx.media3.common.util.a.g(this.f65048t)).a(bVarA);
        }
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    public boolean O(androidx.media3.common.k0 k0Var) {
        return this.f65088k.O(k0Var);
    }

    @Override // androidx.media3.exoplayer.source.j2
    public void O0() {
        if (this.f65044m) {
            return;
        }
        this.f65049v = true;
        N0();
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public f0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        f0 f0Var = new f0(bVar, bVar2, j10);
        f0Var.x(this.f65088k);
        if (this.f65050w) {
            f0Var.a(bVar.a(S0(bVar.f65467a)));
            return f0Var;
        }
        this.f65048t = f0Var;
        if (!this.f65049v) {
            this.f65049v = true;
            N0();
        }
        return f0Var;
    }

    public z3 T0() {
        return this.f65047s;
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.t0
    public void a() {
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        ((f0) s0Var).w();
        if (s0Var == this.f65048t) {
            this.f65048t = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    public void l0() {
        this.f65050w = false;
        this.f65049v = false;
        super.l0();
    }
}
