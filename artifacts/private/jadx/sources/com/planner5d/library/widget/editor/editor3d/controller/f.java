package com.planner5d.library.widget.editor.editor3d.controller;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.planner5d.library.engine.k;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.widget.editor.helper.g1;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class f extends com.planner5d.library.engine.input.e implements com.planner5d.library.widget.event.directional.i {
    private com.planner5d.library.widget.editor.helper.selector.a H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final j f255426g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private float f255427h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private final Context f255428i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.editor3d.controller.navigation.j f255429j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private b f255430k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a f255431l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private final k f255432m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private final Handler f255433n3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private WeakReference<com.planner5d.library.widget.editor.editor3d.scene3d.j> f255434p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private g1 f255435p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private com.planner5d.library.widget.editor.facade.f f255436p2;

    class a implements ij.c<PointF> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PointF f255437a = new PointF(4000.0f, 4000.0f);

        a() {
        }

        @Override // ij.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get() {
            com.planner5d.library.widget.editor.facade.f fVar = f.this.f255436p2;
            if (fVar == null) {
                this.f255437a.set(4000.0f, 4000.0f);
            } else {
                this.f255437a.set(fVar.E1());
            }
            return this.f255437a;
        }
    }

    public f(h hVar, com.planner5d.library.application.b bVar, com.planner5d.library.engine.a aVar) {
        super(aVar, hVar);
        this.f255434p0 = new WeakReference<>(null);
        this.f255435p1 = null;
        this.H1 = null;
        this.f255436p2 = null;
        this.f255426g3 = new j();
        this.f255427h3 = 0.0f;
        this.f255431l3 = com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.Spherical;
        this.f255433n3 = new Handler(Looper.getMainLooper());
        this.f255432m3 = aVar.m();
        this.f255428i3 = bVar.getApplicationContext();
        com.planner5d.library.widget.editor.editor3d.controller.navigation.j jVar = new com.planner5d.library.widget.editor.editor3d.controller.navigation.j(bVar);
        this.f255429j3 = jVar;
        this.f255430k3 = new b(new com.planner5d.library.widget.editor.editor3d.controller.navigation.h(jVar));
        Y();
        hVar.h(this);
    }

    private void M() {
        final com.planner5d.library.widget.editor.helper.selector.a aVar = this.H1;
        if (aVar != null) {
            this.f255433n3.post(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.controller.e
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.d(null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        X(this.f255430k3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.planner5d.library.widget.editor.editor3d.scene3d.j S() {
        return this.f255434p0.get();
    }

    private void X(b bVar) {
        Y();
        if (bVar.f255440b != null) {
            bVar.f255439a.k(this.f255427h3, bVar.f255440b);
        }
    }

    public void C0(vd.a aVar, int i10) {
        this.f255430k3.f255439a.c(aVar, i10);
    }

    boolean N(double d10, double d11) {
        WeakReference<com.planner5d.library.widget.editor.editor3d.scene3d.j> weakReference;
        com.planner5d.library.engine.g gVar = this.f255430k3.f255440b;
        return (gVar == null || (weakReference = this.f255434p0) == null || !weakReference.get().q(gVar.S1(this.f255432m3, (float) d10, (float) d11))) ? false : true;
    }

    boolean O() {
        Item itemY = this.f255434p0.get().y();
        return (itemY == null || (itemY instanceof ItemWalls) || (itemY instanceof ItemWall)) ? false : true;
    }

    void P(double d10, double d11) {
        this.f255426g3.e(this.f255432m3, d10, d11);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void Q(double d10, double d11) {
        com.planner5d.library.engine.g gVar = this.f255430k3.f255440b;
        if (gVar != null) {
            j jVar = this.f255426g3;
            g1 g1Var = this.f255435p1;
            jVar.f(g1Var, g1Var.f256317c4, this.f255432m3, this.f255434p0.get(), gVar, d10, d11);
        }
    }

    void T(double d10, double d11) {
        M();
        b bVar = this.f255430k3;
        bVar.f255439a.i(this.f255427h3, d10, d11);
        X(bVar);
    }

    void U() {
        this.f255426g3.g();
        this.f255430k3.f255439a.d(false, this.f255428i3.getResources().getInteger(com.planner5d.library.f.k.f168560c));
    }

    void V(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, com.planner5d.library.math.k kVar3, com.planner5d.library.math.k kVar4) {
        M();
        b bVar = this.f255430k3;
        bVar.f255439a.j(kVar, kVar2, kVar3, kVar4);
        X(bVar);
    }

    public void W() {
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255434p0.get();
        if (jVar != null) {
            jVar.I(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.controller.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f255422a.R();
                }
            });
        }
    }

    public void Y() {
        com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a aVar;
        com.planner5d.library.widget.editor.editor3d.controller.navigation.c dVar;
        com.planner5d.library.widget.editor.facade.f fVar = this.f255436p2;
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = fVar == null ? null : fVar.G1();
        if (bVarG1 == null || this.f255431l3 == (aVar = bVarG1.f258085p)) {
            return;
        }
        this.f255431l3 = aVar;
        if (aVar == com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.Simple) {
            dVar = new com.planner5d.library.widget.editor.editor3d.controller.navigation.g(this.f255429j3, this.f255428i3);
        } else if (aVar == com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.Isometric) {
            dVar = new com.planner5d.library.widget.editor.editor3d.controller.navigation.f(this.f255429j3, this.f255428i3, new a());
        } else {
            dVar = aVar == com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.FirstPerson ? new com.planner5d.library.widget.editor.editor3d.controller.navigation.d(this.f255429j3, new ij.c() { // from class: com.planner5d.library.widget.editor.editor3d.controller.c
                @Override // ij.c
                public final Object get() {
                    return this.f255423a.S();
                }
            }) : new com.planner5d.library.widget.editor.editor3d.controller.navigation.h(this.f255429j3);
        }
        this.f255430k3 = new b(this.f255430k3, dVar);
        dVar.f(this.f255427h3, this.f255428i3.getResources().getInteger(com.planner5d.library.f.k.f168570h));
    }

    public void Z(Bundle bundle) {
        b bVar = this.f255430k3;
        if (bundle != null) {
            this.f255429j3.b(bundle);
        } else {
            this.f255429j3.s();
            bVar.f255439a.f(this.f255427h3, 0);
        }
        X(bVar);
    }

    public Bundle a0() {
        return this.f255429j3.H();
    }

    boolean b0(double d10, double d11) {
        WeakReference<com.planner5d.library.widget.editor.editor3d.scene3d.j> weakReference;
        com.planner5d.library.engine.g gVar = this.f255430k3.f255440b;
        return gVar == null || (weakReference = this.f255434p0) == null || weakReference.get().d0(new PointF((float) ((int) d10), (float) ((int) d11)), gVar.S1(this.f255432m3, (float) d10, (float) d11));
    }

    public void c0(float f10) {
        this.f255427h3 = f10;
        X(this.f255430k3);
    }

    public f d0(@NonNull com.planner5d.library.engine.g gVar) {
        b bVar = new b(this.f255430k3, gVar);
        this.f255430k3 = bVar;
        X(bVar);
        return this;
    }

    public void e0(com.planner5d.library.widget.editor.facade.f fVar, com.planner5d.library.widget.editor.helper.selector.a aVar) {
        this.f255436p2 = fVar;
        this.H1 = aVar;
    }

    public void f0(PointF pointF) {
        b bVar = this.f255430k3;
        bVar.f255439a.l(pointF.x, pointF.y);
        X(bVar);
    }

    @Override // com.planner5d.library.widget.event.directional.i
    public void g(double d10) {
        this.f255430k3.f255439a.h(d10);
        X(this.f255430k3);
    }

    public f g0(com.planner5d.library.widget.editor.editor3d.scene3d.j jVar) {
        this.f255434p0 = new WeakReference<>(jVar);
        return this;
    }

    public void h0() {
        if (this.f255430k3.f255439a.m()) {
            X(this.f255430k3);
        }
    }

    void i0() {
        final g1 g1Var = this.f255435p1;
        if (g1Var != null) {
            this.f255433n3.post(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.controller.d
                @Override // java.lang.Runnable
                public final void run() {
                    g1Var.n3();
                }
            });
        }
        this.f255430k3.f255439a.d(true, 0);
    }

    public vd.a p0() {
        return this.f255430k3.f255439a.e().I();
    }

    @Override // com.planner5d.library.widget.event.directional.i
    public void q(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        this.f255430k3.f255439a.g(this.f255427h3, kVar, kVar2);
        X(this.f255430k3);
    }

    public void setHelper(g1 g1Var) {
        this.f255435p1 = g1Var;
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.planner5d.library.widget.editor.editor3d.controller.navigation.c f255439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.planner5d.library.engine.g f255440b;

        private b(b bVar, com.planner5d.library.widget.editor.editor3d.controller.navigation.c cVar) {
            this(cVar, bVar.f255440b);
        }

        private b(b bVar, com.planner5d.library.engine.g gVar) {
            this(bVar.f255439a, gVar);
        }

        private b(@NonNull com.planner5d.library.widget.editor.editor3d.controller.navigation.c cVar, com.planner5d.library.engine.g gVar) {
            this.f255439a = cVar;
            this.f255440b = gVar;
        }

        private b(@NonNull com.planner5d.library.widget.editor.editor3d.controller.navigation.c cVar) {
            this(cVar, (com.planner5d.library.engine.g) null);
        }
    }
}
