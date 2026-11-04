package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1fSDK extends AFg1gSDK {

    @NotNull
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            try {
                iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            getRevenue = iArr;
        }
    }

    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static boolean AFAdRevenueData(AFLogger.LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    private final void getCurrencyIso4217Code(AFLogger.LogLevel logLevel, AFg1cSDK aFg1cSDK, String str, Throwable th2) {
        if (AFAdRevenueData(logLevel)) {
            getRevenue(str, aFg1cSDK);
            int i10 = AFa1tSDK.getRevenue[logLevel.ordinal()];
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getCurrencyIso4217Code(AFLogger.LogLevel.DEBUG, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (z11) {
            getCurrencyIso4217Code(AFLogger.LogLevel.ERROR, aFg1cSDK, str, th2);
        } else {
            if (z10) {
                getCurrencyIso4217Code(AFLogger.LogLevel.DEBUG, aFg1cSDK, str, null);
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void force(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        withTag$SDK_prodRelease(str, aFg1cSDK);
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    @oj.i(name = "getShouldExtendMsg")
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getCurrencyIso4217Code(AFLogger.LogLevel.INFO, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getCurrencyIso4217Code(AFLogger.LogLevel.VERBOSE, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getCurrencyIso4217Code(AFLogger.LogLevel.WARNING, aFg1cSDK, str, null);
    }
}
