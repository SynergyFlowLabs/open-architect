package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFc1cSDK {

    @NotNull
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);

    @NotNull
    public String AFAdRevenueData;
    int getMediationNetwork;

    @NotNull
    final String getMonetizationNetwork;

    @NotNull
    public String getRevenue;

    @SourceDebugExtension({"SMAP\nExceptionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionInfo.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionInfo$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,94:1\n13579#2,2:95\n*S KotlinDebug\n*F\n+ 1 ExceptionInfo.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionInfo$Companion\n*L\n65#1:95,2\n*E\n"})
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        private static boolean getMediationNetwork(Integer num, String... strArr) {
            boolean z10 = num == null;
            int length = strArr.length;
            for (int i10 = 0; i10 < 3; i10++) {
                String str = strArr[i10];
                z10 = z10 || str == null || str.length() == 0;
            }
            return z10;
        }

        @Nullable
        public static AFc1cSDK getRevenue(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int i10 = 6 | 0;
            List<String> listSplit$default = StringsKt.split$default(str, new String[]{"\n"}, false, 0, 6, null);
            if (listSplit$default.size() != 4) {
                return null;
            }
            String revenue = null;
            String revenue2 = null;
            String revenue3 = null;
            Integer numValueOf = null;
            for (String str2 : listSplit$default) {
                if (StringsKt.u2(str2, "label=", false, 2, null)) {
                    revenue = getRevenue(str2, "label=");
                } else if (StringsKt.u2(str2, "hashName=", false, 2, null)) {
                    revenue2 = getRevenue(str2, "hashName=");
                } else if (!StringsKt.u2(str2, "stackTrace=", false, 2, null)) {
                    if (!StringsKt.u2(str2, "c=", false, 2, null)) {
                        break;
                    }
                    String strSubstring = str2.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.E5(strSubstring).toString()));
                } else {
                    revenue3 = getRevenue(str2, "stackTrace=");
                }
            }
            if (getMediationNetwork(numValueOf, revenue, revenue2, revenue3)) {
                return null;
            }
            Intrinsics.checkNotNull(revenue);
            Intrinsics.checkNotNull(revenue2);
            Intrinsics.checkNotNull(revenue3);
            Intrinsics.checkNotNull(numValueOf);
            return new AFc1cSDK(revenue, revenue2, revenue3, numValueOf.intValue());
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String getRevenue(String str, String str2) {
            String strSubstring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String string = StringsKt.E5(strSubstring).toString();
            Intrinsics.checkNotNullParameter(string, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = string.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] bArrDecode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            return new String(bArrDecode, charset);
        }
    }

    public AFc1cSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.getRevenue = str;
        this.getMonetizationNetwork = str2;
        this.AFAdRevenueData = str3;
        this.getMediationNetwork = i10;
    }

    @NotNull
    public final String AFAdRevenueData() {
        String str = this.getRevenue;
        Intrinsics.checkNotNullParameter(str, "");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.getMonetizationNetwork;
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        String strEncodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.AFAdRevenueData;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        return "label=" + strEncodeToString + "\nhashName=" + strEncodeToString2 + "\nstackTrace=" + Base64.encodeToString(bytes3, 2) + "\nc=" + this.getMediationNetwork;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1cSDK)) {
            return false;
        }
        AFc1cSDK aFc1cSDK = (AFc1cSDK) obj;
        return Intrinsics.areEqual(this.getRevenue, aFc1cSDK.getRevenue) && Intrinsics.areEqual(this.getMonetizationNetwork, aFc1cSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.AFAdRevenueData, aFc1cSDK.AFAdRevenueData) && this.getMediationNetwork == aFc1cSDK.getMediationNetwork;
    }

    @NotNull
    public final JSONObject getRevenue() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.google.firebase.messaging.e.f.f123534d, this.getRevenue);
        jSONObject.put("hash_name", this.getMonetizationNetwork);
        jSONObject.put("st", this.AFAdRevenueData);
        jSONObject.put("c", String.valueOf(this.getMediationNetwork));
        return jSONObject;
    }

    public final int hashCode() {
        return (((((this.getRevenue.hashCode() * 31) + this.getMonetizationNetwork.hashCode()) * 31) + this.AFAdRevenueData.hashCode()) * 31) + Integer.hashCode(this.getMediationNetwork);
    }

    @NotNull
    public final String toString() {
        return "ExceptionInfo(label=" + this.getRevenue + ", hashName=" + this.getMonetizationNetwork + ", stackTrace=" + this.AFAdRevenueData + ", counter=" + this.getMediationNetwork + ")";
    }

    public /* synthetic */ AFc1cSDK(String str, String str2, String str3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? 1 : i10);
    }
}
