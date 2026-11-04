package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1qSDK extends AFe1sSDK<AFf1nSDK> {

    @androidx.annotation.p0
    public final AFf1mSDK areAllFieldsValid;

    @androidx.annotation.p0
    public AFf1nSDK component1;
    private final AFf1pSDK component2;
    public AFi1vSDK component3;
    private final AFc1pSDK component4;
    private final AFf1gSDK copy;
    private final AFf1lSDK copydefault;
    private final String equals;
    private final AFf1iSDK hashCode;
    private final AFd1oSDK toString;

    public AFf1qSDK(@NonNull AFf1pSDK aFf1pSDK, @NonNull AFc1pSDK aFc1pSDK, @NonNull AFf1gSDK aFf1gSDK, @NonNull AFf1lSDK aFf1lSDK, @NonNull AFd1oSDK aFd1oSDK, @NonNull AFf1iSDK aFf1iSDK, @NonNull String str, @androidx.annotation.p0 AFf1mSDK aFf1mSDK) {
        super(AFe1mSDK.RC_CDN, new AFe1mSDK[0], "UpdateRemoteConfiguration");
        this.component1 = null;
        this.component2 = aFf1pSDK;
        this.component4 = aFc1pSDK;
        this.copy = aFf1gSDK;
        this.copydefault = aFf1lSDK;
        this.toString = aFd1oSDK;
        this.hashCode = aFf1iSDK;
        this.equals = str;
        this.areAllFieldsValid = aFf1mSDK;
    }

    private void AFAdRevenueData(String str, long j10, AFi1ySDK aFi1ySDK, @androidx.annotation.p0 String str2, @androidx.annotation.p0 AFd1aSDK<AFi1wSDK> aFd1aSDK) {
        getRevenue(str, j10, aFd1aSDK, aFd1aSDK != null ? aFd1aSDK.getBody() : null, aFi1ySDK, str2 != null ? str2 : null, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
    /* JADX WARN: Code duplicated, block: B:17:0x0069 A[Catch: all -> 0x015a, IOException -> 0x015d, TryCatch #4 {IOException -> 0x015d, all -> 0x015a, blocks: (B:15:0x0061, B:17:0x0069, B:19:0x00aa, B:21:0x00c4, B:24:0x00d2, B:26:0x00de, B:32:0x0154, B:46:0x0175, B:48:0x0189, B:50:0x018f, B:52:0x01b1), top: B:74:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x00aa A[Catch: all -> 0x015a, IOException -> 0x015d, TryCatch #4 {IOException -> 0x015d, all -> 0x015a, blocks: (B:15:0x0061, B:17:0x0069, B:19:0x00aa, B:21:0x00c4, B:24:0x00d2, B:26:0x00de, B:32:0x0154, B:46:0x0175, B:48:0x0189, B:50:0x018f, B:52:0x01b1), top: B:74:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x018f A[Catch: all -> 0x015a, IOException -> 0x015d, TryCatch #4 {IOException -> 0x015d, all -> 0x015a, blocks: (B:15:0x0061, B:17:0x0069, B:19:0x00aa, B:21:0x00c4, B:24:0x00d2, B:26:0x00de, B:32:0x0154, B:46:0x0175, B:48:0x0189, B:50:0x018f, B:52:0x01b1), top: B:74:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01b1 A[Catch: all -> 0x015a, IOException -> 0x015d, TRY_LEAVE, TryCatch #4 {IOException -> 0x015d, all -> 0x015a, blocks: (B:15:0x0061, B:17:0x0069, B:19:0x00aa, B:21:0x00c4, B:24:0x00d2, B:26:0x00de, B:32:0x0154, B:46:0x0175, B:48:0x0189, B:50:0x018f, B:52:0x01b1), top: B:74:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private AFf1nSDK component1() throws InterruptedException, InterruptedIOException {
        String revenue;
        AFLogger aFLogger;
        AFg1cSDK aFg1cSDK;
        AFd1aSDK<AFi1wSDK> mediationNetwork;
        String mediationNetwork2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.equals;
        String mediationNetwork3 = this.copy.getMediationNetwork();
        if (mediationNetwork3 == null || mediationNetwork3.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else {
            if (str == null) {
                AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
            } else {
                revenue = AFj1cSDK.getRevenue(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str, this.component4.getRevenue.getMonetizationNetwork.getPackageName()}), mediationNetwork3);
            }
            if (revenue == null) {
                AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1nSDK.FAILURE;
            }
            try {
                if (this.hashCode.getMediationNetwork()) {
                    AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                    return AFf1nSDK.USE_CACHED;
                }
                aFLogger = AFLogger.INSTANCE;
                aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
                aFLogger.i(aFg1cSDK, "Cached config is expired, updating...");
                mediationNetwork = ((AFd1nSDK) AFd1oSDK.getCurrencyIso4217Code(new Object[]{this.toString, Boolean.valueOf(this.hashCode.getMonetizationNetwork()), Boolean.valueOf(this.hashCode.getRevenue()), revenue, 1500}, 662152322, -662152320, 1500)).getMediationNetwork();
                if (mediationNetwork.isSuccessful()) {
                    AFAdRevenueData(revenue, jCurrentTimeMillis, null, null, mediationNetwork);
                    StringBuilder sb2 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb2.append(mediationNetwork.getStatusCode());
                    aFLogger.w(aFg1cSDK, sb2.toString());
                    return AFf1nSDK.FAILURE;
                }
                AFi1wSDK body = mediationNetwork.getBody();
                String currencyIso4217Code = mediationNetwork.getCurrencyIso4217Code("x-amz-meta-af-auth-v1");
                String currencyIso4217Code2 = mediationNetwork.getCurrencyIso4217Code("CF-Cache-Status");
                mediationNetwork2 = this.copy.getMediationNetwork();
                if (mediationNetwork2 != null || mediationNetwork2.trim().length() == 0) {
                    aFLogger.w(aFg1cSDK, "Dev key is not set, SDK is not started.");
                    return AFf1nSDK.FAILURE;
                }
                AFi1uSDK revenue2 = this.component2.getRevenue(body, currencyIso4217Code, revenue, mediationNetwork2);
                if (!revenue2.getRevenue()) {
                    AFAdRevenueData(revenue, jCurrentTimeMillis, revenue2.AFAdRevenueData, currencyIso4217Code2, mediationNetwork);
                    aFLogger.w(aFg1cSDK, "fetched config is not valid (MITM?) refuse to use it.");
                    return AFf1nSDK.FAILURE;
                }
                long jAFAdRevenueData = this.hashCode.AFAdRevenueData();
                StringBuilder sb3 = new StringBuilder("using max-age fallback: ");
                sb3.append(jAFAdRevenueData);
                sb3.append(" seconds");
                aFLogger.v(aFg1cSDK, sb3.toString());
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                AFf1lSDK aFf1lSDK = this.copydefault;
                String str2 = revenue;
                try {
                    try {
                        aFf1lSDK.getMonetizationNetwork.getMediationNetwork("af_remote_config", Base64.encodeToString(body.getCurrencyIso4217Code.getBytes(Charset.defaultCharset()), 2));
                        aFf1lSDK.AFAdRevenueData = aFf1lSDK.getCurrencyIso4217Code;
                        aFf1lSDK.getMonetizationNetwork.getMonetizationNetwork("af_rc_timestamp", jCurrentTimeMillis2);
                        aFf1lSDK.getMonetizationNetwork.getMonetizationNetwork("af_rc_max_age", jAFAdRevenueData);
                        aFf1lSDK.getCurrencyIso4217Code = body;
                        aFf1lSDK.getMediationNetwork = jCurrentTimeMillis2;
                        aFf1lSDK.getRevenue = jAFAdRevenueData;
                        StringBuilder sb4 = new StringBuilder("Config successfully updated, timeToLive: ");
                        sb4.append(jAFAdRevenueData);
                        sb4.append(" seconds");
                        aFLogger.d(aFg1cSDK, sb4.toString());
                        AFAdRevenueData(str2, jCurrentTimeMillis, revenue2.AFAdRevenueData, currencyIso4217Code2, mediationNetwork);
                        return AFf1nSDK.SUCCESS;
                    } catch (IOException e10) {
                        e = e10;
                        revenue = str2;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        IOException iOException = e;
                        AFLogger aFLogger2 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK2 = AFg1cSDK.REMOTE_CONTROL;
                        StringBuilder sb5 = new StringBuilder("failed to fetch remote config: ");
                        sb5.append(iOException.getMessage());
                        aFLogger2.e(aFg1cSDK2, sb5.toString(), iOException, true, false, false);
                        getRevenue(revenue, jCurrentTimeMillis, iOException instanceof ParsingException ? ((ParsingException) iOException).getRawResponse() : null, null, null, null, iOException);
                        if (iOException.getCause() instanceof InterruptedIOException) {
                            throw ((InterruptedIOException) iOException.getCause());
                        }
                        return AFf1nSDK.FAILURE;
                    } catch (Throwable th2) {
                        th = th2;
                        revenue = str2;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        Throwable th3 = th;
                        AFLogger aFLogger3 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK3 = AFg1cSDK.REMOTE_CONTROL;
                        StringBuilder sb6 = new StringBuilder("failed to update remote config: ");
                        sb6.append(th3.getMessage());
                        aFLogger3.e(aFg1cSDK3, sb6.toString(), th3, true, false, false);
                        getRevenue(revenue, jCurrentTimeMillis, null, null, null, null, th3);
                        if (th3.getCause() instanceof InterruptedException) {
                            throw ((InterruptedException) th3.getCause());
                        }
                        return AFf1nSDK.FAILURE;
                    }
                } catch (IOException e11) {
                    e = e11;
                    revenue = str2;
                } catch (Throwable th4) {
                    th = th4;
                    revenue = str2;
                }
            } catch (IOException e12) {
                e = e12;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        revenue = null;
        if (revenue == null) {
            AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
            return AFf1nSDK.FAILURE;
        }
        if (this.hashCode.getMediationNetwork()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
            return AFf1nSDK.USE_CACHED;
        }
        aFLogger = AFLogger.INSTANCE;
        aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
        aFLogger.i(aFg1cSDK, "Cached config is expired, updating...");
        mediationNetwork = ((AFd1nSDK) AFd1oSDK.getCurrencyIso4217Code(new Object[]{this.toString, Boolean.valueOf(this.hashCode.getMonetizationNetwork()), Boolean.valueOf(this.hashCode.getRevenue()), revenue, 1500}, 662152322, -662152320, 1500)).getMediationNetwork();
        if (mediationNetwork.isSuccessful()) {
            AFAdRevenueData(revenue, jCurrentTimeMillis, null, null, mediationNetwork);
            StringBuilder sb7 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
            sb7.append(mediationNetwork.getStatusCode());
            aFLogger.w(aFg1cSDK, sb7.toString());
            return AFf1nSDK.FAILURE;
        }
        AFi1wSDK body2 = mediationNetwork.getBody();
        String currencyIso4217Code3 = mediationNetwork.getCurrencyIso4217Code("x-amz-meta-af-auth-v1");
        String currencyIso4217Code4 = mediationNetwork.getCurrencyIso4217Code("CF-Cache-Status");
        mediationNetwork2 = this.copy.getMediationNetwork();
        if (mediationNetwork2 != null) {
        }
        aFLogger.w(aFg1cSDK, "Dev key is not set, SDK is not started.");
        return AFf1nSDK.FAILURE;
    }

    private void getRevenue(String str, long j10, @androidx.annotation.p0 AFd1aSDK<?> aFd1aSDK, AFi1wSDK aFi1wSDK, AFi1ySDK aFi1ySDK, @androidx.annotation.p0 String str2, @androidx.annotation.p0 Throwable th2) {
        long j11;
        int statusCode;
        Throwable th3;
        if (aFd1aSDK != null) {
            j11 = aFd1aSDK.getRevenue.getRevenue;
            statusCode = aFd1aSDK.getStatusCode();
        } else {
            j11 = 0;
            statusCode = 0;
        }
        int i10 = statusCode;
        if (th2 instanceof HttpException) {
            Throwable cause = th2.getCause();
            j11 = ((HttpException) th2).getMetrics().getRevenue;
            th3 = cause;
        } else {
            th3 = th2;
        }
        this.component3 = new AFi1vSDK(aFi1wSDK != null ? aFi1wSDK.getRevenue : null, str, j11, System.currentTimeMillis() - j10, i10, aFi1ySDK, str2, th3);
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @NonNull
    public final AFe1rSDK getCurrencyIso4217Code() throws Exception {
        try {
            AFf1nSDK aFf1nSDKComponent1 = component1();
            this.component1 = aFf1nSDKComponent1;
            return aFf1nSDKComponent1 == AFf1nSDK.FAILURE ? AFe1rSDK.FAILURE : AFe1rSDK.SUCCESS;
        } catch (SocketTimeoutException unused) {
            this.component1 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        } catch (InterruptedIOException | InterruptedException e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e10, false, false, false);
            this.component1 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return 1500L;
    }
}
