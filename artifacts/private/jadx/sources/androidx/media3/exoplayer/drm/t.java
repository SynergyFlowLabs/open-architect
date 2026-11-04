package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface t {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final androidx.media3.exoplayer.source.t0.b f63733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0580a> f63734c;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.t$a$a, reason: collision with other inner class name */
        private static final class C0580a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f63735a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public t f63736b;

            public C0580a(Handler handler, t tVar) {
                this.f63735a = handler;
                this.f63736b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void g(Handler handler, t tVar) {
            androidx.media3.common.util.a.g(handler);
            androidx.media3.common.util.a.g(tVar);
            this.f63734c.add(new C0580a(handler, tVar));
        }

        public void h() {
            for (C0580a c0580a : this.f63734c) {
                final t tVar = c0580a.f63736b;
                k1.O1(c0580a.f63735a, new Runnable() { // from class: androidx.media3.exoplayer.drm.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f63720a;
                        tVar.L(aVar.f63732a, aVar.f63733b);
                    }
                });
            }
        }

        public void i() {
            for (C0580a c0580a : this.f63734c) {
                final t tVar = c0580a.f63736b;
                k1.O1(c0580a.f63735a, new Runnable() { // from class: androidx.media3.exoplayer.drm.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f63706a;
                        tVar.o0(aVar.f63732a, aVar.f63733b);
                    }
                });
            }
        }

        public void j() {
            for (C0580a c0580a : this.f63734c) {
                final t tVar = c0580a.f63736b;
                k1.O1(c0580a.f63735a, new Runnable() { // from class: androidx.media3.exoplayer.drm.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f63708a;
                        tVar.t0(aVar.f63732a, aVar.f63733b);
                    }
                });
            }
        }

        public void k(final int i10) {
            for (C0580a c0580a : this.f63734c) {
                final t tVar = c0580a.f63736b;
                k1.O1(c0580a.f63735a, new Runnable() { // from class: androidx.media3.exoplayer.drm.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f63714a;
                        tVar.n0(aVar.f63732a, aVar.f63733b, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0580a c0580a : this.f63734c) {
                final t tVar = c0580a.f63736b;
                k1.O1(c0580a.f63735a, new Runnable() { // from class: androidx.media3.exoplayer.drm.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f63702a;
                        tVar.p0(aVar.f63732a, aVar.f63733b, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0580a c0580a : this.f63734c) {
                final t tVar = c0580a.f63736b;
                k1.O1(c0580a.f63735a, new Runnable() { // from class: androidx.media3.exoplayer.drm.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f63727a;
                        tVar.b0(aVar.f63732a, aVar.f63733b);
                    }
                });
            }
        }

        public void n(t tVar) {
            for (C0580a c0580a : this.f63734c) {
                if (c0580a.f63736b == tVar) {
                    this.f63734c.remove(c0580a);
                }
            }
        }

        @androidx.annotation.j
        public a o(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
            return new a(this.f63734c, i10, bVar);
        }

        private a(CopyOnWriteArrayList<C0580a> copyOnWriteArrayList, int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
            this.f63734c = copyOnWriteArrayList;
            this.f63732a = i10;
            this.f63733b = bVar;
        }
    }

    default void L(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
    }

    default void b0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
    }

    default void n0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, int i11) {
    }

    default void o0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
    }

    default void p0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, Exception exc) {
    }

    default void t0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
    }
}
