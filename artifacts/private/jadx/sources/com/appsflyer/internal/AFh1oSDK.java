package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AFh1oSDK {

    @Nullable
    public String AFAdRevenueData;

    @Nullable
    public String areAllFieldsValid;

    @NotNull
    public Map<String, Object> component1;

    @Nullable
    public Boolean component2;

    @Nullable
    public Boolean getCurrencyIso4217Code;

    @Nullable
    public Boolean getMediationNetwork;

    @Nullable
    public Boolean getMonetizationNetwork;

    @Nullable
    public Boolean getRevenue;

    private AFh1oSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str2, @Nullable Boolean bool5, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.AFAdRevenueData = str;
        this.getRevenue = bool;
        this.getMonetizationNetwork = bool2;
        this.getMediationNetwork = bool3;
        this.getCurrencyIso4217Code = bool4;
        this.areAllFieldsValid = str2;
        this.component2 = bool5;
        this.component1 = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFh1oSDK)) {
            return false;
        }
        AFh1oSDK aFh1oSDK = (AFh1oSDK) obj;
        if (Intrinsics.areEqual(this.AFAdRevenueData, aFh1oSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getRevenue, aFh1oSDK.getRevenue) && Intrinsics.areEqual(this.getMonetizationNetwork, aFh1oSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getMediationNetwork, aFh1oSDK.getMediationNetwork) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFh1oSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.areAllFieldsValid, aFh1oSDK.areAllFieldsValid) && Intrinsics.areEqual(this.component2, aFh1oSDK.component2) && Intrinsics.areEqual(this.component1, aFh1oSDK.component1)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.AFAdRevenueData;
        int iHashCode = 0;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.getRevenue;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.getMonetizationNetwork;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.getMediationNetwork;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.getCurrencyIso4217Code;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.areAllFieldsValid;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.component2;
        if (bool5 != null) {
            iHashCode = bool5.hashCode();
        }
        return ((iHashCode7 + iHashCode) * 31) + this.component1.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.AFAdRevenueData + ", isLimited=" + this.getRevenue + ", isEnabled=" + this.getMonetizationNetwork + ", isGaidWithGps=" + this.getMediationNetwork + ", isGaidWithSamsungCloudDev=" + this.getCurrencyIso4217Code + ", gaidError=" + this.areAllFieldsValid + ", retry=" + this.component2 + ", metadata=" + this.component1 + ")";
    }

    public /* synthetic */ AFh1oSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : bool2, (i10 & 8) != 0 ? null : bool3, (i10 & 16) != 0 ? null : bool4, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : bool5, (i10 & 128) != 0 ? new HashMap() : map);
    }

    public AFh1oSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
