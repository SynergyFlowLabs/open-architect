package io.grpc.util;

import com.google.common.base.j0;
import io.grpc.e0;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/8024")
public final class a extends X509ExtendedKeyManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f290995b = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile c f290996a;

    /* JADX INFO: renamed from: io.grpc.util.a$a, reason: collision with other inner class name */
    class C1990a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScheduledFuture f290997a;

        C1990a(ScheduledFuture scheduledFuture) {
            this.f290997a = scheduledFuture;
        }

        @Override // io.grpc.util.a.b, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f290997a.cancel(false);
        }
    }

    public interface b extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final PrivateKey f290999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final X509Certificate[] f291000b;

        public c(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
            this.f290999a = privateKey;
            this.f291000b = x509CertificateArr;
        }
    }

    private class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        File f291001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        File f291002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f291003c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f291004d = 0;

        public d(File file, File file2) {
            this.f291001a = file;
            this.f291002b = file2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVarC = a.this.c(this.f291001a, this.f291002b, this.f291003c, this.f291004d);
                if (eVarC.f291006a) {
                    this.f291003c = eVarC.f291007b;
                    this.f291004d = eVarC.f291008c;
                }
            } catch (IOException | GeneralSecurityException e10) {
                a.f290995b.log(Level.SEVERE, "Failed refreshing private key and certificate chain from files. Using previous ones", e10);
            }
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f291006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f291007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f291008c;

        public e(boolean z10, long j10, long j11) {
            this.f291006a = z10;
            this.f291007b = j10;
            this.f291008c = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e c(File file, File file2, long j10, long j11) throws GeneralSecurityException, IOException {
        long jLastModified = file.lastModified();
        long jLastModified2 = file2.lastModified();
        if (jLastModified == j10 || jLastModified2 == j11) {
            return new e(false, j10, j11);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            PrivateKey privateKeyA = io.grpc.util.c.a(fileInputStream);
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                d(privateKeyA, io.grpc.util.c.b(fileInputStream2));
                e eVar = new e(true, jLastModified, jLastModified2);
                fileInputStream2.close();
                fileInputStream.close();
                return eVar;
            } catch (Throwable th2) {
                fileInputStream2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            fileInputStream.close();
            throw th3;
        }
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        return "default";
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        return "default";
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        return "default";
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        return "default";
    }

    public void d(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
        this.f290996a = new c((PrivateKey) j0.F(privateKey, "key"), (X509Certificate[]) j0.F(x509CertificateArr, "certs"));
    }

    public b e(File file, File file2, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) throws GeneralSecurityException, IOException {
        if (c(file, file2, 0L, 0L).f291006a) {
            return new C1990a(scheduledExecutorService.scheduleWithFixedDelay(new d(file, file2), j10, j10, timeUnit));
        }
        throw new GeneralSecurityException("Files were unmodified before their initial update. Probably a bug.");
    }

    public void f(File file, File file2) throws GeneralSecurityException, IOException {
        if (!c(file, file2, 0L, 0L).f291006a) {
            throw new GeneralSecurityException("Files were unmodified before their initial update. Probably a bug.");
        }
    }

    @Override // javax.net.ssl.X509KeyManager
    public X509Certificate[] getCertificateChain(String str) {
        if (str.equals("default")) {
            return (X509Certificate[]) Arrays.copyOf(this.f290996a.f291000b, this.f290996a.f291000b.length);
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getClientAliases(String str, Principal[] principalArr) {
        return new String[]{"default"};
    }

    @Override // javax.net.ssl.X509KeyManager
    public PrivateKey getPrivateKey(String str) {
        if (str.equals("default")) {
            return this.f290996a.f290999a;
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getServerAliases(String str, Principal[] principalArr) {
        return new String[]{"default"};
    }
}
