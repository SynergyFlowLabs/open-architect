package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1gSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] component1 = {63633, 62277, 61193, 56317, 55253, 50050, 48743, 43590, 42524, 37626, 36515, 31377};
    private static long component3 = -7623911999770266845L;
    private static int copydefault = 0;
    private static int hashCode = 1;
    private long AFAdRevenueData;

    @androidx.annotation.p0
    private volatile String component2;
    private volatile String component4;

    @NonNull
    private final AFf1eSDK getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;

    @NonNull
    private final AFc1iSDK getRevenue;
    private boolean getMonetizationNetwork = false;
    private volatile boolean areAllFieldsValid = false;

    public AFf1gSDK(@NonNull AFc1iSDK aFc1iSDK, @NonNull AFf1eSDK aFf1eSDK) {
        this.getRevenue = aFc1iSDK;
        this.getCurrencyIso4217Code = aFf1eSDK;
    }

    private static void a(int i10, int i11, char c10, Object[] objArr) {
        int i12;
        AFk1hSDK aFk1hSDK = new AFk1hSDK();
        long[] jArr = new long[i10];
        aFk1hSDK.getMediationNetwork = 0;
        $10 = ($11 + 67) % 128;
        while (true) {
            int i13 = aFk1hSDK.getMediationNetwork;
            if (i13 >= i10) {
                break;
            }
            $11 = ($10 + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
            jArr[i13] = (((long) ((char) (((long) component1[i11 + i13]) ^ (-750476924154939152L)))) ^ (((long) i13) * ((-750476924154939152L) ^ component3))) ^ ((long) c10);
            aFk1hSDK.getMediationNetwork = i13 + 1;
        }
        char[] cArr = new char[i10];
        while (true) {
            aFk1hSDK.getMediationNetwork = 0;
            while (true) {
                i12 = aFk1hSDK.getMediationNetwork;
                if (i12 >= i10) {
                    objArr[0] = new String(cArr);
                    return;
                }
                int i14 = $10 + 83;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    break;
                }
                cArr[i12] = (char) jArr[i12];
                aFk1hSDK.getMediationNetwork = i12 + 1;
            }
            cArr[i12] = (char) jArr[i12];
        }
    }

    private boolean component1() {
        copydefault = (hashCode + 71) % 128;
        Map<String, Object> map = this.getMediationNetwork;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        int i10 = hashCode + me.relex.circleindicator.a.f332619e;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        int i11 = 3 << 0;
        return false;
    }

    @l1
    private long component2() {
        int i10 = (copydefault + 59) % 128;
        hashCode = i10;
        long j10 = this.AFAdRevenueData;
        int i11 = i10 + 9;
        copydefault = i11 % 128;
        if (i11 % 2 == 0) {
            return j10;
        }
        throw null;
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (i10 * 46) + (i11 * 46) + (((~(i13 | i14)) | i10) * (-90)) + (((~(i11 | i10)) | (~(i13 | i12))) * (-45)) + (((~(i10 | i14)) | (~((~i10) | i12)) | i13) * 45);
        if (i15 != 1) {
            return i15 != 2 ? getCurrencyIso4217Code(objArr) : getRevenue(objArr);
        }
        return getMediationNetwork(objArr);
    }

    public final void AFAdRevenueData(String str) {
        copydefault = (hashCode + 105) % 128;
        this.component4 = str;
        copydefault = (hashCode + 85) % 128;
    }

    final void areAllFieldsValid() {
        getCurrencyIso4217Code(new Object[]{this}, 2120438481, -2120438480, System.identityHashCode(this));
    }

    public final void getMediationNetwork(@NonNull String str) {
        int i10 = hashCode + 109;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            this.component2 = str;
        } else {
            this.component2 = str;
            int i11 = 29 / 0;
        }
    }

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.getRevenue.getMonetizationNetwork};
                Map map2 = AFa1kSDK.f89663i;
                Object declaredConstructor = map2.get(611220697);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFa1kSDK.getCurrencyIso4217Code((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 122, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(611220697, declaredConstructor);
                }
                Map<String, Object> map3 = (Map) ((Constructor) declaredConstructor).newInstance(objArr);
                int i10 = copydefault + 45;
                hashCode = i10 % 128;
                if (i10 % 2 != 0) {
                    return map3;
                }
                throw null;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th3);
            return new HashMap();
        }
    }

    @androidx.annotation.p0
    public final String getRevenue() {
        int i10 = hashCode + 43;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        String str = this.component2;
        copydefault = (hashCode + 69) % 128;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090 A[Catch: Exception -> 0x006c, InvocationTargetException -> 0x006f, TRY_LEAVE, TryCatch #2 {InvocationTargetException -> 0x006f, Exception -> 0x006c, blocks: (B:12:0x004c, B:24:0x0090, B:19:0x0072), top: B:46:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String str;
        AFf1gSDK aFf1gSDK = (AFf1gSDK) objArr[0];
        AFc1qSDK aFc1qSDK = (AFc1qSDK) objArr[1];
        boolean z10 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String strAFAdRevenueData = aFc1qSDK.AFAdRevenueData("imeiCached", (String) null);
        if (z10 && AFk1ySDK.getMediationNetwork(aFf1gSDK.component2)) {
            Context context = aFf1gSDK.getRevenue.getMonetizationNetwork;
            if (context == null || !getMonetizationNetwork(context)) {
                str = null;
            } else {
                int i10 = copydefault + 93;
                hashCode = i10 % 128;
                try {
                    if (i10 % 2 == 0) {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[1]).invoke(telephonyManager, new Object[1]);
                        if (str == null) {
                            if (strAFAdRevenueData != null) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(strAFAdRevenueData)));
                                copydefault = (hashCode + 21) % 128;
                            } else {
                                strAFAdRevenueData = null;
                            }
                            str = strAFAdRevenueData;
                        }
                    } else {
                        TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                        str = (String) telephonyManager2.getClass().getMethod("getDeviceId", null).invoke(telephonyManager2, null);
                        if (str == null) {
                            if (strAFAdRevenueData != null) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(strAFAdRevenueData)));
                                copydefault = (hashCode + 21) % 128;
                            } else {
                                strAFAdRevenueData = null;
                            }
                            str = strAFAdRevenueData;
                        }
                    }
                } catch (InvocationTargetException e10) {
                    if (strAFAdRevenueData != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(strAFAdRevenueData));
                    } else {
                        strAFAdRevenueData = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb2.append(e10.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e10);
                } catch (Exception e11) {
                    if (strAFAdRevenueData != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(strAFAdRevenueData));
                    } else {
                        strAFAdRevenueData = null;
                    }
                    StringBuilder sb3 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb3.append(e11.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e11);
                }
            }
        } else if (aFf1gSDK.component2 != null) {
            str = aFf1gSDK.component2;
        } else {
            str = null;
        }
        if (AFk1ySDK.getMediationNetwork(str)) {
            AFLogger.afInfoLog("IMEI was not collected.");
            return null;
        }
        hashCode = (copydefault + 7) % 128;
        aFc1qSDK.getMediationNetwork("imeiCached", str);
        return str;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) throws Throwable {
        try {
            new AFb1sSDK((AFh1rSDK) objArr[0]).afInfoLog();
            copydefault = (hashCode + 3) % 128;
            return null;
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e10);
            return null;
        }
    }

    public final boolean AFAdRevenueData() {
        int i10 = copydefault + 59;
        hashCode = i10 % 128;
        if (i10 % 2 != 0) {
            return this.areAllFieldsValid;
        }
        throw null;
    }

    @l1
    public static void getRevenue(Map<String, Object> map, AFc1pSDK aFc1pSDK) {
        int i10 = hashCode + 15;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 0;
            if (AFk1ySDK.getMediationNetwork(aFc1pSDK.getMediationNetwork)) {
                String currencyIso4217Code = aFc1pSDK.getCurrencyIso4217Code("com.appsflyer.security.uuid");
                if (AFk1ySDK.getMediationNetwork(currencyIso4217Code)) {
                    int i12 = copydefault + 121;
                    hashCode = i12 % 128;
                    if (i12 % 2 == 0) {
                        AFc1pSDK.getRevenue();
                        throw null;
                    }
                    currencyIso4217Code = AFc1pSDK.getRevenue();
                }
                aFc1pSDK.getMediationNetwork = currencyIso4217Code.substring(0, 8);
            }
            String str = aFc1pSDK.getMediationNetwork;
            try {
                Object[] objArr = new Object[1];
                a(12 - Color.argb(0, 0, 0, 0), TextUtils.indexOf("", org.locationtech.jts.geom.l.f338160j, 0, 0) + 1, (char) TextUtils.indexOf("", "", 0), objArr);
                long j10 = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
                char[] charArray = str.toCharArray();
                int i13 = ((int) (j10 % 94)) + 33;
                while (i11 < charArray.length) {
                    int i14 = copydefault + 61;
                    hashCode = i14 % 128;
                    if (i14 % 2 == 0) {
                        charArray[i11] = (char) (charArray[i11] ^ i13);
                        i11 += me.relex.circleindicator.a.f332619e;
                    } else {
                        charArray[i11] = (char) (charArray[i11] ^ i13);
                        i11++;
                    }
                }
                map.put("sbid", new String(charArray));
                int i15 = copydefault + 9;
                hashCode = i15 % 128;
                if (i15 % 2 == 0) {
                    throw null;
                }
                return;
            } catch (Exception e10) {
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception occurred while generating sbid ", e10);
                return;
            }
        }
        AFk1ySDK.getMediationNetwork(aFc1pSDK.getMediationNetwork);
        throw null;
    }

    public final Map<String, Object> AFAdRevenueData(Map<String, Object> map) {
        AFc1gSDK aFc1gSDK = new AFc1gSDK(map, this.getRevenue.getMonetizationNetwork);
        int i10 = copydefault + 19;
        hashCode = i10 % 128;
        if (i10 % 2 != 0) {
            return aFc1gSDK;
        }
        throw null;
    }

    @androidx.annotation.p0
    public final String getMediationNetwork() {
        int i10 = copydefault + 39;
        hashCode = i10 % 128;
        if (i10 % 2 != 0) {
            return this.component4;
        }
        throw null;
    }

    public final void getMediationNetwork(boolean z10) {
        hashCode = (copydefault + 51) % 128;
        this.areAllFieldsValid = z10;
        int i10 = hashCode + 59;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 58 / 0;
        }
    }

    public final void AFAdRevenueData(AFc1pSDK aFc1pSDK) {
        this.AFAdRevenueData = System.currentTimeMillis();
        this.getMonetizationNetwork = this.getCurrencyIso4217Code.getMediationNetwork(getMediationNetwork(aFc1pSDK), this.getRevenue.getMonetizationNetwork, new AFf1eSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFf1gSDK.5
            @Override // com.appsflyer.internal.AFf1eSDK.AFa1vSDK
            public final void AFAdRevenueData(@NonNull String str, @NonNull String str2) {
                AFf1gSDK.this.getMediationNetwork = new ConcurrentHashMap();
                AFf1gSDK.this.getMediationNetwork.put("signedData", str);
                AFf1gSDK.this.getMediationNetwork.put("signature", str2);
                AFf1gSDK aFf1gSDK = AFf1gSDK.this;
                AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFf1gSDK}, 2120438481, -2120438480, System.identityHashCode(aFf1gSDK));
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFf1eSDK.AFa1vSDK
            public final void AFAdRevenueData(String str, Exception exc) {
                AFf1gSDK.this.getMediationNetwork = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1gSDK aFf1gSDK = AFf1gSDK.this;
                AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFf1gSDK}, 2120438481, -2120438480, System.identityHashCode(aFf1gSDK));
                AFf1gSDK.this.getMediationNetwork.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        hashCode = (copydefault + 33) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r4 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r4 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getMonetizationNetwork() {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFf1gSDK.copydefault
            r3 = 7
            int r1 = r0 + 49
            int r1 = r1 % 128
            r3 = 2
            com.appsflyer.internal.AFf1gSDK.hashCode = r1
            boolean r1 = r4.getMonetizationNetwork
            r2 = 4
            r2 = 0
            r3 = 5
            if (r1 == 0) goto L2d
            int r0 = r0 + 81
            r3 = 6
            int r1 = r0 % 128
            com.appsflyer.internal.AFf1gSDK.hashCode = r1
            int r0 = r0 % 2
            r3 = 5
            boolean r4 = r4.component1()
            if (r0 != 0) goto L28
            r0 = 94
            r3 = 0
            int r0 = r0 / r2
            if (r4 != 0) goto L2d
            goto L2a
        L28:
            if (r4 != 0) goto L2d
        L2a:
            r3 = 6
            r4 = 1
            return r4
        L2d:
            r3 = 3
            int r4 = com.appsflyer.internal.AFf1gSDK.hashCode
            r3 = 0
            int r4 = r4 + 113
            r3 = 6
            int r0 = r4 % 128
            com.appsflyer.internal.AFf1gSDK.copydefault = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L3d
            return r2
        L3d:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1gSDK.getMonetizationNetwork():boolean");
    }

    @l1
    private long getMediationNetwork(AFc1pSDK aFc1pSDK) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AFb1iSDK.getRevenue(aFc1pSDK.getMonetizationNetwork));
        sb2.append(component2());
        long mediationNetwork = AFj1cSDK.getMediationNetwork(AFj1cSDK.getCurrencyIso4217Code(sb2.toString()));
        hashCode = (copydefault + 105) % 128;
        return mediationNetwork;
    }

    private static boolean getMonetizationNetwork(Context context) {
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            int i10 = hashCode + 79;
            copydefault = i10 % 128;
            if (i10 % 2 == 0 ? (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                if (!(!AFa1tSDK.getCurrencyIso4217Code(context))) {
                    return false;
                }
            }
        }
        hashCode = (copydefault + 53) % 128;
        return true;
    }

    public static void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        getCurrencyIso4217Code(new Object[]{aFh1rSDK}, -211782083, 211782085, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1gSDK aFf1gSDK = (AFf1gSDK) objArr[0];
        copydefault = (hashCode + 89) % 128;
        aFf1gSDK.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() - aFf1gSDK.AFAdRevenueData));
        aFf1gSDK.getMediationNetwork.put("lvl_timestamp", Long.valueOf(aFf1gSDK.component2()));
        int i10 = hashCode + 15;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @androidx.annotation.p0
    public final String getMediationNetwork(AFc1qSDK aFc1qSDK) {
        return (String) getCurrencyIso4217Code(new Object[]{this, aFc1qSDK}, -1198101809, 1198101809, System.identityHashCode(this));
    }

    @NonNull
    public final Map<String, Object> getCurrencyIso4217Code() {
        HashMap map = new HashMap();
        if (!component1()) {
            if (this.getMonetizationNetwork) {
                this.getMediationNetwork = new HashMap();
                getCurrencyIso4217Code(new Object[]{this}, 2120438481, -2120438480, System.identityHashCode(this));
                this.getMediationNetwork.put("error", "pending LVL response");
                map.put("lvl", this.getMediationNetwork);
                copydefault = (hashCode + 35) % 128;
            }
            return map;
        }
        int i10 = copydefault + 13;
        hashCode = i10 % 128;
        if (i10 % 2 != 0) {
            map.put("lvl", this.getMediationNetwork);
            return map;
        }
        map.put("lvl", this.getMediationNetwork);
        throw null;
    }
}
