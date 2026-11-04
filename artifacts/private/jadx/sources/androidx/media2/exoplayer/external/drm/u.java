package androidx.media2.exoplayer.external.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.drm.t;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface u<T extends t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f53898a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f53899b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53900c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f53901d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f53902e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f53903f = 3;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f53904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f53905b;

        public a(byte[] data, String licenseServerUrl) {
            this.f53904a = data;
            this.f53905b = licenseServerUrl;
        }

        public byte[] a() {
            return this.f53904a;
        }

        public String b() {
            return this.f53905b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f53906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f53907b;

        public b(int statusCode, byte[] keyId) {
            this.f53906a = statusCode;
            this.f53907b = keyId;
        }

        public byte[] a() {
            return this.f53907b;
        }

        public int b() {
            return this.f53906a;
        }
    }

    public interface c<T extends t> {
        void a(u<? extends T> mediaDrm, @p0 byte[] sessionId, int event, int extra, @p0 byte[] data);
    }

    public interface d<T extends t> {
        void a(u<? extends T> mediaDrm, byte[] sessionId, List<b> exoKeyInformation, boolean hasNewUsableKey);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f53908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f53909b;

        public e(byte[] data, String defaultUrl) {
            this.f53908a = data;
            this.f53909b = defaultUrl;
        }

        public byte[] a() {
            return this.f53908a;
        }

        public String b() {
            return this.f53909b;
        }
    }

    Map<String, String> a(byte[] sessionId);

    e b();

    byte[] c() throws MediaDrmException;

    void d(byte[] sessionId, byte[] keySetId);

    void e(String propertyName, String value);

    void f(String propertyName, byte[] value);

    String g(String propertyName);

    @p0
    byte[] h(byte[] scope, byte[] response) throws DeniedByServerException, NotProvisionedException;

    void i(byte[] response) throws DeniedByServerException;

    void j(byte[] sessionId);

    byte[] k(String propertyName);

    a l(byte[] scope, @p0 List<DrmInitData.SchemeData> schemeDatas, int keyType, @p0 HashMap<String, String> optionalParameters) throws NotProvisionedException;

    Class<T> m();

    void n(d<? super T> listener);

    void o(c<? super T> listener);

    T p(byte[] sessionId) throws MediaCryptoException;

    void release();
}
