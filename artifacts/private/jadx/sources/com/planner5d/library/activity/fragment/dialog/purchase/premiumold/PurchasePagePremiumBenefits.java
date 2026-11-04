package com.planner5d.library.activity.fragment.dialog.purchase.premiumold;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.i2;
import androidx.lifecycle.l2;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import com.google.android.material.tabs.TabLayout;
import com.planner5d.library.activity.fragment.dialog.DialogWebView;
import com.planner5d.library.activity.fragment.dialog.purchase.e;
import com.planner5d.library.activity.fragment.dialog.purchase.premium.p;
import com.planner5d.library.databinding.g2;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.network.f;
import com.planner5d.library.services.utility.n1;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.carousel.ViewPagerCarouselView;
import com.planner5d.library.widget.preloader.t;
import fd.g;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchasePagePremiumBenefits.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePagePremiumBenefits.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premiumold/PurchasePagePremiumBenefits\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,131:1\n22#2,7:132\n12#2,6:139\n28#2:145\n13409#3,2:146\n13409#3,2:156\n257#4,2:148\n257#4,2:150\n257#4,2:152\n257#4,2:154\n*S KotlinDebug\n*F\n+ 1 PurchasePagePremiumBenefits.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premiumold/PurchasePagePremiumBenefits\n*L\n34#1:132,7\n35#1:139,6\n35#1:145\n73#1:146,2\n120#1:156,2\n104#1:148,2\n105#1:150,2\n113#1:152,2\n114#1:154,2\n*E\n"})
public final class PurchasePagePremiumBenefits extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f132728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f132729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t f132730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f132731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g2 f132732e;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f132733c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f132734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private TabLayout.i f132735b;

        public a(int i10, @Nullable TabLayout.i iVar) {
            this.f132734a = i10;
            this.f132735b = iVar;
        }

        public final int a() {
            return this.f132734a;
        }

        @Nullable
        public final TabLayout.i b() {
            return this.f132735b;
        }

        public final void c(@Nullable TabLayout.i iVar) {
            this.f132735b = iVar;
        }

        public /* synthetic */ a(int i10, TabLayout.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? null : iVar);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132736a;

        static {
            int[] iArr = new int[com.planner5d.library.activity.fragment.dialog.purchase.a.values().length];
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.a.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.a.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.a.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f132736a = iArr;
        }
    }

    /* synthetic */ class c extends g0 implements Function0<Unit> {
        c(Object obj) {
            super(0, obj, p.class, "update", "update()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((p) this.receiver).W();
        }
    }

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 PurchasePagePremiumBenefits.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premiumold/PurchasePagePremiumBenefits\n*L\n1#1,28:1\n34#2:29\n*E\n"})
    public static final class d implements Function0<l2> {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            Fragment fragmentRequireParentFragment = PurchasePagePremiumBenefits.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment.getViewModelStore();
        }
    }

    public PurchasePagePremiumBenefits() {
        t3 t3Var = t3.f229751a;
        this.f132728a = new i2(j1.d(com.planner5d.library.activity.fragment.dialog.purchase.f0.class), new d(), new t3.b(this), null, 8, null);
        this.f132729b = new i2(j1.d(p.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f132730c = new t();
        this.f132731d = f.f224463a.f(this);
    }

    private final void A(String str) {
        this.f132730c.a().b();
        g2 g2Var = this.f132732e;
        g2 g2Var2 = null;
        if (g2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var = null;
        }
        LinearLayout purchasePremiumList = g2Var.f159006d;
        Intrinsics.checkNotNullExpressionValue(purchasePremiumList, "purchasePremiumList");
        purchasePremiumList.setVisibility(8);
        g2 g2Var3 = this.f132732e;
        if (g2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var3 = null;
        }
        TextView purchasePremiumErrorMessage = g2Var3.f159005c;
        Intrinsics.checkNotNullExpressionValue(purchasePremiumErrorMessage, "purchasePremiumErrorMessage");
        purchasePremiumErrorMessage.setVisibility(0);
        g2 g2Var4 = this.f132732e;
        if (g2Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            g2Var2 = g2Var4;
        }
        TextView textView = g2Var2.f159005c;
        if (str == null) {
            str = ErrorMessageException.getError(getContext(), new ErrorMessageException(com.planner5d.library.f.s.f169490va, new String[0]));
        }
        textView.setText(str);
        y().f(new c(z()));
    }

    private final void B(g[] gVarArr) {
        this.f132730c.a().b();
        g2 g2Var = this.f132732e;
        if (g2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var = null;
        }
        LinearLayout purchasePremiumList = g2Var.f159006d;
        Intrinsics.checkNotNullExpressionValue(purchasePremiumList, "purchasePremiumList");
        purchasePremiumList.setVisibility(0);
        g2 g2Var2 = this.f132732e;
        if (g2Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var2 = null;
        }
        TextView purchasePremiumErrorMessage = g2Var2.f159005c;
        Intrinsics.checkNotNullExpressionValue(purchasePremiumErrorMessage, "purchasePremiumErrorMessage");
        purchasePremiumErrorMessage.setVisibility(8);
        if (gVarArr.length == 0) {
            A(null);
            return;
        }
        g2 g2Var3 = this.f132732e;
        if (g2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var3 = null;
        }
        g2Var3.f159006d.removeAllViews();
        for (final g gVar : gVarArr) {
            g2 g2Var4 = this.f132732e;
            if (g2Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g2Var4 = null;
            }
            LinearLayout linearLayout = g2Var4.f159006d;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            com.planner5d.library.activity.fragment.dialog.purchase.g gVar2 = new com.planner5d.library.activity.fragment.dialog.purchase.g(contextRequireContext, null, 0, 6, null);
            gVar2.x(gVar, new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premiumold.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PurchasePagePremiumBenefits.C(this.f132738a, gVar);
                }
            });
            linearLayout.addView(gVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(PurchasePagePremiumBenefits purchasePagePremiumBenefits, g gVar) {
        com.planner5d.library.activity.fragment.dialog.purchase.f0 f0VarX = purchasePagePremiumBenefits.x();
        s sVarRequireActivity = purchasePagePremiumBenefits.requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        f0VarX.n0(gVar, sVarRequireActivity);
        return Unit.f312394a;
    }

    private final void D() {
        String[] strArr = {getString(com.planner5d.library.f.s.Cy, 6435), getResources().getQuantityString(com.planner5d.library.f.q.f168939f, 60, 60), getResources().getQuantityString(com.planner5d.library.f.q.f168938e, 60, 60), getString(com.planner5d.library.f.s.Dy)};
        for (int i10 = 0; i10 < 4; i10++) {
            String str = strArr[i10];
            g2 g2Var = this.f132732e;
            if (g2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g2Var = null;
            }
            LinearLayout linearLayout = g2Var.f159011i;
            View viewInflate = LayoutInflater.from(requireContext()).inflate(com.planner5d.library.f.m.H7, (ViewGroup) null, false);
            ((TextView) viewInflate.findViewById(com.planner5d.library.f.j.Bo)).setText(str);
            linearLayout.addView(viewInflate);
        }
    }

    private final void E() {
        int[] iArr = {com.planner5d.library.f.h.Kg, com.planner5d.library.f.h.Lg, com.planner5d.library.f.h.Mg, com.planner5d.library.f.h.Ng};
        int integer = getResources().getInteger(com.planner5d.library.f.k.D0);
        g2 g2Var = this.f132732e;
        g2 g2Var2 = null;
        if (g2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var = null;
        }
        ViewPagerCarouselView viewPagerCarouselView = g2Var.f159012j;
        s sVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        viewPagerCarouselView.C(sVarRequireActivity, iArr);
        g2 g2Var3 = this.f132732e;
        if (g2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            g2Var2 = g2Var3;
        }
        ViewPagerCarouselView viewPagerCarouselView2 = g2Var2.f159012j;
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        viewPagerCarouselView2.y(p0.a(viewLifecycleOwner), integer);
    }

    private final void F() {
        t tVar = this.f132730c;
        g2 g2Var = this.f132732e;
        g2 g2Var2 = null;
        if (g2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var = null;
        }
        tVar.b(g2Var.f159008f);
        this.f132730c.a().j(false).g(Integer.valueOf(androidx.core.content.d.g(requireContext(), R.color.transparent))).h(Integer.valueOf(androidx.core.content.d.g(requireContext(), com.planner5d.library.f.C1549f.f166418hh)));
        n1.a(this, z().V(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premiumold.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PurchasePagePremiumBenefits.G(this.f132740a, (e) obj);
            }
        });
        g2 g2Var3 = this.f132732e;
        if (g2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2Var3 = null;
        }
        g2Var3.f159010h.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premiumold.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchasePagePremiumBenefits.H(view);
            }
        });
        g2 g2Var4 = this.f132732e;
        if (g2Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            g2Var2 = g2Var4;
        }
        g2Var2.f159007e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premiumold.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchasePagePremiumBenefits.I(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(PurchasePagePremiumBenefits purchasePagePremiumBenefits, e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = b.f132736a[it.b().ordinal()];
        if (i10 == 1) {
            purchasePagePremiumBenefits.f132730c.a().a(com.planner5d.library.f.s.vn, true);
        } else if (i10 == 2) {
            purchasePagePremiumBenefits.A(it.c());
        } else {
            if (i10 != 3) {
                throw new k0();
            }
            purchasePagePremiumBenefits.B(it.a());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(View view) {
        DialogWebView.a.d(DialogWebView.Companion, com.planner5d.library.api.f.a().f142276n, null, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(View view) {
        DialogWebView.a.d(DialogWebView.Companion, com.planner5d.library.api.f.a().f142277o, null, null, 4, null);
    }

    private final com.planner5d.library.activity.fragment.dialog.purchase.f0 x() {
        return (com.planner5d.library.activity.fragment.dialog.purchase.f0) this.f132728a.getValue();
    }

    private final com.planner5d.library.services.network.b y() {
        return (com.planner5d.library.services.network.b) this.f132731d.getValue();
    }

    private final p z() {
        return (p) this.f132729b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        g2 g2VarA = g2.a(inflater.inflate(com.planner5d.library.f.m.f168901z2, viewGroup, false));
        this.f132732e = g2VarA;
        if (g2VarA == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g2VarA = null;
        }
        NestedScrollView root = g2VarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        E();
        D();
        F();
    }
}
