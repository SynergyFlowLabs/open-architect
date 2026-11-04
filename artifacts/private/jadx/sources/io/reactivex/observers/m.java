package io.reactivex.observers;

import io.reactivex.i0;
import io.reactivex.internal.util.q;

/* JADX INFO: loaded from: classes11.dex */
public final class m<T> implements i0<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f303566g = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i0<? super T> f303567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f303568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    io.reactivex.disposables.c f303569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f303570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    io.reactivex.internal.util.a<Object> f303571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f303572f;

    public m(@cj.f i0<? super T> i0Var) {
        this(i0Var, false);
    }

    void a() {
        io.reactivex.internal.util.a<Object> aVar;
        do {
            synchronized (this) {
                try {
                    aVar = this.f303571e;
                    if (aVar == null) {
                        this.f303570d = false;
                        return;
                    }
                    this.f303571e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!aVar.a(this.f303567a));
    }

    @Override // io.reactivex.i0
    public void d(@cj.f io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.disposables.d.q(this.f303569c, cVar)) {
            this.f303569c = cVar;
            this.f303567a.d(this);
        }
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        this.f303569c.dispose();
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return this.f303569c.k();
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        if (this.f303572f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f303572f) {
                    return;
                }
                if (!this.f303570d) {
                    this.f303572f = true;
                    this.f303570d = true;
                    this.f303567a.onComplete();
                } else {
                    io.reactivex.internal.util.a<Object> aVar = this.f303571e;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f303571e = aVar;
                    }
                    aVar.c(q.k());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.i0
    public void onError(@cj.f Throwable th2) {
        if (this.f303572f) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f303572f) {
                    if (this.f303570d) {
                        this.f303572f = true;
                        io.reactivex.internal.util.a<Object> aVar = this.f303571e;
                        if (aVar == null) {
                            int i10 = 5 | 4;
                            aVar = new io.reactivex.internal.util.a<>(4);
                            this.f303571e = aVar;
                        }
                        Object objN = q.n(th2);
                        if (this.f303568b) {
                            aVar.c(objN);
                        } else {
                            aVar.f(objN);
                        }
                        return;
                    }
                    this.f303572f = true;
                    this.f303570d = true;
                    z10 = false;
                }
                if (z10) {
                    io.reactivex.plugins.a.Y(th2);
                } else {
                    this.f303567a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.i0
    public void onNext(@cj.f T t10) {
        if (this.f303572f) {
            return;
        }
        if (t10 == null) {
            this.f303569c.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f303572f) {
                    return;
                }
                if (!this.f303570d) {
                    this.f303570d = true;
                    this.f303567a.onNext(t10);
                    a();
                } else {
                    io.reactivex.internal.util.a<Object> aVar = this.f303571e;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f303571e = aVar;
                    }
                    aVar.c(q.x(t10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m(@cj.f i0<? super T> i0Var, boolean z10) {
        this.f303567a = i0Var;
        this.f303568b = z10;
    }
}
