package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.b1;
import androidx.media3.exoplayer.analytics.j4;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b1
    public static final int f63569a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b1
    public static final int f63570b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b1
    public static final int f63571c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b1
    public static final int f63572d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b1
    public static final int f63573e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b1
    public static final int f63574f = 3;

    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a0 f63575a;

        public a(a0 a0Var) {
            this.f63575a = a0Var;
        }

        @Override // androidx.media3.exoplayer.drm.a0.g
        public a0 a(UUID uuid) {
            this.f63575a.acquire();
            return this.f63575a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f63576d = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f63577e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f63578f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f63579g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f63580h = 3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f63581i = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f63582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f63583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f63584c;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(byte[] bArr, String str) {
            this(bArr, str, Integer.MIN_VALUE);
        }

        public byte[] a() {
            return this.f63582a;
        }

        public String b() {
            return this.f63583b;
        }

        public int c() {
            return this.f63584c;
        }

        public b(byte[] bArr, String str, int i10) {
            this.f63582a = bArr;
            this.f63583b = str;
            this.f63584c = i10;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f63585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f63586b;

        public c(int i10, byte[] bArr) {
            this.f63585a = i10;
            this.f63586b = bArr;
        }

        public byte[] a() {
            return this.f63586b;
        }

        public int b() {
            return this.f63585a;
        }
    }

    public interface d {
        void a(a0 a0Var, @androidx.annotation.p0 byte[] bArr, int i10, int i11, @androidx.annotation.p0 byte[] bArr2);
    }

    public interface e {
        void a(a0 a0Var, byte[] bArr, long j10);
    }

    public interface f {
        void a(a0 a0Var, byte[] bArr, List<c> list, boolean z10);
    }

    public interface g {
        a0 a(UUID uuid);
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f63587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f63588b;

        public h(byte[] bArr, String str) {
            this.f63587a = bArr;
            this.f63588b = str;
        }

        public byte[] a() {
            return this.f63587a;
        }

        public String b() {
            return this.f63588b;
        }
    }

    Map<String, String> a(byte[] bArr);

    void acquire();

    h b();

    byte[] c() throws MediaDrmException;

    void d(byte[] bArr, byte[] bArr2);

    void e(String str, String str2);

    void f(String str, byte[] bArr);

    String g(String str);

    @androidx.annotation.p0
    PersistableBundle getMetrics();

    @androidx.annotation.p0
    byte[] h(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void i(byte[] bArr) throws DeniedByServerException;

    void j(byte[] bArr);

    byte[] k(String str);

    b l(byte[] bArr, @androidx.annotation.p0 List<DrmInitData.SchemeData> list, int i10, @androidx.annotation.p0 HashMap<String, String> map) throws NotProvisionedException;

    default List<byte[]> m() {
        throw new UnsupportedOperationException();
    }

    default void n(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    default void o(byte[] bArr, j4 j4Var) {
    }

    void p(@androidx.annotation.p0 e eVar);

    int q();

    androidx.media3.decoder.b r(byte[] bArr) throws MediaCryptoException;

    void release();

    void s(@androidx.annotation.p0 f fVar);

    boolean t(byte[] bArr, String str);

    void u(@androidx.annotation.p0 d dVar);
}
