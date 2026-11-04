package com.appsflyer.internal;

import android.text.TextUtils;
import androidx.annotation.l1;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AFd1fSDK extends AFd1cSDK {

    @NotNull
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);

    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        static String getCurrencyIso4217Code(String str, String str2, String str3) {
            return String.format(AFd1oSDK.AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), ((com.appsflyer.internal.AFa1tSDK) com.appsflyer.internal.AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getHostName()) + str + str3 + "?device_id=" + str2;
        }

        @l1
        public static String getRevenue(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return AFj1cSDK.getRevenue(TextUtils.join("\u2063", new String[]{str5, str3, str + str2}), str4);
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* synthetic */ AFd1fSDK(String str, Map map, byte[] bArr, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i10 & 4) != 0 ? null : bArr, (i10 & 8) != 0 ? "GET" : str2, (i10 & 16) != 0 ? false : z10);
    }

    @oj.n
    @NotNull
    public static final AFd1fSDK getMonetizationNetwork(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String currencyIso4217Code = AFa1tSDK.getCurrencyIso4217Code(str, str2, str3);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        AFd1fSDK aFd1fSDK = new AFd1fSDK(currencyIso4217Code, MapsKt.mapOf(TuplesKt.to(com.google.common.net.d.f119523o, "close"), TuplesKt.to("af_request_epoch_ms", strValueOf), TuplesKt.to("af_sig", AFa1tSDK.getRevenue(str, str3, str2, str4, strValueOf))), null, null, false, 28, null);
        aFd1fSDK.component4 = 10000;
        return aFd1fSDK;
    }

    private AFd1fSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z10) {
        super(str, bArr, str2, map, z10);
    }
}
