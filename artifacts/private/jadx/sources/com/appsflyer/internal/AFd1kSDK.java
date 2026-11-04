package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.devtodev.core.data.consts.RequestParams;
import io.sentry.o7;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFd1kSDK implements AFd1pSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long areAllFieldsValid = 0;
    private static char copy = 0;
    private static int equals = 1;
    private static final int getRevenue;
    private static int hashCode;
    private static int toString;
    private final AFc1dSDK component1;
    private List<String> getCurrencyIso4217Code = new ArrayList();
    private boolean getMonetizationNetwork = true;

    @NonNull
    private final Map<String, Object> AFAdRevenueData = new HashMap();
    private SecureRandom component3 = new SecureRandom();
    private boolean component2 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMediationNetwork = 0;
    private boolean component4 = false;

    static {
        component3();
        getRevenue = 98166;
        int i10 = equals + me.relex.circleindicator.a.f332619e;
        toString = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 69 / 0;
        }
    }

    public AFd1kSDK(AFc1dSDK aFc1dSDK) {
        this.component1 = aFc1dSDK;
    }

    private void AFInAppEventParameterName() {
        toString = (equals + 89) % 128;
        this.component1.component2().getMonetizationNetwork("participantInProxy");
        equals = (toString + 121) % 128;
    }

    private static void a(int i10, char c10, String str, String str2, String str3, Object[] objArr) {
        char[] charArray;
        char[] charArray2;
        if (str3 != null) {
            int i11 = $11 + 31;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                str3.toCharArray();
                throw null;
            }
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
            $10 = ($11 + 29) % 128;
        } else {
            charArray2 = str2;
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        int length = charArray3.length;
        char[] cArr3 = new char[length];
        int length2 = cArr.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(charArray3, 0, cArr3, 0, length);
        System.arraycopy(cArr, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c10);
        cArr4[2] = (char) (cArr4[2] + ((char) i10));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        aFk1jSDK.getMediationNetwork = 0;
        while (true) {
            int i12 = aFk1jSDK.getMediationNetwork;
            if (i12 >= length3) {
                objArr[0] = new String(cArr5);
                return;
            }
            int i13 = (i12 + 3) % 4;
            int i14 = cArr3[i12 % 4] * 32718;
            char c11 = cArr4[(i12 + 2) % 4];
            char c12 = (char) ((i14 + c11) % 65535);
            aFk1jSDK.AFAdRevenueData = c12;
            cArr4[i13] = (char) (((cArr3[i13] * 32718) + c11) / 65535);
            cArr3[i13] = c12;
            cArr5[i12] = (char) (((((long) (cArr2[i12] ^ c12)) ^ (areAllFieldsValid ^ (-866183138771165766L))) ^ ((long) ((int) (((long) hashCode) ^ (-866183138771165766L))))) ^ ((long) ((char) (((long) copy) ^ (-866183138771165766L)))));
            aFk1jSDK.getMediationNetwork = i12 + 1;
        }
    }

    private synchronized void areAllFieldsValid() {
        try {
            int i10 = toString + 63;
            equals = i10 % 128;
            if (i10 % 2 == 0) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                if (this.component4) {
                    return;
                }
                this.component4 = true;
                try {
                    getCurrencyIso4217Code("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                    equals = (toString + 3) % 128;
                    return;
                } catch (Throwable th3) {
                    boolean z10 = !false;
                    AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while starting remote debugger", th3, true, true, true);
                    return;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        throw th4;
    }

    @l1
    private static String component1() {
        int i10 = toString;
        int i11 = i10 + 77;
        equals = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        equals = (i10 + 33) % 128;
        return "6.17.0";
    }

    @l1
    private float component2() {
        equals = (toString + 65) % 128;
        float fNextFloat = this.component3.nextFloat();
        int i10 = equals + 119;
        toString = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 16 / 0;
        }
        return fNextFloat;
    }

    static void component3() {
        areAllFieldsValid = -866183138771165766L;
        hashCode = 1193057722;
        copy = (char) 29794;
    }

    @NonNull
    private synchronized Map<String, Object> copy() {
        Map<String, Object> map;
        try {
            equals = (toString + 47) % 128;
            this.AFAdRevenueData.put("data", this.getCurrencyIso4217Code);
            equals();
            map = this.AFAdRevenueData;
            toString = (equals + com.rabbitmq.client.impl.k.b.p.f265340a) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
        return map;
    }

    private boolean copydefault() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -1999031441, 1999031443, System.identityHashCode(this))).booleanValue();
    }

    private synchronized void equals() {
        try {
            this.getCurrencyIso4217Code = new ArrayList();
            this.getMediationNetwork = 0;
            toString = (equals + 115) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = ~i12;
        int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
        int i18 = i10 | i11;
        int i19 = (i10 * 85) + (i11 * 85) + ((i17 | (~(i18 | i12))) * (-84));
        int i20 = i10 | (~(i12 | i14));
        int i21 = ~(i11 | i16);
        int i22 = i19 + ((i20 | i21) * (-84)) + (((~i18) | i21) * 84);
        if (i22 == 1) {
            AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
            String str = (String) objArr[1];
            String[] strArr = (String[]) objArr[2];
            equals = (toString + 69) % 128;
            aFd1kSDK.getCurrencyIso4217Code("public_api_call", str, strArr);
            toString = (equals + 1) % 128;
            return null;
        }
        if (i22 == 2) {
            return getCurrencyIso4217Code(objArr);
        }
        int i23 = 0 >> 3;
        if (i22 == 3) {
            return getMonetizationNetwork(objArr);
        }
        AFd1kSDK aFd1kSDK2 = (AFd1kSDK) objArr[0];
        boolean zAFAdRevenueData = aFd1kSDK2.AFAdRevenueData(getCurrencyIso4217Code(aFd1kSDK2.component1.component1().getMediationNetwork.getCurrencyIso4217Code), getCurrencyIso4217Code(aFd1kSDK2.component1.component1().getMediationNetwork.AFAdRevenueData));
        if (!zAFAdRevenueData) {
            aFd1kSDK2.getRevenue();
            aFd1kSDK2.getMediationNetwork();
        } else {
            equals = (toString + 57) % 128;
            aFd1kSDK2.areAllFieldsValid();
        }
        equals = (toString + 31) % 128;
        return Boolean.valueOf(zAFAdRevenueData);
    }

    @l1
    private Map<String, Object> p_(String str, PackageManager packageManager) {
        int i10 = equals + 95;
        toString = i10 % 128;
        if (i10 % 2 != 0) {
            q_(str, packageManager, this.component1.registerClient(), this.component1.afInfoLog());
            copy();
            throw null;
        }
        q_(str, packageManager, this.component1.registerClient(), this.component1.afInfoLog());
        Map<String, Object> mapCopy = copy();
        int i11 = equals + 29;
        toString = i11 % 128;
        if (i11 % 2 == 0) {
            return mapCopy;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[Catch: all -> 0x002f, PHI: r1
      0x0055: PHI (r1v4 com.appsflyer.AppsFlyerProperties) = (r1v3 com.appsflyer.AppsFlyerProperties), (r1v5 com.appsflyer.AppsFlyerProperties) binds: [B:18:0x0043, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x0004, B:6:0x0013, B:24:0x00d6, B:21:0x0055, B:23:0x00bc, B:14:0x002e, B:17:0x0032, B:8:0x0026), top: B:39:0x0004, inners: #2 }] */
    private synchronized void q_(String str, PackageManager packageManager, AFf1gSDK aFf1gSDK, AFc1kSDK aFc1kSDK) {
        AppsFlyerProperties appsFlyerProperties;
        String string;
        try {
            int i10 = toString + 43;
            equals = i10 % 128;
            if (i10 % 2 == 0) {
                appsFlyerProperties = AppsFlyerProperties.getInstance();
                string = appsFlyerProperties.getString("remote_debug_static_data");
                this.AFAdRevenueData.clear();
                try {
                    int i11 = 38 / 0;
                    if (string != null) {
                        try {
                            this.AFAdRevenueData.putAll(AFg1lSDK.getMonetizationNetwork(new JSONObject(string)));
                        } catch (Throwable unused) {
                        }
                    } else {
                        getMediationNetwork(this.component1.getRevenue().AFAdRevenueData(), aFf1gSDK.getRevenue(), aFc1kSDK.AFAdRevenueData);
                        StringBuilder sb2 = new StringBuilder("6.17.0.");
                        sb2.append(AFa1tSDK.getMonetizationNetwork);
                        getCurrencyIso4217Code(sb2.toString(), this.component1.registerClient().getMediationNetwork(), appsFlyerProperties.getString("KSAppsFlyerId"), AFb1iSDK.getRevenue(this.component1.getRevenue().getMonetizationNetwork));
                        try {
                            int i12 = packageManager.getPackageInfo(str, 0).versionCode;
                            getMonetizationNetwork(str, String.valueOf(i12), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                        } catch (Throwable unused2) {
                        }
                        appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.AFAdRevenueData).toString());
                        equals = (toString + 43) % 128;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                appsFlyerProperties = AppsFlyerProperties.getInstance();
                string = appsFlyerProperties.getString("remote_debug_static_data");
                this.AFAdRevenueData.clear();
                if (string != null) {
                    this.AFAdRevenueData.putAll(AFg1lSDK.getMonetizationNetwork(new JSONObject(string)));
                } else {
                    getMediationNetwork(this.component1.getRevenue().AFAdRevenueData(), aFf1gSDK.getRevenue(), aFc1kSDK.AFAdRevenueData);
                    StringBuilder sb3 = new StringBuilder("6.17.0.");
                    sb3.append(AFa1tSDK.getMonetizationNetwork);
                    getCurrencyIso4217Code(sb3.toString(), this.component1.registerClient().getMediationNetwork(), appsFlyerProperties.getString("KSAppsFlyerId"), AFb1iSDK.getRevenue(this.component1.getRevenue().getMonetizationNetwork));
                    int i13 = packageManager.getPackageInfo(str, 0).versionCode;
                    getMonetizationNetwork(str, String.valueOf(i13), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                    appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.AFAdRevenueData).toString());
                    equals = (toString + 43) % 128;
                }
            }
            this.AFAdRevenueData.put("launch_counter", String.valueOf(this.component1.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0)));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private boolean registerClient() {
        int i10 = toString + 9;
        equals = i10 % 128;
        int i11 = i10 % 2;
        return this.component1.component2().getMediationNetwork("participantInProxy", false);
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final synchronized void AFAdRevenueData() {
        try {
            toString = (equals + 31) % 128;
            this.AFAdRevenueData.clear();
            this.getCurrencyIso4217Code.clear();
            this.getMediationNetwork = 0;
            int i10 = toString + 105;
            equals = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 83 / 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final boolean component4() {
        int i10 = equals;
        int i11 = i10 + com.planner5d.library.engine.input.f.b.f160733u1;
        toString = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        boolean z10 = this.component4;
        toString = (i10 + 119) % 128;
        return z10;
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getCurrencyIso4217Code(String str, String str2) {
        int i10 = toString + 17;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            getCurrencyIso4217Code("server_request", str, strArr);
        } else {
            getCurrencyIso4217Code("server_request", str, str2);
        }
        int i11 = toString + 101;
        equals = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMonetizationNetwork(Throwable th2) {
        StackTraceElement[] stackTrace;
        equals = (toString + 45) % 128;
        Throwable cause = th2.getCause();
        String simpleName = th2.getClass().getSimpleName();
        String message = cause == null ? th2.getMessage() : cause.getMessage();
        if (cause == null) {
            int i10 = equals + 73;
            toString = i10 % 128;
            if (i10 % 2 != 0) {
                th2.getStackTrace();
                throw null;
            }
            stackTrace = th2.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
            equals = (toString + 3) % 128;
        }
        getCurrencyIso4217Code(o7.b.f305964e, simpleName, getRevenue(message, stackTrace));
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getRevenue(String str, int i10, String str2) {
        equals = (toString + 29) % 128;
        getCurrencyIso4217Code("server_response", str, String.valueOf(i10), str2);
        int i11 = equals + 121;
        toString = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void o_(String str, PackageManager packageManager) {
        int i10 = equals + me.relex.circleindicator.a.f332619e;
        toString = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.component1.getCurrencyIso4217Code().getRevenue(p_(str, packageManager), this.component1.registerClient().getMediationNetwork());
                throw null;
            }
            final AFd1mSDK revenue = this.component1.getCurrencyIso4217Code().getRevenue(p_(str, packageManager), this.component1.registerClient().getMediationNetwork());
            if (revenue == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                return;
            }
            this.component1.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.p
                @Override // java.lang.Runnable
                public final void run() {
                    revenue.getMonetizationNetwork();
                }
            });
            int i11 = toString + 19;
            equals = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th2);
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getCurrencyIso4217Code() {
        int i10 = toString + 23;
        int i11 = i10 % 128;
        equals = i11;
        this.component2 = i10 % 2 == 0;
        int i12 = i11 + 63;
        toString = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final synchronized void getRevenue() {
        try {
            equals = (toString + 125) % 128;
            this.getMonetizationNetwork = false;
            AFAdRevenueData();
            equals();
            toString = (equals + 121) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean AFAdRevenueData(@androidx.annotation.p0 AFi1xSDK aFi1xSDK, @androidx.annotation.p0 AFi1xSDK aFi1xSDK2) {
        boolean z10 = false;
        try {
            if (aFi1xSDK == null) {
                AFInAppEventParameterName();
                return false;
            }
            if (!aFi1xSDK.getCurrencyIso4217Code()) {
                int i10 = toString + 77;
                equals = i10 % 128;
                if (i10 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (this.component1.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) > aFi1xSDK.getMonetizationNetwork) {
                toString = (equals + 3) % 128;
                return false;
            }
            if (!getRevenue(aFi1xSDK, aFi1xSDK2)) {
                return false;
            }
            if (!AFAdRevenueData(aFi1xSDK.AFAdRevenueData)) {
                int i11 = equals;
                int i12 = i11 + 113;
                toString = i12 % 128;
                if (i12 % 2 == 0) {
                    z10 = true;
                }
                boolean z11 = !z10;
                toString = (i11 + 21) % 128;
                return z11;
            }
            if (getCurrencyIso4217Code(aFi1xSDK.component2)) {
                return true;
            }
            int i13 = toString + 113;
            equals = i13 % 128;
            return i13 % 2 == 0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        if (aFd1kSDK.component2) {
            int i10 = equals;
            toString = (i10 + 49) % 128;
            if (aFd1kSDK.getMonetizationNetwork || aFd1kSDK.component4) {
                int i11 = i10 + 57;
                toString = i11 % 128;
                if (i11 % 2 == 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
        }
        return Boolean.FALSE;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3, String str4) {
        try {
            this.AFAdRevenueData.put("sdk_version", str);
            if (str2 != null) {
                try {
                    int i10 = toString + 61;
                    equals = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 47 / 0;
                        if (str2.length() > 0) {
                            this.AFAdRevenueData.put("devkey", str2);
                        }
                    } else if (str2.length() > 0) {
                        this.AFAdRevenueData.put("devkey", str2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (str3 != null) {
                int i12 = toString + 19;
                equals = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 74 / 0;
                    if (str3.length() > 0) {
                        this.AFAdRevenueData.put("originalAppsFlyerId", str3);
                    }
                } else if (str3.length() > 0) {
                    this.AFAdRevenueData.put("originalAppsFlyerId", str3);
                }
            }
            if (str4 != null) {
                int i14 = toString + 61;
                equals = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 79 / 0;
                    if (str4.length() > 0) {
                        this.AFAdRevenueData.put(RequestParams.UID, str4);
                    }
                } else if (str4.length() > 0) {
                    this.AFAdRevenueData.put(RequestParams.UID, str4);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static String[] getRevenue(String str, StackTraceElement[] stackTraceElementArr) {
        int i10 = toString;
        equals = (i10 + 55) % 128;
        if (stackTraceElementArr != null) {
            String[] strArr = new String[stackTraceElementArr.length + 1];
            strArr[0] = str;
            for (int i11 = 1; i11 < stackTraceElementArr.length; i11++) {
                strArr[i11] = stackTraceElementArr[i11].toString();
            }
            return strArr;
        }
        int i12 = i10 + 91;
        equals = i12 % 128;
        if (i12 % 2 != 0) {
            return new String[]{str};
        }
        String[] strArr2 = new String[0];
        strArr2[1] = str;
        return strArr2;
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMonetizationNetwork(String str, String str2) {
        int i10 = toString + 53;
        equals = i10 % 128;
        int i11 = 6 ^ 0;
        if (i10 % 2 == 0) {
            String[] strArr = new String[1];
            strArr[1] = str2;
            getCurrencyIso4217Code(null, str, strArr);
        } else {
            getCurrencyIso4217Code(null, str, str2);
        }
        int i12 = equals + 45;
        toString = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    private synchronized void getMonetizationNetwork(String str, String str2, String str3, String str4) {
        try {
            int i10 = toString;
            int i11 = i10 + 71;
            equals = i11 % 128;
            try {
                if (i11 % 2 == 0) {
                    throw null;
                }
                if (str != null) {
                    equals = (i10 + 35) % 128;
                    if (str.length() > 0) {
                        int i12 = toString + 109;
                        equals = i12 % 128;
                        if (i12 % 2 == 0) {
                            this.AFAdRevenueData.put("app_id", str);
                            int i13 = 52 / 0;
                        } else {
                            this.AFAdRevenueData.put("app_id", str);
                        }
                    }
                }
                if (str2 != null && str2.length() > 0) {
                    this.AFAdRevenueData.put(io.sentry.protocol.a.b.f306114f, str2);
                }
                if (str3 != null && str3.length() > 0) {
                    this.AFAdRevenueData.put(AppsFlyerProperties.CHANNEL, str3);
                    toString = (equals + 55) % 128;
                }
                if (str4 != null && str4.length() > 0) {
                    this.AFAdRevenueData.put("preInstall", str4);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean getRevenue(@NonNull AFi1xSDK aFi1xSDK, @androidx.annotation.p0 AFi1xSDK aFi1xSDK2) {
        equals = (toString + 87) % 128;
        if (aFi1xSDK.equals(aFi1xSDK2)) {
            equals = (toString + 63) % 128;
            return registerClient();
        }
        boolean monetizationNetwork = getMonetizationNetwork(aFi1xSDK.getRevenue);
        getMediationNetwork(new Object[]{this, Boolean.valueOf(monetizationNetwork)}, 124011145, -124011142, System.identityHashCode(this));
        return monetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final synchronized void getMediationNetwork() {
        int i10 = (toString + 35) % 128;
        equals = i10;
        if (!this.component4) {
            int i11 = i10 + 23;
            toString = i11 % 128;
            if (i11 % 2 != 0) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!this.getMonetizationNetwork) {
                return;
            }
            this.component4 = false;
            this.getMonetizationNetwork = false;
            try {
                getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                return;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th3, true, true, true);
                return;
            }
        }
        this.component4 = false;
        this.getMonetizationNetwork = false;
        getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        return;
        throw th;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String... strArr) {
        String string;
        if (copydefault()) {
            equals = (toString + 75) % 128;
            if (this.getMediationNetwork < 98304) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strJoin = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(jCurrentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" _/AppsFlyer_6.17.0 [");
                        sb2.append(str);
                        sb2.append("] ");
                        sb2.append(str2);
                        sb2.append(" ");
                        sb2.append(strJoin);
                        string = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(jCurrentTimeMillis);
                        sb3.append(" ");
                        sb3.append(Thread.currentThread().getId());
                        sb3.append(" ");
                        sb3.append(str2);
                        sb3.append("/AppsFlyer_6.17.0 ");
                        sb3.append(strJoin);
                        string = sb3.toString();
                        toString = (equals + 73) % 128;
                    }
                    int length = this.getMediationNetwork + (string.length() << 1);
                    int i10 = getRevenue;
                    boolean z10 = false;
                    if (length > i10) {
                        string = string.substring(0, (i10 - this.getMediationNetwork) / 2);
                        z10 = true;
                    }
                    this.getCurrencyIso4217Code.add(string);
                    this.getMediationNetwork += string.length() << 1;
                    if (z10) {
                        int i11 = toString + 47;
                        equals = i11 % 128;
                        if (i11 % 2 == 0) {
                            this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            this.getMediationNetwork += 7164;
                        } else {
                            this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            this.getMediationNetwork += 138;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private boolean AFAdRevenueData(String str) {
        int i10 = equals + 125;
        toString = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 31 / 0;
            if (AFk1ySDK.getCurrencyIso4217Code(str)) {
                return true;
            }
        } else if (AFk1ySDK.getCurrencyIso4217Code(str)) {
            return true;
        }
        Context context = this.component1.getRevenue().getRevenue.getMonetizationNetwork;
        boolean zEquals = str.equals(AFj1iSDK.getMediationNetwork(context, context.getPackageName()));
        int i12 = toString + 93;
        equals = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 13 / 0;
        }
        return zEquals;
    }

    private boolean getMonetizationNetwork(float f10) {
        double d10 = f10;
        if (d10 >= 1.0d) {
            return true;
        }
        if (d10 <= 0.0d) {
            equals = (toString + 39) % 128;
            return false;
        }
        if (component2() > f10) {
            return false;
        }
        toString = (equals + 67) % 128;
        return true;
    }

    private synchronized void getMediationNetwork(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.AFAdRevenueData;
            Object[] objArr = new Object[1];
            a(428417108 - TextUtils.indexOf("", org.locationtech.jts.geom.l.f338160j, 0, 0), (char) (45453 - TextUtils.indexOf("", org.locationtech.jts.geom.l.f338160j, 0)), "嗊褠踙\ue7b1", "ᒸي醼뇗ൎ", "\u0000\u0000\u0000\u0000", objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.AFAdRevenueData.put("model", Build.MODEL);
            this.AFAdRevenueData.put("platform", "Android");
            this.AFAdRevenueData.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                try {
                    equals = (toString + com.rabbitmq.client.impl.k.b.p.f265340a) % 128;
                    if (str.length() > 0) {
                        this.AFAdRevenueData.put("advertiserId", str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (str2 != null) {
                int i10 = toString + 27;
                equals = i10 % 128;
                if (i10 % 2 != 0) {
                    if (str2.length() > 0) {
                        this.AFAdRevenueData.put("imei", str2);
                    }
                } else {
                    throw null;
                }
            }
            if (str3 != null && str3.length() > 0) {
                this.AFAdRevenueData.put("android_id", str3);
            }
        } catch (Throwable unused) {
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = toString + 41;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            aFd1kSDK.component1.component2().getCurrencyIso4217Code("participantInProxy", zBooleanValue);
            int i11 = 89 / 0;
        } else {
            aFd1kSDK.component1.component2().getCurrencyIso4217Code("participantInProxy", zBooleanValue);
        }
        toString = (equals + 31) % 128;
        return null;
    }

    private static boolean getCurrencyIso4217Code(String str) {
        toString = (equals + 65) % 128;
        if (!AFk1ySDK.getCurrencyIso4217Code(str)) {
            new AFd1sSDK();
            return AFd1sSDK.getMediationNetwork(component1(), str);
        }
        int i10 = toString + 97;
        equals = i10 % 128;
        return i10 % 2 != 0;
    }

    private void getMonetizationNetwork(boolean z10) {
        getMediationNetwork(new Object[]{this, Boolean.valueOf(z10)}, 124011145, -124011142, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final boolean getMonetizationNetwork() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -1790300573, 1790300573, System.identityHashCode(this))).booleanValue();
    }

    @androidx.annotation.p0
    private static AFi1xSDK getCurrencyIso4217Code(@androidx.annotation.p0 AFi1wSDK aFi1wSDK) {
        if (aFi1wSDK != null) {
            int i10 = equals + 49;
            int i11 = i10 % 128;
            toString = i11;
            if (i10 % 2 == 0) {
                AFh1cSDK aFh1cSDK = aFi1wSDK.getMonetizationNetwork;
                if (aFh1cSDK != null) {
                    AFi1xSDK aFi1xSDK = aFh1cSDK.AFAdRevenueData;
                    equals = (i11 + 51) % 128;
                    return aFi1xSDK;
                }
            } else {
                AFh1cSDK aFh1cSDK2 = aFi1wSDK.getMonetizationNetwork;
                throw null;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMediationNetwork(String str, String... strArr) {
        getMediationNetwork(new Object[]{this, str, strArr}, 595413115, -595413114, System.identityHashCode(this));
    }
}
