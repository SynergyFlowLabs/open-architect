package com.android.volley.toolbox;

import androidx.annotation.l1;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.superwall.sdk.network.Api;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public class p extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f89592c = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f89593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f89594b;

    static class a extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HttpURLConnection f89595a;

        a(HttpURLConnection httpURLConnection) {
            super(p.k(httpURLConnection));
            this.f89595a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f89595a.disconnect();
        }
    }

    public interface b extends d0 {
    }

    public p() {
        this(null);
    }

    private void d(HttpURLConnection httpURLConnection, com.android.volley.s<?> sVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", sVar.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(i(sVar, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private void e(HttpURLConnection httpURLConnection, com.android.volley.s<?> sVar) throws com.android.volley.d, IOException {
        byte[] body = sVar.getBody();
        if (body != null) {
            d(httpURLConnection, sVar, body);
        }
    }

    @l1
    static List<com.android.volley.k> f(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.android.volley.k(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    private static boolean j(int i10, int i11) {
        if (i10 != 4) {
            return ((100 <= i11 && i11 < 200) || i11 == 204 || i11 == 304) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream k(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private HttpURLConnection l(URL url, com.android.volley.s<?> sVar) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection httpURLConnectionG = g(url);
        int timeoutMs = sVar.getTimeoutMs();
        httpURLConnectionG.setConnectTimeout(timeoutMs);
        httpURLConnectionG.setReadTimeout(timeoutMs);
        httpURLConnectionG.setUseCaches(false);
        httpURLConnectionG.setDoInput(true);
        if (Api.scheme.equals(url.getProtocol()) && (sSLSocketFactory = this.f89594b) != null) {
            ((HttpsURLConnection) httpURLConnectionG).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnectionG;
    }

    @Override // com.android.volley.toolbox.e
    public n b(com.android.volley.s<?> sVar, Map<String, String> map) throws com.android.volley.d, IOException {
        String url = sVar.getUrl();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(sVar.getHeaders());
        b bVar = this.f89593a;
        if (bVar != null) {
            String strA = bVar.a(url);
            if (strA == null) {
                throw new IOException("URL blocked by rewriter: " + url);
            }
            url = strA;
        }
        HttpURLConnection httpURLConnectionL = l(new URL(url), sVar);
        try {
            for (String str : map2.keySet()) {
                httpURLConnectionL.setRequestProperty(str, (String) map2.get(str));
            }
            m(httpURLConnectionL, sVar);
            int responseCode = httpURLConnectionL.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (j(sVar.getMethod(), responseCode)) {
                return new n(responseCode, f(httpURLConnectionL.getHeaderFields()), httpURLConnectionL.getContentLength(), h(sVar, httpURLConnectionL));
            }
            n nVar = new n(responseCode, f(httpURLConnectionL.getHeaderFields()));
            httpURLConnectionL.disconnect();
            return nVar;
        } catch (Throwable th2) {
            if (0 == 0) {
                httpURLConnectionL.disconnect();
            }
            throw th2;
        }
    }

    protected HttpURLConnection g(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    protected InputStream h(com.android.volley.s<?> sVar, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    protected OutputStream i(com.android.volley.s<?> sVar, HttpURLConnection httpURLConnection, int i10) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    void m(HttpURLConnection httpURLConnection, com.android.volley.s<?> sVar) throws com.android.volley.d, IOException {
        switch (sVar.getMethod()) {
            case -1:
                byte[] postBody = sVar.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    d(httpURLConnection, sVar, postBody);
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                e(httpURLConnection, sVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                e(httpURLConnection, sVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                e(httpURLConnection, sVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public p(b bVar) {
        this(bVar, null);
    }

    public p(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f89593a = bVar;
        this.f89594b = sSLSocketFactory;
    }
}
