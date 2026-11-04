package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface w {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private final Handler f63418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private final w f63419b;

        public a(@androidx.annotation.p0 Handler handler, @androidx.annotation.p0 w wVar) {
            this.f63418a = wVar != null ? (Handler) androidx.media3.common.util.a.g(handler) : null;
            this.f63419b = wVar;
        }

        public static /* synthetic */ void d(a aVar, androidx.media3.exoplayer.j jVar) {
            aVar.getClass();
            jVar.c();
            ((w) k1.o(aVar.f63419b)).r(jVar);
        }

        public void m(final Exception exc) {
            Handler handler = this.f63418a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((w) k1.o(this.f63353a.f63419b)).s(exc);
                    }
                });
            }
        }

        public void n(final Exception exc) {
            Handler handler = this.f63418a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((w) k1.o(this.f63364a.f63419b)).h(exc);
                    }
                });
            }
        }

        public void o(final x.a aVar) {
            Handler handler = this.f63418a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((w) k1.o(this.f63347a.f63419b)).e(aVar);
                    }
                });
            }
        }

        public void p(final x.a aVar) {
            Handler handler = this.f63418a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((w) k1.o(this.f63350a.f63419b)).f(aVar);
                    }
                });
            }
        }

        public void q(final String str, final long j10, final long j11) {
            Handler handler = this.f63418a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((w) k1.o(this.f63403a.f63419b)).b(str, j10, j11);
                    }
                });
            }
        }

        public void r(final String str) {
            Handler handler = this.f63418a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((w) k1.o(this.f63409a.f63419b)).m(str);
                    }
                });
            }
        }

        public void s(final androidx.media3.exoplayer.j jVar) {
            jVar.c();
            Handler handler = this.f63418a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.d(this.f63317a, jVar);
                    }
                });
            }
        }

        public void t(final androidx.media3.exoplayer.j jVar) {
            Handler handler = this.f63418a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((w) k1.o(this.f63315a.f63419b)).o(jVar);
                    }
                });
            }
        }

        public void u(final androidx.media3.common.w wVar, @androidx.annotation.p0 final androidx.media3.exoplayer.k kVar) {
            Handler handler = this.f63418a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((w) k1.o(this.f63366a.f63419b)).q(wVar, kVar);
                    }
                });
            }
        }

        public void v(final long j10) {
            Handler handler = this.f63418a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((w) k1.o(this.f63320a.f63419b)).w(j10);
                    }
                });
            }
        }

        public void w(final boolean z10) {
            Handler handler = this.f63418a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((w) k1.o(this.f63387a.f63419b)).g(z10);
                    }
                });
            }
        }

        public void x(final int i10, final long j10, final long j11) {
            Handler handler = this.f63418a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((w) k1.o(this.f63343a.f63419b)).I(i10, j10, j11);
                    }
                });
            }
        }
    }

    default void I(int i10, long j10, long j11) {
    }

    default void b(String str, long j10, long j11) {
    }

    default void e(x.a aVar) {
    }

    default void f(x.a aVar) {
    }

    default void g(boolean z10) {
    }

    default void h(Exception exc) {
    }

    default void m(String str) {
    }

    default void o(androidx.media3.exoplayer.j jVar) {
    }

    default void q(androidx.media3.common.w wVar, @androidx.annotation.p0 androidx.media3.exoplayer.k kVar) {
    }

    default void r(androidx.media3.exoplayer.j jVar) {
    }

    default void s(Exception exc) {
    }

    default void w(long j10) {
    }
}
