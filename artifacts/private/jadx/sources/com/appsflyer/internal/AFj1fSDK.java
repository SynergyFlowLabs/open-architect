package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEventUrlResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventUrlResolver.kt\ncom/appsflyer/internal/util/EventUrlResolver\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n1#1,333:1\n39#2:334\n*S KotlinDebug\n*F\n+ 1 EventUrlResolver.kt\ncom/appsflyer/internal/util/EventUrlResolver\n*L\n184#1:334\n*E\n"})
public final class AFj1fSDK {

    @NotNull
    public static final AFa1vSDK AFAdRevenueData = new AFa1vSDK(null);

    @oj.f
    @NotNull
    public static final String areAllFieldsValid;

    @oj.f
    @NotNull
    public static final String component1;

    @oj.f
    @NotNull
    public static final String component2;

    @oj.f
    @NotNull
    public static final String component3;

    @oj.f
    @NotNull
    public static final String component4;

    @oj.f
    @NotNull
    public static final String getCurrencyIso4217Code;

    @oj.f
    @NotNull
    public static final String getMediationNetwork;

    @oj.f
    @NotNull
    public static final String getRevenue;

    @NotNull
    private static final String toString;

    @NotNull
    public final AFk1xSDK getMonetizationNetwork;

    @NotNull
    private final AFc1pSDK hashCode;

    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String str = AFa1tSDK.getRevenue + "/androidevent?app_id=";
        toString = str;
        getRevenue = "https://%sattr.%s/api/v" + str;
        getCurrencyIso4217Code = "https://%sadrevenue.%s/api/v2/generic/v6.17.0/android?app_id=";
        getMediationNetwork = "https://%sconversions.%s/api/v" + str;
        component1 = "https://%slaunches.%s/api/v" + str;
        component2 = "https://%sinapps.%s/api/v" + str;
        areAllFieldsValid = "https://%sregister.%s/api/v" + str;
        component3 = "https://%svalidate.%s/api/v" + str;
        component4 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    @oj.j
    private AFj1fSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull AFk1xSDK aFk1xSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFk1xSDK, "");
        this.hashCode = aFc1pSDK;
        this.getMonetizationNetwork = aFk1xSDK;
    }

    @NotNull
    public static String getCurrencyIso4217Code() {
        return "https://privacy-sandbox.appsflyersdk.com/api/trigger";
    }

    @NotNull
    public final String AFAdRevenueData(@Nullable String str, @Nullable String str2) {
        String packageName = this.hashCode.getRevenue.getMonetizationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String strComponent2 = this.hashCode.component2();
        if (strComponent2 != null && !StringsKt.w3(strComponent2)) {
            strComponent2 = "-" + StringsKt.E5(strComponent2).toString();
        }
        if (strComponent2 == null) {
            strComponent2 = "";
        }
        String string = StringsKt.E5(strComponent2).toString();
        Uri.Builder builderAppendPath = Uri.parse(this.getMonetizationNetwork.AFAdRevenueData("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + string);
        Intrinsics.checkNotNullExpressionValue(builderAppendPath, "");
        if (str == null || str2 == null) {
            String str3 = str == null ? "devKey" : "timestamp";
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, str3 + " is null at attempt to generate ddl event url", new IllegalStateException(str3 + " is null"), true, false, false, true);
        } else {
            builderAppendPath.appendQueryParameter("af_sig", AFj1cSDK.getRevenue(str2 + str, str));
        }
        String string2 = builderAppendPath.appendQueryParameter("sdk_version", AFa1tSDK.getRevenue).build().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final String getRevenue(String str, boolean z10) {
        String str2;
        if (z10) {
            return str;
        }
        String strComponent2 = this.hashCode.component2();
        if (strComponent2 != null) {
            str2 = "&channel=" + strComponent2;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return str + str2;
    }

    public final String getCurrencyIso4217Code(String str) {
        return str + this.hashCode.getRevenue.getMonetizationNetwork.getPackageName();
    }

    public /* synthetic */ AFj1fSDK(AFc1pSDK aFc1pSDK, AFk1xSDK aFk1xSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1pSDK, (i10 & 2) != 0 ? new AFk1zSDK() : aFk1xSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public AFj1fSDK(@NotNull AFc1pSDK aFc1pSDK) {
        this(aFc1pSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
    }

    public static String AFAdRevenueData(String str, boolean z10) {
        return str + (!z10 ? "&buildnumber=6.17.0" : "");
    }
}
