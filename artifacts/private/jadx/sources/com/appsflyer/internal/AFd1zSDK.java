package com.appsflyer.internal;

import androidx.annotation.m1;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMonitorHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonitorHttpRequest.kt\ncom/appsflyer/internal/components/monitorsdk/MonitorHttpRequest\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n215#2,2:135\n215#2,2:138\n1#3:137\n*S KotlinDebug\n*F\n+ 1 MonitorHttpRequest.kt\ncom/appsflyer/internal/components/monitorsdk/MonitorHttpRequest\n*L\n58#1:135,2\n104#1:138,2\n*E\n"})
public abstract class AFd1zSDK {
    public int AFAdRevenueData;

    @NotNull
    public byte[] getCurrencyIso4217Code;

    @Nullable
    public Map<String, String> getMonetizationNetwork;
    private final boolean getRevenue;

    public AFd1zSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getCurrencyIso4217Code = bArr;
        this.getMonetizationNetwork = map;
        this.AFAdRevenueData = i10;
        this.getRevenue = true;
    }

    private static String AFAdRevenueData(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            String message = th2.getMessage();
            AFg1gSDK.e$default(aFLogger, aFg1cSDK, message == null ? "" : message, th2, false, false, false, false, 96, null);
            errorStream = httpURLConnection.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        String strJoinToString$default = CollectionsKt.joinToString$default(kotlin.io.x.j(bufferedReader), null, null, null, 0, null, null, 63, null);
        bufferedReader.close();
        return strJoinToString$default == null ? "" : strJoinToString$default;
    }

    @oj.i(name = "getCurrencyIso4217Code")
    @NotNull
    public abstract String getCurrencyIso4217Code();

    @NotNull
    public abstract String getCurrencyIso4217Code(@NotNull String str);

    @oj.i(name = "getMediationNetwork")
    public boolean getMediationNetwork() {
        return this.getRevenue;
    }

    @m1
    public final boolean getMonetizationNetwork() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            String currencyIso4217Code = getCurrencyIso4217Code();
            Intrinsics.checkNotNullParameter(currencyIso4217Code, "");
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(currencyIso4217Code).openConnection());
            Intrinsics.checkNotNull(uRLConnection, "");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnection;
            try {
                boolean monetizationNetwork = getMonetizationNetwork(httpURLConnection2, jCurrentTimeMillis);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return monetizationNetwork;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                try {
                    String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage();
                    String currencyIso4217Code2 = getCurrencyIso4217Code("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + str);
                    if (getMediationNetwork()) {
                        AFLogger.afRDLog(currencyIso4217Code2);
                    } else {
                        AFLogger.afVerboseLog(currencyIso4217Code2);
                    }
                    if (httpURLConnection != null) {
                    }
                    return false;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @oj.i(name = "getRevenue")
    @NotNull
    public abstract AFd1gSDK getRevenue();

    private final boolean getMonetizationNetwork(HttpURLConnection httpURLConnection, long j10) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb2 = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb2.append("\n length: ");
        sb2.append(new String(this.getCurrencyIso4217Code, Charsets.UTF_8).length());
        Map<String, String> map = this.getMonetizationNetwork;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
        }
        String currencyIso4217Code = getCurrencyIso4217Code("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb2));
        if (getMediationNetwork()) {
            AFLogger.afRDLog(currencyIso4217Code);
        } else {
            AFLogger.afVerboseLog(currencyIso4217Code);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFAdRevenueData);
        httpURLConnection.setConnectTimeout(this.AFAdRevenueData);
        httpURLConnection.addRequestProperty("Content-Type", getRevenue().getRevenue);
        Map<String, String> map2 = this.getMonetizationNetwork;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getCurrencyIso4217Code.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.getCurrencyIso4217Code);
        bufferedOutputStream.close();
        String strAFAdRevenueData = AFAdRevenueData(httpURLConnection);
        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
        String str = "response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + strAFAdRevenueData + "\n\ttook " + jCurrentTimeMillis + "ms";
        String currencyIso4217Code2 = getCurrencyIso4217Code("HTTP: [" + httpURLConnection.hashCode() + "] " + str);
        if (getMediationNetwork()) {
            AFLogger.afRDLog(currencyIso4217Code2);
        } else {
            AFLogger.afVerboseLog(currencyIso4217Code2);
        }
        return AFd1tSDK.getRevenue(httpURLConnection);
    }
}
