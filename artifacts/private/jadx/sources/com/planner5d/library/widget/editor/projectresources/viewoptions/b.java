package com.planner5d.library.widget.editor.projectresources.viewoptions;

import ac.n;
import android.os.Bundle;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.services.utility.j;
import fj.h;

/* JADX INFO: loaded from: classes8.dex */
public class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f258070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f258071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f258072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f258073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f258074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f258075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f258076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f258077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f258078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f258079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f258080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f258081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f258082m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f258083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @h
    public EnumC1743b f258084o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a f258085p;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f258086a;

        public a() {
            this(new b());
        }

        private a c(r rVar, boolean z10) {
            this.f258086a.m(rVar, z10);
            return this;
        }

        public b a() {
            return new b(this.f258086a.a());
        }

        public a b(boolean z10) {
            return c(r.drawEditableWalls, z10);
        }

        public a d(boolean z10) {
            return c(r.gridRender, z10);
        }

        public a e(float f10) {
            this.f258086a.e(r.gridSize, f10);
            return this;
        }

        public a f(boolean z10) {
            return c(r.gridSnap, z10);
        }

        public a g(boolean z10) {
            return c(r.lockWalls, z10);
        }

        public a h(boolean z10) {
            return c(r.measurements, z10);
        }

        public a i(boolean z10) {
            return c(r.moveWallsOnOneDimension, z10);
        }

        public a j(com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a aVar) {
            this.f258086a.j(r.navigation3D, aVar.name());
            return this;
        }

        public a k(boolean z10) {
            return c(r.objects, z10);
        }

        public a l(boolean z10) {
            return c(r.positionIn3dFirstFloor, z10);
        }

        public a m(boolean z10) {
            return c(r.snapToPoints, z10);
        }

        public a n(boolean z10) {
            return c(r.snapToRulers, z10);
        }

        public a o(boolean z10) {
            return c(r.targetLines, z10);
        }

        public a p(boolean z10) {
            return c(r.transparentWalls, z10);
        }

        public a q(boolean z10) {
            return c(r.virtualJoystick, z10);
        }

        public a(Bundle bundle) {
            this.f258086a = new i(bundle);
        }

        public a(b bVar) {
            this(bVar.h());
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.projectresources.viewoptions.b$b, reason: collision with other inner class name */
    public enum EnumC1743b {
        draft,
        preview,
        submitted
    }

    @Override // ac.n
    public boolean a() {
        return this.f258078i;
    }

    @Override // ac.n
    public float b() {
        return this.f258080k;
    }

    @Override // ac.n
    public boolean c() {
        return this.f258070a;
    }

    @Override // ac.n
    public boolean d() {
        return this.f258085p == com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.Isometric;
    }

    @Override // ac.n
    public boolean e() {
        return this.f258081l;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.f258070a == this.f258070a && bVar.f258071b == this.f258071b && bVar.f258072c == this.f258072c && bVar.f258073d == this.f258073d && bVar.f258074e == this.f258074e && bVar.f258075f == this.f258075f && bVar.f258076g == this.f258076g && bVar.f258077h == this.f258077h && bVar.f258078i == this.f258078i && bVar.f258079j == this.f258079j && bVar.f258080k == this.f258080k && bVar.f258085p == this.f258085p && bVar.f258081l == this.f258081l && bVar.f258082m == this.f258082m && bVar.f258083n == this.f258083n && bVar.f258084o == this.f258084o) {
                return true;
            }
        }
        return false;
    }

    @Override // ac.n
    public boolean f() {
        return this.f258072c;
    }

    public boolean g() {
        return this.f258084o != null;
    }

    public Bundle h() {
        i iVarM = new i().m(r.objects, this.f258070a).m(r.measurements, this.f258071b).m(r.targetLines, this.f258072c).m(r.lockWalls, this.f258073d).m(r.snapToPoints, this.f258074e).m(r.snapToRulers, this.f258075f).m(r.moveWallsOnOneDimension, this.f258076g).m(r.positionIn3dFirstFloor, this.f258077h).m(r.gridRender, this.f258078i).m(r.gridSnap, this.f258079j).e(r.gridSize, this.f258080k).j(r.navigation3D, this.f258085p.name()).m(r.transparentWalls, this.f258081l).m(r.drawEditableWalls, this.f258082m).m(r.virtualJoystick, this.f258083n);
        r rVar = r.contestMode;
        EnumC1743b enumC1743b = this.f258084o;
        return iVarM.j(rVar, enumC1743b == null ? null : enumC1743b.name()).a();
    }

    private b() {
        this(true, true, false, false, true, false, true, false, false, false, 10.0f, com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.Spherical, false, false, false, null);
    }

    private b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, float f10, com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a aVar, boolean z20, boolean z21, boolean z22, @h EnumC1743b enumC1743b) {
        this.f258070a = z10;
        this.f258071b = z11;
        this.f258072c = z12;
        this.f258073d = z13;
        this.f258074e = z14;
        this.f258075f = z15;
        this.f258076g = z16;
        this.f258077h = z17;
        this.f258078i = z18;
        this.f258079j = z19;
        this.f258080k = f10;
        this.f258085p = aVar;
        this.f258081l = z20;
        this.f258082m = z21;
        this.f258083n = z22;
        this.f258084o = enumC1743b;
    }

    private b(Bundle bundle) {
        j jVar = new j(bundle);
        this.f258070a = jVar.f(r.objects, false);
        this.f258071b = jVar.f(r.measurements, false);
        this.f258072c = jVar.f(r.targetLines, false);
        this.f258073d = jVar.f(r.lockWalls, false);
        this.f258074e = jVar.f(r.snapToPoints, false);
        this.f258075f = jVar.f(r.snapToRulers, false);
        this.f258076g = jVar.f(r.moveWallsOnOneDimension, false);
        this.f258077h = jVar.f(r.positionIn3dFirstFloor, false);
        this.f258078i = jVar.f(r.gridRender, false);
        this.f258079j = jVar.f(r.gridSnap, false);
        this.f258080k = jVar.b(r.gridSize, 10.0f);
        this.f258085p = com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.valueOf(jVar.t(r.navigation3D, com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.Spherical.name()));
        this.f258081l = jVar.f(r.transparentWalls, false);
        this.f258082m = jVar.f(r.drawEditableWalls, false);
        this.f258083n = jVar.f(r.virtualJoystick, false);
        int i10 = 4 ^ 0;
        String strT = jVar.t(r.contestMode, null);
        this.f258084o = strT != null ? EnumC1743b.valueOf(strT) : null;
    }
}
