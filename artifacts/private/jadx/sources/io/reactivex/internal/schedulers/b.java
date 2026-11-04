package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.z1;
import io.reactivex.j0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends j0 implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final C2192b f303178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f303179e = "RxComputationThreadPool";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final k f303180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f303181g = "rx2.computation-threads";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f303182h = l(Runtime.getRuntime().availableProcessors(), Integer.getInteger(f303181g, 0).intValue());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final c f303183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f303184j = "rx2.computation-priority";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadFactory f303185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<C2192b> f303186c;

    static final class a extends j0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.internal.disposables.f f303187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.disposables.b f303188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.reactivex.internal.disposables.f f303189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f303190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f303191e;

        a(c cVar) {
            this.f303190d = cVar;
            io.reactivex.internal.disposables.f fVar = new io.reactivex.internal.disposables.f();
            this.f303187a = fVar;
            io.reactivex.disposables.b bVar = new io.reactivex.disposables.b();
            this.f303188b = bVar;
            io.reactivex.internal.disposables.f fVar2 = new io.reactivex.internal.disposables.f();
            this.f303189c = fVar2;
            fVar2.c(fVar);
            fVar2.c(bVar);
        }

        @Override // io.reactivex.j0.c
        @cj.f
        public io.reactivex.disposables.c b(@cj.f Runnable runnable) {
            return this.f303191e ? io.reactivex.internal.disposables.e.INSTANCE : this.f303190d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f303187a);
        }

        @Override // io.reactivex.j0.c
        @cj.f
        public io.reactivex.disposables.c c(@cj.f Runnable runnable, long j10, @cj.f TimeUnit timeUnit) {
            return this.f303191e ? io.reactivex.internal.disposables.e.INSTANCE : this.f303190d.e(runnable, j10, timeUnit, this.f303188b);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f303191e) {
                return;
            }
            this.f303191e = true;
            this.f303189c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303191e;
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.schedulers.b$b, reason: collision with other inner class name */
    static final class C2192b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f303192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c[] f303193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f303194c;

        C2192b(int i10, ThreadFactory threadFactory) {
            this.f303192a = i10;
            this.f303193b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f303193b[i11] = new c(threadFactory);
            }
        }

        @Override // io.reactivex.internal.schedulers.o
        public void a(int i10, o.a aVar) {
            int i11 = this.f303192a;
            if (i11 == 0) {
                for (int i12 = 0; i12 < i10; i12++) {
                    aVar.a(i12, b.f303183i);
                }
                return;
            }
            int i13 = ((int) this.f303194c) % i11;
            for (int i14 = 0; i14 < i10; i14++) {
                aVar.a(i14, new a(this.f303193b[i13]));
                i13++;
                if (i13 == i11) {
                    i13 = 0;
                }
            }
            this.f303194c = i13;
        }

        public c b() {
            int i10 = this.f303192a;
            if (i10 == 0) {
                return b.f303183i;
            }
            c[] cVarArr = this.f303193b;
            long j10 = this.f303194c;
            this.f303194c = 1 + j10;
            return cVarArr[(int) (j10 % ((long) i10))];
        }

        public void c() {
            for (c cVar : this.f303193b) {
                cVar.dispose();
            }
        }
    }

    static final class c extends i {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new k("RxComputationShutdown"));
        f303183i = cVar;
        cVar.dispose();
        k kVar = new k(f303179e, Math.max(1, Math.min(10, Integer.getInteger(f303184j, 5).intValue())), true);
        f303180f = kVar;
        C2192b c2192b = new C2192b(0, kVar);
        f303178d = c2192b;
        c2192b.c();
    }

    public b() {
        this(f303180f);
    }

    static int l(int i10, int i11) {
        if (i11 > 0 && i11 <= i10) {
            return i11;
        }
        return i10;
    }

    @Override // io.reactivex.internal.schedulers.o
    public void a(int i10, o.a aVar) {
        io.reactivex.internal.functions.b.h(i10, "number > 0 required");
        this.f303186c.get().a(i10, aVar);
    }

    @Override // io.reactivex.j0
    @cj.f
    public j0.c c() {
        return new a(this.f303186c.get().b());
    }

    @Override // io.reactivex.j0
    @cj.f
    public io.reactivex.disposables.c f(@cj.f Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f303186c.get().b().f(runnable, j10, timeUnit);
    }

    @Override // io.reactivex.j0
    @cj.f
    public io.reactivex.disposables.c g(@cj.f Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f303186c.get().b().g(runnable, j10, j11, timeUnit);
    }

    @Override // io.reactivex.j0
    public void h() {
        C2192b c2192b;
        C2192b c2192b2;
        do {
            c2192b = this.f303186c.get();
            c2192b2 = f303178d;
            if (c2192b == c2192b2) {
                return;
            }
        } while (!z1.a(this.f303186c, c2192b, c2192b2));
        c2192b.c();
    }

    @Override // io.reactivex.j0
    public void i() {
        C2192b c2192b = new C2192b(f303182h, this.f303185b);
        if (z1.a(this.f303186c, f303178d, c2192b)) {
            return;
        }
        c2192b.c();
    }

    public b(ThreadFactory threadFactory) {
        this.f303185b = threadFactory;
        this.f303186c = new AtomicReference<>(f303178d);
        i();
    }
}
