package com.appsflyer.internal;

import java.security.SecureRandom;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AFb1iSDK {

    @NotNull
    public static final AFb1iSDK INSTANCE = new AFb1iSDK();

    @Nullable
    private static String getCurrencyIso4217Code;

    private AFb1iSDK() {
    }

    @oj.n
    public static final synchronized void getCurrencyIso4217Code(@NotNull String str, @NotNull AFc1qSDK aFc1qSDK) {
        try {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(aFc1qSDK, "");
            getCurrencyIso4217Code = str;
            aFc1qSDK.getCurrencyIso4217Code("CUSTOM_INSTALL_ID_APPLIED", true);
            aFc1qSDK.getMediationNetwork("AF_INSTALLATION", str);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @oj.n
    @NotNull
    public static final synchronized String getRevenue(@NotNull AFc1qSDK aFc1qSDK) {
        String str;
        try {
            Intrinsics.checkNotNullParameter(aFc1qSDK, "");
            if (getCurrencyIso4217Code == null) {
                String strAFAdRevenueData = aFc1qSDK.AFAdRevenueData("AF_INSTALLATION", (String) null);
                if (strAFAdRevenueData == null) {
                    strAFAdRevenueData = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
                    aFc1qSDK.getMediationNetwork("AF_INSTALLATION", strAFAdRevenueData);
                }
                getCurrencyIso4217Code = strAFAdRevenueData;
            }
            str = getCurrencyIso4217Code;
            Intrinsics.checkNotNull(str);
        } catch (Throwable th2) {
            throw th2;
        }
        return str;
    }
}
