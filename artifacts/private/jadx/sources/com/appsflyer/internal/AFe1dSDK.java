package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.m1;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AFe1dSDK<Result> extends AFe1sSDK<AFd1aSDK<Result>> {
    protected final AFd1pSDK areAllFieldsValid;

    @androidx.annotation.p0
    public AFd1aSDK<Result> component1;
    private AFc1vSDK component2;
    public final AFf1gSDK component3;
    protected final AFd1oSDK component4;

    @androidx.annotation.p0
    private String hashCode;

    private AFe1dSDK(@NonNull AFe1mSDK aFe1mSDK, @NonNull AFe1mSDK[] aFe1mSDKArr, @NonNull AFd1oSDK aFd1oSDK, @NonNull AFf1gSDK aFf1gSDK, @NonNull AFd1pSDK aFd1pSDK, @NonNull AFc1vSDK aFc1vSDK, @androidx.annotation.p0 String str) {
        super(aFe1mSDK, aFe1mSDKArr, str);
        this.component4 = aFd1oSDK;
        this.component3 = aFf1gSDK;
        this.areAllFieldsValid = aFd1pSDK;
        this.component2 = aFc1vSDK;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final void AFAdRevenueData() {
        String mediationNetwork;
        super.AFAdRevenueData();
        if (copydefault() && (mediationNetwork = this.component3.getMediationNetwork()) != null && !mediationNetwork.trim().isEmpty()) {
            AFd1nSDK<Result> revenue = getRevenue(mediationNetwork);
            if (revenue != null) {
                getCurrencyIso4217Code(revenue.getRevenue);
                return;
            }
            AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
        }
    }

    protected boolean a_() {
        return true;
    }

    @androidx.annotation.p0
    protected abstract AppsFlyerRequestListener component3();

    protected abstract boolean copydefault();

    @Override // com.appsflyer.internal.AFe1sSDK
    @NonNull
    @androidx.annotation.i
    public AFe1rSDK getCurrencyIso4217Code() throws Exception {
        if (a_() && this.component3.AFAdRevenueData()) {
            AppsFlyerRequestListener appsFlyerRequestListenerComponent3 = component3();
            if (appsFlyerRequestListenerComponent3 != null) {
                appsFlyerRequestListenerComponent3.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFe1oSDK();
        }
        String mediationNetwork = this.component3.getMediationNetwork();
        if (mediationNetwork != null && !mediationNetwork.trim().isEmpty()) {
            AFd1nSDK<Result> revenue = getRevenue(mediationNetwork);
            if (revenue == null) {
                AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
                return AFe1rSDK.FAILURE;
            }
            if (copydefault()) {
                getCurrencyIso4217Code(revenue.getRevenue);
            }
            AFd1aSDK<Result> mediationNetwork2 = revenue.getMediationNetwork();
            this.component1 = mediationNetwork2;
            this.areAllFieldsValid.getRevenue(revenue.getRevenue.getMonetizationNetwork, mediationNetwork2.getStatusCode(), mediationNetwork2.getBody().toString());
            AppsFlyerRequestListener appsFlyerRequestListenerComponent4 = component3();
            if (appsFlyerRequestListenerComponent4 != null) {
                if (mediationNetwork2.isSuccessful()) {
                    appsFlyerRequestListenerComponent4.onSuccess();
                } else {
                    StringBuilder sb2 = new StringBuilder("Status code failure ");
                    sb2.append(mediationNetwork2.getStatusCode());
                    appsFlyerRequestListenerComponent4.onError(50, sb2.toString());
                }
            }
            return mediationNetwork2.isSuccessful() ? AFe1rSDK.SUCCESS : AFe1rSDK.FAILURE;
        }
        AppsFlyerRequestListener appsFlyerRequestListenerComponent5 = component3();
        if (appsFlyerRequestListenerComponent5 != null) {
            appsFlyerRequestListenerComponent5.onError(41, "No dev key");
        }
        throw new AFe1nSDK();
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public boolean getMediationNetwork() {
        if (component4() instanceof AFe1oSDK) {
            return false;
        }
        if (this.getMediationNetwork == AFe1rSDK.TIMEOUT) {
            return true;
        }
        Throwable thComponent4 = component4();
        return (thComponent4 instanceof IOException) && !(thComponent4 instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public long getMonetizationNetwork() {
        return 60000L;
    }

    @m1
    @androidx.annotation.p0
    protected abstract AFd1nSDK<Result> getRevenue(@NonNull String str);

    @Override // com.appsflyer.internal.AFe1sSDK
    @androidx.annotation.i
    public void getRevenue() {
        String str;
        if (this.getMediationNetwork == AFe1rSDK.SUCCESS) {
            String str2 = this.hashCode;
            if (str2 != null) {
                this.component2.AFAdRevenueData(str2);
            }
        } else if (!getMediationNetwork() && (str = this.hashCode) != null) {
            this.component2.AFAdRevenueData(str);
        }
    }

    public AFe1dSDK(@NonNull AFe1mSDK aFe1mSDK, @NonNull AFe1mSDK[] aFe1mSDKArr, @NonNull AFc1dSDK aFc1dSDK, @androidx.annotation.p0 String str) {
        this(aFe1mSDK, aFe1mSDKArr, aFc1dSDK.getCurrencyIso4217Code(), aFc1dSDK.registerClient(), aFc1dSDK.copy(), aFc1dSDK.AFInAppEventParameterName(), str);
    }

    public AFe1dSDK(@NonNull AFe1mSDK aFe1mSDK, @NonNull AFe1mSDK[] aFe1mSDKArr, @NonNull AFc1dSDK aFc1dSDK, @androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        this(aFe1mSDK, aFe1mSDKArr, aFc1dSDK.getCurrencyIso4217Code(), aFc1dSDK.registerClient(), aFc1dSDK.copy(), aFc1dSDK.AFInAppEventParameterName(), str);
        this.hashCode = str2;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @androidx.annotation.i
    public final void getCurrencyIso4217Code(Throwable th2) {
        Throwable th3;
        boolean z10 = !(th2 instanceof HttpException);
        if (th2 instanceof AFe1oSDK) {
            th3 = th2;
            AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th3, true, false);
        } else {
            th3 = th2;
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            aFLogger.e(aFg1cSDK, "Error while sending request to server: ".concat(String.valueOf(th3)), th3, false, false, z10);
            aFLogger.w(aFg1cSDK, "Error while sending request to server: ".concat(String.valueOf(th3)));
        }
        AppsFlyerRequestListener appsFlyerRequestListenerComponent3 = component3();
        if (appsFlyerRequestListenerComponent3 != null) {
            String message = th3.getMessage();
            if (message == null) {
                message = "";
            }
            appsFlyerRequestListenerComponent3.onError(40, message);
        }
    }

    @l1
    @m1
    private void getCurrencyIso4217Code(AFd1cSDK aFd1cSDK) {
        String str = this.hashCode;
        this.hashCode = this.component2.AFAdRevenueData(new AFc1rSDK(aFd1cSDK.getMonetizationNetwork, aFd1cSDK.getRevenue(), "6.17.0", this.getMonetizationNetwork));
        if (str != null) {
            this.component2.AFAdRevenueData(str);
        }
    }
}
