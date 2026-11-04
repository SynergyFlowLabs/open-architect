package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Message;
import io.reactivex.disposables.c;
import io.reactivex.disposables.d;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
final class b extends j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f298645b;

    private static final class a extends j0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f298646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f298647b;

        a(Handler handler) {
            this.f298646a = handler;
        }

        @Override // io.reactivex.j0.c
        public c c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f298647b) {
                return d.a();
            }
            RunnableC2119b runnableC2119b = new RunnableC2119b(this.f298646a, io.reactivex.plugins.a.b0(runnable));
            Message messageObtain = Message.obtain(this.f298646a, runnableC2119b);
            messageObtain.obj = this;
            this.f298646a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f298647b) {
                return runnableC2119b;
            }
            this.f298646a.removeCallbacks(runnableC2119b);
            return d.a();
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f298647b = true;
            this.f298646a.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298647b;
        }
    }

    /* JADX INFO: renamed from: io.reactivex.android.schedulers.b$b, reason: collision with other inner class name */
    private static final class RunnableC2119b implements Runnable, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f298648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f298649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f298650c;

        RunnableC2119b(Handler handler, Runnable runnable) {
            this.f298648a = handler;
            this.f298649b = runnable;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f298650c = true;
            this.f298648a.removeCallbacks(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298650c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f298649b.run();
            } catch (Throwable th2) {
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    b(Handler handler) {
        this.f298645b = handler;
    }

    @Override // io.reactivex.j0
    public j0.c c() {
        return new a(this.f298645b);
    }

    @Override // io.reactivex.j0
    public c f(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC2119b runnableC2119b = new RunnableC2119b(this.f298645b, io.reactivex.plugins.a.b0(runnable));
        this.f298645b.postDelayed(runnableC2119b, timeUnit.toMillis(j10));
        return runnableC2119b;
    }
}
