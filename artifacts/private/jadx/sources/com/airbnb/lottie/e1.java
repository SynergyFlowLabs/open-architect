package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
public class e1<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f88203e = Executors.newCachedThreadPool(new com.airbnb.lottie.utils.e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<y0<T>> f88204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<y0<Throwable>> f88205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f88206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile c1<T> f88207d;

    private static class a<T> extends FutureTask<c1<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e1<T> f88208a;

        a(e1<T> e1Var, Callable<c1<T>> callable) {
            super(callable);
            this.f88208a = e1Var;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    this.f88208a = null;
                    return;
                }
                try {
                    this.f88208a.l(get());
                } catch (InterruptedException | ExecutionException e10) {
                    this.f88208a.l(new c1(e10));
                }
                this.f88208a = null;
            } catch (Throwable th2) {
                this.f88208a = null;
                throw th2;
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public e1(Callable<c1<T>> callable) {
        this(callable, false);
    }

    private synchronized void f(Throwable th2) {
        try {
            ArrayList arrayList = new ArrayList(this.f88205b);
            if (arrayList.isEmpty()) {
                com.airbnb.lottie.utils.d.f("Lottie encountered an error but no failure listener was added:", th2);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((y0) it.next()).onResult(th2);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f88206c.post(new Runnable() { // from class: com.airbnb.lottie.d1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88199a.h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        c1<T> c1Var = this.f88207d;
        if (c1Var == null) {
            return;
        }
        if (c1Var.b() != null) {
            i(c1Var.b());
        } else {
            f(c1Var.a());
        }
    }

    private synchronized void i(T t10) {
        Iterator it = new ArrayList(this.f88204a).iterator();
        while (it.hasNext()) {
            ((y0) it.next()).onResult(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(@androidx.annotation.p0 c1<T> c1Var) {
        if (this.f88207d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f88207d = c1Var;
        g();
    }

    public synchronized e1<T> c(y0<Throwable> y0Var) {
        try {
            c1<T> c1Var = this.f88207d;
            if (c1Var != null && c1Var.a() != null) {
                y0Var.onResult(c1Var.a());
            }
            this.f88205b.add(y0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized e1<T> d(y0<T> y0Var) {
        try {
            c1<T> c1Var = this.f88207d;
            if (c1Var != null && c1Var.b() != null) {
                y0Var.onResult(c1Var.b());
            }
            this.f88204a.add(y0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @androidx.annotation.p0
    public c1<T> e() {
        return this.f88207d;
    }

    public synchronized e1<T> j(y0<Throwable> y0Var) {
        try {
            this.f88205b.remove(y0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized e1<T> k(y0<T> y0Var) {
        try {
            this.f88204a.remove(y0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public e1(T t10) {
        this.f88204a = new LinkedHashSet(1);
        this.f88205b = new LinkedHashSet(1);
        this.f88206c = new Handler(Looper.getMainLooper());
        int i10 = 5 ^ 0;
        this.f88207d = null;
        l(new c1<>(t10));
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    e1(Callable<c1<T>> callable, boolean z10) {
        this.f88204a = new LinkedHashSet(1);
        this.f88205b = new LinkedHashSet(1);
        this.f88206c = new Handler(Looper.getMainLooper());
        this.f88207d = null;
        if (z10) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th2) {
                l(new c1<>(th2));
                return;
            }
        }
        f88203e.execute(new a(this, callable));
    }
}
