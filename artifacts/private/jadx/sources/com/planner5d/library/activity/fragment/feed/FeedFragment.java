package com.planner5d.library.activity.fragment.feed;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i2;
import androidx.paging.q1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.video.VideoPlayerDialog;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.activity.helper.l2;
import com.planner5d.library.aichat.view.fragment.ChatFragment;
import com.planner5d.library.databinding.y2;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.widget.EnhancedRecyclerView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFeedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedFragment.kt\ncom/planner5d/library/activity/fragment/feed/FeedFragment\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 BundleParser.kt\ncom/planner5d/library/services/utility/BundleParser\n*L\n1#1,221:1\n12#2,6:222\n28#2:228\n1#3:229\n67#4,4:230\n37#4,2:234\n55#4:236\n72#4:237\n257#4,2:272\n257#4,2:274\n58#5,17:238\n58#5,17:255\n*S KotlinDebug\n*F\n+ 1 FeedFragment.kt\ncom/planner5d/library/activity/fragment/feed/FeedFragment\n*L\n81#1:222,6\n81#1:228\n200#1:230,4\n200#1:234,2\n200#1:236\n200#1:237\n215#1:272,2\n112#1:274,2\n203#1:238,17\n208#1:255,17\n*E\n"})
public final class FeedFragment extends FragmentController implements com.planner5d.library.activity.helper.ui.a, l2 {
    public static final int $stable = 8;

    @ij.a
    public com.planner5d.library.activity.fragment.list.d0 actionsObserve;

    @ij.a
    public com.planner5d.library.services.utility.t coroutineDispatchers;

    @ij.a
    public com.planner5d.library.activity.fragment.dialog.k dialogLauncher;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f133172e = com.planner5d.library.util.navigation.uiview.f.c(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f133173f;

    @ij.a
    public com.planner5d.library.activity.fragment.feed.holders.a factory;

    @ij.a
    public com.planner5d.library.model.manager.config.j featureConfigManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.planner5d.library.databinding.t0 f133174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f133175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private wa.b f133176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f133177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f133178k;

    @ij.a
    public b2 messageManager;

    @ij.a
    public c2 networkStateUtility;

    @ij.a
    @oj.f
    @Nullable
    public com.planner5d.library.activity.fragment.projects.z0 uploadPlanViewProvider;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function1<jc.e, Unit> {
        a(Object obj) {
            super(1, obj, e1.class, "toggleDesignOfTheDayFavorite", "toggleDesignOfTheDayFavorite(Lcom/planner5d/library/feed/model/DesignOfTheDayListItem;)V", 0);
        }

        public final void X(jc.e p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            ((e1) this.receiver).J1(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(jc.e eVar) {
            X(eVar);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 FeedFragment.kt\ncom/planner5d/library/activity/fragment/feed/FeedFragment\n*L\n1#1,52:1\n70#2:53\n200#3:54\n*E\n"})
    public static final class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView f133179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Parcelable f133180b;

        public b(RecyclerView recyclerView, Parcelable parcelable) {
            this.f133179a = recyclerView;
            this.f133180b = parcelable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            RecyclerView.p layoutManager = this.f133179a.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.x1(this.f133180b);
            }
        }
    }

    static final class c implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f133181a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f133181a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f133181a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f133181a.invoke(obj);
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

    public FeedFragment() {
        t3 t3Var = t3.f229751a;
        this.f133173f = new i2(j1.d(e1.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f133175h = com.planner5d.library.services.network.f.f224463a.f(this);
        com.planner5d.library.services.bitmaploader.target.h hVarA = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        Intrinsics.checkNotNullExpressionValue(hVarA, "create(...)");
        this.f133177j = hVarA;
        this.f133178k = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.feed.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeedFragment.I(this.f133185a);
            }
        });
        com.planner5d.library.application.b.f142455c.a().c2(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0 I(FeedFragment feedFragment) {
        return new l0(feedFragment.getFactory(), androidx.lifecycle.p0.a(feedFragment), feedFragment.getCoroutineDispatchers(), feedFragment.f133177j, feedFragment.O(), feedFragment.O(), feedFragment.O(), new a(feedFragment.O()), feedFragment.getArguments());
    }

    private final boolean J() {
        return getFeatureConfigManager().a(com.planner5d.library.model.manager.config.f.BernardChat) && !getFeatureConfigManager().a(com.planner5d.library.model.manager.config.f.BernardEditor);
    }

    private final l0 K() {
        return (l0) this.f133178k.getValue();
    }

    private final com.planner5d.library.util.navigation.uiview.c L() {
        return (com.planner5d.library.util.navigation.uiview.c) this.f133172e.getValue();
    }

    private final com.planner5d.library.services.network.b M() {
        return (com.planner5d.library.services.network.b) this.f133175h.getValue();
    }

    private final Parcelable N(Bundle bundle) {
        Parcelable parcelable;
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.scrollPositionVertical;
        Parcelable parcelable2 = null;
        try {
            parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) jVar.g().getParcelable(rVar.f224891a, Parcelable.class) : jVar.g().getParcelable(rVar.f224891a);
            if (parcelable == null) {
                parcelable = null;
            }
        } catch (ClassCastException unused) {
        }
        if (parcelable != null) {
            parcelable2 = parcelable;
        }
        return parcelable2;
    }

    private final e1 O() {
        return (e1) this.f133173f.getValue();
    }

    private final void P() {
        O().o1().k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.activity.fragment.feed.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeedFragment.Q(this.f133192a, (l1.k) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(FeedFragment feedFragment, l1.k kVar) {
        com.planner5d.library.util.navigation.uiview.c cVarL = feedFragment.L();
        boolean zG = kVar.g();
        Integer numH = kVar.h();
        cVarL.b(zG, numH != null ? new k3(numH.intValue(), new Object[0]) : null, true);
        com.planner5d.library.databinding.t0 t0Var = feedFragment.f133174g;
        if (t0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            t0Var = null;
        }
        SwipeRefreshLayout swipeRefreshLayout = t0Var.f159667c;
        swipeRefreshLayout.setEnabled(!kVar.g());
        swipeRefreshLayout.setRefreshing(kVar.g());
        com.planner5d.library.util.navigation.uiview.c cVarL2 = feedFragment.L();
        boolean zG2 = kVar.g();
        Integer numH2 = kVar.h();
        cVarL2.b(zG2, numH2 != null ? new k3(numH2.intValue(), new Object[0]) : null, ArraysKt.contains(kVar.e(), com.planner5d.library.activity.fragment.list.b0.a.ProcessingDeeplink));
        if (kVar.f() != null) {
            feedFragment.O().G1();
            feedFragment.getMessageManager().n(kVar.f());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(FeedFragment feedFragment) {
        feedFragment.O().z1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(FeedFragment feedFragment, View view) {
        feedFragment.O().c1();
        feedFragment.f131538b.f(new com.planner5d.library.activity.helper.event.content.c(ChatFragment.class, null, com.planner5d.library.activity.helper.event.content.e.SlideLeft), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(wa.b bVar, Boolean bool) {
        TextView chatTooltip = bVar.f385957d;
        Intrinsics.checkNotNullExpressionValue(chatTooltip, "chatTooltip");
        chatTooltip.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(final FeedFragment feedFragment, com.planner5d.library.activity.fragment.feed.a aVar) {
        if (aVar == null) {
            return Unit.f312394a;
        }
        com.planner5d.library.activity.fragment.projects.z0 z0Var = feedFragment.uploadPlanViewProvider;
        if (z0Var != null) {
            feedFragment.getDialogLauncher().c(aVar.d() ? z0Var.d() : z0Var.a()).k(Long.valueOf(aVar.c())).m(new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.activity.fragment.feed.a0
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    FeedFragment.V(this.f133183a, (Boolean) obj);
                }
            }).g();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(FeedFragment feedFragment, Boolean bool) {
        feedFragment.O().z1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(FeedFragment feedFragment, Pair pair) {
        if (pair != null) {
            com.planner5d.library.activity.fragment.dialog.k.a aVarC = feedFragment.getDialogLauncher().c(VideoPlayerDialog.class);
            com.planner5d.library.services.utility.i iVarI = new com.planner5d.library.services.utility.i().i(com.planner5d.library.services.r.uri, (Parcelable) pair.getFirst());
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.title;
            String str = (String) pair.getSecond();
            if (str == null) {
                str = "";
            }
            aVarC.h(iVarI.j(rVar, str).a()).g();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(FeedFragment feedFragment) {
        feedFragment.getMessageManager().f();
        feedFragment.O().D1();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(FeedFragment feedFragment, q1 q1Var) {
        feedFragment.K().r(q1Var);
        com.planner5d.library.databinding.t0 t0Var = feedFragment.f133174g;
        if (t0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            t0Var = null;
        }
        t0Var.f159666b.O0();
        return Unit.f312394a;
    }

    private final void Z(RecyclerView recyclerView, Parcelable parcelable) {
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new b(recyclerView, parcelable));
            return;
        }
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.x1(parcelable);
        }
    }

    @Override // com.planner5d.library.activity.helper.l2
    public void beforeReplace() {
        ConstraintLayout constraintLayoutB;
        wa.b bVar = this.f133176i;
        if (bVar != null && (constraintLayoutB = bVar.getRoot()) != null) {
            constraintLayoutB.setVisibility(8);
        }
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.list.d0 getActionsObserve() {
        com.planner5d.library.activity.fragment.list.d0 d0Var = this.actionsObserve;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("actionsObserve");
        return null;
    }

    @NotNull
    public final com.planner5d.library.services.utility.t getCoroutineDispatchers() {
        com.planner5d.library.services.utility.t tVar = this.coroutineDispatchers;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineDispatchers");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k getDialogLauncher() {
        com.planner5d.library.activity.fragment.dialog.k kVar = this.dialogLauncher;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.feed.holders.a getFactory() {
        com.planner5d.library.activity.fragment.feed.holders.a aVar = this.factory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.config.j getFeatureConfigManager() {
        com.planner5d.library.model.manager.config.j jVar = this.featureConfigManager;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureConfigManager");
        return null;
    }

    @NotNull
    public final b2 getMessageManager() {
        b2 b2Var = this.messageManager;
        if (b2Var != null) {
            return b2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageManager");
        return null;
    }

    @NotNull
    public final c2 getNetworkStateUtility() {
        c2 c2Var = this.networkStateUtility;
        if (c2Var != null) {
            return c2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("networkStateUtility");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).w(true).K(new k3(com.planner5d.library.f.s.Kr, new Object[0])).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void onActivityCreatedExtended(@Nullable Bundle bundle) {
        Parcelable parcelable;
        super.onActivityCreatedExtended(bundle);
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(getArguments());
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.importProjectIntent;
        try {
            parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) jVar.g().getParcelable(rVar.f224891a, Intent.class) : jVar.g().getParcelable(rVar.f224891a);
            if (parcelable == null || !(parcelable instanceof Intent)) {
                parcelable = null;
            }
        } catch (ClassCastException unused) {
        }
        Parcelable parcelable2 = parcelable != null ? parcelable : null;
        e1 e1VarO = O();
        androidx.fragment.app.s sVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        e1VarO.n0(sVarRequireActivity, (Intent) parcelable2, O().g1(), null, O().b1(0));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        K().z();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        O().w1(outState);
    }

    public final void setActionsObserve(@NotNull com.planner5d.library.activity.fragment.list.d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
        this.actionsObserve = d0Var;
    }

    public final void setCoroutineDispatchers(@NotNull com.planner5d.library.services.utility.t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.coroutineDispatchers = tVar;
    }

    public final void setDialogLauncher(@NotNull com.planner5d.library.activity.fragment.dialog.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }

    public final void setFactory(@NotNull com.planner5d.library.activity.fragment.feed.holders.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.factory = aVar;
    }

    public final void setFeatureConfigManager(@NotNull com.planner5d.library.model.manager.config.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.featureConfigManager = jVar;
    }

    public final void setMessageManager(@NotNull b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "<set-?>");
        this.messageManager = b2Var;
    }

    public final void setNetworkStateUtility(@NotNull c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.networkStateUtility = c2Var;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void w(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.planner5d.library.model.manager.statistics.events.a1.f216679b.Y0();
        getActionsObserve().a(O().g1(), this);
        v1.a<Pair<Uri, String>> aVarP1 = O().p1();
        androidx.lifecycle.o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        aVarP1.k(viewLifecycleOwner, new c(new Function1() { // from class: com.planner5d.library.activity.fragment.feed.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeedFragment.W(this.f133368a, (Pair) obj);
            }
        }));
        if (!getNetworkStateUtility().d(getContext())) {
            getMessageManager().h();
        }
        M().f(new Function0() { // from class: com.planner5d.library.activity.fragment.feed.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeedFragment.X(this.f133447a);
            }
        });
        O().m1().k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.activity.fragment.feed.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeedFragment.Y(this.f133507a, (q1) obj);
            }
        }));
        Parcelable parcelableN = N(getArguments());
        if (parcelableN != null) {
            com.planner5d.library.databinding.t0 t0Var = this.f133174g;
            if (t0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                t0Var = null;
            }
            EnhancedRecyclerView list = t0Var.f159666b;
            Intrinsics.checkNotNullExpressionValue(list, "list");
            Z(list, parcelableN);
        }
        P();
        e1 e1VarO = O();
        Bundle arguments = getArguments();
        e1VarO.z1(arguments != null ? arguments.getBoolean(com.planner5d.library.services.r.forceSynchronize.f224891a, false) : false);
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController, androidx.fragment.app.Fragment
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Prefer the extended version of this method instead")
    public /* synthetic */ FrameLayout onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        y2 y2VarA;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.planner5d.library.databinding.t0 t0VarD = com.planner5d.library.databinding.t0.d(inflater, viewGroup, false);
        O().K1();
        O().v1(bundle, getArguments());
        androidx.fragment.app.s activity = getActivity();
        if (activity != null && (y2VarA = y2.a(activity.findViewById(com.planner5d.library.f.j.Ig))) != null) {
            if (!J()) {
                y2VarA = null;
            }
            if (y2VarA != null) {
                final wa.b bVarD = wa.b.d(inflater, y2VarA.f159947c, true);
                bVarD.f385956c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.d0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FeedFragment.S(this.f133196a, view);
                    }
                });
                O().k1().k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.activity.fragment.feed.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FeedFragment.T(bVarD, (Boolean) obj);
                    }
                }));
                this.f133176i = bVarD;
            }
        }
        v1.a<com.planner5d.library.activity.fragment.feed.a> aVarH1 = O().h1();
        androidx.lifecycle.o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        aVarH1.k(viewLifecycleOwner, new c(new Function1() { // from class: com.planner5d.library.activity.fragment.feed.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeedFragment.U(this.f133336a, (a) obj);
            }
        }));
        this.f133174g = t0VarD;
        t0VarD.f159666b.setItemAnimator(null);
        t0VarD.f159666b.setAdapter(K());
        t0VarD.f159666b.setAppearanceMode(EnhancedRecyclerView.e.LIST);
        EnhancedRecyclerView list = t0VarD.f159666b;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        Context context = t0VarD.f159666b.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        com.planner5d.library.widget.x.i(list, context, null, null, null);
        SwipeRefreshLayout swipeRefreshLayout = t0VarD.f159667c;
        swipeRefreshLayout.setClipToPadding(false);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: com.planner5d.library.activity.fragment.feed.g0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                FeedFragment.R(this.f133364a);
            }
        });
        FrameLayout root = t0VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
