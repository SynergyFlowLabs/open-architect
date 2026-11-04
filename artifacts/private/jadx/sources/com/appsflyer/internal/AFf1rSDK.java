package com.appsflyer.internal;

import android.graphics.Color;
import android.view.Gravity;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AFf1rSDK extends AFe1dSDK<String> {
    private static final AFe1mSDK[] AFInAppEventType = {AFe1mSDK.DLSDK, AFe1mSDK.ONELINK, AFe1mSDK.REGISTER};
    private final AFf1dSDK AFKeystoreWrapper;
    private final AFc1iSDK AFLogger;
    public final AFh1rSDK component2;
    protected final AFc1qSDK copy;

    @NonNull
    private final AFc1pSDK copydefault;
    private final AFe1zSDK equals;
    private final AFf1oSDK hashCode;
    protected final AFg1qSDK toString;

    public AFf1rSDK(@NonNull AFh1rSDK aFh1rSDK, @NonNull AFc1dSDK aFc1dSDK) {
        this(aFh1rSDK, aFc1dSDK, null);
    }

    @NonNull
    protected static Map<String, Object> component1(AFh1rSDK aFh1rSDK) {
        Map<String, Object> map = (Map) aFh1rSDK.AFAdRevenueData.get(io.sentry.protocol.j.b.f306355e);
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        aFh1rSDK.AFAdRevenueData.put(io.sentry.protocol.j.b.f306355e, map2);
        return map2;
    }

    @androidx.annotation.i
    protected void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        try {
            try {
                getCurrencyIso4217Code(aFh1rSDK);
                getRevenue(aFh1rSDK);
                getMediationNetwork(aFh1rSDK);
                getMonetizationNetwork(aFh1rSDK);
                component3(aFh1rSDK);
            } catch (Throwable th2) {
                int i10 = 2 | 0;
                AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while collecting payload params", th2, true, true, false);
            }
            if (aFh1rSDK.getRevenue()) {
                aFh1rSDK.getMediationNetwork(((AFe1dSDK) this).component3.AFAdRevenueData(aFh1rSDK.AFAdRevenueData));
                aFh1rSDK.getMediationNetwork(((AFe1dSDK) this).component3.getMonetizationNetwork(aFh1rSDK.AFAdRevenueData));
                if (this.copydefault.getMonetizationNetwork("com.appsflyer.security.enable", false)) {
                    AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFh1rSDK}, -211782083, 211782085, (int) System.currentTimeMillis());
                }
            }
            if (aFh1rSDK.component2()) {
                aFh1rSDK.getMediationNetwork(((AFe1dSDK) this).component3.getCurrencyIso4217Code());
            }
            Set<AFe1mSDK> set = this.getCurrencyIso4217Code;
            boolean z10 = set.contains(AFe1mSDK.LAUNCH) || set.contains(AFe1mSDK.CONVERSION);
            if (areAllFieldsValid() && z10) {
                aFh1rSDK.AFAdRevenueData(this.copy.AFAdRevenueData("appsFlyerCount", 0));
            }
            if (aFh1rSDK.areAllFieldsValid()) {
                Map<String, Object> mapComponent1 = component1(aFh1rSDK);
                AFe1zSDK aFe1zSDK = this.equals;
                AFe1xSDK aFe1xSDK = new AFe1xSDK(aFe1zSDK.getMediationNetwork(), aFe1zSDK.getCurrencyIso4217Code(), AFe1zSDK.AFAdRevenueData() ? AFe1wSDK.DEFAULT : AFe1wSDK.API);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", aFe1xSDK.getMediationNetwork);
                AFe1wSDK aFe1wSDK = aFe1xSDK.AFAdRevenueData;
                if (aFe1wSDK != AFe1wSDK.DEFAULT) {
                    jSONObject.put("method", aFe1wSDK.getCurrencyIso4217Code);
                }
                String str = aFe1xSDK.getRevenue;
                if (str != null && !StringsKt.w3(str)) {
                    jSONObject.put("prefix", aFe1xSDK.getRevenue);
                }
                mapComponent1.put("host", jSONObject);
            }
            if (this.copydefault.getMonetizationNetwork("AF_PREINSTALL_DISABLED", false)) {
                component1(aFh1rSDK).put("preinstall_disabled", Boolean.TRUE);
            }
            this.AFKeystoreWrapper.AFAdRevenueData(aFh1rSDK.AFAdRevenueData, aFh1rSDK.getCurrencyIso4217Code());
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while preparing to send event", th3, true, true, false);
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    @androidx.annotation.p0
    protected final AppsFlyerRequestListener component3() {
        return this.component2.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected boolean copydefault() {
        return true;
    }

    protected void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        this.toString.getMediationNetwork(aFh1rSDK);
    }

    protected void getMediationNetwork(AFh1rSDK aFh1rSDK) {
        this.toString.getMonetizationNetwork(aFh1rSDK);
    }

    protected void getMonetizationNetwork(AFh1rSDK aFh1rSDK) {
        this.toString.getRevenue(aFh1rSDK);
    }

    protected void getRevenue(AFh1rSDK aFh1rSDK) {
        this.toString.getRevenue(aFh1rSDK.AFAdRevenueData);
    }

    public AFf1rSDK(@NonNull AFh1rSDK aFh1rSDK, @NonNull AFc1dSDK aFc1dSDK, String str) {
        super(aFh1rSDK.getCurrencyIso4217Code(), new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, aFc1dSDK, str);
        this.component2 = aFh1rSDK;
        this.equals = aFc1dSDK.AFKeystoreWrapper();
        this.copy = aFc1dSDK.component2();
        this.hashCode = aFc1dSDK.component1();
        this.AFLogger = aFc1dSDK.AFInAppEventType();
        this.copydefault = aFc1dSDK.getRevenue();
        this.toString = aFc1dSDK.component3();
        this.AFKeystoreWrapper = aFc1dSDK.afErrorLog();
        for (AFe1mSDK aFe1mSDK : AFInAppEventType) {
            if (this.getMonetizationNetwork == aFe1mSDK) {
            }
        }
        int i10 = this.component2.component2;
        AFe1mSDK aFe1mSDK2 = this.getMonetizationNetwork;
        if (i10 > 0) {
            this.AFAdRevenueData.add(AFe1mSDK.CONVERSION);
        } else {
            AFe1mSDK aFe1mSDK3 = AFe1mSDK.CONVERSION;
            if (aFe1mSDK2 != aFe1mSDK3) {
                this.getCurrencyIso4217Code.add(aFe1mSDK3);
            }
        }
    }

    protected void component3(AFh1rSDK aFh1rSDK) {
        this.toString.AFAdRevenueData(aFh1rSDK);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x012d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0134  */
    /* JADX WARN: Code duplicated, block: B:72:0x0151  */
    /* JADX WARN: Code duplicated, block: B:75:0x0168  */
    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AFd1nSDK<String> getRevenue(@NonNull String str) {
        double d10;
        JSONObject jSONObject;
        String string;
        String str2;
        Exception exc;
        String strReplaceAll;
        String str3;
        AFAdRevenueData(this.component2);
        if (this.component2.AFAdRevenueData.containsKey(io.sentry.protocol.j.b.f306355e)) {
            try {
                d10 = this.hashCode.getMediationNetwork.getCurrencyIso4217Code.getMonetizationNetwork.getCurrencyIso4217Code.getMonetizationNetwork;
            } catch (NullPointerException unused) {
                d10 = 1.0d;
            }
            if (AFh1rSDK.getCurrencyIso4217Code(d10)) {
                this.component2.AFAdRevenueData.remove(io.sentry.protocol.j.b.f306355e);
            }
        }
        AFd1nSDK<String> currencyIso4217Code = this.component4.getCurrencyIso4217Code(this.component2, str, this.AFLogger);
        Map<String, Object> map = this.component2.AFAdRevenueData;
        try {
            jSONObject = new JSONObject(map);
            try {
                string = jSONObject.toString();
                try {
                    if (string != null) {
                        strReplaceAll = string.replaceAll("\\p{C}", "*Non-printing character*");
                        str2 = strReplaceAll;
                        str3 = string != null ? string : "";
                        if (str2.equals(str3)) {
                            str2 = str3;
                        } else {
                            AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                            try {
                                jSONObject = new JSONObject(str2);
                            } catch (JSONException e10) {
                                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Couldn't parse the payload to a json object", e10);
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this);
                        sb2.append(": preparing data: ");
                        AFh1ySDK.getCurrencyIso4217Code(sb2.toString(), jSONObject);
                        ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str2);
                        return currencyIso4217Code;
                    }
                    throw new NullPointerException("JSON toString of eventParams map returns null");
                } catch (NullPointerException e11) {
                    e = e11;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
                    try {
                        Object[] objArr = {map};
                        Map map2 = AFa1kSDK.f89663i;
                        Object method = map2.get(-1183302619);
                        if (method == null) {
                            method = ((Class) AFa1kSDK.getCurrencyIso4217Code(Gravity.getAbsoluteGravity(0, 0) + 196, (char) Color.green(0), 36 - MotionEvent.axisFromString(""))).getMethod("getCurrencyIso4217Code", Map.class);
                            map2.put(-1183302619, method);
                        }
                        String str4 = (String) ((Method) method).invoke(null, objArr);
                        try {
                            if (str4 != null) {
                                strReplaceAll = str4.replaceAll("\\p{C}", "*Non-printing character*");
                                string = str4;
                            } else {
                                throw new NullPointerException("JSON toString of eventParams map returns null");
                            }
                        } catch (NullPointerException e12) {
                            e = e12;
                            string = str4;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
                            str2 = "";
                        } catch (Exception e13) {
                            exc = e13;
                            string = str4;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            str2 = "";
                        } catch (Throwable th2) {
                            th = th2;
                            string = str4;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                            str2 = "";
                        }
                    } catch (Throwable th3) {
                        try {
                            Throwable cause = th3.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th3;
                        } catch (NullPointerException e14) {
                            e = e14;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
                            str2 = "";
                            if (string != null) {
                            }
                            if (str2.equals(str3)) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(str2);
                            } else {
                                str2 = str3;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this);
                            sb3.append(": preparing data: ");
                            AFh1ySDK.getCurrencyIso4217Code(sb3.toString(), jSONObject);
                            ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str2);
                            return currencyIso4217Code;
                        } catch (Exception e15) {
                            exc = e15;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            str2 = "";
                            if (string != null) {
                            }
                            if (str2.equals(str3)) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(str2);
                            } else {
                                str2 = str3;
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(this);
                            sb4.append(": preparing data: ");
                            AFh1ySDK.getCurrencyIso4217Code(sb4.toString(), jSONObject);
                            ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str2);
                            return currencyIso4217Code;
                        } catch (Throwable th4) {
                            th = th4;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                            str2 = "";
                            if (string != null) {
                            }
                            if (str2.equals(str3)) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(str2);
                            } else {
                                str2 = str3;
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(this);
                            sb5.append(": preparing data: ");
                            AFh1ySDK.getCurrencyIso4217Code(sb5.toString(), jSONObject);
                            ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str2);
                            return currencyIso4217Code;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                    str2 = "";
                    if (string != null) {
                    }
                    if (str2.equals(str3)) {
                        AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                        jSONObject = new JSONObject(str2);
                    } else {
                        str2 = str3;
                    }
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(this);
                    sb6.append(": preparing data: ");
                    AFh1ySDK.getCurrencyIso4217Code(sb6.toString(), jSONObject);
                    ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str2);
                    return currencyIso4217Code;
                }
            } catch (NullPointerException e16) {
                e = e16;
                string = null;
            } catch (Throwable th6) {
                th = th6;
                string = null;
            }
        } catch (NullPointerException e17) {
            e = e17;
            jSONObject = null;
            string = null;
        } catch (Throwable th7) {
            th = th7;
            jSONObject = null;
            string = null;
        }
    }
}
