package androidx.media3.datasource;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class x {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f62587l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f62588m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f62589n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f62590o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f62591p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f62592q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f62593r = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f62594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f62596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    public final byte[] f62597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f62598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f62599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f62600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f62601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f62602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f62603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    public final Object f62604k;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private Uri f62605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f62606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f62607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private byte[] f62608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f62609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f62610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f62611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private String f62612h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f62613i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f62614j;

        public x a() {
            androidx.media3.common.util.a.l(this.f62605a, "The uri must be set.");
            return new x(this.f62605a, this.f62606b, this.f62607c, this.f62608d, this.f62609e, this.f62610f, this.f62611g, this.f62612h, this.f62613i, this.f62614j);
        }

        @z7.a
        public b b(@androidx.annotation.p0 Object obj) {
            this.f62614j = obj;
            return this;
        }

        @z7.a
        public b c(int i10) {
            this.f62613i = i10;
            return this;
        }

        @z7.a
        public b d(@androidx.annotation.p0 byte[] bArr) {
            this.f62608d = bArr;
            return this;
        }

        @z7.a
        public b e(int i10) {
            this.f62607c = i10;
            return this;
        }

        @z7.a
        public b f(Map<String, String> map) {
            this.f62609e = map;
            return this;
        }

        @z7.a
        public b g(@androidx.annotation.p0 String str) {
            this.f62612h = str;
            return this;
        }

        @z7.a
        public b h(long j10) {
            this.f62611g = j10;
            return this;
        }

        @z7.a
        public b i(long j10) {
            this.f62610f = j10;
            return this;
        }

        @z7.a
        public b j(Uri uri) {
            this.f62605a = uri;
            return this;
        }

        @z7.a
        public b k(String str) {
            this.f62605a = Uri.parse(str);
            return this;
        }

        @z7.a
        public b l(long j10) {
            this.f62606b = j10;
            return this;
        }

        public b() {
            this.f62607c = 1;
            this.f62609e = Collections.EMPTY_MAP;
            this.f62611g = -1L;
        }

        private b(x xVar) {
            this.f62605a = xVar.f62594a;
            this.f62606b = xVar.f62595b;
            this.f62607c = xVar.f62596c;
            this.f62608d = xVar.f62597d;
            this.f62609e = xVar.f62598e;
            this.f62610f = xVar.f62600g;
            this.f62611g = xVar.f62601h;
            this.f62612h = xVar.f62602i;
            this.f62613i = xVar.f62603j;
            this.f62614j = xVar.f62604k;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    static {
        androidx.media3.common.p0.a("media3.datasource");
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f62596c);
    }

    public boolean d(int i10) {
        return (this.f62603j & i10) == i10;
    }

    public x e(long j10) {
        long j11 = this.f62601h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public x f(long j10, long j11) {
        return (j10 == 0 && this.f62601h == j11) ? this : new x(this.f62594a, this.f62595b, this.f62596c, this.f62597d, this.f62598e, this.f62600g + j10, j11, this.f62602i, this.f62603j, this.f62604k);
    }

    public x g(Map<String, String> map) {
        HashMap map2 = new HashMap(this.f62598e);
        map2.putAll(map);
        return new x(this.f62594a, this.f62595b, this.f62596c, this.f62597d, map2, this.f62600g, this.f62601h, this.f62602i, this.f62603j, this.f62604k);
    }

    public x h(Map<String, String> map) {
        return new x(this.f62594a, this.f62595b, this.f62596c, this.f62597d, map, this.f62600g, this.f62601h, this.f62602i, this.f62603j, this.f62604k);
    }

    public x i(Uri uri) {
        return new x(uri, this.f62595b, this.f62596c, this.f62597d, this.f62598e, this.f62600g, this.f62601h, this.f62602i, this.f62603j, this.f62604k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f62594a + ", " + this.f62600g + ", " + this.f62601h + ", " + this.f62602i + ", " + this.f62603j + "]";
    }

    public x(Uri uri) {
        this(uri, 0L, -1L);
    }

    public x(Uri uri, long j10, long j11) {
        this(uri, j10, j11, null);
    }

    @Deprecated
    public x(Uri uri, long j10, long j11, @androidx.annotation.p0 String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, str, 0, null);
    }

    private x(Uri uri, long j10, int i10, @androidx.annotation.p0 byte[] bArr, Map<String, String> map, long j11, long j12, @androidx.annotation.p0 String str, int i11, @androidx.annotation.p0 Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        androidx.media3.common.util.a.a(j13 >= 0);
        androidx.media3.common.util.a.a(j11 >= 0);
        androidx.media3.common.util.a.a(j12 > 0 || j12 == -1);
        this.f62594a = (Uri) androidx.media3.common.util.a.g(uri);
        this.f62595b = j10;
        this.f62596c = i10;
        this.f62597d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f62598e = Collections.unmodifiableMap(new HashMap(map));
        this.f62600g = j11;
        this.f62599f = j13;
        this.f62601h = j12;
        this.f62602i = str;
        this.f62603j = i11;
        this.f62604k = obj;
    }
}
