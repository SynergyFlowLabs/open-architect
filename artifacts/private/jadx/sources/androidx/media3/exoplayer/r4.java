package androidx.media3.exoplayer;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class r4 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f64635m = "MediaSourceList";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.exoplayer.analytics.j4 f64636a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f64640e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media3.exoplayer.analytics.a f64643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media3.common.util.u f64644i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f64646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.datasource.r1 f64647l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.media3.exoplayer.source.u1 f64645j = new androidx.media3.exoplayer.source.u1.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<androidx.media3.exoplayer.source.s0, c> f64638c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Object, c> f64639d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f64637b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<c, b> f64641f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<c> f64642g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements androidx.media3.exoplayer.source.b1, androidx.media3.exoplayer.drm.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f64648a;

        public a(c cVar) {
            this.f64648a = cVar;
        }

        @androidx.annotation.p0
        private Pair<Integer, androidx.media3.exoplayer.source.t0.b> C(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
            androidx.media3.exoplayer.source.t0.b bVar2 = null;
            if (bVar != null) {
                androidx.media3.exoplayer.source.t0.b bVarO = r4.o(this.f64648a, bVar);
                if (bVarO == null) {
                    return null;
                }
                bVar2 = bVarO;
            }
            return Pair.create(Integer.valueOf(r4.t(this.f64648a, i10)), bVar2);
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void L(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.t0.b> pairC = C(i10, bVar);
            if (pairC != null) {
                r4.this.f64644i.g(new Runnable() { // from class: androidx.media3.exoplayer.q4
                    @Override // java.lang.Runnable
                    public final void run() {
                        r4.a aVar = this.f64610a;
                        Pair pair = pairC;
                        r4.this.f64643h.L(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.t0.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.b1
        public void P(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final androidx.media3.exoplayer.source.d0 d0Var, final androidx.media3.exoplayer.source.h0 h0Var, final IOException iOException, final boolean z10) {
            final Pair<Integer, androidx.media3.exoplayer.source.t0.b> pairC = C(i10, bVar);
            if (pairC != null) {
                r4.this.f64644i.g(new Runnable() { // from class: androidx.media3.exoplayer.h4
                    @Override // java.lang.Runnable
                    public final void run() {
                        r4.a aVar = this.f63830a;
                        Pair pair = pairC;
                        r4.this.f64643h.P(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.t0.b) pair.second, d0Var, h0Var, iOException, z10);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.b1
        public void R(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final androidx.media3.exoplayer.source.d0 d0Var, final androidx.media3.exoplayer.source.h0 h0Var) {
            final Pair<Integer, androidx.media3.exoplayer.source.t0.b> pairC = C(i10, bVar);
            if (pairC != null) {
                r4.this.f64644i.g(new Runnable() { // from class: androidx.media3.exoplayer.i4
                    @Override // java.lang.Runnable
                    public final void run() {
                        r4.a aVar = this.f63861a;
                        Pair pair = pairC;
                        r4.this.f64643h.R(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.t0.b) pair.second, d0Var, h0Var);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.b1
        public void U(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final androidx.media3.exoplayer.source.h0 h0Var) {
            final Pair<Integer, androidx.media3.exoplayer.source.t0.b> pairC = C(i10, bVar);
            if (pairC != null) {
                r4.this.f64644i.g(new Runnable() { // from class: androidx.media3.exoplayer.l4
                    @Override // java.lang.Runnable
                    public final void run() {
                        r4.a aVar = this.f63994a;
                        Pair pair = pairC;
                        r4.this.f64643h.U(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.t0.b) pair.second, h0Var);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void b0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.t0.b> pairC = C(i10, bVar);
            if (pairC != null) {
                r4.this.f64644i.g(new Runnable() { // from class: androidx.media3.exoplayer.n4
                    @Override // java.lang.Runnable
                    public final void run() {
                        r4.a aVar = this.f64331a;
                        Pair pair = pairC;
                        r4.this.f64643h.b0(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.t0.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.b1
        public void g0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final androidx.media3.exoplayer.source.h0 h0Var) {
            final Pair<Integer, androidx.media3.exoplayer.source.t0.b> pairC = C(i10, bVar);
            if (pairC != null) {
                r4.this.f64644i.g(new Runnable() { // from class: androidx.media3.exoplayer.f4
                    @Override // java.lang.Runnable
                    public final void run() {
                        r4.a aVar = this.f63784a;
                        Pair pair = pairC;
                        r4.this.f64643h.g0(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.t0.b) androidx.media3.common.util.a.g((androidx.media3.exoplayer.source.t0.b) pair.second), h0Var);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.b1
        public void m0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final androidx.media3.exoplayer.source.d0 d0Var, final androidx.media3.exoplayer.source.h0 h0Var, final int i11) {
            final Pair<Integer, androidx.media3.exoplayer.source.t0.b> pairC = C(i10, bVar);
            if (pairC != null) {
                r4.this.f64644i.g(new Runnable() { // from class: androidx.media3.exoplayer.g4
                    @Override // java.lang.Runnable
                    public final void run() {
                        r4.a aVar = this.f63798a;
                        Pair pair = pairC;
                        r4.this.f64643h.m0(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.t0.b) pair.second, d0Var, h0Var, i11);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void n0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final int i11) {
            final Pair<Integer, androidx.media3.exoplayer.source.t0.b> pairC = C(i10, bVar);
            if (pairC != null) {
                r4.this.f64644i.g(new Runnable() { // from class: androidx.media3.exoplayer.p4
                    @Override // java.lang.Runnable
                    public final void run() {
                        r4.a aVar = this.f64601a;
                        Pair pair = pairC;
                        r4.this.f64643h.n0(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.t0.b) pair.second, i11);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void o0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.t0.b> pairC = C(i10, bVar);
            if (pairC != null) {
                r4.this.f64644i.g(new Runnable() { // from class: androidx.media3.exoplayer.j4
                    @Override // java.lang.Runnable
                    public final void run() {
                        r4.a aVar = this.f63925a;
                        Pair pair = pairC;
                        r4.this.f64643h.o0(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.t0.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void p0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final Exception exc) {
            final Pair<Integer, androidx.media3.exoplayer.source.t0.b> pairC = C(i10, bVar);
            if (pairC != null) {
                r4.this.f64644i.g(new Runnable() { // from class: androidx.media3.exoplayer.k4
                    @Override // java.lang.Runnable
                    public final void run() {
                        r4.a aVar = this.f63954a;
                        Pair pair = pairC;
                        r4.this.f64643h.p0(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.t0.b) pair.second, exc);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.b1
        public void s0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, final androidx.media3.exoplayer.source.d0 d0Var, final androidx.media3.exoplayer.source.h0 h0Var) {
            final Pair<Integer, androidx.media3.exoplayer.source.t0.b> pairC = C(i10, bVar);
            if (pairC != null) {
                r4.this.f64644i.g(new Runnable() { // from class: androidx.media3.exoplayer.o4
                    @Override // java.lang.Runnable
                    public final void run() {
                        r4.a aVar = this.f64347a;
                        Pair pair = pairC;
                        r4.this.f64643h.s0(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.t0.b) pair.second, d0Var, h0Var);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void t0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.t0.b> pairC = C(i10, bVar);
            if (pairC != null) {
                r4.this.f64644i.g(new Runnable() { // from class: androidx.media3.exoplayer.m4
                    @Override // java.lang.Runnable
                    public final void run() {
                        r4.a aVar = this.f64037a;
                        Pair pair = pairC;
                        r4.this.f64643h.t0(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.t0.b) pair.second);
                    }
                });
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.t0 f64650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.t0.c f64651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f64652c;

        public b(androidx.media3.exoplayer.source.t0 t0Var, androidx.media3.exoplayer.source.t0.c cVar, a aVar) {
            this.f64650a = t0Var;
            this.f64651b = cVar;
            this.f64652c = aVar;
        }
    }

    static final class c implements d4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.g0 f64653a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f64656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f64657e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<androidx.media3.exoplayer.source.t0.b> f64655c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f64654b = new Object();

        public c(androidx.media3.exoplayer.source.t0 t0Var, boolean z10) {
            this.f64653a = new androidx.media3.exoplayer.source.g0(t0Var, z10);
        }

        @Override // androidx.media3.exoplayer.d4
        public Object a() {
            return this.f64654b;
        }

        @Override // androidx.media3.exoplayer.d4
        public androidx.media3.common.z3 b() {
            return this.f64653a.T0();
        }

        public void c(int i10) {
            this.f64656d = i10;
            this.f64657e = false;
            this.f64655c.clear();
        }
    }

    public interface d {
        void c();
    }

    public r4(d dVar, androidx.media3.exoplayer.analytics.a aVar, androidx.media3.common.util.u uVar, androidx.media3.exoplayer.analytics.j4 j4Var) {
        this.f64636a = j4Var;
        this.f64640e = dVar;
        this.f64643h = aVar;
        this.f64644i = uVar;
    }

    private void D(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVarRemove = this.f64637b.remove(i12);
            this.f64639d.remove(cVarRemove.f64654b);
            h(i12, -cVarRemove.f64653a.T0().v());
            cVarRemove.f64657e = true;
            if (this.f64646k) {
                v(cVarRemove);
            }
        }
    }

    private void h(int i10, int i11) {
        while (i10 < this.f64637b.size()) {
            this.f64637b.get(i10).f64656d += i11;
            i10++;
        }
    }

    private void k(c cVar) {
        b bVar = this.f64641f.get(cVar);
        if (bVar != null) {
            bVar.f64650a.M(bVar.f64651b);
        }
    }

    private void l() {
        Iterator<c> it = this.f64642g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f64655c.isEmpty()) {
                k(next);
                it.remove();
            }
        }
    }

    private void m(c cVar) {
        this.f64642g.add(cVar);
        b bVar = this.f64641f.get(cVar);
        if (bVar != null) {
            bVar.f64650a.F(bVar.f64651b);
        }
    }

    private static Object n(Object obj) {
        return androidx.media3.exoplayer.a.C(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.p0
    public static androidx.media3.exoplayer.source.t0.b o(c cVar, androidx.media3.exoplayer.source.t0.b bVar) {
        for (int i10 = 0; i10 < cVar.f64655c.size(); i10++) {
            if (cVar.f64655c.get(i10).f65470d == bVar.f65470d) {
                return bVar.a(q(cVar, bVar.f65467a));
            }
        }
        return null;
    }

    private static Object p(Object obj) {
        return androidx.media3.exoplayer.a.D(obj);
    }

    private static Object q(c cVar, Object obj) {
        return androidx.media3.exoplayer.a.F(cVar.f64654b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int t(c cVar, int i10) {
        return i10 + cVar.f64656d;
    }

    private void v(c cVar) {
        if (cVar.f64657e && cVar.f64655c.isEmpty()) {
            b bVar = (b) androidx.media3.common.util.a.g(this.f64641f.remove(cVar));
            bVar.f64650a.n(bVar.f64651b);
            bVar.f64650a.v(bVar.f64652c);
            bVar.f64650a.A(bVar.f64652c);
            this.f64642g.remove(cVar);
        }
    }

    private void z(c cVar) {
        androidx.media3.exoplayer.source.g0 g0Var = cVar.f64653a;
        androidx.media3.exoplayer.source.t0.c cVar2 = new androidx.media3.exoplayer.source.t0.c() { // from class: androidx.media3.exoplayer.e4
            @Override // androidx.media3.exoplayer.source.t0.c
            public final void B(androidx.media3.exoplayer.source.t0 t0Var, androidx.media3.common.z3 z3Var) {
                this.f63771a.f64640e.c();
            }
        };
        a aVar = new a(cVar);
        this.f64641f.put(cVar, new b(g0Var, cVar2, aVar));
        g0Var.i(androidx.media3.common.util.k1.J(), aVar);
        g0Var.j(androidx.media3.common.util.k1.J(), aVar);
        g0Var.C(cVar2, this.f64647l, this.f64636a);
    }

    public void A() {
        for (b bVar : this.f64641f.values()) {
            try {
                bVar.f64650a.n(bVar.f64651b);
            } catch (RuntimeException e10) {
                androidx.media3.common.util.z.e(f64635m, "Failed to release child source.", e10);
            }
            bVar.f64650a.v(bVar.f64652c);
            bVar.f64650a.A(bVar.f64652c);
        }
        this.f64641f.clear();
        this.f64642g.clear();
        this.f64646k = false;
    }

    public void B(androidx.media3.exoplayer.source.s0 s0Var) {
        c cVar = (c) androidx.media3.common.util.a.g(this.f64638c.remove(s0Var));
        cVar.f64653a.l(s0Var);
        cVar.f64655c.remove(((androidx.media3.exoplayer.source.f0) s0Var).f65016a);
        if (!this.f64638c.isEmpty()) {
            l();
        }
        v(cVar);
    }

    public androidx.media3.common.z3 C(int i10, int i11, androidx.media3.exoplayer.source.u1 u1Var) {
        androidx.media3.common.util.a.a(i10 >= 0 && i10 <= i11 && i11 <= s());
        this.f64645j = u1Var;
        D(i10, i11);
        return j();
    }

    public androidx.media3.common.z3 E(List<c> list, androidx.media3.exoplayer.source.u1 u1Var) {
        D(0, this.f64637b.size());
        return f(this.f64637b.size(), list, u1Var);
    }

    public androidx.media3.common.z3 F(androidx.media3.exoplayer.source.u1 u1Var) {
        int iS = s();
        if (u1Var.getLength() != iS) {
            u1Var = u1Var.d().g(0, iS);
        }
        this.f64645j = u1Var;
        return j();
    }

    public androidx.media3.common.z3 G(int i10, int i11, List<androidx.media3.common.k0> list) {
        androidx.media3.common.util.a.a(i10 >= 0 && i10 <= i11 && i11 <= s());
        androidx.media3.common.util.a.a(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            this.f64637b.get(i12).f64653a.K(list.get(i12 - i10));
        }
        return j();
    }

    public androidx.media3.common.z3 f(int i10, List<c> list, androidx.media3.exoplayer.source.u1 u1Var) {
        if (!list.isEmpty()) {
            this.f64645j = u1Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f64637b.get(i11 - 1);
                    cVar.c(cVar2.f64656d + cVar2.f64653a.T0().v());
                } else {
                    cVar.c(0);
                }
                h(i11, cVar.f64653a.T0().v());
                this.f64637b.add(i11, cVar);
                this.f64639d.put(cVar.f64654b, cVar);
                if (this.f64646k) {
                    z(cVar);
                    if (this.f64638c.isEmpty()) {
                        this.f64642g.add(cVar);
                    } else {
                        k(cVar);
                    }
                }
            }
        }
        return j();
    }

    public androidx.media3.common.z3 g(@androidx.annotation.p0 androidx.media3.exoplayer.source.u1 u1Var) {
        if (u1Var == null) {
            u1Var = this.f64645j.d();
        }
        this.f64645j = u1Var;
        D(0, s());
        return j();
    }

    public androidx.media3.exoplayer.source.s0 i(androidx.media3.exoplayer.source.t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        Object objP = p(bVar.f65467a);
        androidx.media3.exoplayer.source.t0.b bVarA = bVar.a(n(bVar.f65467a));
        c cVar = (c) androidx.media3.common.util.a.g(this.f64639d.get(objP));
        m(cVar);
        cVar.f64655c.add(bVarA);
        androidx.media3.exoplayer.source.f0 f0VarX = cVar.f64653a.x(bVarA, bVar2, j10);
        this.f64638c.put(f0VarX, cVar);
        l();
        return f0VarX;
    }

    public androidx.media3.common.z3 j() {
        if (this.f64637b.isEmpty()) {
            return androidx.media3.common.z3.f61958a;
        }
        int iV = 0;
        for (int i10 = 0; i10 < this.f64637b.size(); i10++) {
            c cVar = this.f64637b.get(i10);
            cVar.f64656d = iV;
            iV += cVar.f64653a.T0().v();
        }
        return new x4(this.f64637b, this.f64645j);
    }

    public androidx.media3.exoplayer.source.u1 r() {
        return this.f64645j;
    }

    public int s() {
        return this.f64637b.size();
    }

    public boolean u() {
        return this.f64646k;
    }

    public androidx.media3.common.z3 w(int i10, int i11, androidx.media3.exoplayer.source.u1 u1Var) {
        return x(i10, i10 + 1, i11, u1Var);
    }

    public androidx.media3.common.z3 x(int i10, int i11, int i12, androidx.media3.exoplayer.source.u1 u1Var) {
        androidx.media3.common.util.a.a(i10 >= 0 && i10 <= i11 && i11 <= s() && i12 >= 0);
        this.f64645j = u1Var;
        if (i10 == i11 || i10 == i12) {
            return j();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int iV = this.f64637b.get(iMin).f64656d;
        androidx.media3.common.util.k1.C1(this.f64637b, i10, i11, i12);
        while (iMin <= iMax) {
            c cVar = this.f64637b.get(iMin);
            cVar.f64656d = iV;
            iV += cVar.f64653a.T0().v();
            iMin++;
        }
        return j();
    }

    public void y(@androidx.annotation.p0 androidx.media3.datasource.r1 r1Var) {
        androidx.media3.common.util.a.i(!this.f64646k);
        this.f64647l = r1Var;
        for (int i10 = 0; i10 < this.f64637b.size(); i10++) {
            c cVar = this.f64637b.get(i10);
            z(cVar);
            this.f64642g.add(cVar);
        }
        this.f64646k = true;
    }
}
