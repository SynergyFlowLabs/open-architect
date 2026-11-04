package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.math.y;
import com.badlogic.gdx.utils.k0;
import com.badlogic.gdx.utils.o0;
import com.badlogic.gdx.utils.t;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k0<com.badlogic.gdx.graphics.g3d.model.c, C0844b> f94606d = new k0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C0844b f94607e = new C0844b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0<C0844b> f94608a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f94609b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.g3d.g f94610c;

    class a extends o0<C0844b> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.badlogic.gdx.utils.o0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0844b e() {
            return new C0844b();
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.graphics.g3d.utils.b$b, reason: collision with other inner class name */
    public static final class C0844b implements o0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0 f94612a = new d0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f94613b = new y();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d0 f94614c = new d0(1.0f, 1.0f, 1.0f);

        public C0844b a() {
            this.f94612a.y0(0.0f, 0.0f, 0.0f);
            this.f94613b.z();
            this.f94614c.y0(1.0f, 1.0f, 1.0f);
            return this;
        }

        public C0844b b(C0844b c0844b, float f10) {
            return c(c0844b.f94612a, c0844b.f94613b, c0844b.f94614c, f10);
        }

        public C0844b c(d0 d0Var, y yVar, d0 d0Var2, float f10) {
            this.f94612a.E(d0Var, f10);
            this.f94613b.d0(yVar, f10);
            this.f94614c.E(d0Var2, f10);
            return this;
        }

        public C0844b d(C0844b c0844b) {
            return e(c0844b.f94612a, c0844b.f94613b, c0844b.f94614c);
        }

        public C0844b e(d0 d0Var, y yVar, d0 d0Var2) {
            this.f94612a.L(d0Var);
            this.f94613b.N(yVar);
            this.f94614c.L(d0Var2);
            return this;
        }

        public Matrix4 f(Matrix4 matrix4) {
            return matrix4.Q(this.f94612a, this.f94613b, this.f94614c);
        }

        @Override // com.badlogic.gdx.utils.o0.a
        public void reset() {
            a();
        }

        public String toString() {
            return this.f94612a.toString() + " - " + this.f94613b.toString() + " - " + this.f94614c.toString();
        }
    }

    public b(com.badlogic.gdx.graphics.g3d.g gVar) {
        this.f94610c = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static void c(k0<com.badlogic.gdx.graphics.g3d.model.c, C0844b> k0Var, o0<C0844b> o0Var, float f10, com.badlogic.gdx.graphics.g3d.model.a aVar, float f11) {
        if (k0Var == null) {
            Iterator<com.badlogic.gdx.graphics.g3d.model.d> it = aVar.f94434c.iterator();
            while (it.hasNext()) {
                f(it.next(), f11);
            }
            return;
        }
        k0.c<com.badlogic.gdx.graphics.g3d.model.c> it2 = k0Var.A().iterator();
        while (it2.hasNext()) {
            it2.next().f94442c = false;
        }
        Iterator<com.badlogic.gdx.graphics.g3d.model.d> it3 = aVar.f94434c.iterator();
        while (it3.hasNext()) {
            e(it3.next(), k0Var, o0Var, f10, f11);
        }
        k0.a<com.badlogic.gdx.graphics.g3d.model.c, C0844b> it4 = k0Var.m().iterator();
        while (it4.hasNext()) {
            k0.b next = it4.next();
            K k10 = next.f95630a;
            if (!((com.badlogic.gdx.graphics.g3d.model.c) k10).f94442c) {
                ((com.badlogic.gdx.graphics.g3d.model.c) k10).f94442c = true;
                ((C0844b) next.f95631b).c(((com.badlogic.gdx.graphics.g3d.model.c) k10).f94443d, ((com.badlogic.gdx.graphics.g3d.model.c) k10).f94444e, ((com.badlogic.gdx.graphics.g3d.model.c) k10).f94445f, f10);
            }
        }
    }

    private static final void e(com.badlogic.gdx.graphics.g3d.model.d dVar, k0<com.badlogic.gdx.graphics.g3d.model.c, C0844b> k0Var, o0<C0844b> o0Var, float f10, float f11) {
        com.badlogic.gdx.graphics.g3d.model.c cVar = dVar.f94451a;
        cVar.f94442c = true;
        C0844b c0844bJ = j(dVar, f11);
        C0844b c0844bR = k0Var.r(cVar, null);
        if (c0844bR != null) {
            if (f10 > 0.999999f) {
                c0844bR.d(c0844bJ);
                return;
            } else {
                c0844bR.b(c0844bJ, f10);
                return;
            }
        }
        if (f10 > 0.999999f) {
            k0Var.C(cVar, o0Var.f().d(c0844bJ));
        } else {
            k0Var.C(cVar, o0Var.f().e(cVar.f94443d, cVar.f94444e, cVar.f94445f).b(c0844bJ, f10));
        }
    }

    private static final void f(com.badlogic.gdx.graphics.g3d.model.d dVar, float f10) {
        com.badlogic.gdx.graphics.g3d.model.c cVar = dVar.f94451a;
        cVar.f94442c = true;
        j(dVar, f10).f(cVar.f94446g);
    }

    private static final <T> int i(com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<T>> bVar, float f10) {
        int i10 = bVar.f95174b - 1;
        for (int i11 = 0; i11 < i10; i11++) {
            if (f10 >= bVar.get(i11).f94455a && f10 <= bVar.get(i11 + 1).f94455a) {
                return i11;
            }
        }
        return 0;
    }

    private static final C0844b j(com.badlogic.gdx.graphics.g3d.model.d dVar, float f10) {
        C0844b c0844b = f94607e;
        m(dVar, f10, c0844b.f94612a);
        k(dVar, f10, c0844b.f94613b);
        l(dVar, f10, c0844b.f94614c);
        return c0844b;
    }

    private static final y k(com.badlogic.gdx.graphics.g3d.model.d dVar, float f10, y yVar) {
        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<y>> bVar = dVar.f94453c;
        if (bVar == null) {
            return yVar.N(dVar.f94451a.f94444e);
        }
        if (bVar.f95174b == 1) {
            return yVar.N(bVar.get(0).f94456b);
        }
        int i10 = i(bVar, f10);
        com.badlogic.gdx.graphics.g3d.model.e<y> eVar = dVar.f94453c.get(i10);
        yVar.N(eVar.f94456b);
        int i11 = i10 + 1;
        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<y>> bVar2 = dVar.f94453c;
        if (i11 < bVar2.f95174b) {
            com.badlogic.gdx.graphics.g3d.model.e<y> eVar2 = bVar2.get(i11);
            float f11 = eVar.f94455a;
            yVar.d0(eVar2.f94456b, (f10 - f11) / (eVar2.f94455a - f11));
        }
        return yVar;
    }

    private static final d0 l(com.badlogic.gdx.graphics.g3d.model.d dVar, float f10, d0 d0Var) {
        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<d0>> bVar = dVar.f94454d;
        if (bVar == null) {
            return d0Var.L(dVar.f94451a.f94445f);
        }
        if (bVar.f95174b == 1) {
            return d0Var.L(bVar.get(0).f94456b);
        }
        int i10 = i(bVar, f10);
        com.badlogic.gdx.graphics.g3d.model.e<d0> eVar = dVar.f94454d.get(i10);
        d0Var.L(eVar.f94456b);
        int i11 = i10 + 1;
        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<d0>> bVar2 = dVar.f94454d;
        if (i11 < bVar2.f95174b) {
            com.badlogic.gdx.graphics.g3d.model.e<d0> eVar2 = bVar2.get(i11);
            float f11 = eVar.f94455a;
            d0Var.E(eVar2.f94456b, (f10 - f11) / (eVar2.f94455a - f11));
        }
        return d0Var;
    }

    private static final d0 m(com.badlogic.gdx.graphics.g3d.model.d dVar, float f10, d0 d0Var) {
        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<d0>> bVar = dVar.f94452b;
        if (bVar == null) {
            return d0Var.L(dVar.f94451a.f94443d);
        }
        if (bVar.f95174b == 1) {
            return d0Var.L(bVar.get(0).f94456b);
        }
        int i10 = i(bVar, f10);
        com.badlogic.gdx.graphics.g3d.model.e<d0> eVar = dVar.f94452b.get(i10);
        d0Var.L(eVar.f94456b);
        int i11 = i10 + 1;
        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.model.e<d0>> bVar2 = dVar.f94452b;
        if (i11 < bVar2.f95174b) {
            com.badlogic.gdx.graphics.g3d.model.e<d0> eVar2 = bVar2.get(i11);
            float f11 = eVar.f94455a;
            d0Var.E(eVar2.f94456b, (f10 - f11) / (eVar2.f94455a - f11));
        }
        return d0Var;
    }

    protected void a(com.badlogic.gdx.graphics.g3d.model.a aVar, float f10, float f11) {
        if (!this.f94609b) {
            throw new t("You must call begin() before adding an animation");
        }
        c(f94606d, this.f94608a, f11, aVar, f10);
    }

    protected void b(com.badlogic.gdx.graphics.g3d.model.a aVar, float f10) {
        if (this.f94609b) {
            throw new t("Call end() first");
        }
        c(null, null, 1.0f, aVar, f10);
        this.f94610c.l();
    }

    protected void d(com.badlogic.gdx.graphics.g3d.model.a aVar, float f10, com.badlogic.gdx.graphics.g3d.model.a aVar2, float f11, float f12) {
        if (aVar2 != null && f12 != 0.0f) {
            if (aVar == null || f12 == 1.0f) {
                b(aVar2, f11);
                return;
            } else {
                if (this.f94609b) {
                    throw new t("Call end() first");
                }
                g();
                a(aVar, f10, 1.0f);
                a(aVar2, f11, f12);
                h();
                return;
            }
        }
        b(aVar, f10);
    }

    protected void g() {
        if (this.f94609b) {
            throw new t("You must call end() after each call to being()");
        }
        this.f94609b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void h() {
        if (!this.f94609b) {
            throw new t("You must call begin() first");
        }
        k0.a<com.badlogic.gdx.graphics.g3d.model.c, C0844b> it = f94606d.m().iterator();
        while (it.hasNext()) {
            k0.b next = it.next();
            ((C0844b) next.f95631b).f(((com.badlogic.gdx.graphics.g3d.model.c) next.f95630a).f94446g);
            this.f94608a.b((C0844b) next.f95631b);
        }
        f94606d.clear();
        this.f94610c.l();
        this.f94609b = false;
    }

    protected void n(com.badlogic.gdx.graphics.g3d.model.a aVar) {
        Iterator<com.badlogic.gdx.graphics.g3d.model.d> it = aVar.f94434c.iterator();
        while (it.hasNext()) {
            it.next().f94451a.f94442c = false;
        }
    }
}
