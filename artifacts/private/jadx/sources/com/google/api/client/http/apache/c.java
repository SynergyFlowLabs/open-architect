package com.google.api.client.http.apache;

import com.google.api.client.http.b0;
import com.google.api.client.util.h0;
import com.google.api.client.util.i0;
import com.google.api.client.util.l0;
import com.superwall.sdk.network.Api;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import org.apache.http.HttpHost;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.conn.ProxySelectorRoutePlanner;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HttpClient f115574c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SSLSocketFactory f115575a = SSLSocketFactory.getSocketFactory();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HttpParams f115576b = c.k();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ProxySelector f115577c = ProxySelector.getDefault();

        public c a() {
            return new c(c.j(this.f115575a, this.f115576b, this.f115577c));
        }

        @com.google.api.client.util.f
        public a b() throws GeneralSecurityException {
            f fVar = new f(l0.i());
            this.f115575a = fVar;
            fVar.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            return this;
        }

        public HttpParams c() {
            return this.f115576b;
        }

        public SSLSocketFactory d() {
            return this.f115575a;
        }

        public a e(HttpHost httpHost) {
            ConnRouteParams.setDefaultProxy(this.f115576b, httpHost);
            if (httpHost != null) {
                this.f115577c = null;
            }
            return this;
        }

        public a f(ProxySelector proxySelector) {
            this.f115577c = proxySelector;
            if (proxySelector != null) {
                ConnRouteParams.setDefaultProxy(this.f115576b, null);
            }
            return this;
        }

        public a g(SSLSocketFactory sSLSocketFactory) {
            this.f115575a = (SSLSocketFactory) h0.d(sSLSocketFactory);
            return this;
        }

        public a h(KeyStore keyStore) throws GeneralSecurityException {
            SSLContext sSLContextF = l0.f();
            l0.g(sSLContextF, keyStore, l0.d());
            return g(new f(sSLContextF));
        }

        public a i(InputStream inputStream, String str) throws GeneralSecurityException, IOException {
            KeyStore keyStoreB = i0.b();
            i0.i(keyStoreB, inputStream, str);
            return h(keyStoreB);
        }

        public a j(InputStream inputStream) throws GeneralSecurityException, IOException {
            KeyStore keyStoreB = i0.b();
            keyStoreB.load(null, null);
            i0.j(keyStoreB, i0.h(), inputStream);
            return h(keyStoreB);
        }
    }

    public c() {
        this(i());
    }

    public static DefaultHttpClient i() {
        return j(SSLSocketFactory.getSocketFactory(), k(), ProxySelector.getDefault());
    }

    static DefaultHttpClient j(SSLSocketFactory sSLSocketFactory, HttpParams httpParams, ProxySelector proxySelector) {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme(Api.scheme, sSLSocketFactory, 443));
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(httpParams, schemeRegistry), httpParams);
        defaultHttpClient.setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(0, false));
        if (proxySelector != null) {
            defaultHttpClient.setRoutePlanner(new ProxySelectorRoutePlanner(schemeRegistry, proxySelector));
        }
        return defaultHttpClient;
    }

    static HttpParams k() {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 200);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(20));
        return basicHttpParams;
    }

    @Override // com.google.api.client.http.b0
    public void e() {
        this.f115574c.getConnectionManager().shutdown();
    }

    @Override // com.google.api.client.http.b0
    public boolean f(String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.api.client.http.b0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.google.api.client.http.apache.a b(String str, String str2) {
        HttpRequestBase httpOptions;
        if (str.equals("DELETE")) {
            httpOptions = new HttpDelete(str2);
        } else if (str.equals("GET")) {
            httpOptions = new HttpGet(str2);
        } else if (str.equals("HEAD")) {
            httpOptions = new HttpHead(str2);
        } else if (str.equals("POST")) {
            httpOptions = new HttpPost(str2);
        } else if (str.equals("PUT")) {
            httpOptions = new HttpPut(str2);
        } else if (str.equals("TRACE")) {
            httpOptions = new HttpTrace(str2);
        } else {
            httpOptions = str.equals("OPTIONS") ? new HttpOptions(str2) : new e(str, str2);
        }
        return new com.google.api.client.http.apache.a(this.f115574c, httpOptions);
    }

    public HttpClient h() {
        return this.f115574c;
    }

    public c(HttpClient httpClient) {
        this.f115574c = httpClient;
        HttpParams params = httpClient.getParams();
        params = params == null ? i().getParams() : params;
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        params.setBooleanParameter("http.protocol.handle-redirects", false);
    }
}
