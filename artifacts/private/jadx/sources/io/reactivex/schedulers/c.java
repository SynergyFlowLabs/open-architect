package io.reactivex.schedulers;

import cj.f;
import io.reactivex.internal.disposables.e;
import io.reactivex.j0;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Queue<b> f303723b = new PriorityBlockingQueue(11);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f303724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile long f303725d;

    final class a extends j0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile boolean f303726a;

        /* JADX INFO: renamed from: io.reactivex.schedulers.c$a$a, reason: collision with other inner class name */
        final class RunnableC2202a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final b f303728a;

            RunnableC2202a(b bVar) {
                this.f303728a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f303723b.remove(this.f303728a);
            }
        }

        a() {
        }

        @Override // io.reactivex.j0.c
        public long a(@f TimeUnit timeUnit) {
            return c.this.d(timeUnit);
        }

        @Override // io.reactivex.j0.c
        @f
        public io.reactivex.disposables.c b(@f Runnable runnable) {
            if (this.f303726a) {
                return e.INSTANCE;
            }
            c cVar = c.this;
            long j10 = cVar.f303724c;
            cVar.f303724c = 1 + j10;
            b bVar = new b(this, 0L, runnable, j10);
            c.this.f303723b.add(bVar);
            return io.reactivex.disposables.d.f(new RunnableC2202a(bVar));
        }

        @Override // io.reactivex.j0.c
        @f
        public io.reactivex.disposables.c c(@f Runnable runnable, long j10, @f TimeUnit timeUnit) {
            if (this.f303726a) {
                return e.INSTANCE;
            }
            long nanos = c.this.f303725d + timeUnit.toNanos(j10);
            c cVar = c.this;
            long j11 = cVar.f303724c;
            cVar.f303724c = 1 + j11;
            b bVar = new b(this, nanos, runnable, j11);
            c.this.f303723b.add(bVar);
            return io.reactivex.disposables.d.f(new RunnableC2202a(bVar));
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f303726a = true;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303726a;
        }
    }

    static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f303730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f303731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a f303732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f303733d;

        b(a aVar, long j10, Runnable runnable, long j11) {
            this.f303730a = j10;
            this.f303731b = runnable;
            this.f303732c = aVar;
            this.f303733d = j11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            long j10 = this.f303730a;
            long j11 = bVar.f303730a;
            return j10 == j11 ? io.reactivex.internal.functions.b.b(this.f303733d, bVar.f303733d) : io.reactivex.internal.functions.b.b(j10, j11);
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.f303730a), this.f303731b.toString());
        }
    }

    public c() {
    }

    private void o(long j10) {
        while (true) {
            b bVarPeek = this.f303723b.peek();
            if (bVarPeek == null) {
                break;
            }
            long j11 = bVarPeek.f303730a;
            if (j11 > j10) {
                break;
            }
            if (j11 == 0) {
                j11 = this.f303725d;
            }
            this.f303725d = j11;
            this.f303723b.remove(bVarPeek);
            if (!bVarPeek.f303732c.f303726a) {
                bVarPeek.f303731b.run();
            }
        }
        this.f303725d = j10;
    }

    @Override // io.reactivex.j0
    @f
    public j0.c c() {
        return new a();
    }

    @Override // io.reactivex.j0
    public long d(@f TimeUnit timeUnit) {
        return timeUnit.convert(this.f303725d, TimeUnit.NANOSECONDS);
    }

    public void l(long j10, TimeUnit timeUnit) {
        m(this.f303725d + timeUnit.toNanos(j10), TimeUnit.NANOSECONDS);
    }

    public void m(long j10, TimeUnit timeUnit) {
        o(timeUnit.toNanos(j10));
    }

    public void n() {
        o(this.f303725d);
    }

    public c(long j10, TimeUnit timeUnit) {
        this.f303725d = timeUnit.toNanos(j10);
    }
}
