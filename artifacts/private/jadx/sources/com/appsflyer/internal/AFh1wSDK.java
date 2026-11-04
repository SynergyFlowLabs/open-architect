package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AFh1wSDK extends AFg1gSDK {

    @NotNull
    private final AFc1dSDK getMonetizationNetwork;
    private final boolean getRevenue;

    public AFh1wSDK(@NotNull AFc1dSDK aFc1dSDK) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        this.getMonetizationNetwork = aFc1dSDK;
        this.getRevenue = true;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z10) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("D", getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (z13) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork(androidx.exifinterface.media.a.T4, getRevenue(str, aFg1cSDK));
        }
        if (z13) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork(th2);
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void force(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork.copy().getMonetizationNetwork("F", getRevenue(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final boolean getShouldExtendMsg() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z10) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("I", getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z10) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork(androidx.exifinterface.media.a.Y4, getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z10) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork(androidx.exifinterface.media.a.U4, getRevenue(str, aFg1cSDK));
        }
    }
}
