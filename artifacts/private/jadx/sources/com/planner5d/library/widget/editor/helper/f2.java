package com.planner5d.library.widget.editor.helper;

import android.os.Bundle;
import com.planner5d.library.activity.MainCardboard;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.FragmentControllerActivitySwitch;
import com.planner5d.library.model.manager.statistics.events.f4;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Date;
import rx.Subscriber;

/* JADX INFO: loaded from: classes8.dex */
public class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<g1> f256292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<s2> f256293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<com.planner5d.library.model.manager.y1> f256294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference<com.planner5d.library.activity.fragment.x> f256295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f256296e = false;

    class a extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f256297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Bundle f256298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f256299f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f256300g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ gd.a f256301h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.utility.j f256302i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f256303j;

        a(boolean z10, Bundle bundle, boolean z11, boolean z12, gd.a aVar, com.planner5d.library.services.utility.j jVar, boolean z13) {
            this.f256297d = z10;
            this.f256298e = bundle;
            this.f256299f = z11;
            this.f256300g = z12;
            this.f256301h = aVar;
            this.f256302i = jVar;
            this.f256303j = z13;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            g1 g1Var = (g1) f2.this.f256292a.get();
            if (g1Var == null) {
                return;
            }
            com.planner5d.library.activity.helper.event.content.a aVarA = ((com.planner5d.library.model.manager.y1) f2.this.f256294c.get()).a();
            com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i(this.f256297d ? this.f256298e : null);
            if (!this.f256297d) {
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.editorCatalog;
                iVar.h(rVar, this.f256298e.getBundle(rVar.f224891a));
            }
            iVar.m(com.planner5d.library.services.r.flyToContestPreview, this.f256299f);
            iVar.m(com.planner5d.library.services.r.launchAgreementsDialog, this.f256300g);
            gd.a aVar = this.f256301h;
            if (aVar != null) {
                iVar.h(com.planner5d.library.services.r.renderData, aVar.a());
            }
            if (this.f256297d) {
                f2.this.h(g1Var, this.f256302i, iVar, aVarA);
                return;
            }
            ((s2) f2.this.f256293b.get()).t(this.f256303j);
            if (g1Var.P1()) {
                Serializable serializableS = this.f256302i.s(com.planner5d.library.services.r.projectRevisionDate, null);
                ((com.planner5d.library.activity.fragment.x) f2.this.f256295d.get()).e(new com.planner5d.library.activity.helper.event.content.d(this.f256303j, this.f256302i.d(com.planner5d.library.services.r.projectRevisionId, 0L), serializableS instanceof Date ? (Date) serializableS : null, this.f256302i.j(com.planner5d.library.services.r.projectData, null)).j(aVarA.h()));
                return;
            }
            if (g1Var.z1()) {
                com.planner5d.library.services.utility.j jVar = this.f256302i;
                com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.projectUri;
                if (jVar.a(rVar2)) {
                    ((com.planner5d.library.activity.fragment.x) f2.this.f256295d.get()).e(new com.planner5d.library.activity.helper.event.content.d(this.f256302i.t(rVar2, com.planner5d.library.model.payments.a.f222474i), this.f256302i.t(com.planner5d.library.services.r.projectUriShare, com.planner5d.library.model.payments.a.f222474i), this.f256302i.t(com.planner5d.library.services.r.projectTitle, com.planner5d.library.model.payments.a.f222474i), this.f256303j, this.f256302i.f(com.planner5d.library.services.r.projectFromGallery, false), iVar.a()).j(aVarA.h()));
                    return;
                }
            }
            if (this.f256303j) {
                iVar.h(com.planner5d.library.services.r.processTicket, com.planner5d.library.model.manager.statistics.f0.f217768d.b(f4.ProjectSwitchFrom2dTo3d).d());
            }
            ((com.planner5d.library.activity.fragment.x) f2.this.f256295d.get()).e(new com.planner5d.library.activity.helper.event.content.d(g1Var.I1(), this.f256303j, iVar.a(), false, ((com.planner5d.library.model.manager.y1) f2.this.f256294c.get()).f()));
        }
    }

    f2(g1 g1Var, s2 s2Var, com.planner5d.library.model.manager.y1 y1Var, com.planner5d.library.activity.fragment.x xVar) {
        this.f256292a = new WeakReference<>(g1Var);
        this.f256293b = new WeakReference<>(s2Var);
        this.f256294c = new WeakReference<>(y1Var);
        this.f256295d = new WeakReference<>(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(g1 g1Var, com.planner5d.library.services.utility.j jVar, com.planner5d.library.services.utility.i iVar, com.planner5d.library.activity.helper.event.content.a aVar) {
        com.planner5d.library.activity.helper.event.content.c cVarJ;
        this.f256293b.get().u();
        Long id2 = g1Var.I1() == null ? null : g1Var.I1().getId();
        Long lX1 = g1Var.x1();
        com.planner5d.library.services.utility.i iVar2 = new com.planner5d.library.services.utility.i();
        this.f256293b.get().D(iVar2);
        if (g1Var.z1()) {
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.projectUri;
            String strT = jVar.t(rVar, null);
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.projectTitle;
            String strT2 = jVar.t(rVar2, null);
            cVarJ = new com.planner5d.library.activity.helper.event.content.d(strT, jVar.t(com.planner5d.library.services.r.projectUriShare, com.planner5d.library.model.payments.a.f222474i), strT2, g1Var.D1(), jVar.f(com.planner5d.library.services.r.projectFromGallery, false), iVar.a()).j(aVar.h());
            iVar2.j(rVar2, strT2);
            iVar2.j(rVar, strT);
        } else {
            com.planner5d.library.services.utility.k3 k3VarG = aVar.g();
            androidx.fragment.app.s sVarA = g1Var.a();
            com.planner5d.library.activity.helper.event.content.d dVar = new com.planner5d.library.activity.helper.event.content.d(id2, lX1, (k3VarG == null || sVarA == null) ? null : k3VarG.i(sVarA).toString(), null, g1Var.D1(), iVar.a(), this.f256294c.get().f());
            iVar2.j(com.planner5d.library.services.r.id, id2 != null ? String.valueOf(id2) : null);
            cVarJ = dVar;
        }
        if (lX1 != null) {
            iVar2.g(com.planner5d.library.services.r.projectId, lX1.longValue());
        }
        this.f256295d.get().e(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) FragmentControllerActivitySwitch.class, new com.planner5d.library.services.utility.i().h(com.planner5d.library.services.r.previous, cVarJ.b().a()).h(com.planner5d.library.services.r.data, iVar2.a()).j(com.planner5d.library.services.r.activity, MainCardboard.class.getName()).a()));
    }

    public void f(boolean z10) {
        g(z10, false, false, null);
    }

    public void g(boolean z10, boolean z11, boolean z12, @androidx.annotation.p0 gd.a aVar) {
        g1 g1Var = this.f256292a.get();
        if (g1Var == null) {
            return;
        }
        com.planner5d.library.services.utility.j jVarL1 = g1Var.L1();
        if (!g1Var.S1()) {
            this.f256296e = true;
            g1Var.k3(false).subscribe((Subscriber<? super Void>) new a(z10, g1Var.t1(), z11, z12, aVar, jVarL1, !g1Var.D1()));
        }
        g1Var.n();
    }

    public void i(com.planner5d.library.services.utility.j jVar) {
        com.planner5d.library.model.manager.statistics.f0 f0VarA;
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.editor;
        if (jVar.a(rVar)) {
            com.planner5d.library.services.utility.j jVar2 = new com.planner5d.library.services.utility.j(jVar.h(rVar, null));
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.processTicket;
            if (!jVar2.a(rVar2) || (f0VarA = com.planner5d.library.model.manager.statistics.f0.f217768d.a(jVar2.h(rVar2, null))) == null) {
                return;
            }
            f0VarA.c();
        }
    }

    public boolean j() {
        return this.f256296e;
    }
}
