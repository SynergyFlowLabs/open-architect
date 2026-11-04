package io.reactivex.internal.schedulers;

import io.reactivex.j0;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final s f303312b = new s();

    static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f303313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f303314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f303315c;

        a(Runnable runnable, c cVar, long j10) {
            this.f303313a = runnable;
            this.f303314b = cVar;
            this.f303315c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f303314b.f303323d) {
                return;
            }
            long jA = this.f303314b.a(TimeUnit.MILLISECONDS);
            long j10 = this.f303315c;
            if (j10 > jA) {
                try {
                    Thread.sleep(j10 - jA);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    io.reactivex.plugins.a.Y(e10);
                    return;
                }
            }
            if (this.f303314b.f303323d) {
                return;
            }
            this.f303313a.run();
        }
    }

    static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f303316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f303317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f303318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f303319d;

        b(Runnable runnable, Long l10, int i10) {
            this.f303316a = runnable;
            this.f303317b = l10.longValue();
            this.f303318c = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iB = io.reactivex.internal.functions.b.b(this.f303317b, bVar.f303317b);
            return iB == 0 ? io.reactivex.internal.functions.b.a(this.f303318c, bVar.f303318c) : iB;
        }
    }

    static final class c extends j0.c implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final PriorityBlockingQueue<b> f303320a = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f303321b = new AtomicInteger();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f303322c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f303323d;

        final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final b f303324a;

            a(b bVar) {
                this.f303324a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f303324a.f303319d = true;
                c.this.f303320a.remove(this.f303324a);
            }
        }

        c() {
        }

        @Override // io.reactivex.j0.c
        @cj.f
        public io.reactivex.disposables.c b(@cj.f Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.j0.c
        @cj.f
        public io.reactivex.disposables.c c(@cj.f Runnable runnable, long j10, @cj.f TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j10);
            return e(new a(runnable, this, jA), jA);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f303323d = true;
        }

        io.reactivex.disposables.c e(Runnable runnable, long j10) {
            if (this.f303323d) {
                return io.reactivex.internal.disposables.e.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f303322c.incrementAndGet());
            this.f303320a.add(bVar);
            if (this.f303321b.getAndIncrement() != 0) {
                return io.reactivex.disposables.d.f(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f303323d) {
                b bVarPoll = this.f303320a.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f303321b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return io.reactivex.internal.disposables.e.INSTANCE;
                    }
                } else if (!bVarPoll.f303319d) {
                    bVarPoll.f303316a.run();
                }
            }
            this.f303320a.clear();
            return io.reactivex.internal.disposables.e.INSTANCE;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303323d;
        }
    }

    s() {
    }

    public static s l() {
        return f303312b;
    }

    @Override // io.reactivex.j0
    @cj.f
    public j0.c c() {
        return new c();
    }

    @Override // io.reactivex.j0
    @cj.f
    public io.reactivex.disposables.c e(@cj.f Runnable runnable) {
        io.reactivex.plugins.a.b0(runnable).run();
        return io.reactivex.internal.disposables.e.INSTANCE;
    }

    @Override // io.reactivex.j0
    @cj.f
    public io.reactivex.disposables.c f(@cj.f Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j10);
            io.reactivex.plugins.a.b0(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            io.reactivex.plugins.a.Y(e10);
        }
        return io.reactivex.internal.disposables.e.INSTANCE;
    }
}
