package com.badlogic.gdx.graphics.g3d;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.math.y;
import com.badlogic.gdx.utils.k0;
import com.badlogic.gdx.utils.o0;
import com.planner5d.library.engine.util.math.k;
import com.planner5d.library.math.m;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class g implements i, cc.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f94413i = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.utils.b<d> f94414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.c> f94415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.a> f94416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f94417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Matrix4 f94418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f94419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f94420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k0<com.badlogic.gdx.graphics.g3d.model.f, com.badlogic.gdx.utils.c<com.badlogic.gdx.graphics.g3d.model.c, Matrix4>> f94421h;

    public g(e eVar) {
        this(eVar, (String[]) null);
    }

    private Float B(com.badlogic.gdx.graphics.g3d.model.c cVar, float[] fArr, String str, k kVar, m mVar) {
        Iterator<com.badlogic.gdx.graphics.g3d.model.c> it = cVar.n().iterator();
        com.badlogic.gdx.graphics.f fVar = null;
        Float fValueOf = null;
        while (it.hasNext()) {
            fValueOf = B(it.next(), fArr, str, kVar, mVar);
        }
        float[] fArr2 = null;
        short[] sArr = null;
        com.badlogic.gdx.graphics.m mVar2 = null;
        int i10 = 0;
        for (com.badlogic.gdx.graphics.g3d.model.f fVar2 : cVar.f94448i) {
            com.badlogic.gdx.graphics.g3d.model.b bVar = fVar2.f94457a;
            if (bVar.f94436b == 4 && (str == null || !str.equals(bVar.f94435a))) {
                com.badlogic.gdx.graphics.g3d.model.b bVar2 = fVar2.f94457a;
                com.badlogic.gdx.graphics.f fVar3 = bVar2.f94439e;
                int i11 = bVar2.f94437c + bVar2.f94438d;
                if (fVar == null || fVar != fVar3) {
                    int iY = fVar3.y() / 4;
                    com.badlogic.gdx.graphics.m mVarU = fVar3.u(1);
                    float[] fArr3 = new float[fVar3.A0() * iY];
                    short[] sArr2 = new short[fVar3.v1()];
                    fVar3.i(sArr2);
                    fVar3.B(fArr3);
                    mVar2 = mVarU;
                    fArr2 = fArr3;
                    sArr = sArr2;
                    i10 = iY;
                    fVar = fVar3;
                }
                int i12 = fVar2.f94457a.f94437c;
                while (i12 < i11) {
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < 3) {
                        int i15 = i12 + 1;
                        Float f10 = fValueOf;
                        int i16 = (sArr[i12] * i10) + mVar2.f94828e;
                        if (i16 >= 0) {
                            float[] fArr4 = this.f94420g;
                            fArr4[i14] = fArr2[i16];
                            int i17 = i14 + 2;
                            fArr4[i14 + 1] = fArr2[i16 + 1];
                            i14 += 3;
                            fArr4[i17] = fArr2[i16 + 2];
                        }
                        i13++;
                        i12 = i15;
                        fValueOf = f10;
                    }
                    Float f11 = fValueOf;
                    com.planner5d.library.engine.util.math.Matrix4.prj(fArr, this.f94420g, 0, 3, 3);
                    if (com.planner5d.library.engine.util.math.d.h(kVar, this.f94420g, mVar)) {
                        float fW = mVar.H0(kVar.f165515a).w();
                        if (f11 == null || fW < f11.floatValue()) {
                            fValueOf = Float.valueOf(fW);
                        }
                    }
                    fValueOf = f11;
                }
            }
        }
        return fValueOf;
    }

    private void G(Iterable<com.badlogic.gdx.graphics.g3d.model.c> iterable, d dVar, d dVar2) {
        for (com.badlogic.gdx.graphics.g3d.model.c cVar : iterable) {
            int i10 = 0;
            while (true) {
                com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.f> bVar = cVar.f94448i;
                if (i10 < bVar.f95174b) {
                    com.badlogic.gdx.graphics.g3d.model.f fVar = bVar.get(i10);
                    if (fVar.f94458b == dVar) {
                        fVar.f94458b = dVar2;
                    }
                    i10++;
                }
            }
            G(cVar.n(), dVar, dVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void H() {
        k0.a<com.badlogic.gdx.graphics.g3d.model.f, com.badlogic.gdx.utils.c<com.badlogic.gdx.graphics.g3d.model.c, Matrix4>> it = this.f94421h.m().iterator();
        while (it.hasNext()) {
            k0.b next = it.next();
            K k10 = next.f95630a;
            if (((com.badlogic.gdx.graphics.g3d.model.f) k10).f94459c == null) {
                ((com.badlogic.gdx.graphics.g3d.model.f) k10).f94459c = new com.badlogic.gdx.utils.c<>(true, ((com.badlogic.gdx.utils.c) next.f95631b).f95211c, com.badlogic.gdx.graphics.g3d.model.c.class, Matrix4.class);
            }
            ((com.badlogic.gdx.graphics.g3d.model.f) next.f95630a).f94459c.clear();
            for (k0.b bVar : ((com.badlogic.gdx.utils.c) next.f95631b).l()) {
                ((com.badlogic.gdx.graphics.g3d.model.f) next.f95630a).f94459c.D(y(((com.badlogic.gdx.graphics.g3d.model.c) bVar.f95630a).f94440a), (Matrix4) bVar.f95631b);
            }
            ((com.badlogic.gdx.graphics.g3d.model.f) next.f95630a).f94460d = new Matrix4[((com.badlogic.gdx.utils.c) next.f95631b).f95211c];
            int i10 = 0;
            while (true) {
                K k11 = next.f95630a;
                if (i10 < ((com.badlogic.gdx.graphics.g3d.model.f) k11).f94460d.length) {
                    ((com.badlogic.gdx.graphics.g3d.model.f) k11).f94460d[i10] = new Matrix4();
                    i10++;
                }
            }
        }
    }

    private void n(Iterable<com.badlogic.gdx.graphics.g3d.model.a> iterable, boolean z10) {
        for (com.badlogic.gdx.graphics.g3d.model.a aVar : iterable) {
            com.badlogic.gdx.graphics.g3d.model.a aVar2 = new com.badlogic.gdx.graphics.g3d.model.a();
            aVar2.f94432a = aVar.f94432a;
            aVar2.f94433b = aVar.f94433b;
            for (com.badlogic.gdx.graphics.g3d.model.d dVar : aVar.f94434c) {
                com.badlogic.gdx.graphics.g3d.model.c cVarY = y(dVar.f94451a.f94440a);
                if (cVarY != null) {
                    com.badlogic.gdx.graphics.g3d.model.d dVar2 = new com.badlogic.gdx.graphics.g3d.model.d();
                    dVar2.f94451a = cVarY;
                    if (z10) {
                        dVar2.f94452b = dVar.f94452b;
                        dVar2.f94453c = dVar.f94453c;
                        dVar2.f94454d = dVar.f94454d;
                    } else {
                        if (dVar.f94452b != null) {
                            dVar2.f94452b = new com.badlogic.gdx.utils.b<>();
                            for (com.badlogic.gdx.graphics.g3d.model.e<d0> eVar : dVar.f94452b) {
                                dVar2.f94452b.c(new com.badlogic.gdx.graphics.g3d.model.e<>(eVar.f94455a, eVar.f94456b));
                            }
                        }
                        if (dVar.f94453c != null) {
                            dVar2.f94453c = new com.badlogic.gdx.utils.b<>();
                            for (com.badlogic.gdx.graphics.g3d.model.e<y> eVar2 : dVar.f94453c) {
                                dVar2.f94453c.c(new com.badlogic.gdx.graphics.g3d.model.e<>(eVar2.f94455a, eVar2.f94456b));
                            }
                        }
                        if (dVar.f94454d != null) {
                            dVar2.f94454d = new com.badlogic.gdx.utils.b<>();
                            for (com.badlogic.gdx.graphics.g3d.model.e<d0> eVar3 : dVar.f94454d) {
                                dVar2.f94454d.c(new com.badlogic.gdx.graphics.g3d.model.e<>(eVar3.f94455a, eVar3.f94456b));
                            }
                        }
                    }
                    if (dVar2.f94452b != null || dVar2.f94453c != null || dVar2.f94454d != null) {
                        aVar2.f94434c.c(dVar2);
                    }
                }
            }
            if (aVar2.f94434c.f95174b > 0) {
                this.f94416c.c(aVar2);
            }
        }
    }

    private com.badlogic.gdx.graphics.g3d.model.c o(com.badlogic.gdx.graphics.g3d.model.c cVar) {
        com.badlogic.gdx.graphics.g3d.model.c cVar2 = new com.badlogic.gdx.graphics.g3d.model.c();
        cVar2.f94440a = cVar.f94440a;
        cVar2.f94441b = cVar.f94441b;
        cVar2.f94443d.L(cVar.f94443d);
        cVar2.f94444e.N(cVar.f94444e);
        cVar2.f94445f.L(cVar.f94445f);
        cVar2.f94446g.N(cVar.f94446g);
        cVar2.f94447h.N(cVar.f94447h);
        Iterator<com.badlogic.gdx.graphics.g3d.model.f> it = cVar.f94448i.iterator();
        while (it.hasNext()) {
            cVar2.f94448i.c(p(it.next()));
        }
        Iterator<com.badlogic.gdx.graphics.g3d.model.c> it2 = cVar.n().iterator();
        while (it2.hasNext()) {
            cVar2.a(o(it2.next()));
        }
        return cVar2;
    }

    private com.badlogic.gdx.graphics.g3d.model.f p(com.badlogic.gdx.graphics.g3d.model.f fVar) {
        com.badlogic.gdx.graphics.g3d.model.f fVar2 = new com.badlogic.gdx.graphics.g3d.model.f();
        com.badlogic.gdx.graphics.g3d.model.b bVar = new com.badlogic.gdx.graphics.g3d.model.b();
        fVar2.f94457a = bVar;
        com.badlogic.gdx.graphics.g3d.model.b bVar2 = fVar.f94457a;
        bVar.f94435a = bVar2.f94435a;
        bVar.f94437c = bVar2.f94437c;
        bVar.f94438d = bVar2.f94438d;
        bVar.f94436b = bVar2.f94436b;
        bVar.f94439e = bVar2.f94439e;
        com.badlogic.gdx.utils.c<com.badlogic.gdx.graphics.g3d.model.c, Matrix4> cVar = fVar.f94459c;
        if (cVar != null) {
            this.f94421h.C(fVar2, cVar);
        }
        int iP = this.f94414a.p(fVar.f94458b, false);
        if (iP >= 0) {
            fVar2.f94458b = this.f94414a.get(iP);
            return fVar2;
        }
        com.badlogic.gdx.utils.b<d> bVar3 = this.f94414a;
        d dVar = new d(fVar.f94458b);
        fVar2.f94458b = dVar;
        bVar3.c(dVar);
        return fVar2;
    }

    private void q(com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.c> bVar) {
        this.f94421h.clear();
        int i10 = bVar.f95174b;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f94415b.c(o(bVar.get(i11)));
        }
        H();
    }

    private void r(com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.c> bVar, com.badlogic.gdx.utils.b<String> bVar2) {
        this.f94421h.clear();
        int i10 = bVar.f95174b;
        for (int i11 = 0; i11 < i10; i11++) {
            com.badlogic.gdx.graphics.g3d.model.c cVar = bVar.get(i11);
            Iterator<String> it = bVar2.iterator();
            while (it.hasNext()) {
                if (it.next().equals(cVar.f94440a)) {
                    this.f94415b.c(o(cVar));
                    break;
                }
            }
        }
        H();
    }

    private void s(com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.c> bVar, String... strArr) {
        this.f94421h.clear();
        int i10 = bVar.f95174b;
        for (int i11 = 0; i11 < i10; i11++) {
            com.badlogic.gdx.graphics.g3d.model.c cVar = bVar.get(i11);
            for (String str : strArr) {
                if (str.equals(cVar.f94440a)) {
                    this.f94415b.c(o(cVar));
                    break;
                }
            }
        }
        H();
    }

    public com.badlogic.gdx.graphics.g3d.model.c A(String str, boolean z10, boolean z11) {
        return com.badlogic.gdx.graphics.g3d.model.c.o(this.f94415b, str, z10, z11);
    }

    public h C(h hVar) {
        return D(hVar, this.f94415b.get(0));
    }

    public h D(h hVar, com.badlogic.gdx.graphics.g3d.model.c cVar) {
        return E(hVar, cVar, cVar.f94448i.get(0));
    }

    public h E(h hVar, com.badlogic.gdx.graphics.g3d.model.c cVar, com.badlogic.gdx.graphics.g3d.model.f fVar) {
        Matrix4 matrix4;
        fVar.a(hVar);
        if (fVar.f94460d != null || (matrix4 = this.f94418e) == null) {
            Matrix4 matrix5 = this.f94418e;
            if (matrix5 != null) {
                hVar.f94422a.N(matrix5);
            } else {
                hVar.f94422a.t();
            }
        } else {
            hVar.f94422a.N(matrix4).w(cVar.f94447h);
        }
        hVar.f94431j = this.f94419f;
        return hVar;
    }

    protected void F(com.badlogic.gdx.graphics.g3d.model.c cVar, com.badlogic.gdx.utils.b<h> bVar, o0<h> o0Var) {
        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.f> bVar2 = cVar.f94448i;
        if (bVar2.f95174b > 0) {
            for (com.badlogic.gdx.graphics.g3d.model.f fVar : bVar2) {
                if (fVar.f94461e) {
                    bVar.c(E(o0Var.f(), cVar, fVar));
                }
            }
        }
        Iterator<com.badlogic.gdx.graphics.g3d.model.c> it = cVar.n().iterator();
        while (it.hasNext()) {
            F(it.next(), bVar, o0Var);
        }
    }

    @Override // cc.c
    @NonNull
    public <T extends bc.b> Iterable<T> a() {
        return this.f94414a;
    }

    @Override // cc.c
    @NonNull
    public cc.c b() {
        return new g(this);
    }

    @Override // cc.c
    public void c(@NonNull float[] fArr) {
        this.f94418e.S(fArr);
    }

    @Override // cc.c
    public void e(@p0 Object obj) {
        this.f94419f = obj;
    }

    @Override // com.badlogic.gdx.graphics.g3d.i
    public void f(com.badlogic.gdx.utils.b<h> bVar, o0<h> o0Var) {
        Iterator<com.badlogic.gdx.graphics.g3d.model.c> it = this.f94415b.iterator();
        while (it.hasNext()) {
            F(it.next(), bVar, o0Var);
        }
    }

    @Override // cc.c
    public Float g(String str, k kVar, m mVar, Runnable runnable) {
        g gVar;
        String str2;
        k kVar2;
        m mVar2;
        Float fB;
        Iterator<com.badlogic.gdx.graphics.g3d.model.c> it = this.f94415b.iterator();
        Float f10 = null;
        while (it.hasNext()) {
            try {
                gVar = this;
                str2 = str;
                kVar2 = kVar;
                mVar2 = mVar;
                try {
                    fB = gVar.B(it.next(), this.f94418e.s(), str2, kVar2, mVar2);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    runnable.run();
                    fB = null;
                }
            } catch (ArrayIndexOutOfBoundsException unused2) {
                gVar = this;
                str2 = str;
                kVar2 = kVar;
                mVar2 = mVar;
            }
            if (f10 == null || (fB != null && fB.floatValue() < f10.floatValue())) {
                f10 = fB;
            }
            this = gVar;
            str = str2;
            kVar = kVar2;
            mVar = mVar2;
        }
        return f10;
    }

    @Override // cc.c
    public void h(int i10) {
        com.badlogic.gdx.utils.b<d> bVar = this.f94414a;
        if (i10 < bVar.f95174b) {
            d dVar = bVar.get(i10);
            com.badlogic.gdx.utils.b<d> bVar2 = this.f94414a;
            d dVar2 = d.f94379l;
            bVar2.L(i10, dVar2);
            G(this.f94415b, dVar, dVar2);
        }
    }

    @Override // cc.c
    public int i() {
        return this.f94414a.f95174b;
    }

    @Override // cc.c
    @NonNull
    public m j() {
        return this.f94418e.q();
    }

    public com.planner5d.library.engine.util.math.b k(com.planner5d.library.engine.util.math.b bVar) {
        bVar.A();
        return t(bVar);
    }

    public void l() {
        int i10 = this.f94415b.f95174b;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f94415b.get(i11).f(true);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            this.f94415b.get(i12).d(true);
        }
    }

    public g m() {
        return new g(this);
    }

    public com.planner5d.library.engine.util.math.b t(com.planner5d.library.engine.util.math.b bVar) {
        int i10 = this.f94415b.f95174b;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f94415b.get(i11).i(bVar);
        }
        return bVar;
    }

    public com.badlogic.gdx.graphics.g3d.model.a u(String str) {
        return v(str, true);
    }

    public com.badlogic.gdx.graphics.g3d.model.a v(String str, boolean z10) {
        int i10 = this.f94416c.f95174b;
        int i11 = 0;
        if (z10) {
            while (i11 < i10) {
                com.badlogic.gdx.graphics.g3d.model.a aVar = this.f94416c.get(i11);
                if (aVar.f94432a.equalsIgnoreCase(str)) {
                    return aVar;
                }
                i11++;
            }
            return null;
        }
        while (i11 < i10) {
            com.badlogic.gdx.graphics.g3d.model.a aVar2 = this.f94416c.get(i11);
            if (aVar2.f94432a.equals(str)) {
                return aVar2;
            }
            i11++;
        }
        return null;
    }

    @Override // cc.c
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public d d(String str) {
        return x(str, true);
    }

    public d x(String str, boolean z10) {
        int i10 = this.f94414a.f95174b;
        int i11 = 0;
        if (z10) {
            while (i11 < i10) {
                d dVar = this.f94414a.get(i11);
                if (dVar.f94382f.equalsIgnoreCase(str)) {
                    return dVar;
                }
                i11++;
            }
        } else {
            while (i11 < i10) {
                d dVar2 = this.f94414a.get(i11);
                if (dVar2.f94382f.equals(str)) {
                    return dVar2;
                }
                i11++;
            }
        }
        return null;
    }

    public com.badlogic.gdx.graphics.g3d.model.c y(String str) {
        return z(str, true);
    }

    public com.badlogic.gdx.graphics.g3d.model.c z(String str, boolean z10) {
        return A(str, z10, false);
    }

    public g(e eVar, String str, boolean z10) {
        this(eVar, null, str, false, false, z10);
    }

    public g(e eVar, Matrix4 matrix4, String str, boolean z10) {
        this(eVar, matrix4, str, false, false, z10);
    }

    public g(e eVar, String str, boolean z10, boolean z11) {
        this(eVar, null, str, true, z10, z11);
    }

    public g(e eVar, Matrix4 matrix4, String str, boolean z10, boolean z11) {
        this(eVar, matrix4, str, true, z10, z11);
    }

    public g(e eVar, String str, boolean z10, boolean z11, boolean z12) {
        this(eVar, null, str, z10, z11, z12);
    }

    public g(e eVar, Matrix4 matrix4, String str, boolean z10, boolean z11, boolean z12) {
        this(eVar, matrix4, str, z10, z11, z12, f94413i);
    }

    public g(e eVar, Matrix4 matrix4, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f94414a = new com.badlogic.gdx.utils.b<>();
        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.c> bVar = new com.badlogic.gdx.utils.b<>();
        this.f94415b = bVar;
        this.f94416c = new com.badlogic.gdx.utils.b<>();
        this.f94420g = new float[9];
        this.f94421h = new k0<>();
        this.f94417d = eVar;
        this.f94418e = matrix4 == null ? new Matrix4() : matrix4;
        this.f94421h.clear();
        com.badlogic.gdx.graphics.g3d.model.c cVarU = eVar.u(str, z10);
        com.badlogic.gdx.graphics.g3d.model.c cVarO = o(cVarU);
        bVar.c(cVarO);
        if (z12) {
            this.f94418e.w(z11 ? cVarU.f94447h : cVarU.f94446g);
            cVarO.f94443d.y0(0.0f, 0.0f, 0.0f);
            cVarO.f94444e.z();
            cVarO.f94445f.y0(1.0f, 1.0f, 1.0f);
        } else if (z11 && cVarO.r()) {
            this.f94418e.w(cVarU.p().f94447h);
        }
        H();
        n(eVar.f94385c, z13);
        l();
    }

    public g(e eVar, String... strArr) {
        this(eVar, (Matrix4) null, strArr);
    }

    public g(e eVar, Matrix4 matrix4, String... strArr) {
        this.f94414a = new com.badlogic.gdx.utils.b<>();
        this.f94415b = new com.badlogic.gdx.utils.b<>();
        this.f94416c = new com.badlogic.gdx.utils.b<>();
        this.f94420g = new float[9];
        this.f94421h = new k0<>();
        this.f94417d = eVar;
        this.f94418e = matrix4 == null ? new Matrix4() : matrix4;
        if (strArr == null) {
            q(eVar.f94384b);
        } else {
            s(eVar.f94384b, strArr);
        }
        n(eVar.f94385c, f94413i);
        l();
    }

    public g(e eVar, com.badlogic.gdx.utils.b<String> bVar) {
        this(eVar, (Matrix4) null, bVar);
    }

    public g(e eVar, Matrix4 matrix4, com.badlogic.gdx.utils.b<String> bVar) {
        this(eVar, matrix4, bVar, f94413i);
    }

    public g(e eVar, Matrix4 matrix4, com.badlogic.gdx.utils.b<String> bVar, boolean z10) {
        this.f94414a = new com.badlogic.gdx.utils.b<>();
        this.f94415b = new com.badlogic.gdx.utils.b<>();
        this.f94416c = new com.badlogic.gdx.utils.b<>();
        this.f94420g = new float[9];
        this.f94421h = new k0<>();
        this.f94417d = eVar;
        this.f94418e = matrix4 == null ? new Matrix4() : matrix4;
        r(eVar.f94384b, bVar);
        n(eVar.f94385c, z10);
        l();
    }

    public g(e eVar, d0 d0Var) {
        this(eVar);
        this.f94418e.m0(d0Var);
    }

    public g(e eVar, float f10, float f11, float f12) {
        this(eVar);
        this.f94418e.l0(f10, f11, f12);
    }

    public g(e eVar, Matrix4 matrix4) {
        this(eVar, matrix4, (String[]) null);
    }

    public g(g gVar) {
        this(gVar, gVar.f94418e.d());
    }

    public g(g gVar, Matrix4 matrix4) {
        this(gVar, matrix4, f94413i);
    }

    public g(g gVar, Matrix4 matrix4, boolean z10) {
        this.f94414a = new com.badlogic.gdx.utils.b<>();
        this.f94415b = new com.badlogic.gdx.utils.b<>();
        this.f94416c = new com.badlogic.gdx.utils.b<>();
        this.f94420g = new float[9];
        this.f94421h = new k0<>();
        this.f94417d = gVar.f94417d;
        this.f94418e = matrix4 == null ? new Matrix4() : matrix4;
        q(gVar.f94415b);
        n(gVar.f94416c, z10);
        l();
    }
}
