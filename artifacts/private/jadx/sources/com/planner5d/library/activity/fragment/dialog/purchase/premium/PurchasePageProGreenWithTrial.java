package com.planner5d.library.activity.fragment.dialog.purchase.premium;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class PurchasePageProGreenWithTrial extends PurchasePagePremiumGreenWithTrial {
    public static final int $stable = 0;

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview
    protected boolean E() {
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumGreenWithTrial, com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        U().f159269c.setImageResource(com.planner5d.library.f.h.f167818u9);
    }
}
