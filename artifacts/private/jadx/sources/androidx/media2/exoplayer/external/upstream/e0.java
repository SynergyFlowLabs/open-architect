package androidx.media2.exoplayer.external.upstream;

import androidx.annotation.b1;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface e0 extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.media2.exoplayer.external.util.z<String> f57272a = d0.f57267a;

    public static abstract class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f57273a = new f();

        @Override // androidx.media2.exoplayer.external.upstream.e0.b
        public final f b() {
            return this.f57273a;
        }

        @Override // androidx.media2.exoplayer.external.upstream.e0.b
        @Deprecated
        public final void c(String name, String value) {
            this.f57273a.e(name, value);
        }

        @Override // androidx.media2.exoplayer.external.upstream.e0.b
        @Deprecated
        public final void d() {
            this.f57273a.a();
        }

        @Override // androidx.media2.exoplayer.external.upstream.e0.b
        @Deprecated
        public final void e(String name) {
            this.f57273a.d(name);
        }

        protected abstract e0 f(f defaultRequestProperties);

        @Override // androidx.media2.exoplayer.external.upstream.l.a
        public final e0 a() {
            return f(this.f57273a);
        }
    }

    public interface b extends l.a {
        @Override // androidx.media2.exoplayer.external.upstream.l.a
        e0 a();

        f b();

        @Deprecated
        void c(String name, String value);

        @Deprecated
        void d();

        @Deprecated
        void e(String name);
    }

    public static final class d extends c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f57279f;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(String contentType, o dataSpec) {
            String strValueOf = String.valueOf(contentType);
            super(strValueOf.length() != 0 ? "Invalid content type: ".concat(strValueOf) : new String("Invalid content type: "), dataSpec, 1);
            this.f57279f = contentType;
        }
    }

    public static final class e extends c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f57280f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f57281g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Map<String, List<String>> f57282h;

        @Deprecated
        public e(int responseCode, Map<String, List<String>> headerFields, o dataSpec) {
            this(responseCode, null, headerFields, dataSpec);
        }

        public e(int responseCode, @androidx.annotation.p0 String responseMessage, Map<String, List<String>> headerFields, o dataSpec) {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Response code: ");
            sb2.append(responseCode);
            super(sb2.toString(), dataSpec, 1);
            this.f57280f = responseCode;
            this.f57281g = responseMessage;
            this.f57282h = headerFields;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f57283a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, String> f57284b;

        public synchronized void a() {
            try {
                this.f57284b = null;
                this.f57283a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void b(Map<String, String> properties) {
            int i10 = 3 << 0;
            this.f57284b = null;
            this.f57283a.clear();
            this.f57283a.putAll(properties);
        }

        public synchronized Map<String, String> c() {
            try {
                if (this.f57284b == null) {
                    this.f57284b = Collections.unmodifiableMap(new HashMap(this.f57283a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f57284b;
        }

        public synchronized void d(String name) {
            this.f57284b = null;
            this.f57283a.remove(name);
        }

        public synchronized void e(String name, String value) {
            try {
                this.f57284b = null;
                this.f57283a.put(name, value);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void f(Map<String, String> properties) {
            try {
                this.f57284b = null;
                this.f57283a.putAll(properties);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    Map<String, List<String>> a();

    @Override // androidx.media2.exoplayer.external.upstream.l
    long b(o dataSpec) throws c;

    @Override // androidx.media2.exoplayer.external.upstream.l
    void close() throws c;

    int f();

    void h();

    void j(String name, String value);

    void q(String name);

    @Override // androidx.media2.exoplayer.external.upstream.l
    int read(byte[] buffer, int offset, int readLength) throws c;

    public static class c extends IOException {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f57274c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f57275d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f57276e = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f57278b;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public c(o dataSpec, int type) {
            this.f57278b = dataSpec;
            this.f57277a = type;
        }

        public c(String message, o dataSpec, int type) {
            super(message);
            this.f57278b = dataSpec;
            this.f57277a = type;
        }

        public c(IOException cause, o dataSpec, int type) {
            super(cause);
            this.f57278b = dataSpec;
            this.f57277a = type;
        }

        public c(String message, IOException cause, o dataSpec, int type) {
            super(message, cause);
            this.f57278b = dataSpec;
            this.f57277a = type;
        }
    }
}
