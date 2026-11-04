package com.rabbitmq.client;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes13.dex */
public class h2 implements X509TrustManager {
    public h2() {
        org.slf4j.e.k(h2.class).m0("SECURITY ALERT: this trust manager trusts every certificate, effectively disabling peer verification. This is convenient for local development but offers no protection against man-in-the-middle attacks. Please see https://www.rabbitmq.com/ssl.html to learn more about peer certificate verification.");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
