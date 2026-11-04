package com.badlogic.gdx.graphics.g3d;

import com.badlogic.gdx.graphics.g3d.utils.m;
import com.badlogic.gdx.graphics.g3d.utils.n;
import com.badlogic.gdx.graphics.k;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.c0;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.math.y;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.k0;
import com.badlogic.gdx.utils.t;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class e implements gc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.utils.b<d> f94383a = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.c> f94384b = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.a> f94385c = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.f> f94386d = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.b> f94387e = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final com.badlogic.gdx.utils.b<gc.e> f94388f = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k0<com.badlogic.gdx.graphics.g3d.model.f, com.badlogic.gdx.utils.c<String, Matrix4>> f94389g = new k0<>();

    public e() {
    }

    private void A(Iterable<u4.c> iterable, n nVar) {
        Iterator<u4.c> it = iterable.iterator();
        while (it.hasNext()) {
            this.f94383a.c(e(it.next(), nVar));
        }
    }

    private void B(com.planner5d.library.engine.a aVar, Iterable<u4.d> iterable) {
        Iterator<u4.d> it = iterable.iterator();
        while (it.hasNext()) {
            f(aVar, it.next());
        }
    }

    private com.badlogic.gdx.graphics.g3d.model.c C(u4.f fVar) {
        com.badlogic.gdx.graphics.g3d.model.b next;
        com.badlogic.gdx.graphics.g3d.model.c cVar = new com.badlogic.gdx.graphics.g3d.model.c();
        cVar.f94440a = fVar.f381147a;
        d0 d0Var = fVar.f381149c;
        if (d0Var != null) {
            cVar.f94443d.L(d0Var);
        }
        y yVar = fVar.f381150d;
        if (yVar != null) {
            cVar.f94444e.N(yVar);
        }
        d0 d0Var2 = fVar.f381151e;
        if (d0Var2 != null) {
            cVar.f94445f.L(d0Var2);
        }
        u4.i[] iVarArr = fVar.f381153g;
        if (iVarArr != null) {
            for (u4.i iVar : iVarArr) {
                d dVar = null;
                if (iVar.f381162b == null) {
                    next = null;
                    break;
                }
                Iterator<com.badlogic.gdx.graphics.g3d.model.b> it = this.f94387e.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!iVar.f381162b.equals(next.f94435a));
                if (iVar.f381161a != null) {
                    for (d dVar2 : this.f94383a) {
                        if (iVar.f381161a.equals(dVar2.f94382f)) {
                            dVar = dVar2;
                            break;
                        }
                    }
                }
                if (next == null || dVar == null) {
                    throw new t("Invalid node: " + cVar.f94440a);
                }
                com.badlogic.gdx.graphics.g3d.model.f fVar2 = new com.badlogic.gdx.graphics.g3d.model.f();
                fVar2.f94457a = next;
                fVar2.f94458b = dVar;
                cVar.f94448i.c(fVar2);
                com.badlogic.gdx.utils.c<String, Matrix4> cVar2 = iVar.f381163c;
                if (cVar2 != null) {
                    this.f94389g.C(fVar2, cVar2);
                }
            }
        }
        u4.f[] fVarArr = fVar.f381154h;
        if (fVarArr != null) {
            for (u4.f fVar3 : fVarArr) {
                cVar.a(C(fVar3));
            }
        }
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void D(Iterable<u4.f> iterable) {
        this.f94389g.clear();
        Iterator<u4.f> it = iterable.iterator();
        while (it.hasNext()) {
            this.f94384b.c(C(it.next()));
        }
        k0.a<com.badlogic.gdx.graphics.g3d.model.f, com.badlogic.gdx.utils.c<String, Matrix4>> it2 = this.f94389g.m().iterator();
        while (it2.hasNext()) {
            k0.b next = it2.next();
            K k10 = next.f95630a;
            if (((com.badlogic.gdx.graphics.g3d.model.f) k10).f94459c == null) {
                ((com.badlogic.gdx.graphics.g3d.model.f) k10).f94459c = new com.badlogic.gdx.utils.c<>(com.badlogic.gdx.graphics.g3d.model.c.class, Matrix4.class);
            }
            ((com.badlogic.gdx.graphics.g3d.model.f) next.f95630a).f94459c.clear();
            for (k0.b bVar : ((com.badlogic.gdx.utils.c) next.f95631b).l()) {
                ((com.badlogic.gdx.graphics.g3d.model.f) next.f95630a).f94459c.D(q((String) bVar.f95630a), new Matrix4((Matrix4) bVar.f95631b).u());
            }
        }
    }

    private d e(u4.c cVar, n nVar) {
        k kVarC;
        d dVar = new d(cVar.f381127a);
        if (cVar.f381129c != null) {
            dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.b(com.badlogic.gdx.graphics.g3d.attributes.b.f94310j, cVar.f381129c));
        }
        if (cVar.f381130d != null) {
            dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.b(com.badlogic.gdx.graphics.g3d.attributes.b.f94306f, cVar.f381130d));
        }
        if (cVar.f381131e != null) {
            dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.b(com.badlogic.gdx.graphics.g3d.attributes.b.f94308h, cVar.f381131e));
        }
        if (cVar.f381132f != null) {
            dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.b(com.badlogic.gdx.graphics.g3d.attributes.b.f94312l, cVar.f381132f));
        }
        if (cVar.f381133g != null) {
            dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.b(com.badlogic.gdx.graphics.g3d.attributes.b.f94314n, cVar.f381133g));
        }
        if (cVar.f381134h > 0.0f) {
            dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.f(com.badlogic.gdx.graphics.g3d.attributes.f.f94336f, cVar.f381134h));
        }
        if (cVar.f381135i != 1.0f) {
            dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.a(770, 771, cVar.f381135i));
        }
        k0 k0Var = new k0();
        com.badlogic.gdx.utils.b<u4.j> bVar = cVar.f381136j;
        if (bVar != null) {
            for (u4.j jVar : bVar) {
                if (k0Var.d(jVar.f381177b)) {
                    kVarC = (k) k0Var.p(jVar.f381177b);
                } else {
                    kVarC = nVar.c(jVar.f381177b);
                    k0Var.C(jVar.f381177b, kVarC);
                    this.f94388f.c(kVarC);
                }
                m mVar = new m(kVarC);
                mVar.f94686b = kVarC.h();
                mVar.f94687c = kVarC.g();
                mVar.f94688d = kVarC.j();
                mVar.f94689e = kVarC.m();
                c0 c0Var = jVar.f381178c;
                float f10 = c0Var == null ? 0.0f : c0Var.f94907a;
                float f11 = c0Var == null ? 0.0f : c0Var.f94908b;
                c0 c0Var2 = jVar.f381179d;
                float f12 = c0Var2 == null ? 1.0f : c0Var2.f94907a;
                float f13 = c0Var2 == null ? 1.0f : c0Var2.f94908b;
                int i10 = jVar.f381180e;
                if (i10 == 2) {
                    dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.j(com.badlogic.gdx.graphics.g3d.attributes.j.f94350k, mVar, f10, f11, f12, f13));
                } else if (i10 == 3) {
                    dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.j(com.badlogic.gdx.graphics.g3d.attributes.j.Y, mVar, f10, f11, f12, f13));
                } else if (i10 == 4) {
                    dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.j(com.badlogic.gdx.graphics.g3d.attributes.j.f94360w, mVar, f10, f11, f12, f13));
                } else if (i10 == 5) {
                    dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.j(com.badlogic.gdx.graphics.g3d.attributes.j.f94352m, mVar, f10, f11, f12, f13));
                } else if (i10 == 7) {
                    dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.j(com.badlogic.gdx.graphics.g3d.attributes.j.f94358t, mVar, f10, f11, f12, f13));
                } else if (i10 == 8) {
                    dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.j(com.badlogic.gdx.graphics.g3d.attributes.j.f94354o, mVar, f10, f11, f12, f13));
                } else if (i10 == 10) {
                    dVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.j(com.badlogic.gdx.graphics.g3d.attributes.j.f94355p0, mVar, f10, f11, f12, f13));
                }
            }
        }
        return dVar;
    }

    private void f(com.planner5d.library.engine.a aVar, u4.d dVar) {
        int length = 0;
        for (u4.e eVar : dVar.f381143d) {
            length += eVar.f381145b.length;
        }
        com.badlogic.gdx.graphics.n nVar = new com.badlogic.gdx.graphics.n(dVar.f381141b);
        com.badlogic.gdx.graphics.f fVar = new com.badlogic.gdx.graphics.f(aVar, dVar.f381142c.length / (nVar.f94833b / 4), length, nVar);
        this.f94386d.c(fVar);
        this.f94388f.c(fVar);
        BufferUtils.a(dVar.f381142c, fVar.C(), dVar.f381142c.length, 0);
        fVar.m().clear();
        int i10 = 0;
        for (u4.e eVar2 : dVar.f381143d) {
            com.badlogic.gdx.graphics.g3d.model.b bVar = new com.badlogic.gdx.graphics.g3d.model.b();
            bVar.f94435a = eVar2.f381144a;
            bVar.f94436b = eVar2.f381146c;
            bVar.f94437c = i10;
            bVar.f94438d = eVar2.f381145b.length;
            bVar.f94439e = fVar;
            fVar.m().put(eVar2.f381145b);
            i10 += bVar.f94438d;
            this.f94387e.c(bVar);
        }
        fVar.m().position(0);
    }

    private void y(com.planner5d.library.engine.a aVar, u4.b bVar, n nVar) {
        B(aVar, bVar.f381123c);
        A(bVar.f381124d, nVar);
        D(bVar.f381125e);
        z(bVar.f381126f);
        b();
    }

    private void z(Iterable<u4.a> iterable) {
        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<y>> bVar;
        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<d0>> bVar2;
        for (u4.a aVar : iterable) {
            com.badlogic.gdx.graphics.g3d.model.a aVar2 = new com.badlogic.gdx.graphics.g3d.model.a();
            aVar2.f94432a = aVar.f381119a;
            for (u4.g gVar : aVar.f381120b) {
                com.badlogic.gdx.graphics.g3d.model.c cVarQ = q(gVar.f381155a);
                if (cVarQ != null) {
                    com.badlogic.gdx.graphics.g3d.model.d dVar = new com.badlogic.gdx.graphics.g3d.model.d();
                    dVar.f94451a = cVarQ;
                    if (gVar.f381156b != null) {
                        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<d0>> bVar3 = new com.badlogic.gdx.utils.b<>();
                        dVar.f94452b = bVar3;
                        bVar3.n(gVar.f381156b.f95174b);
                        for (u4.h<d0> hVar : gVar.f381156b) {
                            float f10 = hVar.f381159a;
                            if (f10 > aVar2.f94433b) {
                                aVar2.f94433b = f10;
                            }
                            com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<d0>> bVar4 = dVar.f94452b;
                            d0 d0Var = hVar.f381160b;
                            bVar4.c(new com.badlogic.gdx.graphics.g3d.model.e<>(f10, new d0(d0Var == null ? cVarQ.f94443d : d0Var)));
                        }
                    }
                    if (gVar.f381157c != null) {
                        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<y>> bVar5 = new com.badlogic.gdx.utils.b<>();
                        dVar.f94453c = bVar5;
                        bVar5.n(gVar.f381157c.f95174b);
                        for (u4.h<y> hVar2 : gVar.f381157c) {
                            float f11 = hVar2.f381159a;
                            if (f11 > aVar2.f94433b) {
                                aVar2.f94433b = f11;
                            }
                            com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<y>> bVar6 = dVar.f94453c;
                            y yVar = hVar2.f381160b;
                            bVar6.c(new com.badlogic.gdx.graphics.g3d.model.e<>(f11, new y(yVar == null ? cVarQ.f94444e : yVar)));
                        }
                    }
                    if (gVar.f381158d != null) {
                        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<d0>> bVar7 = new com.badlogic.gdx.utils.b<>();
                        dVar.f94454d = bVar7;
                        bVar7.n(gVar.f381158d.f95174b);
                        for (u4.h<d0> hVar3 : gVar.f381158d) {
                            float f12 = hVar3.f381159a;
                            if (f12 > aVar2.f94433b) {
                                aVar2.f94433b = f12;
                            }
                            com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<d0>> bVar8 = dVar.f94454d;
                            d0 d0Var2 = hVar3.f381160b;
                            bVar8.c(new com.badlogic.gdx.graphics.g3d.model.e<>(f12, new d0(d0Var2 == null ? cVarQ.f94445f : d0Var2)));
                        }
                    }
                    com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<d0>> bVar9 = dVar.f94452b;
                    if ((bVar9 != null && bVar9.f95174b > 0) || (((bVar = dVar.f94453c) != null && bVar.f95174b > 0) || ((bVar2 = dVar.f94454d) != null && bVar2.f95174b > 0))) {
                        aVar2.f94434c.c(dVar);
                    }
                }
            }
            if (aVar2.f94434c.f95174b > 0) {
                this.f94385c.c(aVar2);
            }
        }
    }

    public void E(gc.e eVar) {
        if (this.f94388f.m(eVar, true)) {
            return;
        }
        this.f94388f.c(eVar);
    }

    public com.planner5d.library.engine.util.math.b a(com.planner5d.library.engine.util.math.b bVar) {
        bVar.A();
        return g(bVar);
    }

    public void b() {
        int i10 = this.f94384b.f95174b;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f94384b.get(i11).f(true);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            this.f94384b.get(i12).d(true);
        }
    }

    @Override // gc.e
    public void dispose() {
        Iterator<gc.e> it = this.f94388f.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
    }

    public com.planner5d.library.engine.util.math.b g(com.planner5d.library.engine.util.math.b bVar) {
        int i10 = this.f94384b.f95174b;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f94384b.get(i11).i(bVar);
        }
        return bVar;
    }

    public com.badlogic.gdx.graphics.g3d.model.a h(String str) {
        return i(str, true);
    }

    public com.badlogic.gdx.graphics.g3d.model.a i(String str, boolean z10) {
        int i10 = this.f94385c.f95174b;
        int i11 = 0;
        if (z10) {
            while (i11 < i10) {
                com.badlogic.gdx.graphics.g3d.model.a aVar = this.f94385c.get(i11);
                if (aVar.f94432a.equalsIgnoreCase(str)) {
                    return aVar;
                }
                i11++;
            }
            return null;
        }
        while (i11 < i10) {
            com.badlogic.gdx.graphics.g3d.model.a aVar2 = this.f94385c.get(i11);
            if (aVar2.f94432a.equals(str)) {
                return aVar2;
            }
            i11++;
        }
        return null;
    }

    public Iterable<gc.e> j() {
        return this.f94388f;
    }

    public d m(String str) {
        return o(str, true);
    }

    public d o(String str, boolean z10) {
        int i10 = this.f94383a.f95174b;
        int i11 = 0;
        if (z10) {
            while (i11 < i10) {
                d dVar = this.f94383a.get(i11);
                if (dVar.f94382f.equalsIgnoreCase(str)) {
                    return dVar;
                }
                i11++;
            }
            return null;
        }
        while (i11 < i10) {
            d dVar2 = this.f94383a.get(i11);
            if (dVar2.f94382f.equals(str)) {
                return dVar2;
            }
            i11++;
        }
        return null;
    }

    public com.badlogic.gdx.graphics.g3d.model.c q(String str) {
        return u(str, true);
    }

    public com.badlogic.gdx.graphics.g3d.model.c u(String str, boolean z10) {
        return x(str, z10, false);
    }

    public com.badlogic.gdx.graphics.g3d.model.c x(String str, boolean z10, boolean z11) {
        return com.badlogic.gdx.graphics.g3d.model.c.o(this.f94384b, str, z10, z11);
    }

    public e(com.planner5d.library.engine.a aVar, u4.b bVar, n nVar) {
        y(aVar, bVar, nVar);
    }
}
