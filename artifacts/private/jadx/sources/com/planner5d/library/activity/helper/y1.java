package com.planner5d.library.activity.helper;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.ScalableTabLayout;
import com.planner5d.library.widget.Toolbar;
import com.planner5d.library.widget.toolbar.ToolbarShadowOnScrollBehavior;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHelperUIToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperUIToolbar.kt\ncom/planner5d/library/activity/helper/HelperUIToolbar\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,186:1\n1#2:187\n257#3,2:188\n255#3:190\n257#3,2:191\n255#3:193\n257#3,2:194\n257#3,2:196\n*S KotlinDebug\n*F\n+ 1 HelperUIToolbar.kt\ncom/planner5d/library/activity/helper/HelperUIToolbar\n*L\n158#1:188,2\n165#1:190\n166#1:191,2\n50#1:193\n74#1:194,2\n84#1:196,2\n*E\n"})
public final class y1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f137213m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f137214n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f137215o = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.appcompat.app.d f137216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final w f137217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AppBarLayout f137218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Toolbar f137219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final TabLayout f137220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final ToolbarShadowOnScrollBehavior f137221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private k3 f137222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final View.OnClickListener f137223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.activity.helper.event.content.a f137224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f137225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private WeakReference<Fragment> f137226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<com.planner5d.library.activity.helper.ui.d> f137227l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.l(message = "Duplicates the same constant", replaceWith = @kotlin.b1(expression = "AppUiStateHolder.TOOLBAR_TITLE_CHANGE_PERIOD", imports = {"com.planner5d.library.util.navigation.uiview.AppUiStateHolder"}))
        public static /* synthetic */ void a() {
        }

        private a() {
        }
    }

    static final class b implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f137228a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f137228a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f137228a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f137228a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.lifecycle.d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public y1(@NotNull androidx.appcompat.app.d activity, @Nullable Bundle bundle, @NotNull androidx.lifecycle.o0 lifecycleOwner, @NotNull w helperBackButton, @NotNull com.planner5d.library.services.v mainComponentsProvider) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(helperBackButton, "helperBackButton");
        Intrinsics.checkNotNullParameter(mainComponentsProvider, "mainComponentsProvider");
        this.f137216a = activity;
        this.f137217b = helperBackButton;
        this.f137226k = new WeakReference<>(null);
        androidx.lifecycle.w0<com.planner5d.library.activity.helper.ui.d> active = com.planner5d.library.activity.helper.ui.d.f137133w;
        Intrinsics.checkNotNullExpressionValue(active, "active");
        androidx.lifecycle.w0<com.planner5d.library.activity.helper.ui.d> w0VarG = androidx.lifecycle.w.g(kotlinx.coroutines.flow.k.d0(androidx.lifecycle.w.a(active), new Function1() { // from class: com.planner5d.library.activity.helper.u1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(y1.h(this.f137128a, (com.planner5d.library.activity.helper.ui.d) obj));
            }
        }), null, 0L, 3, null);
        this.f137227l = w0VarG;
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(activity, null).x();
        this.f137218c = mainComponentsProvider.b(activity);
        this.f137220e = mainComponentsProvider.c(activity);
        this.f137221f = m1.j(activity);
        Toolbar toolbarI = m1.i(activity);
        this.f137219d = toolbarI;
        activity.setSupportActionBar(toolbarI);
        this.f137219d.w(dVarX.f137144k, dVarX.f137146m);
        Serializable serializableS = new com.planner5d.library.services.utility.j(bundle).s(com.planner5d.library.services.r.uiTitleOverride, null);
        this.f137222g = serializableS instanceof k3 ? (k3) serializableS : null;
        this.f137223h = new View.OnClickListener() { // from class: com.planner5d.library.activity.helper.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y1.e(this.f137184a, view);
            }
        };
        final LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) activity.findViewById(com.planner5d.library.f.j.Gg);
        final View viewFindViewById = activity.findViewById(com.planner5d.library.f.j.Eg);
        active.k(lifecycleOwner, new b(new Function1() { // from class: com.planner5d.library.activity.helper.w1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.f(this.f137188a, viewFindViewById, (com.planner5d.library.activity.helper.ui.d) obj);
            }
        }));
        w0VarG.k(lifecycleOwner, new b(new Function1() { // from class: com.planner5d.library.activity.helper.x1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.g(this.f137205a, viewFindViewById, linearProgressIndicator, (com.planner5d.library.activity.helper.ui.d) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(y1 y1Var, View view) {
        y1Var.f137216a.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(y1 y1Var, View view, com.planner5d.library.activity.helper.ui.d dVar) {
        boolean zC = dVar.f137150q.c();
        ((ScalableTabLayout) y1Var.f137220e).setInterceptTouches(zC || dVar.f137153t);
        Intrinsics.checkNotNull(view);
        view.setVisibility(zC ? 0 : 8);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(y1 y1Var, View view, LinearProgressIndicator linearProgressIndicator, com.planner5d.library.activity.helper.ui.d dVar) {
        y1Var.f137225j = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNull(dVar);
        y1Var.n(dVar);
        com.planner5d.library.activity.helper.ui.d.a backButtonState = dVar.f137135b;
        Intrinsics.checkNotNullExpressionValue(backButtonState, "backButtonState");
        y1Var.o(backButtonState);
        y1Var.p(dVar);
        boolean zC = dVar.f137150q.c();
        ((ScalableTabLayout) y1Var.f137220e).setInterceptTouches(zC || dVar.f137153t);
        Intrinsics.checkNotNull(view);
        view.setVisibility(zC ? 0 : 8);
        if (dVar.f137150q.a()) {
            linearProgressIndicator.q();
        } else {
            linearProgressIndicator.j();
        }
        if (dVar.f137151r) {
            y1Var.f137216a.invalidateOptionsMenu();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(y1 y1Var, com.planner5d.library.activity.helper.ui.d dVar) {
        Intrinsics.checkNotNull(dVar);
        if (!y1Var.j(dVar)) {
            if (dVar.f137142i == (y1Var.f137219d.getVisibility() == 0) && !dVar.f137151r) {
                return kotlin.ranges.r.v(1000 - (SystemClock.elapsedRealtime() - y1Var.f137225j), 0L);
            }
        }
        return 0L;
    }

    private final boolean j(com.planner5d.library.activity.helper.ui.d dVar) {
        boolean z10 = !Intrinsics.areEqual(dVar.c(), this.f137226k.get());
        this.f137226k = new WeakReference<>(dVar.c());
        return z10;
    }

    private final void n(com.planner5d.library.activity.helper.ui.d dVar) {
        boolean z10 = true;
        boolean z11 = this.f137219d.getVisibility() == 0;
        boolean z12 = dVar.f137142i;
        if (z11 != z12) {
            this.f137219d.setVisibility(z12 ? 0 : 8);
            this.f137218c.B(dVar.f137142i, false);
        }
        ToolbarShadowOnScrollBehavior toolbarShadowOnScrollBehavior = this.f137221f;
        if (toolbarShadowOnScrollBehavior != null) {
            if (!dVar.f137149p && !dVar.f137143j) {
                z10 = false;
            }
            toolbarShadowOnScrollBehavior.p0(z10);
        }
    }

    private final void o(com.planner5d.library.activity.helper.ui.d.a aVar) {
        if (!aVar.l()) {
            if (aVar == com.planner5d.library.activity.helper.ui.d.a.f137155b) {
                com.planner5d.library.activity.helper.event.content.a aVar2 = this.f137224i;
                if ((aVar2 != null ? aVar2.h() : null) != null) {
                }
            }
            this.f137217b.c(this.f137216a, this.f137219d, false);
            return;
        }
        Toolbar toolbar = this.f137219d;
        toolbar.setNavigationIcon(androidx.core.content.res.i.g(toolbar.getResources(), aVar.f137160a.booleanValue() ? com.planner5d.library.f.h.f167626k7 : com.planner5d.library.f.h.F6, null));
        this.f137217b.c(this.f137216a, this.f137219d, true);
        this.f137219d.setNavigationOnClickListener(this.f137223h);
    }

    private final void p(com.planner5d.library.activity.helper.ui.d dVar) {
        this.f137222g = dVar.f137148o;
        if (dVar.f137150q.a()) {
            return;
        }
        Toolbar toolbar = this.f137219d;
        k3 k3Var = this.f137222g;
        toolbar.setTitle(k3Var != null ? k3Var.i(this.f137216a) : null);
        this.f137219d.setTitleTextColor(dVar.f137144k);
    }

    @NotNull
    public final androidx.appcompat.app.d i() {
        return this.f137216a;
    }

    public final void k() {
        Toolbar toolbar = this.f137219d;
        k3 k3Var = this.f137222g;
        toolbar.setTitle(k3Var != null ? k3Var.i(this.f137216a) : null);
    }

    public final void l(@NotNull Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        state.putSerializable(com.planner5d.library.services.r.uiTitleOverride.f224891a, this.f137222g);
    }

    public final void m(@NotNull com.planner5d.library.activity.helper.event.content.a event, boolean z10) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f137224i = event;
        com.planner5d.library.activity.helper.ui.d dVarF = com.planner5d.library.activity.helper.ui.d.f137133w.f();
        if (dVarF == null) {
            return;
        }
        boolean z11 = (dVarF.f137135b == com.planner5d.library.activity.helper.ui.d.a.f137155b && event.h() != null) || dVarF.f137135b.l();
        if (this.f137219d.getVisibility() != 0) {
            this.f137219d.setVisibility(0);
        }
        n(dVarF);
        if (z10) {
            this.f137219d.getMenu().clear();
            this.f137219d.invalidate();
            this.f137219d.setLogo((Drawable) null);
        }
        this.f137217b.c(this.f137216a, this.f137219d, z11);
        if (z11) {
            this.f137219d.setNavigationOnClickListener(this.f137223h);
        }
        androidx.appcompat.app.a supportActionBar = this.f137216a.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.X(true);
            supportActionBar.l0(true);
            if (h3.U(this.f137219d.getContext())) {
                supportActionBar.j0(com.planner5d.library.f.h.N8);
            }
        }
        Toolbar toolbar = this.f137219d;
        k3 k3Var = this.f137222g;
        toolbar.setTitle(k3Var != null ? k3Var.i(this.f137216a) : null);
        Toolbar toolbar2 = this.f137219d;
        k3 k3VarF = event.f();
        toolbar2.setSubtitle(k3VarF != null ? k3VarF.i(this.f137216a) : null);
        this.f137219d.w(dVarF.f137144k, dVarF.f137146m);
        this.f137218c.setBackgroundColor(dVarF.f137146m);
        this.f137220e.setVisibility(dVarF.f137147n ? 0 : 8);
        this.f137220e.setSelectedTabIndicatorColor(dVarF.f137144k);
        this.f137220e.L();
        this.f137220e.t();
    }
}
