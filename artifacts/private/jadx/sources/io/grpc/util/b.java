package io.grpc.util;

import io.grpc.e0;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;

/* JADX INFO: loaded from: classes13.dex */
@zl.a
@e0("https://github.com/grpc/grpc-java/issues/8024")
public final class b extends X509ExtendedTrustManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f291009d = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f291010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f291011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile X509ExtendedTrustManager f291012c;

    class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScheduledFuture f291013a;

        a(ScheduledFuture scheduledFuture) {
            this.f291013a = scheduledFuture;
        }

        @Override // io.grpc.util.b.c, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f291013a.cancel(false);
        }
    }

    /* JADX INFO: renamed from: io.grpc.util.b$b, reason: collision with other inner class name */
    public static final class C1991b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f291015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f291016b;

        /* synthetic */ C1991b(a aVar) {
            this();
        }

        public b a() throws CertificateException {
            return new b(this.f291015a, this.f291016b, null);
        }

        public C1991b b(e eVar) {
            this.f291016b = eVar;
            return this;
        }

        public C1991b c(f fVar) {
            this.f291015a = fVar;
            return this;
        }

        private C1991b() {
            this.f291015a = f.CERTIFICATE_AND_HOST_NAME_VERIFICATION;
        }
    }

    public interface c extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();
    }

    private class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        File f291017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f291018b = 0;

        public d(File file) {
            this.f291017a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f291018b = b.this.f(this.f291017a, this.f291018b);
            } catch (IOException | GeneralSecurityException e10) {
                b.f291009d.log(Level.SEVERE, "Failed refreshing trust CAs from file. Using previous CAs", e10);
            }
        }
    }

    public interface e {
        void a(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException;

        void b(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException;
    }

    public enum f {
        CERTIFICATE_AND_HOST_NAME_VERIFICATION,
        CERTIFICATE_ONLY_VERIFICATION,
        INSECURELY_SKIP_ALL_VERIFICATION
    }

    /* synthetic */ b(f fVar, e eVar, a aVar) throws CertificateException {
        this(fVar, eVar);
    }

    private void c(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine, Socket socket, boolean z10) throws CertificateException {
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new IllegalArgumentException("Want certificate verification but got null or empty certificates");
        }
        if (sSLEngine == null && socket == null) {
            throw new CertificateException("Not enough information to validate peer. SSLEngine or Socket required.");
        }
        if (this.f291010a != f.INSECURELY_SKIP_ALL_VERIFICATION) {
            X509ExtendedTrustManager x509ExtendedTrustManager = this.f291012c;
            if (x509ExtendedTrustManager == null) {
                throw new CertificateException("No trust roots configured");
            }
            if (z10) {
                String str2 = this.f291010a == f.CERTIFICATE_AND_HOST_NAME_VERIFICATION ? "HTTPS" : "";
                if (sSLEngine != null) {
                    SSLParameters sSLParameters = sSLEngine.getSSLParameters();
                    sSLParameters.setEndpointIdentificationAlgorithm(str2);
                    sSLEngine.setSSLParameters(sSLParameters);
                    x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str, sSLEngine);
                } else {
                    if (!(socket instanceof SSLSocket)) {
                        throw new CertificateException("socket is not a type of SSLSocket");
                    }
                    SSLSocket sSLSocket = (SSLSocket) socket;
                    SSLParameters sSLParameters2 = sSLSocket.getSSLParameters();
                    sSLParameters2.setEndpointIdentificationAlgorithm(str2);
                    sSLSocket.setSSLParameters(sSLParameters2);
                    x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str, sSLSocket);
                }
            } else {
                x509ExtendedTrustManager.checkClientTrusted(x509CertificateArr, str, sSLEngine);
            }
        }
        e eVar = this.f291011b;
        if (eVar != null) {
            if (sSLEngine != null) {
                eVar.b(x509CertificateArr, str, sSLEngine);
            } else {
                eVar.a(x509CertificateArr, str, socket);
            }
        }
    }

    private static X509ExtendedTrustManager d(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException, CertificateException {
        X509ExtendedTrustManager x509ExtendedTrustManager;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        int i10 = 0;
        while (true) {
            if (i10 >= trustManagers.length) {
                x509ExtendedTrustManager = null;
                break;
            }
            TrustManager trustManager = trustManagers[i10];
            if (trustManager instanceof X509ExtendedTrustManager) {
                x509ExtendedTrustManager = (X509ExtendedTrustManager) trustManager;
                break;
            }
            i10++;
        }
        if (x509ExtendedTrustManager != null) {
            return x509ExtendedTrustManager;
        }
        throw new CertificateException("Failed to find X509ExtendedTrustManager with default TrustManager algorithm " + TrustManagerFactory.getDefaultAlgorithm());
    }

    public static C1991b e() {
        return new C1991b(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long f(File file, long j10) throws GeneralSecurityException, IOException {
        long jLastModified = file.lastModified();
        if (jLastModified == j10) {
            return j10;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            g(io.grpc.util.c.b(fileInputStream));
            return jLastModified;
        } finally {
            fileInputStream.close();
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Not enough information to validate peer. SSLEngine or Socket required.");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        c(x509CertificateArr, str, sSLEngine, null, true);
    }

    public void g(X509Certificate[] x509CertificateArr) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        int i10 = 1;
        for (X509Certificate x509Certificate : x509CertificateArr) {
            keyStore.setCertificateEntry(Integer.toString(i10), x509Certificate);
            i10++;
        }
        this.f291012c = d(keyStore);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.f291012c == null ? new X509Certificate[0] : this.f291012c.getAcceptedIssuers();
    }

    public c h(File file, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) throws GeneralSecurityException, IOException {
        if (f(file, 0L) != 0) {
            return new a(scheduledExecutorService.scheduleWithFixedDelay(new d(file), j10, j10, timeUnit));
        }
        throw new GeneralSecurityException("Files were unmodified before their initial update. Probably a bug.");
    }

    public void i(File file) throws GeneralSecurityException, IOException {
        if (f(file, 0L) == 0) {
            throw new GeneralSecurityException("Files were unmodified before their initial update. Probably a bug.");
        }
    }

    public void j() throws NoSuchAlgorithmException, CertificateException, KeyStoreException {
        this.f291012c = d(null);
    }

    private b(f fVar, e eVar) throws CertificateException {
        this.f291012c = null;
        this.f291010a = fVar;
        this.f291011b = eVar;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        c(x509CertificateArr, str, null, socket, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Not enough information to validate peer. SSLEngine or Socket required.");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        c(x509CertificateArr, str, sSLEngine, null, false);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        c(x509CertificateArr, str, null, socket, true);
    }
}
