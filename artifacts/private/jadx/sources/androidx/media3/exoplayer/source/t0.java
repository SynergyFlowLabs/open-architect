package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.analytics.j4;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface t0 {

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.media3.common.util.b1
        public static final a f65466a = c1.f64843b;

        @androidx.media3.common.util.b1
        default a a(androidx.media3.extractor.text.r.a aVar) {
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        default a b(int i10) {
            return this;
        }

        @androidx.media3.common.util.b1
        int[] c();

        @androidx.media3.common.util.b1
        @Deprecated
        default a d(boolean z10) {
            return this;
        }

        @androidx.media3.common.util.b1
        a e(androidx.media3.exoplayer.drm.w wVar);

        @androidx.media3.common.util.b1
        a f(androidx.media3.exoplayer.upstream.m mVar);

        @androidx.media3.common.util.b1
        default a g(androidx.media3.exoplayer.upstream.f.c cVar) {
            return this;
        }

        @androidx.media3.common.util.b1
        t0 h(androidx.media3.common.k0 k0Var);
    }

    @androidx.media3.common.util.b1
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f65467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f65469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f65470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f65471e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.f65467a.equals(obj) ? this : new b(obj, this.f65468b, this.f65469c, this.f65470d, this.f65471e);
        }

        public b b(long j10) {
            return this.f65470d == j10 ? this : new b(this.f65467a, this.f65468b, this.f65469c, j10, this.f65471e);
        }

        public boolean c() {
            return this.f65468b != -1;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f65467a.equals(bVar.f65467a) && this.f65468b == bVar.f65468b && this.f65469c == bVar.f65469c && this.f65470d == bVar.f65470d && this.f65471e == bVar.f65471e;
        }

        public int hashCode() {
            return ((((((((527 + this.f65467a.hashCode()) * 31) + this.f65468b) * 31) + this.f65469c) * 31) + ((int) this.f65470d)) * 31) + this.f65471e;
        }

        public b(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public b(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        private b(Object obj, int i10, int i11, long j10, int i12) {
            this.f65467a = obj;
            this.f65468b = i10;
            this.f65469c = i11;
            this.f65470d = j10;
            this.f65471e = i12;
        }
    }

    @androidx.media3.common.util.b1
    public interface c {
        void B(t0 t0Var, z3 z3Var);
    }

    @androidx.media3.common.util.b1
    void A(androidx.media3.exoplayer.drm.t tVar);

    @androidx.media3.common.util.b1
    void C(c cVar, @androidx.annotation.p0 androidx.media3.datasource.r1 r1Var, j4 j4Var);

    @androidx.media3.common.util.b1
    void F(c cVar);

    @androidx.media3.common.util.b1
    default void K(androidx.media3.common.k0 k0Var) {
    }

    @androidx.media3.common.util.b1
    void M(c cVar);

    @androidx.media3.common.util.b1
    default boolean N() {
        return true;
    }

    @androidx.media3.common.util.b1
    default boolean O(androidx.media3.common.k0 k0Var) {
        return false;
    }

    @androidx.media3.common.util.b1
    void a() throws IOException;

    @androidx.media3.common.util.b1
    androidx.media3.common.k0 g();

    @androidx.media3.common.util.b1
    void i(Handler handler, b1 b1Var);

    @androidx.media3.common.util.b1
    void j(Handler handler, androidx.media3.exoplayer.drm.t tVar);

    @androidx.media3.common.util.b1
    void l(s0 s0Var);

    @androidx.media3.common.util.b1
    void n(c cVar);

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    default z3 u() {
        return null;
    }

    @androidx.media3.common.util.b1
    void v(b1 b1Var);

    @androidx.media3.common.util.b1
    s0 x(b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10);

    @androidx.media3.common.util.b1
    @Deprecated
    default void z(c cVar, @androidx.annotation.p0 androidx.media3.datasource.r1 r1Var) {
        C(cVar, r1Var, j4.f63008d);
    }
}
