package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f64689a = 5;

    private static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f64690e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f64691f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f64692g = 3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f64693h = 4;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final c f64694i = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.exoplayer.source.t0.a f64695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.common.k0 f64696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.common.util.u f64697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.google.common.util.concurrent.m2<androidx.media3.exoplayer.source.h2> f64698d = com.google.common.util.concurrent.m2.F();

        private final class a implements Handler.Callback {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final int f64699e = 100;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final C0586a f64700a = new C0586a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private androidx.media3.exoplayer.source.t0 f64701b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private androidx.media3.exoplayer.source.s0 f64702c;

            /* JADX INFO: renamed from: androidx.media3.exoplayer.s4$b$a$a, reason: collision with other inner class name */
            private final class C0586a implements androidx.media3.exoplayer.source.t0.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final C0587a f64704a = new C0587a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final androidx.media3.exoplayer.upstream.b f64705b = new androidx.media3.exoplayer.upstream.i(true, 65536);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f64706c;

                /* JADX INFO: renamed from: androidx.media3.exoplayer.s4$b$a$a$a, reason: collision with other inner class name */
                private final class C0587a implements androidx.media3.exoplayer.source.s0.a {
                    private C0587a() {
                    }

                    @Override // androidx.media3.exoplayer.source.t1.a
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void l(androidx.media3.exoplayer.source.s0 s0Var) {
                        b.this.f64697c.a(3).a();
                    }

                    @Override // androidx.media3.exoplayer.source.s0.a
                    public void j(androidx.media3.exoplayer.source.s0 s0Var) {
                        b.this.f64698d.B(s0Var.m());
                        b.this.f64697c.a(4).a();
                    }
                }

                public C0586a() {
                }

                @Override // androidx.media3.exoplayer.source.t0.c
                public void B(androidx.media3.exoplayer.source.t0 t0Var, androidx.media3.common.z3 z3Var) {
                    if (this.f64706c) {
                        return;
                    }
                    this.f64706c = true;
                    a.this.f64702c = t0Var.x(new androidx.media3.exoplayer.source.t0.b(z3Var.s(0)), this.f64705b, 0L);
                    a.this.f64702c.v(this.f64704a, 0L);
                }
            }

            public a() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i10 = message.what;
                if (i10 == 1) {
                    androidx.media3.exoplayer.source.t0 t0VarH = b.this.f64695a.h((androidx.media3.common.k0) message.obj);
                    this.f64701b = t0VarH;
                    t0VarH.C(this.f64700a, null, androidx.media3.exoplayer.analytics.j4.f63008d);
                    b.this.f64697c.i(2);
                    return true;
                }
                if (i10 == 2) {
                    try {
                        androidx.media3.exoplayer.source.s0 s0Var = this.f64702c;
                        if (s0Var == null) {
                            ((androidx.media3.exoplayer.source.t0) androidx.media3.common.util.a.g(this.f64701b)).a();
                        } else {
                            s0Var.o();
                        }
                        b.this.f64697c.l(2, 100);
                    } catch (Exception e10) {
                        b.this.f64698d.C(e10);
                        b.this.f64697c.a(4).a();
                    }
                    return true;
                }
                if (i10 == 3) {
                    ((androidx.media3.exoplayer.source.s0) androidx.media3.common.util.a.g(this.f64702c)).k(new t3.b().f(0L).d());
                    return true;
                }
                if (i10 != 4) {
                    return false;
                }
                if (this.f64702c != null) {
                    ((androidx.media3.exoplayer.source.t0) androidx.media3.common.util.a.g(this.f64701b)).l(this.f64702c);
                }
                ((androidx.media3.exoplayer.source.t0) androidx.media3.common.util.a.g(this.f64701b)).n(this.f64700a);
                b.this.f64697c.c(null);
                b.f64694i.c();
                return true;
            }
        }

        public b(androidx.media3.exoplayer.source.t0.a aVar, androidx.media3.common.k0 k0Var, androidx.media3.common.util.j jVar) {
            this.f64695a = aVar;
            this.f64696b = k0Var;
            this.f64697c = jVar.d(f64694i.a(), new a());
        }

        public com.google.common.util.concurrent.t1<androidx.media3.exoplayer.source.h2> e() {
            f64694i.d(this);
            return this.f64698d;
        }

        public void f() {
            this.f64697c.b(1, this.f64696b).a();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final AtomicInteger f64709d = new AtomicInteger(5);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Deque<b> f64710a = new ArrayDeque();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private HandlerThread f64711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f64712c;

        @androidx.annotation.b0("this")
        private void b() {
            if (!this.f64710a.isEmpty() && this.f64712c - this.f64710a.size() < f64709d.get()) {
                this.f64710a.removeFirst().f();
            }
        }

        public synchronized Looper a() {
            try {
                if (this.f64711b == null) {
                    androidx.media3.common.util.a.i(this.f64712c == 0);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
                    this.f64711b = handlerThread;
                    handlerThread.start();
                }
                this.f64712c++;
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f64711b.getLooper();
        }

        public synchronized void c() {
            try {
                int i10 = this.f64712c - 1;
                this.f64712c = i10;
                if (i10 == 0) {
                    ((HandlerThread) androidx.media3.common.util.a.g(this.f64711b)).quit();
                    this.f64711b = null;
                } else {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void d(b bVar) {
            try {
                this.f64710a.addLast(bVar);
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private s4() {
    }

    public static com.google.common.util.concurrent.t1<androidx.media3.exoplayer.source.h2> a(Context context, androidx.media3.common.k0 k0Var) {
        return b(context, k0Var, androidx.media3.common.util.j.f61520a);
    }

    @androidx.annotation.l1
    static com.google.common.util.concurrent.t1<androidx.media3.exoplayer.source.h2> b(Context context, androidx.media3.common.k0 k0Var, androidx.media3.common.util.j jVar) {
        return d(new androidx.media3.exoplayer.source.q(context, new androidx.media3.extractor.l().w(6)), k0Var, jVar);
    }

    public static com.google.common.util.concurrent.t1<androidx.media3.exoplayer.source.h2> c(androidx.media3.exoplayer.source.t0.a aVar, androidx.media3.common.k0 k0Var) {
        return d(aVar, k0Var, androidx.media3.common.util.j.f61520a);
    }

    private static com.google.common.util.concurrent.t1<androidx.media3.exoplayer.source.h2> d(androidx.media3.exoplayer.source.t0.a aVar, androidx.media3.common.k0 k0Var, androidx.media3.common.util.j jVar) {
        return new b(aVar, k0Var, jVar).e();
    }

    public static void e(int i10) {
        androidx.media3.common.util.a.a(i10 >= 1);
        c.f64709d.set(i10);
    }
}
