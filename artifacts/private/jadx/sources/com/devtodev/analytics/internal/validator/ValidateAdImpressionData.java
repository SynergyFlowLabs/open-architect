package com.devtodev.analytics.internal.validator;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ValidateAdImpressionData {

    @NotNull
    private final String network;

    @Nullable
    private final String placement;
    private final double revenue;

    @Nullable
    private final String unit;

    public ValidateAdImpressionData(@NotNull String network, double d10, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.network = network;
        this.revenue = d10;
        this.placement = str;
        this.unit = str2;
    }

    public static /* synthetic */ ValidateAdImpressionData copy$default(ValidateAdImpressionData validateAdImpressionData, String str, double d10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = validateAdImpressionData.network;
        }
        if ((i10 & 2) != 0) {
            d10 = validateAdImpressionData.revenue;
        }
        if ((i10 & 4) != 0) {
            str2 = validateAdImpressionData.placement;
        }
        if ((i10 & 8) != 0) {
            str3 = validateAdImpressionData.unit;
        }
        return validateAdImpressionData.copy(str, d10, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.network;
    }

    public final double component2() {
        return this.revenue;
    }

    @Nullable
    public final String component3() {
        return this.placement;
    }

    @Nullable
    public final String component4() {
        return this.unit;
    }

    @NotNull
    public final ValidateAdImpressionData copy(@NotNull String network, double d10, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(network, "network");
        return new ValidateAdImpressionData(network, d10, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateAdImpressionData)) {
            return false;
        }
        ValidateAdImpressionData validateAdImpressionData = (ValidateAdImpressionData) obj;
        return Intrinsics.areEqual(this.network, validateAdImpressionData.network) && Double.compare(this.revenue, validateAdImpressionData.revenue) == 0 && Intrinsics.areEqual(this.placement, validateAdImpressionData.placement) && Intrinsics.areEqual(this.unit, validateAdImpressionData.unit);
    }

    @NotNull
    public final String getNetwork() {
        return this.network;
    }

    @Nullable
    public final String getPlacement() {
        return this.placement;
    }

    public final double getRevenue() {
        return this.revenue;
    }

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        int iHashCode = (Double.hashCode(this.revenue) + (this.network.hashCode() * 31)) * 31;
        String str = this.placement;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unit;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ValidateAdImpressionData(network=" + this.network + ", revenue=" + this.revenue + ", placement=" + this.placement + ", unit=" + this.unit + ")";
    }
}
