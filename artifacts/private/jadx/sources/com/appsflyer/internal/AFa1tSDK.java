package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.m1;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1lSDK.AnonymousClass5;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.facebook.internal.z0;
import io.sentry.k9;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFa1tSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    static AppsFlyerInAppPurchaseValidatorListener AFAdRevenueData = null;
    private static int AFInAppEventParameterName = 0;
    private static int AFInAppEventType = 1;
    private static int[] AFKeystoreWrapper;

    @l1
    private static AFa1tSDK areAllFieldsValid;
    public static final String getMonetizationNetwork;
    public static final String getRevenue;
    Application component1;
    private Map<Long, String> copydefault;
    private AFf1mSDK equals;
    private SharedPreferences hashCode;
    private boolean toString;
    public volatile AppsFlyerConversionListener getCurrencyIso4217Code = null;
    private long component2 = -1;
    long getMediationNetwork = -1;
    private long component3 = TimeUnit.SECONDS.toMillis(5);
    boolean component4 = false;

    @NonNull
    private final AFc1eSDK copy = new AFc1eSDK();

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1tSDK$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getRevenue = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getRevenue[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class AFa1ySDK implements Runnable {
        private final AFh1rSDK getCurrencyIso4217Code;

        AFa1ySDK(AFh1rSDK aFh1rSDK) {
            this.getCurrencyIso4217Code = aFh1rSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFa1tSDK aFa1tSDK = AFa1tSDK.this;
            AFa1tSDK.getMonetizationNetwork(new Object[]{aFa1tSDK, this.getCurrencyIso4217Code}, 974724333, -974724320, System.identityHashCode(aFa1tSDK));
        }
    }

    static {
        areAllFieldsValid();
        getMonetizationNetwork = "348";
        getRevenue = "6.17";
        AFAdRevenueData = null;
        areAllFieldsValid = new AFa1tSDK();
        AFInAppEventType = (AFInAppEventParameterName + 83) % 128;
    }

    @l1
    public AFa1tSDK() {
        AFAdRevenueData().v().AFAdRevenueData();
        AFAdRevenueData().v().getMonetizationNetwork();
        AFe1lSDK aFe1lSDKCopydefault = AFAdRevenueData().copydefault();
        aFe1lSDKCopydefault.AFAdRevenueData.add(new AFa1vSDK());
    }

    private static /* synthetic */ Object AFLogger(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i10 = AFInAppEventParameterName + 69;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setUserEmails", strArr);
            aFa1tSDK.setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            return null;
        }
        aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setUserEmails", strArr);
        aFa1tSDK.setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        boolean z10 = false;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = AFInAppEventParameterName + 29;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(zBooleanValue)));
            int i11 = 66 / 0;
            if (!zBooleanValue) {
                z10 = true;
            }
        } else {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(zBooleanValue)));
            if (!zBooleanValue) {
                z10 = true;
            }
        }
        AFb1jSDK.getRevenue = Boolean.valueOf(z10);
        AFc1dSDK aFc1dSDKAFAdRevenueData = aFa1tSDK.AFAdRevenueData();
        aFc1dSDKAFAdRevenueData.afInfoLog().areAllFieldsValid = zBooleanValue;
        if (zBooleanValue) {
            aFc1dSDKAFAdRevenueData.afInfoLog().component3 = null;
            return null;
        }
        AFe1lSDK aFe1lSDKCopydefault = aFc1dSDKAFAdRevenueData.copydefault();
        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(new AFe1eSDK(aFa1tSDK.AFAdRevenueData())));
        int i12 = AFInAppEventParameterName + 57;
        AFInAppEventType = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static synchronized SharedPreferences c_(Context context) {
        SharedPreferences sharedPreferences;
        try {
            AFInAppEventParameterName = (AFInAppEventType + 63) % 128;
            if (((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).hashCode == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    ((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).hashCode = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    AFInAppEventParameterName = (AFInAppEventType + 35) % 128;
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th2;
                }
            }
            sharedPreferences = ((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).hashCode;
            AFInAppEventParameterName = (AFInAppEventType + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
        } catch (Throwable th3) {
            throw th3;
        }
        return sharedPreferences;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if ((r5 instanceof android.app.Activity) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if ((r5 instanceof android.app.Activity) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r0 = new com.appsflyer.internal.AFh1qSDK((android.app.Activity) r5, AFAdRevenueData().w());
        r4 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 105;
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r4 % 128;
     */
    @androidx.annotation.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.appsflyer.internal.AFh1qSDK component1(android.content.Context r5) {
        /*
            r4 = this;
            r3 = 5
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r1
            r3 = 3
            int r0 = r0 % 2
            r3 = 5
            r1 = 0
            r3 = 2
            if (r0 == 0) goto L1a
            boolean r0 = r5 instanceof android.app.Activity
            r2 = 87
            int r2 = r2 / 0
            if (r0 == 0) goto L42
            goto L1f
        L1a:
            boolean r0 = r5 instanceof android.app.Activity
            r3 = 3
            if (r0 == 0) goto L42
        L1f:
            r3 = 7
            com.appsflyer.internal.AFh1qSDK r0 = new com.appsflyer.internal.AFh1qSDK
            android.app.Activity r5 = (android.app.Activity) r5
            com.appsflyer.internal.AFc1dSDK r4 = r4.AFAdRevenueData()
            r3 = 7
            com.appsflyer.internal.AFi1kSDK r4 = r4.w()
            r3 = 6
            r0.<init>(r5, r4)
            int r4 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r4 = r4 + 105
            r3 = 1
            int r5 = r4 % 128
            r3 = 5
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r5
            r3 = 4
            int r4 = r4 % 2
            if (r4 != 0) goto L41
            return r0
        L41:
            throw r1
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.component1(android.content.Context):com.appsflyer.internal.AFh1qSDK");
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        AppsFlyerProperties.EmailsCryptType emailsCryptType = (AppsFlyerProperties.EmailsCryptType) objArr[1];
        String[] strArr = (String[]) objArr[2];
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            AFInAppEventType = (AFInAppEventParameterName + 35) % 128;
            if (AnonymousClass3.getRevenue[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1cSDK.getMonetizationNetwork(str2));
                AFInAppEventParameterName = (AFInAppEventType + com.rabbitmq.client.impl.k.b.p.f265340a) % 128;
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
        int i10 = AFInAppEventParameterName + 87;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        String str;
        final AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        String str2 = (String) objArr[1];
        AppsFlyerConversionListener appsFlyerConversionListener = (AppsFlyerConversionListener) objArr[2];
        Context context = (Context) objArr[3];
        int i10 = AFInAppEventType + me.relex.circleindicator.a.f332619e;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            boolean z10 = aFa1tSDK.toString;
            throw null;
        }
        if (aFa1tSDK.toString) {
            return aFa1tSDK;
        }
        aFa1tSDK.toString = true;
        aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData(str2);
        if (context != null) {
            AFInAppEventType = (AFInAppEventParameterName + 25) % 128;
            aFa1tSDK.getMediationNetwork(context);
            Application applicationO_ = AFj1iSDK.O_(context);
            if (applicationO_ == null) {
                return aFa1tSDK;
            }
            aFa1tSDK.component1 = applicationO_;
            aFa1tSDK.AFAdRevenueData().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89685a.equals();
                }
            });
            aFa1tSDK.AFAdRevenueData().areAllFieldsValid().getMediationNetwork = System.currentTimeMillis();
            AFe1lSDK aFe1lSDKCopydefault = aFa1tSDK.AFAdRevenueData().copydefault();
            aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(new AFe1eSDK(aFa1tSDK.AFAdRevenueData())));
            AFi1tSDK aFi1tSDKI = aFa1tSDK.AFAdRevenueData().i();
            aFi1tSDKI.getMediationNetwork = Build.VERSION.SDK_INT >= 31 ? new AFi1sSDK(aFi1tSDKI.getCurrencyIso4217Code) : new AFi1qSDK(aFi1tSDKI.getCurrencyIso4217Code);
            aFa1tSDK.AFAdRevenueData().afRDLog().AFAdRevenueData(new AFd1vSDK.AFa1ySDK() { // from class: com.appsflyer.internal.b
                @Override // com.appsflyer.internal.AFd1vSDK.AFa1ySDK
                public final void onConfigurationChanged(boolean z11) {
                    this.f89686a.getMonetizationNetwork(z11);
                }
            });
            aFa1tSDK.AFAdRevenueData().component1().getCurrencyIso4217Code(aFa1tSDK.getMonetizationNetwork());
            AFj1sSDK aFj1sSDKAFLogger = aFa1tSDK.AFAdRevenueData().AFLogger();
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89691a.copydefault();
                }
            };
            AFi1aSDK aFi1aSDKAFAdRevenueData = aFj1sSDKAFLogger.AFAdRevenueData(runnable);
            Runnable runnableAFAdRevenueData = aFj1sSDKAFLogger.AFAdRevenueData(aFi1aSDKAFAdRevenueData, runnable);
            aFj1sSDKAFLogger.getMediationNetwork(aFi1aSDKAFAdRevenueData);
            aFj1sSDKAFLogger.getMediationNetwork(new AFj1oSDK(aFj1sSDKAFLogger.getMediationNetwork.getRevenue(), runnableAFAdRevenueData));
            aFj1sSDKAFLogger.getMediationNetwork(new AFj1vSDK(runnableAFAdRevenueData, aFj1sSDKAFLogger.getMediationNetwork, new AFj1wSDK()));
            aFj1sSDKAFLogger.getMediationNetwork(new AFj1tSDK(runnableAFAdRevenueData, aFj1sSDKAFLogger.getMediationNetwork));
            aFj1sSDKAFLogger.getMediationNetwork(new AFj1uSDK(aFj1sSDKAFLogger.getMediationNetwork.getMonetizationNetwork(), aFj1sSDKAFLogger.getMediationNetwork.getRevenue(), runnableAFAdRevenueData));
            aFj1sSDKAFLogger.getMediationNetwork(runnableAFAdRevenueData);
            if (!aFj1sSDKAFLogger.getMonetizationNetwork()) {
                Context context2 = aFj1sSDKAFLogger.getMediationNetwork.AFInAppEventType().getMonetizationNetwork;
                AFc1dSDK aFc1dSDK = aFj1sSDKAFLogger.getMediationNetwork;
                List<ResolveInfo> listQueryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                if (listQueryIntentContentProviders != null && !listQueryIntentContentProviders.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
                    while (it.hasNext()) {
                        AFInAppEventParameterName = (AFInAppEventType + 59) % 128;
                        ProviderInfo providerInfo = it.next().providerInfo;
                        if (providerInfo != null) {
                            arrayList.add(new AFj1rSDK(providerInfo, runnableAFAdRevenueData, aFc1dSDK));
                        } else {
                            AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        aFj1sSDKAFLogger.getCurrencyIso4217Code.addAll(arrayList);
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
                        StringBuilder sb2 = new StringBuilder("Detected ");
                        sb2.append(arrayList.size());
                        sb2.append(" valid preinstall provider(s)");
                        aFLogger.d(aFg1cSDK, sb2.toString());
                    }
                }
            }
            for (AFj1qSDK aFj1qSDK : aFj1sSDKAFLogger.getRevenue()) {
                AFInAppEventType = (AFInAppEventParameterName + 29) % 128;
                aFj1qSDK.getRevenue(aFj1sSDKAFLogger.getMediationNetwork.AFInAppEventType().getMonetizationNetwork);
            }
            aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData(aFa1tSDK.AFAdRevenueData().getRevenue());
            if (aFa1tSDK.AFAdRevenueData().afWarnLog().getCurrencyIso4217Code()) {
                aFa1tSDK.AFAdRevenueData().afWarnLog().getMediationNetwork();
            }
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFd1pSDK aFd1pSDKCopy = aFa1tSDK.AFAdRevenueData().copy();
        if (appsFlyerConversionListener == null) {
            str = AbstractJsonLexerKt.NULL;
        } else {
            AFInAppEventParameterName = (AFInAppEventType + 101) % 128;
            str = "conversionDataListener";
        }
        aFd1pSDKCopy.getMediationNetwork(k9.b.f305796c, str2, str);
        AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.17.0", getMonetizationNetwork));
        aFa1tSDK.getCurrencyIso4217Code = appsFlyerConversionListener;
        return aFa1tSDK;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        String str = (String) objArr[1];
        Map<String, String> map = (Map) objArr[2];
        AFInAppEventType = (AFInAppEventParameterName + 123) % 128;
        AFa1oSDK aFa1oSDKD = aFa1tSDK.AFAdRevenueData().d();
        aFa1oSDKD.getCurrencyIso4217Code = str;
        aFa1oSDKD.getRevenue = map;
        int i10 = AFInAppEventParameterName + com.planner5d.library.engine.input.f.b.f160733u1;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i10 = 4 & 2;
        String str = (String) objArr[2];
        Map<String, Object> map = (Map) objArr[3];
        AFh1fSDK aFh1fSDK = new AFh1fSDK();
        aFh1fSDK.areAllFieldsValid = str;
        aFh1fSDK.getMonetizationNetwork = map;
        aFa1tSDK.getMonetizationNetwork(aFh1fSDK, aFa1tSDK.component1(context));
        int i11 = AFInAppEventParameterName + 15;
        AFInAppEventType = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 49 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        int i10 = AFInAppEventParameterName + 1;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            aFa1tSDK.AFAdRevenueData().afDebugLog().AFAdRevenueData();
            throw null;
        }
        aFa1tSDK.AFAdRevenueData().afDebugLog().AFAdRevenueData();
        AFInAppEventParameterName = (AFInAppEventType + 17) % 128;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d_(Context context, Intent intent) {
        getMonetizationNetwork(new Object[]{this, context, intent}, 507699176, -507699170, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() {
        AFInAppEventType = (AFInAppEventParameterName + 27) % 128;
        AFAdRevenueData().AFInAppEventParameterName().AFAdRevenueData();
        component2();
        int i10 = AFInAppEventType + 17;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(AFf1nSDK aFf1nSDK) {
        AFInAppEventParameterName = (AFInAppEventType + 1) % 128;
        AFc1dSDK aFc1dSDKAFAdRevenueData = AFAdRevenueData();
        if (aFf1nSDK == AFf1nSDK.SUCCESS) {
            int i10 = AFInAppEventParameterName + 75;
            AFInAppEventType = i10 % 128;
            if (i10 % 2 == 0) {
                aFc1dSDKAFAdRevenueData.afRDLog().getCurrencyIso4217Code();
                throw null;
            }
            aFc1dSDKAFAdRevenueData.afRDLog().getCurrencyIso4217Code();
        }
        if (!(!aFc1dSDKAFAdRevenueData.copy().getMonetizationNetwork())) {
            aFc1dSDKAFAdRevenueData.v().AFAdRevenueData();
        } else {
            AFInAppEventParameterName = (AFInAppEventType + 69) % 128;
            aFc1dSDKAFAdRevenueData.v().getMediationNetwork();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getRevenue(AFc1dSDK aFc1dSDK) {
        int i10 = AFInAppEventParameterName + 95;
        AFInAppEventType = i10 % 128;
        int i11 = i10 % 2;
        aFc1dSDK.AFInAppEventParameterName().getMediationNetwork();
        if (i11 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        AFh1iSDK aFh1iSDK = new AFh1iSDK();
        aFa1tSDK.getMediationNetwork(context);
        aFh1iSDK.areAllFieldsValid = null;
        aFh1iSDK.getMonetizationNetwork = null;
        aFh1iSDK.component3 = str;
        aFh1iSDK.getMediationNetwork = null;
        aFa1tSDK.AFAdRevenueData(aFh1iSDK);
        int i10 = AFInAppEventParameterName + 101;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 32 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        AFInAppEventParameterName = (AFInAppEventType + 71) % 128;
        aFa1tSDK.start(context, str, null);
        int i10 = AFInAppEventParameterName + 65;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final AFc1dSDK AFAdRevenueData() {
        int i10 = AFInAppEventParameterName;
        AFc1eSDK aFc1eSDK = this.copy;
        int i11 = i10 + 85;
        AFInAppEventType = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 84 / 0;
        }
        return aFc1eSDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        AFInAppEventParameterName = (AFInAppEventType + 41) % 128;
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = AFAdRevenueData().d().getMediationNetwork;
        if (!list.contains(listAsList)) {
            list.add(listAsList);
        }
        AFInAppEventType = (AFInAppEventParameterName + 33) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z10) {
        int i10 = AFInAppEventType + 1;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z10);
            aFd1pSDKCopy.getMediationNetwork("anonymizeUser", strArr);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("anonymizeUser", String.valueOf(z10));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z10);
        AFInAppEventParameterName = (AFInAppEventType + 69) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        getMonetizationNetwork(new Object[]{this, str, map}, 1307261109, -1307261102, System.identityHashCode(this));
    }

    public final void b_(Context context, Intent intent) {
        AFj1jSDK aFj1jSDK = new AFj1jSDK(intent);
        if (aFj1jSDK.getRevenue("appsflyer_preinstall") != null) {
            getMonetizationNetwork(new Object[]{aFj1jSDK.getRevenue("appsflyer_preinstall")}, 998031041, -998031039, (int) System.currentTimeMillis());
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String revenue = aFj1jSDK.getRevenue("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(revenue)));
        if (revenue != null) {
            int i10 = AFInAppEventParameterName + 41;
            AFInAppEventType = i10 % 128;
            if (i10 % 2 == 0) {
                getRevenue(context).getMediationNetwork("referrer", revenue);
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                appsFlyerProperties.set("AF_REFERRER", revenue);
                appsFlyerProperties.getMediationNetwork = revenue;
                AppsFlyerProperties.getInstance().AFAdRevenueData();
                throw null;
            }
            getRevenue(context).getMediationNetwork("referrer", revenue);
            AppsFlyerProperties appsFlyerProperties2 = AppsFlyerProperties.getInstance();
            appsFlyerProperties2.set("AF_REFERRER", revenue);
            appsFlyerProperties2.getMediationNetwork = revenue;
            if (AppsFlyerProperties.getInstance().AFAdRevenueData()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                getCurrencyIso4217Code(context, AFh1xSDK.onReceive);
                getMediationNetwork(revenue);
            }
        }
        int i11 = AFInAppEventType + 63;
        AFInAppEventParameterName = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        getMonetizationNetwork(new Object[]{this}, -2040336732, 2040336751, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z10) {
        int i10 = AFInAppEventParameterName + com.planner5d.library.engine.input.f.b.f160745y1;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            AFAdRevenueData().e().getCurrencyIso4217Code(z10);
            throw null;
        }
        AFAdRevenueData().e().getCurrencyIso4217Code(z10);
        int i11 = AFInAppEventType + 1;
        AFInAppEventParameterName = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z10) {
        int i10 = AFInAppEventParameterName + 43;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            getMonetizationNetwork(new Object[]{AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z10)}, -692563571, 692563575, (int) System.currentTimeMillis());
        } else {
            getMonetizationNetwork(new Object[]{AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z10)}, -692563571, 692563575, (int) System.currentTimeMillis());
            int i11 = 36 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r5 == null) goto L9;
     */
    @Override // com.appsflyer.AppsFlyerLib
    @androidx.annotation.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getAppsFlyerUID(@androidx.annotation.NonNull android.content.Context r5) {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "getAppsFlyerUID"
            if (r0 != 0) goto L21
            com.appsflyer.internal.AFc1dSDK r0 = r4.AFAdRevenueData()
            com.appsflyer.internal.AFd1pSDK r0 = r0.copy()
            r3 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.getMediationNetwork(r2, r1)
            if (r5 != 0) goto L42
            r3 = 0
            goto L31
        L21:
            com.appsflyer.internal.AFc1dSDK r0 = r4.AFAdRevenueData()
            r3 = 3
            com.appsflyer.internal.AFd1pSDK r0 = r0.copy()
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.getMediationNetwork(r2, r1)
            if (r5 != 0) goto L42
        L31:
            int r4 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r4 = r4 + 69
            int r5 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r5
            r3 = 0
            int r4 = r4 % 2
            r5 = 0
            r3 = 5
            if (r4 != 0) goto L41
            return r5
        L41:
            throw r5
        L42:
            r3 = 4
            r4.getMediationNetwork(r5)
            com.appsflyer.internal.AFc1dSDK r4 = r4.AFAdRevenueData()
            r3 = 0
            com.appsflyer.internal.AFc1pSDK r4 = r4.getRevenue()
            r3 = 5
            com.appsflyer.internal.AFc1qSDK r4 = r4.getMonetizationNetwork
            r3 = 4
            java.lang.String r4 = com.appsflyer.internal.AFb1iSDK.getRevenue(r4)
            r3 = 3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getAppsFlyerUID(android.content.Context):java.lang.String");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        return (String) getMonetizationNetwork(new Object[]{this, context}, -1689317276, 1689317287, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        AFInAppEventType = (AFInAppEventParameterName + 21) % 128;
        String mediationNetwork = AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork();
        AFInAppEventType = (AFInAppEventParameterName + 71) % 128;
        return mediationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        AFInAppEventParameterName = (AFInAppEventType + 3) % 128;
        String currencyIso4217Code = AFAdRevenueData().AFKeystoreWrapper().getCurrencyIso4217Code();
        int i10 = AFInAppEventParameterName + 67;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    public final void getMediationNetwork(@NonNull Context context) {
        int i10 = AFInAppEventType;
        AFInAppEventParameterName = (i10 + 121) % 128;
        AFc1eSDK aFc1eSDK = this.copy;
        if (context != null) {
            int i11 = (i10 + 113) % 128;
            AFInAppEventParameterName = i11;
            AFc1iSDK aFc1iSDK = aFc1eSDK.AFAdRevenueData;
            if (context != null) {
                AFInAppEventType = (i11 + me.relex.circleindicator.a.f332619e) % 128;
                aFc1iSDK.getMonetizationNetwork = context.getApplicationContext();
                AFInAppEventType = (AFInAppEventParameterName + 19) % 128;
            }
        }
    }

    final synchronized AFf1mSDK getMonetizationNetwork() {
        try {
            int i10 = AFInAppEventType + 17;
            AFInAppEventParameterName = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (this.equals == null) {
                this.equals = new AFf1mSDK() { // from class: com.appsflyer.internal.d
                    @Override // com.appsflyer.internal.AFf1mSDK
                    public final void onRemoteConfigUpdateFinished(AFf1nSDK aFf1nSDK) {
                        this.f89693a.getCurrencyIso4217Code(aFf1nSDK);
                    }
                };
                AFInAppEventParameterName = (AFInAppEventType + 119) % 128;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.equals;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        AFInAppEventParameterName = (AFInAppEventType + 115) % 128;
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            AFInAppEventType = (AFInAppEventParameterName + com.planner5d.library.engine.input.f.b.f160745y1) % 128;
            return string;
        }
        String revenue = getRevenue(context, "AF_STORE");
        if (revenue == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i10 = AFInAppEventParameterName + 99;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 63 / 0;
        }
        return revenue;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i10 = AFInAppEventParameterName + 97;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 0 >> 1;
            AFAdRevenueData().copy().getMediationNetwork("getSdkVersion", new String[1]);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("getSdkVersion", new String[0]);
        }
        String strComponent1 = AFc1pSDK.component1();
        AFInAppEventParameterName = (AFInAppEventType + 87) % 128;
        return strComponent1;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        return (AppsFlyerLib) getMonetizationNetwork(new Object[]{this, str, appsFlyerConversionListener, context}, -235242605, 235242617, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        int i10 = AFInAppEventParameterName + 77;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            getMediationNetwork(context);
            AFAdRevenueData().getRevenue();
            return AFc1pSDK.AFAdRevenueData(context);
        }
        getMediationNetwork(context);
        AFAdRevenueData().getRevenue();
        AFc1pSDK.AFAdRevenueData(context);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        return ((Boolean) getMonetizationNetwork(new Object[]{this}, -1621727139, 1621727154, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(@NonNull AFAdRevenueData aFAdRevenueData, @androidx.annotation.p0 Map<String, Object> map) {
        AFInAppEventType = (AFInAppEventParameterName + 95) % 128;
        if (!this.toString) {
            AFAdRevenueData("logAdRevenue");
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            int i10 = AFInAppEventType + 81;
            AFInAppEventParameterName = i10 % 128;
            if (i10 % 2 != 0) {
                AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                throw null;
            }
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
            AFInAppEventType = (AFInAppEventParameterName + com.rabbitmq.client.impl.k.b.p.f265340a) % 128;
            return;
        }
        if (AFAdRevenueData().registerClient().AFAdRevenueData()) {
            AFInAppEventParameterName = (AFInAppEventType + 93) % 128;
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
        } else {
            if (!AFk1ySDK.getMediationNetwork(AFAdRevenueData().registerClient().getMediationNetwork())) {
                AFAdRevenueData(new AFh1lSDK(aFAdRevenueData, map));
                return;
            }
            AFInAppEventParameterName = (AFInAppEventType + 41) % 128;
            copy();
            int i11 = AFInAppEventParameterName + 51;
            AFInAppEventType = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 27 / 0;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        AFInAppEventParameterName = (AFInAppEventType + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
        logEvent(context, str, map, null);
        int i10 = AFInAppEventType + 57;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 63 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d10, double d11) {
        AFAdRevenueData().copy().getMediationNetwork("logLocation", String.valueOf(d10), String.valueOf(d11));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d11));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d10));
        getMonetizationNetwork(new Object[]{this, context, AFInAppEventType.LOCATION_COORDINATES, map}, 1732368696, -1732368678, System.identityHashCode(this));
        int i10 = AFInAppEventParameterName + 93;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 71 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        AFInAppEventParameterName = (AFInAppEventType + 67) % 128;
        AFAdRevenueData().copy().getMediationNetwork("logSession", new String[0]);
        AFAdRevenueData().copy().getCurrencyIso4217Code();
        getCurrencyIso4217Code(context, AFh1xSDK.logSession);
        getMonetizationNetwork(new Object[]{this, context, null, null}, 1732368696, -1732368678, System.identityHashCode(this));
        int i10 = AFInAppEventParameterName + 87;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 16 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        getMonetizationNetwork(new Object[]{this, context}, -1480636038, 1480636052, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri) {
        int i10 = AFInAppEventParameterName + 35;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 52 / 0;
            if (uri != null) {
                if (!uri.toString().isEmpty()) {
                    if (context == null) {
                        getMediationNetwork(context);
                        AFAdRevenueData().d().f_(AFa1jSDK.getCurrencyIso4217Code(AFAdRevenueData().afVerboseLog()), Uri.parse(uri.toString()));
                        AFInAppEventParameterName = (AFInAppEventType + 113) % 128;
                        return;
                    } else {
                        AFa1oSDK aFa1oSDKD = AFAdRevenueData().d();
                        StringBuilder sb2 = new StringBuilder("Context is \"");
                        sb2.append(context);
                        sb2.append("\"");
                        aFa1oSDKD.AFAdRevenueData(sb2.toString(), DeepLinkResult.Error.NETWORK);
                        return;
                    }
                }
            }
        } else if (uri != null) {
            if (!uri.toString().isEmpty()) {
                if (context == null) {
                    getMediationNetwork(context);
                    AFAdRevenueData().d().f_(AFa1jSDK.getCurrencyIso4217Code(AFAdRevenueData().afVerboseLog()), Uri.parse(uri.toString()));
                    AFInAppEventParameterName = (AFInAppEventType + 113) % 128;
                    return;
                } else {
                    AFa1oSDK aFa1oSDKD2 = AFAdRevenueData().d();
                    StringBuilder sb3 = new StringBuilder("Context is \"");
                    sb3.append(context);
                    sb3.append("\"");
                    aFa1oSDKD2.AFAdRevenueData(sb3.toString(), DeepLinkResult.Error.NETWORK);
                    return;
                }
            }
        }
        AFa1oSDK aFa1oSDKD3 = AFAdRevenueData().d();
        StringBuilder sb4 = new StringBuilder("Link is \"");
        sb4.append(uri);
        sb4.append("\"");
        aFa1oSDKD3.AFAdRevenueData(sb4.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull final Intent intent, @NonNull Context context) {
        int i10 = AFInAppEventType;
        int i11 = i10 + 55;
        AFInAppEventParameterName = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (intent == null) {
            AFAdRevenueData().d().AFAdRevenueData("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context == null) {
            AFInAppEventParameterName = (i10 + 29) % 128;
            AFAdRevenueData().d().AFAdRevenueData("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        getMediationNetwork(applicationContext);
        AFAdRevenueData().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f89698a.d_(applicationContext, intent);
            }
        });
        int i12 = AFInAppEventType + 59;
        AFInAppEventParameterName = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i10 = AFInAppEventType + 79;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            AFAdRevenueData().copy().getMediationNetwork("registerConversionListener", new String[0]);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("registerConversionListener", new String[0]);
        }
        getRevenue(appsFlyerConversionListener);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        AFAdRevenueData().copy().getMediationNetwork("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            AFAdRevenueData = appsFlyerInAppPurchaseValidatorListener;
            AFInAppEventParameterName = (AFInAppEventType + 11) % 128;
            return;
        }
        int i10 = AFInAppEventParameterName + 25;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
        } else {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0040 A[PHI: r3
      0x0040: PHI (r3v3 com.appsflyer.PurchaseHandler) = (r3v2 com.appsflyer.PurchaseHandler), (r3v10 com.appsflyer.PurchaseHandler) binds: [B:8:0x003e, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler purchaseHandlerComponent4;
        int i10 = AFInAppEventParameterName + 101;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            getMediationNetwork(context);
            purchaseHandlerComponent4 = AFAdRevenueData().component4();
            String[] strArr = new String[0];
            strArr[0] = "purchases";
            if (purchaseHandlerComponent4.AFAdRevenueData(map, purchaseValidationCallback, strArr)) {
                AFe1cSDK aFe1cSDK = new AFe1cSDK(map, purchaseValidationCallback, purchaseHandlerComponent4.getCurrencyIso4217Code);
                AFe1lSDK aFe1lSDK = purchaseHandlerComponent4.getRevenue;
                aFe1lSDK.getRevenue.execute(aFe1lSDK.new AnonymousClass5(aFe1cSDK));
            }
        } else {
            getMediationNetwork(context);
            purchaseHandlerComponent4 = AFAdRevenueData().component4();
            if (purchaseHandlerComponent4.AFAdRevenueData(map, purchaseValidationCallback, "purchases")) {
                AFe1cSDK aFe1cSDK2 = new AFe1cSDK(map, purchaseValidationCallback, purchaseHandlerComponent4.getCurrencyIso4217Code);
                AFe1lSDK aFe1lSDK2 = purchaseHandlerComponent4.getRevenue;
                aFe1lSDK2.getRevenue.execute(aFe1lSDK2.new AnonymousClass5(aFe1cSDK2));
            }
        }
        int i11 = AFInAppEventParameterName + 27;
        AFInAppEventType = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler purchaseHandlerComponent4;
        int i10 = AFInAppEventParameterName + 43;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            getMediationNetwork(context);
            purchaseHandlerComponent4 = AFAdRevenueData().component4();
            String[] strArr = new String[0];
            strArr[1] = "subscriptions";
            if (purchaseHandlerComponent4.AFAdRevenueData(map, purchaseValidationCallback, strArr)) {
                AFe1hSDK aFe1hSDK = new AFe1hSDK(map, purchaseValidationCallback, purchaseHandlerComponent4.getCurrencyIso4217Code);
                AFe1lSDK aFe1lSDK = purchaseHandlerComponent4.getRevenue;
                aFe1lSDK.getRevenue.execute(aFe1lSDK.new AnonymousClass5(aFe1hSDK));
            }
        } else {
            getMediationNetwork(context);
            purchaseHandlerComponent4 = AFAdRevenueData().component4();
            if (purchaseHandlerComponent4.AFAdRevenueData(map, purchaseValidationCallback, "subscriptions")) {
                AFe1hSDK aFe1hSDK2 = new AFe1hSDK(map, purchaseValidationCallback, purchaseHandlerComponent4.getCurrencyIso4217Code);
                AFe1lSDK aFe1lSDK2 = purchaseHandlerComponent4.getRevenue;
                aFe1lSDK2.getRevenue.execute(aFe1lSDK2.new AnonymousClass5(aFe1hSDK2));
            }
        }
        AFInAppEventParameterName = (AFInAppEventType + 21) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x017d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:8:0x0046  */
    /* JADX WARN: Code duplicated, block: B:9:0x0064  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPushNotificationData(@androidx.annotation.p0 Activity activity) {
        long j10;
        long jLongValue;
        if (activity != null) {
            AFInAppEventType = (AFInAppEventParameterName + 119) % 128;
            if (activity.getIntent() != null) {
                AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
                String localClassName = activity.getLocalClassName();
                StringBuilder sb2 = new StringBuilder("activity_intent_");
                sb2.append(activity.getIntent().toString());
                aFd1pSDKCopy.getMediationNetwork("sendPushNotificationData", localClassName, sb2.toString());
            } else if (activity != null) {
                AFInAppEventType = (AFInAppEventParameterName + 65) % 128;
                AFAdRevenueData().copy().getMediationNetwork("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            } else {
                AFAdRevenueData().copy().getMediationNetwork("sendPushNotificationData", "activity_null");
            }
        } else if (activity != null) {
            AFInAppEventType = (AFInAppEventParameterName + 65) % 128;
            AFAdRevenueData().copy().getMediationNetwork("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            AFAdRevenueData().copy().getMediationNetwork("sendPushNotificationData", "activity_null");
        }
        AFc1kSDK aFc1kSDKAfInfoLog = AFAdRevenueData().afInfoLog();
        String mediationNetwork = getMediationNetwork(activity);
        aFc1kSDKAfInfoLog.getCurrencyIso4217Code = mediationNetwork;
        if (mediationNetwork != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.copydefault == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.copydefault = new ConcurrentHashMap();
                jLongValue = jCurrentTimeMillis;
                j10 = jLongValue;
            } else {
                try {
                    long j11 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    jLongValue = jCurrentTimeMillis;
                    for (Long l10 : this.copydefault.keySet()) {
                        try {
                            JSONObject jSONObject = new JSONObject(aFc1kSDKAfInfoLog.getCurrencyIso4217Code);
                            JSONObject jSONObject2 = new JSONObject(this.copydefault.get(l10));
                            j10 = jCurrentTimeMillis;
                            try {
                                if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                    StringBuilder sb3 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                    sb3.append(jSONObject2);
                                    sb3.append(", new: ");
                                    sb3.append(jSONObject);
                                    sb3.append(")");
                                    AFLogger.afInfoLog(sb3.toString());
                                    aFc1kSDKAfInfoLog.getCurrencyIso4217Code = null;
                                    return;
                                }
                                if (j10 - l10.longValue() > j11) {
                                    this.copydefault.remove(l10);
                                }
                                if (l10.longValue() <= jLongValue) {
                                    jLongValue = l10.longValue();
                                }
                                AFInAppEventType = (AFInAppEventParameterName + 83) % 128;
                                jCurrentTimeMillis = j10;
                            } catch (Throwable th2) {
                                th = th2;
                                StringBuilder sb4 = new StringBuilder("Error while handling push notification measurement: ");
                                sb4.append(th.getClass().getSimpleName());
                                AFLogger.afErrorLog(sb4.toString(), th);
                                if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                                    StringBuilder sb5 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                                    sb5.append(jLongValue);
                                    sb5.append(")");
                                    AFLogger.afInfoLog(sb5.toString());
                                    this.copydefault.remove(Long.valueOf(jLongValue));
                                }
                                this.copydefault.put(Long.valueOf(j10), aFc1kSDKAfInfoLog.getCurrencyIso4217Code);
                                start(activity);
                                AFInAppEventParameterName = (AFInAppEventType + 11) % 128;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j10 = jCurrentTimeMillis;
                        }
                    }
                    j10 = jCurrentTimeMillis;
                } catch (Throwable th4) {
                    th = th4;
                    j10 = jCurrentTimeMillis;
                    jLongValue = j10;
                }
            }
            if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                StringBuilder sb6 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb6.append(jLongValue);
                sb6.append(")");
                AFLogger.afInfoLog(sb6.toString());
                this.copydefault.remove(Long.valueOf(jLongValue));
            }
            this.copydefault.put(Long.valueOf(j10), aFc1kSDKAfInfoLog.getCurrencyIso4217Code);
            start(activity);
            AFInAppEventParameterName = (AFInAppEventType + 11) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, map}, -2145945282, 2145945283, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 13) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setAndroidIdData", str);
        AFAdRevenueData().afInfoLog().AFAdRevenueData = str;
        int i10 = AFInAppEventType + 41;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 38 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 53) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setAppId", str);
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.APP_ID, str}, -692563571, 692563575, (int) System.currentTimeMillis());
        AFInAppEventType = (AFInAppEventParameterName + 95) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0055  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        int i10 = AFInAppEventType + 15;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 == 0) {
            AFAdRevenueData().copy().getMediationNetwork("setAppInviteOneLink", str);
            AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
            if (str != null) {
                if (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
                }
            }
            getMonetizationNetwork(new Object[]{AppsFlyerProperties.ONELINK_ID, str}, -692563571, 692563575, (int) System.currentTimeMillis());
        }
        AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
        String[] strArr = new String[1];
        strArr[1] = str;
        aFd1pSDKCopy.getMediationNetwork("setAppInviteOneLink", strArr);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str != null) {
            if (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            }
        }
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.ONELINK_ID, str}, -692563571, 692563575, (int) System.currentTimeMillis());
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        AFInAppEventParameterName = (AFInAppEventType + 29) % 128;
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.ONELINK_ID, str}, -692563571, 692563575, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z10) {
        AFInAppEventParameterName = (AFInAppEventType + 99) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setCollectAndroidID", String.valueOf(z10));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z10)}, -692563571, 692563575, (int) System.currentTimeMillis());
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z10)}, -692563571, 692563575, (int) System.currentTimeMillis());
        int i10 = AFInAppEventType + 109;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 3 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z10) {
        AFInAppEventType = (AFInAppEventParameterName + 45) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setCollectIMEI", String.valueOf(z10));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z10)}, -692563571, 692563575, (int) System.currentTimeMillis());
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z10)}, -692563571, 692563575, (int) System.currentTimeMillis());
        int i10 = AFInAppEventType + me.relex.circleindicator.a.f332619e;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 95 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z10) {
        AFInAppEventType = (AFInAppEventParameterName + 125) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setCollectOaid", String.valueOf(z10));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z10)}, -692563571, 692563575, (int) System.currentTimeMillis());
        int i10 = AFInAppEventType + 85;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 31 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        AFInAppEventParameterName = (AFInAppEventType + 77) % 128;
        Objects.requireNonNull(appsFlyerConsent);
        AFAdRevenueData().afInfoLog().component2 = appsFlyerConsent;
        AFInAppEventType = (AFInAppEventParameterName + 45) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 73) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        AFInAppEventType = (AFInAppEventParameterName + 9) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        if (context != null) {
            if (!getMediationNetwork()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb2 = new StringBuilder("CustomerUserId set: ");
            sb2.append(str);
            sb2.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb2.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component2());
            getCurrencyIso4217Code(context, AFh1xSDK.setCustomerIdAndLogSession);
            AFAdRevenueData().registerClient().getMediationNetwork();
            if (referrer == null) {
                AFInAppEventType = (AFInAppEventParameterName + 35) % 128;
                referrer = "";
            }
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
                AFInAppEventType = (AFInAppEventParameterName + com.planner5d.library.engine.input.f.b.f160745y1) % 128;
            }
            getMonetizationNetwork(new Object[]{this, context, referrer}, 1659672083, -1659672066, System.identityHashCode(this));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 65) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.APP_USER_ID, str}, -692563571, 692563575, (int) System.currentTimeMillis());
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        AFInAppEventParameterName = (AFInAppEventType + 33) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z10) {
        AFLogger.LogLevel logLevel;
        AFInAppEventType = (AFInAppEventParameterName + 115) % 128;
        if (z10) {
            logLevel = AFLogger.LogLevel.DEBUG;
            AFInAppEventParameterName = (AFInAppEventType + 101) % 128;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z10) {
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(z10)}, 2015599714, -2015599705, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z10) {
        AFInAppEventType = (AFInAppEventParameterName + 61) % 128;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z10)));
        getCurrencyIso4217Code(AppsFlyerProperties.DISABLE_NETWORK_DATA, z10);
        AFInAppEventParameterName = (AFInAppEventType + 19) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i10 = AFInAppEventParameterName + 101;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
            String[] strArr = new String[0];
            strArr[0] = str;
            aFd1pSDKCopy.getMediationNetwork("setExtension", strArr);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i11 = AFInAppEventParameterName + 1;
        AFInAppEventType = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(@androidx.annotation.p0 String str, @NonNull String str2) {
        AFInAppEventType = (AFInAppEventParameterName + 13) % 128;
        if (AFk1ySDK.getCurrencyIso4217Code(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i10 = AFInAppEventType + 27;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        AFe1zSDK.getMediationNetwork(new AFe1vSDK(str != null ? str.trim() : "", str2.trim()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 37) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setImeiData", str);
        AFAdRevenueData().registerClient().getMediationNetwork(str);
        AFInAppEventType = (AFInAppEventParameterName + 125) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setInstallId(@NonNull String str) {
        AFAdRevenueData().copy().getMediationNetwork("setInstallId", new String[0]);
        if (!this.toString) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
            return;
        }
        if (!AFAdRevenueData().getRevenue().getMonetizationNetwork("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID", false)) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
            return;
        }
        if (str == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
            AFInAppEventParameterName = (AFInAppEventType + 95) % 128;
            return;
        }
        AFb1iSDK.getCurrencyIso4217Code(str, AFAdRevenueData().component2());
        int i10 = AFInAppEventType + 25;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z10) {
        int i10 = AFInAppEventParameterName + 31;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z10);
            aFd1pSDKCopy.getMediationNetwork("setIsUpdate", strArr);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("setIsUpdate", String.valueOf(z10));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z10);
        AFInAppEventType = (AFInAppEventParameterName + 51) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z10;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            z10 = true;
        } else {
            AFInAppEventType = (AFInAppEventParameterName + 51) % 128;
            z10 = false;
        }
        AFAdRevenueData().copy().getMediationNetwork("log", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z10) {
            AFAdRevenueData().v().component4();
            return;
        }
        int i10 = AFInAppEventParameterName + 121;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            AFAdRevenueData().v().getMonetizationNetwork();
        } else {
            AFAdRevenueData().v().getMonetizationNetwork();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i10) {
        int i11 = AFInAppEventParameterName + 5;
        AFInAppEventType = i11 % 128;
        if (i11 % 2 != 0) {
            this.component3 = TimeUnit.SECONDS.toMillis(i10);
        } else {
            this.component3 = TimeUnit.SECONDS.toMillis(i10);
            int i12 = 15 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i10 = AFInAppEventType + 85;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
            String[] strArr = new String[1];
            strArr[1] = str;
            aFd1pSDKCopy.getMediationNetwork("setOaidData", strArr);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("setOaidData", str);
        }
        AFb1jSDK.getMonetizationNetwork = str;
        AFInAppEventParameterName = (AFInAppEventType + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        String str;
        int i10 = AFInAppEventParameterName + 125;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 7 << 0;
            Object[] objArr = new Object[0];
            objArr[1] = Arrays.toString(strArr);
            str = String.format("setOneLinkCustomDomain %s", objArr);
        } else {
            str = String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr));
        }
        AFLogger.afDebugLog(str);
        AFAdRevenueData().d().component4 = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i10 = AFInAppEventParameterName + 81;
        int i11 = i10 % 128;
        AFInAppEventType = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        int i12 = i11 + 25;
        AFInAppEventParameterName = i12 % 128;
        if (i12 % 2 != 0) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), false);
        } else {
            String lowerCase2 = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase2);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase2)), true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, str, map}, 841587779, -841587759, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i10 = AFInAppEventParameterName + 113;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            AFAdRevenueData().afInfoLog().getMediationNetwork = AFj1cSDK.getMonetizationNetwork(str);
        } else {
            AFAdRevenueData().afInfoLog().getMediationNetwork = AFj1cSDK.getMonetizationNetwork(str);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        int i10 = AFInAppEventType + 71;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            Objects.requireNonNull(pluginInfo);
            AFAdRevenueData().unregisterClient().AFAdRevenueData(pluginInfo);
            int i11 = 39 / 0;
        } else {
            Objects.requireNonNull(pluginInfo);
            AFAdRevenueData().unregisterClient().AFAdRevenueData(pluginInfo);
        }
        int i12 = AFInAppEventParameterName + 95;
        AFInAppEventType = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 38 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if (str != null) {
                int i10 = AFInAppEventType + 3;
                AFInAppEventParameterName = i10 % 128;
                if (i10 % 2 != 0) {
                    jSONObject.put("pid", str);
                    try {
                        int i11 = 70 / 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    jSONObject.put("pid", str);
                }
            }
            if (str2 != null) {
                jSONObject.put("c", str2);
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        } catch (JSONException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
        }
        if (jSONObject.has("pid")) {
            AFInAppEventType = (AFInAppEventParameterName + 85) % 128;
            getMonetizationNetwork(new Object[]{"preInstallName", jSONObject.toString()}, -692563571, 692563575, (int) System.currentTimeMillis());
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        int i12 = AFInAppEventType + 5;
        AFInAppEventParameterName = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 19 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFInAppEventType = (AFInAppEventParameterName + 9) % 128;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFa1oSDK aFa1oSDKD = AFAdRevenueData().d();
        aFa1oSDKD.component2.clear();
        aFa1oSDKD.component2.addAll(Arrays.asList(strArr));
        AFInAppEventParameterName = (AFInAppEventType + 41) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        AFInAppEventType = (AFInAppEventParameterName + 9) % 128;
        setSharingFilterForPartners(strArr);
        int i10 = AFInAppEventParameterName + 9;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i10 = AFInAppEventType + 87;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            setSharingFilterForPartners("all");
        } else {
            setSharingFilterForPartners("all");
        }
        int i11 = AFInAppEventParameterName + 27;
        AFInAppEventType = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        AFAdRevenueData().afInfoLog().getRevenue = new AFb1uSDK(strArr);
        AFInAppEventParameterName = (AFInAppEventType + 77) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        getMonetizationNetwork(new Object[]{this, emailsCryptType, strArr}, -363126917, 363126927, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        AFInAppEventType = (AFInAppEventParameterName + 15) % 128;
        start(context, null);
        AFInAppEventType = (AFInAppEventParameterName + com.planner5d.library.engine.input.f.b.f160745y1) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z10, Context context) {
        AFc1qSDK aFc1qSDKComponent2;
        boolean z11;
        getMediationNetwork(context);
        final AFc1dSDK aFc1dSDKAFAdRevenueData = AFAdRevenueData();
        aFc1dSDKAFAdRevenueData.registerClient().getMediationNetwork(z10);
        aFc1dSDKAFAdRevenueData.getMonetizationNetwork().submit(new Runnable() { // from class: com.appsflyer.internal.g
            @Override // java.lang.Runnable
            public final void run() {
                AFa1tSDK.getRevenue(aFc1dSDKAFAdRevenueData);
            }
        });
        if (z10) {
            int i10 = AFInAppEventParameterName + 15;
            AFInAppEventType = i10 % 128;
            if (i10 % 2 == 0) {
                aFc1qSDKComponent2 = aFc1dSDKAFAdRevenueData.component2();
                z11 = false;
            } else {
                aFc1qSDKComponent2 = aFc1dSDKAFAdRevenueData.component2();
                z11 = true;
            }
            aFc1qSDKComponent2.getCurrencyIso4217Code("is_stop_tracking_used", z11);
        }
        AFInAppEventParameterName = (AFInAppEventType + 51) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        AFInAppEventParameterName = (AFInAppEventType + 47) % 128;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        AFInAppEventParameterName = (AFInAppEventType + 3) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        AFInAppEventParameterName = (AFInAppEventType + 79) % 128;
        AFAdRevenueData().copy().getMediationNetwork("unregisterConversionListener", new String[0]);
        this.getCurrencyIso4217Code = null;
        int i10 = AFInAppEventType + 75;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getMediationNetwork(context);
        AFg1ySDK aFg1ySDK = new AFg1ySDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFf1aSDK revenue = aFg1ySDK.getRevenue();
        if (revenue == null || !str.equals(revenue.getRevenue)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z10 = revenue == null || jCurrentTimeMillis - revenue.AFAdRevenueData > TimeUnit.SECONDS.toMillis(2L);
            AFf1aSDK aFf1aSDK = new AFf1aSDK(str, jCurrentTimeMillis, !z10);
            aFg1ySDK.AFAdRevenueData.getMediationNetwork("afUninstallToken", aFf1aSDK.getRevenue);
            aFg1ySDK.AFAdRevenueData.getMonetizationNetwork("afUninstallToken_received_time", aFf1aSDK.AFAdRevenueData);
            aFg1ySDK.AFAdRevenueData.getCurrencyIso4217Code("afUninstallToken_queued", aFf1aSDK.getMediationNetwork);
            if (z10) {
                AFc1dSDK aFc1dSDKAFAdRevenueData = ((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData();
                AFf1tSDK aFf1tSDK = new AFf1tSDK(str, aFc1dSDKAFAdRevenueData);
                AFe1lSDK aFe1lSDKCopydefault = aFc1dSDKAFAdRevenueData.copydefault();
                aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFf1tSDK));
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, @androidx.annotation.p0 Map<String, String> map, @androidx.annotation.p0 AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1lSDK aFe1lSDKCopydefault = this.copy.copydefault();
        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(new AFe1fSDK(this.copy, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        AFInAppEventType = (AFInAppEventParameterName + 65) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z10) {
        AFInAppEventParameterName = (AFInAppEventType + 1) % 128;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z10)), true);
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z10);
        AFInAppEventParameterName = (AFInAppEventType + 39) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFi1fSDK aFi1fSDK) {
        AFf1wSDK aFf1wSDK = new AFf1wSDK(aFi1fSDK, AFAdRevenueData().getRevenue(), AFAdRevenueData());
        AFe1lSDK aFe1lSDKCopydefault = AFAdRevenueData().copydefault();
        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFf1wSDK));
        int i10 = AFInAppEventType + com.rabbitmq.client.impl.k.b.p.f265340a;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 50 / 0;
        }
    }

    private static void a(int[] iArr, int i10, Object[] objArr) {
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AFKeystoreWrapper;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i11 = 0;
            while (i11 < length) {
                int i12 = ($11 + 113) % 128;
                $10 = i12;
                iArr3[i11] = (int) (((long) iArr2[i11]) ^ 3670241895213185600L);
                i11++;
                $11 = (i12 + 83) % 128;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AFKeystoreWrapper;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i13 = 0; i13 < length3; i13++) {
                iArr6[i13] = (int) (((long) iArr5[i13]) ^ 3670241895213185600L);
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1kSDK.getCurrencyIso4217Code = 0;
        $10 = ($11 + 21) % 128;
        while (true) {
            int i14 = aFk1kSDK.getCurrencyIso4217Code;
            if (i14 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i10);
                return;
            }
            int i15 = iArr[i14];
            char c10 = (char) (i15 >> 16);
            cArr[0] = c10;
            char c11 = (char) i15;
            cArr[1] = c11;
            char c12 = (char) (iArr[i14 + 1] >> 16);
            cArr[2] = c12;
            char c13 = (char) iArr[i14 + 1];
            cArr[3] = c13;
            aFk1kSDK.AFAdRevenueData = (c10 << 16) + c11;
            aFk1kSDK.getMonetizationNetwork = (c12 << 16) + c13;
            AFk1kSDK.getMediationNetwork(iArr4);
            for (int i16 = 0; i16 < 16; i16++) {
                $11 = ($10 + 47) % 128;
                int i17 = aFk1kSDK.AFAdRevenueData ^ iArr4[i16];
                aFk1kSDK.AFAdRevenueData = i17;
                int iAFAdRevenueData = AFk1kSDK.AFAdRevenueData(i17) ^ aFk1kSDK.getMonetizationNetwork;
                int i18 = aFk1kSDK.AFAdRevenueData;
                aFk1kSDK.AFAdRevenueData = iAFAdRevenueData;
                aFk1kSDK.getMonetizationNetwork = i18;
            }
            int i19 = aFk1kSDK.AFAdRevenueData;
            int i20 = aFk1kSDK.getMonetizationNetwork;
            aFk1kSDK.AFAdRevenueData = i20;
            aFk1kSDK.getMonetizationNetwork = i19;
            int i21 = i19 ^ iArr4[16];
            aFk1kSDK.getMonetizationNetwork = i21;
            int i22 = i20 ^ iArr4[17];
            aFk1kSDK.AFAdRevenueData = i22;
            cArr[0] = (char) (i22 >>> 16);
            cArr[1] = (char) i22;
            cArr[2] = (char) (i21 >>> 16);
            cArr[3] = (char) i21;
            AFk1kSDK.getMediationNetwork(iArr4);
            int i23 = aFk1kSDK.getCurrencyIso4217Code;
            cArr2[i23 * 2] = cArr[0];
            cArr2[(i23 * 2) + 1] = cArr[1];
            cArr2[(i23 * 2) + 2] = cArr[2];
            cArr2[(i23 * 2) + 3] = cArr[3];
            aFk1kSDK.getCurrencyIso4217Code = i23 + 2;
        }
    }

    public static String getRevenue() {
        AFInAppEventType = (AFInAppEventParameterName + 61) % 128;
        String monetizationNetwork = getMonetizationNetwork(AppsFlyerProperties.APP_USER_ID);
        AFInAppEventType = (AFInAppEventParameterName + 11) % 128;
        return monetizationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        getMonetizationNetwork(new Object[]{this, strArr}, 1505056603, -1505056581, System.identityHashCode(this));
    }

    private void getRevenue(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i10 = AFInAppEventParameterName + 113;
        int i11 = i10 % 128;
        AFInAppEventType = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (appsFlyerConversionListener == null) {
            AFInAppEventParameterName = (i11 + 125) % 128;
        } else {
            this.getCurrencyIso4217Code = appsFlyerConversionListener;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap map2 = map == null ? null : new HashMap(map);
        getMediationNetwork(context);
        AFh1fSDK aFh1fSDK = new AFh1fSDK();
        aFh1fSDK.areAllFieldsValid = str;
        aFh1fSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1cSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1fSDK.getMediationNetwork(mapSingletonMap);
        }
        aFh1fSDK.getMonetizationNetwork = map2;
        AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
        Map map5 = aFh1fSDK.getMonetizationNetwork;
        if (map5 == null) {
            map5 = new HashMap();
        }
        aFd1pSDKCopy.getMediationNetwork("logEvent", str, new JSONObject(map5).toString());
        if (str == null) {
            getCurrencyIso4217Code(context, AFh1xSDK.logEvent);
        }
        getMonetizationNetwork(aFh1fSDK, component1(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener) {
        getMonetizationNetwork(new Object[]{this, context, str, appsFlyerRequestListener}, -1542206359, 1542206364, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j10) {
        AFInAppEventType = (AFInAppEventParameterName + 7) % 128;
        AFAdRevenueData().d().getMonetizationNetwork = deepLinkListener;
        AFAdRevenueData().d().component3 = j10;
        AFInAppEventParameterName = (AFInAppEventType + 7) % 128;
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        AFInAppEventParameterName = (AFInAppEventType + 115) % 128;
        boolean zAFAdRevenueData = aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData();
        int i10 = AFInAppEventType + 9;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 == 0) {
            return Boolean.valueOf(zAFAdRevenueData);
        }
        int i11 = 9 / 0;
        return Boolean.valueOf(zAFAdRevenueData);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        getMonetizationNetwork(new Object[]{this, context, str}, -1758296594, 1758296610, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        getMonetizationNetwork(new Object[]{this, context, str, str2, str3, str4, str5, map}, 203099708, -203099705, System.identityHashCode(this));
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        Context context = (Context) objArr[0];
        AFInAppEventParameterName = (AFInAppEventType + 105) % 128;
        try {
            if (com.google.android.gms.common.f.x().j(context) == 0) {
                int i10 = AFInAppEventParameterName + 35;
                AFInAppEventType = i10 % 128;
                return i10 % 2 == 0 ? Boolean.FALSE : Boolean.TRUE;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th2);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return Boolean.TRUE;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e10);
            return Boolean.FALSE;
        }
    }

    private static void component4(Context context) {
        List listAsList;
        int i10 = AFInAppEventParameterName + 5;
        AFInAppEventType = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 13800).requestedPermissions);
                if (!listAsList.contains("android.permission.INTERNET")) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
            } else {
                listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                if (!listAsList.contains("android.permission.INTERNET")) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
            }
            if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                int i11 = AFInAppEventType + 23;
                AFInAppEventParameterName = i11 % 128;
                if (i11 % 2 != 0) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32 && !listAsList.contains("com.google.android.gms.permission.AD_ID")) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                AFInAppEventType = (AFInAppEventParameterName + 71) % 128;
            }
            AFInAppEventParameterName = (AFInAppEventType + 125) % 128;
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copydefault() {
        getMonetizationNetwork(new Object[]{this, new AFh1kSDK()}, 974724333, -974724320, System.identityHashCode(this));
        int i10 = AFInAppEventType + 71;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public static String getRevenue(SimpleDateFormat simpleDateFormat, long j10) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j10));
        int i10 = AFInAppEventParameterName + 61;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static void copy() {
        int i10 = AFInAppEventType + 55;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            throw null;
        }
    }

    private static String getMonetizationNetwork(String str) {
        AFInAppEventParameterName = (AFInAppEventType + com.rabbitmq.client.impl.k.b.p.f265340a) % 128;
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i10 = AFInAppEventType + 1;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    private void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        int i10 = AFInAppEventParameterName + 3;
        AFInAppEventType = i10 % 128;
        boolean z10 = false;
        if (i10 % 2 == 0) {
            int i11 = 19 / 0;
            if (aFh1rSDK.areAllFieldsValid == null) {
                z10 = true;
            }
        } else if (aFh1rSDK.areAllFieldsValid == null) {
            z10 = true;
        }
        if (getMediationNetwork()) {
            AFInAppEventParameterName = (AFInAppEventType + 87) % 128;
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z10) {
            if (!(!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true))) {
                if (component1()) {
                    int i12 = (AFInAppEventParameterName + me.relex.circleindicator.a.f332619e) % 128;
                    AFInAppEventType = i12;
                    AppsFlyerRequestListener appsFlyerRequestListener = aFh1rSDK.getCurrencyIso4217Code;
                    if (appsFlyerRequestListener != null) {
                        AFInAppEventParameterName = (i12 + 113) % 128;
                        appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        return;
                    }
                    return;
                }
            } else {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            this.component2 = System.currentTimeMillis();
            AFInAppEventType = (AFInAppEventParameterName + 101) % 128;
        }
        AFj1dSDK.getMediationNetwork(AFAdRevenueData().AFAdRevenueData(), new AFa1ySDK(aFh1rSDK), 0L, TimeUnit.MILLISECONDS);
    }

    private static void getMediationNetwork(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i10)));
                }
            } catch (JSONException e10) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e10);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (true) {
                if (!itKeys2.hasNext()) {
                    break loop2;
                }
                AFInAppEventParameterName = (AFInAppEventType + 45) % 128;
                if (str != null) {
                    break loop2;
                }
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i11 = 0;
                    while (i11 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i11) == ((Long) arrayList.get(0)).longValue() || jSONArray2.getLong(i11) == ((Long) arrayList.get(1)).longValue()) {
                            break;
                        }
                        AFInAppEventParameterName = (AFInAppEventType + 53) % 128;
                        if (jSONArray2.getLong(i11) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            break;
                        }
                        i11++;
                        AFInAppEventType = (AFInAppEventParameterName + 15) % 128;
                        str = next;
                    }
                } catch (JSONException e11) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e11);
                }
            }
        }
        if (str != null) {
            int i12 = AFInAppEventType + 115;
            AFInAppEventParameterName = i12 % 128;
            if (i12 % 2 != 0) {
                jSONObject.remove(str);
                int i13 = 31 / 0;
            } else {
                jSONObject.remove(str);
            }
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i10 = AFInAppEventParameterName + com.planner5d.library.engine.input.f.b.f160733u1;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (map != null) {
            aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            AFInAppEventParameterName = (AFInAppEventType + 45) % 128;
        }
        return null;
    }

    public static Map<String, Object> getRevenue(Map<String, Object> map) {
        Map<String, Object> map2;
        if (map.containsKey(io.sentry.protocol.j.b.f306355e)) {
            int i10 = AFInAppEventType + me.relex.circleindicator.a.f332619e;
            AFInAppEventParameterName = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            map2 = (Map) map.get(io.sentry.protocol.j.b.f306355e);
        } else {
            HashMap map3 = new HashMap();
            map.put(io.sentry.protocol.j.b.f306355e, map3);
            map2 = map3;
        }
        int i11 = AFInAppEventParameterName + 45;
        AFInAppEventType = i11 % 128;
        if (i11 % 2 != 0) {
            return map2;
        }
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int i10 = AFInAppEventParameterName + 1;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
            int i11 = 44 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
        }
        AFInAppEventType = (AFInAppEventParameterName + 81) % 128;
        return null;
    }

    @l1
    @androidx.annotation.p0
    private String getRevenue(Context context, String str) {
        int i10 = (AFInAppEventType + 15) % 128;
        AFInAppEventParameterName = i10;
        if (context == null) {
            AFInAppEventType = (i10 + 7) % 128;
            return null;
        }
        getMediationNetwork(context);
        String currencyIso4217Code = AFAdRevenueData().getRevenue().getCurrencyIso4217Code(str);
        int i11 = AFInAppEventType + 65;
        AFInAppEventParameterName = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 41 / 0;
        }
        return currencyIso4217Code;
    }

    static void areAllFieldsValid() {
        AFKeystoreWrapper = new int[]{1173848566, -581264425, 1049631762, -184971919, -1510845523, 293648529, -317712227, 1299495101, -345507000, 2098071530, -62356939, -1430410937, 823748430, 809610160, -1818352164, -849605125, 1727658104, 1621127117};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r4 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void getMonetizationNetwork(boolean r4) {
        /*
            r3 = this;
            r2 = 2
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r0 = r0 + 95
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r1
            r2 = 2
            int r0 = r0 % 2
            if (r0 != 0) goto L18
            r2 = 6
            r0 = 41
            int r0 = r0 / 0
            r2 = 6
            if (r4 != 0) goto L1a
            r2 = 4
            goto L29
        L18:
            if (r4 == 0) goto L29
        L1a:
            com.appsflyer.internal.AFc1dSDK r3 = r3.AFAdRevenueData()
            r2 = 6
            com.appsflyer.internal.AFg1bSDK r3 = r3.v()
            r2 = 1
            r3.getRevenue()
            r2 = 7
            return
        L29:
            r2 = 5
            com.appsflyer.internal.AFc1dSDK r3 = r3.AFAdRevenueData()
            r2 = 6
            com.appsflyer.internal.AFg1bSDK r3 = r3.v()
            r2 = 6
            r3.getCurrencyIso4217Code()
            int r3 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r3 = r3 + 43
            int r3 = r3 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getMonetizationNetwork(boolean):void");
    }

    private boolean component1() {
        return ((Boolean) getMonetizationNetwork(new Object[]{this}, -1610644480, 1610644503, System.identityHashCode(this))).booleanValue();
    }

    private static void getCurrencyIso4217Code(String str, boolean z10) {
        int i10 = AFInAppEventParameterName + 19;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, z10);
        } else {
            AppsFlyerProperties.getInstance().set(str, z10);
            throw null;
        }
    }

    public final AFc1qSDK getRevenue(Context context) {
        int i10 = AFInAppEventParameterName + 11;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            getMediationNetwork(context);
            AFc1qSDK aFc1qSDKComponent2 = AFAdRevenueData().component2();
            int i11 = AFInAppEventParameterName + 121;
            AFInAppEventType = i11 % 128;
            if (i11 % 2 != 0) {
                return aFc1qSDKComponent2;
            }
            throw null;
        }
        getMediationNetwork(context);
        AFAdRevenueData().component2();
        throw null;
    }

    private static boolean getCurrencyIso4217Code(String str) {
        int i10 = AFInAppEventParameterName + 35;
        AFInAppEventType = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = AppsFlyerProperties.getInstance().getBoolean(str, false);
        AFInAppEventType = (AFInAppEventParameterName + 5) % 128;
        return z10;
    }

    private void getCurrencyIso4217Code(Context context, AFh1xSDK aFh1xSDK) {
        getMediationNetwork(context);
        AFh1vSDK aFh1vSDKAreAllFieldsValid = AFAdRevenueData().areAllFieldsValid();
        AFh1tSDK revenue = AFh1tSDK.getRevenue(context);
        if (aFh1vSDKAreAllFieldsValid.getCurrencyIso4217Code()) {
            int i10 = AFInAppEventType + 5;
            AFInAppEventParameterName = i10 % 128;
            if (i10 % 2 == 0) {
                aFh1vSDKAreAllFieldsValid.AFAdRevenueData.put("api_name", aFh1xSDK.toString());
                aFh1vSDKAreAllFieldsValid.getMediationNetwork(revenue);
            } else {
                aFh1vSDKAreAllFieldsValid.AFAdRevenueData.put("api_name", aFh1xSDK.toString());
                aFh1vSDKAreAllFieldsValid.getMediationNetwork(revenue);
                throw null;
            }
        }
        aFh1vSDKAreAllFieldsValid.AFAdRevenueData();
        AFInAppEventParameterName = (AFInAppEventType + 19) % 128;
    }

    @e.a({"DiscouragedApi"})
    private static void getMonetizationNetwork(Context context) {
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (Build.VERSION.SDK_INT >= 31) {
                    AFInAppEventType = (AFInAppEventParameterName + 61) % 128;
                    if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) != 0) {
                        int i10 = AFInAppEventType + 119;
                        AFInAppEventParameterName = i10 % 128;
                        if (i10 % 2 != 0) {
                            AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", false);
                            return;
                        } else {
                            AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                            return;
                        }
                    }
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                    AFInAppEventParameterName = (AFInAppEventType + 79) % 128;
                    return;
                }
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                } else {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while checking BackupRules: ", th2);
        }
    }

    @m1
    private void component2() {
        int i10 = AFInAppEventType + 37;
        AFInAppEventParameterName = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                AFAdRevenueData().force();
                throw null;
            }
            final AFi1fSDK aFi1fSDKForce = AFAdRevenueData().force();
            if (aFi1fSDKForce != null) {
                AFInAppEventParameterName = (AFInAppEventType + 77) % 128;
                if (aFi1fSDKForce.getMediationNetwork()) {
                    aFi1fSDKForce.AFAdRevenueData(new AFi1cSDK() { // from class: com.appsflyer.internal.e
                        @Override // com.appsflyer.internal.AFi1cSDK
                        public final void onRequestFinished() {
                            this.f89695a.AFAdRevenueData(aFi1fSDKForce);
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th2);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th2)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:22:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:24:0x00dc  */
    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener;
        int i10;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        String str4 = (String) objArr[5];
        String str5 = (String) objArr[6];
        Map map = (Map) objArr[7];
        AFInAppEventParameterName = (AFInAppEventType + me.relex.circleindicator.a.f332619e) % 128;
        aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, map == null ? "" : map.toString());
        if (!aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PURCHASE_VALIDATION;
            StringBuilder sb2 = new StringBuilder("Validate in app called with parameters: ");
            sb2.append(str3);
            sb2.append(" ");
            sb2.append(str4);
            sb2.append(" ");
            sb2.append(str5);
            aFLogger.i(aFg1cSDK, sb2.toString());
        }
        if (str != null && str4 != null) {
            int i11 = AFInAppEventParameterName;
            AFInAppEventType = (i11 + 105) % 128;
            if (str2 != null) {
                AFInAppEventType = (i11 + 39) % 128;
                if (str5 != null && str3 != null) {
                    new Thread(new com.appsflyer.internal.AFa1ySDK(context.getApplicationContext(), aFa1tSDK.AFAdRevenueData().registerClient().getMediationNetwork(), str, str2, str3, str4, str5, map)).start();
                } else {
                    appsFlyerInAppPurchaseValidatorListener = AFAdRevenueData;
                    if (appsFlyerInAppPurchaseValidatorListener != null) {
                        appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                        i10 = AFInAppEventType + 91;
                        AFInAppEventParameterName = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i12 = 74 / 0;
                        }
                    }
                }
            } else {
                appsFlyerInAppPurchaseValidatorListener = AFAdRevenueData;
                if (appsFlyerInAppPurchaseValidatorListener != null) {
                    appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                    i10 = AFInAppEventType + 91;
                    AFInAppEventParameterName = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i13 = 74 / 0;
                    }
                }
            }
        } else {
            appsFlyerInAppPurchaseValidatorListener = AFAdRevenueData;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                i10 = AFInAppEventType + 91;
                AFInAppEventParameterName = i10 % 128;
                if (i10 % 2 != 0) {
                    int i14 = 74 / 0;
                }
            }
        }
        return null;
    }

    final void component4() {
        AFInAppEventType = (AFInAppEventParameterName + 123) % 128;
        if (AFe1bSDK.component3()) {
            int i10 = AFInAppEventType + 93;
            AFInAppEventParameterName = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 25 / 0;
                return;
            }
            return;
        }
        AFc1dSDK aFc1dSDKAFAdRevenueData = AFAdRevenueData();
        AFe1lSDK aFe1lSDKCopydefault = aFc1dSDKAFAdRevenueData.copydefault();
        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(new AFe1bSDK(aFc1dSDKAFAdRevenueData)));
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        String str = (String) objArr[0];
        try {
            if (new JSONObject(str).has("pid")) {
                AFInAppEventType = (AFInAppEventParameterName + com.planner5d.library.engine.input.f.b.f160745y1) % 128;
                getMonetizationNetwork(new Object[]{"preInstallName", str}, -692563571, 692563575, (int) System.currentTimeMillis());
                return null;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            int i10 = AFInAppEventType + 125;
            AFInAppEventParameterName = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        } catch (JSONException e10) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e10);
            return null;
        }
    }

    private static void getCurrencyIso4217Code(@NonNull AFh1rSDK aFh1rSDK, @androidx.annotation.p0 AFh1qSDK aFh1qSDK) {
        int i10 = (AFInAppEventType + 73) % 128;
        AFInAppEventParameterName = i10;
        if (aFh1qSDK != null) {
            int i11 = i10 + 79;
            AFInAppEventType = i11 % 128;
            if (i11 % 2 != 0) {
                aFh1rSDK.getMediationNetwork = aFh1qSDK.getCurrencyIso4217Code;
                aFh1rSDK.component4 = aFh1qSDK.getMediationNetwork;
            } else {
                aFh1rSDK.getMediationNetwork = aFh1qSDK.getCurrencyIso4217Code;
                aFh1rSDK.component4 = aFh1qSDK.getMediationNetwork;
                throw null;
            }
        }
    }

    public final void getMediationNetwork(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        AFInAppEventType = (AFInAppEventParameterName + 43) % 128;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strAFAdRevenueData = getRevenue(context).AFAdRevenueData("extraReferrers", (String) null);
            if (strAFAdRevenueData == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(strAFAdRevenueData);
                jSONArray = jSONObject2.has(str) ? new JSONArray((String) jSONObject2.get(str)) : new JSONArray();
                jSONObject = jSONObject2;
            }
            if (jSONArray.length() < 5) {
                int i10 = AFInAppEventType + 25;
                AFInAppEventParameterName = i10 % 128;
                if (i10 % 2 != 0) {
                    jSONArray.put(jCurrentTimeMillis);
                    int i11 = 87 / 0;
                } else {
                    jSONArray.put(jCurrentTimeMillis);
                }
            }
            if (jSONObject.length() >= 4) {
                getMediationNetwork(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            getRevenue(context).getMediationNetwork("extraReferrers", jSONObject.toString());
            AFInAppEventType = (AFInAppEventParameterName + 121) % 128;
        } catch (JSONException e10) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e10);
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Couldn't save referrer - ");
            sb2.append(str);
            sb2.append(": ");
            AFLogger.afErrorLog(sb2.toString(), th2);
        }
    }

    @l1
    final void getMonetizationNetwork(@NonNull AFh1rSDK aFh1rSDK, @androidx.annotation.p0 AFh1qSDK aFh1qSDK) {
        getCurrencyIso4217Code(aFh1rSDK, aFh1qSDK);
        if (AFAdRevenueData().registerClient().getMediationNetwork() == null) {
            AFInAppEventParameterName = (AFInAppEventType + 45) % 128;
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFh1rSDK.getCurrencyIso4217Code;
            if (appsFlyerRequestListener != null) {
                int i10 = AFInAppEventType + 105;
                AFInAppEventParameterName = i10 % 128;
                appsFlyerRequestListener.onError(i10 % 2 != 0 ? 108 : 41, "No dev key");
            }
            AFInAppEventParameterName = (AFInAppEventType + 11) % 128;
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component2());
        if (referrer == null) {
            referrer = "";
        } else {
            AFInAppEventType = (AFInAppEventParameterName + 9) % 128;
        }
        aFh1rSDK.component3 = referrer;
        AFAdRevenueData(aFh1rSDK);
    }

    class AFa1vSDK implements AFe1qSDK {
        AFa1vSDK() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit getRevenue() {
            AFa1tSDK aFa1tSDK = AFa1tSDK.this;
            AFa1tSDK.getMonetizationNetwork(new Object[]{aFa1tSDK, new AFh1kSDK()}, 974724333, -974724320, System.identityHashCode(aFa1tSDK));
            return Unit.f312394a;
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getCurrencyIso4217Code(AFe1sSDK<?> aFe1sSDK, AFe1rSDK aFe1rSDK) {
            JSONObject revenue;
            AFf1aSDK revenue2;
            if (aFe1sSDK instanceof AFf1rSDK) {
                AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1sSDK;
                boolean z10 = aFe1sSDK instanceof AFf1uSDK;
                if (z10 && getCurrencyIso4217Code()) {
                    AFf1uSDK aFf1uSDK = (AFf1uSDK) aFe1sSDK;
                    if (aFf1uSDK.getMediationNetwork == AFe1rSDK.SUCCESS || aFf1uSDK.getRevenue == 1) {
                        AFg1rSDK aFg1rSDK = new AFg1rSDK(aFf1uSDK, AFa1tSDK.this.AFAdRevenueData().component2());
                        AFe1lSDK aFe1lSDKCopydefault = AFa1tSDK.this.AFAdRevenueData().copydefault();
                        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFg1rSDK));
                    }
                }
                AFh1uSDK aFh1uSDKAfErrorLogForExcManagerOnly = AFa1tSDK.this.AFAdRevenueData().afErrorLogForExcManagerOnly();
                if (aFh1uSDKAfErrorLogForExcManagerOnly != null && z10) {
                    aFh1uSDKAfErrorLogForExcManagerOnly.getRevenue((AFf1uSDK) aFe1sSDK, new Function0() { // from class: com.appsflyer.internal.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.f89706a.getRevenue();
                        }
                    });
                }
                if (aFe1rSDK == AFe1rSDK.SUCCESS) {
                    AFa1tSDK aFa1tSDK = AFa1tSDK.this;
                    aFa1tSDK.getRevenue(aFa1tSDK.component1).getMediationNetwork("sentSuccessfully", z0.P);
                    if (!(aFe1sSDK instanceof AFf1tSDK) && (revenue2 = new AFg1ySDK(AFa1tSDK.this.component1).getRevenue()) != null && revenue2.getMediationNetwork) {
                        String str = revenue2.getRevenue;
                        AFLogger.INSTANCE.d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFc1dSDK aFc1dSDKAFAdRevenueData = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData();
                        AFf1tSDK aFf1tSDK = new AFf1tSDK(str, aFc1dSDKAFAdRevenueData);
                        AFe1lSDK aFe1lSDKCopydefault2 = aFc1dSDKAFAdRevenueData.copydefault();
                        aFe1lSDKCopydefault2.getRevenue.execute(aFe1lSDKCopydefault2.new AnonymousClass5(aFf1tSDK));
                    }
                    ResponseNetwork responseNetwork = ((AFe1dSDK) aFf1rSDK).component1;
                    if (responseNetwork != null && (revenue = AFa1qSDK.getRevenue((String) responseNetwork.getBody())) != null) {
                        AFa1tSDK.this.component4 = revenue.optBoolean("send_background", false);
                    }
                    if (z10) {
                        AFa1tSDK.this.getMediationNetwork = System.currentTimeMillis();
                    }
                }
            } else if ((aFe1sSDK instanceof AFg1rSDK) && aFe1rSDK != AFe1rSDK.SUCCESS) {
                AFg1pSDK aFg1pSDK = new AFg1pSDK(AFa1tSDK.this.AFAdRevenueData());
                AFe1lSDK aFe1lSDKCopydefault3 = AFa1tSDK.this.AFAdRevenueData().copydefault();
                aFe1lSDKCopydefault3.getRevenue.execute(aFe1lSDKCopydefault3.new AnonymousClass5(aFg1pSDK));
            }
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getMediationNetwork(AFe1sSDK<?> aFe1sSDK) {
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getMonetizationNetwork(AFe1sSDK<?> aFe1sSDK) {
            if (aFe1sSDK instanceof AFf1uSDK) {
                AFa1tSDK.this.AFAdRevenueData().areAllFieldsValid().getCurrencyIso4217Code(((AFf1rSDK) aFe1sSDK).component2.component2);
            }
        }

        private boolean getCurrencyIso4217Code() {
            return AFa1tSDK.this.getCurrencyIso4217Code != null;
        }
    }

    private static void AFAdRevenueData(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.SDK_LIFECYCLE;
        StringBuilder sb2 = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb2.append(str);
        sb2.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFg1cSDK, sb2.toString());
        int i10 = AFInAppEventType + 115;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private static void getRevenue(String str) {
        getMonetizationNetwork(new Object[]{str}, 998031041, -998031039, (int) System.currentTimeMillis());
    }

    final void getRevenue(AFh1rSDK aFh1rSDK) {
        getMonetizationNetwork(new Object[]{this, aFh1rSDK}, 974724333, -974724320, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    private void getCurrencyIso4217Code(Map<String, Object> map) {
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) && !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) && map.get("advertiserId") != null) {
            AFInAppEventParameterName = (AFInAppEventType + 41) % 128;
            try {
                if (AFk1ySDK.getMediationNetwork(AFAdRevenueData().afInfoLog().AFAdRevenueData)) {
                    int i10 = AFInAppEventType + 29;
                    AFInAppEventParameterName = i10 % 128;
                    if (i10 % 2 != 0) {
                        try {
                            int i11 = 63 / 0;
                            if (map.remove("android_id") != null) {
                                AFInAppEventParameterName = (AFInAppEventType + me.relex.circleindicator.a.f332619e) % 128;
                                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else if (map.remove("android_id") != null) {
                        AFInAppEventParameterName = (AFInAppEventType + me.relex.circleindicator.a.f332619e) % 128;
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                    }
                }
                if (!AFk1ySDK.getMediationNetwork(AFAdRevenueData().registerClient().getRevenue()) || map.remove("imei") == null) {
                    return;
                }
                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
            } catch (Exception e10) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e10);
            }
        }
    }

    public static String getMonetizationNetwork(AFc1qSDK aFc1qSDK, String str) {
        int i10 = AFInAppEventType + 99;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 == 0) {
            String strAFAdRevenueData = aFc1qSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
            if (strAFAdRevenueData != null) {
                return strAFAdRevenueData;
            }
            aFc1qSDK.getMediationNetwork("CACHED_CHANNEL", str);
            AFInAppEventType = (AFInAppEventParameterName + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
            return str;
        }
        aFc1qSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
        throw null;
    }

    private static int getMonetizationNetwork(AFc1qSDK aFc1qSDK, String str, boolean z10) {
        AFInAppEventType = (AFInAppEventParameterName + 35) % 128;
        int iAFAdRevenueData = aFc1qSDK.AFAdRevenueData(str, 0);
        if (z10) {
            iAFAdRevenueData++;
            aFc1qSDK.getMediationNetwork(str, iAFAdRevenueData);
        }
        int i10 = AFInAppEventParameterName + 61;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            return iAFAdRevenueData;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x045d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0477  */
    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i10, int i11, int i12) {
        Uri data;
        boolean z10;
        String strConcat;
        int i13 = (i10 * (-464)) + (i11 * (-929));
        int i14 = ~i10;
        int i15 = i11 | i12;
        int i16 = i13 + (((~i15) | i14) * (-465)) + ((i11 | (~(i12 | i14))) * 930) + ((i14 | i15) * 465);
        int i17 = 0;
        switch (i16) {
            case 1:
                return getMonetizationNetwork(objArr);
            case 2:
                return AFAdRevenueData(objArr);
            case 3:
                return getRevenue(objArr);
            case 4:
                return getCurrencyIso4217Code(objArr);
            case 5:
                return getMediationNetwork(objArr);
            case 6:
                AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
                Context context = (Context) objArr[1];
                Intent intent = (Intent) objArr[2];
                aFa1tSDK.getMediationNetwork(context);
                AFa1oSDK aFa1oSDKD = aFa1tSDK.AFAdRevenueData().d();
                AFc1qSDK aFc1qSDKComponent2 = aFa1tSDK.AFAdRevenueData().component2();
                if (intent != null) {
                    AFInAppEventType = (AFInAppEventParameterName + 1) % 128;
                    if (!"android.intent.action.VIEW".equals(intent.getAction())) {
                        data = null;
                    } else {
                        data = intent.getData();
                    }
                } else {
                    data = null;
                }
                if (data != null) {
                    AFInAppEventParameterName = (AFInAppEventType + 19) % 128;
                    z10 = data.toString().isEmpty() ? false : true;
                }
                if (aFc1qSDKComponent2.getMediationNetwork("ddl_sent", false)) {
                    AFInAppEventType = (AFInAppEventParameterName + 105) % 128;
                    if (!z10) {
                        aFa1oSDKD.AFAdRevenueData("No direct deep link", null);
                        return null;
                    }
                }
                aFa1oSDKD.e_(AFa1jSDK.getCurrencyIso4217Code(aFa1oSDKD.areAllFieldsValid.afVerboseLog()), intent, context);
                return null;
            case 7:
                return component4(objArr);
            case 8:
                return component1(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                return component2(objArr);
            case 11:
                AFa1tSDK aFa1tSDK2 = (AFa1tSDK) objArr[0];
                Context context2 = (Context) objArr[1];
                AFInAppEventType = (AFInAppEventParameterName + 95) % 128;
                aFa1tSDK2.getMediationNetwork(context2);
                String currencyIso4217Code = aFa1tSDK2.AFAdRevenueData().getRevenue().getCurrencyIso4217Code(context2);
                AFInAppEventType = (AFInAppEventParameterName + 123) % 128;
                return currencyIso4217Code;
            case 12:
                return component3(objArr);
            case 13:
                AFa1tSDK aFa1tSDK3 = (AFa1tSDK) objArr[0];
                AFh1rSDK aFh1rSDK = (AFh1rSDK) objArr[1];
                Context context3 = aFa1tSDK3.AFAdRevenueData().AFInAppEventType().getMonetizationNetwork;
                if (context3 == null) {
                    AFInAppEventType = (AFInAppEventParameterName + 125) % 128;
                    AFLogger.INSTANCE.d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
                    AFInAppEventParameterName = (AFInAppEventType + 67) % 128;
                    return null;
                }
                String mediationNetwork = aFa1tSDK3.AFAdRevenueData().registerClient().getMediationNetwork();
                AppsFlyerRequestListener appsFlyerRequestListener = aFh1rSDK.getCurrencyIso4217Code;
                if (mediationNetwork != null) {
                    AFInAppEventType = (AFInAppEventParameterName + 49) % 128;
                    if (mediationNetwork.length() != 0) {
                        AFc1qSDK revenue = aFa1tSDK3.getRevenue(context3);
                        AppsFlyerProperties.getInstance().saveProperties(revenue);
                        if (!aFa1tSDK3.AFAdRevenueData().registerClient().AFAdRevenueData()) {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                            StringBuilder sb2 = new StringBuilder("sendWithEvent from activity: ");
                            sb2.append(context3.getClass().getName());
                            aFLogger.i(aFg1cSDK, sb2.toString(), true);
                        }
                        boolean mediationNetwork2 = aFh1rSDK.getMediationNetwork();
                        Map<String, Object> mediationNetwork3 = aFa1tSDK3.getMediationNetwork(aFh1rSDK);
                        if (aFa1tSDK3.AFAdRevenueData().registerClient().AFAdRevenueData()) {
                            AFInAppEventType = (AFInAppEventParameterName + 7) % 128;
                            AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyerLib.sendWithEvent");
                        }
                        int iIntValue = ((Integer) getMonetizationNetwork(new Object[]{revenue, Boolean.FALSE}, -1175980247, 1175980268, (int) System.currentTimeMillis())).intValue();
                        aFa1tSDK3.getCurrencyIso4217Code(mediationNetwork3);
                        AFa1uSDK aFa1uSDK = new AFa1uSDK(aFa1tSDK3.AFAdRevenueData(), aFh1rSDK.getMediationNetwork(mediationNetwork3).AFAdRevenueData(iIntValue), aFa1tSDK3.AFAdRevenueData().e().getMonetizationNetwork());
                        if (mediationNetwork2) {
                            AFj1qSDK[] aFj1qSDKArrComponent3 = aFa1tSDK3.component3();
                            int length = aFj1qSDKArrComponent3.length;
                            int i18 = 0;
                            while (i17 < length) {
                                AFj1qSDK aFj1qSDK = aFj1qSDKArrComponent3[i17];
                                if (aFj1qSDK.component4 == AFj1qSDK.AFa1ySDK.STARTED) {
                                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                                    StringBuilder sb3 = new StringBuilder("Failed to get ");
                                    sb3.append(aFj1qSDK.component2);
                                    sb3.append(" referrer, wait ...");
                                    aFLogger2.d(aFg1cSDK2, sb3.toString());
                                    i18 = 1;
                                }
                                i17++;
                                AFInAppEventParameterName = (AFInAppEventType + 45) % 128;
                            }
                            if (!(!aFa1tSDK3.AFAdRevenueData().e().getCurrencyIso4217Code())) {
                                AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
                                i17 = 1;
                            } else {
                                i17 = i18;
                            }
                            if (aFa1tSDK3.AFAdRevenueData().registerClient().getMonetizationNetwork()) {
                                i17 = 1;
                            }
                        }
                        AFj1dSDK.getMediationNetwork(aFa1tSDK3.AFAdRevenueData().AFAdRevenueData(), aFa1uSDK, i17 != 0 ? 500L : 0L, TimeUnit.MILLISECONDS);
                        return null;
                    }
                }
                AFLogger aFLogger3 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK3 = AFg1cSDK.GENERAL;
                aFLogger3.i(aFg1cSDK3, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
                aFLogger3.i(aFg1cSDK3, "AppsFlyer will not track this event.", true);
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                return null;
            case 14:
                return copydefault(objArr);
            case 15:
                return equals(objArr);
            case 16:
                return toString(objArr);
            case 17:
                return hashCode(objArr);
            case 18:
                return copy(objArr);
            case 19:
                AFa1tSDK aFa1tSDK4 = (AFa1tSDK) objArr[0];
                int i19 = AFInAppEventType + 85;
                AFInAppEventParameterName = i19 % 128;
                if (i19 % 2 != 0) {
                    aFa1tSDK4.AFAdRevenueData().afInfoLog().component1 = false;
                } else {
                    aFa1tSDK4.AFAdRevenueData().afInfoLog().component1 = true;
                }
                return null;
            case 20:
                AFa1tSDK aFa1tSDK5 = (AFa1tSDK) objArr[0];
                String str = (String) objArr[1];
                Map map = (Map) objArr[2];
                AFc1kSDK aFc1kSDKAfInfoLog = aFa1tSDK5.AFAdRevenueData().afInfoLog();
                if (aFc1kSDKAfInfoLog.getMonetizationNetwork == null) {
                    aFc1kSDKAfInfoLog.getMonetizationNetwork = new AFb1qSDK();
                }
                AFb1qSDK aFb1qSDK = aFc1kSDKAfInfoLog.getMonetizationNetwork;
                if (str != null) {
                    AFInAppEventType = (AFInAppEventParameterName + 7) % 128;
                    if (!str.isEmpty()) {
                        if (map != null && !map.isEmpty()) {
                            StringBuilder sb4 = new StringBuilder("Setting partner data for ");
                            sb4.append(str);
                            sb4.append(": ");
                            sb4.append(map);
                            AFLogger.afDebugLog(sb4.toString());
                            int length2 = new JSONObject(map).toString().length();
                            if (length2 > 1000) {
                                AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                                HashMap map2 = new HashMap();
                                map2.put("error", "limit exceeded: ".concat(String.valueOf(length2)));
                                aFb1qSDK.AFAdRevenueData.put(str, map2);
                                return null;
                            }
                            aFb1qSDK.getCurrencyIso4217Code.put(str, map);
                            aFb1qSDK.AFAdRevenueData.remove(str);
                            return null;
                        }
                        if (aFb1qSDK.getCurrencyIso4217Code.remove(str) == null) {
                            strConcat = "Partner data is missing or `null`";
                        } else {
                            strConcat = "Cleared partner data for ".concat(str);
                            AFInAppEventType = (AFInAppEventParameterName + 101) % 128;
                        }
                        AFLogger.afWarnLog(strConcat);
                        return null;
                    }
                }
                AFLogger.afWarnLog("Partner ID is missing or `null`");
                return null;
            case 21:
                AFc1qSDK aFc1qSDK = (AFc1qSDK) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                AFInAppEventParameterName = (AFInAppEventType + 71) % 128;
                int monetizationNetwork = getMonetizationNetwork(aFc1qSDK, "appsFlyerCount", zBooleanValue);
                AFInAppEventParameterName = (AFInAppEventType + 115) % 128;
                return Integer.valueOf(monetizationNetwork);
            case 22:
                return AFLogger(objArr);
            case 23:
                AFa1tSDK aFa1tSDK6 = (AFa1tSDK) objArr[0];
                int i20 = AFInAppEventParameterName + 47;
                AFInAppEventType = i20 % 128;
                if (i20 % 2 != 0 ? aFa1tSDK6.component2 > 0 : aFa1tSDK6.component2 > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - aFa1tSDK6.component2;
                    Locale locale = Locale.US;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
                    String revenue2 = getRevenue(simpleDateFormat, aFa1tSDK6.component2);
                    String revenue3 = getRevenue(simpleDateFormat, aFa1tSDK6.getMediationNetwork);
                    if (jCurrentTimeMillis < aFa1tSDK6.component3 && !aFa1tSDK6.isStopped()) {
                        AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", revenue2, revenue3, Long.valueOf(jCurrentTimeMillis), Long.valueOf(aFa1tSDK6.component3)));
                        return Boolean.TRUE;
                    }
                    if (!aFa1tSDK6.isStopped()) {
                        AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", revenue2, revenue3, Long.valueOf(jCurrentTimeMillis)));
                    }
                } else if (!aFa1tSDK6.isStopped()) {
                    AFLogger.afInfoLog("Sending first launch for this session!");
                    AFInAppEventParameterName = (AFInAppEventType + 23) % 128;
                }
                return Boolean.FALSE;
            default:
                int i21 = (AFInAppEventParameterName + 69) % 128;
                AFInAppEventType = i21;
                AFa1tSDK aFa1tSDK7 = areAllFieldsValid;
                AFInAppEventParameterName = (i21 + 109) % 128;
                return aFa1tSDK7;
        }
    }

    public final boolean getMediationNetwork() {
        AFInAppEventType = (AFInAppEventParameterName + 47) % 128;
        if (!getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) {
            return false;
        }
        int i10 = AFInAppEventType + 69;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 == 0) {
            return getRevenue() == null;
        }
        getRevenue();
        throw null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        final AppsFlyerRequestListener appsFlyerRequestListener = (AppsFlyerRequestListener) objArr[3];
        if (aFa1tSDK.AFAdRevenueData().afDebugLog().getCurrencyIso4217Code()) {
            return null;
        }
        if (!aFa1tSDK.toString) {
            AFInAppEventParameterName = (AFInAppEventType + 33) % 128;
            AFAdRevenueData("start");
            if (str == null) {
                int i10 = AFInAppEventType + 19;
                AFInAppEventParameterName = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                return null;
            }
        }
        aFa1tSDK.getMediationNetwork(context);
        final AFh1vSDK aFh1vSDKAreAllFieldsValid = aFa1tSDK.AFAdRevenueData().areAllFieldsValid();
        aFh1vSDKAreAllFieldsValid.getMediationNetwork(AFh1tSDK.getRevenue(context));
        if (aFa1tSDK.component1 == null) {
            AFInAppEventType = (AFInAppEventParameterName + 23) % 128;
            Application applicationO_ = AFj1iSDK.O_(context);
            if (applicationO_ == null) {
                return null;
            }
            int i11 = AFInAppEventType + 119;
            AFInAppEventParameterName = i11 % 128;
            if (i11 % 2 != 0) {
                aFa1tSDK.component1 = applicationO_;
                throw null;
            }
            aFa1tSDK.component1 = applicationO_;
        }
        aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
        String str2 = getMonetizationNetwork;
        aFLogger.i(aFg1cSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.17.0", str2));
        StringBuilder sb2 = new StringBuilder("Build Number: ");
        sb2.append(str2);
        aFLogger.i(aFg1cSDK, sb2.toString());
        AppsFlyerProperties.getInstance().loadProperties(aFa1tSDK.AFAdRevenueData().component2());
        if (!TextUtils.isEmpty(str)) {
            AFInAppEventParameterName = (AFInAppEventType + 45) % 128;
            aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData(str);
            AFInAppEventParameterName = (AFInAppEventType + 109) % 128;
        } else if (TextUtils.isEmpty(aFa1tSDK.AFAdRevenueData().registerClient().getMediationNetwork())) {
            copy();
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
            }
            return null;
        }
        aFa1tSDK.AFAdRevenueData().component1().getCurrencyIso4217Code(aFa1tSDK.getMonetizationNetwork());
        aFa1tSDK.component4();
        getMonetizationNetwork(aFa1tSDK.component1.getBaseContext());
        aFa1tSDK.AFAdRevenueData().e().getRevenue();
        aFa1tSDK.copy.afDebugLog().AFAdRevenueData(context, new AFb1bSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFa1tSDK.1
            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getCurrencyIso4217Code() {
                Context context2 = AFa1tSDK.this.AFAdRevenueData().AFInAppEventType().getMonetizationNetwork;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1vSDK aFh1vSDK = aFh1vSDKAreAllFieldsValid;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = aFh1vSDK.component3;
                if (j10 != 0) {
                    long j11 = jCurrentTimeMillis - j10;
                    if (j11 > 0 && j11 < 1000) {
                        j11 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j11);
                    aFh1vSDK.toString = seconds;
                    aFh1vSDK.getCurrencyIso4217Code.getMonetizationNetwork("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFa1tSDK.this.AFAdRevenueData().afRDLog().AFAdRevenueData();
                AFd1pSDK aFd1pSDKCopy = AFa1tSDK.this.AFAdRevenueData().copy();
                if (aFd1pSDKCopy.component4()) {
                    aFd1pSDKCopy.getMediationNetwork();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        aFd1pSDKCopy.o_(context2.getPackageName(), context2.getPackageManager());
                    }
                    aFd1pSDKCopy.AFAdRevenueData();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1tSDK.this.AFAdRevenueData().equals().getRevenue();
                AFa1tSDK.this.AFAdRevenueData().afVerboseLog().getMonetizationNetwork();
                AFa1tSDK.this.AFAdRevenueData().getMediationNetwork().getRevenue();
                AFh1uSDK aFh1uSDKAfErrorLogForExcManagerOnly = AFa1tSDK.this.AFAdRevenueData().afErrorLogForExcManagerOnly();
                if (aFh1uSDKAfErrorLogForExcManagerOnly != null) {
                    aFh1uSDKAfErrorLogForExcManagerOnly.getMediationNetwork();
                }
            }

            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getRevenue(@NonNull AFh1qSDK aFh1qSDK) {
                Intent intent;
                aFh1vSDKAreAllFieldsValid.AFAdRevenueData();
                AFc1dSDK aFc1dSDKAFAdRevenueData = AFa1tSDK.this.AFAdRevenueData();
                aFc1dSDKAFAdRevenueData.component1().getCurrencyIso4217Code(AFa1tSDK.this.getMonetizationNetwork());
                AFa1tSDK.this.component4();
                int iAFAdRevenueData = aFc1dSDKAFAdRevenueData.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (iAFAdRevenueData < 2) {
                    AFa1tSDK.this.AFAdRevenueData().equals().getCurrencyIso4217Code();
                }
                AFh1iSDK aFh1iSDK = new AFh1iSDK();
                if (aFh1qSDK != null) {
                    AFa1tSDK.this.AFAdRevenueData().d().e_(AFa1jSDK.AFAdRevenueData(aFh1iSDK), aFh1qSDK.getRevenue, aFc1dSDKAFAdRevenueData.AFInAppEventType().getMonetizationNetwork);
                    AFh1uSDK aFh1uSDKAfErrorLogForExcManagerOnly = aFc1dSDKAFAdRevenueData.afErrorLogForExcManagerOnly();
                    if (aFh1uSDKAfErrorLogForExcManagerOnly != null && (intent = aFh1qSDK.getRevenue) != null) {
                        aFh1uSDKAfErrorLogForExcManagerOnly.u_(intent, AFa1tSDK.this.AFAdRevenueData().d());
                    }
                }
                AFa1tSDK aFa1tSDK2 = AFa1tSDK.this;
                aFh1iSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
                aFa1tSDK2.getMonetizationNetwork(aFh1iSDK, aFh1qSDK);
                AFa1tSDK.this.AFAdRevenueData().getMediationNetwork().getRevenue();
                AFa1tSDK.this.AFAdRevenueData().getMediationNetwork().AFAdRevenueData.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", false);
            }
        });
        int i12 = AFInAppEventParameterName + 105;
        AFInAppEventType = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static int getCurrencyIso4217Code(AFc1qSDK aFc1qSDK, boolean z10) {
        AFInAppEventType = (AFInAppEventParameterName + 125) % 128;
        int monetizationNetwork = getMonetizationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z10);
        int i10 = AFInAppEventParameterName + 123;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 != 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    public static boolean getCurrencyIso4217Code(Context context) {
        return ((Boolean) getMonetizationNetwork(new Object[]{context}, -1675611583, 1675611591, (int) System.currentTimeMillis())).booleanValue();
    }

    @l1
    private void getCurrencyIso4217Code(Context context, String str) {
        getMonetizationNetwork(new Object[]{this, context, str}, 1659672083, -1659672066, System.identityHashCode(this));
    }

    private void getCurrencyIso4217Code(Context context, String str, Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, context, str, map}, 1732368696, -1732368678, System.identityHashCode(this));
    }

    private static void getCurrencyIso4217Code(String str, String str2) {
        getMonetizationNetwork(new Object[]{str, str2}, -692563571, 692563575, (int) System.currentTimeMillis());
    }

    public static AFa1tSDK getCurrencyIso4217Code() {
        return (AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis());
    }

    @NonNull
    private AFj1qSDK[] component3() {
        int i10 = AFInAppEventType + 121;
        AFInAppEventParameterName = i10 % 128;
        int i11 = i10 % 2;
        AFj1sSDK aFj1sSDKAFLogger = AFAdRevenueData().AFLogger();
        if (i11 != 0) {
            aFj1sSDKAFLogger.getRevenue();
            throw null;
        }
        AFj1qSDK[] revenue = aFj1sSDKAFLogger.getRevenue();
        int i12 = AFInAppEventParameterName + 65;
        AFInAppEventType = i12 % 128;
        if (i12 % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    private void getMediationNetwork(String str) {
        AFh1rSDK aFh1rSDKAFAdRevenueData = new AFh1jSDK().AFAdRevenueData(AFAdRevenueData().getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0));
        aFh1rSDKAFAdRevenueData.component3 = str;
        if (str != null) {
            AFInAppEventType = (AFInAppEventParameterName + 31) % 128;
            int i10 = 6 | 5;
            if (str.length() > 5) {
                AFInAppEventParameterName = (AFInAppEventType + 59) % 128;
                if (AFAdRevenueData().AFLogger().getCurrencyIso4217Code(aFh1rSDKAFAdRevenueData)) {
                    AFj1dSDK.getMediationNetwork(AFAdRevenueData().AFAdRevenueData(), new AFa1ySDK(aFh1rSDKAFAdRevenueData), 5L, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @NonNull
    @m1
    final Map<String, Object> getMediationNetwork(AFh1rSDK aFh1rSDK) {
        String str;
        Context context = AFAdRevenueData().AFInAppEventType().getMonetizationNetwork;
        AFc1qSDK revenue = getRevenue(context);
        AFg1qSDK aFg1qSDKComponent3 = AFAdRevenueData().component3();
        boolean zAFAdRevenueData = AFAdRevenueData().registerClient().AFAdRevenueData();
        boolean mediationNetwork = aFh1rSDK.getMediationNetwork();
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a(new int[]{1293966833, -1332243105, 2001922811, -600378744, 548813369, -684723692}, 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (zAFAdRevenueData) {
                AFInAppEventParameterName = (AFInAppEventType + 83) % 128;
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb2 = new StringBuilder("******* sendTrackingWithEvent: ");
                if (!mediationNetwork) {
                    str = aFh1rSDK.areAllFieldsValid;
                } else {
                    AFInAppEventType = (AFInAppEventParameterName + 7) % 128;
                    str = "Launch";
                }
                sb2.append(str);
                aFLogger.i(aFg1cSDK, sb2.toString(), true);
            }
            component4(context);
            int iIntValue = ((Integer) getMonetizationNetwork(new Object[]{revenue, Boolean.valueOf(mediationNetwork)}, -1175980247, 1175980268, (int) System.currentTimeMillis())).intValue();
            int currencyIso4217Code = getCurrencyIso4217Code(revenue, aFh1rSDK.areAllFieldsValid != null);
            if (mediationNetwork) {
                int i10 = AFInAppEventType;
                AFInAppEventParameterName = (i10 + 69) % 128;
                if (iIntValue == 1) {
                    AFInAppEventParameterName = (i10 + 61) % 128;
                    AppsFlyerProperties.getInstance().getCurrencyIso4217Code = true;
                }
            }
            aFg1qSDKComponent3.getRevenue(map, iIntValue, currencyIso4217Code);
            return map;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Error while preparing to send event", th2, true, true, true);
            return map;
        }
    }

    private static String getMediationNetwork(Activity activity) {
        Intent intent;
        int i10 = AFInAppEventType + 37;
        AFInAppEventParameterName = i10 % 128;
        String string = null;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (activity != null && (intent = activity.getIntent()) != null) {
            AFInAppEventType = (AFInAppEventParameterName + 99) % 128;
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i11 = AFInAppEventType + 39;
                    AFInAppEventParameterName = i11 % 128;
                    if (i11 % 2 != 0) {
                        String string2 = extras.getString("af");
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            string = string2;
                            th = th2;
                            AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
                            return string;
                        }
                    }
                    string = extras.getString("af");
                    if (string != null) {
                        AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                        AFInAppEventType = (AFInAppEventParameterName + 29) % 128;
                    }
                }
                return string;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return string;
    }

    public static int getMonetizationNetwork(AFc1qSDK aFc1qSDK, boolean z10) {
        return ((Integer) getMonetizationNetwork(new Object[]{aFc1qSDK, Boolean.valueOf(z10)}, -1175980247, 1175980268, (int) System.currentTimeMillis())).intValue();
    }
}
