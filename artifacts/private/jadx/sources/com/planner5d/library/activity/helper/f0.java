package com.planner5d.library.activity.helper;

import android.os.Bundle;
import android.os.Parcel;
import android.view.DragEvent;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.planner5d.library.activity.Main;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.messages.Messages;
import com.planner5d.library.activity.fragment.startup.StartupPaywall;
import com.planner5d.library.activity.fragment.user.LicenseCheck;
import com.planner5d.library.model.manager.statistics.events.x3;
import java.lang.ref.WeakReference;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes6.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.model.manager.y1 f136814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.modules.user.user.t0 f136815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.modules.user.user.t f136816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.model.manager.statistics.b0 f136817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.application.d f136818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.activity.fragment.dialog.k f136819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.activity.fragment.x f136820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.model.manager.config.p f136821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference<Main> f136822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference<FragmentManager> f136823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private m1 f136824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f136825l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f136826m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.core.util.p<FragmentController, com.planner5d.library.activity.helper.event.content.a> f136827n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.planner5d.library.activity.fragment.projects.c0 f136828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.planner5d.library.model.manager.t1 f136829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.planner5d.library.activity.fragment.n f136830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.planner5d.library.model.manager.config.d f136831r;

    public enum a {
        content(com.planner5d.library.f.j.H7),
        message(com.planner5d.library.f.j.Kg),
        dialog(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.d0
        public final int f136836a;

        static {
            int i10 = 7 ^ 1;
        }

        a(int i10) {
            this.f136836a = i10;
        }
    }

    @ij.a
    public f0(com.planner5d.library.model.manager.y1 y1Var, com.planner5d.library.modules.user.user.t0 t0Var, com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.model.manager.statistics.b0 b0Var, com.planner5d.library.application.d dVar, com.planner5d.library.activity.fragment.dialog.k kVar, com.planner5d.library.activity.fragment.x xVar, com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.activity.fragment.projects.c0 c0Var, com.planner5d.library.model.manager.t1 t1Var, com.planner5d.library.activity.fragment.n nVar, com.planner5d.library.model.manager.config.d dVar2) {
        this.f136814a = y1Var;
        this.f136815b = t0Var;
        this.f136816c = tVar;
        this.f136817d = b0Var;
        this.f136818e = dVar;
        this.f136819f = kVar;
        this.f136820g = xVar;
        this.f136828o = c0Var;
        this.f136821h = pVar;
        this.f136829p = t1Var;
        this.f136830q = nVar;
        this.f136831r = dVar2;
    }

    private com.planner5d.library.activity.helper.event.content.a c() {
        boolean zM = this.f136821h.m(com.planner5d.library.services.r.onboardingPaywallDisplayed, false);
        boolean zM2 = this.f136821h.m(com.planner5d.library.services.r.onboardingPaywallClosed, false);
        if (zM || zM2 || this.f136815b.c()) {
            return new com.planner5d.library.activity.helper.event.content.c((this.f136818e.d() == zc.a.None || this.f136815b.P()) ? this.f136830q.a() : LicenseCheck.class, (Bundle) null).b();
        }
        this.f136822i.get().findViewById(com.planner5d.library.f.j.J7).setVisibility(0);
        return new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) StartupPaywall.class, (Bundle) null).b();
    }

    private void d(ViewGroup viewGroup) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInt(1);
            parcelObtain.writeFloat(0.0f);
            parcelObtain.writeFloat(0.0f);
            parcelObtain.writeFloat(0.0f);
            parcelObtain.writeFloat(0.0f);
            parcelObtain.writeInt(0);
            parcelObtain.setDataPosition(0);
            viewGroup.dispatchDragEvent((DragEvent) DragEvent.CREATOR.createFromParcel(parcelObtain));
        } finally {
            parcelObtain.recycle();
        }
    }

    private <T extends Fragment> T f(a aVar) {
        FragmentManager fragmentManagerG = g();
        if (fragmentManagerG == null) {
            return null;
        }
        int i10 = aVar.f136836a;
        return i10 == 0 ? (T) fragmentManagerG.w0(aVar.name()) : (T) fragmentManagerG.v0(i10);
    }

    @androidx.annotation.p0
    private FragmentManager g() {
        WeakReference<FragmentManager> weakReference = this.f136823j;
        if (weakReference == null) {
            return null;
        }
        FragmentManager fragmentManager = weakReference.get();
        if (fragmentManager == null || fragmentManager.a1()) {
            return null;
        }
        return fragmentManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Integer num) {
        Main main = this.f136822i.get();
        if (main != null) {
            main.invalidateOptionsMenu();
        }
    }

    private void i(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Exception exc) {
        this.f136829p.b("failed_to_navigate", String.format("HelperFragment is started = %b and resumed = %b, fragment manager = %s, destination fragment = %s", Boolean.valueOf(this.f136826m), Boolean.valueOf(this.f136825l), fragmentManager, fragment), exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.l0
    public void j() {
        androidx.core.util.p<FragmentController, com.planner5d.library.activity.helper.event.content.a> pVar;
        if (!this.f136825l || (pVar = this.f136827n) == null) {
            return;
        }
        this.f136827n = null;
        u(pVar.f48411a, pVar.f48412b);
    }

    private void q() {
        FragmentManager fragmentManagerG = g();
        if (fragmentManagerG == null) {
            return;
        }
        a aVar = a.message;
        Fragment fragmentF = f(aVar);
        androidx.fragment.app.t0 t0VarW = fragmentManagerG.w();
        if (fragmentF == null) {
            t0VarW.y(aVar.f136836a, new Messages());
        } else {
            t0VarW.l(fragmentF);
        }
        try {
            t0VarW.n();
        } catch (IllegalStateException unused) {
        }
    }

    @androidx.annotation.l0
    private void r() {
        com.planner5d.library.activity.helper.ui.d dVarE = e();
        if (dVarE != null) {
            Fragment fragmentF = f(a.content);
            if (fragmentF != null && dVarE.f137148o != null) {
                com.planner5d.library.util.navigation.uiview.f.c(fragmentF).getValue().e(dVarE.f137148o);
            }
            com.planner5d.library.activity.helper.ui.d.d(fragmentF, dVarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.l0
    private void u(FragmentController fragmentController, com.planner5d.library.activity.helper.event.content.a aVar) {
        FragmentManager fragmentManagerG;
        Main main = this.f136822i.get();
        if (main == null || (fragmentManagerG = g()) == null) {
            return;
        }
        com.planner5d.library.activity.helper.ui.d uiState = fragmentController instanceof com.planner5d.library.activity.helper.ui.a ? ((com.planner5d.library.activity.helper.ui.a) fragmentController).getUiState(main) : null;
        if (uiState == null) {
            uiState = new com.planner5d.library.activity.helper.ui.d.b(main, fragmentController).x();
        }
        com.planner5d.library.activity.helper.ui.d.e(uiState);
        a aVar2 = a.content;
        ViewGroup viewGroup = (ViewGroup) main.findViewById(aVar2.f136836a);
        d(viewGroup);
        com.planner5d.library.activity.helper.event.content.e eVarB = aVar.b();
        com.planner5d.library.activity.helper.event.content.e eVar = com.planner5d.library.activity.helper.event.content.e.None;
        if (eVarB == eVar) {
            viewGroup.setVisibility(4);
        }
        com.planner5d.library.services.s.f(main.getCurrentFocus(), false);
        try {
            androidx.activity.result.b bVarF = f(aVar2);
            if (bVarF instanceof l2) {
                ((l2) bVarF).beforeReplace();
            }
            androidx.fragment.app.t0 t0VarW = fragmentManagerG.w();
            if (aVar.b() != eVar) {
                if (aVar.c()) {
                    t0VarW.J(aVar.b().l().n(), aVar.b().l().p());
                } else {
                    t0VarW.J(aVar.b().n(), aVar.b().p());
                }
            }
            t0VarW.y(aVar2.f136836a, fragmentController);
            if (fragmentController.isDetached()) {
                t0VarW.l(fragmentController);
            }
            t0VarW.m();
            w wVarG = this.f136824k.g();
            if (wVarG != null) {
                wVarG.a(main);
            }
            this.f136814a.i(aVar);
            this.f136824k.u(aVar, true, true);
            main.invalidateOptionsMenu();
        } catch (Exception e10) {
            i(fragmentManagerG, fragmentController, e10);
            throw new RuntimeException(fragmentController.getClass() + ", " + e10.getMessage());
        }
    }

    @androidx.annotation.p0
    public final com.planner5d.library.activity.helper.ui.d e() {
        androidx.activity.result.b bVarF = f(a.content);
        Main main = this.f136822i.get();
        if (!(bVarF instanceof com.planner5d.library.activity.helper.ui.a) || main == null) {
            return null;
        }
        return ((com.planner5d.library.activity.helper.ui.a) bVarF).getUiState(main);
    }

    public boolean k() {
        androidx.activity.result.b bVarF = f(a.content);
        if ((bVarF instanceof com.planner5d.library.widget.c0) && ((com.planner5d.library.widget.c0) bVarF).onBackPressed()) {
            return true;
        }
        com.planner5d.library.activity.helper.event.content.a aVarA = this.f136814a.a();
        if (aVarA == null) {
            return false;
        }
        com.planner5d.library.activity.helper.event.content.a aVarH = aVarA.h();
        if (aVarH == null) {
            this.f136814a.i(null);
            return false;
        }
        this.f136828o.b(x3.e.back_button);
        this.f136820g.e(new com.planner5d.library.activity.helper.event.content.c(aVarH));
        return true;
    }

    public void l(@NonNull Main main, m1 m1Var) {
        this.f136822i = new WeakReference<>(main);
        this.f136824k = m1Var;
        this.f136825l = true;
        this.f136823j = new WeakReference<>(main.getSupportFragmentManager());
        this.f136819f.i(main);
        com.planner5d.library.services.utility.v1.r(com.planner5d.library.services.m0.f224436i, main, new androidx.lifecycle.d1() { // from class: com.planner5d.library.activity.helper.d0
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f136734a.h((Integer) obj);
            }
        });
        r();
        q();
        this.f136826m = false;
    }

    void m() {
        this.f136822i = new WeakReference<>(null);
    }

    public void n(Bundle bundle) {
        com.planner5d.library.activity.helper.event.content.a aVarA = this.f136814a.a();
        if (aVarA != null) {
            bundle.putBundle(com.planner5d.library.services.r.activeEvent.f224891a, aVarA.a());
        }
    }

    public void o(Bundle bundle) {
        if (this.f136826m) {
            return;
        }
        this.f136826m = true;
        if (bundle == null) {
            t(c(), null);
            return;
        }
        com.planner5d.library.activity.helper.event.content.a aVarA = this.f136814a.a();
        Bundle bundleH = new com.planner5d.library.services.utility.j(bundle).h(com.planner5d.library.services.r.activeEvent, null);
        if (aVarA == null) {
            aVarA = bundleH != null ? new com.planner5d.library.activity.helper.event.content.c(bundleH).b() : c();
        }
        Fragment fragmentF = f(a.content);
        if (fragmentF instanceof FragmentController) {
            FragmentController fragmentController = (FragmentController) fragmentF;
            this.f136814a.i(aVarA);
            if (fragmentController.getView() == null) {
                t(aVarA, fragmentController.getSavedInstanceState());
            }
        } else {
            t(aVarA, null);
        }
        this.f136824k.r();
    }

    public void p() {
        com.planner5d.library.activity.helper.event.content.b.f136790a.c();
        this.f136825l = false;
    }

    public void s() {
        this.f136825l = true;
        j();
        com.planner5d.library.activity.helper.event.content.b.f136790a.d(this);
    }

    public void t(com.planner5d.library.activity.helper.event.content.a aVar, Bundle bundle) {
        if (aVar != null && this.f136827n == null) {
            Fragment fragmentF = f(a.content);
            FragmentController fragmentController = fragmentF instanceof FragmentController ? (FragmentController) fragmentF : null;
            FragmentController fragmentControllerFactory = (fragmentController == null || !aVar.e().isAssignableFrom(fragmentController.getClass()) || !com.planner5d.library.services.utility.k.b(fragmentController.getArguments(), aVar.d()) || bundle == null) ? FragmentController.factory(aVar.e(), aVar.d(), bundle) : fragmentController;
            if (fragmentControllerFactory == fragmentController || fragmentController == null) {
                u(fragmentControllerFactory, aVar);
            } else {
                this.f136827n = new androidx.core.util.p<>(fragmentControllerFactory, aVar);
                Observable.empty().doOnTerminate(new Action0() { // from class: com.planner5d.library.activity.helper.e0
                    @Override // rx.functions.Action0
                    public final void call() {
                        this.f136770a.j();
                    }
                }).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber) new com.planner5d.library.services.rx.e());
            }
            FragmentManager fragmentManagerG = g();
            Fragment fragmentF2 = f(a.dialog);
            if (fragmentF2 != null && fragmentManagerG != null) {
                androidx.fragment.app.t0 t0VarW = fragmentManagerG.w();
                if (fragmentF2 instanceof com.planner5d.library.activity.fragment.dialog.n0) {
                    t0VarW.l(fragmentF2);
                } else {
                    t0VarW.x(fragmentF2);
                }
                t0VarW.m();
            }
            this.f136817d.a(aVar.e());
        }
    }
}
