package io.reactivex.internal.schedulers;

import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public class q extends j0 implements io.reactivex.disposables.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final io.reactivex.disposables.c f303286e = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final io.reactivex.disposables.c f303287f = io.reactivex.disposables.d.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0 f303288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.reactivex.processors.c<io.reactivex.l<io.reactivex.c>> f303289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.reactivex.disposables.c f303290d;

    static final class a implements dj.o<f, io.reactivex.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j0.c f303291a;

        /* JADX INFO: renamed from: io.reactivex.internal.schedulers.q$a$a, reason: collision with other inner class name */
        final class C2194a extends io.reactivex.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final f f303292a;

            C2194a(f fVar) {
                this.f303292a = fVar;
            }

            @Override // io.reactivex.c
            protected void J0(io.reactivex.f fVar) {
                fVar.d(this.f303292a);
                this.f303292a.a(a.this.f303291a, fVar);
            }
        }

        a(j0.c cVar) {
            this.f303291a = cVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.c apply(f fVar) {
            return new C2194a(fVar);
        }
    }

    static class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f303294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f303295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TimeUnit f303296c;

        b(Runnable runnable, long j10, TimeUnit timeUnit) {
            this.f303294a = runnable;
            this.f303295b = j10;
            this.f303296c = timeUnit;
        }

        @Override // io.reactivex.internal.schedulers.q.f
        protected io.reactivex.disposables.c b(j0.c cVar, io.reactivex.f fVar) {
            return cVar.c(new d(this.f303294a, fVar), this.f303295b, this.f303296c);
        }
    }

    static class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f303297a;

        c(Runnable runnable) {
            this.f303297a = runnable;
        }

        @Override // io.reactivex.internal.schedulers.q.f
        protected io.reactivex.disposables.c b(j0.c cVar, io.reactivex.f fVar) {
            return cVar.b(new d(this.f303297a, fVar));
        }
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f303298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f303299b;

        d(Runnable runnable, io.reactivex.f fVar) {
            this.f303299b = runnable;
            this.f303298a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f303299b.run();
            } finally {
                this.f303298a.onComplete();
            }
        }
    }

    static final class e extends j0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f303300a = new AtomicBoolean();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.processors.c<f> f303301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j0.c f303302c;

        e(io.reactivex.processors.c<f> cVar, j0.c cVar2) {
            this.f303301b = cVar;
            this.f303302c = cVar2;
        }

        @Override // io.reactivex.j0.c
        @cj.f
        public io.reactivex.disposables.c b(@cj.f Runnable runnable) {
            c cVar = new c(runnable);
            this.f303301b.onNext(cVar);
            return cVar;
        }

        @Override // io.reactivex.j0.c
        @cj.f
        public io.reactivex.disposables.c c(@cj.f Runnable runnable, long j10, @cj.f TimeUnit timeUnit) {
            b bVar = new b(runnable, j10, timeUnit);
            this.f303301b.onNext(bVar);
            return bVar;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f303300a.compareAndSet(false, true)) {
                this.f303301b.onComplete();
                this.f303302c.dispose();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303300a.get();
        }
    }

    static abstract class f extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.disposables.c {
        f() {
            super(q.f303286e);
        }

        void a(j0.c cVar, io.reactivex.f fVar) {
            io.reactivex.disposables.c cVar2;
            io.reactivex.disposables.c cVar3 = get();
            if (cVar3 != q.f303287f && cVar3 == (cVar2 = q.f303286e)) {
                io.reactivex.disposables.c cVarB = b(cVar, fVar);
                if (compareAndSet(cVar2, cVarB)) {
                    return;
                }
                cVarB.dispose();
            }
        }

        protected abstract io.reactivex.disposables.c b(j0.c cVar, io.reactivex.f fVar);

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.disposables.c cVar;
            io.reactivex.disposables.c cVar2 = q.f303287f;
            do {
                cVar = get();
                if (cVar == q.f303287f) {
                    return;
                }
            } while (!compareAndSet(cVar, cVar2));
            if (cVar != q.f303286e) {
                cVar.dispose();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get().k();
        }
    }

    static final class g implements io.reactivex.disposables.c {
        g() {
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(dj.o<io.reactivex.l<io.reactivex.l<io.reactivex.c>>, io.reactivex.c> oVar, j0 j0Var) {
        this.f303288b = j0Var;
        io.reactivex.processors.c cVarQ8 = io.reactivex.processors.h.S8().Q8();
        this.f303289c = cVarQ8;
        try {
            this.f303290d = ((io.reactivex.c) oVar.apply(cVarQ8)).G0();
        } catch (Throwable th2) {
            throw io.reactivex.internal.util.k.f(th2);
        }
    }

    @Override // io.reactivex.j0
    @cj.f
    public j0.c c() {
        j0.c cVarC = this.f303288b.c();
        io.reactivex.processors.c<T> cVarQ8 = io.reactivex.processors.h.S8().Q8();
        io.reactivex.l<io.reactivex.c> lVarK3 = cVarQ8.K3(new a(cVarC));
        e eVar = new e(cVarQ8, cVarC);
        this.f303289c.onNext(lVarK3);
        return eVar;
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        this.f303290d.dispose();
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return this.f303290d.k();
    }
}
