package com.superwall.sdk.models.entitlements;

import com.superwall.sdk.models.internal.RedemptionResult;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class CustomerInfo {

    @NotNull
    private final Set<Entitlement> entitlements;

    @NotNull
    private final List<RedemptionResult> redemptions;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerInfo(@NotNull Set<Entitlement> entitlements, @NotNull List<? extends RedemptionResult> redemptions) {
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        Intrinsics.checkNotNullParameter(redemptions, "redemptions");
        this.entitlements = entitlements;
        this.redemptions = redemptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerInfo copy$default(CustomerInfo customerInfo, Set set, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            set = customerInfo.entitlements;
        }
        if ((i10 & 2) != 0) {
            list = customerInfo.redemptions;
        }
        return customerInfo.copy(set, list);
    }

    @NotNull
    public final Set<Entitlement> component1() {
        return this.entitlements;
    }

    @NotNull
    public final List<RedemptionResult> component2() {
        return this.redemptions;
    }

    @NotNull
    public final CustomerInfo copy(@NotNull Set<Entitlement> entitlements, @NotNull List<? extends RedemptionResult> redemptions) {
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        Intrinsics.checkNotNullParameter(redemptions, "redemptions");
        return new CustomerInfo(entitlements, redemptions);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerInfo)) {
            return false;
        }
        CustomerInfo customerInfo = (CustomerInfo) obj;
        return Intrinsics.areEqual(this.entitlements, customerInfo.entitlements) && Intrinsics.areEqual(this.redemptions, customerInfo.redemptions);
    }

    @NotNull
    public final Set<Entitlement> getEntitlements() {
        return this.entitlements;
    }

    @NotNull
    public final List<RedemptionResult> getRedemptions() {
        return this.redemptions;
    }

    public int hashCode() {
        return (this.entitlements.hashCode() * 31) + this.redemptions.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomerInfo(entitlements=" + this.entitlements + ", redemptions=" + this.redemptions + ")";
    }
}
