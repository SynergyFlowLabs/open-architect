package androidx.media3.datasource;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface g0 extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final com.google.common.base.k0<String> f62485a = new com.google.common.base.k0() { // from class: androidx.media3.datasource.f0
        @Override // com.google.common.base.k0
        public final boolean apply(Object obj) {
            return g0.t((String) obj);
        }
    };

    @androidx.media3.common.util.b1
    public static abstract class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f62486a = new g();

        @Override // androidx.media3.datasource.g0.c
        @z7.a
        public final c b(Map<String, String> map) {
            this.f62486a.b(map);
            return this;
        }

        protected abstract g0 c(g gVar);

        @Override // androidx.media3.datasource.g0.c, androidx.media3.datasource.p.a
        public final g0 a() {
            return c(this.f62486a);
        }
    }

    public static final class b extends d {
        @androidx.media3.common.util.b1
        public b(IOException iOException, x xVar) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, xVar, androidx.media3.common.x0.f61822j3, 1);
        }
    }

    public interface c extends p.a {
        @Override // androidx.media3.datasource.p.a
        @androidx.media3.common.util.b1
        g0 a();

        @androidx.media3.common.util.b1
        c b(Map<String, String> map);
    }

    public static class d extends u {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f62487e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f62488f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f62489g = 3;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.media3.common.util.b1
        public final x f62490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f62491d;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @androidx.media3.common.util.b1
        @Deprecated
        public d(x xVar, int i10) {
            this(xVar, 2000, i10);
        }

        private static int b(int i10, int i11) {
            return (i10 == 2000 && i11 == 1) ? androidx.media3.common.x0.f61834p1 : i10;
        }

        @androidx.media3.common.util.b1
        public static d c(IOException iOException, x xVar, int i10) {
            int i11;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i11 = androidx.media3.common.x0.H1;
            } else if (iOException instanceof InterruptedIOException) {
                i11 = 1004;
            } else {
                i11 = (message == null || !com.google.common.base.c.g(message).matches("cleartext.*not permitted.*")) ? androidx.media3.common.x0.f61834p1 : 2007;
            }
            return i11 == 2007 ? new b(iOException, xVar) : new d(iOException, xVar, i11, i10);
        }

        @androidx.media3.common.util.b1
        public d(x xVar, int i10, int i11) {
            super(b(i10, i11));
            this.f62490c = xVar;
            this.f62491d = i11;
        }

        @androidx.media3.common.util.b1
        @Deprecated
        public d(String str, x xVar, int i10) {
            this(str, xVar, 2000, i10);
        }

        @androidx.media3.common.util.b1
        public d(String str, x xVar, int i10, int i11) {
            super(str, b(i10, i11));
            this.f62490c = xVar;
            this.f62491d = i11;
        }

        @androidx.media3.common.util.b1
        @Deprecated
        public d(IOException iOException, x xVar, int i10) {
            this(iOException, xVar, 2000, i10);
        }

        @androidx.media3.common.util.b1
        public d(IOException iOException, x xVar, int i10, int i11) {
            super(iOException, b(i10, i11));
            this.f62490c = xVar;
            this.f62491d = i11;
        }

        @androidx.media3.common.util.b1
        @Deprecated
        public d(String str, IOException iOException, x xVar, int i10) {
            this(str, iOException, xVar, 2000, i10);
        }

        @androidx.media3.common.util.b1
        public d(String str, @androidx.annotation.p0 IOException iOException, x xVar, int i10, int i11) {
            super(str, iOException, b(i10, i11));
            this.f62490c = xVar;
            this.f62491d = i11;
        }
    }

    public static final class e extends d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f62492h;

        @androidx.media3.common.util.b1
        public e(String str, x xVar) {
            super("Invalid content type: " + str, xVar, androidx.media3.common.x0.f61835p2, 1);
            this.f62492h = str;
        }
    }

    public static final class f extends d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f62493h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f62494i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.media3.common.util.b1
        public final Map<String, List<String>> f62495j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final byte[] f62496k;

        @androidx.media3.common.util.b1
        public f(int i10, @androidx.annotation.p0 String str, @androidx.annotation.p0 IOException iOException, Map<String, List<String>> map, x xVar, byte[] bArr) {
            super("Response code: " + i10, iOException, xVar, androidx.media3.common.x0.f61816g3, 1);
            this.f62493h = i10;
            this.f62494i = str;
            this.f62495j = map;
            this.f62496k = bArr;
        }
    }

    @androidx.media3.common.util.b1
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f62497a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private Map<String, String> f62498b;

        public synchronized void a() {
            try {
                this.f62498b = null;
                this.f62497a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void b(Map<String, String> map) {
            try {
                this.f62498b = null;
                this.f62497a.clear();
                this.f62497a.putAll(map);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized Map<String, String> c() {
            try {
                if (this.f62498b == null) {
                    this.f62498b = Collections.unmodifiableMap(new HashMap(this.f62497a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f62498b;
        }

        public synchronized void d(String str) {
            this.f62498b = null;
            this.f62497a.remove(str);
        }

        public synchronized void e(String str, String str2) {
            try {
                this.f62498b = null;
                this.f62497a.put(str, str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void f(Map<String, String> map) {
            try {
                this.f62498b = null;
                this.f62497a.putAll(map);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* synthetic */ boolean t(String str) {
        if (str != null) {
            String strG = com.google.common.base.c.g(str);
            if (!TextUtils.isEmpty(strG) && ((!strG.contains("text") || strG.contains("text/vtt")) && !strG.contains("html") && !strG.contains("xml"))) {
                return true;
            }
        }
        return false;
    }

    @androidx.media3.common.util.b1
    Map<String, List<String>> a();

    @androidx.media3.common.util.b1
    long c(x xVar) throws d;

    @androidx.media3.common.util.b1
    void close() throws d;

    @androidx.media3.common.util.b1
    int f();

    @androidx.media3.common.util.b1
    void h();

    @androidx.media3.common.util.b1
    void j(String str, String str2);

    @androidx.media3.common.util.b1
    void q(String str);

    @androidx.media3.common.util.b1
    int read(byte[] bArr, int i10, int i11) throws d;
}
