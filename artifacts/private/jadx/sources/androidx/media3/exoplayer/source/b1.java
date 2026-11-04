package androidx.media3.exoplayer.source;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface b1 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final t0.b f64831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0592a> f64832c;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.source.b1$a$a, reason: collision with other inner class name */
        private static final class C0592a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f64833a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public b1 f64834b;

            public C0592a(Handler handler, b1 b1Var) {
                this.f64833a = handler;
                this.f64834b = b1Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void A(b1 b1Var) {
            for (C0592a c0592a : this.f64832c) {
                if (c0592a.f64834b == b1Var) {
                    this.f64832c.remove(c0592a);
                }
            }
        }

        public void B(int i10, long j10, long j11) {
            C(new h0(1, i10, null, 3, null, androidx.media3.common.util.k1.A2(j10), androidx.media3.common.util.k1.A2(j11)));
        }

        public void C(final h0 h0Var) {
            final t0.b bVar = (t0.b) androidx.media3.common.util.a.g(this.f64831b);
            i(new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.source.z0
                @Override // androidx.media3.common.util.o
                public final void accept(Object obj) {
                    b1 b1Var = (b1) obj;
                    b1Var.g0(this.f65589a.f64830a, bVar, h0Var);
                }
            });
        }

        @androidx.annotation.j
        public a D(int i10, @androidx.annotation.p0 t0.b bVar) {
            return new a(this.f64832c, i10, bVar);
        }

        @androidx.annotation.j
        @Deprecated
        public a E(int i10, @androidx.annotation.p0 t0.b bVar, long j10) {
            return new a(this.f64832c, i10, bVar);
        }

        public void h(Handler handler, b1 b1Var) {
            androidx.media3.common.util.a.g(handler);
            androidx.media3.common.util.a.g(b1Var);
            this.f64832c.add(new C0592a(handler, b1Var));
        }

        public void i(final androidx.media3.common.util.o<b1> oVar) {
            for (C0592a c0592a : this.f64832c) {
                final b1 b1Var = c0592a.f64834b;
                androidx.media3.common.util.k1.O1(c0592a.f64833a, new Runnable() { // from class: androidx.media3.exoplayer.source.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.accept(b1Var);
                    }
                });
            }
        }

        public void j(int i10, @androidx.annotation.p0 androidx.media3.common.w wVar, int i11, @androidx.annotation.p0 Object obj, long j10) {
            k(new h0(1, i10, wVar, i11, obj, androidx.media3.common.util.k1.A2(j10), -9223372036854775807L));
        }

        public void k(final h0 h0Var) {
            i(new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.source.u0
                @Override // androidx.media3.common.util.o
                public final void accept(Object obj) {
                    b1.a aVar = this.f65473a;
                    ((b1) obj).U(aVar.f64830a, aVar.f64831b, h0Var);
                }
            });
        }

        public void l(d0 d0Var, int i10) {
            m(d0Var, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void m(d0 d0Var, int i10, int i11, @androidx.annotation.p0 androidx.media3.common.w wVar, int i12, @androidx.annotation.p0 Object obj, long j10, long j11) {
            n(d0Var, new h0(i10, i11, wVar, i12, obj, androidx.media3.common.util.k1.A2(j10), androidx.media3.common.util.k1.A2(j11)));
        }

        public void n(final d0 d0Var, final h0 h0Var) {
            i(new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.source.y0
                @Override // androidx.media3.common.util.o
                public final void accept(Object obj) {
                    b1.a aVar = this.f65565a;
                    ((b1) obj).R(aVar.f64830a, aVar.f64831b, d0Var, h0Var);
                }
            });
        }

        public void o(d0 d0Var, int i10) {
            p(d0Var, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void p(d0 d0Var, int i10, int i11, @androidx.annotation.p0 androidx.media3.common.w wVar, int i12, @androidx.annotation.p0 Object obj, long j10, long j11) {
            q(d0Var, new h0(i10, i11, wVar, i12, obj, androidx.media3.common.util.k1.A2(j10), androidx.media3.common.util.k1.A2(j11)));
        }

        public void q(final d0 d0Var, final h0 h0Var) {
            i(new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.source.w0
                @Override // androidx.media3.common.util.o
                public final void accept(Object obj) {
                    b1.a aVar = this.f65502a;
                    ((b1) obj).s0(aVar.f64830a, aVar.f64831b, d0Var, h0Var);
                }
            });
        }

        public void r(d0 d0Var, int i10, int i11, @androidx.annotation.p0 androidx.media3.common.w wVar, int i12, @androidx.annotation.p0 Object obj, long j10, long j11, IOException iOException, boolean z10) {
            t(d0Var, new h0(i10, i11, wVar, i12, obj, androidx.media3.common.util.k1.A2(j10), androidx.media3.common.util.k1.A2(j11)), iOException, z10);
        }

        public void s(d0 d0Var, int i10, IOException iOException, boolean z10) {
            r(d0Var, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void t(final d0 d0Var, final h0 h0Var, final IOException iOException, final boolean z10) {
            i(new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.source.x0
                @Override // androidx.media3.common.util.o
                public final void accept(Object obj) {
                    b1.a aVar = this.f65521a;
                    ((b1) obj).P(aVar.f64830a, aVar.f64831b, d0Var, h0Var, iOException, z10);
                }
            });
        }

        @Deprecated
        public void u(d0 d0Var, int i10) {
            v(d0Var, i10, 0);
        }

        public void v(d0 d0Var, int i10, int i11) {
            x(d0Var, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i11);
        }

        @Deprecated
        public void w(d0 d0Var, int i10, int i11, @androidx.annotation.p0 androidx.media3.common.w wVar, int i12, @androidx.annotation.p0 Object obj, long j10, long j11) {
            y(d0Var, new h0(i10, i11, wVar, i12, obj, androidx.media3.common.util.k1.A2(j10), androidx.media3.common.util.k1.A2(j11)));
        }

        public void x(d0 d0Var, int i10, int i11, @androidx.annotation.p0 androidx.media3.common.w wVar, int i12, @androidx.annotation.p0 Object obj, long j10, long j11, int i13) {
            z(d0Var, new h0(i10, i11, wVar, i12, obj, androidx.media3.common.util.k1.A2(j10), androidx.media3.common.util.k1.A2(j11)), i13);
        }

        @Deprecated
        public void y(d0 d0Var, h0 h0Var) {
            z(d0Var, h0Var, 0);
        }

        public void z(final d0 d0Var, final h0 h0Var, final int i10) {
            i(new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.source.v0
                @Override // androidx.media3.common.util.o
                public final void accept(Object obj) {
                    b1.a aVar = this.f65481a;
                    ((b1) obj).m0(aVar.f64830a, aVar.f64831b, d0Var, h0Var, i10);
                }
            });
        }

        private a(CopyOnWriteArrayList<C0592a> copyOnWriteArrayList, int i10, @androidx.annotation.p0 t0.b bVar) {
            this.f64832c = copyOnWriteArrayList;
            this.f64830a = i10;
            this.f64831b = bVar;
        }
    }

    default void P(int i10, @androidx.annotation.p0 t0.b bVar, d0 d0Var, h0 h0Var, IOException iOException, boolean z10) {
    }

    default void R(int i10, @androidx.annotation.p0 t0.b bVar, d0 d0Var, h0 h0Var) {
    }

    default void U(int i10, @androidx.annotation.p0 t0.b bVar, h0 h0Var) {
    }

    default void g0(int i10, t0.b bVar, h0 h0Var) {
    }

    default void m0(int i10, @androidx.annotation.p0 t0.b bVar, d0 d0Var, h0 h0Var, int i11) {
    }

    default void s0(int i10, @androidx.annotation.p0 t0.b bVar, d0 d0Var, h0 h0Var) {
    }
}
