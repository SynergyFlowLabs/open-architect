package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AFa1mSDK {

    @Nullable
    public final DeepLink getCurrencyIso4217Code;
    private final boolean getRevenue;

    public AFa1mSDK(boolean z10, @Nullable DeepLink deepLink) {
        this.getRevenue = z10;
        this.getCurrencyIso4217Code = deepLink;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFa1mSDK)) {
            return false;
        }
        AFa1mSDK aFa1mSDK = (AFa1mSDK) obj;
        return this.getRevenue == aFa1mSDK.getRevenue && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFa1mSDK.getCurrencyIso4217Code);
    }

    @oj.i(name = "getRevenue")
    public final boolean getRevenue() {
        return this.getRevenue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z10 = this.getRevenue;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        DeepLink deepLink = this.getCurrencyIso4217Code;
        return i10 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @NotNull
    public final String toString() {
        return "DdlResponse(secondPing=" + this.getRevenue + ", deepLink=" + this.getCurrencyIso4217Code + ")";
    }

    public /* synthetic */ AFa1mSDK(boolean z10, DeepLink deepLink, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? null : deepLink);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFa1mSDK() {
        this(false, null, 3, 0 == true ? 1 : 0);
        int i10 = 6 >> 0;
    }
}
