package io.grpc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes13.dex */
public final class e3 extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f288752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f288753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f288754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f288755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<KeyManager> f288756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f288757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<TrustManager> f288758g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f288759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f288760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f288761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f288762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<KeyManager> f288763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte[] f288764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<TrustManager> f288765g;

        private void i() {
            this.f288760b = null;
            this.f288761c = null;
            this.f288762d = null;
            this.f288763e = null;
        }

        private void j() {
            this.f288764f = null;
            this.f288765g = null;
        }

        public g h() {
            return new e3(this);
        }

        public b k(File file, File file2) throws IOException {
            return l(file, file2, null);
        }

        public b l(File file, File file2, String str) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileInputStream = new FileInputStream(file2);
                try {
                    b bVarN = n(fileInputStream, fileInputStream, str);
                    fileInputStream.close();
                    return bVarN;
                } finally {
                    fileInputStream.close();
                }
            } catch (Throwable th2) {
                fileInputStream.close();
                throw th2;
            }
        }

        public b m(InputStream inputStream, InputStream inputStream2) throws IOException {
            return n(inputStream, inputStream2, null);
        }

        public b n(InputStream inputStream, InputStream inputStream2, String str) throws IOException {
            byte[] bArrU = com.google.common.io.h.u(inputStream);
            byte[] bArrU2 = com.google.common.io.h.u(inputStream2);
            i();
            this.f288760b = bArrU;
            this.f288761c = bArrU2;
            this.f288762d = str;
            return this;
        }

        public b o(KeyManager... keyManagerArr) {
            List<KeyManager> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(keyManagerArr)));
            i();
            this.f288763e = listUnmodifiableList;
            return this;
        }

        public b p() {
            this.f288759a = true;
            return this;
        }

        public b q(File file) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                b bVarR = r(fileInputStream);
                fileInputStream.close();
                return bVarR;
            } catch (Throwable th2) {
                fileInputStream.close();
                throw th2;
            }
        }

        public b r(InputStream inputStream) throws IOException {
            byte[] bArrU = com.google.common.io.h.u(inputStream);
            j();
            this.f288764f = bArrU;
            return this;
        }

        public b s(TrustManager... trustManagerArr) {
            List<TrustManager> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(trustManagerArr)));
            j();
            this.f288765g = listUnmodifiableList;
            return this;
        }

        private b() {
        }
    }

    public enum c {
        FAKE,
        MTLS,
        CUSTOM_MANAGERS
    }

    e3(b bVar) {
        this.f288752a = bVar.f288759a;
        this.f288753b = bVar.f288760b;
        this.f288754c = bVar.f288761c;
        this.f288755d = bVar.f288762d;
        this.f288756e = bVar.f288763e;
        this.f288757f = bVar.f288764f;
        this.f288758g = bVar.f288765g;
    }

    public static g b() {
        return j().h();
    }

    public static b j() {
        return new b();
    }

    private static void k(Set<c> set, Set<c> set2, c cVar) {
        if (!set.contains(cVar)) {
            set2.add(cVar);
        }
    }

    @Override // io.grpc.g
    public g a() {
        return this;
    }

    public byte[] c() {
        byte[] bArr = this.f288753b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<KeyManager> d() {
        return this.f288756e;
    }

    public byte[] e() {
        byte[] bArr = this.f288754c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String f() {
        return this.f288755d;
    }

    public byte[] g() {
        byte[] bArr = this.f288757f;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<TrustManager> h() {
        return this.f288758g;
    }

    public Set<c> i(Set<c> set) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(c.class);
        if (this.f288752a) {
            k(set, enumSetNoneOf, c.FAKE);
        }
        if (this.f288757f != null || this.f288754c != null || this.f288756e != null) {
            k(set, enumSetNoneOf, c.MTLS);
        }
        if (this.f288756e != null || this.f288758g != null) {
            k(set, enumSetNoneOf, c.CUSTOM_MANAGERS);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }
}
