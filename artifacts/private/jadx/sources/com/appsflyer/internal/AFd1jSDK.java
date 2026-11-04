package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AFd1jSDK {
    private final int getRevenue;

    public AFd1jSDK(int i10) {
        this.getRevenue = i10;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:? A[SYNTHETIC] */
    @NonNull
    private static String getMediationNetwork(HttpURLConnection httpURLConnection) throws Throwable {
        InputStream errorStream;
        Throwable th2;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e10) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, e10.getMessage() != null ? e10.getMessage() : "", e10, false, false, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z10 = true;
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            String string = sb2.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return string;
                        }
                        if (!z10) {
                            sb2.append('\n');
                        }
                        sb2.append(line);
                        z10 = false;
                    } catch (Throwable th3) {
                        bufferedReader = bufferedReader2;
                        th2 = th3;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            throw th2;
                        }
                        bufferedReader.close();
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
                bufferedReader = null;
            }
        } catch (Throwable th5) {
            th2 = th5;
            bufferedReader = null;
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (bufferedReader != null) {
            throw th2;
        }
        bufferedReader.close();
        throw th2;
    }

    public final AFd1aSDK<String> getMonetizationNetwork(AFd1cSDK aFd1cSDK) throws IOException {
        Throwable th2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            byte[] revenue = aFd1cSDK.getRevenue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aFd1cSDK.getRevenue);
            sb2.append(":");
            sb2.append(aFd1cSDK.getMonetizationNetwork);
            StringBuilder sb3 = new StringBuilder(sb2.toString());
            byte[] revenue2 = aFd1cSDK.getRevenue();
            if (aFd1cSDK.getCurrencyIso4217Code() && revenue2 != null) {
                String str = aFd1cSDK.AFAdRevenueData() ? "<encrypted>" : new String(revenue2, Charset.defaultCharset());
                sb3.append("\n payload: ");
                sb3.append(str);
            }
            for (Map.Entry<String, String> entry : aFd1cSDK.AFAdRevenueData.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
            StringBuilder sb4 = new StringBuilder("[");
            sb4.append(aFd1cSDK.hashCode());
            sb4.append("] ");
            sb4.append((Object) sb3);
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, sb4.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(aFd1cSDK.getMonetizationNetwork).openConnection()));
            try {
                httpURLConnection2.setRequestMethod(aFd1cSDK.getRevenue);
                if (aFd1cSDK.getMonetizationNetwork()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1cSDK.component3()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                int i10 = this.getRevenue;
                int i11 = aFd1cSDK.component4;
                if (i11 != -1) {
                    i10 = i11;
                }
                httpURLConnection2.setConnectTimeout(i10);
                httpURLConnection2.setReadTimeout(i10);
                httpURLConnection2.addRequestProperty("Content-Type", aFd1cSDK.AFAdRevenueData() ? "application/octet-stream" : "application/json");
                for (Map.Entry<String, String> entry2 : aFd1cSDK.AFAdRevenueData.entrySet()) {
                    httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                }
                if (revenue != null) {
                    httpURLConnection2.setDoOutput(true);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(revenue.length);
                    httpURLConnection2.setRequestProperty("Content-Length", sb5.toString());
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            bufferedOutputStream2.write(revenue);
                            bufferedOutputStream2.close();
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                boolean z10 = httpURLConnection2.getResponseCode() / 100 == 2;
                String mediationNetwork = aFd1cSDK.getMediationNetwork() ? getMediationNetwork(httpURLConnection2) : "";
                AFd1hSDK aFd1hSDK = new AFd1hSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                StringBuilder sb6 = new StringBuilder("response code:");
                sb6.append(httpURLConnection2.getResponseCode());
                sb6.append(" ");
                sb6.append(httpURLConnection2.getResponseMessage());
                sb6.append("\n body:");
                sb6.append(mediationNetwork);
                sb6.append("\n took ");
                sb6.append(aFd1hSDK.getRevenue);
                sb6.append("ms");
                String string = sb6.toString();
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
                StringBuilder sb7 = new StringBuilder("[");
                sb7.append(aFd1cSDK.hashCode());
                sb7.append("] ");
                sb7.append(string);
                aFLogger.d(aFg1cSDK, sb7.toString());
                HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
                map.remove(null);
                AFd1aSDK<String> aFd1aSDK = new AFd1aSDK<>(mediationNetwork, httpURLConnection2.getResponseCode(), z10, map, aFd1hSDK);
                httpURLConnection2.disconnect();
                return aFd1aSDK;
            } catch (Throwable th5) {
                th2 = th5;
                httpURLConnection = httpURLConnection2;
                try {
                    AFd1hSDK aFd1hSDK2 = new AFd1hSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb8 = new StringBuilder("error: ");
                    sb8.append(th2);
                    sb8.append("\n took ");
                    sb8.append(aFd1hSDK2.getRevenue);
                    sb8.append("ms");
                    String string2 = sb8.toString();
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb9 = new StringBuilder("[");
                    sb9.append(aFd1cSDK.hashCode());
                    sb9.append("] ");
                    sb9.append(string2);
                    aFLogger2.e(aFg1cSDK2, sb9.toString(), th2, false, false, false);
                    throw new HttpException(th2, aFd1hSDK2);
                } catch (Throwable th6) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            th2 = th7;
        }
    }
}
