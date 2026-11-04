package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.devtodev.core.data.consts.RequestParams;
import com.facebook.internal.z0;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1tSDK extends AFf1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static int AFLogger;
    private final AFg1qSDK AFInAppEventType;
    private final AFc1pSDK copydefault;
    private final String equals;
    private final AFc1iSDK hashCode;
    private static char[] AFInAppEventParameterName = {10790, 10789, 10800, 10806, 10786, 10791, 10805, 10788, 10810};
    private static char registerClient = 8141;

    public AFf1tSDK(@NonNull String str, @NonNull AFc1dSDK aFc1dSDK) {
        super(new AFg1wSDK(), aFc1dSDK, str);
        this.copydefault = aFc1dSDK.getRevenue();
        this.hashCode = aFc1dSDK.AFInAppEventType();
        this.equals = str;
        this.AFInAppEventType = aFc1dSDK.component3();
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i10, int i11, int i12) {
        return getRevenue(objArr);
    }

    private static void a(byte b10, String str, int i10, Object[] objArr) {
        int i11;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        char[] cArr = AFInAppEventParameterName;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i12 = 0; i12 < length; i12++) {
                cArr2[i12] = (char) (((long) cArr[i12]) ^ (-374623853307093042L));
            }
            cArr = cArr2;
        }
        char c10 = (char) ((-374623853307093042L) ^ ((long) registerClient));
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i13 = $10 + 67;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                i11 = i10 + 123;
                cArr3[i11] = (char) (charArray[i11] - b10);
            } else {
                i11 = i10 - 1;
                cArr3[i11] = (char) (charArray[i11] - b10);
            }
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            aFk1mSDK.AFAdRevenueData = 0;
            $11 = ($10 + 113) % 128;
            while (true) {
                int i14 = aFk1mSDK.AFAdRevenueData;
                if (i14 >= i11) {
                    break;
                }
                char c11 = charArray[i14];
                aFk1mSDK.getMonetizationNetwork = c11;
                char c12 = charArray[i14 + 1];
                aFk1mSDK.getCurrencyIso4217Code = c12;
                if (c11 == c12) {
                    cArr3[i14] = (char) (c11 - b10);
                    cArr3[i14 + 1] = (char) (c12 - b10);
                } else {
                    int i15 = c11 / c10;
                    aFk1mSDK.getMediationNetwork = i15;
                    int i16 = c11 % c10;
                    aFk1mSDK.component1 = i16;
                    int i17 = c12 / c10;
                    aFk1mSDK.getRevenue = i17;
                    int i18 = c12 % c10;
                    aFk1mSDK.component2 = i18;
                    if (i16 == i18) {
                        $11 = ($10 + 83) % 128;
                        int i19 = ((i15 + c10) - 1) % c10;
                        aFk1mSDK.getMediationNetwork = i19;
                        int i20 = ((i17 + c10) - 1) % c10;
                        aFk1mSDK.getRevenue = i20;
                        cArr3[i14] = cArr[(i19 * c10) + i16];
                        cArr3[i14 + 1] = cArr[(i20 * c10) + i18];
                    } else if (i15 == i17) {
                        int i21 = ((i16 + c10) - 1) % c10;
                        aFk1mSDK.component1 = i21;
                        int i22 = ((i18 + c10) - 1) % c10;
                        aFk1mSDK.component2 = i22;
                        cArr3[i14] = cArr[(i15 * c10) + i21];
                        cArr3[i14 + 1] = cArr[(i17 * c10) + i22];
                        $11 = ($10 + 69) % 128;
                    } else {
                        cArr3[i14] = cArr[(i15 * c10) + i18];
                        cArr3[i14 + 1] = cArr[(i17 * c10) + i16];
                    }
                }
                aFk1mSDK.AFAdRevenueData = i14 + 2;
            }
        }
        $10 = ($11 + 33) % 128;
        int i23 = 0;
        while (i23 < i10) {
            int i24 = $11 + 67;
            $10 = i24 % 128;
            if (i24 % 2 != 0) {
                cArr3[i23] = (char) (cArr3[i23] ^ 31812);
                i23 += 84;
            } else {
                cArr3[i23] = (char) (cArr3[i23] ^ 13722);
                i23++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private void copy() {
        AFc1qSDK aFc1qSDK;
        boolean z10;
        int i10 = AFLogger + 101;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            aFc1qSDK = this.copy;
            z10 = false;
        } else {
            aFc1qSDK = this.copy;
            z10 = true;
        }
        aFc1qSDK.getCurrencyIso4217Code("sentRegisterRequestToAF", z10);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        AFLogger = (AFKeystoreWrapper + 81) % 128;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void component3(AFh1rSDK aFh1rSDK) {
        int i10 = AFKeystoreWrapper + com.rabbitmq.client.impl.k.b.p.f265340a;
        AFLogger = i10 % 128;
        if (i10 % 2 != 0) {
            this.copydefault.AFAdRevenueData();
            throw null;
        }
        String strAFAdRevenueData = this.copydefault.AFAdRevenueData();
        if (strAFAdRevenueData != null) {
            AFLogger = (AFKeystoreWrapper + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
            aFh1rSDK.getMediationNetwork("advertiserId", strAFAdRevenueData);
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        int i10 = AFKeystoreWrapper + 95;
        int i11 = i10 % 128;
        AFLogger = i11;
        boolean z10 = !(i10 % 2 == 0);
        int i12 = i11 + 73;
        AFKeystoreWrapper = i12 % 128;
        if (i12 % 2 != 0) {
            return z10;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        AFLogger = (AFKeystoreWrapper + 1) % 128;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void getMediationNetwork(AFh1rSDK aFh1rSDK) {
        AFKeystoreWrapper = (AFLogger + com.planner5d.library.engine.input.f.b.f160733u1) % 128;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void getMonetizationNetwork(AFh1rSDK aFh1rSDK) {
        int i10 = AFLogger + 21;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        super.getRevenue();
        ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
        if (responseNetwork != null) {
            AFKeystoreWrapper = (AFLogger + 11) % 128;
            if (responseNetwork.isSuccessful()) {
                int i10 = AFLogger + me.relex.circleindicator.a.f332619e;
                AFKeystoreWrapper = i10 % 128;
                if (i10 % 2 != 0) {
                    copy();
                } else {
                    copy();
                    throw null;
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        int i10 = AFKeystoreWrapper + 57;
        AFLogger = i10 % 128;
        if (i10 % 2 != 0) {
            super.AFAdRevenueData(aFh1rSDK);
            Context context = this.hashCode.getMonetizationNetwork;
            throw null;
        }
        super.AFAdRevenueData(aFh1rSDK);
        Context context2 = this.hashCode.getMonetizationNetwork;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis());
        if (context2 == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (aFa1tSDK.getMediationNetwork()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context2.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            aFh1rSDK.getMediationNetwork("app_version_code", Integer.toString(packageInfo.versionCode));
            aFh1rSDK.getMediationNetwork("app_version_name", packageInfo.versionName);
            aFh1rSDK.getMediationNetwork("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFh1rSDK.getMediationNetwork("installDate", AFa1tSDK.getRevenue(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
            AFKeystoreWrapper = (AFLogger + 37) % 128;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th2);
        }
        this.AFInAppEventType.AFAdRevenueData(aFh1rSDK.AFAdRevenueData);
        aFh1rSDK.AFAdRevenueData.remove("ivc");
        String revenue = AFa1tSDK.getRevenue();
        if (revenue != null) {
            aFh1rSDK.getMediationNetwork("appUserId", revenue);
        }
        try {
            aFh1rSDK.getMediationNetwork("model", Build.MODEL);
            Object[] objArr = new Object[1];
            a((byte) (124 - TextUtils.lastIndexOf("", org.locationtech.jts.geom.l.f338160j, 0)), "\u0006\u0003\u0007\u0006㙻", 5 - TextUtils.indexOf("", "", 0), objArr);
            aFh1rSDK.getMediationNetwork(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th3) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th3);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i11 = AFKeystoreWrapper + 75;
            AFLogger = i11 % 128;
            if (i11 % 2 != 0) {
                aFh1rSDK.getMediationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z0.P);
                int i12 = 86 / 0;
            } else {
                aFh1rSDK.getMediationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z0.P);
            }
        }
        AFb1mSDK aFb1mSDKK_ = AFb1jSDK.k_(context2.getContentResolver());
        if (aFb1mSDKK_ != null) {
            int i13 = AFLogger + 113;
            AFKeystoreWrapper = i13 % 128;
            if (i13 % 2 == 0) {
                aFh1rSDK.getMediationNetwork("amazon_aid", aFb1mSDKK_.getMonetizationNetwork);
                aFh1rSDK.getMediationNetwork("amazon_aid_limit", String.valueOf(aFb1mSDKK_.getMediationNetwork));
                throw null;
            }
            aFh1rSDK.getMediationNetwork("amazon_aid", aFb1mSDKK_.getMonetizationNetwork);
            aFh1rSDK.getMediationNetwork("amazon_aid_limit", String.valueOf(aFb1mSDKK_.getMediationNetwork));
        }
        aFh1rSDK.getMediationNetwork("devkey", ((AFe1dSDK) this).component3.getMediationNetwork());
        aFh1rSDK.getMediationNetwork(RequestParams.UID, AFb1iSDK.getRevenue(this.copydefault.getMonetizationNetwork));
        aFh1rSDK.getMediationNetwork("af_gcm_token", this.equals);
        aFh1rSDK.getMediationNetwork("launch_counter", Integer.toString(this.copy.AFAdRevenueData("appsFlyerCount", 0)));
        aFh1rSDK.getMediationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String strComponent2 = this.copydefault.component2();
        if (strComponent2 != null) {
            AFKeystoreWrapper = (AFLogger + 19) % 128;
            aFh1rSDK.getMediationNetwork(AppsFlyerProperties.CHANNEL, strComponent2);
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        int i10 = AFLogger + 53;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void getRevenue(AFh1rSDK aFh1rSDK) {
        AFAdRevenueData(new Object[]{this, aFh1rSDK}, 2011239149, -2011239149, System.identityHashCode(this));
    }
}
