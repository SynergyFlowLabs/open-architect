package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.util.b1;
import androidx.media3.common.y0;
import androidx.media3.exoplayer.analytics.j4;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f63432a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f63433b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f63434c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f63435d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f63436e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f63437f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f63438g = 2;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f63442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f63443e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f63444f;

        public a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            this.f63439a = i10;
            this.f63440b = i11;
            this.f63441c = i12;
            this.f63442d = z10;
            this.f63443e = z11;
            this.f63444f = i13;
        }
    }

    public interface d {
        default void a(long j10) {
        }

        void b(int i10, long j10, long j11);

        void c();

        default void d() {
        }

        default void e(a aVar) {
        }

        default void f(a aVar) {
        }

        void g(boolean z10);

        default void h(Exception exc) {
        }

        default void i() {
        }

        default void j() {
        }

        default void k() {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    public static final class g extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f63449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f63450b;

        public g(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f63449a = j10;
            this.f63450b = j11;
        }
    }

    public static final class h extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f63452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.w f63453c;

        public h(int i10, androidx.media3.common.w wVar, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f63452b = z10;
            this.f63451a = i10;
            this.f63453c = wVar;
        }
    }

    void B();

    boolean a();

    boolean b(androidx.media3.common.w wVar);

    y0 c();

    void d(androidx.media3.common.d dVar);

    @androidx.annotation.p0
    androidx.media3.common.d e();

    void f(float f10);

    void flush();

    void g(int i10);

    void h(y0 y0Var);

    void i();

    boolean j();

    void k() throws h;

    long l(boolean z10);

    void m();

    void n(d dVar);

    @androidx.annotation.w0(29)
    default void o(int i10) {
    }

    void p(androidx.media3.common.w wVar, int i10, @androidx.annotation.p0 int[] iArr) throws b;

    void pause();

    boolean q();

    void r();

    default void release() {
    }

    void reset();

    int s(androidx.media3.common.w wVar);

    @androidx.annotation.w0(23)
    default void setPreferredDevice(@androidx.annotation.p0 AudioDeviceInfo audioDeviceInfo) {
    }

    void t(androidx.media3.common.f fVar);

    void t0(boolean z10);

    default void u(androidx.media3.common.util.j jVar) {
    }

    default j v(androidx.media3.common.w wVar) {
        return j.f63218d;
    }

    boolean w(ByteBuffer byteBuffer, long j10, int i10) throws c, h;

    @androidx.annotation.w0(29)
    default void x(int i10, int i11) {
    }

    default void y(@androidx.annotation.p0 j4 j4Var) {
    }

    default void z(long j10) {
    }

    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.w f63445a;

        public b(Throwable th2, androidx.media3.common.w wVar) {
            super(th2);
            this.f63445a = wVar;
        }

        public b(String str, androidx.media3.common.w wVar) {
            super(str);
            this.f63445a = wVar;
        }
    }

    public static final class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f63447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.w f63448c;

        public c(String str, int i10, androidx.media3.common.w wVar, boolean z10, @androidx.annotation.p0 Throwable th2) {
            super(str, th2);
            this.f63446a = i10;
            this.f63447b = z10;
            this.f63448c = wVar;
        }

        public c(int i10, int i11, int i12, int i13, androidx.media3.common.w wVar, boolean z10, @androidx.annotation.p0 Exception exc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append("Config(");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(")");
            sb2.append(" ");
            sb2.append(wVar);
            sb2.append(z10 ? " (recoverable)" : "");
            this(sb2.toString(), i10, wVar, z10, exc);
        }
    }
}
