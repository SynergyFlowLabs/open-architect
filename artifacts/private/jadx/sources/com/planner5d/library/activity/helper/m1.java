package com.planner5d.library.activity.helper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.g3;
import androidx.core.view.v3;
import com.planner5d.library.activity.fragment.dialog.message.UserMessage;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.TabLayout;
import com.planner5d.library.widget.Toolbar;
import com.planner5d.library.widget.toolbar.ToolbarShadowOnScrollBehavior;
import java.util.List;
import rx.Subscriber;
import rx.Subscription;

/* JADX INFO: loaded from: classes6.dex */
public class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.y1 f137037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.activity.fragment.dialog.k f137038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.modules.user.user.t f137039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.modules.user.user.e0 f137040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.activity.fragment.x f137041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ij.a
    protected sd.e f137042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.services.v f137043g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Subscription f137046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.appcompat.app.d f137047k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f137044h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f137045i = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private y1 f137048l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private w f137049m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private q1 f137050n = null;

    class a extends com.planner5d.library.services.rx.e<id.b> {
        a() {
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(id.b bVar) {
            if (m1.this.f137045i) {
                m1.this.f137040d.h(bVar);
                m1.this.f137038b.c(UserMessage.class).k(bVar).g();
            }
        }
    }

    class b extends androidx.core.view.l2.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f137052e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.activity.helper.ui.d f137053f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, View view, com.planner5d.library.activity.helper.ui.d dVar) {
            super(i10);
            this.f137052e = view;
            this.f137053f = dVar;
        }

        @Override // androidx.core.view.l2.b
        @NonNull
        public g3 e(@NonNull g3 g3Var, @NonNull List<androidx.core.view.l2> list) {
            androidx.core.graphics.j jVarF = g3Var.f(g3.m.i());
            this.f137052e.setPadding(jVarF.f47823a, this.f137053f.f137138e ? jVarF.f47824b : 0, jVarF.f47825c, jVarF.f47826d);
            return g3Var;
        }
    }

    @ij.a
    public m1() {
    }

    private void A(@NonNull com.planner5d.library.activity.helper.event.content.a aVar, boolean z10, boolean z11) {
        k3 k3VarB;
        if (z11 && (k3VarB = this.f137037a.b(aVar)) != null) {
            com.planner5d.library.activity.helper.ui.d.i(k3VarB);
        }
        this.f137048l.m(aVar, z10);
        w wVar = this.f137049m;
        if (wVar != null) {
            wVar.b(this.f137047k);
        }
    }

    private static void B(@NonNull final Window window, @NonNull View view, @NonNull final com.planner5d.library.activity.helper.ui.d dVar) {
        androidx.core.view.u1.j2(view, new androidx.core.view.b1() { // from class: com.planner5d.library.activity.helper.k1
            @Override // androidx.core.view.b1
            public final g3 b(View view2, g3 g3Var) {
                return m1.a(dVar, window, view2, g3Var);
            }
        });
    }

    public static /* synthetic */ g3 a(com.planner5d.library.activity.helper.ui.d dVar, Window window, View view, g3 g3Var) {
        androidx.core.graphics.j jVarG = g3Var.g(g3.m.i());
        view.setPadding(jVarG.f47823a, dVar.f137138e ? jVarG.f47824b : 0, jVarG.f47825c, jVarG.f47826d);
        t1.a(window, jVarG.f47826d + window.getContext().getResources().getDimensionPixelSize(com.planner5d.library.f.g.Hh));
        return g3Var;
    }

    public static /* synthetic */ g3 b(View view, g3 g3Var) {
        return g3Var;
    }

    private static void f(@NonNull View view) {
        androidx.core.view.u1.j2(view, new androidx.core.view.b1() { // from class: com.planner5d.library.activity.helper.l1
            @Override // androidx.core.view.b1
            public final g3 b(View view2, g3 g3Var) {
                return m1.b(view2, g3Var);
            }
        });
    }

    private static View h(@NonNull Window window) {
        return window.findViewById(com.planner5d.library.f.j.Ig);
    }

    public static Toolbar i(Activity activity) {
        return (Toolbar) activity.findViewById(com.planner5d.library.f.j.uw);
    }

    @androidx.annotation.p0
    public static ToolbarShadowOnScrollBehavior j(Activity activity) {
        ViewGroup.LayoutParams layoutParams = activity.findViewById(com.planner5d.library.f.j.H7).getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.g)) {
            return null;
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) layoutParams).f();
        if (cVarF instanceof ToolbarShadowOnScrollBehavior) {
            return (ToolbarShadowOnScrollBehavior) cVarF;
        }
        return null;
    }

    public static TabLayout k(Activity activity) {
        return (TabLayout) activity.findViewById(com.planner5d.library.f.j.yw);
    }

    public static void t(Window window, int i10) {
        window.setSoftInputMode(i10);
        com.planner5d.library.activity.helper.ui.d dVarF = com.planner5d.library.activity.helper.ui.d.f137133w.f();
        if (dVarF != null) {
            y(window, dVarF);
            x(window, dVarF);
        }
    }

    private void v(androidx.appcompat.app.d dVar, com.planner5d.library.activity.helper.ui.d dVar2) {
        View viewFindViewById = dVar.findViewById(com.planner5d.library.f.j.I7);
        int i10 = dVar2.f137140g;
        if (i10 == 0) {
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.setBackgroundColor(i10);
            viewFindViewById.setVisibility(0);
        }
    }

    private static void w(@NonNull View view, @NonNull com.planner5d.library.activity.helper.ui.d dVar) {
        androidx.core.view.u1.G2(view, new b(0, view, dVar));
    }

    public static void x(@NonNull Window window, @NonNull com.planner5d.library.activity.helper.ui.d dVar) {
        window.setNavigationBarColor(dVar.f137139f);
        new v3(window, window.getDecorView()).h(dVar.f137141h);
    }

    public static void y(@NonNull Window window, @NonNull com.planner5d.library.activity.helper.ui.d dVar) {
        z(window, dVar);
        androidx.core.view.k2.c(window, false);
        f(window.findViewById(com.planner5d.library.f.j.f168344r4));
        f(window.findViewById(com.planner5d.library.f.j.Kg));
        View viewH = h(window);
        B(window, viewH, dVar);
        w(viewH, dVar);
    }

    private static void z(@NonNull Window window, @NonNull com.planner5d.library.activity.helper.ui.d dVar) {
        window.setStatusBarColor(dVar.f137136c);
        new v3(window, window.getDecorView()).i(!dVar.f137137d);
    }

    public m1 d(androidx.appcompat.app.d dVar, Bundle bundle) {
        if (this.f137044h) {
            return this;
        }
        this.f137044h = true;
        this.f137047k = dVar;
        w wVar = new w();
        this.f137049m = wVar;
        this.f137048l = new y1(dVar, bundle, dVar, wVar, this.f137043g);
        this.f137050n = new q1(dVar, this.f137042f);
        new s1(dVar, dVar);
        this.f137046j = this.f137040d.d(dVar).subscribe((Subscriber<? super id.b>) new a());
        return this;
    }

    public void e() {
        if (this.f137044h) {
            this.f137044h = false;
            this.f137046j.unsubscribe();
        }
    }

    @androidx.annotation.p0
    public w g() {
        return this.f137049m;
    }

    public void l(@androidx.annotation.p0 com.planner5d.library.activity.helper.ui.d dVar) {
        if (dVar != null) {
            com.planner5d.library.activity.helper.ui.d.e(dVar);
        }
        u(this.f137037a.a(), false, true);
        this.f137047k.invalidateOptionsMenu();
    }

    public boolean m() {
        return this.f137037a.h();
    }

    public void n() {
        w wVar = this.f137049m;
        if (wVar != null) {
            wVar.b(this.f137047k);
        }
    }

    public void o() {
        w wVar = this.f137049m;
        if (wVar != null) {
            wVar.b(this.f137047k);
        }
        this.f137048l.k();
    }

    public void p(Bundle bundle) {
        this.f137048l.l(bundle);
    }

    public void q() {
        if (this.f137045i) {
            this.f137045i = false;
        }
    }

    public void r() {
        u(this.f137037a.a(), false, true);
        this.f137047k.invalidateOptionsMenu();
    }

    public void s() {
        if (this.f137045i) {
            return;
        }
        this.f137045i = true;
    }

    public void u(com.planner5d.library.activity.helper.event.content.a aVar, boolean z10, boolean z11) {
        Window window = this.f137047k.getWindow();
        com.planner5d.library.activity.helper.ui.d dVarF = com.planner5d.library.activity.helper.ui.d.f137133w.f();
        if (dVarF != null) {
            this.f137047k.setRequestedOrientation(dVarF.f137134a);
            if (window != null) {
                y(window, dVarF);
                x(window, dVarF);
                v(this.f137047k, dVarF);
            }
        }
        A(aVar, z11, z10);
        id.a aVarA = this.f137039c.a();
        String str = aVarA == null ? null : aVarA.f287079e;
        this.f137050n.i(this.f137047k, aVar, str == null || str.isEmpty(), dVarF != null && dVarF.f137149p, dVarF != null && dVarF.f137152s);
    }
}
