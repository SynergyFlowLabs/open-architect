package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class f<R> implements c<R>, g<R> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f97314k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f97315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f97316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f97317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f97318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("this")
    @p0
    private R f97319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0("this")
    @p0
    private d f97320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b0("this")
    private boolean f97321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @b0("this")
    private boolean f97322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @b0("this")
    private boolean f97323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @b0("this")
    @p0
    private q f97324j;

    @l1
    static class a {
        a() {
        }

        void a(Object obj) {
            obj.notifyAll();
        }

        void b(Object obj, long j10) throws InterruptedException {
            obj.wait(j10);
        }
    }

    public f(int i10, int i11) {
        this(i10, i11, true, f97314k);
    }

    private synchronized R f(Long l10) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.f97317c && !isDone()) {
                m.a();
            }
            if (this.f97321g) {
                throw new CancellationException();
            }
            if (this.f97323i) {
                throw new ExecutionException(this.f97324j);
            }
            if (this.f97322h) {
                return this.f97319e;
            }
            if (l10 == null) {
                this.f97318d.b(this, 0L);
            } else if (l10.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l10.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.f97318d.b(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f97323i) {
                throw new ExecutionException(this.f97324j);
            }
            if (this.f97321g) {
                throw new CancellationException();
            }
            if (!this.f97322h) {
                throw new TimeoutException();
            }
            return this.f97319e;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.manager.i
    public void a() {
    }

    @Override // com.bumptech.glide.manager.i
    public void b() {
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean c(@p0 q qVar, Object obj, p<R> pVar, boolean z10) {
        try {
            this.f97323i = true;
            this.f97324j = qVar;
            this.f97318d.a(this);
        } catch (Throwable th2) {
            throw th2;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f97321g = true;
                this.f97318d.a(this);
                d dVar = null;
                if (z10) {
                    d dVar2 = this.f97320f;
                    this.f97320f = null;
                    dVar = dVar2;
                }
                if (dVar != null) {
                    dVar.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.target.p
    public void d(@NonNull o oVar) {
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean e(R r10, Object obj, p<R> pVar, com.bumptech.glide.load.a aVar, boolean z10) {
        try {
            this.f97322h = true;
            this.f97319e = r10;
            this.f97318d.a(this);
        } catch (Throwable th2) {
            throw th2;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return f(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.bumptech.glide.request.target.p
    @p0
    public synchronized d getRequest() {
        return this.f97320f;
    }

    @Override // com.bumptech.glide.request.target.p
    public void h(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void i(@NonNull R r10, @p0 com.bumptech.glide.request.transition.f<? super R> fVar) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f97321g;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f97321g || this.f97322h || this.f97323i;
    }

    @Override // com.bumptech.glide.manager.i
    public void m() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void n(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void p(@p0 d dVar) {
        this.f97320f = dVar;
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void q(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void s(@NonNull o oVar) {
        oVar.d(this.f97315a, this.f97316b);
    }

    f(int i10, int i11, boolean z10, a aVar) {
        this.f97315a = i10;
        this.f97316b = i11;
        this.f97317c = z10;
        this.f97318d = aVar;
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return f(Long.valueOf(timeUnit.toMillis(j10)));
    }
}
