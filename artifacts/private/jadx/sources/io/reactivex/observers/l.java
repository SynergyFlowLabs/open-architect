package io.reactivex.observers;

import io.reactivex.i0;

/* JADX INFO: loaded from: classes11.dex */
public final class l<T> implements i0<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i0<? super T> f303563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    io.reactivex.disposables.c f303564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f303565c;

    public l(@cj.f i0<? super T> i0Var) {
        this.f303563a = i0Var;
    }

    void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f303563a.d(io.reactivex.internal.disposables.e.INSTANCE);
            try {
                this.f303563a.onError(nullPointerException);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(nullPointerException, th3));
        }
    }

    void b() {
        this.f303565c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f303563a.d(io.reactivex.internal.disposables.e.INSTANCE);
            try {
                this.f303563a.onError(nullPointerException);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(nullPointerException, th3));
        }
    }

    @Override // io.reactivex.i0
    public void d(@cj.f io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.disposables.d.q(this.f303564b, cVar)) {
            this.f303564b = cVar;
            try {
                this.f303563a.d(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f303565c = true;
                try {
                    cVar.dispose();
                    io.reactivex.plugins.a.Y(th2);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, th3));
                }
            }
        }
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        this.f303564b.dispose();
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return this.f303564b.k();
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        if (this.f303565c) {
            return;
        }
        this.f303565c = true;
        if (this.f303564b == null) {
            a();
            return;
        }
        try {
            this.f303563a.onComplete();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // io.reactivex.i0
    public void onError(@cj.f Throwable th2) {
        if (this.f303565c) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303565c = true;
        if (this.f303564b != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f303563a.onError(th2);
                return;
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f303563a.d(io.reactivex.internal.disposables.e.INSTANCE);
            try {
                this.f303563a.onError(new io.reactivex.exceptions.a(th2, nullPointerException));
            } catch (Throwable th4) {
                io.reactivex.exceptions.b.b(th4);
                io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            io.reactivex.exceptions.b.b(th5);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, nullPointerException, th5));
        }
    }

    @Override // io.reactivex.i0
    public void onNext(@cj.f T t10) {
        if (this.f303565c) {
            return;
        }
        if (this.f303564b == null) {
            b();
            return;
        }
        if (t10 == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f303564b.dispose();
                onError(nullPointerException);
                return;
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                onError(new io.reactivex.exceptions.a(nullPointerException, th2));
                return;
            }
        }
        try {
            this.f303563a.onNext(t10);
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            try {
                this.f303564b.dispose();
                onError(th3);
            } catch (Throwable th4) {
                io.reactivex.exceptions.b.b(th4);
                onError(new io.reactivex.exceptions.a(th3, th4));
            }
        }
    }
}
