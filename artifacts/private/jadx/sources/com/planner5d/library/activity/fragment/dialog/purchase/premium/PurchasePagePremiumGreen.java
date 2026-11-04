package com.planner5d.library.activity.fragment.dialog.purchase.premium;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.s;
import com.planner5d.library.activity.fragment.dialog.purchase.f0;
import com.planner5d.library.databinding.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchasePagePremiumGreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePagePremiumGreen.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premium/PurchasePagePremiumGreen\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class PurchasePagePremiumGreen extends PurchasePagePremiumReview {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h2 f132643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final b.c f132644o = b.c.WithTrial;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(PurchasePagePremiumGreen purchasePagePremiumGreen, View view) {
        purchasePagePremiumGreen.z().q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(PurchasePagePremiumGreen purchasePagePremiumGreen) {
        fd.g gVarJ = purchasePagePremiumGreen.y().j();
        if (gVarJ != null) {
            f0 f0VarZ = purchasePagePremiumGreen.z();
            s sVarRequireActivity = purchasePagePremiumGreen.requireActivity();
            Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
            f0VarZ.n0(gVarJ, sVarRequireActivity);
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview
    @NotNull
    protected b.c C() {
        return this.f132644o;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        h2 h2VarD = h2.d(inflater, viewGroup, false);
        this.f132643n = h2VarD;
        NestedScrollView root = h2VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        h2 h2Var = this.f132643n;
        h2 h2Var2 = null;
        if (h2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            h2Var = null;
        }
        h2Var.f159061d.setSelected(true);
        h2 h2Var3 = this.f132643n;
        if (h2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            h2Var3 = null;
        }
        h2Var3.f159067j.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PurchasePagePremiumGreen.T(this.f132688a, view2);
            }
        });
        h2 h2Var4 = this.f132643n;
        if (h2Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            h2Var4 = null;
        }
        h2Var4.f159065h.setMainColor(null);
        ef.e eVar = ef.e.f274872a;
        h2 h2Var5 = this.f132643n;
        if (h2Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            h2Var5 = null;
        }
        NestedScrollView root = h2Var5.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        h2 h2Var6 = this.f132643n;
        if (h2Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            h2Var2 = h2Var6;
        }
        NestedScrollView purchasePremiumScrollView = h2Var2.f159068k;
        Intrinsics.checkNotNullExpressionValue(purchasePremiumScrollView, "purchasePremiumScrollView");
        eVar.b(root, purchasePremiumScrollView);
        y().q(new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PurchasePagePremiumGreen.U(this.f132689a);
            }
        });
    }
}
