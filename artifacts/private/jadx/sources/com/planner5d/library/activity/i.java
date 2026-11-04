package com.planner5d.library.activity;

import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.fragment.projects.c0;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.activity.helper.e2;
import com.planner5d.library.activity.helper.f2;
import com.planner5d.library.activity.helper.l0;
import com.planner5d.library.activity.helper.z0;
import com.planner5d.library.model.manager.m2;
import dagger.internal.j;
import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class i implements fg.g<Main> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z0> f137255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<l0> f137256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<k> f137257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<x> f137258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.initialization.d<Main, e2, f2>> f137259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.download.a> f137260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.upload.a> f137261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.controls.a> f137262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.d> f137263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<c0> f137264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<m2> f137265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<sd.k> f137266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<sd.e> f137267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.appupdate.h> f137268n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.auth.r> f137269o;

    public i(ij.c<z0> cVar, ij.c<l0> cVar2, ij.c<k> cVar3, ij.c<x> cVar4, ij.c<com.planner5d.library.model.manager.initialization.d<Main, e2, f2>> cVar5, ij.c<com.planner5d.library.services.download.a> cVar6, ij.c<com.planner5d.library.services.upload.a> cVar7, ij.c<com.planner5d.library.widget.editor.controls.a> cVar8, ij.c<com.planner5d.library.model.manager.config.d> cVar9, ij.c<c0> cVar10, ij.c<m2> cVar11, ij.c<sd.k> cVar12, ij.c<sd.e> cVar13, ij.c<com.planner5d.library.model.manager.appupdate.h> cVar14, ij.c<com.planner5d.library.modules.user.auth.r> cVar15) {
        this.f137255a = cVar;
        this.f137256b = cVar2;
        this.f137257c = cVar3;
        this.f137258d = cVar4;
        this.f137259e = cVar5;
        this.f137260f = cVar6;
        this.f137261g = cVar7;
        this.f137262h = cVar8;
        this.f137263i = cVar9;
        this.f137264j = cVar10;
        this.f137265k = cVar11;
        this.f137266l = cVar12;
        this.f137267m = cVar13;
        this.f137268n = cVar14;
        this.f137269o = cVar15;
    }

    public static fg.g<Main> a(ij.c<z0> cVar, ij.c<l0> cVar2, ij.c<k> cVar3, ij.c<x> cVar4, ij.c<com.planner5d.library.model.manager.initialization.d<Main, e2, f2>> cVar5, ij.c<com.planner5d.library.services.download.a> cVar6, ij.c<com.planner5d.library.services.upload.a> cVar7, ij.c<com.planner5d.library.widget.editor.controls.a> cVar8, ij.c<com.planner5d.library.model.manager.config.d> cVar9, ij.c<c0> cVar10, ij.c<m2> cVar11, ij.c<sd.k> cVar12, ij.c<sd.e> cVar13, ij.c<com.planner5d.library.model.manager.appupdate.h> cVar14, ij.c<com.planner5d.library.modules.user.auth.r> cVar15) {
        return new i(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15);
    }

    @j("com.planner5d.library.activity.Main.configManager")
    public static void b(Main main, com.planner5d.library.model.manager.config.d dVar) {
        main.f131457j = dVar;
    }

    @j("com.planner5d.library.activity.Main.controlsHandler")
    public static void c(Main main, com.planner5d.library.widget.editor.controls.a aVar) {
        main.f131456i = aVar;
    }

    @j("com.planner5d.library.activity.Main.dialogLauncher")
    public static void d(Main main, k kVar) {
        main.f131451d = kVar;
    }

    @j("com.planner5d.library.activity.Main.documentNotification")
    public static void e(Main main, com.planner5d.library.services.upload.a aVar) {
        main.f131455h = aVar;
    }

    @j("com.planner5d.library.activity.Main.downloadNotification")
    public static void f(Main main, com.planner5d.library.services.download.a aVar) {
        main.f131454g = aVar;
    }

    @j("com.planner5d.library.activity.Main.firebaseInAppMessageTrigger")
    public static void g(Main main, sd.e eVar) {
        main.f131461n = eVar;
    }

    @j("com.planner5d.library.activity.Main.firebaseInAppMessagingCallbacks")
    public static void h(Main main, sd.k kVar) {
        main.f131460m = kVar;
    }

    @j("com.planner5d.library.activity.Main.helperPayment")
    public static void i(Main main, l0 l0Var) {
        main.f131450c = l0Var;
    }

    @j("com.planner5d.library.activity.Main.helperProjectImport")
    public static void j(Main main, z0 z0Var) {
        main.f131449b = z0Var;
    }

    @j("com.planner5d.library.activity.Main.inAppUpdateManager")
    public static void k(Main main, com.planner5d.library.model.manager.appupdate.h hVar) {
        main.f131462o = hVar;
    }

    @j("com.planner5d.library.activity.Main.initializableHandler")
    public static void l(Main main, com.planner5d.library.model.manager.initialization.d<Main, e2, f2> dVar) {
        main.f131453f = dVar;
    }

    @j("com.planner5d.library.activity.Main.navigator")
    public static void n(Main main, x xVar) {
        main.f131452e = xVar;
    }

    @j("com.planner5d.library.activity.Main.notificationPermissionManager")
    public static void o(Main main, m2 m2Var) {
        main.f131459l = m2Var;
    }

    @j("com.planner5d.library.activity.Main.socialServiceAuthorization")
    public static void p(Main main, com.planner5d.library.modules.user.auth.r rVar) {
        main.f131463s = rVar;
    }

    @j("com.planner5d.library.activity.Main.sourceManager")
    public static void q(Main main, c0 c0Var) {
        main.f131458k = c0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void injectMembers(Main main) {
        j(main, this.f137255a.get());
        i(main, this.f137256b.get());
        d(main, this.f137257c.get());
        n(main, this.f137258d.get());
        l(main, this.f137259e.get());
        f(main, this.f137260f.get());
        e(main, this.f137261g.get());
        c(main, this.f137262h.get());
        b(main, this.f137263i.get());
        q(main, this.f137264j.get());
        o(main, this.f137265k.get());
        h(main, this.f137266l.get());
        g(main, this.f137267m.get());
        k(main, this.f137268n.get());
        p(main, this.f137269o.get());
    }
}
