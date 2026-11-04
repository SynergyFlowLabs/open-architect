package com.planner5d.library.widget.editor.editor3dcardboard;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.s0;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.widget.editor.facade.c0;
import com.planner5d.library.widget.editor.helper.n3;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
public final class r implements fg.g<l> {
    private final ij.c<cc.b> H1;
    private final ij.c<com.planner5d.library.model.manager.performancetracing.e> X;
    private final ij.c<g> Y;
    private final ij.c<com.planner5d.library.engine.i> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<d0> f256031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f256032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f256033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f256034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<s0> f256035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<t1> f256036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<u> f256037g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final ij.c<cc.f> f256038g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<n3> f256039h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final ij.c<com.planner5d.library.engine.h> f256040h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<b2> f256041i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.n> f256042i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<k5> f256043j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private final ij.c<dd.c> f256044j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<y0> f256045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<ec.e> f256046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<c2> f256047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<t0> f256048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f256049o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final ij.c<ac.f> f256050p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final ij.c<bc.c> f256051p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final ij.c<dc.d<cc.a>> f256052p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ij.c<c0> f256053s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.facade.s> f256054t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.d> f256055v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f256056w;

    public r(ij.c<d0> cVar, ij.c<com.planner5d.library.application.b> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<com.planner5d.library.application.d> cVar4, ij.c<s0> cVar5, ij.c<t1> cVar6, ij.c<u> cVar7, ij.c<n3> cVar8, ij.c<b2> cVar9, ij.c<k5> cVar10, ij.c<y0> cVar11, ij.c<ec.e> cVar12, ij.c<c2> cVar13, ij.c<t0> cVar14, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar15, ij.c<c0> cVar16, ij.c<com.planner5d.library.widget.editor.facade.s> cVar17, ij.c<com.planner5d.library.model.manager.config.d> cVar18, ij.c<com.planner5d.library.model.manager.config.p> cVar19, ij.c<com.planner5d.library.model.manager.performancetracing.e> cVar20, ij.c<g> cVar21, ij.c<com.planner5d.library.engine.i> cVar22, ij.c<ac.f> cVar23, ij.c<bc.c> cVar24, ij.c<cc.b> cVar25, ij.c<dc.d<cc.a>> cVar26, ij.c<cc.f> cVar27, ij.c<com.planner5d.library.engine.h> cVar28, ij.c<com.planner5d.library.model.manager.builtin.n> cVar29, ij.c<dd.c> cVar30) {
        this.f256031a = cVar;
        this.f256032b = cVar2;
        this.f256033c = cVar3;
        this.f256034d = cVar4;
        this.f256035e = cVar5;
        this.f256036f = cVar6;
        this.f256037g = cVar7;
        this.f256039h = cVar8;
        this.f256041i = cVar9;
        this.f256043j = cVar10;
        this.f256045k = cVar11;
        this.f256046l = cVar12;
        this.f256047m = cVar13;
        this.f256048n = cVar14;
        this.f256049o = cVar15;
        this.f256053s = cVar16;
        this.f256054t = cVar17;
        this.f256055v = cVar18;
        this.f256056w = cVar19;
        this.X = cVar20;
        this.Y = cVar21;
        this.Z = cVar22;
        this.f256050p0 = cVar23;
        this.f256051p1 = cVar24;
        this.H1 = cVar25;
        this.f256052p2 = cVar26;
        this.f256038g3 = cVar27;
        this.f256040h3 = cVar28;
        this.f256042i3 = cVar29;
        this.f256044j3 = cVar30;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.sharedPreferences")
    public static void A(l lVar, com.planner5d.library.model.manager.config.p pVar) {
        lVar.X = pVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.synchronizationManager")
    public static void B(l lVar, com.planner5d.library.model.manager.synchronization.i iVar) {
        lVar.f256003s = iVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.textureManager")
    public static void C(l lVar, k5 k5Var) {
        lVar.f255987k = k5Var;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.userAuthorization")
    public static void D(l lVar, com.planner5d.library.modules.user.user.t tVar) {
        lVar.f255976d = tVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.userImported3dModelFileAccessor")
    public static void E(l lVar, dd.c cVar) {
        lVar.f255988k3 = cVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.userPurchases")
    public static void F(l lVar, t0 t0Var) {
        lVar.f255995o = t0Var;
    }

    public static fg.g<l> a(ij.c<d0> cVar, ij.c<com.planner5d.library.application.b> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<com.planner5d.library.application.d> cVar4, ij.c<s0> cVar5, ij.c<t1> cVar6, ij.c<u> cVar7, ij.c<n3> cVar8, ij.c<b2> cVar9, ij.c<k5> cVar10, ij.c<y0> cVar11, ij.c<ec.e> cVar12, ij.c<c2> cVar13, ij.c<t0> cVar14, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar15, ij.c<c0> cVar16, ij.c<com.planner5d.library.widget.editor.facade.s> cVar17, ij.c<com.planner5d.library.model.manager.config.d> cVar18, ij.c<com.planner5d.library.model.manager.config.p> cVar19, ij.c<com.planner5d.library.model.manager.performancetracing.e> cVar20, ij.c<g> cVar21, ij.c<com.planner5d.library.engine.i> cVar22, ij.c<ac.f> cVar23, ij.c<bc.c> cVar24, ij.c<cc.b> cVar25, ij.c<dc.d<cc.a>> cVar26, ij.c<cc.f> cVar27, ij.c<com.planner5d.library.engine.h> cVar28, ij.c<com.planner5d.library.model.manager.builtin.n> cVar29, ij.c<dd.c> cVar30) {
        return new r(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29, cVar30);
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.applicationAndroid")
    public static void b(l lVar, com.planner5d.library.application.b bVar) {
        lVar.f255975c = bVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.cameraProvider")
    public static void c(l lVar, com.planner5d.library.engine.h hVar) {
        lVar.f255984i3 = hVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.cardboardProjectLoader")
    public static void d(l lVar, g gVar) {
        lVar.Z = gVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.configManager")
    public static void e(l lVar, com.planner5d.library.model.manager.config.d dVar) {
        lVar.f256010w = dVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.configuration")
    public static void f(l lVar, com.planner5d.library.application.d dVar) {
        lVar.f255977e = dVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.dataManager")
    public static void g(l lVar, com.planner5d.library.model.manager.builtin.n nVar) {
        lVar.f255986j3 = nVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.engineFactory")
    public static void h(l lVar, com.planner5d.library.engine.i iVar) {
        lVar.f255997p0 = iVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.facadeFactory")
    public static void i(l lVar, com.planner5d.library.widget.editor.facade.s sVar) {
        lVar.f256008v = sVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.glSurfaceViewFactoryCardboardProvider")
    public static void j(l lVar, ij.c<u> cVar) {
        lVar.f255981h = cVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.globalSettingsManager")
    public static void k(l lVar, s0 s0Var) {
        lVar.f255978f = s0Var;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.helperProjectPersistence")
    public static void l(l lVar, n3 n3Var) {
        lVar.f255983i = n3Var;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.imageManager")
    public static void m(l lVar, y0 y0Var) {
        lVar.f255989l = y0Var;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.interfaceManager")
    public static void n(l lVar, c0 c0Var) {
        lVar.f256005t = c0Var;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.logRecordManager")
    public static void o(l lVar, t1 t1Var) {
        lVar.f255979g = t1Var;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.materialFactory")
    public static void p(l lVar, bc.c cVar) {
        lVar.H1 = cVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.messageManager")
    public static void r(l lVar, b2 b2Var) {
        lVar.f255985j = b2Var;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.modelBuilderFactory")
    public static void s(l lVar, dc.d<cc.a> dVar) {
        lVar.f255980g3 = dVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.modelFactory")
    public static void t(l lVar, cc.b bVar) {
        lVar.f255999p2 = bVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.modelManagersFactory")
    public static void u(l lVar, ec.e eVar) {
        lVar.f255991m = eVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.networkStateUtility")
    public static void v(l lVar, c2 c2Var) {
        lVar.f255993n = c2Var;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.performanceTracing")
    public static void w(l lVar, com.planner5d.library.model.manager.performancetracing.e eVar) {
        lVar.Y = eVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.projectManager")
    public static void x(l lVar, d0 d0Var) {
        lVar.f255974b = d0Var;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.renderableProviderFactory")
    public static void y(l lVar, cc.f fVar) {
        lVar.f255982h3 = fVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.editor3dcardboard.Editor3DCardboard.rendererFactory")
    public static void z(l lVar, ac.f fVar) {
        lVar.f255998p1 = fVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void injectMembers(l lVar) {
        x(lVar, this.f256031a.get());
        b(lVar, this.f256032b.get());
        D(lVar, this.f256033c.get());
        f(lVar, this.f256034d.get());
        k(lVar, this.f256035e.get());
        o(lVar, this.f256036f.get());
        j(lVar, this.f256037g);
        l(lVar, this.f256039h.get());
        r(lVar, this.f256041i.get());
        C(lVar, this.f256043j.get());
        m(lVar, this.f256045k.get());
        u(lVar, this.f256046l.get());
        v(lVar, this.f256047m.get());
        F(lVar, this.f256048n.get());
        B(lVar, this.f256049o.get());
        n(lVar, this.f256053s.get());
        i(lVar, this.f256054t.get());
        e(lVar, this.f256055v.get());
        A(lVar, this.f256056w.get());
        w(lVar, this.X.get());
        d(lVar, this.Y.get());
        h(lVar, this.Z.get());
        z(lVar, this.f256050p0.get());
        p(lVar, this.f256051p1.get());
        t(lVar, this.H1.get());
        s(lVar, this.f256052p2.get());
        y(lVar, this.f256038g3.get());
        c(lVar, this.f256040h3.get());
        g(lVar, this.f256042i3.get());
        E(lVar, this.f256044j3.get());
    }
}
