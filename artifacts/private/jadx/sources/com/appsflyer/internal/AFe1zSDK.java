package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.q1;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AFe1zSDK {

    @Nullable
    private static AFe1vSDK component3;

    @NotNull
    public final kotlin.f0 AFAdRevenueData;

    @NotNull
    private final kotlin.f0 areAllFieldsValid;

    @NotNull
    private final AFc1pSDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1qSDK getMonetizationNetwork;

    @NotNull
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);

    @NotNull
    public static String getMediationNetwork = "https://%scdn-%ssettings.%s/android/v1/%s/settings";

    @NotNull
    public static String getRevenue = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";

    @NotNull
    private static final List<String> component1 = CollectionsKt.listOf((Object[]) new String[]{"googleplay", "playstore", "googleplaystore"});

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1zSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.jvm.internal.l0 implements Function0<String> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFe1zSDK.this.getCurrencyIso4217Code.getRevenue.getMonetizationNetwork.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AFe1zSDK.getMonetizationNetwork(packageName, AFe1zSDK.getCurrencyIso4217Code(AFe1zSDK.this));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1zSDK$5, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nUrlProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UrlProvider.kt\ncom/appsflyer/internal/components/network/provider/UrlProvider$channel$2\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n1#1,158:1\n39#2:159\n*S KotlinDebug\n*F\n+ 1 UrlProvider.kt\ncom/appsflyer/internal/components/network/provider/UrlProvider$channel$2\n*L\n83#1:159\n*E\n"})
    static final class AnonymousClass5 extends kotlin.jvm.internal.l0 implements Function0<String> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String monetizationNetwork = AFa1tSDK.getMonetizationNetwork(AFe1zSDK.this.getMonetizationNetwork, AFe1zSDK.this.getCurrencyIso4217Code.component2());
            if (monetizationNetwork != null && !StringsKt.w3(monetizationNetwork)) {
                String string = StringsKt.E5(monetizationNetwork).toString();
                AFa1ySDK aFa1ySDK = AFe1zSDK.AFa1ySDK;
                List<String> revenue = AFa1ySDK.getRevenue();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = string.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (revenue.contains(lowerCase)) {
                    q1 q1Var = q1.f312784a;
                    String str = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    AFLogger.afWarnLog(str);
                    monetizationNetwork = "";
                } else {
                    monetizationNetwork = "-" + string;
                }
            }
            return StringsKt.E5(monetizationNetwork != null ? monetizationNetwork : "").toString();
        }
    }

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFe1wSDK.values().length];
            try {
                iArr[AFe1wSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1wSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1wSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getCurrencyIso4217Code = iArr;
        }
    }

    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        @oj.i(name = "getMediationNetwork")
        public static void getMediationNetwork(@Nullable AFe1vSDK aFe1vSDK) {
            AFe1zSDK.component3 = aFe1vSDK;
        }

        @oj.i(name = "getRevenue")
        @NotNull
        public static List<String> getRevenue() {
            return AFe1zSDK.component1;
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFe1zSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.getCurrencyIso4217Code = aFc1pSDK;
        this.getMonetizationNetwork = aFc1qSDK;
        this.areAllFieldsValid = kotlin.g0.c(new AnonymousClass5());
        this.AFAdRevenueData = kotlin.g0.c(new AnonymousClass4());
    }

    @oj.i(name = "AFAdRevenueData")
    public static boolean AFAdRevenueData() {
        return component3 == null;
    }

    public static final /* synthetic */ String getMonetizationNetwork(String str, String str2) throws NoSuchAlgorithmException {
        String str3 = str + str2;
        Intrinsics.checkNotNullParameter(str3, "");
        MessageDigest messageDigest = MessageDigest.getInstance(org.apache.commons.codec.digest.g.f335251e);
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strSubstring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + ".";
    }

    @oj.i(name = "getCurrencyIso4217Code")
    @NotNull
    public final String getCurrencyIso4217Code() {
        int i10 = AFa1uSDK.getCurrencyIso4217Code[(AFAdRevenueData() ? AFe1wSDK.DEFAULT : AFe1wSDK.API).ordinal()];
        if (i10 == 1) {
            return (String) this.AFAdRevenueData.getValue();
        }
        int i11 = 5 >> 2;
        if (i10 != 2) {
            if (i10 == 3) {
                return "";
            }
            throw new kotlin.k0();
        }
        AFe1vSDK aFe1vSDK = component3;
        String str = aFe1vSDK != null ? aFe1vSDK.AFAdRevenueData : null;
        return str == null ? "" : str;
    }

    @oj.i(name = "getMediationNetwork")
    @NotNull
    public final String getMediationNetwork() {
        int i10 = AFa1uSDK.getCurrencyIso4217Code[(AFAdRevenueData() ? AFe1wSDK.DEFAULT : AFe1wSDK.API).ordinal()];
        if (i10 == 1) {
            return "appsflyersdk.com";
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return "";
            }
            throw new kotlin.k0();
        }
        AFe1vSDK aFe1vSDK = component3;
        String str = aFe1vSDK != null ? aFe1vSDK.getMediationNetwork : null;
        return str == null ? "" : str;
    }

    public static final /* synthetic */ String getCurrencyIso4217Code(AFe1zSDK aFe1zSDK) {
        return (String) aFe1zSDK.areAllFieldsValid.getValue();
    }

    public static final void getMediationNetwork(@Nullable AFe1vSDK aFe1vSDK) {
        AFa1ySDK.getMediationNetwork(aFe1vSDK);
    }
}
