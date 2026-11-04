package com.planner5d.library.activity.fragment.dialog.purchase.premium.square;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.planner5d.library.databinding.m2;
import fd.f;
import fd.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchasePageProGreenSquareWithTrial.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePageProGreenSquareWithTrial.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premium/square/PurchasePageProGreenSquareWithTrial\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,71:1\n257#2,2:72\n257#2,2:74\n278#2,2:76\n*S KotlinDebug\n*F\n+ 1 PurchasePageProGreenSquareWithTrial.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premium/square/PurchasePageProGreenSquareWithTrial\n*L\n41#1:72,2\n42#1:74,2\n52#1:76,2\n*E\n"})
public final class PurchasePageProGreenSquareWithTrial extends PurchasePagePremiumGreenSquare {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c f132722s = com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.WithTrialSquare;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private m2 f132723t;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(PurchasePageProGreenSquareWithTrial purchasePageProGreenSquareWithTrial, CompoundButton compoundButton, boolean z10) {
        purchasePageProGreenSquareWithTrial.Z();
        purchasePageProGreenSquareWithTrial.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(PurchasePageProGreenSquareWithTrial purchasePageProGreenSquareWithTrial) {
        g gVarJ;
        if (purchasePageProGreenSquareWithTrial.F() && ((gVarJ = purchasePageProGreenSquareWithTrial.y().j()) == null || !gVarJ.a())) {
            m2 m2Var = purchasePageProGreenSquareWithTrial.f132723t;
            if (m2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m2Var = null;
            }
            m2Var.f159344w.f159661c.setChecked(false);
        }
        purchasePageProGreenSquareWithTrial.Z();
        return Unit.f312394a;
    }

    private final void Z() {
        f fVar;
        g gVarJ;
        int i10 = 0;
        boolean z10 = F() && (gVarJ = y().j()) != null && gVarJ.a();
        g gVarJ2 = y().j();
        m2 m2Var = null;
        if (gVarJ2 == null || (fVar = gVarJ2.f275144a) == null || !fVar.r()) {
            m2 m2Var2 = this.f132723t;
            if (m2Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m2Var2 = null;
            }
            m2Var2.f159344w.f159661c.setChecked(false);
        }
        y().r(F());
        m2 m2Var3 = this.f132723t;
        if (m2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m2Var3 = null;
        }
        TextView purchaseNoPayment = m2Var3.f159331f;
        Intrinsics.checkNotNullExpressionValue(purchaseNoPayment, "purchaseNoPayment");
        if (!z10) {
            i10 = 4;
            int i11 = 5 ^ 4;
        }
        purchaseNoPayment.setVisibility(i10);
        m2 m2Var4 = this.f132723t;
        if (m2Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m2Var4 = null;
        }
        m2Var4.f159344w.f159662d.setText(getString(z10 ? com.planner5d.library.f.s.Jx : com.planner5d.library.f.s.My));
        m2 m2Var5 = this.f132723t;
        if (m2Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            m2Var = m2Var5;
        }
        m2Var.f159332g.setText(getString(z10 ? com.planner5d.library.f.s.bx : com.planner5d.library.f.s.f169002b5));
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.square.PurchasePagePremiumGreenSquare, com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview
    @NotNull
    protected com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c C() {
        return this.f132722s;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview
    protected boolean E() {
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview
    protected boolean F() {
        m2 m2Var = this.f132723t;
        if (m2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m2Var = null;
        }
        return m2Var.f159344w.f159661c.isChecked();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview
    public void enableTrial(boolean z10) {
        m2 m2Var = this.f132723t;
        m2 m2Var2 = null;
        if (m2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m2Var = null;
        }
        ConstraintLayout trialLayout = m2Var.f159344w.f159660b;
        Intrinsics.checkNotNullExpressionValue(trialLayout, "trialLayout");
        trialLayout.setVisibility(z10 ? 0 : 8);
        m2 m2Var3 = this.f132723t;
        if (m2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            m2Var2 = m2Var3;
        }
        TextView purchaseNoPayment = m2Var2.f159331f;
        Intrinsics.checkNotNullExpressionValue(purchaseNoPayment, "purchaseNoPayment");
        purchaseNoPayment.setVisibility(z10 ? 0 : 8);
        Z();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.square.PurchasePagePremiumGreenSquare, com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m2 m2VarD = m2.d(inflater, viewGroup, false);
        this.f132723t = m2VarD;
        NestedScrollView root = m2VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.square.PurchasePagePremiumGreenSquare, com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        m2 m2Var = this.f132723t;
        m2 m2Var2 = null;
        int i10 = 4 | 0;
        if (m2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m2Var = null;
        }
        m2Var.f159344w.f159661c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.square.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                PurchasePageProGreenSquareWithTrial.X(this.f132726a, compoundButton, z10);
            }
        });
        m2 m2Var3 = this.f132723t;
        if (m2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            m2Var2 = m2Var3;
        }
        m2Var2.f159329d.setImageResource(com.planner5d.library.f.h.f167818u9);
        y().q(new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.square.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PurchasePageProGreenSquareWithTrial.Y(this.f132727a);
            }
        });
    }
}
