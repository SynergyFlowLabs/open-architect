package com.google.api.client.http.javanet;

import com.google.api.client.http.b0;
import com.google.api.client.util.f;
import com.google.api.client.util.h0;
import com.google.api.client.util.i0;
import com.google.api.client.util.l0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f115649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f115650g = "com.google.api.client.should_use_proxy";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.api.client.http.javanet.a f115651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SSLSocketFactory f115652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HostnameVerifier f115653e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SSLSocketFactory f115654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HostnameVerifier f115655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Proxy f115656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.api.client.http.javanet.a f115657d;

        public e a() {
            if (System.getProperty(e.f115650g) != null) {
                g(e.i());
            }
            return this.f115656c == null ? new e(this.f115657d, this.f115654a, this.f115655b) : new e(this.f115656c, this.f115654a, this.f115655b);
        }

        @f
        public a b() throws GeneralSecurityException {
            this.f115655b = l0.h();
            this.f115654a = l0.i().getSocketFactory();
            return this;
        }

        public HostnameVerifier c() {
            return this.f115655b;
        }

        public SSLSocketFactory d() {
            return this.f115654a;
        }

        public a e(com.google.api.client.http.javanet.a aVar) {
            this.f115657d = aVar;
            return this;
        }

        public a f(HostnameVerifier hostnameVerifier) {
            this.f115655b = hostnameVerifier;
            return this;
        }

        public a g(Proxy proxy) {
            this.f115656c = proxy;
            return this;
        }

        public a h(SSLSocketFactory sSLSocketFactory) {
            this.f115654a = sSLSocketFactory;
            return this;
        }

        public a i(KeyStore keyStore) throws GeneralSecurityException {
            SSLContext sSLContextF = l0.f();
            l0.g(sSLContextF, keyStore, l0.d());
            return h(sSLContextF.getSocketFactory());
        }

        public a j(InputStream inputStream, String str) throws GeneralSecurityException, IOException {
            KeyStore keyStoreB = i0.b();
            i0.i(keyStoreB, inputStream, str);
            return i(keyStoreB);
        }

        public a k(InputStream inputStream) throws GeneralSecurityException, IOException {
            KeyStore keyStoreB = i0.b();
            keyStoreB.load(null, null);
            i0.j(keyStoreB, i0.h(), inputStream);
            return i(keyStoreB);
        }
    }

    static {
        String[] strArr = {"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};
        f115649f = strArr;
        Arrays.sort(strArr);
    }

    public e() {
        this((com.google.api.client.http.javanet.a) null, (SSLSocketFactory) null, (HostnameVerifier) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Proxy i() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))));
    }

    private com.google.api.client.http.javanet.a j(com.google.api.client.http.javanet.a aVar) {
        if (aVar == null) {
            return System.getProperty(f115650g) != null ? new b(i()) : new b();
        }
        return aVar;
    }

    @Override // com.google.api.client.http.b0
    public boolean f(String str) {
        return Arrays.binarySearch(f115649f, str) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.api.client.http.b0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public c b(String str, String str2) throws IOException {
        h0.c(f(str), "HTTP method %s not supported", str);
        HttpURLConnection httpURLConnectionA = this.f115651c.a(new URL(str2));
        httpURLConnectionA.setRequestMethod(str);
        if (httpURLConnectionA instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnectionA;
            HostnameVerifier hostnameVerifier = this.f115653e;
            if (hostnameVerifier != null) {
                httpsURLConnection.setHostnameVerifier(hostnameVerifier);
            }
            SSLSocketFactory sSLSocketFactory = this.f115652d;
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
            }
        }
        return new c(httpURLConnectionA);
    }

    e(Proxy proxy, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        this(new b(proxy), sSLSocketFactory, hostnameVerifier);
    }

    e(com.google.api.client.http.javanet.a aVar, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        this.f115651c = j(aVar);
        this.f115652d = sSLSocketFactory;
        this.f115653e = hostnameVerifier;
    }
}
