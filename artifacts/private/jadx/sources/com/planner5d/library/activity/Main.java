package com.planner5d.library.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.i0;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.fragment.projects.c0;
import com.planner5d.library.activity.fragment.startup.StartupFragment;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.activity.helper.e2;
import com.planner5d.library.activity.helper.f0;
import com.planner5d.library.activity.helper.f2;
import com.planner5d.library.activity.helper.l0;
import com.planner5d.library.activity.helper.m;
import com.planner5d.library.activity.helper.n;
import com.planner5d.library.activity.helper.z0;
import com.planner5d.library.databinding.y2;
import com.planner5d.library.model.manager.m2;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.modules.user.auth.r;
import com.planner5d.library.services.download.DownloadService;
import com.planner5d.library.services.upload.DocumentService;
import com.planner5d.library.services.v;
import com.planner5d.library.widget.AppBarLayout;
import com.planner5d.library.widget.ScalableTabLayout;
import com.unity3d.player.PlatformSupportAdaptingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Main.kt\ncom/planner5d/library/activity/Main\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n1#2:276\n*E\n"})
public final class Main extends androidx.appcompat.app.d implements com.planner5d.library.activity.fragment.messages.a, com.planner5d.library.model.manager.initialization.b, v {
    public static final int H1 = 7;
    public static final int X = 2;
    public static final int Y = 3;
    public static final int Z = 4;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f131443p0 = 5;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f131444p1 = 6;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f131445p2 = 9;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final a f131446v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f131447w = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ n f131448a = n.f137056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    public z0 f131449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    public l0 f131450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    public k f131451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    public x f131452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.initialization.d<Main, e2, f2> f131453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.services.download.a f131454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.services.upload.a f131455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.widget.editor.controls.a f131456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.config.d f131457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ij.a
    public c0 f131458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ij.a
    public m2 f131459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @ij.a
    public sd.k f131460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @ij.a
    public sd.e f131461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.appupdate.h f131462o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @ij.a
    public r f131463s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public y2 f131464t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f131465a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f131465a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f131465a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f131465a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    private final com.planner5d.library.model.manager.initialization.a<Main> T() {
        return U().c(this);
    }

    private final StartupFragment Z() {
        Fragment fragmentW0 = getSupportFragmentManager().w0(com.planner5d.library.model.manager.initialization.d.f191607f.a());
        if (fragmentW0 instanceof StartupFragment) {
            return (StartupFragment) fragmentW0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a0(Main main, MenuItem it) {
        l3.b bVar;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getItemId() == main.I().f159946b.getSelectedItemId()) {
            return false;
        }
        int itemId = it.getItemId();
        if (itemId == com.planner5d.library.f.j.f167939aa) {
            bVar = l3.b.toolbar_menu;
        } else {
            if (itemId == com.planner5d.library.f.j.no) {
                main.Y().b(x3.e.my_projects);
            }
            bVar = null;
        }
        Class<? extends FragmentController> clsG = new m(main.O()).g(it.getItemId());
        if (clsG == null) {
            return false;
        }
        x.g(main.V(), new com.planner5d.library.activity.helper.event.content.c(clsG, bVar != null ? new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.source, bVar).a() : null), false, 2, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(Main main, com.planner5d.library.services.download.a.C1671a c1671a) {
        if (c1671a != null) {
            DownloadService.a aVar = DownloadService.f224236d;
            Application application = main.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            aVar.f(application, c1671a.b(), c1671a.a());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(Main main, com.planner5d.library.services.upload.a.C1685a c1685a) {
        if (c1685a != null) {
            DocumentService.a aVar = DocumentService.f224995d;
            Application application = main.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            aVar.d(application, c1685a.a(), c1685a.b());
        }
        return Unit.f312394a;
    }

    private final void t0() {
        androidx.activity.l0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.planner5d.library.activity.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Main.u0(this.f131481a, (i0) obj);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(Main main, i0 addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        if (main.w0() || main.T().onBackPressed()) {
            addCallback.setEnabled(false);
            main.getOnBackPressedDispatcher().p();
        }
        return Unit.f312394a;
    }

    private final com.readystatesoftware.systembartint.b v0() {
        com.readystatesoftware.systembartint.b bVar = new com.readystatesoftware.systembartint.b(this);
        bVar.p(536870912);
        bVar.m(true);
        return bVar;
    }

    private final boolean w0() {
        StartupFragment startupFragmentZ = Z();
        return (startupFragmentZ == null || startupFragmentZ.onBackPressed()) ? false : true;
    }

    @NotNull
    public final y2 I() {
        y2 y2Var = this.f131464t;
        if (y2Var != null) {
            return y2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.config.d J() {
        com.planner5d.library.model.manager.config.d dVar = this.f131457j;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.widget.editor.controls.a K() {
        com.planner5d.library.widget.editor.controls.a aVar = this.f131456i;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlsHandler");
        return null;
    }

    @NotNull
    public final k L() {
        k kVar = this.f131451d;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @NotNull
    public final com.planner5d.library.services.upload.a M() {
        com.planner5d.library.services.upload.a aVar = this.f131455h;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("documentNotification");
        return null;
    }

    @NotNull
    public final com.planner5d.library.services.download.a N() {
        com.planner5d.library.services.download.a aVar = this.f131454g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("downloadNotification");
        return null;
    }

    @NotNull
    public final sd.e O() {
        sd.e eVar = this.f131461n;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("firebaseInAppMessageTrigger");
        return null;
    }

    @NotNull
    public final sd.k P() {
        sd.k kVar = this.f131460m;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("firebaseInAppMessagingCallbacks");
        return null;
    }

    @NotNull
    public final l0 Q() {
        l0 l0Var = this.f131450c;
        if (l0Var != null) {
            return l0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperPayment");
        return null;
    }

    @NotNull
    public final z0 R() {
        z0 z0Var = this.f131449b;
        if (z0Var != null) {
            return z0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperProjectImport");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.appupdate.h S() {
        com.planner5d.library.model.manager.appupdate.h hVar = this.f131462o;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inAppUpdateManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.initialization.d<Main, e2, f2> U() {
        com.planner5d.library.model.manager.initialization.d<Main, e2, f2> dVar = this.f131453f;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("initializableHandler");
        return null;
    }

    @NotNull
    public final x V() {
        x xVar = this.f131452e;
        if (xVar != null) {
            return xVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @NotNull
    public final m2 W() {
        m2 m2Var = this.f131459l;
        if (m2Var != null) {
            return m2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationPermissionManager");
        return null;
    }

    @NotNull
    public final r X() {
        r rVar = this.f131463s;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("socialServiceAuthorization");
        return null;
    }

    @NotNull
    public final c0 Y() {
        c0 c0Var = this.f131458k;
        if (c0Var != null) {
            return c0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sourceManager");
        return null;
    }

    @Override // com.planner5d.library.model.manager.initialization.b
    public void a() {
        P().m();
    }

    @Override // com.planner5d.library.services.v
    @NotNull
    public AppBarLayout b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.f131448a.b(activity);
    }

    @Override // com.planner5d.library.services.v
    @NotNull
    public ScalableTabLayout c(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.f131448a.c(activity);
    }

    public final void d0(@NotNull y2 y2Var) {
        Intrinsics.checkNotNullParameter(y2Var, "<set-?>");
        this.f131464t = y2Var;
    }

    public final void e0(@NotNull com.planner5d.library.model.manager.config.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f131457j = dVar;
    }

    public final void f0(@NotNull com.planner5d.library.widget.editor.controls.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f131456i = aVar;
    }

    public final void g0(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f131451d = kVar;
    }

    @Override // com.planner5d.library.activity.fragment.messages.a
    @Nullable
    public BottomSheetBehavior<View> getBottomSheetBehavior() {
        View viewFindViewById = findViewById(f0.a.message.f136836a);
        if (viewFindViewById == null) {
            return null;
        }
        return BottomSheetBehavior.x0(viewFindViewById);
    }

    public final void h0(@NotNull com.planner5d.library.services.upload.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f131455h = aVar;
    }

    public final void i0(@NotNull com.planner5d.library.services.download.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f131454g = aVar;
    }

    public final void j0(@NotNull sd.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f131461n = eVar;
    }

    public final void k0(@NotNull sd.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f131460m = kVar;
    }

    public final void l0(@NotNull l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<set-?>");
        this.f131450c = l0Var;
    }

    public final void m0(@NotNull z0 z0Var) {
        Intrinsics.checkNotNullParameter(z0Var, "<set-?>");
        this.f131449b = z0Var;
    }

    public final void n0(@NotNull com.planner5d.library.model.manager.appupdate.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.f131462o = hVar;
    }

    public final void o0(@NotNull com.planner5d.library.model.manager.initialization.d<Main, e2, f2> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f131453f = dVar;
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, android.app.Activity
    protected void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        super.onActivityResult(i10, i11, intent);
        T().e(i10, i11, intent);
        R().g(this, i10, i11, intent);
        X().l(i10, i11, intent);
    }

    @Override // androidx.appcompat.app.d, androidx.activity.l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        T().onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        PlatformSupportAdaptingActivity.Start(this);
        t0();
        v0();
        y2 y2VarC = y2.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(y2VarC, "inflate(...)");
        setContentView(y2VarC.getRoot());
        d0(y2VarC);
        com.planner5d.library.application.b.f142455c.a().e2(this);
        W().d(this);
        S().D(this);
        BottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.g(5);
        }
        Q().v(this);
        I().f159946b.setOnItemSelectedListener(new NavigationBarView.d() { // from class: com.planner5d.library.activity.c
            @Override // com.google.android.material.navigation.NavigationBarView.d
            public final boolean a(MenuItem menuItem) {
                return Main.a0(this.f131478a, menuItem);
            }
        });
        U().e(this, com.planner5d.library.f.j.Ig, bundle);
        X().m();
        N().v().k(this, new b(new Function1() { // from class: com.planner5d.library.activity.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Main.b0(this.f131479a, (com.planner5d.library.services.download.a.C1671a) obj);
            }
        }));
        M().v().k(this, new b(new Function1() { // from class: com.planner5d.library.activity.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Main.c0(this.f131480a, (com.planner5d.library.services.upload.a.C1685a) obj);
            }
        }));
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        T().b();
        X().q();
    }

    @Override // androidx.appcompat.app.d, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, @Nullable KeyEvent keyEvent) {
        return K().d(keyEvent, i10) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, @Nullable KeyEvent keyEvent) {
        return K().b(keyEvent, i10) || super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.activity.l, android.app.Activity
    protected void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        T().c(intent);
        StartupFragment startupFragmentZ = Z();
        if (startupFragmentZ != null) {
            startupFragmentZ.onNewIntent(intent);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return T().h(item) || super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onPause() {
        super.onPause();
        L().f();
        T().d();
    }

    @Override // androidx.appcompat.app.d, android.app.Activity
    protected void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        T().k();
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        T().l();
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NotNull String[] permissions, @NotNull int[] results) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(results, "results");
        super.onRequestPermissionsResult(i10, permissions, results);
        T().onRequestPermissionsResult(i10, permissions, results);
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onResume() {
        super.onResume();
        L().g();
        S().F();
    }

    @Override // androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        T().f(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onStart() {
        super.onStart();
        T().m();
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onStop() {
        T().a();
        super.onStop();
    }

    public final void p0(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.f131452e = xVar;
    }

    public final void q0(@NotNull m2 m2Var) {
        Intrinsics.checkNotNullParameter(m2Var, "<set-?>");
        this.f131459l = m2Var;
    }

    public final void r0(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.f131463s = rVar;
    }

    public final void s0(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<set-?>");
        this.f131458k = c0Var;
    }
}
