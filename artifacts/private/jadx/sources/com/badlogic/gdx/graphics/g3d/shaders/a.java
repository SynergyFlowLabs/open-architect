package com.badlogic.gdx.graphics.g3d.shaders;

import com.badlogic.gdx.graphics.f;
import com.badlogic.gdx.graphics.g3d.h;
import com.badlogic.gdx.graphics.g3d.j;
import com.badlogic.gdx.graphics.g3d.utils.i;
import com.badlogic.gdx.graphics.g3d.utils.m;
import com.badlogic.gdx.graphics.n;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.c0;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.math.t;
import com.badlogic.gdx.utils.v;
import com.badlogic.gdx.utils.x;
import com.planner5d.library.engine.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f94465d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.badlogic.gdx.graphics.glutils.j f94469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f94470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f94471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f94472k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.badlogic.gdx.utils.b<String> f94462a = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.badlogic.gdx.utils.b<e> f94463b = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.badlogic.gdx.utils.b<c> f94464c = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v f94466e = new v();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v f94467f = new v();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f94468g = new x();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v f94473l = new v();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.badlogic.gdx.graphics.g3d.b f94474m = new com.badlogic.gdx.graphics.g3d.b();

    /* JADX INFO: renamed from: com.badlogic.gdx.graphics.g3d.shaders.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0839a implements c {
        @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
        public boolean a(a aVar, int i10) {
            return true;
        }
    }

    public static abstract class b implements c {
        @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
        public boolean a(a aVar, int i10) {
            return false;
        }
    }

    public interface c {
        boolean a(a aVar, int i10);

        void b(a aVar, int i10, h hVar, com.badlogic.gdx.graphics.g3d.b bVar);
    }

    public interface e {
        boolean a(a aVar, int i10, h hVar);
    }

    private final int[] a(n nVar) {
        this.f94473l.f();
        int size = nVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f94473l.a(this.f94468g.p(nVar.p(i10).j(), -1));
        }
        return this.f94473l.f95784a;
    }

    public final boolean A(int i10, float f10, float f11, float f12) {
        int i11 = this.f94465d[i10];
        if (i11 < 0) {
            return false;
        }
        this.f94469h.b1(i11, f10, f11, f12);
        return true;
    }

    public final boolean B(int i10, float f10, float f11, float f12, float f13) {
        int i11 = this.f94465d[i10];
        if (i11 < 0) {
            return false;
        }
        this.f94469h.e1(i11, f10, f11, f12, f13);
        return true;
    }

    @Override // com.badlogic.gdx.graphics.g3d.j
    public void B1(g gVar, i iVar) {
        this.f94471j = gVar;
        this.f94470i = iVar;
        this.f94469h.s();
        this.f94472k = null;
        int i10 = 0;
        while (true) {
            v vVar = this.f94466e;
            if (i10 >= vVar.f95785b) {
                return;
            }
            com.badlogic.gdx.utils.b<c> bVar = this.f94464c;
            int iJ = vVar.j(i10);
            if (bVar.get(iJ) != null) {
                this.f94464c.get(iJ).b(this, iJ, null, null);
            }
            i10++;
        }
    }

    public final boolean C(int i10, int i11) {
        int i12 = this.f94465d[i10];
        if (i12 < 0) {
            return false;
        }
        this.f94469h.D1(i12, i11);
        return true;
    }

    public final boolean D(int i10, int i11, int i12) {
        int i13 = this.f94465d[i10];
        if (i13 < 0) {
            return false;
        }
        this.f94469h.E1(i13, i11, i12);
        return true;
    }

    public final boolean E(int i10, int i11, int i12, int i13) {
        int i14 = this.f94465d[i10];
        if (i14 < 0) {
            return false;
        }
        this.f94469h.F1(i14, i11, i12, i13);
        return true;
    }

    public final boolean F(int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.f94465d[i10];
        if (i15 < 0) {
            return false;
        }
        this.f94469h.H1(i15, i11, i12, i13, i14);
        return true;
    }

    public final boolean G(int i10, com.badlogic.gdx.graphics.b bVar) {
        int i11 = this.f94465d[i10];
        if (i11 < 0) {
            return false;
        }
        this.f94469h.f1(i11, bVar);
        return true;
    }

    public final boolean H(int i10, com.badlogic.gdx.graphics.e eVar) {
        int i11 = this.f94465d[i10];
        if (i11 < 0) {
            return false;
        }
        this.f94469h.D1(i11, this.f94470i.f94676a.a(eVar));
        return true;
    }

    public final boolean I(int i10, m mVar) {
        int i11 = this.f94465d[i10];
        if (i11 < 0) {
            return false;
        }
        this.f94469h.D1(i11, this.f94470i.f94676a.d(mVar));
        return true;
    }

    public final boolean J(int i10, t tVar) {
        int i11 = this.f94465d[i10];
        if (i11 < 0) {
            return false;
        }
        this.f94469h.r0(i11, tVar);
        return true;
    }

    public final boolean K(int i10, Matrix4 matrix4) {
        int i11 = this.f94465d[i10];
        if (i11 < 0) {
            return false;
        }
        this.f94469h.v0(i11, matrix4);
        return true;
    }

    public final boolean N(int i10, c0 c0Var) {
        int i11 = this.f94465d[i10];
        if (i11 < 0) {
            return false;
        }
        this.f94469h.g1(i11, c0Var);
        return true;
    }

    @Override // com.badlogic.gdx.graphics.g3d.j
    public void N0(h hVar) {
        if (!hVar.f94423b.f94211d && hVar.f94422a.f() != 0.0f) {
            this.f94474m.clear();
            com.badlogic.gdx.graphics.g3d.c cVar = hVar.f94428g;
            if (cVar != null) {
                this.f94474m.m2(cVar);
            }
            com.badlogic.gdx.graphics.g3d.d dVar = hVar.f94427f;
            if (dVar != null) {
                this.f94474m.m2(dVar);
            }
            x(hVar, this.f94474m);
        }
    }

    public final boolean P(int i10, d0 d0Var) {
        int i11 = this.f94465d[i10];
        if (i11 < 0) {
            return false;
        }
        this.f94469h.h1(i11, d0Var);
        return true;
    }

    public final boolean Q(int i10, com.planner5d.library.math.m mVar) {
        int i11 = this.f94465d[i10];
        if (i11 < 0) {
            return false;
        }
        this.f94469h.b1(i11, mVar.f180482a, mVar.f180483b, mVar.f180484c);
        return true;
    }

    public final boolean X(int i10, float[] fArr) {
        int i11 = this.f94465d[i10];
        if (i11 < 0) {
            return false;
        }
        this.f94469h.x0(i11, fArr);
        return true;
    }

    public String b(int i10) {
        return this.f94462a.get(i10);
    }

    @Override // gc.e
    public void dispose() {
        this.f94469h = null;
        this.f94462a.clear();
        this.f94463b.clear();
        this.f94464c.clear();
        this.f94467f.f();
        this.f94466e.f();
        this.f94465d = null;
    }

    public int e(String str) {
        int i10 = this.f94462a.f95174b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f94462a.get(i11).equals(str)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.badlogic.gdx.graphics.g3d.j
    public void end() {
        f fVar = this.f94472k;
        if (fVar != null) {
            fVar.K0(this.f94469h, this.f94473l.f95784a);
            int i10 = 2 >> 0;
            this.f94472k = null;
        }
        this.f94469h.end();
    }

    public final boolean f(int i10) {
        if (i10 < 0) {
            return false;
        }
        int[] iArr = this.f94465d;
        return i10 < iArr.length && iArr[i10] >= 0;
    }

    public void g(com.badlogic.gdx.graphics.glutils.j jVar, h hVar) {
        if (this.f94465d != null) {
            throw new com.badlogic.gdx.utils.t("Already initialized");
        }
        if (!jVar.P()) {
            throw new com.badlogic.gdx.utils.t(jVar.D());
        }
        this.f94469h = jVar;
        int i10 = this.f94462a.f95174b;
        this.f94465d = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            String str = this.f94462a.get(i11);
            e eVar = this.f94463b.get(i11);
            c cVar = this.f94464c.get(i11);
            if (eVar == null || eVar.a(this, i11, hVar)) {
                this.f94465d[i11] = jVar.u(str, false);
                if (this.f94465d[i11] >= 0 && cVar != null) {
                    if (cVar.a(this, i11)) {
                        this.f94466e.a(i11);
                    } else {
                        this.f94467f.a(i11);
                    }
                }
            } else {
                this.f94465d[i11] = -1;
            }
            if (this.f94465d[i11] < 0) {
                this.f94463b.L(i11, null);
                this.f94464c.L(i11, null);
            }
        }
        if (hVar != null) {
            n nVarX = hVar.f94423b.x();
            int size = nVarX.size();
            for (int i12 = 0; i12 < size; i12++) {
                com.badlogic.gdx.graphics.m mVarP = nVarX.p(i12);
                int iY = jVar.y(mVarP.f94829f);
                if (iY >= 0) {
                    this.f94468g.B(mVarP.j(), iY);
                }
            }
        }
    }

    public final int h(int i10) {
        if (i10 >= 0) {
            int[] iArr = this.f94465d;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
        }
        return -1;
    }

    public int i(d dVar) {
        return j(dVar, null);
    }

    public int j(d dVar, c cVar) {
        return u(dVar.f94475a, dVar, cVar);
    }

    public int m(String str) {
        return u(str, null, null);
    }

    public int o(String str, c cVar) {
        return u(str, null, cVar);
    }

    public int q(String str, e eVar) {
        return u(str, eVar, null);
    }

    public int u(String str, e eVar, c cVar) {
        if (this.f94465d != null) {
            throw new com.badlogic.gdx.utils.t("Cannot register an uniform after initialization");
        }
        int iE = e(str);
        if (iE >= 0) {
            this.f94463b.L(iE, eVar);
            this.f94464c.L(iE, cVar);
            return iE;
        }
        this.f94462a.c(str);
        this.f94463b.c(eVar);
        this.f94464c.c(cVar);
        return this.f94462a.f95174b - 1;
    }

    public void x(h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
        if (hVar.f94423b.f94211d) {
            return;
        }
        int i10 = 0;
        while (true) {
            v vVar = this.f94467f;
            if (i10 >= vVar.f95785b) {
                break;
            }
            com.badlogic.gdx.utils.b<c> bVar2 = this.f94464c;
            int iJ = vVar.j(i10);
            if (bVar2.get(iJ) != null) {
                this.f94464c.get(iJ).b(this, iJ, hVar, bVar);
            }
            i10++;
        }
        f fVar = this.f94472k;
        if (fVar != hVar.f94423b) {
            if (fVar != null) {
                fVar.K0(this.f94469h, this.f94473l.f95784a);
            }
            f fVar2 = hVar.f94423b;
            this.f94472k = fVar2;
            fVar2.t1(this.f94469h, a(fVar2.x()));
        }
        hVar.f94423b.F(hVar.f94426e, hVar.f94424c, hVar.f94425d);
    }

    public final boolean y(int i10, float f10) {
        int i11 = this.f94465d[i10];
        if (i11 < 0) {
            return false;
        }
        this.f94469h.Y0(i11, f10);
        return true;
    }

    public final boolean z(int i10, float f10, float f11) {
        int i11 = this.f94465d[i10];
        if (i11 < 0) {
            return false;
        }
        this.f94469h.Z0(i11, f10, f11);
        return true;
    }

    public static class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f94476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f94477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f94478d;

        public d(String str, long j10, long j11, long j12) {
            this.f94475a = str;
            this.f94476b = j10;
            this.f94477c = j11;
            this.f94478d = j12;
        }

        @Override // com.badlogic.gdx.graphics.g3d.shaders.a.e
        public boolean a(a aVar, int i10, h hVar) {
            com.badlogic.gdx.graphics.g3d.c cVar;
            com.badlogic.gdx.graphics.g3d.d dVar;
            long jZ1 = 0;
            long jZ2 = (hVar == null || (dVar = hVar.f94427f) == null) ? 0L : dVar.Z1();
            if (hVar != null && (cVar = hVar.f94428g) != null) {
                jZ1 = cVar.Z1();
            }
            long j10 = this.f94476b;
            if ((jZ2 & j10) != j10) {
                return false;
            }
            long j11 = this.f94477c;
            if ((jZ1 & j11) != j11) {
                return false;
            }
            long j12 = jZ1 | jZ2;
            long j13 = this.f94478d;
            return (j12 & j13) == j13;
        }

        public d(String str, long j10, long j11) {
            this(str, j10, j11, 0L);
        }

        public d(String str, long j10) {
            this(str, 0L, 0L, j10);
        }

        public d(String str) {
            this(str, 0L, 0L);
        }
    }
}
