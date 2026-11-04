package com.planner5d.library.activity.fragment.dialog.purchase.premium;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.s;
import com.planner5d.library.activity.fragment.dialog.purchase.f0;
import com.planner5d.library.databinding.j2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchasePagePremiumRecommendations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePagePremiumRecommendations.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premium/PurchasePagePremiumRecommendations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class PurchasePagePremiumRecommendations extends PurchasePagePremiumReview {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j2 f132647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final b.c f132648o = b.c.Recommendations;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(PurchasePagePremiumRecommendations purchasePagePremiumRecommendations, View view) {
        purchasePagePremiumRecommendations.z().q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g3 V(PurchasePagePremiumRecommendations purchasePagePremiumRecommendations, View view, g3 insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        androidx.core.graphics.j jVarF = insets.f(g3.m.i());
        Intrinsics.checkNotNullExpressionValue(jVarF, "getInsets(...)");
        j2 j2Var = purchasePagePremiumRecommendations.f132647n;
        if (j2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j2Var = null;
        }
        ViewGroup.LayoutParams layoutParams = j2Var.f159184j.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = jVarF.f47826d;
        if (i10 != 0) {
            marginLayoutParams.bottomMargin = i10;
        }
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(PurchasePagePremiumRecommendations purchasePagePremiumRecommendations) {
        fd.g gVarJ = purchasePagePremiumRecommendations.y().j();
        if (gVarJ != null) {
            f0 f0VarZ = purchasePagePremiumRecommendations.z();
            s sVarRequireActivity = purchasePagePremiumRecommendations.requireActivity();
            Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
            f0VarZ.n0(gVarJ, sVarRequireActivity);
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview
    @NotNull
    protected b.c C() {
        return this.f132648o;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        j2 j2VarD = j2.d(inflater, viewGroup, false);
        this.f132647n = j2VarD;
        NestedScrollView root = j2VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        j2 j2Var = this.f132647n;
        j2 j2Var2 = null;
        if (j2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j2Var = null;
        }
        j2Var.f159183i.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PurchasePagePremiumRecommendations.U(this.f132693a, view2);
            }
        });
        j2 j2Var3 = this.f132647n;
        if (j2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j2Var3 = null;
        }
        j2Var3.f159181g.setMainColor(null);
        j2 j2Var4 = this.f132647n;
        if (j2Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            j2Var2 = j2Var4;
        }
        u1.j2(j2Var2.f159184j, new b1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.i
            @Override // androidx.core.view.b1
            public final g3 b(View view2, g3 g3Var) {
                return PurchasePagePremiumRecommendations.V(this.f132694a, view2, g3Var);
            }
        });
        y().q(new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PurchasePagePremiumRecommendations.W(this.f132695a);
            }
        });
    }
}
