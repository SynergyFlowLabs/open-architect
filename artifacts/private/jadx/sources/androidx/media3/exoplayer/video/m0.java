package androidx.media3.exoplayer.video;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.n4;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.r0;
import androidx.media3.common.util.y0;
import androidx.media3.exoplayer.z4;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f66393a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f66394b = 2;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f66395a = new a();

        class a implements b {
            a() {
            }

            @Override // androidx.media3.exoplayer.video.m0.b
            public void a(m0 m0Var) {
            }

            @Override // androidx.media3.exoplayer.video.m0.b
            public void b(m0 m0Var, d dVar) {
            }

            @Override // androidx.media3.exoplayer.video.m0.b
            public void c(m0 m0Var) {
            }

            @Override // androidx.media3.exoplayer.video.m0.b
            public void d(m0 m0Var, n4 n4Var) {
            }
        }

        void a(m0 m0Var);

        void b(m0 m0Var, d dVar);

        void c(m0 m0Var);

        void d(m0 m0Var, n4 n4Var);
    }

    public interface c {
        void a();

        void b(long j10);
    }

    public static final class d extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.w f66396a;

        public d(Throwable th2, androidx.media3.common.w wVar) {
            super(th2);
            this.f66396a = wVar;
        }
    }

    void B(boolean z10);

    void G(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10);

    void L(List<androidx.media3.common.p> list);

    boolean Z();

    boolean a();

    Surface b();

    void c(Surface surface, r0 r0Var);

    void d();

    void f();

    void g(long j10, long j11) throws d;

    void h();

    void i();

    void j();

    void k(w wVar);

    boolean l(androidx.media3.common.w wVar) throws d;

    void m(boolean z10);

    void n(int i10);

    boolean o(Bitmap bitmap, y0 y0Var);

    void q(b bVar, Executor executor);

    boolean r(long j10, boolean z10, c cVar);

    void release();

    void s(long j10, long j11);

    void t(z4.c cVar);

    boolean v(boolean z10);

    void w();

    void x(int i10, androidx.media3.common.w wVar, List<androidx.media3.common.p> list);

    void y();

    void z(boolean z10);
}
