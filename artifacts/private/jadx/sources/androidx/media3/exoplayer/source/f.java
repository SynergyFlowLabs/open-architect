package androidx.media3.exoplayer.source;

import androidx.media3.common.z3;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class f extends j2 {
    private final z3.d X;

    @androidx.annotation.p0
    private c Y;

    @androidx.annotation.p0
    private d Z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f64991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f64992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f64993o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private long f64994p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private long f64995p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f64996s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f64997t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f64998v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ArrayList<e> f64999w;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t0 f65000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f65001b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f65004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f65005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f65006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f65007h;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f65003d = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f65002c = Long.MIN_VALUE;

        public b(t0 t0Var) {
            this.f65000a = (t0) androidx.media3.common.util.a.g(t0Var);
        }

        public f h() {
            this.f65007h = true;
            return new f(this);
        }

        @z7.a
        public b i(boolean z10) {
            androidx.media3.common.util.a.i(!this.f65007h);
            this.f65004e = z10;
            return this;
        }

        @z7.a
        public b j(boolean z10) {
            androidx.media3.common.util.a.i(!this.f65007h);
            this.f65006g = z10;
            return this;
        }

        @z7.a
        public b k(boolean z10) {
            androidx.media3.common.util.a.i(!this.f65007h);
            this.f65003d = z10;
            return this;
        }

        @z7.a
        public b l(long j10) {
            return m(androidx.media3.common.util.k1.D1(j10));
        }

        @z7.a
        public b m(long j10) {
            androidx.media3.common.util.a.i(!this.f65007h);
            this.f65002c = j10;
            return this;
        }

        @z7.a
        public b n(boolean z10) {
            androidx.media3.common.util.a.i(!this.f65007h);
            this.f65005f = z10;
            return this;
        }

        @z7.a
        public b o(long j10) {
            return p(androidx.media3.common.util.k1.D1(j10));
        }

        @z7.a
        public b p(long j10) {
            androidx.media3.common.util.a.a(j10 >= 0);
            androidx.media3.common.util.a.i(!this.f65007h);
            this.f65001b = j10;
            return this;
        }
    }

    private static final class c extends b0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f65008f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f65009g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f65010h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f65011i;

        public c(z3 z3Var, long j10, long j11, boolean z10) throws d {
            super(z3Var);
            if (j11 != Long.MIN_VALUE && j11 < j10) {
                throw new d(2, j10, j11);
            }
            boolean z11 = false;
            if (z3Var.m() != 1) {
                throw new d(0);
            }
            z3.d dVarT = z3Var.t(0, new z3.d());
            long jMax = Math.max(0L, j10);
            if (!z10 && !dVarT.f61998k && jMax != 0 && !dVarT.f61995h) {
                throw new d(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? dVarT.f62000m : Math.max(0L, j11);
            long j12 = dVarT.f62000m;
            if (j12 != -9223372036854775807L) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.f65008f = jMax;
            this.f65009g = jMax2;
            this.f65010h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (dVarT.f61996i && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
                z11 = true;
            }
            this.f65011i = z11;
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public z3.b k(int i10, z3.b bVar, boolean z10) {
            this.f64829e.k(0, bVar, z10);
            long jQ = bVar.q() - this.f65008f;
            long j10 = this.f65010h;
            return bVar.v(bVar.f61967a, bVar.f61968b, 0, j10 != -9223372036854775807L ? j10 - jQ : -9223372036854775807L, jQ);
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public z3.d u(int i10, z3.d dVar, long j10) {
            this.f64829e.u(0, dVar, 0L);
            long j11 = dVar.f62003p;
            long j12 = this.f65008f;
            dVar.f62003p = j11 + j12;
            dVar.f62000m = this.f65010h;
            dVar.f61996i = this.f65011i;
            long j13 = dVar.f61999l;
            if (j13 != -9223372036854775807L) {
                long jMax = Math.max(j13, j12);
                dVar.f61999l = jMax;
                long j14 = this.f65009g;
                if (j14 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j14);
                }
                dVar.f61999l = jMax - this.f65008f;
            }
            long jA2 = androidx.media3.common.util.k1.A2(this.f65008f);
            long j15 = dVar.f61992e;
            if (j15 != -9223372036854775807L) {
                dVar.f61992e = j15 + jA2;
            }
            long j16 = dVar.f61993f;
            if (j16 != -9223372036854775807L) {
                dVar.f61993f = j16 + jA2;
            }
            return dVar;
        }
    }

    public static final class d extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f65012b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f65013c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f65014d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65015a;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public d(int i10) {
            this(i10, -9223372036854775807L, -9223372036854775807L);
        }

        private static String a(int i10, long j10, long j11) {
            if (i10 == 0) {
                return "invalid period count";
            }
            if (i10 == 1) {
                return "not seekable to start";
            }
            if (i10 != 2) {
                return "unknown";
            }
            androidx.media3.common.util.a.i((j10 == -9223372036854775807L || j11 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j10 + ", End time: " + j11;
        }

        public d(int i10, long j10, long j11) {
            super("Illegal clipping: " + a(i10, j10, j11));
            this.f65015a = i10;
        }
    }

    private void Q0(z3 z3Var) {
        long j10;
        z3Var.t(0, this.X);
        long jH = this.X.h();
        long j11 = Long.MIN_VALUE;
        if (this.Y == null || this.f64999w.isEmpty() || this.f64996s) {
            j10 = this.f64991m;
            long j12 = this.f64992n;
            if (this.f64997t) {
                long jD = this.X.d();
                j10 += jD;
                j12 += jD;
            }
            this.f64994p0 = jH + j10;
            this.f64995p1 = this.f64992n != Long.MIN_VALUE ? jH + j12 : Long.MIN_VALUE;
            int size = this.f64999w.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f64999w.get(i10).w(this.f64994p0, this.f64995p1);
            }
            j11 = j12;
        } else {
            j10 = this.f64994p0 - jH;
            if (this.f64992n != Long.MIN_VALUE) {
                j11 = this.f64995p1 - jH;
            }
        }
        try {
            c cVar = new c(z3Var, j10, j11, this.f64998v);
            this.Y = cVar;
            k0(cVar);
        } catch (d e10) {
            this.Z = e10;
            for (int i11 = 0; i11 < this.f64999w.size(); i11++) {
                this.f64999w.get(i11).s(this.Z);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.j2
    protected void L0(z3 z3Var) {
        if (this.Z != null) {
            return;
        }
        Q0(z3Var);
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    public boolean O(androidx.media3.common.k0 k0Var) {
        return g().f60826f.equals(k0Var.f60826f) && this.f65088k.O(k0Var);
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.t0
    public void a() throws IOException {
        d dVar = this.Z;
        if (dVar != null) {
            throw dVar;
        }
        super.a();
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        androidx.media3.common.util.a.i(this.f64999w.remove(s0Var));
        this.f65088k.l(((e) s0Var).f64963a);
        if (!this.f64999w.isEmpty() || this.f64996s) {
            return;
        }
        Q0(((c) androidx.media3.common.util.a.g(this.Y)).f64829e);
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected void l0() {
        super.l0();
        this.Z = null;
        this.Y = null;
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        e eVar = new e(this.f65088k.x(bVar, bVar2, j10), this.f64993o, this.f64994p0, this.f64995p1);
        this.f64999w.add(eVar);
        return eVar;
    }

    @Deprecated
    public f(t0 t0Var, long j10, long j11) {
        this(new b(t0Var).p(j10).m(j11));
    }

    @Deprecated
    public f(t0 t0Var, long j10) {
        this(new b(t0Var).m(j10).n(true));
    }

    @Deprecated
    public f(t0 t0Var, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        this(new b(t0Var).p(j10).m(j11).k(z10).i(z11).n(z12));
    }

    private f(b bVar) {
        super(bVar.f65000a);
        this.f64991m = bVar.f65001b;
        this.f64992n = bVar.f65002c;
        this.f64993o = bVar.f65003d;
        this.f64996s = bVar.f65004e;
        this.f64997t = bVar.f65005f;
        this.f64998v = bVar.f65006g;
        this.f64999w = new ArrayList<>();
        this.X = new z3.d();
    }
}
