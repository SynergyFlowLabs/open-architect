package com.google.api.client.util;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    static class a implements X509TrustManager {
        a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    static class b implements HostnameVerifier {
        b() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    private l0() {
    }

    public static KeyManagerFactory a() throws NoSuchAlgorithmException {
        return KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
    }

    public static TrustManagerFactory b() throws NoSuchAlgorithmException {
        return TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
    }

    public static KeyManagerFactory c() throws NoSuchAlgorithmException {
        return KeyManagerFactory.getInstance("PKIX");
    }

    public static TrustManagerFactory d() throws NoSuchAlgorithmException {
        return TrustManagerFactory.getInstance("PKIX");
    }

    public static SSLContext e() throws NoSuchAlgorithmException {
        return SSLContext.getInstance("SSL");
    }

    public static SSLContext f() throws NoSuchAlgorithmException {
        return SSLContext.getInstance("TLS");
    }

    public static SSLContext g(SSLContext sSLContext, KeyStore keyStore, TrustManagerFactory trustManagerFactory) throws GeneralSecurityException {
        trustManagerFactory.init(keyStore);
        sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
        return sSLContext;
    }

    @f
    public static HostnameVerifier h() {
        return new b();
    }

    @f
    public static SSLContext i() throws GeneralSecurityException {
        TrustManager[] trustManagerArr = {new a()};
        SSLContext sSLContextF = f();
        sSLContextF.init(null, trustManagerArr, null);
        return sSLContextF;
    }
}
