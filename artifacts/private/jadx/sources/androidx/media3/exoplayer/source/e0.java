package androidx.media3.exoplayer.source;

import androidx.media3.common.z3;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
@Deprecated
public final class e0 extends j2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f64973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<t0.b, t0.b> f64974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map<s0, t0.b> f64975o;

    private static final class a extends b0 {
        public a(z3 z3Var) {
            super(z3Var);
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public int i(int i10, int i11, boolean z10) {
            int i12 = this.f64829e.i(i10, i11, z10);
            return i12 == -1 ? e(z10) : i12;
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public int r(int i10, int i11, boolean z10) {
            int iR = this.f64829e.r(i10, i11, z10);
            return iR == -1 ? g(z10) : iR;
        }
    }

    private static final class b extends androidx.media3.exoplayer.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final z3 f64976h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f64977i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f64978j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f64979k;

        public b(z3 z3Var, int i10) {
            super(false, new u1.b(i10));
            this.f64976h = z3Var;
            int iM = z3Var.m();
            this.f64977i = iM;
            this.f64978j = z3Var.v();
            this.f64979k = i10;
            if (iM > 0) {
                androidx.media3.common.util.a.j(i10 <= Integer.MAX_VALUE / iM, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // androidx.media3.exoplayer.a
        protected int A(int i10) {
            return i10 / this.f64977i;
        }

        @Override // androidx.media3.exoplayer.a
        protected int B(int i10) {
            return i10 / this.f64978j;
        }

        @Override // androidx.media3.exoplayer.a
        protected Object E(int i10) {
            return Integer.valueOf(i10);
        }

        @Override // androidx.media3.exoplayer.a
        protected int G(int i10) {
            return i10 * this.f64977i;
        }

        @Override // androidx.media3.exoplayer.a
        protected int H(int i10) {
            return i10 * this.f64978j;
        }

        @Override // androidx.media3.exoplayer.a
        protected z3 K(int i10) {
            return this.f64976h;
        }

        @Override // androidx.media3.common.z3
        public int m() {
            return this.f64977i * this.f64979k;
        }

        @Override // androidx.media3.common.z3
        public int v() {
            return this.f64978j * this.f64979k;
        }

        @Override // androidx.media3.exoplayer.a
        protected int z(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }
    }

    public e0(t0 t0Var) {
        this(t0Var, Integer.MAX_VALUE);
    }

    @Override // androidx.media3.exoplayer.source.j2
    @androidx.annotation.p0
    protected t0.b F0(t0.b bVar) {
        return this.f64973m != Integer.MAX_VALUE ? this.f64974n.get(bVar) : bVar;
    }

    @Override // androidx.media3.exoplayer.source.j2
    protected void L0(z3 z3Var) {
        k0(this.f64973m != Integer.MAX_VALUE ? new b(z3Var, this.f64973m) : new a(z3Var));
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    public boolean N() {
        return false;
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        this.f65088k.l(s0Var);
        t0.b bVarRemove = this.f64975o.remove(s0Var);
        if (bVarRemove != null) {
            this.f64974n.remove(bVarRemove);
        }
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    @androidx.annotation.p0
    public z3 u() {
        g0 g0Var = (g0) this.f65088k;
        return this.f64973m != Integer.MAX_VALUE ? new b(g0Var.T0(), this.f64973m) : new a(g0Var.T0());
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        if (this.f64973m == Integer.MAX_VALUE) {
            return this.f65088k.x(bVar, bVar2, j10);
        }
        t0.b bVarA = bVar.a(androidx.media3.exoplayer.a.C(bVar.f65467a));
        this.f64974n.put(bVarA, bVar);
        s0 s0VarX = this.f65088k.x(bVarA, bVar2, j10);
        this.f64975o.put(s0VarX, bVarA);
        return s0VarX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(t0 t0Var, int i10) {
        super(new g0(t0Var, false));
        int i11 = 5 | 0;
        androidx.media3.common.util.a.a(i10 > 0);
        this.f64973m = i10;
        this.f64974n = new HashMap();
        this.f64975o = new HashMap();
    }
}
