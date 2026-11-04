package com.android.volley.toolbox;

import com.google.firebase.perf.network.FirebasePerfHttpClient;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class l implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f89580b = "Content-Type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final HttpClient f89581a;

    public static final class a extends HttpEntityEnclosingRequestBase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f89582a = "PATCH";

        public a() {
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public String getMethod() {
            return "PATCH";
        }

        public a(URI uri) {
            setURI(uri);
        }

        public a(String str) {
            setURI(URI.create(str));
        }
    }

    public l(HttpClient httpClient) {
        this.f89581a = httpClient;
    }

    static HttpUriRequest b(com.android.volley.s<?> sVar, Map<String, String> map) throws com.android.volley.d {
        switch (sVar.getMethod()) {
            case -1:
                byte[] postBody = sVar.getPostBody();
                if (postBody == null) {
                    return new HttpGet(sVar.getUrl());
                }
                HttpPost httpPost = new HttpPost(sVar.getUrl());
                httpPost.addHeader("Content-Type", sVar.getPostBodyContentType());
                httpPost.setEntity(new ByteArrayEntity(postBody));
                return httpPost;
            case 0:
                return new HttpGet(sVar.getUrl());
            case 1:
                HttpPost httpPost2 = new HttpPost(sVar.getUrl());
                httpPost2.addHeader("Content-Type", sVar.getBodyContentType());
                e(httpPost2, sVar);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(sVar.getUrl());
                httpPut.addHeader("Content-Type", sVar.getBodyContentType());
                e(httpPut, sVar);
                return httpPut;
            case 3:
                return new HttpDelete(sVar.getUrl());
            case 4:
                return new HttpHead(sVar.getUrl());
            case 5:
                return new HttpOptions(sVar.getUrl());
            case 6:
                return new HttpTrace(sVar.getUrl());
            case 7:
                a aVar = new a(sVar.getUrl());
                aVar.addHeader("Content-Type", sVar.getBodyContentType());
                e(aVar, sVar);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    private static List<NameValuePair> c(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            arrayList.add(new BasicNameValuePair(str, map.get(str)));
        }
        return arrayList;
    }

    private static void e(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, com.android.volley.s<?> sVar) throws com.android.volley.d {
        byte[] body = sVar.getBody();
        if (body != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(body));
        }
    }

    private static void f(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    @Override // com.android.volley.toolbox.o
    public HttpResponse a(com.android.volley.s<?> sVar, Map<String, String> map) throws com.android.volley.d, IOException {
        HttpUriRequest httpUriRequestB = b(sVar, map);
        f(httpUriRequestB, map);
        f(httpUriRequestB, sVar.getHeaders());
        d(httpUriRequestB);
        HttpParams params = httpUriRequestB.getParams();
        int timeoutMs = sVar.getTimeoutMs();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, timeoutMs);
        return FirebasePerfHttpClient.execute(this.f89581a, httpUriRequestB);
    }

    protected void d(HttpUriRequest httpUriRequest) throws IOException {
    }
}
