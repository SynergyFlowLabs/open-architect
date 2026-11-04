package f8;

import com.google.firebase.crashlytics.internal.concurrency.n;
import com.google.firebase.crashlytics.internal.g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f275091d = "GET";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f275092e = 10000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f275093f = 8192;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f275094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f275095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f275096c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.f275094a = str;
        this.f275095b = map;
    }

    private String a(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb2.append(next.getKey());
        sb2.append("=");
        sb2.append(next.getValue() != null ? URLEncoder.encode(next.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb2.append("&");
            sb2.append(next2.getKey());
            sb2.append("=");
            sb2.append(next2.getValue() != null ? URLEncoder.encode(next2.getValue(), "UTF-8") : "");
        }
        return sb2.toString();
    }

    private String b(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String strA = a(map);
        if (strA.isEmpty()) {
            return str;
        }
        if (!str.contains(com.planner5d.library.model.payments.a.f222474i)) {
            return str + com.planner5d.library.model.payments.a.f222474i + strA;
        }
        if (!str.endsWith("&")) {
            strA = "&" + strA;
        }
        return str + strA;
    }

    private String f(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = bufferedReader.read(cArr);
            if (i10 == -1) {
                return sb2.toString();
            }
            sb2.append(cArr, 0, i10);
        }
    }

    public c c() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        n.d();
        InputStream inputStream = null;
        String strF = null;
        inputStream = null;
        try {
            String strB = b(this.f275094a, this.f275095b);
            g.f().k("GET Request URL: " + strB);
            httpsURLConnection = (HttpsURLConnection) new URL(strB).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f275096c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strF = f(inputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, strF);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    public a d(String str, String str2) {
        this.f275096c.put(str, str2);
        return this;
    }

    public a e(Map.Entry<String, String> entry) {
        return d(entry.getKey(), entry.getValue());
    }
}
