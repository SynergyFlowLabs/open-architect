package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nExcManagerClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExcManagerClient.kt\ncom/appsflyer/internal/logger/ExcManagerClient\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n1#1,26:1\n36#2:27\n*S KotlinDebug\n*F\n+ 1 ExcManagerClient.kt\ncom/appsflyer/internal/logger/ExcManagerClient\n*L\n21#1:27\n*E\n"})
public final class AFh1zSDK extends AFg1gSDK {

    @NotNull
    private final AFc1dSDK AFAdRevenueData;

    public AFh1zSDK(@NotNull AFc1dSDK aFc1dSDK) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        this.AFAdRevenueData = aFc1dSDK;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (z12) {
            if (StringsKt.w3(str)) {
                str = "missing label";
            }
            this.AFAdRevenueData.afRDLog().getMediationNetwork(th2, withTag$SDK_prodRelease(str, aFg1cSDK));
        }
    }
}
