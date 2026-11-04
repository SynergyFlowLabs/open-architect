package com.google.api.client.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 {
    private i0() {
    }

    public static KeyStore a() throws KeyStoreException {
        return KeyStore.getInstance(KeyStore.getDefaultType());
    }

    public static KeyStore b() throws KeyStoreException {
        return KeyStore.getInstance("JKS");
    }

    public static KeyStore c() throws KeyStoreException {
        return KeyStore.getInstance("PKCS12");
    }

    public static PrivateKey d(KeyStore keyStore, String str, String str2) throws GeneralSecurityException {
        return (PrivateKey) keyStore.getKey(str, str2.toCharArray());
    }

    public static KeyFactory e() throws NoSuchAlgorithmException {
        return KeyFactory.getInstance("RSA");
    }

    public static Signature f() throws NoSuchAlgorithmException {
        return Signature.getInstance("SHA1withRSA");
    }

    public static Signature g() throws NoSuchAlgorithmException {
        return Signature.getInstance(u5.c.f381190c);
    }

    public static CertificateFactory h() throws CertificateException {
        return CertificateFactory.getInstance("X.509");
    }

    public static void i(KeyStore keyStore, InputStream inputStream, String str) throws GeneralSecurityException, IOException {
        try {
            keyStore.load(inputStream, str.toCharArray());
        } finally {
            inputStream.close();
        }
    }

    public static void j(KeyStore keyStore, CertificateFactory certificateFactory, InputStream inputStream) throws GeneralSecurityException {
        Iterator<? extends Certificate> it = certificateFactory.generateCertificates(inputStream).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            keyStore.setCertificateEntry(String.valueOf(i10), it.next());
            i10++;
        }
    }

    public static PrivateKey k(KeyStore keyStore, InputStream inputStream, String str, String str2, String str3) throws GeneralSecurityException, IOException {
        i(keyStore, inputStream, str);
        return d(keyStore, str2, str3);
    }

    public static byte[] l(Signature signature, PrivateKey privateKey, byte[] bArr) throws SignatureException, InvalidKeyException {
        signature.initSign(privateKey);
        signature.update(bArr);
        return signature.sign();
    }

    public static X509Certificate m(Signature signature, X509TrustManager x509TrustManager, List<String> list, byte[] bArr, byte[] bArr2) throws SignatureException, InvalidKeyException {
        try {
            CertificateFactory certificateFactoryH = h();
            X509Certificate[] x509CertificateArr = new X509Certificate[list.size()];
            Iterator<String> it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                try {
                    Certificate certificateGenerateCertificate = certificateFactoryH.generateCertificate(new ByteArrayInputStream(e.a(it.next())));
                    if (!(certificateGenerateCertificate instanceof X509Certificate)) {
                        return null;
                    }
                    int i11 = i10 + 1;
                    x509CertificateArr[i10] = (X509Certificate) certificateGenerateCertificate;
                    i10 = i11;
                } catch (CertificateException unused) {
                    return null;
                }
            }
            x509TrustManager.checkServerTrusted(x509CertificateArr, "RSA");
            if (n(signature, x509CertificateArr[0].getPublicKey(), bArr, bArr2)) {
                return x509CertificateArr[0];
            }
        } catch (CertificateException unused2) {
        }
        return null;
    }

    public static boolean n(Signature signature, PublicKey publicKey, byte[] bArr, byte[] bArr2) throws SignatureException, InvalidKeyException {
        signature.initVerify(publicKey);
        signature.update(bArr2);
        try {
            return signature.verify(bArr);
        } catch (SignatureException unused) {
            return false;
        }
    }
}
