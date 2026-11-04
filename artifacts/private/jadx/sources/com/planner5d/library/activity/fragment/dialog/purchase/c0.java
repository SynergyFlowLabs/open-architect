package com.planner5d.library.activity.fragment.dialog.purchase;

import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview;
import com.planner5d.library.activity.fragment.dialog.purchase.snapshots.PurchasePageSnapshots;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class c0 extends androidx.viewpager2.adapter.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f132519m = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@NotNull androidx.fragment.app.s activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 2;
    }

    @Override // androidx.viewpager2.adapter.a
    @NotNull
    public Fragment j(int i10) {
        if (i10 == 0) {
            return new PurchasePagePremiumReview();
        }
        if (i10 == 1) {
            return new PurchasePageSnapshots();
        }
        throw new IndexOutOfBoundsException("Unable to create page at position " + i10);
    }
}
