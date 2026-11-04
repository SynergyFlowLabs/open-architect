package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class AFd1oSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    public static String AFAdRevenueData = null;
    private static int areAllFieldsValid = 0;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copy = 0;
    private static byte[] copydefault = null;

    @l1
    private static String getRevenue = null;
    private static int hashCode = 1;
    private static short[] toString;
    private final AFj1fSDK component2;
    private final AFe1zSDK component4;
    private final AFc1pSDK getCurrencyIso4217Code;
    private final AppsFlyerProperties getMediationNetwork;
    private final AFd1lSDK getMonetizationNetwork;

    static {
        getMonetizationNetwork();
        AFAdRevenueData = "https://%sgcdsdk.%s/install_data/v5.0/";
        getRevenue = "https://%sonelink.%s/shortlink-sdk/v2";
        int i10 = hashCode + 37;
        copy = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public AFd1oSDK(AFd1lSDK aFd1lSDK, AFc1pSDK aFc1pSDK, AppsFlyerProperties appsFlyerProperties, AFe1zSDK aFe1zSDK, AFj1fSDK aFj1fSDK) {
        this.getMonetizationNetwork = aFd1lSDK;
        this.getCurrencyIso4217Code = aFc1pSDK;
        this.getMediationNetwork = appsFlyerProperties;
        this.component4 = aFe1zSDK;
        this.component2 = aFj1fSDK;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a2 A[PHI: r7
      0x00a2: PHI (r7v6 int) = (r7v5 int), (r7v52 int) binds: [B:27:0x00a0, B:24:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4 A[PHI: r7
      0x00a4: PHI (r7v49 int) = (r7v5 int), (r7v52 int) binds: [B:27:0x00a0, B:24:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    private static void a(byte b10, short s10, int i10, int i11, int i12, Object[] objArr) {
        int i13;
        int i14;
        int i15;
        int length;
        byte[] bArr;
        int i16;
        AFk1lSDK aFk1lSDK = new AFk1lSDK();
        StringBuilder sb2 = new StringBuilder();
        int i17 = i10 + ((int) (((long) areAllFieldsValid) ^ (-612162971269904352L)));
        boolean z10 = i17 == -1;
        if (z10) {
            int i18 = ($11 + 17) % 128;
            $10 = i18;
            byte[] bArr2 = copydefault;
            if (bArr2 != null) {
                int i19 = i18 + 95;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    length = bArr2.length;
                    bArr = new byte[length];
                    i16 = 1;
                } else {
                    length = bArr2.length;
                    bArr = new byte[length];
                    i16 = 0;
                }
                while (i16 < length) {
                    bArr[i16] = (byte) (((long) bArr2[i16]) ^ (-612162971269904352L));
                    i16++;
                }
                bArr2 = bArr;
            }
            i17 = bArr2 != null ? (byte) (((byte) (((long) copydefault[((int) (((long) component1) ^ (-612162971269904352L))) + i11]) ^ (-612162971269904352L))) + ((int) (((long) areAllFieldsValid) ^ (-612162971269904352L)))) : (short) (((short) (((long) toString[((int) (((long) component1) ^ (-612162971269904352L))) + i11]) ^ (-612162971269904352L))) + ((int) (((long) areAllFieldsValid) ^ (-612162971269904352L))));
        }
        if (i17 > 0) {
            int i20 = $11 + 55;
            $10 = i20 % 128;
            if (i20 % 2 != 0) {
                i13 = ((i11 - i17) >> 5) << ((int) (((long) component1) & (-612162971269904352L)));
                if (z10) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
            } else {
                i13 = ((i11 + i17) - 2) + ((int) (((long) component1) ^ (-612162971269904352L)));
                if (z10) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
            }
            aFk1lSDK.getCurrencyIso4217Code = i13 + i14;
            char c10 = (char) (i12 + ((int) (((long) component3) ^ (-612162971269904352L))));
            aFk1lSDK.getMediationNetwork = c10;
            sb2.append(c10);
            aFk1lSDK.AFAdRevenueData = aFk1lSDK.getMediationNetwork;
            byte[] bArr3 = copydefault;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i21 = 0; i21 < length2; i21++) {
                    bArr4[i21] = (byte) (((long) bArr3[i21]) ^ (-612162971269904352L));
                }
                bArr3 = bArr4;
            }
            boolean z11 = bArr3 != null;
            aFk1lSDK.getRevenue = 1;
            while (aFk1lSDK.getRevenue < i17) {
                if (z11) {
                    int i22 = $11 + 125;
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        byte[] bArr5 = copydefault;
                        int i23 = aFk1lSDK.getCurrencyIso4217Code;
                        aFk1lSDK.getCurrencyIso4217Code = i23;
                        i15 = aFk1lSDK.AFAdRevenueData % (((byte) (((byte) (((long) bArr5[i23]) - (-612162971269904352L))) % s10)) ^ b10);
                    } else {
                        byte[] bArr6 = copydefault;
                        int i24 = aFk1lSDK.getCurrencyIso4217Code;
                        aFk1lSDK.getCurrencyIso4217Code = i24 - 1;
                        i15 = aFk1lSDK.AFAdRevenueData + (((byte) (((byte) (((long) bArr6[i24]) ^ (-612162971269904352L))) + s10)) ^ b10);
                    }
                    aFk1lSDK.getMediationNetwork = (char) i15;
                } else {
                    short[] sArr = toString;
                    int i25 = aFk1lSDK.getCurrencyIso4217Code;
                    aFk1lSDK.getCurrencyIso4217Code = i25 - 1;
                    aFk1lSDK.getMediationNetwork = (char) (aFk1lSDK.AFAdRevenueData + (((short) (((short) (((long) sArr[i25]) ^ (-612162971269904352L))) + s10)) ^ b10));
                }
                sb2.append(aFk1lSDK.getMediationNetwork);
                aFk1lSDK.AFAdRevenueData = aFk1lSDK.getMediationNetwork;
                aFk1lSDK.getRevenue++;
            }
        }
        objArr[0] = sb2.toString();
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i10, int i11, int i12) {
        String str;
        String str2;
        String str3;
        int i13 = ~i10;
        int i14 = (i10 * (-520)) + (i11 * 522) + ((~(i13 | i11 | i12)) * 521);
        int i15 = ~(i10 | (~i11));
        int i16 = i14 + (i15 * (-1042)) + ((i15 | (~(i11 | (~i12) | i13))) * 521);
        if (i16 == 1) {
            AFd1oSDK aFd1oSDK = (AFd1oSDK) objArr[0];
            AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
            AFd1nSDK revenue = aFd1oSDK.getRevenue(new AFd1cSDK(aFh1mSDK.component1, aFh1mSDK.AFAdRevenueData(), "POST", Collections.EMPTY_MAP, true), new AFd1eSDK());
            hashCode = (copy + 67) % 128;
            return revenue;
        }
        int i17 = 4 ^ 2;
        if (i16 != 2) {
            AFd1oSDK aFd1oSDK2 = (AFd1oSDK) objArr[0];
            HashMap map = new HashMap();
            map.put("build_number", "6.17.0");
            map.put("counter", Integer.valueOf(aFd1oSDK2.getCurrencyIso4217Code.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0)));
            map.put("model", Build.MODEL);
            Object[] objArr2 = new Object[1];
            a((byte) (83 - MotionEvent.axisFromString("")), (short) (Gravity.getAbsoluteGravity(0, 0) + 43), (-88) - ((Process.getThreadPriority(0) + 20) >> 6), MotionEvent.axisFromString("") + 2017627781, KeyEvent.keyCodeFromString("") + 1432018452, objArr2);
            map.put(((String) objArr2[0]).intern(), Build.BRAND);
            map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
            Context context = aFd1oSDK2.getCurrencyIso4217Code.getRevenue.getMonetizationNetwork;
            map.put("app_version_name", AFj1iSDK.getMediationNetwork(context, context.getPackageName()));
            map.put("app_id", aFd1oSDK2.getCurrencyIso4217Code.getRevenue.getMonetizationNetwork.getPackageName());
            map.put("platformextension", new AFa1vSDK().getMonetizationNetwork());
            hashCode = (copy + 93) % 128;
            return map;
        }
        AFd1oSDK aFd1oSDK3 = (AFd1oSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        String str4 = (String) objArr[3];
        ((Number) objArr[4]).intValue();
        AFe1zSDK aFe1zSDK = aFd1oSDK3.component4;
        Intrinsics.checkNotNullParameter(str4, "");
        if (zBooleanValue) {
            str = AFe1zSDK.getRevenue;
        } else {
            str = AFe1zSDK.getMediationNetwork;
            copy = (hashCode + 47) % 128;
        }
        if (zBooleanValue2) {
            hashCode = (copy + 115) % 128;
            str2 = "stg";
        } else {
            str2 = "";
        }
        q1 q1Var = q1.f312784a;
        if (AFe1zSDK.AFAdRevenueData()) {
            str3 = (String) aFe1zSDK.AFAdRevenueData.getValue();
        } else {
            copy = (hashCode + 33) % 128;
            str3 = "";
        }
        String str5 = String.format(str, Arrays.copyOf(new Object[]{str3, str2, aFe1zSDK.getMediationNetwork(), str4}, 4));
        Intrinsics.checkNotNullExpressionValue(str5, "");
        AFd1cSDK aFd1cSDK = new AFd1cSDK(str5, "GET");
        aFd1cSDK.component4 = 1500;
        return aFd1oSDK3.getRevenue(aFd1cSDK, new AFd1bSDK());
    }

    @l1
    private Map<String, Object> getMediationNetwork() {
        return (Map) getCurrencyIso4217Code(new Object[]{this}, -1717475171, 1717475171, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    @androidx.annotation.p0
    public final AFd1nSDK<String> AFAdRevenueData(Map<String, Object> map, String str, @androidx.annotation.p0 String str2) {
        try {
            boolean z10 = true;
            Object[] objArr = {map, str};
            Map map2 = AFa1kSDK.f89663i;
            Object method = map2.get(317123644);
            if (method == null) {
                method = ((Class) AFa1kSDK.getCurrencyIso4217Code((ViewConfiguration.getLongPressTimeout() >> 16) + 196, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("getMediationNetwork", Map.class, String.class);
                map2.put(317123644, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            int i10 = hashCode;
            copy = (i10 + 95) % 128;
            AFj1fSDK aFj1fSDK = this.component2;
            if (str2 != null) {
                int i11 = i10 + 119;
                copy = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 83 / 0;
                    if (str2.length() != 0) {
                        hashCode = (copy + 75) % 128;
                        if (!new Regex("4.?(\\d+)?.?(\\d+)").k(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").k(str2)) {
                            z10 = false;
                        }
                    }
                } else if (str2.length() != 0) {
                    hashCode = (copy + 75) % 128;
                    if (!new Regex("4.?(\\d+)?.?(\\d+)").k(str2)) {
                        z10 = false;
                    }
                }
            }
            AFd1nSDK<String> revenue = getRevenue(new AFd1cSDK(aFj1fSDK.getRevenue(aFj1fSDK.getCurrencyIso4217Code(!z10 ? aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=") : aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%sars.%s/api/v2/android/validate_subscription?app_id=")), false), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1eSDK());
            int i13 = hashCode + 33;
            copy = i13 % 128;
            if (i13 % 2 == 0) {
                return revenue;
            }
            throw null;
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }

    @androidx.annotation.p0
    public final AFd1nSDK<String> getMonetizationNetwork(Map<String, Object> map, String str) {
        hashCode = (copy + me.relex.circleindicator.a.f332619e) % 128;
        int i10 = 3 & 2;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1kSDK.f89663i;
            Object method = map2.get(317123644);
            if (method == null) {
                method = ((Class) AFa1kSDK.getCurrencyIso4217Code(Gravity.getAbsoluteGravity(0, 0) + 196, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 37 - TextUtils.getOffsetAfter("", 0))).getMethod("getMediationNetwork", Map.class, String.class);
                map2.put(317123644, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            hashCode = (copy + 69) % 128;
            AFj1fSDK aFj1fSDK = this.component2;
            return getRevenue(new AFd1cSDK(aFj1fSDK.getCurrencyIso4217Code(aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=")), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1eSDK());
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }

    public final AFd1nSDK<Map<String, Object>> getRevenue(String str, String str2) {
        AFd1nSDK<Map<String, Object>> revenue = getRevenue(AFd1fSDK.getMonetizationNetwork(this.getCurrencyIso4217Code.getRevenue.getMonetizationNetwork.getPackageName(), AFb1iSDK.getRevenue(this.getCurrencyIso4217Code.getMonetizationNetwork), str, str2), new AFd1iSDK());
        copy = (hashCode + 79) % 128;
        return revenue;
    }

    public final AFd1nSDK<String> getMediationNetwork(AFh1mSDK aFh1mSDK) {
        return (AFd1nSDK) getCurrencyIso4217Code(new Object[]{this, aFh1mSDK}, -44698683, 44698684, System.identityHashCode(this));
    }

    public final AFd1nSDK<Map<String, String>> getRevenue(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String string = uuid.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getHostName()));
        sb2.append("/");
        sb2.append(str);
        sb2.append("?id=");
        sb2.append(str2);
        String string2 = sb2.toString();
        Map map = (Map) getCurrencyIso4217Code(new Object[]{this}, -1717475171, 1717475171, System.identityHashCode(this));
        String strValueOf = String.valueOf(map.get("build_number"));
        HashMap map2 = new HashMap();
        map2.put("Af-UUID", uuid.toString());
        map2.put("Af-Meta-Sdk-Ver", strValueOf);
        map2.put("Af-Meta-Counter", String.valueOf(map.get("counter")));
        map2.put("Af-Meta-Model", String.valueOf(map.get("model")));
        map2.put("Af-Meta-Platform", String.valueOf(map.get("platformextension")));
        map2.put("Af-Meta-System-Version", String.valueOf(map.get("sdk")));
        Object[] objArr = new Object[1];
        a((byte) (88 - Color.green(0)), (short) (22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-88) - Gravity.getAbsoluteGravity(0, 0), Drawable.resolveOpacity(0, 0) + 2017627768, 1432018418 - ImageFormat.getBitsPerPixel(0), objArr);
        map2.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, string, "GET", string, str, str2, strValueOf));
        AFd1nSDK<Map<String, String>> revenue = getRevenue(new AFd1cSDK(string2, null, "GET", map2, false), new AFd1dSDK());
        hashCode = (copy + 5) % 128;
        return revenue;
    }

    public final AFd1nSDK<String> getMonetizationNetwork(@NonNull String str, @NonNull Map<String, String> map, @androidx.annotation.p0 String str2, @NonNull UUID uuid, @NonNull String str3) {
        String string = uuid.toString();
        HashMap map2 = new HashMap();
        map2.put("ttl", CreateTicketViewModelKt.EmailId);
        map2.put("uuid", string);
        map2.put("data", map);
        map2.put(io.sentry.protocol.j.b.f306355e, (Map) getCurrencyIso4217Code(new Object[]{this}, -1717475171, 1717475171, System.identityHashCode(this)));
        if (str2 != null) {
            int i10 = hashCode + 81;
            copy = i10 % 128;
            if (i10 % 2 != 0) {
                map2.put("brand_domain", str2);
                int i11 = 19 / 0;
            } else {
                map2.put("brand_domain", str2);
            }
            hashCode = (copy + 1) % 128;
        }
        String string2 = AFg1lSDK.getCurrencyIso4217Code(map2).toString();
        HashMap map3 = new HashMap();
        Object[] objArr = new Object[1];
        a((byte) (88 - TextUtils.indexOf("", "", 0)), (short) (((Process.getThreadPriority(0) + 20) >> 6) + 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 88, Color.rgb(0, 0, 0) + 2034404984, 1432018419 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        map3.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, string, "POST", string2));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.getCurrencyIso4217Code().getHostName()));
        sb2.append("/");
        sb2.append(str);
        AFd1nSDK<String> revenue = getRevenue(new AFd1cSDK(sb2.toString(), string2.getBytes(Charset.defaultCharset()), "POST", map3, false), new AFd1eSDK(), true);
        int i12 = hashCode + 67;
        copy = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 99 / 0;
        }
        return revenue;
    }

    @NonNull
    public final AFd1nSDK<AFa1mSDK> AFAdRevenueData(AFa1pSDK aFa1pSDK) {
        AFd1nSDK<AFa1mSDK> revenue = getRevenue(new AFd1cSDK(aFa1pSDK.component1, AFg1lSDK.getCurrencyIso4217Code(aFa1pSDK.AFAdRevenueData).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFa1pSDK.getMonetizationNetwork()), new AFa1rSDK());
        int i10 = hashCode + 91;
        copy = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 24 / 0;
        }
        return revenue;
    }

    public final AFd1nSDK<String> getRevenue(@NonNull String str) {
        AFd1cSDK aFd1cSDK = new AFd1cSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFd1cSDK.component4 = 10000;
        aFd1cSDK.getCurrencyIso4217Code = false;
        AFd1nSDK<String> revenue = getRevenue(aFd1cSDK, new AFd1eSDK());
        int i10 = hashCode + 19;
        copy = i10 % 128;
        if (i10 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    @androidx.annotation.p0
    public final AFd1mSDK getRevenue(Map<String, Object> map, String str) {
        copy = (hashCode + 65) % 128;
        try {
            try {
                Object[] objArr = {map, str};
                Map map2 = AFa1kSDK.f89663i;
                Object method = map2.get(317123644);
                if (method == null) {
                    method = ((Class) AFa1kSDK.getCurrencyIso4217Code(197 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((-1) - TextUtils.indexOf("", org.locationtech.jts.geom.l.f338160j, 0)), TextUtils.lastIndexOf("", org.locationtech.jts.geom.l.f338160j, 0, 0) + 38)).getMethod("getMediationNetwork", Map.class, String.class);
                    map2.put(317123644, method);
                }
                byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
                if (bArr == null) {
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: failed to create bytes.", new IllegalArgumentException("Failed to create bytes from proxyData, bytes are null"), false, false);
                    return null;
                }
                copy = (hashCode + 19) % 128;
                return new AFd1mSDK(this.getCurrencyIso4217Code, bArr);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
    }

    private static String getMonetizationNetwork(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String strJoin = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("v2");
        String revenue = AFj1cSDK.getRevenue(strJoin, sb2.toString());
        int i10 = hashCode + 41;
        copy = i10 % 128;
        if (i10 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    private <T> AFd1nSDK<T> getRevenue(AFd1cSDK aFd1cSDK, AFe1ySDK<T> aFe1ySDK) {
        AFd1nSDK<T> revenue;
        int i10 = hashCode + 69;
        copy = i10 % 128;
        if (i10 % 2 != 0) {
            revenue = getRevenue(aFd1cSDK, aFe1ySDK, getRevenue());
            int i11 = 32 / 0;
        } else {
            revenue = getRevenue(aFd1cSDK, aFe1ySDK, getRevenue());
        }
        int i12 = hashCode + 71;
        copy = i12 % 128;
        if (i12 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a7  */
    @androidx.annotation.p0
    public final AFd1nSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str, @androidx.annotation.p0 String str2) {
        String strAFAdRevenueData;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1kSDK.f89663i;
            Object method = map2.get(317123644);
            if (method == null) {
                method = ((Class) AFa1kSDK.getCurrencyIso4217Code(196 - View.combineMeasuredStates(0, 0), (char) View.resolveSize(0, 0), 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getMethod("getMediationNetwork", Map.class, String.class);
                map2.put(317123644, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            int i10 = hashCode;
            copy = (i10 + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
            AFj1fSDK aFj1fSDK = this.component2;
            if (str2 != null) {
                copy = (i10 + 3) % 128;
                if (str2.length() != 0 && !new Regex("4.?(\\d+)?.?(\\d+)").k(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").k(str2)) {
                    strAFAdRevenueData = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
                } else {
                    copy = (hashCode + 75) % 128;
                    strAFAdRevenueData = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
                }
            } else {
                copy = (hashCode + 75) % 128;
                strAFAdRevenueData = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            }
            AFd1nSDK<String> revenue = getRevenue(new AFd1cSDK(aFj1fSDK.getRevenue(aFj1fSDK.getCurrencyIso4217Code(strAFAdRevenueData), false), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1eSDK());
            int i11 = hashCode + 67;
            copy = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 46 / 0;
            }
            return revenue;
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                boolean z10 = false | false;
                AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }

    static void getMonetizationNetwork() {
        component1 = -411944536;
        areAllFieldsValid = 1624197239;
        component3 = -898995602;
        copydefault = new byte[]{-107, -75, -81, 99, com.google.common.base.c.f116472y, -75, 105, -80, com.google.common.base.c.B, 72, -87, 71, -114, 87, com.google.common.base.c.f116463p, -80, 57};
    }

    private boolean getRevenue() {
        if (this.getMediationNetwork.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            return false;
        }
        int i10 = copy;
        int i11 = i10 + com.planner5d.library.engine.input.f.b.f160745y1;
        hashCode = i11 % 128;
        boolean z10 = !(i11 % 2 == 0);
        hashCode = (i10 + 79) % 128;
        return z10;
    }

    private <T> AFd1nSDK<T> getRevenue(AFd1cSDK aFd1cSDK, AFe1ySDK<T> aFe1ySDK, boolean z10) {
        aFd1cSDK.getMediationNetwork = z10;
        AFd1lSDK aFd1lSDK = this.getMonetizationNetwork;
        AFd1nSDK<T> aFd1nSDK = new AFd1nSDK<>(aFd1cSDK, aFd1lSDK.getRevenue, aFd1lSDK.getMonetizationNetwork, aFe1ySDK);
        copy = (hashCode + 109) % 128;
        return aFd1nSDK;
    }

    @NonNull
    public final AFd1nSDK<AFi1wSDK> getRevenue(boolean z10, boolean z11, @NonNull String str, int i10) {
        return (AFd1nSDK) getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z10), Boolean.valueOf(z11), str, Integer.valueOf(i10)}, 662152322, -662152320, i10);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    @androidx.annotation.p0
    public final AFd1nSDK<String> getCurrencyIso4217Code(AFh1rSDK aFh1rSDK, String str, AFc1iSDK aFc1iSDK) {
        String strAFAdRevenueData;
        String strAFAdRevenueData2;
        try {
            Object[] objArr = {aFh1rSDK, str, aFc1iSDK};
            Map map = AFa1kSDK.f89663i;
            Object method = map.get(-1609157430);
            if (method == null) {
                method = ((Class) AFa1kSDK.getCurrencyIso4217Code(TextUtils.indexOf("", "", 0, 0) + 196, (char) KeyEvent.normalizeMetaState(0), 37 - TextUtils.indexOf("", "", 0, 0))).getMethod("getMonetizationNetwork", AFh1rSDK.class, String.class, AFc1iSDK.class);
                map.put(-1609157430, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            hashCode = (copy + 13) % 128;
            AFj1fSDK aFj1fSDK = this.component2;
            Intrinsics.checkNotNullParameter(aFh1rSDK, "");
            boolean mediationNetwork = aFh1rSDK.getMediationNetwork();
            boolean z10 = aFh1rSDK instanceof AFh1lSDK;
            boolean z11 = aFh1rSDK instanceof AFh1jSDK;
            boolean z12 = aFh1rSDK instanceof AFh1kSDK;
            boolean z13 = aFh1rSDK instanceof AFi1zSDK;
            boolean z14 = aFh1rSDK instanceof AFh1gSDK;
            boolean z15 = aFh1rSDK instanceof AFg1wSDK;
            if (aFh1rSDK instanceof AFh1eSDK) {
                strAFAdRevenueData = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%spia.%s/api/v1.0/pia-android-event?app_id=");
                copy = (hashCode + 21) % 128;
            } else {
                if (z12) {
                    strAFAdRevenueData = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.getRevenue);
                } else {
                    int i10 = hashCode + 19;
                    int i11 = i10 % 128;
                    copy = i11;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                    if (z11) {
                        strAFAdRevenueData = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.getRevenue);
                    } else if (z10) {
                        int i12 = i11 + 13;
                        hashCode = i12 % 128;
                        if (i12 % 2 != 0) {
                            strAFAdRevenueData = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.getCurrencyIso4217Code);
                        } else {
                            aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.getCurrencyIso4217Code);
                            throw null;
                        }
                    } else if (z13) {
                        int i13 = i11 + 7;
                        hashCode = i13 % 128;
                        if (i13 % 2 != 0) {
                            strAFAdRevenueData = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.component3);
                        } else {
                            aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.component3);
                            throw null;
                        }
                    } else if (z14) {
                        strAFAdRevenueData2 = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%ssdk-services.%s/validate-android-signature");
                    } else if (z15) {
                        strAFAdRevenueData = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.areAllFieldsValid);
                    } else if (mediationNetwork) {
                        if (aFh1rSDK.component2 < 2) {
                            strAFAdRevenueData = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.getMediationNetwork);
                        } else {
                            strAFAdRevenueData = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.component1);
                        }
                    } else {
                        strAFAdRevenueData = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.component2);
                    }
                }
                return getRevenue(new AFd1cSDK(strAFAdRevenueData2, bArr, "POST", Collections.EMPTY_MAP, aFh1rSDK.getMonetizationNetwork()), new AFd1eSDK());
            }
            strAFAdRevenueData2 = aFj1fSDK.getRevenue(AFj1fSDK.AFAdRevenueData(aFj1fSDK.getCurrencyIso4217Code(strAFAdRevenueData), z10), z15);
            return getRevenue(new AFd1cSDK(strAFAdRevenueData2, bArr, "POST", Collections.EMPTY_MAP, aFh1rSDK.getMonetizationNetwork()), new AFd1eSDK());
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }
}
