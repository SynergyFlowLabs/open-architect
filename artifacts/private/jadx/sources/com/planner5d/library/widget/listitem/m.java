package com.planner5d.library.widget.listitem;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.s;
import com.planner5d.library.activity.fragment.ActionsBottomSheetMenuFragment;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.FolderSelection;
import com.planner5d.library.activity.fragment.dialog.message.ConfirmDeleteMessage;
import com.planner5d.library.activity.fragment.dialog.titleedit.ProjectRename;
import com.planner5d.library.activity.fragment.dialog.u;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.f0;
import com.planner5d.library.services.m0;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.w;
import com.planner5d.library.widget.EnhancedRecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import rx.Subscriber;

/* JADX INFO: loaded from: classes8.dex */
public class m extends g<Project> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d0 f258267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final x f258268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.planner5d.library.activity.fragment.dialog.k f258269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Project f258270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b2 f258271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final t f258272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w f258273o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Activity f258274s;

    class a extends w.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Project f258275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f258276b;

        a(Project project, Long l10) {
            this.f258275a = project;
            this.f258276b = l10;
        }

        @Override // com.planner5d.library.services.utility.w.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void d() {
            m.this.f258267i.O(this.f258275a);
            m0.f224430c.t();
            com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.archive, p3.b.success, this.f258276b);
            boolean z10 = true & false;
            return null;
        }
    }

    class b extends com.planner5d.library.services.rx.e<Project> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f258278d;

        b(Long l10) {
            this.f258278d = l10;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            m.this.f258271m.c(th2);
            com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.duplicate, p3.b.error, this.f258278d);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Project project) {
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            com.planner5d.library.model.manager.statistics.events.b2 b2Var = com.planner5d.library.model.manager.statistics.events.b2.f216725b;
            b2Var.u0(x3.a.duplicate, p3.b.success, this.f258278d);
            b2Var.B(x3.c.duplicate_owned, this.f258278d);
        }
    }

    public m(Activity activity, x xVar, com.planner5d.library.services.bitmaploader.target.h hVar, d0 d0Var, p0 p0Var, com.planner5d.library.activity.fragment.dialog.k kVar, b2 b2Var, boolean z10, t tVar, w wVar) {
        super(activity, hVar, p0Var, z10);
        this.f258270l = null;
        this.f258274s = activity;
        this.f258268j = xVar;
        this.f258269k = kVar;
        this.f258267i = d0Var;
        this.f258272n = tVar;
        this.f258271m = b2Var;
        this.f258273o = wVar;
    }

    public static /* synthetic */ Unit E(com.planner5d.library.widget.menu.p pVar, Context context, MenuItem menuItem) {
        pVar.a((s) context, menuItem);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Project project, Long l10, Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        this.f258273o.f(new a(project, l10));
    }

    @Override // com.planner5d.library.widget.listitem.g
    protected boolean A(int i10) {
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
        final Project project = this.f258270l;
        if (project == null) {
            return false;
        }
        final Long l10 = project.projectId;
        if (i10 == com.planner5d.library.f.j.f168317q1) {
            com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.share, null, l10);
            new f0(getContext(), project, this.f258267i).a(this.f258274s);
        } else {
            if (i10 == com.planner5d.library.f.j.f168173k1) {
                com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.archive, null, l10);
                ConfirmDeleteMessage.show(this.f258269k, getContext().getString(com.planner5d.library.f.s.bw), new u() { // from class: com.planner5d.library.widget.listitem.k
                    @Override // com.planner5d.library.activity.fragment.dialog.u
                    public final void a(Object obj) {
                        this.f258262a.H(project, l10, (Boolean) obj);
                    }
                });
                return true;
            }
            if (i10 == com.planner5d.library.f.j.f168197l1) {
                com.planner5d.library.model.manager.statistics.events.b2 b2Var = com.planner5d.library.model.manager.statistics.events.b2.f216725b;
                x3.a aVar = x3.a.remove_from_folder;
                b2Var.u0(aVar, null, l10);
                project.folderId = 0L;
                this.f258267i.N0(this.f258272n.a(), project).subscribe((Subscriber<? super Project>) new com.planner5d.library.services.rx.e());
                m0.f224430c.t();
                b2Var.u0(aVar, p3.b.success, l10);
                return true;
            }
            if (i10 == com.planner5d.library.f.j.R0) {
                com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.duplicate, null, l10);
                this.f258267i.Q(this.f258272n.a(), getContext(), project.getId().longValue()).subscribe((Subscriber<? super Project>) new b(l10));
                return true;
            }
            if (i10 == com.planner5d.library.f.j.f168029e1) {
                com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.to_folder, null, l10);
                iVar.g(r.id, project.getId().longValue());
                if (l10 != null) {
                    iVar.g(r.projectId, l10.longValue());
                }
                iVar.f(r.folderType, Folder.f180529b);
                this.f258269k.c(FolderSelection.class).i(iVar).g();
                return true;
            }
            if (i10 == com.planner5d.library.f.j.f168221m1) {
                com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.rename, null, l10);
                iVar.g(r.id, project.getId().longValue());
                this.f258269k.c(ProjectRename.class).i(iVar).g();
                return true;
            }
        }
        return false;
    }

    @Override // com.planner5d.library.widget.listitem.g
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void B(@NonNull Project project, boolean z10) {
        boolean z11 = this.f258270l != project;
        this.f258270l = project;
        C(project.title, project.m(), z11, z10);
    }

    @Override // com.planner5d.library.widget.listitem.p, com.planner5d.library.widget.d1
    public void a() {
        this.f258270l = null;
        super.a();
    }

    @Override // com.planner5d.library.widget.listitem.p
    protected boolean i() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.widget.listitem.p
    @m1
    /* JADX INFO: renamed from: p */
    public com.planner5d.library.services.bitmaploader.d.C1663d j(Context context, com.planner5d.library.services.bitmaploader.target.a aVar, int i10) {
        return this.f258267i.c0(context, this.f258270l, i10, aVar);
    }

    @Override // com.planner5d.library.widget.listitem.p
    protected com.planner5d.library.services.bitmaploader.d.C1663d q(com.planner5d.library.services.bitmaploader.target.a aVar, int i10) {
        com.planner5d.library.services.bitmaploader.d.C1663d c1663dD0 = this.f258267i.d0(this.f258270l, i10, aVar);
        if (c1663dD0 == null) {
            aVar.j(null, null);
        }
        return c1663dD0;
    }

    @Override // com.planner5d.library.widget.listitem.g
    protected com.planner5d.library.widget.menu.o u(final Context context, FragmentManager fragmentManager, String str, boolean z10, final com.planner5d.library.widget.menu.p pVar, boolean z11) {
        com.planner5d.library.widget.menu.s sVar = new com.planner5d.library.widget.menu.s(getContext(), findViewById(com.planner5d.library.f.j.W4), com.planner5d.library.f.n.f168922o, com.planner5d.library.f.C1549f.f166490ki, pVar);
        sVar.b(getContext(), com.planner5d.library.f.j.f168317q1, com.planner5d.library.f.h.f167535fb).setVisible(this.f258270l.h());
        sVar.b(getContext(), com.planner5d.library.f.j.f168221m1, com.planner5d.library.f.h.Ka);
        sVar.b(getContext(), com.planner5d.library.f.j.f168173k1, com.planner5d.library.f.h.f167877xb);
        sVar.b(getContext(), com.planner5d.library.f.j.f168029e1, com.planner5d.library.f.h.A9).setVisible(z11);
        sVar.b(getContext(), com.planner5d.library.f.j.R0, com.planner5d.library.f.h.f167607j7);
        sVar.b(getContext(), com.planner5d.library.f.j.f168197l1, com.planner5d.library.f.h.f167877xb).setVisible(z10);
        return h3.a0(context) ? sVar : new ActionsBottomSheetMenuFragment(fragmentManager, str, null, sVar.getMenu(), new Function1() { // from class: com.planner5d.library.widget.listitem.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.E(pVar, context, (MenuItem) obj);
            }
        });
    }

    @Override // com.planner5d.library.widget.listitem.g
    protected boolean v() {
        return this.f258270l != null;
    }

    @Override // com.planner5d.library.widget.listitem.g
    protected void z() {
        Project project = this.f258270l;
        if (project != null) {
            com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.open, null, project.projectId);
            x xVar = this.f258268j;
            int i10 = 4 ^ 1;
            com.planner5d.library.activity.helper.event.content.d dVarS = new com.planner5d.library.activity.helper.event.content.d(this.f258270l, false, (Bundle) null, true, (com.planner5d.library.activity.helper.event.content.a) null).s(x3.d.projects, true);
            com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
            r rVar = r.tab;
            r rVar2 = r.floorPlansList;
            xVar.e(dVarS.k(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ProjectsPagesFragment.class, iVar.t(rVar, rVar2).h(rVar2, ((EnhancedRecyclerView) getParent()).getContentBundleWithScrollPosition()).a())));
        }
    }
}
