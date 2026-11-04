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
public final class f3 extends n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f288773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f288774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f288775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f288776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<KeyManager> f288777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f288778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f288779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<TrustManager> f288780h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f288781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f288782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f288783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f288784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<KeyManager> f288785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f288786f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f288787g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<TrustManager> f288788h;

        private void j() {
            this.f288782b = null;
            this.f288783c = null;
            this.f288784d = null;
            this.f288785e = null;
        }

        private void k() {
            this.f288787g = null;
            this.f288788h = null;
        }

        public n2 i() {
            if (this.f288782b == null && this.f288785e == null) {
                throw new IllegalStateException("A key manager is required");
            }
            return new f3(this);
        }

        public b l(c cVar) {
            com.google.common.base.j0.F(cVar, "clientAuth");
            this.f288786f = cVar;
            return this;
        }

        public b m(File file, File file2) throws IOException {
            return n(file, file2, null);
        }

        public b n(File file, File file2, String str) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    b bVarP = p(fileInputStream, fileInputStream2, str);
                    fileInputStream2.close();
                    fileInputStream.close();
                    return bVarP;
                } catch (Throwable th2) {
                    fileInputStream2.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                fileInputStream.close();
                throw th3;
            }
        }

        public b o(InputStream inputStream, InputStream inputStream2) throws IOException {
            return p(inputStream, inputStream2, null);
        }

        public b p(InputStream inputStream, InputStream inputStream2, String str) throws IOException {
            byte[] bArrU = com.google.common.io.h.u(inputStream);
            byte[] bArrU2 = com.google.common.io.h.u(inputStream2);
            j();
            this.f288782b = bArrU;
            this.f288783c = bArrU2;
            this.f288784d = str;
            return this;
        }

        public b q(KeyManager... keyManagerArr) {
            List<KeyManager> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(keyManagerArr)));
            j();
            this.f288785e = listUnmodifiableList;
            return this;
        }

        public b r() {
            this.f288781a = true;
            return this;
        }

        public b s(File file) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                b bVarT = t(fileInputStream);
                fileInputStream.close();
                return bVarT;
            } catch (Throwable th2) {
                fileInputStream.close();
                throw th2;
            }
        }

        public b t(InputStream inputStream) throws IOException {
            byte[] bArrU = com.google.common.io.h.u(inputStream);
            k();
            this.f288787g = bArrU;
            return this;
        }

        public b u(TrustManager... trustManagerArr) {
            List<TrustManager> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(trustManagerArr)));
            k();
            this.f288788h = listUnmodifiableList;
            return this;
        }

        private b() {
            this.f288786f = c.NONE;
        }
    }

    public enum c {
        NONE,
        OPTIONAL,
        REQUIRE
    }

    public enum d {
        FAKE,
        MTLS,
        CUSTOM_MANAGERS
    }

    f3(b bVar) {
        this.f288773a = bVar.f288781a;
        this.f288774b = bVar.f288782b;
        this.f288775c = bVar.f288783c;
        this.f288776d = bVar.f288784d;
        this.f288777e = bVar.f288785e;
        this.f288778f = bVar.f288786f;
        this.f288779g = bVar.f288787g;
        this.f288780h = bVar.f288788h;
    }

    public static n2 a(File file, File file2) throws IOException {
        return k().m(file, file2).i();
    }

    public static n2 b(InputStream inputStream, InputStream inputStream2) throws IOException {
        return k().o(inputStream, inputStream2).i();
    }

    public static b k() {
        return new b();
    }

    private static void l(Set<d> set, Set<d> set2, d dVar) {
        if (set.contains(dVar)) {
            return;
        }
        set2.add(dVar);
    }

    public byte[] c() {
        byte[] bArr = this.f288774b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public c d() {
        return this.f288778f;
    }

    public List<KeyManager> e() {
        return this.f288777e;
    }

    public byte[] f() {
        byte[] bArr = this.f288775c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String g() {
        return this.f288776d;
    }

    public byte[] h() {
        byte[] bArr = this.f288779g;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<TrustManager> i() {
        return this.f288780h;
    }

    public Set<d> j(Set<d> set) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(d.class);
        if (this.f288773a) {
            l(set, enumSetNoneOf, d.FAKE);
        }
        if (this.f288778f != c.NONE) {
            l(set, enumSetNoneOf, d.MTLS);
        }
        if (this.f288777e != null || this.f288780h != null) {
            l(set, enumSetNoneOf, d.CUSTOM_MANAGERS);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }
}
