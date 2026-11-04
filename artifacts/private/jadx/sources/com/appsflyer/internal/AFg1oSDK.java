package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import androidx.annotation.l1;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.devtodev.core.data.metrics.MetricConsts;
import com.facebook.internal.z0;
import io.sentry.protocol.DebugImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1oSDK implements AFg1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f89678d = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f89679w;

    @NotNull
    private final AFj1lSDK AFAdRevenueData;

    @NotNull
    private final kotlin.f0 AFLogger;

    @NotNull
    private final AFh1vSDK areAllFieldsValid;

    @NotNull
    private final AFi1tSDK component1;

    @NotNull
    private final AFg1vSDK component2;

    @NotNull
    private final AFc1pSDK component3;

    @NotNull
    private final AFc1qSDK component4;

    @NotNull
    private final AFc1kSDK copy;

    @NotNull
    private final kotlin.f0 copydefault;

    @NotNull
    private final AFf1gSDK equals;

    @NotNull
    private final String getCurrencyIso4217Code;

    @NotNull
    private final AFg1uSDK getMediationNetwork;

    @NotNull
    private final Context getMonetizationNetwork;

    @NotNull
    private final AFi1lSDK getRevenue;

    @NotNull
    private final AFg1xSDK hashCode;

    @NotNull
    private final AFc1iSDK toString;
    private static char[] registerClient = {8582, 8581, 8594, 8595, 8592, 8312, 8589, 8593, 8606, 8579, 8580, 8288, 8577, 8578, 8576};
    private static int AFKeystoreWrapper = -771284948;
    private static boolean AFInAppEventParameterName = true;
    private static boolean AFInAppEventType = true;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1oSDK$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.jvm.internal.l0 implements Function0<SimpleDateFormat> {
        public static final AnonymousClass1 AFAdRevenueData = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1oSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.jvm.internal.l0 implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass4 getMediationNetwork = new AnonymousClass4();

        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    public AFg1oSDK(@NotNull String str, @NotNull Context context, @NotNull AFi1lSDK aFi1lSDK, @NotNull AFg1uSDK aFg1uSDK, @NotNull AFj1lSDK aFj1lSDK, @NotNull AFg1vSDK aFg1vSDK, @NotNull AFh1vSDK aFh1vSDK, @NotNull AFc1qSDK aFc1qSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFi1tSDK aFi1tSDK, @NotNull AFf1gSDK aFf1gSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFg1xSDK aFg1xSDK, @NotNull AFc1kSDK aFc1kSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1uSDK, "");
        Intrinsics.checkNotNullParameter(aFj1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFi1tSDK, "");
        Intrinsics.checkNotNullParameter(aFf1gSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = context;
        this.getRevenue = aFi1lSDK;
        this.getMediationNetwork = aFg1uSDK;
        this.AFAdRevenueData = aFj1lSDK;
        this.component2 = aFg1vSDK;
        this.areAllFieldsValid = aFh1vSDK;
        this.component4 = aFc1qSDK;
        this.component3 = aFc1pSDK;
        this.component1 = aFi1tSDK;
        this.equals = aFf1gSDK;
        this.toString = aFc1iSDK;
        this.hashCode = aFg1xSDK;
        this.copy = aFc1kSDK;
        this.copydefault = kotlin.g0.c(AnonymousClass4.getMediationNetwork);
        this.AFLogger = kotlin.g0.c(AnonymousClass1.AFAdRevenueData);
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        boolean zAreEqual = false;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        AFh1rSDK aFh1rSDK = (AFh1rSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        if (aFg1oSDK.component3.component4()) {
            AFh1oSDK aFh1oSDK = aFg1oSDK.component3.getCurrencyIso4217Code.component3;
            if (aFh1oSDK == null) {
                return null;
            }
            String str = aFh1oSDK.areAllFieldsValid;
            if (str != null) {
                f89678d = (f89679w + 109) % 128;
                if (str.length() != 0) {
                    aFh1rSDK.getMediationNetwork("gaidError", aFh1oSDK.areAllFieldsValid);
                    f89679w = (f89678d + 31) % 128;
                }
            }
            String str2 = aFh1oSDK.AFAdRevenueData;
            if (str2 != null && aFh1oSDK.getMonetizationNetwork != null) {
                aFh1rSDK.getMediationNetwork("advertiserId", str2);
                aFh1rSDK.getMediationNetwork("advertiserIdEnabled", String.valueOf(aFh1oSDK.getMonetizationNetwork));
                aFh1rSDK.getMediationNetwork("isGaidWithGps", String.valueOf(aFh1oSDK.getMediationNetwork));
            }
        } else {
            Map<String, Object> revenue = AFa1tSDK.getRevenue(aFh1rSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            revenue.put("ad_ids_disabled", Boolean.TRUE);
        }
        AFh1oSDK aFh1oSDK2 = aFg1oSDK.component3.getCurrencyIso4217Code.component3;
        if (aFh1oSDK2 != null) {
            int i10 = f89678d + 23;
            f89679w = i10 % 128;
            if (i10 % 2 != 0) {
                Intrinsics.areEqual(aFh1oSDK2.component2, Boolean.TRUE);
                throw null;
            }
            zAreEqual = Intrinsics.areEqual(aFh1oSDK2.component2, Boolean.TRUE);
        }
        aFh1rSDK.getMediationNetwork("GAID_retry", String.valueOf(zAreEqual));
        if (CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH}).contains(aFh1rSDK.getCurrencyIso4217Code())) {
            f89678d = (f89679w + 97) % 128;
            AFd1hSDK aFd1hSDK = aFg1oSDK.copy.component4;
            if (aFd1hSDK != null) {
                Map<String, Object> revenue2 = AFa1tSDK.getRevenue(aFh1rSDK.AFAdRevenueData);
                Intrinsics.checkNotNullExpressionValue(revenue2, "");
                revenue2.put("fetchAdIdLatency", Long.valueOf(aFd1hSDK.getRevenue));
                return null;
            }
        }
        int i11 = f89679w + 35;
        f89678d = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    private void AFInAppEventParameterName(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String strComponent2 = this.component3.component2();
        String str = (String) getMediationNetwork(new Object[]{this.component4, strComponent2}, 381318279, -381318268, (int) System.currentTimeMillis());
        boolean z10 = false;
        boolean z11 = (str == null || Intrinsics.areEqual(str, strComponent2)) ? false : true;
        if (str == null) {
            f89678d = (f89679w + 67) % 128;
            if (strComponent2 != null) {
                z10 = true;
            }
        }
        if (z11) {
            map.put("af_latestchannel", strComponent2);
        } else {
            f89678d = (f89679w + 9) % 128;
            if (z10) {
                map.put("af_latestchannel", strComponent2);
            }
        }
        String strAreAllFieldsValid = areAllFieldsValid();
        if (strAreAllFieldsValid != null) {
            int i10 = f89679w + 101;
            f89678d = i10 % 128;
            if (i10 % 2 == 0) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = strAreAllFieldsValid.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                map.put("af_installstore", lowerCase);
                int i11 = 5 >> 0;
                throw null;
            }
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase2 = strAreAllFieldsValid.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_installstore", lowerCase2);
        }
        String strCopy = copy();
        if (strCopy != null) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            String lowerCase3 = strCopy.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_preinstall_name", lowerCase3);
        }
        String strComponent3 = component2();
        if (strComponent3 != null) {
            Locale locale4 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale4, "");
            String lowerCase4 = strComponent3.toLowerCase(locale4);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
            map.put("af_currentstore", lowerCase4);
        }
    }

    private static void AFInAppEventType(@NotNull Map<String, Object> map) {
        int i10 = f89678d + 109;
        f89679w = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFa1zSDK aFa1zSDK = AFa1zSDK.INSTANCE;
            AFa1zSDK.getCurrencyIso4217Code();
            AFa1zSDK.getRevenue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        AFa1zSDK aFa1zSDK2 = AFa1zSDK.INSTANCE;
        Object currencyIso4217Code = AFa1zSDK.getCurrencyIso4217Code();
        String revenue = AFa1zSDK.getRevenue();
        if (currencyIso4217Code == null || revenue == null || Integer.parseInt(revenue) <= 0) {
            return;
        }
        int i11 = f89679w + 27;
        f89678d = i11 % 128;
        if (i11 % 2 != 0) {
            map.put("reinstallCounter", revenue);
            map.put("originalAppsflyerId", currencyIso4217Code);
        } else {
            map.put("reinstallCounter", revenue);
            map.put("originalAppsflyerId", currencyIso4217Code);
            throw null;
        }
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        int i10 = f89679w + com.rabbitmq.client.impl.k.b.p.f265340a;
        f89678d = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
        if (string != null) {
            f89679w = (f89678d + 125) % 128;
            if (string.length() == 0) {
                return;
            }
            map.put(AppsFlyerProperties.EXTENSION, string);
        }
    }

    private void AFLogger(@NotNull Map<String, Object> map) throws PackageManager.NameNotFoundException {
        getMediationNetwork(new Object[]{this, map}, -140518465, 140518471, System.identityHashCode(this));
    }

    private static void a(String str, int[] iArr, String str2, int i10, Object[] objArr) throws UnsupportedEncodingException {
        int i11;
        Object charArray = str2;
        if (str2 != null) {
            $11 = ($10 + 17) % 128;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        char[] cArr2 = registerClient;
        if (cArr2 != null) {
            $11 = ($10 + 113) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i12 = 0; i12 < length; i12++) {
                cArr3[i12] = (char) (((long) cArr2[i12]) ^ (-5879130172463570806L));
            }
            cArr2 = cArr3;
        }
        int i13 = (int) ((-5879130172463570806L) ^ ((long) AFKeystoreWrapper));
        if (AFInAppEventType) {
            int length2 = bArr.length;
            aFk1nSDK.getMonetizationNetwork = length2;
            char[] cArr4 = new char[length2];
            aFk1nSDK.AFAdRevenueData = 0;
            while (true) {
                int i14 = aFk1nSDK.AFAdRevenueData;
                int i15 = aFk1nSDK.getMonetizationNetwork;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    cArr4[i14] = (char) (cArr2[bArr[(i15 - 1) - i14] + i10] - i13);
                    aFk1nSDK.AFAdRevenueData = i14 + 1;
                }
            }
        } else if (AFInAppEventParameterName) {
            $10 = ($11 + 81) % 128;
            int length3 = cArr.length;
            aFk1nSDK.getMonetizationNetwork = length3;
            char[] cArr5 = new char[length3];
            aFk1nSDK.AFAdRevenueData = 0;
            while (true) {
                int i16 = aFk1nSDK.AFAdRevenueData;
                int i17 = aFk1nSDK.getMonetizationNetwork;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i18 = $10 + 13;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr5[i16] = (char) (cArr2[cArr[i17 * i16] - i10] / i13);
                    i11 = i16 % 0;
                } else {
                    cArr5[i16] = (char) (cArr2[cArr[(i17 - 1) - i16] - i10] - i13);
                    i11 = i16 + 1;
                }
                aFk1nSDK.AFAdRevenueData = i11;
            }
        } else {
            int length4 = iArr.length;
            aFk1nSDK.getMonetizationNetwork = length4;
            char[] cArr6 = new char[length4];
            aFk1nSDK.AFAdRevenueData = 0;
            while (true) {
                int i19 = aFk1nSDK.AFAdRevenueData;
                int i20 = aFk1nSDK.getMonetizationNetwork;
                if (i19 >= i20) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i19] = (char) (cArr2[iArr[(i20 - 1) - i19] - i10] - i13);
                    aFk1nSDK.AFAdRevenueData = i19 + 1;
                }
            }
        }
    }

    private void afDebugLog(@NotNull Map<String, Object> map) {
        String currencyIso4217Code;
        int i10 = f89679w + com.rabbitmq.client.impl.k.b.p.f265340a;
        f89678d = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                return;
            }
        }
        try {
            int i11 = 7 | 0;
            this.getMonetizationNetwork.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
            currencyIso4217Code = this.component3.getCurrencyIso4217Code(this.getMonetizationNetwork);
        } catch (Throwable unused) {
            currencyIso4217Code = null;
        }
        if (currencyIso4217Code != null) {
            int i12 = f89678d + 113;
            f89679w = i12 % 128;
            if (i12 % 2 == 0) {
                map.put(MetricConsts.FacebookInfo, currencyIso4217Code);
            } else {
                map.put(MetricConsts.FacebookInfo, currencyIso4217Code);
                throw null;
            }
        }
    }

    private void afErrorLog(@NotNull Map<String, Object> map) {
        int i10 = f89678d + 89;
        f89679w = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.copy.AFAdRevenueData();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        if (!this.copy.AFAdRevenueData()) {
            AFb1gSDK aFb1gSDK = this.copy.toString;
            if (aFb1gSDK != null) {
                f89679w = (f89678d + 89) % 128;
                map.put("app_set_id", MapsKt.mapOf(TuplesKt.to("scope", Integer.valueOf(aFb1gSDK.AFAdRevenueData)), TuplesKt.to("id", aFb1gSDK.getMonetizationNetwork)));
                return;
            }
            return;
        }
        map.put("app_set_id", MapsKt.mapOf(TuplesKt.to("app_set_id_disabled", Boolean.TRUE)));
        if (this.copy.toString == null) {
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
            return;
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
        int i11 = f89678d + 109;
        f89679w = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private void afInfoLog(@NotNull Map<String, Object> map) {
        f89678d = (f89679w + 11) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component4.getMediationNetwork("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.component4.getMediationNetwork("is_stop_tracking_used", false)));
        }
        f89678d = (f89679w + 87) % 128;
    }

    @l1
    private void areAllFieldsValid(@NotNull Map<String, Object> map) {
        f89679w = (f89678d + 59) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        AFf1gSDK.getRevenue(map, this.component3);
        int i10 = f89678d + 85;
        f89679w = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private void component1(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFh1vSDK aFh1vSDK = this.areAllFieldsValid;
        HashMap map2 = new HashMap(aFh1vSDK.getRevenue);
        aFh1vSDK.getRevenue.clear();
        this.areAllFieldsValid.getCurrencyIso4217Code.getMonetizationNetwork("gcd");
        Intrinsics.checkNotNullExpressionValue(map2, "");
        if (map2.isEmpty()) {
            f89678d = (f89679w + 113) % 128;
            return;
        }
        f89679w = (f89678d + 71) % 128;
        Map<String, Object> revenue = AFa1tSDK.getRevenue(map);
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        revenue.put("gcd", map2);
    }

    @Nullable
    private String component2() {
        int i10 = f89678d + 119;
        f89679w = i10 % 128;
        if (i10 % 2 != 0) {
            ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            throw null;
        }
        String string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            string = AFAdRevenueData("AF_STORE");
        }
        int i11 = f89678d + 11;
        f89679w = i11 % 128;
        if (i11 % 2 == 0) {
            return string;
        }
        throw null;
    }

    @NotNull
    private static String component3() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / dPow)) + "/" + ((long) (blockCountLong / dPow));
        f89679w = (f89678d + 67) % 128;
        return str;
    }

    @Nullable
    private String component4() throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        f89679w = (f89678d + 65) % 128;
        String strN_ = AFj1iSDK.N_(this.getMonetizationNetwork.getApplicationContext().getPackageManager(), this.getMonetizationNetwork.getApplicationContext().getPackageName());
        int i10 = f89679w + 19;
        f89678d = i10 % 128;
        if (i10 % 2 != 0) {
            return strN_;
        }
        throw null;
    }

    @Nullable
    private String copy() {
        f89679w = (f89678d + 21) % 128;
        String string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString("preInstallName");
        if (string != null) {
            int i10 = f89679w + 77;
            f89678d = i10 % 128;
            if (i10 % 2 != 0) {
                return string;
            }
            throw null;
        }
        if (this.component4.getMediationNetwork("preInstallName")) {
            f89678d = (f89679w + 91) % 128;
            string = this.component4.AFAdRevenueData("preInstallName", (String) null);
        } else {
            if (copydefault() && (string = (String) getMediationNetwork(new Object[]{this}, -1713193940, 1713193943, System.identityHashCode(this))) == null) {
                int i11 = f89679w + 119;
                f89678d = i11 % 128;
                if (i11 % 2 == 0) {
                    AFAdRevenueData("AF_PRE_INSTALL_NAME");
                    throw null;
                }
                string = AFAdRevenueData("AF_PRE_INSTALL_NAME");
            }
            if (string != null) {
                this.component4.getMediationNetwork("preInstallName", string);
            }
        }
        if (string != null) {
            ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).set("preInstallName", string);
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r5.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) <= 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean copydefault() {
        /*
            r5 = this;
            int r0 = com.appsflyer.internal.AFg1oSDK.f89679w
            r4 = 0
            int r0 = r0 + 93
            r4 = 0
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1oSDK.f89678d = r1
            int r0 = r0 % 2
            r1 = 0
            r4 = 7
            java.lang.String r2 = "appsFlyerCount"
            r3 = 1
            r4 = r3
            com.appsflyer.internal.AFc1pSDK r5 = r5.component3
            if (r0 != 0) goto L21
            com.appsflyer.internal.AFc1qSDK r5 = r5.getMonetizationNetwork
            r4 = 6
            int r5 = r5.AFAdRevenueData(r2, r3)
            if (r5 > r3) goto L34
            r4 = 0
            goto L2b
        L21:
            com.appsflyer.internal.AFc1qSDK r5 = r5.getMonetizationNetwork
            r4 = 1
            int r5 = r5.AFAdRevenueData(r2, r1)
            r4 = 7
            if (r5 > r3) goto L34
        L2b:
            int r5 = com.appsflyer.internal.AFg1oSDK.f89679w
            int r5 = r5 + 91
            int r5 = r5 % 128
            com.appsflyer.internal.AFg1oSDK.f89678d = r5
            return r3
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.copydefault():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        if (r6 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        r6 = com.appsflyer.internal.AFg1oSDK.f89679w + me.relex.circleindicator.a.f332619e;
        com.appsflyer.internal.AFg1oSDK.f89678d = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if ((r6 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        r7.put("custom_install_id", java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        r7.put("custom_install_id", java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (r6 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r6 = this;
            int r0 = com.appsflyer.internal.AFg1oSDK.f89679w
            int r0 = r0 + 13
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1oSDK.f89678d = r0
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.appsflyer.internal.AFc1pSDK r1 = r6.component3
            com.appsflyer.internal.AFc1qSDK r1 = r1.getMonetizationNetwork
            java.lang.String r1 = com.appsflyer.internal.AFb1iSDK.getRevenue(r1)
            r5 = 4
            if (r1 == 0) goto L7c
            int r2 = com.appsflyer.internal.AFg1oSDK.f89678d
            int r2 = r2 + 13
            int r3 = r2 % 128
            r5 = 0
            com.appsflyer.internal.AFg1oSDK.f89679w = r3
            int r2 = r2 % 2
            java.lang.String r3 = "CUSTOM_INSTALL_ID_APPLIED"
            java.lang.String r4 = "uid"
            r5 = 4
            if (r2 == 0) goto L43
            r5 = 3
            r7.put(r4, r1)
            com.appsflyer.internal.AFc1pSDK r6 = r6.component3
            com.appsflyer.internal.AFc1qSDK r6 = r6.getMonetizationNetwork
            r5 = 4
            r1 = 1
            boolean r6 = r6.getMediationNetwork(r3, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r5 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            if (r6 == 0) goto L7c
            goto L5c
        L43:
            r7.put(r4, r1)
            r5 = 0
            com.appsflyer.internal.AFc1pSDK r6 = r6.component3
            com.appsflyer.internal.AFc1qSDK r6 = r6.getMonetizationNetwork
            r1 = 0
            boolean r6 = r6.getMediationNetwork(r3, r1)
            r5 = 2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r5 = 5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            if (r6 != 0) goto L5c
            goto L7c
        L5c:
            int r6 = com.appsflyer.internal.AFg1oSDK.f89679w
            r5 = 6
            int r6 = r6 + 117
            int r0 = r6 % 128
            com.appsflyer.internal.AFg1oSDK.f89678d = r0
            int r6 = r6 % 2
            java.lang.String r0 = "stano_usm_tiluldc"
            java.lang.String r0 = "custom_install_id"
            if (r6 == 0) goto L75
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5 = 4
            r7.put(r0, r6)
            r5 = 2
            return
        L75:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7.put(r0, r6)
            r6 = 0
            throw r6
        L7c:
            r5 = 1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.d(java.util.Map):void");
    }

    private void e(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        boolean monetizationNetwork = AFg1ySDK.getMonetizationNetwork(this.getMonetizationNetwork);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork);
        if (!monetizationNetwork) {
            f89678d = (f89679w + 55) % 128;
            map.put("tokenRefreshConfigured", Boolean.FALSE);
            f89679w = (f89678d + 125) % 128;
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1ySDK.getMonetizationNetwork(this.component4)));
    }

    private boolean equals() {
        f89678d = (f89679w + 89) % 128;
        boolean z10 = Boolean.parseBoolean(this.component4.AFAdRevenueData("sentSuccessfully", (String) null));
        int i10 = f89678d + 49;
        f89679w = i10 % 128;
        if (i10 % 2 == 0) {
            return z10;
        }
        throw null;
    }

    private void force(@NotNull Map<String, Object> map) {
        f89678d = (f89679w + 113) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String mediationNetwork = this.equals.getMediationNetwork();
        if (mediationNetwork != null) {
            int i10 = f89679w + 109;
            f89678d = i10 % 128;
            if (i10 % 2 == 0) {
                mediationNetwork.length();
                throw null;
            }
            if (mediationNetwork.length() == 0) {
                return;
            }
            int i11 = f89678d + 41;
            f89679w = i11 % 128;
            if (i11 % 2 == 0) {
                map.put("appsflyerKey", mediationNetwork);
            } else {
                map.put("appsflyerKey", mediationNetwork);
                throw null;
            }
        }
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i10, int i11, int i12) throws PackageManager.NameNotFoundException {
        int i13 = ~i12;
        int i14 = (i10 * 522) + (i11 * (-520)) + (((~(i13 | i11)) | i10) * (-1042)) + ((i11 | i12) * 521);
        int i15 = ~i10;
        switch (i14 + (((~(i10 | i13 | i11)) | (~(i12 | i15)) | (~((~i11) | i15))) * 521)) {
            case 1:
                File file = (File) objArr[0];
                int i16 = f89678d;
                f89679w = (i16 + 43) % 128;
                if (file != null) {
                    f89679w = (i16 + 95) % 128;
                    if (file.exists()) {
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            case 2:
                PackageManager packageManager = (PackageManager) objArr[0];
                String str = (String) objArr[1];
                f89678d = (f89679w + 91) % 128;
                if (Build.VERSION.SDK_INT < 33) {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                    Intrinsics.checkNotNullExpressionValue(packageInfo, "");
                    return packageInfo;
                }
                PackageInfo packageInfo2 = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
                f89679w = (f89678d + 21) % 128;
                return packageInfo2;
            case 3:
                AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
                File currencyIso4217Code = getCurrencyIso4217Code(getMediationNetwork("ro.appsflyer.preinstall.path"));
                if (getMediationNetwork(currencyIso4217Code)) {
                    currencyIso4217Code = getCurrencyIso4217Code(aFg1oSDK.AFAdRevenueData("AF_PRE_INSTALL_PATH"));
                }
                if (getMediationNetwork(currencyIso4217Code)) {
                    f89678d = (f89679w + 1) % 128;
                    currencyIso4217Code = getCurrencyIso4217Code("/data/local/tmp/pre_install.appsflyer");
                    f89678d = (f89679w + 79) % 128;
                }
                if (getMediationNetwork(currencyIso4217Code)) {
                    currencyIso4217Code = getCurrencyIso4217Code("/etc/pre_install.appsflyer");
                }
                if (getMediationNetwork(currencyIso4217Code)) {
                    return null;
                }
                String packageName = aFg1oSDK.getMonetizationNetwork.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                String str2 = (String) getMediationNetwork(new Object[]{currencyIso4217Code, packageName}, -2094417185, 2094417192, (int) System.currentTimeMillis());
                f89678d = (f89679w + 89) % 128;
                return str2;
            case 4:
                return AFAdRevenueData(objArr);
            case 5:
                return getCurrencyIso4217Code(objArr);
            case 6:
                return getMonetizationNetwork(objArr);
            case 7:
                return getRevenue(objArr);
            case 8:
                AFg1oSDK aFg1oSDK2 = (AFg1oSDK) objArr[0];
                Map map = (Map) objArr[1];
                f89679w = (f89678d + 115) % 128;
                Intrinsics.checkNotNullParameter(map, "");
                AFb1mSDK aFb1mSDKK_ = AFb1jSDK.k_(aFg1oSDK2.getMonetizationNetwork.getContentResolver());
                if (aFb1mSDKK_ != null) {
                    f89679w = (f89678d + 15) % 128;
                    map.put("amazon_aid", aFb1mSDKK_.getMonetizationNetwork);
                    map.put("amazon_aid_limit", String.valueOf(aFb1mSDKK_.getMediationNetwork));
                }
                return null;
            case 9:
                return component1(objArr);
            case 10:
                f89678d = (f89679w + 13) % 128;
                long jCurrentTimeMillis = System.currentTimeMillis();
                f89679w = (f89678d + 7) % 128;
                return Long.valueOf(jCurrentTimeMillis);
            case 11:
                return areAllFieldsValid(objArr);
            case 12:
                AFg1oSDK aFg1oSDK3 = (AFg1oSDK) objArr[0];
                f89679w = (f89678d + 59) % 128;
                AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) aFg1oSDK3.copydefault.getValue();
                f89678d = (f89679w + 23) % 128;
                return appsFlyerProperties;
            default:
                return getMediationNetwork(objArr);
        }
    }

    private final SimpleDateFormat getMonetizationNetwork() {
        f89678d = (f89679w + 93) % 128;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFLogger.getValue();
        int i10 = f89678d + 91;
        f89679w = i10 % 128;
        if (i10 % 2 == 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    private final void hashCode(Map<String, Object> map) {
        int i10 = f89678d + 49;
        f89679w = i10 % 128;
        if (i10 % 2 == 0) {
            if (AFg1kSDK.getMediationNetwork(this.getMonetizationNetwork)) {
            }
        } else {
            int i11 = 74 / 0;
            if (!AFg1kSDK.getMediationNetwork(this.getMonetizationNetwork)) {
                return;
            }
        }
        map.put("inst_app", Boolean.TRUE);
        f89679w = (f89678d + 85) % 128;
    }

    private void i(@NotNull Map<String, Object> map) throws PackageManager.NameNotFoundException {
        getMediationNetwork(new Object[]{this, map}, -1753918152, 1753918160, System.identityHashCode(this));
    }

    private void registerClient(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        long j10 = this.areAllFieldsValid.toString;
        if (j10 != 0) {
            int i10 = f89679w + 97;
            f89678d = i10 % 128;
            if (i10 % 2 == 0) {
                map.put("prev_session_dur", Long.valueOf(j10));
                throw null;
            }
            map.put("prev_session_dur", Long.valueOf(j10));
        }
        f89679w = (f89678d + 105) % 128;
    }

    private static PackageInfo s_(PackageManager packageManager, String str) {
        return (PackageInfo) getMediationNetwork(new Object[]{packageManager, str}, 1014234820, -1014234818, (int) System.currentTimeMillis());
    }

    private final void toString(Map<String, Object> map) {
        f89678d = (f89679w + 33) % 128;
        if (((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
            return;
        }
        f89678d = (f89679w + 69) % 128;
        map.put("batteryLevel", String.valueOf(this.getMediationNetwork.getRevenue(this.getMonetizationNetwork).getRevenue));
        f89679w = (f89678d + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
    }

    private void unregisterClient(@NotNull Map<String, Object> map) {
        int i10 = f89678d + 27;
        f89679w = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(AFc1pSDK.AFAdRevenueData(this.getMonetizationNetwork)));
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(AFc1pSDK.AFAdRevenueData(this.getMonetizationNetwork)));
            throw null;
        }
    }

    private static void w(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            f89678d = (f89679w + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e10);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
            f89679w = (f89678d + 119) % 128;
        } catch (Exception e11) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e11);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
            f89678d = (f89679w + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
        } catch (Exception e12) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e12);
        }
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getCurrencyIso4217Code(@NotNull AFh1rSDK aFh1rSDK) {
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put("open_referrer", aFh1rSDK.getMediationNetwork);
        String str = aFh1rSDK.component4;
        if (str != null) {
            int i10 = f89679w + 43;
            f89678d = i10 % 128;
            if (i10 % 2 == 0) {
                StringsKt.w3(str);
                throw null;
            }
            if (StringsKt.w3(str)) {
                return;
            }
            int i11 = f89679w + 119;
            f89678d = i11 % 128;
            if (i11 % 2 != 0) {
                map.put("af_web_referrer", aFh1rSDK.component4);
            } else {
                map.put("af_web_referrer", aFh1rSDK.component4);
                int i12 = 26 / 0;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getRevenue(@NotNull Map<String, Object> map, int i10, int i11) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i10));
        map.put("iaecounter", String.valueOf(i11));
        boolean z10 = false;
        if (!equals()) {
            int i12 = f89678d + 19;
            f89679w = i12 % 128;
            if (i12 % 2 == 0) {
                z10 = true;
            }
        }
        map.put("isFirstCall", String.valueOf(z10));
        f89679w = (f89678d + com.planner5d.library.engine.input.f.b.f160745y1) % 128;
    }

    private final void component4(Map<String, Object> map) {
        AFg1uSDK.AFa1uSDK revenue = this.getMediationNetwork.getRevenue(this.getMonetizationNetwork);
        float f10 = revenue.getRevenue;
        String str = revenue.getMediationNetwork;
        map.put("btl", String.valueOf(f10));
        if (str != null) {
            f89679w = (f89678d + 67) % 128;
            map.put("btch", str);
            f89679w = (f89678d + 109) % 128;
        }
    }

    private void equals(@NotNull Map<String, Object> map) {
        int i10 = f89679w + 101;
        f89678d = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        int i11 = f89679w + 99;
        f89678d = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getMonetizationNetwork(@NotNull AFh1rSDK aFh1rSDK) throws PackageManager.NameNotFoundException {
        f89679w = (f89678d + 53) % 128;
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        if (aFh1rSDK.getMediationNetwork()) {
            String str = aFh1rSDK.component3;
            AFc1kSDK aFc1kSDK = this.copy;
            getMonetizationNetwork(aFh1rSDK, str, aFc1kSDK.getMediationNetwork, aFc1kSDK.getMonetizationNetwork);
            f89679w = (f89678d + com.planner5d.library.engine.input.f.b.f160745y1) % 128;
        } else if (!(aFh1rSDK instanceof AFh1hSDK)) {
            int i10 = f89678d + 7;
            f89679w = i10 % 128;
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                String str2 = aFh1rSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                getMediationNetwork(map, str2);
                int i11 = 48 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(map, "");
                String str3 = aFh1rSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                getMediationNetwork(map, str3);
            }
        }
        if (CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH, AFe1mSDK.INAPP}).contains(aFh1rSDK.getCurrencyIso4217Code())) {
            f89678d = (f89679w + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
            Intrinsics.checkNotNullExpressionValue(map, "");
            equals(map);
        }
        if (aFh1rSDK.getRevenue()) {
            f89678d = (f89679w + 15) % 128;
            Intrinsics.checkNotNullExpressionValue(map, "");
            areAllFieldsValid(map);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        force(map);
        AFInAppEventType(map);
        getMediationNetwork(new Object[]{this, map}, -140518465, 140518471, System.identityHashCode(this));
        AFKeystoreWrapper(map);
        d(map);
        getMediationNetwork(map, aFh1rSDK.getMediationNetwork());
        e(map);
        afInfoLog(map);
        getRevenue(map, aFh1rSDK);
        map.put("af_events_api", "1");
    }

    private final void copydefault(Map<String, Object> map) {
        f89679w = (f89678d + 33) % 128;
        int i10 = f89679w + 97;
        f89678d = i10 % 128;
        if (i10 % 2 != 0) {
            UiModeManager uiModeManager = (UiModeManager) this.getMonetizationNetwork.getSystemService(UiModeManager.class);
            if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                map.put("tv", Boolean.TRUE);
            }
            return;
        }
        throw null;
    }

    @Nullable
    private String areAllFieldsValid() {
        String strComponent2 = null;
        if (!(!this.component4.getMediationNetwork("INSTALL_STORE"))) {
            return this.component4.AFAdRevenueData("INSTALL_STORE", (String) null);
        }
        if (copydefault()) {
            int i10 = f89678d + 123;
            f89679w = i10 % 128;
            if (i10 % 2 == 0) {
                strComponent2 = component2();
            } else {
                component2();
                throw null;
            }
        } else {
            f89678d = (f89679w + 67) % 128;
        }
        this.component4.getMediationNetwork("INSTALL_STORE", strComponent2);
        return strComponent2;
    }

    private static void component2(@NotNull Map<String, Object> map) throws UnsupportedEncodingException {
        f89678d = (f89679w + 37) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        int i10 = 0 << 1;
        Object[] objArr = new Object[1];
        a("\u008f\u0089\u0087\u0083\u008e", null, null, 127 - ExpandableListView.getPackedPositionType(0L), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i11 = f89679w + 95;
        f89678d = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x007e A[PHI: r0 r7
      0x007e: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v12 java.lang.String) binds: [B:8:0x007c, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v10 java.lang.String) binds: [B:8:0x007c, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    private void component3(@NotNull Map<String, Object> map) {
        String string;
        String string2;
        int i10 = f89679w + 63;
        f89678d = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
            string2 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
            int i11 = 69 / 0;
            if (string != null) {
                f89678d = (f89679w + 121) % 128;
                map.put("onelink_id", string);
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
            string2 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
            if (string != null) {
                f89678d = (f89679w + 121) % 128;
                map.put("onelink_id", string);
            }
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getRevenue(@NotNull AFh1rSDK aFh1rSDK) throws PackageManager.NameNotFoundException, UnsupportedEncodingException {
        f89679w = (f89678d + 35) % 128;
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getCurrencyIso4217Code(map, aFh1rSDK.getMediationNetwork());
        component2(map);
        w(map);
        getMediationNetwork(new Object[]{this, map}, -1412383531, 1412383531, System.identityHashCode(this));
        getCurrencyIso4217Code(map, this.copy.AFAdRevenueData);
        getMediationNetwork(new Object[]{this, map}, -1753918152, 1753918160, System.identityHashCode(this));
        map.put("cell", MapsKt.mapOf(TuplesKt.to("mcc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mcc)), TuplesKt.to("mnc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mnc))));
        map.put("sig", component4());
        map.put("last_boot_time", Long.valueOf(component1()));
        map.put("disk", component3());
        int i10 = f89679w + 25;
        f89678d = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0080  */
    private final boolean AFKeystoreWrapper() {
        if (((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            f89679w = (f89678d + 115) % 128;
        } else {
            int i10 = f89679w + 23;
            f89678d = i10 % 128;
            if (i10 % 2 != 0 ? !((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                if (AFa1tSDK.getCurrencyIso4217Code(this.getMonetizationNetwork)) {
                    return false;
                }
            } else {
                f89679w = (f89678d + 115) % 128;
            }
        }
        return true;
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFc1qSDK aFc1qSDK = (AFc1qSDK) objArr[0];
        String str = (String) objArr[1];
        f89679w = (f89678d + 1) % 128;
        String strAFAdRevenueData = aFc1qSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
        if (strAFAdRevenueData != null) {
            int i10 = f89678d + 27;
            f89679w = i10 % 128;
            if (i10 % 2 == 0) {
                return strAFAdRevenueData;
            }
            throw null;
        }
        aFc1qSDK.getMediationNetwork("CACHED_CHANNEL", str);
        f89678d = (f89679w + 19) % 128;
        return str;
    }

    private static long component1() {
        f89679w = (f89678d + 11) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        int i10 = f89679w + 67;
        f89678d = i10 % 128;
        if (i10 % 2 != 0) {
            return jCurrentTimeMillis;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            int i10 = f89679w + 53;
            f89678d = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 87 / 0;
                if (str.length() != 0) {
                    map.put("referrer", str);
                    f89678d = (f89679w + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
                }
            } else if (str.length() != 0) {
                map.put("referrer", str);
                f89678d = (f89679w + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
            }
        }
        String strAFAdRevenueData = aFg1oSDK.component4.AFAdRevenueData("extraReferrers", (String) null);
        if (strAFAdRevenueData != null) {
            map.put("extraReferrers", strAFAdRevenueData);
        }
        String referrer = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getReferrer(aFg1oSDK.component4);
        if (referrer != null && referrer.length() != 0 && map.get("referrer") == null) {
            f89678d = (f89679w + 33) % 128;
            map.put("referrer", referrer);
        }
        int i12 = f89678d + 15;
        f89679w = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x005d  */
    private void copy(@NotNull Map<String, Object> map) {
        long currencyIso4217Code;
        long jCurrentTimeMillis;
        long seconds;
        int i10 = f89678d + 97;
        f89679w = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            currencyIso4217Code = this.component4.getCurrencyIso4217Code("AppsFlyerTimePassedSincePrevLaunch", 1L);
            jCurrentTimeMillis = System.currentTimeMillis();
            this.component4.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
            if (currencyIso4217Code > 1) {
                seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - currencyIso4217Code);
                f89679w = (f89678d + 81) % 128;
            } else {
                seconds = -1;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            currencyIso4217Code = this.component4.getCurrencyIso4217Code("AppsFlyerTimePassedSincePrevLaunch", 0L);
            jCurrentTimeMillis = System.currentTimeMillis();
            this.component4.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
            if (currencyIso4217Code > 0) {
                seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - currencyIso4217Code);
                f89679w = (f89678d + 81) % 128;
            } else {
                seconds = -1;
            }
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    private final String AFInAppEventType() {
        return (String) getMediationNetwork(new Object[]{this}, -1713193940, 1713193943, System.identityHashCode(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e.a({"HardwareIds"})
    private final String AFInAppEventParameterName() {
        String str;
        int i10 = f89679w + 67;
        f89678d = i10 % 128;
        int i11 = i10 % 2;
        try {
            if (i11 == 0) {
                this.component4.AFAdRevenueData("androidIdCached", (String) null);
                Settings.Secure.getString(this.getMonetizationNetwork.getContentResolver(), "android_id");
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String strAFAdRevenueData = this.component4.AFAdRevenueData("androidIdCached", (String) null);
            String string = Settings.Secure.getString(this.getMonetizationNetwork.getContentResolver(), "android_id");
            str = strAFAdRevenueData;
            if (string != null) {
                return string;
            }
            if (str == 0) {
                return null;
            }
            f89678d = (f89679w + 73) % 128;
            AFLogger.afDebugLog("use cached AndroidId: " + str);
            int i12 = f89678d + 125;
            f89679w = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 82 / 0;
            }
            return str;
        } catch (Exception e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
            str = i11;
        }
    }

    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "");
        if (((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i10 = f89678d + 89;
            f89679w = i10 % 128;
            if (i10 % 2 == 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z0.P);
                return;
            } else {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z0.P);
                int i11 = 33 / 0;
                return;
            }
        }
        AFf1gSDK aFf1gSDK = this.equals;
        String str2 = (String) AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFf1gSDK, this.component4}, -1198101809, 1198101809, System.identityHashCode(aFf1gSDK));
        if (!(str2 == null || str2.length() == 0)) {
            map.put("imei", str2);
        }
        String monetizationNetwork = getMonetizationNetwork(str);
        if (monetizationNetwork != null) {
            this.component4.getMediationNetwork("androidIdCached", monetizationNetwork);
            map.put("android_id", monetizationNetwork);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
            f89678d = (f89679w + 39) % 128;
        }
        AFb1mSDK mediationNetwork = AFb1jSDK.getMediationNetwork(this.getMonetizationNetwork);
        if (mediationNetwork != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = mediationNetwork.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str3 = mediationNetwork.getMonetizationNetwork;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            linkedHashMap.put("val", str3);
            Boolean bool2 = mediationNetwork.getMediationNetwork;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:42:0x0096). Please report as a decompilation issue!!! */
    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        InputStreamReader inputStreamReader;
        File file = (File) objArr[0];
        String str = (String) objArr[1];
        try {
            try {
                if (file == null) {
                    f89678d = (f89679w + 43) % 128;
                    return null;
                }
                try {
                    Properties properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                    try {
                        properties.load(inputStreamReader);
                        AFLogger.afInfoLog("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            inputStreamReader.close();
                            return property;
                        } catch (Throwable th2) {
                            AFLogger.afErrorLog(th2.getMessage(), th2);
                            return property;
                        }
                    } catch (FileNotFoundException unused) {
                        AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                            f89678d = (f89679w + 31) % 128;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        return null;
                    }
                } catch (FileNotFoundException unused2) {
                    inputStreamReader = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = null;
                }
            } catch (Throwable th5) {
                if (inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                        f89679w = (f89678d + 91) % 128;
                    } catch (Throwable th6) {
                        AFLogger.afErrorLog(th6.getMessage(), th6);
                    }
                }
                throw th5;
            }
        } catch (Throwable th7) {
            AFLogger.afErrorLog(th7.getMessage(), th7);
        }
    }

    private final void getMonetizationNetwork(Map<String, Object> map) {
        PackageInfo packageInfo;
        int i10 = f89679w + 41;
        f89678d = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                packageInfo = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 1);
                if (packageInfo.versionCode > this.component4.AFAdRevenueData("versionCode", 1)) {
                    this.component4.getMediationNetwork("versionCode", packageInfo.versionCode);
                }
            } else {
                packageInfo = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 0);
                if (packageInfo.versionCode > this.component4.AFAdRevenueData("versionCode", 0)) {
                    this.component4.getMediationNetwork("versionCode", packageInfo.versionCode);
                }
            }
            map.put("app_version_code", String.valueOf(packageInfo.versionCode));
            Context context = this.component3.getRevenue.getMonetizationNetwork;
            map.put("app_version_name", AFj1iSDK.getMediationNetwork(context, context.getPackageName()));
            map.put("targetSDKver", Integer.valueOf(this.component3.getRevenue.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
            long j10 = packageInfo.firstInstallTime;
            long j11 = packageInfo.lastUpdateTime;
            map.put("date1", getMonetizationNetwork().format(new Date(j10)));
            map.put("date2", getMonetizationNetwork().format(new Date(j11)));
            Object[] objArr = new Object[1];
            a("\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 127 - TextUtils.getTrimmedLength(""), objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat monetizationNetwork = getMonetizationNetwork();
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            map.put(strIntern, getMediationNetwork(monetizationNetwork));
            f89679w = (f89678d + 47) % 128;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th2, true);
        }
    }

    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, boolean z10) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", getMediationNetwork("ro.product.cpu.abi"));
        map2.put("cpu_abi2", getMediationNetwork("ro.product.cpu.abi2"));
        map2.put(DebugImage.b.f306093i, getMediationNetwork("os.arch"));
        map2.put("build_display_id", getMediationNetwork("ro.build.display.id"));
        if (z10) {
            f89679w = (f89678d + 13) % 128;
            component4(map2);
            if (this.component3.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) <= 2) {
                map2.putAll(this.AFAdRevenueData.AFAdRevenueData());
            }
        }
        map2.put("dim", this.component2.AFAdRevenueData(this.getMonetizationNetwork));
        map.put("deviceData", map2);
        f89678d = (f89679w + 1) % 128;
    }

    private final String AFAdRevenueData(String str) {
        int i10 = f89678d + 5;
        f89679w = i10 % 128;
        int i11 = i10 % 2;
        String currencyIso4217Code = this.component3.getCurrencyIso4217Code(str);
        if (i11 != 0) {
            int i12 = 38 / 0;
        }
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void AFAdRevenueData(@NotNull Map<String, Object> map) throws PackageManager.NameNotFoundException {
        getMediationNetwork(new Object[]{this, map}, -1412383531, 1412383531, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final long AFAdRevenueData() {
        return ((Long) getMediationNetwork(new Object[]{this}, 1094427935, -1094427925, System.identityHashCode(this))).longValue();
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getMediationNetwork(@NotNull AFh1rSDK aFh1rSDK) {
        f89678d = (f89679w + 11) % 128;
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getMediationNetwork(map);
        Map<String, Object> map2 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        getMonetizationNetwork(map2);
        Map<String, Object> map3 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        AFInAppEventParameterName(map3);
        Map<String, Object> map4 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        unregisterClient(map4);
        Map<String, Object> map5 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map5, "");
        afDebugLog(map5);
        if (getMediationNetwork().contains(aFh1rSDK.getCurrencyIso4217Code())) {
            f89678d = (f89679w + 125) % 128;
            Map<String, Object> map6 = aFh1rSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map6, "");
            afErrorLog(map6);
            f89678d = (f89679w + 17) % 128;
        }
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void AFAdRevenueData(@NotNull AFh1rSDK aFh1rSDK) throws PackageManager.NameNotFoundException {
        getMediationNetwork(new Object[]{this, aFh1rSDK}, 840096269, -840096265, System.identityHashCode(this));
    }

    private static void getRevenue(@NotNull Map<String, Object> map, @NotNull AFh1rSDK aFh1rSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        String str = aFh1rSDK.areAllFieldsValid;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1rSDK.getMonetizationNetwork;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private void getRevenue(@NotNull Map<String, Object> map, @Nullable String str) throws PackageManager.NameNotFoundException {
        getMediationNetwork(new Object[]{this, map, str}, 1763970144, -1763970135, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getRevenue(@NotNull Map<String, Object> map) throws PackageManager.NameNotFoundException {
        getMediationNetwork(new Object[]{this, map}, -1435534785, 1435534790, System.identityHashCode(this));
    }

    private final AppsFlyerProperties getRevenue() {
        return (AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String[] strArr;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i10 = f89678d + 51;
        f89679w = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            String string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.APP_ID);
            if (string != null) {
                f89679w = (f89678d + 31) % 128;
                map.put(AppsFlyerProperties.APP_ID, string);
            }
            String string2 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.CURRENCY_CODE);
            if (string2 != null) {
                if (string2.length() != 3) {
                    StringBuilder sb2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                    sb2.append(string2);
                    sb2.append("' is not a legal value.");
                    String string3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    AFLogger.afWarnLog(string3);
                }
                map.put("currency", string2);
            }
            String string4 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.IS_UPDATE);
            if (string4 != null) {
                map.put("isUpdate", string4);
            }
            String string5 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
            if (string5 != null) {
                int i11 = f89679w + 5;
                f89678d = i11 % 128;
                if (i11 % 2 == 0) {
                    map.put("customData", string5);
                    throw null;
                }
                map.put("customData", string5);
            }
            String string6 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.APP_USER_ID);
            if (string6 != null) {
                int i12 = f89679w + 69;
                f89678d = i12 % 128;
                if (i12 % 2 != 0) {
                    map.put("appUserId", string6);
                } else {
                    map.put("appUserId", string6);
                    throw null;
                }
            }
            String string7 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.USER_EMAILS);
            if (string7 != null) {
                map.put("user_emails", string7);
            }
            AFb1uSDK aFb1uSDK = aFg1oSDK.copy.getRevenue;
            if (aFb1uSDK != null && (strArr = aFb1uSDK.getMediationNetwork) != null) {
                f89679w = (f89678d + com.planner5d.library.engine.input.f.b.f160745y1) % 128;
                map.put("sharing_filter", strArr);
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.APP_ID);
        throw null;
    }

    private static List<AFe1mSDK> getMediationNetwork() {
        f89679w = (f89678d + 109) % 128;
        List<AFe1mSDK> listListOf = CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH, AFe1mSDK.INAPP, AFe1mSDK.MANUAL_PURCHASE_VALIDATION, AFe1mSDK.ARS_VALIDATE, AFe1mSDK.PURCHASE_VALIDATE, AFe1mSDK.ADREVENUE});
        int i10 = f89679w + 75;
        f89678d = i10 % 128;
        if (i10 % 2 != 0) {
            return listListOf;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r6.length() == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getMonetizationNetwork(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            int r1 = java.lang.System.identityHashCode(r5)
            r2 = 2080605438(0x7c0384fe, float:2.7315532E36)
            r3 = -2080605426(0xffffffff83fc7b0e, float:-1.4839481E-36)
            java.lang.Object r0 = getMediationNetwork(r0, r2, r3, r1)
            com.appsflyer.AppsFlyerProperties r0 = (com.appsflyer.AppsFlyerProperties) r0
            r4 = 4
            java.lang.String r1 = "collectAndroidId"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r4 = 7
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L22
            goto L37
        L22:
            if (r6 == 0) goto L3d
            r4 = 4
            int r0 = com.appsflyer.internal.AFg1oSDK.f89679w
            r4 = 4
            int r0 = r0 + 119
            int r0 = r0 % 128
            r4 = 6
            com.appsflyer.internal.AFg1oSDK.f89678d = r0
            int r0 = r6.length()
            r4 = 7
            if (r0 != 0) goto L37
            goto L3d
        L37:
            if (r6 == 0) goto L3b
            r4 = 4
            return r6
        L3b:
            r4 = 4
            return r2
        L3d:
            boolean r6 = r5.AFKeystoreWrapper()
            r4 = 2
            if (r6 == 0) goto L5c
            int r6 = com.appsflyer.internal.AFg1oSDK.f89678d
            int r6 = r6 + 35
            r4 = 5
            int r6 = r6 % 128
            com.appsflyer.internal.AFg1oSDK.f89679w = r6
            java.lang.String r5 = r5.AFInAppEventParameterName()
            r4 = 6
            int r6 = com.appsflyer.internal.AFg1oSDK.f89678d
            int r6 = r6 + 81
            int r6 = r6 % 128
            r4 = 7
            com.appsflyer.internal.AFg1oSDK.f89679w = r6
            return r5
        L5c:
            r4 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.getMonetizationNetwork(java.lang.String):java.lang.String");
    }

    private final void getMediationNetwork(Map<String, Object> map) {
        try {
            long j10 = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j10)));
            int i10 = f89678d + com.rabbitmq.client.impl.k.b.p.f265340a;
            f89679w = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 79 / 0;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e10);
        }
    }

    private void getMonetizationNetwork(@NotNull AFh1rSDK aFh1rSDK, @Nullable String str, @Nullable String str2, @Nullable AFb1qSDK aFb1qSDK) throws PackageManager.NameNotFoundException {
        f89679w = (f89678d + 121) % 128;
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        if (aFh1rSDK.getCurrencyIso4217Code() == AFe1mSDK.CONVERSION) {
            int i10 = f89678d + com.planner5d.library.engine.input.f.b.f160745y1;
            f89679w = i10 % 128;
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                toString(map);
                copydefault(map);
                hashCode(map);
                AFa1zSDK.AFAdRevenueData(this.toString, this.component3);
                int i11 = 38 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(map, "");
                toString(map);
                copydefault(map);
                hashCode(map);
                AFa1zSDK.AFAdRevenueData(this.toString, this.component3);
            }
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        copy(map);
        component3(map);
        component1((Map<String, ? extends Object>) map);
        getMonetizationNetwork(map, str2);
        getMediationNetwork(new Object[]{this, map, str}, 1763970144, -1763970135, System.identityHashCode(this));
        registerClient(map);
        if (aFb1qSDK != null) {
            aFb1qSDK.getRevenue(map);
        }
    }

    private void getMediationNetwork(@NotNull Map<String, Object> map, boolean z10) {
        f89678d = (f89679w + 29) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.getCurrencyIso4217Code);
        if (z10) {
            f89679w = (f89678d + 83) % 128;
            map.put("platform_extension_v2", this.getRevenue.getMediationNetwork());
        }
        f89678d = (f89679w + 5) % 128;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, "");
        AFi1pSDK aFi1pSDK = aFg1oSDK.component1.getMediationNetwork;
        AFi1rSDK mediationNetwork = aFi1pSDK != null ? aFi1pSDK.getMediationNetwork() : null;
        if (mediationNetwork != null) {
            map.put(com.segment.analytics.kotlin.android.plugins.a.f266547p0, mediationNetwork.getCurrencyIso4217Code);
            map.put("ivc", Boolean.valueOf(mediationNetwork.getMediationNetwork()));
            if (!((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                int i10 = (f89679w + 109) % 128;
                f89678d = i10;
                String str = mediationNetwork.AFAdRevenueData;
                if (str != null) {
                    int i11 = i10 + 115;
                    f89679w = i11 % 128;
                    if (i11 % 2 != 0) {
                        map.put("operator", str);
                        int i12 = 74 / 0;
                    } else {
                        map.put("operator", str);
                    }
                }
                String str2 = mediationNetwork.getRevenue;
                if (str2 != null) {
                    int i13 = f89679w + 105;
                    f89678d = i13 % 128;
                    if (i13 % 2 != 0) {
                        map.put("carrier", str2);
                        return null;
                    }
                    map.put("carrier", str2);
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    @Nullable
    public final Long getCurrencyIso4217Code() {
        int i10 = f89679w + 43;
        int i11 = i10 % 128;
        f89678d = i11;
        if (i10 % 2 != 0) {
            Context context = this.toString.getMonetizationNetwork;
            if (context == null) {
                return null;
            }
            int i12 = i11 + 49;
            f89679w = i12 % 128;
            if (i12 % 2 == 0) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    String packageName = context.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "");
                    PackageInfo packageInfo = (PackageInfo) getMediationNetwork(new Object[]{packageManager, packageName}, 1014234820, -1014234818, (int) System.currentTimeMillis());
                    if (packageInfo != null) {
                        Long lValueOf = Long.valueOf(packageInfo.firstInstallTime);
                        f89678d = (f89679w + 47) % 128;
                        return lValueOf;
                    }
                }
                int i13 = f89678d + 51;
                f89679w = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 27 / 0;
                }
                return null;
            }
            context.getPackageManager();
            throw null;
        }
        Context context2 = this.toString.getMonetizationNetwork;
        throw null;
    }

    private static void getMonetizationNetwork(@NotNull Map<String, Object> map, @Nullable String str) {
        int i10 = f89678d + me.relex.circleindicator.a.f332619e;
        f89679w = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (str != null) {
                f89678d = (f89679w + 99) % 128;
                map.put("phone", str);
            }
            f89679w = (f89678d + 15) % 128;
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        Object objM785constructorimpl;
        int i10 = f89679w + 115;
        f89678d = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            String str = this.copy.getCurrencyIso4217Code;
            if (str != null) {
                f89678d = (f89679w + 39) % 128;
                if (map.get("af_deeplink") != null) {
                    int i11 = f89679w + 97;
                    f89678d = i11 % 128;
                    if (i11 % 2 == 0) {
                        AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                        throw null;
                    }
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                } else {
                    try {
                        Result.a aVar = Result.Companion;
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("isPush", z0.P);
                        map.put("af_deeplink", jSONObject.toString());
                        objM785constructorimpl = Result.m785constructorimpl(Unit.f312394a);
                    } catch (Throwable th2) {
                        Result.a aVar2 = Result.Companion;
                        objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
                    }
                    Throwable thD = Result.d(objM785constructorimpl);
                    if (thD != null) {
                        AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", thD, false, false, false, false, 120, null);
                    } else {
                        f89679w = (f89678d + 119) % 128;
                    }
                    Result.a(objM785constructorimpl);
                }
            }
            this.copy.getCurrencyIso4217Code = null;
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.copy.getCurrencyIso4217Code;
        throw null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i10 = f89678d + 65;
        f89679w = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(aFg1oSDK.hashCode.getCurrencyIso4217Code());
            int i11 = 13 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(aFg1oSDK.hashCode.getCurrencyIso4217Code());
        }
        f89678d = (f89679w + 87) % 128;
        return null;
    }

    private void getMediationNetwork(@NotNull Map<String, Object> map, @NotNull String str) {
        int i10 = f89678d + 7;
        f89679w = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.component4.AFAdRevenueData("prev_event_name", (String) null);
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            String strAFAdRevenueData = this.component4.AFAdRevenueData("prev_event_name", (String) null);
            if (strAFAdRevenueData != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.component4.getCurrencyIso4217Code("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", strAFAdRevenueData);
                map.put("prev_event", jSONObject);
                f89679w = (f89678d + 27) % 128;
            }
            this.component4.getMediationNetwork("prev_event_name", str);
            this.component4.getMonetizationNetwork("prev_event_timestamp", System.currentTimeMillis());
        } catch (Exception e10) {
            AFLogger.afErrorLog("Error while processing previous event.", e10);
        }
    }

    private static String getMonetizationNetwork(AFc1qSDK aFc1qSDK, String str) {
        return (String) getMediationNetwork(new Object[]{aFc1qSDK, str}, 381318279, -381318268, (int) System.currentTimeMillis());
    }

    @NotNull
    private String getMediationNetwork(@NotNull SimpleDateFormat simpleDateFormat) {
        int i10 = f89678d + 113;
        f89679w = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            String strAFAdRevenueData = this.component4.AFAdRevenueData("appsFlyerFirstInstall", (String) null);
            if (strAFAdRevenueData == null) {
                if (copydefault()) {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    strAFAdRevenueData = simpleDateFormat.format(new Date());
                } else {
                    f89679w = (f89678d + 11) % 128;
                    strAFAdRevenueData = "";
                }
                this.component4.getMediationNetwork("appsFlyerFirstInstall", strAFAdRevenueData);
            }
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "AppsFlyer: first launch date: " + strAFAdRevenueData, false, 4, null);
            Intrinsics.checkNotNullExpressionValue(strAFAdRevenueData, "");
            return strAFAdRevenueData;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        this.component4.AFAdRevenueData("appsFlyerFirstInstall", (String) null);
        throw null;
    }

    private static File getCurrencyIso4217Code(String str) {
        int i10 = (f89679w + 97) % 128;
        f89678d = i10;
        if (str != null) {
            int i11 = i10 + 105;
            f89679w = i11 % 128;
            try {
                if (i11 % 2 == 0) {
                    if (StringsKt.E5(str).toString().length() > 0) {
                        f89678d = (f89679w + com.planner5d.library.engine.input.f.b.f160745y1) % 128;
                        return new File(StringsKt.E5(str).toString());
                    }
                } else {
                    StringsKt.E5(str).toString().length();
                    throw null;
                }
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getMessage(), th2);
            }
        }
        return null;
    }

    @e.a({"PrivateApi"})
    @l1
    @Nullable
    private static String getMediationNetwork(@Nullable String str) {
        f89679w = (f89678d + 91) % 128;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.checkNotNull(objInvoke, "");
            String str2 = (String) objInvoke;
            f89679w = (f89678d + 43) % 128;
            return str2;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    private static String getMediationNetwork(File file, String str) {
        return (String) getMediationNetwork(new Object[]{file, str}, -2094417185, 2094417192, (int) System.currentTimeMillis());
    }

    private static boolean getMediationNetwork(File file) {
        return ((Boolean) getMediationNetwork(new Object[]{file}, 1334456290, -1334456289, (int) System.currentTimeMillis())).booleanValue();
    }
}
