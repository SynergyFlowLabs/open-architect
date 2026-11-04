package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.p0;
import androidx.media3.common.n4;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface l0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final Handler f66390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final l0 f66391b;

        public a(@p0 Handler handler, @p0 l0 l0Var) {
            this.f66390a = l0Var != null ? (Handler) androidx.media3.common.util.a.g(handler) : null;
            this.f66391b = l0Var;
        }

        public static /* synthetic */ void d(a aVar, androidx.media3.exoplayer.j jVar) {
            aVar.getClass();
            jVar.c();
            ((l0) k1.o(aVar.f66391b)).H(jVar);
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f66390a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((l0) k1.o(this.f66278a.f66391b)).d(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f66390a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((l0) k1.o(this.f66387a.f66391b)).k(str);
                    }
                });
            }
        }

        public void m(final androidx.media3.exoplayer.j jVar) {
            jVar.c();
            Handler handler = this.f66390a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        l0.a.d(this.f66335a, jVar);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f66390a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((l0) k1.o(this.f66284a.f66391b)).c(i10, j10);
                    }
                });
            }
        }

        public void o(final androidx.media3.exoplayer.j jVar) {
            Handler handler = this.f66390a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((l0) k1.o(this.f66312a.f66391b)).p(jVar);
                    }
                });
            }
        }

        public void p(final androidx.media3.common.w wVar, @p0 final androidx.media3.exoplayer.k kVar) {
            Handler handler = this.f66390a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((l0) k1.o(this.f66330a.f66391b)).G(wVar, kVar);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.f66390a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f66390a.post(new Runnable() { // from class: androidx.media3.exoplayer.video.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((l0) k1.o(this.f66300a.f66391b)).D(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j10, final int i10) {
            Handler handler = this.f66390a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((l0) k1.o(this.f66304a.f66391b)).t(j10, i10);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.f66390a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((l0) k1.o(this.f66308a.f66391b)).y(exc);
                    }
                });
            }
        }

        public void t(final n4 n4Var) {
            Handler handler = this.f66390a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((l0) k1.o(this.f66282a.f66391b)).a(n4Var);
                    }
                });
            }
        }
    }

    default void D(Object obj, long j10) {
    }

    default void G(androidx.media3.common.w wVar, @p0 androidx.media3.exoplayer.k kVar) {
    }

    default void H(androidx.media3.exoplayer.j jVar) {
    }

    default void a(n4 n4Var) {
    }

    default void c(int i10, long j10) {
    }

    default void d(String str, long j10, long j11) {
    }

    default void k(String str) {
    }

    default void p(androidx.media3.exoplayer.j jVar) {
    }

    default void t(long j10, int i10) {
    }

    default void y(Exception exc) {
    }
}
