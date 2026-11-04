package io.grpc.okhttp.internal;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final io.grpc.okhttp.internal.a[] f290459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f290460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f290461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f290462h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f290463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f290464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f290465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f290466d;

    static {
        io.grpc.okhttp.internal.a[] aVarArr = {io.grpc.okhttp.internal.a.TLS_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, io.grpc.okhttp.internal.a.TLS_RSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_RSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_RSA_WITH_AES_128_CBC_SHA, io.grpc.okhttp.internal.a.TLS_RSA_WITH_AES_256_CBC_SHA, io.grpc.okhttp.internal.a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f290459e = aVarArr;
        C1981b c1981bF = new C1981b(true).f(aVarArr);
        k kVar = k.TLS_1_3;
        k kVar2 = k.TLS_1_2;
        b bVarE = c1981bF.i(kVar, kVar2).h(true).e();
        f290460f = bVarE;
        f290461g = new C1981b(bVarE).i(kVar, kVar2, k.TLS_1_1, k.TLS_1_0).h(true).e();
        f290462h = new C1981b(false).e();
    }

    private static <T> boolean e(T[] tArr, T t10) {
        for (T t11 : tArr) {
            if (l.a(t10, t11)) {
                return true;
            }
        }
        return false;
    }

    private static boolean h(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                if (e(strArr2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private b i(SSLSocket sSLSocket, boolean z10) {
        String[] enabledCipherSuites;
        if (this.f290464b != null) {
            enabledCipherSuites = (String[]) l.d(String.class, this.f290464b, sSLSocket.getEnabledCipherSuites());
        } else {
            enabledCipherSuites = null;
        }
        if (z10 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (enabledCipherSuites == null) {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            int length = enabledCipherSuites.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
            strArr[length] = "TLS_FALLBACK_SCSV";
            enabledCipherSuites = strArr;
        }
        return new C1981b(this).g(enabledCipherSuites).j((String[]) l.d(String.class, this.f290465c, sSLSocket.getEnabledProtocols())).e();
    }

    public void c(SSLSocket sSLSocket, boolean z10) {
        b bVarI = i(sSLSocket, z10);
        sSLSocket.setEnabledProtocols(bVarI.f290465c);
        String[] strArr = bVarI.f290464b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    public List<io.grpc.okhttp.internal.a> d() {
        String[] strArr = this.f290464b;
        if (strArr == null) {
            return null;
        }
        io.grpc.okhttp.internal.a[] aVarArr = new io.grpc.okhttp.internal.a[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f290464b;
            if (i10 >= strArr2.length) {
                return l.b(aVarArr);
            }
            aVarArr[i10] = io.grpc.okhttp.internal.a.b(strArr2[i10]);
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        boolean z10 = this.f290463a;
        if (z10 != bVar.f290463a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f290464b, bVar.f290464b) && Arrays.equals(this.f290465c, bVar.f290465c) && this.f290466d == bVar.f290466d);
    }

    public boolean f(SSLSocket sSLSocket) {
        if (!this.f290463a) {
            return false;
        }
        if (!h(this.f290465c, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        if (this.f290464b == null) {
            return sSLSocket.getEnabledCipherSuites().length > 0;
        }
        return h(this.f290464b, sSLSocket.getEnabledCipherSuites());
    }

    public boolean g() {
        return this.f290463a;
    }

    public int hashCode() {
        if (this.f290463a) {
            return ((((527 + Arrays.hashCode(this.f290464b)) * 31) + Arrays.hashCode(this.f290465c)) * 31) + (!this.f290466d ? 1 : 0);
        }
        return 17;
    }

    public boolean j() {
        return this.f290466d;
    }

    public List<k> k() {
        k[] kVarArr = new k[this.f290465c.length];
        int i10 = 0;
        while (true) {
            String[] strArr = this.f290465c;
            if (i10 >= strArr.length) {
                return l.b(kVarArr);
            }
            kVarArr[i10] = k.b(strArr[i10]);
            i10++;
        }
    }

    public String toString() {
        if (!this.f290463a) {
            return "ConnectionSpec()";
        }
        List<io.grpc.okhttp.internal.a> listD = d();
        return "ConnectionSpec(cipherSuites=" + (listD == null ? "[use default]" : listD.toString()) + ", tlsVersions=" + k() + ", supportsTlsExtensions=" + this.f290466d + ")";
    }

    /* JADX INFO: renamed from: io.grpc.okhttp.internal.b$b, reason: collision with other inner class name */
    public static final class C1981b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f290467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f290468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f290469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f290470d;

        public C1981b(boolean z10) {
            this.f290467a = z10;
        }

        public b e() {
            return new b(this);
        }

        public C1981b f(io.grpc.okhttp.internal.a... aVarArr) {
            if (!this.f290467a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                strArr[i10] = aVarArr[i10].f290458a;
            }
            this.f290468b = strArr;
            return this;
        }

        public C1981b g(String... strArr) {
            if (!this.f290467a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr == null) {
                this.f290468b = null;
                return this;
            }
            this.f290468b = (String[]) strArr.clone();
            return this;
        }

        public C1981b h(boolean z10) {
            if (!this.f290467a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f290470d = z10;
            return this;
        }

        public C1981b i(k... kVarArr) {
            if (!this.f290467a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (kVarArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[kVarArr.length];
            for (int i10 = 0; i10 < kVarArr.length; i10++) {
                strArr[i10] = kVarArr[i10].f290661a;
            }
            this.f290469c = strArr;
            return this;
        }

        public C1981b j(String... strArr) {
            if (!this.f290467a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr == null) {
                this.f290469c = null;
                return this;
            }
            this.f290469c = (String[]) strArr.clone();
            return this;
        }

        public C1981b(b bVar) {
            this.f290467a = bVar.f290463a;
            this.f290468b = bVar.f290464b;
            this.f290469c = bVar.f290465c;
            this.f290470d = bVar.f290466d;
        }
    }

    private b(C1981b c1981b) {
        this.f290463a = c1981b.f290467a;
        this.f290464b = c1981b.f290468b;
        this.f290465c = c1981b.f290469c;
        this.f290466d = c1981b.f290470d;
    }
}
