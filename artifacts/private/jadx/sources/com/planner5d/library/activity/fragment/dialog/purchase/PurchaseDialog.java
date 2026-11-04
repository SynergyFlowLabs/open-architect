package com.planner5d.library.activity.fragment.dialog.purchase;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.w0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.l2;
import androidx.navigation.c2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.m0;
import com.planner5d.library.services.textspan.UrlSpanWithListener;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.z0;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchaseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseDialog.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/PurchaseDialog\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 5 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,325:1\n19#2,10:326\n1#3:336\n1#3:339\n28#4:337\n228#5:338\n*S KotlinDebug\n*F\n+ 1 PurchaseDialog.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/PurchaseDialog\n*L\n69#1:326,10\n181#1:339\n285#1:337\n181#1:338\n*E\n"})
public class PurchaseDialog extends androidx.fragment.app.m implements com.planner5d.library.activity.fragment.messages.a {

    @NotNull
    public static final String TAG = "purchase_dialog";

    @NotNull
    private final com.planner5d.library.widget.preloader.t H1;

    @ij.a
    public ErrorMessageParser errorMessageParser;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.statistics.b<y3.c> f132469g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private final CompositeSubscription f132470h3;

    @ij.a
    public com.planner5d.library.services.p helpDialogFactory;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @Nullable
    private Integer f132471i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private fd.e f132472j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    protected com.planner5d.library.databinding.p f132473k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private te.h f132474l3;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f132475p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private fd.e f132476p2;

    @ij.a
    public fg.e<com.planner5d.library.model.manager.config.n> purchasePlacementManager;

    @ij.a
    public v statistics;

    @ij.a
    public com.planner5d.library.model.manager.statistics.b0 statisticsManager;

    @NotNull
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private static final String f132466m3 = com.planner5d.library.services.r.purchase_request_key.f224891a;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NotNull
    private static final String f132467n3 = com.planner5d.library.services.r.result_bundle_key.f224891a;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private static final fd.e f132468o3 = fd.e.PremiumRecommendations;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return PurchaseDialog.f132466m3;
        }

        @NotNull
        public final String b() {
            return PurchaseDialog.f132467n3;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132477a;

        static {
            int[] iArr = new int[fd.e.values().length];
            try {
                iArr[fd.e.PurchaseTextures.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fd.e.PurchaseSnapshots.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f132477a = iArr;
        }
    }

    public static final class c extends Dialog {
        c(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            PurchaseDialog.this.H();
        }
    }

    static final class d implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f132479a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f132479a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f132479a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f132479a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$savedStateViewModelProvider$1\n*L\n1#1,28:1\n20#2:29\n*E\n"})
    public static final class e implements Function0<l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f132480a;

        public e(Fragment fragment) {
            this.f132480a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return this.f132480a.getViewModelStore();
        }
    }

    public static final class f extends com.planner5d.library.services.rx.e<Void> {
        f() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            onCompleted();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            int i10 = 3 ^ 0;
            PurchaseDialog.this.Y(false);
            PurchaseDialog.this.dismiss();
        }
    }

    public static final class g extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e0 f132483e;

        g(e0 e0Var) {
            this.f132483e = e0Var;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            PurchaseDialog.this.O(this.f132483e);
        }
    }

    public PurchaseDialog() {
        t3 t3Var = t3.f229751a;
        this.f132475p1 = new i2(j1.d(f0.class), new e(this), new t3.b(this), null, 8, null);
        this.H1 = new com.planner5d.library.widget.preloader.t();
        this.f132476p2 = fd.e.Default;
        this.f132469g3 = new com.planner5d.library.model.manager.statistics.b<>(y3.c.profile);
        this.f132470h3 = new CompositeSubscription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        if (M().g0() == null) {
            dismiss();
        } else {
            M().i0().r(M().g0());
            M().s0(null);
        }
    }

    private final CharSequence I(String str) {
        return com.planner5d.library.services.textspan.b.f(com.planner5d.library.services.textspan.b.d(str), new UrlSpanWithListener.a() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.m
            @Override // com.planner5d.library.services.textspan.UrlSpanWithListener.a
            public final void a(String str2) {
                PurchaseDialog.J(this.f132640a, str2);
            }
        }, -1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(PurchaseDialog purchaseDialog, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (Intrinsics.areEqual("p5d://support", url)) {
            purchaseDialog.dismiss();
            purchaseDialog.getHelpDialogFactory$P5D_Library_release().c();
            com.planner5d.library.model.manager.statistics.events.j1.f216988b.i0();
        }
    }

    private final void K(d0 d0Var) {
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(d0Var.a() != fd.e.PremiumBenefits ? 7 : 6);
        }
    }

    private final fd.k N(fd.e eVar) {
        int i10 = b.f132477a[eVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? fd.k.CATALOG : fd.k.RENDERS;
        }
        return fd.k.TEXTURES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(e0 e0Var) {
        Y(false);
        if (!e0Var.h()) {
            m0.f224435h.t();
        }
        dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(PurchaseDialog purchaseDialog, View view) {
        purchaseDialog.H();
    }

    private final void Q(d0 d0Var) {
        te.h hVar = this.f132474l3;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarLayoutBinding");
            hVar = null;
        }
        hVar.f380926d.setTitle(getString(d0Var.c()));
        Fragment fragmentA = getChildFragmentManager().L0().a(ClassLoader.getSystemClassLoader(), d0Var.b().getName());
        Intrinsics.checkNotNullExpressionValue(fragmentA, "instantiate(...)");
        fragmentA.setArguments(getArguments());
        getChildFragmentManager().w().y(com.planner5d.library.f.j.Bp, fragmentA).m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(fd.e eVar, PurchaseDialog purchaseDialog, fd.k kVar) {
        d0 d0VarA = d0.f132525d.a(eVar);
        purchaseDialog.f132476p2 = d0VarA.a();
        v statistics$P5D_Library_release = purchaseDialog.getStatistics$P5D_Library_release();
        Intrinsics.checkNotNull(kVar);
        statistics$P5D_Library_release.d(kVar, d0VarA.a());
        purchaseDialog.Q(d0VarA);
        purchaseDialog.K(d0VarA);
        purchaseDialog.M().l0(d0VarA);
        return Unit.f312394a;
    }

    private final void V() {
        this.H1.b(L().f159472e).g(Integer.valueOf(androidx.core.content.d.g(requireContext(), com.planner5d.library.f.C1549f.Xn))).h(Integer.valueOf(androidx.core.content.d.g(requireContext(), com.planner5d.library.f.C1549f.f166418hh)));
        M().h0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PurchaseDialog.W(this.f132642a, (e0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(PurchaseDialog purchaseDialog, e0 e0Var) {
        purchaseDialog.setCancelable(e0Var == null || e0Var.i() || e0Var.g());
        if (e0Var != null) {
            purchaseDialog.L().f159471d.setVisibility(8);
            te.h hVar = purchaseDialog.f132474l3;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appBarLayoutBinding");
                hVar = null;
            }
            hVar.f380926d.setNavigationIcon((Drawable) null);
            if (e0Var.i()) {
                purchaseDialog.Y(false);
                purchaseDialog.Z(e0Var);
            } else {
                purchaseDialog.Y(true);
                purchaseDialog.H1.a().p(e0Var.e(purchaseDialog.getContext()), true);
            }
        } else {
            purchaseDialog.L().f159471d.setVisibility(0);
            TypedArray typedArrayObtainStyledAttributes = purchaseDialog.requireContext().obtainStyledAttributes(new int[]{R.attr.homeAsUpIndicator});
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            purchaseDialog.X(typedArrayObtainStyledAttributes.getDrawable(0));
            Unit unit = Unit.f312394a;
            typedArrayObtainStyledAttributes.recycle();
        }
        return Unit.f312394a;
    }

    private final void Z(e0 e0Var) {
        Throwable thB = e0Var.b();
        Y(true);
        if (!e0Var.h()) {
            v statistics$P5D_Library_release = getStatistics$P5D_Library_release();
            fd.k type = e0Var.f132583b;
            Intrinsics.checkNotNullExpressionValue(type, "type");
            statistics$P5D_Library_release.b(type, this.f132476p2, e0Var.f132585d, false, (y3.c) this.f132469g3.a());
        } else {
            if (ErrorMessageException.isWithCode(thB, com.planner5d.library.f.s.Mw)) {
                v statistics$P5D_Library_release2 = getStatistics$P5D_Library_release();
                fd.k type2 = e0Var.f132583b;
                Intrinsics.checkNotNullExpressionValue(type2, "type");
                statistics$P5D_Library_release2.b(type2, this.f132476p2, e0Var.f132585d, true, (y3.c) this.f132469g3.a());
                this.f132470h3.add(this.H1.a().r(com.planner5d.library.f.s.Mw, true).subscribe((Subscriber<? super Void>) new f()));
                return;
            }
            v statistics$P5D_Library_release3 = getStatistics$P5D_Library_release();
            fd.k type3 = e0Var.f132583b;
            Intrinsics.checkNotNullExpressionValue(type3, "type");
            fd.f fVar = e0Var.f132585d;
            Intrinsics.checkNotNull(thB);
            statistics$P5D_Library_release3.c(type3, fVar, thB);
            if (ErrorMessageException.isWithCode(thB, com.planner5d.library.f.s.sx)) {
                this.H1.a().n(com.planner5d.library.f.s.sx, com.planner5d.library.f.s.LB, new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PurchaseDialog.b0(this.f132638a, view);
                    }
                }, new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PurchaseDialog.a0(this.f132639a, view);
                    }
                });
                return;
            }
        }
        com.planner5d.library.widget.preloader.h0 h0VarA = this.H1.a();
        String error = e0Var.h() ? ErrorMessageException.getError(getContext(), thB) : e0Var.a(getContext());
        Intrinsics.checkNotNull(error);
        this.f132470h3.add(h0VarA.t(I(error), e0Var.h()).subscribe((Subscriber<? super Void>) new g(e0Var)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(PurchaseDialog purchaseDialog, View view) {
        purchaseDialog.M().h0().r(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(PurchaseDialog purchaseDialog, View view) {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(purchaseDialog);
        c2 c2VarK = com.planner5d.library.activity.fragment.profile.q.k();
        Intrinsics.checkNotNullExpressionValue(c2VarK, "toSignIn(...)");
        kVar.d(w0VarA, c2VarK, new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PurchaseDialog.c0((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
        purchaseDialog.Y(false);
        purchaseDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        com.planner5d.library.model.manager.statistics.events.n.f217157b.C1(k3.a.sign_in, k3.e.purchase);
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    @NotNull
    protected final com.planner5d.library.databinding.p L() {
        com.planner5d.library.databinding.p pVar = this.f132473k3;
        if (pVar != null) {
            return pVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @NotNull
    protected final f0 M() {
        return (f0) this.f132475p1.getValue();
    }

    protected final void R(@NotNull com.planner5d.library.databinding.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.f132473k3 = pVar;
    }

    protected void S() {
        Dialog dialog;
        Window window;
        if (getResources().getConfiguration().smallestScreenWidthDp >= 480 || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    protected void T() {
        com.planner5d.library.model.manager.config.purchaseplacement.a aVarA = getPurchasePlacementManager$P5D_Library_release().get().a(M().f0());
        fd.e eVarF = null;
        if (M().j0()) {
            if (aVarA != null) {
                eVarF = aVarA.e();
            }
        } else if (aVarA != null) {
            eVarF = aVarA.f();
        }
        this.f132472j3 = eVarF;
        M().r0((y3.c) this.f132469g3.a());
        final fd.e eVar = this.f132472j3;
        if (eVar == null) {
            eVar = f132468o3;
        }
        M().i0().r(N(eVar));
        M().i0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PurchaseDialog.U(eVar, this, (fd.k) obj);
            }
        }));
    }

    protected void X(@Nullable Drawable drawable) {
        te.h hVar = this.f132474l3;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarLayoutBinding");
            hVar = null;
        }
        hVar.f380926d.setNavigationIcon(drawable);
    }

    protected void Y(boolean z10) {
    }

    @Override // com.planner5d.library.activity.fragment.messages.a
    @NotNull
    public BottomSheetBehavior<View> getBottomSheetBehavior() {
        BottomSheetBehavior<View> bottomSheetBehaviorX0 = BottomSheetBehavior.x0(L().f159470c);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorX0, "from(...)");
        return bottomSheetBehaviorX0;
    }

    @NotNull
    public final ErrorMessageParser getErrorMessageParser$P5D_Library_release() {
        ErrorMessageParser errorMessageParser = this.errorMessageParser;
        if (errorMessageParser != null) {
            return errorMessageParser;
        }
        Intrinsics.throwUninitializedPropertyAccessException("errorMessageParser");
        return null;
    }

    @NotNull
    public final com.planner5d.library.services.p getHelpDialogFactory$P5D_Library_release() {
        com.planner5d.library.services.p pVar = this.helpDialogFactory;
        if (pVar != null) {
            return pVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helpDialogFactory");
        return null;
    }

    @NotNull
    public final fg.e<com.planner5d.library.model.manager.config.n> getPurchasePlacementManager$P5D_Library_release() {
        fg.e<com.planner5d.library.model.manager.config.n> eVar = this.purchasePlacementManager;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("purchasePlacementManager");
        return null;
    }

    @NotNull
    public final v getStatistics$P5D_Library_release() {
        v vVar = this.statistics;
        if (vVar != null) {
            return vVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statistics");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.statistics.b0 getStatisticsManager$P5D_Library_release() {
        com.planner5d.library.model.manager.statistics.b0 b0Var = this.statisticsManager;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statisticsManager");
        return null;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.application.b.f142455c.a().H1(this);
        super.onAttach(context);
        androidx.fragment.app.s activity = getActivity();
        this.f132471i3 = activity != null ? Integer.valueOf(activity.getRequestedOrientation()) : null;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, com.planner5d.library.f.t.W6);
    }

    @Override // androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        c cVar = new c(requireContext(), getTheme());
        Window window = cVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        cVar.setCanceledOnTouchOutside(false);
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        R(com.planner5d.library.databinding.p.d(inflater, viewGroup, false));
        this.f132474l3 = te.h.a(L().getRoot());
        M().p0(getArguments());
        CoordinatorLayout coordinatorLayoutB = L().getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f132470h3.unsubscribe();
        M().m0();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        Integer num = this.f132471i3;
        if (num != null) {
            int iIntValue = num.intValue();
            androidx.fragment.app.s activity = getActivity();
            if (activity != null) {
                activity.setRequestedOrientation(iIntValue);
            }
        }
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        getStatistics$P5D_Library_release().a(M().h0().f());
        androidx.activity.result.b parentFragment = getParentFragment();
        DialogInterface.OnDismissListener onDismissListener = parentFragment instanceof DialogInterface.OnDismissListener ? (DialogInterface.OnDismissListener) parentFragment : null;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
        androidx.activity.result.b parentFragment2 = getParentFragment();
        z0 z0Var = parentFragment2 instanceof z0 ? (z0) parentFragment2 : null;
        if (z0Var != null) {
            z0Var.onChildDialogDismiss(this);
        }
        String str = f132466m3;
        String str2 = f132467n3;
        e0 e0VarF = M().h0().f();
        androidx.fragment.app.z.d(this, str, androidx.core.os.e.b(TuplesKt.to(str2, e0VarF != null ? e0VarF.j(requireContext()) : null)));
        M().h0().r(null);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f132469g3.c(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f132469g3.b(bundle, getArguments());
        S();
        te.h hVar = this.f132474l3;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarLayoutBinding");
            hVar = null;
        }
        hVar.f380926d.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PurchaseDialog.P(this.f132641a, view2);
            }
        });
        T();
        V();
        com.planner5d.library.model.manager.statistics.b0 statisticsManager$P5D_Library_release = getStatisticsManager$P5D_Library_release();
        Class<?> cls = getClass();
        fd.e eVar = this.f132472j3;
        statisticsManager$P5D_Library_release.t(cls, eVar != null ? eVar.n() : null);
    }

    public final void setErrorMessageParser$P5D_Library_release(@NotNull ErrorMessageParser errorMessageParser) {
        Intrinsics.checkNotNullParameter(errorMessageParser, "<set-?>");
        this.errorMessageParser = errorMessageParser;
    }

    public final void setHelpDialogFactory$P5D_Library_release(@NotNull com.planner5d.library.services.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.helpDialogFactory = pVar;
    }

    public final void setPurchasePlacementManager$P5D_Library_release(@NotNull fg.e<com.planner5d.library.model.manager.config.n> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.purchasePlacementManager = eVar;
    }

    public final void setStatistics$P5D_Library_release(@NotNull v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<set-?>");
        this.statistics = vVar;
    }

    public final void setStatisticsManager$P5D_Library_release(@NotNull com.planner5d.library.model.manager.statistics.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.statisticsManager = b0Var;
    }
}
