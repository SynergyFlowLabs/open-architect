package com.planner5d.library.activity.fragment.dialog.purchase.premium.square;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.s;
import com.planner5d.library.activity.fragment.dialog.purchase.f0;
import com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview;
import com.planner5d.library.databinding.i2;
import ef.e;
import fd.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchasePagePremiumGreenSquare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePagePremiumGreenSquare.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premium/square/PurchasePagePremiumGreenSquare\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public class PurchasePagePremiumGreenSquare extends PurchasePagePremiumReview {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private i2 f132720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c f132721o = com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.WithTrialSquare;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(PurchasePagePremiumGreenSquare purchasePagePremiumGreenSquare, View view) {
        purchasePagePremiumGreenSquare.z().q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(PurchasePagePremiumGreenSquare purchasePagePremiumGreenSquare, View view) {
        g gVarJ = purchasePagePremiumGreenSquare.y().j();
        if (gVarJ != null) {
            f0 f0VarZ = purchasePagePremiumGreenSquare.z();
            s sVarRequireActivity = purchasePagePremiumGreenSquare.requireActivity();
            Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
            f0VarZ.n0(gVarJ, sVarRequireActivity);
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview
    @NotNull
    protected com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c C() {
        return this.f132721o;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        i2 i2VarD = i2.d(inflater, viewGroup, false);
        this.f132720n = i2VarD;
        NestedScrollView root = i2VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        i2 i2VarA = this.f132720n;
        if (i2VarA == null) {
            i2VarA = i2.a(view);
            Intrinsics.checkNotNullExpressionValue(i2VarA, "bind(...)");
        }
        i2VarA.f159113d.setSelected(true);
        i2VarA.f159121l.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.square.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PurchasePagePremiumGreenSquare.T(this.f132724a, view2);
            }
        });
        i2VarA.f159119j.setMainColor(null);
        e eVar = e.f274872a;
        NestedScrollView root = i2VarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NestedScrollView purchasePremiumScrollView = i2VarA.f159122m;
        Intrinsics.checkNotNullExpressionValue(purchasePremiumScrollView, "purchasePremiumScrollView");
        eVar.b(root, purchasePremiumScrollView);
        i2VarA.f159115f.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.square.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PurchasePagePremiumGreenSquare.U(this.f132725a, view2);
            }
        });
    }
}
