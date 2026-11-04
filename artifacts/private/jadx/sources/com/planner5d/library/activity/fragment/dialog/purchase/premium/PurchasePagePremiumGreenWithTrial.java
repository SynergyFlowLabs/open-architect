package com.planner5d.library.activity.fragment.dialog.purchase.premium;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.s;
import com.planner5d.library.activity.fragment.dialog.purchase.f0;
import com.planner5d.library.databinding.l2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchasePagePremiumGreenWithTrial.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePagePremiumGreenWithTrial.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premium/PurchasePagePremiumGreenWithTrial\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n257#2,2:42\n1#3:44\n*S KotlinDebug\n*F\n+ 1 PurchasePagePremiumGreenWithTrial.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premium/PurchasePagePremiumGreenWithTrial\n*L\n38#1:42,2\n*E\n"})
public abstract class PurchasePagePremiumGreenWithTrial extends PurchasePagePremiumReview {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected l2 f132645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final b.c f132646o = b.c.WithTrial;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(PurchasePagePremiumGreenWithTrial purchasePagePremiumGreenWithTrial, View view) {
        purchasePagePremiumGreenWithTrial.z().q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(PurchasePagePremiumGreenWithTrial purchasePagePremiumGreenWithTrial) {
        fd.g gVarJ = purchasePagePremiumGreenWithTrial.y().j();
        if (gVarJ != null) {
            f0 f0VarZ = purchasePagePremiumGreenWithTrial.z();
            s sVarRequireActivity = purchasePagePremiumGreenWithTrial.requireActivity();
            Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
            f0VarZ.n0(gVarJ, sVarRequireActivity);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(PurchasePagePremiumGreenWithTrial purchasePagePremiumGreenWithTrial, CompoundButton compoundButton, boolean z10) {
        purchasePagePremiumGreenWithTrial.Q();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview
    @NotNull
    protected b.c C() {
        return this.f132646o;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview
    protected boolean F() {
        return U().f159282s.f159608d.isChecked();
    }

    @NotNull
    protected final l2 U() {
        l2 l2Var = this.f132645n;
        if (l2Var != null) {
            return l2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    protected final void Y(@NotNull l2 l2Var) {
        Intrinsics.checkNotNullParameter(l2Var, "<set-?>");
        this.f132645n = l2Var;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview
    public void enableTrial(boolean z10) {
        ConstraintLayout trialLayout = U().f159282s.f159607c;
        Intrinsics.checkNotNullExpressionValue(trialLayout, "trialLayout");
        trialLayout.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        l2 l2VarD = l2.d(inflater, viewGroup, false);
        Y(l2VarD);
        NestedScrollView root = l2VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        U().f159270d.setSelected(true);
        U().f159276j.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PurchasePagePremiumGreenWithTrial.V(this.f132690a, view2);
            }
        });
        U().f159274h.setMainColor(null);
        ef.e eVar = ef.e.f274872a;
        NestedScrollView root = U().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NestedScrollView purchasePremiumScrollView = U().f159277k;
        Intrinsics.checkNotNullExpressionValue(purchasePremiumScrollView, "purchasePremiumScrollView");
        eVar.b(root, purchasePremiumScrollView);
        y().q(new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PurchasePagePremiumGreenWithTrial.W(this.f132691a);
            }
        });
        U().f159282s.f159608d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.g
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                PurchasePagePremiumGreenWithTrial.X(this.f132692a, compoundButton, z10);
            }
        });
    }
}
