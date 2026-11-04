package com.badlogic.gdx.graphics.g3d.model;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.math.y;
import com.badlogic.gdx.utils.t;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f94440a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f94442c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected c f94449j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f94441b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f94443d = new d0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f94444e = new y(0.0f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f94445f = new d0(1.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix4 f94446g = new Matrix4();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix4 f94447h = new Matrix4();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.badlogic.gdx.utils.b<f> f94448i = new com.badlogic.gdx.utils.b<>(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.badlogic.gdx.utils.b<c> f94450k = new com.badlogic.gdx.utils.b<>(2);

    public static c o(com.badlogic.gdx.utils.b<c> bVar, String str, boolean z10, boolean z11) {
        int i10 = bVar.f95174b;
        if (z11) {
            for (int i11 = 0; i11 < i10; i11++) {
                c cVar = bVar.get(i11);
                if (cVar.f94440a.equalsIgnoreCase(str)) {
                    return cVar;
                }
            }
        } else {
            for (int i12 = 0; i12 < i10; i12++) {
                c cVar2 = bVar.get(i12);
                if (cVar2.f94440a.equals(str)) {
                    return cVar2;
                }
            }
        }
        if (z10) {
            for (int i13 = 0; i13 < i10; i13++) {
                c cVarO = o(bVar.get(i13).f94450k, str, true, z11);
                if (cVarO != null) {
                    return cVarO;
                }
            }
        }
        return null;
    }

    public <T extends c> int a(T t10) {
        return s(-1, t10);
    }

    public <T extends c> int b(Iterable<T> iterable) {
        return t(-1, iterable);
    }

    public <T extends c> void c(T t10) {
        t10.a(this);
    }

    public void d(boolean z10) {
        Matrix4[] matrix4Arr;
        int i10;
        for (f fVar : this.f94448i) {
            com.badlogic.gdx.utils.c<c, Matrix4> cVar = fVar.f94459c;
            if (cVar != null && (matrix4Arr = fVar.f94460d) != null && (i10 = cVar.f95211c) == matrix4Arr.length) {
                for (int i11 = 0; i11 < i10; i11++) {
                    fVar.f94460d[i11].N(fVar.f94459c.f95209a[i11].f94447h).w(fVar.f94459c.f95210b[i11]);
                }
            }
        }
        if (z10) {
            Iterator<c> it = this.f94450k.iterator();
            while (it.hasNext()) {
                it.next().d(true);
            }
        }
    }

    public Matrix4 e() {
        if (!this.f94442c) {
            this.f94446g.Q(this.f94443d, this.f94444e, this.f94445f);
        }
        return this.f94446g;
    }

    public void f(boolean z10) {
        e();
        g();
        if (z10) {
            Iterator<c> it = this.f94450k.iterator();
            while (it.hasNext()) {
                it.next().f(true);
            }
        }
    }

    public Matrix4 g() {
        c cVar;
        if (!this.f94441b || (cVar = this.f94449j) == null) {
            this.f94447h.N(this.f94446g);
        } else {
            this.f94447h.N(cVar.f94447h).w(this.f94446g);
        }
        return this.f94447h;
    }

    public void h() {
        c cVar = this.f94449j;
        if (cVar != null) {
            cVar.u(this);
            this.f94449j = null;
        }
    }

    public com.planner5d.library.engine.util.math.b i(com.planner5d.library.engine.util.math.b bVar) {
        return j(bVar, true);
    }

    public com.planner5d.library.engine.util.math.b j(com.planner5d.library.engine.util.math.b bVar, boolean z10) {
        int i10 = this.f94448i.f95174b;
        for (int i11 = 0; i11 < i10; i11++) {
            f fVar = this.f94448i.get(i11);
            if (fVar.f94461e) {
                b bVar2 = fVar.f94457a;
                if (z10) {
                    bVar2.f94439e.f(bVar, bVar2.f94437c, bVar2.f94438d, this.f94447h);
                } else {
                    bVar2.f94439e.e(bVar, bVar2.f94437c, bVar2.f94438d);
                }
            }
        }
        int i12 = this.f94450k.f95174b;
        for (int i13 = 0; i13 < i12; i13++) {
            this.f94450k.get(i13).i(bVar);
        }
        return bVar;
    }

    public c k(int i10) {
        return this.f94450k.get(i10);
    }

    public c l(String str, boolean z10, boolean z11) {
        return o(this.f94450k, str, z10, z11);
    }

    public int m() {
        return this.f94450k.f95174b;
    }

    public Iterable<c> n() {
        return this.f94450k;
    }

    public c p() {
        return this.f94449j;
    }

    public boolean q() {
        com.badlogic.gdx.utils.b<c> bVar = this.f94450k;
        return bVar != null && bVar.f95174b > 0;
    }

    public boolean r() {
        return this.f94449j != null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    public <T extends c> int s(int i10, T t10) {
        for (c cVarP = this; cVarP != null; cVarP = cVarP.p()) {
            if (cVarP == t10) {
                throw new t("Cannot add a parent as a child");
            }
        }
        c cVarP2 = t10.p();
        if (cVarP2 != null && !cVarP2.u(t10)) {
            throw new t("Could not remove child from its current parent");
        }
        if (i10 >= 0) {
            com.badlogic.gdx.utils.b<c> bVar = this.f94450k;
            if (i10 >= bVar.f95174b) {
                com.badlogic.gdx.utils.b<c> bVar2 = this.f94450k;
                int i11 = bVar2.f95174b;
                bVar2.c(t10);
                i10 = i11;
            } else {
                bVar.r(i10, t10);
            }
        } else {
            com.badlogic.gdx.utils.b<c> bVar3 = this.f94450k;
            int i12 = bVar3.f95174b;
            bVar3.c(t10);
            i10 = i12;
        }
        t10.f94449j = this;
        return i10;
    }

    public <T extends c> int t(int i10, Iterable<T> iterable) {
        if (i10 < 0 || i10 > this.f94450k.f95174b) {
            i10 = this.f94450k.f95174b;
        }
        Iterator<T> it = iterable.iterator();
        int i11 = i10;
        while (it.hasNext()) {
            s(i11, it.next());
            i11++;
        }
        return i10;
    }

    public <T extends c> boolean u(T t10) {
        if (!this.f94450k.C(t10, true)) {
            return false;
        }
        t10.f94449j = null;
        return true;
    }
}
