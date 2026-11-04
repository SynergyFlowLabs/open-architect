package io.reactivex.subjects;

import io.reactivex.i0;
import io.reactivex.internal.util.q;

/* JADX INFO: loaded from: classes11.dex */
final class g<T> extends i<T> implements io.reactivex.internal.util.a.InterfaceC2195a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i<T> f303819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f303820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    io.reactivex.internal.util.a<Object> f303821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f303822d;

    g(i<T> iVar) {
        this.f303819a = iVar;
    }

    @Override // io.reactivex.b0
    protected void H5(i0<? super T> i0Var) {
        this.f303819a.a(i0Var);
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        boolean z10 = true;
        if (!this.f303822d) {
            synchronized (this) {
                try {
                    if (!this.f303822d) {
                        if (this.f303820b) {
                            io.reactivex.internal.util.a<Object> aVar = this.f303821c;
                            if (aVar == null) {
                                int i10 = 4 << 4;
                                aVar = new io.reactivex.internal.util.a<>(4);
                                this.f303821c = aVar;
                            }
                            aVar.c(q.l(cVar));
                            return;
                        }
                        this.f303820b = true;
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            cVar.dispose();
        } else {
            this.f303819a.d(cVar);
            m8();
        }
    }

    @Override // io.reactivex.subjects.i
    @cj.g
    public Throwable h8() {
        return this.f303819a.h8();
    }

    @Override // io.reactivex.subjects.i
    public boolean i8() {
        return this.f303819a.i8();
    }

    @Override // io.reactivex.subjects.i
    public boolean j8() {
        return this.f303819a.j8();
    }

    @Override // io.reactivex.subjects.i
    public boolean k8() {
        return this.f303819a.k8();
    }

    void m8() {
        io.reactivex.internal.util.a<Object> aVar;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f303821c;
                    if (aVar == null) {
                        this.f303820b = false;
                        return;
                    }
                    this.f303821c = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            aVar.d(this);
        }
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        if (this.f303822d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f303822d) {
                    return;
                }
                this.f303822d = true;
                if (!this.f303820b) {
                    this.f303820b = true;
                    this.f303819a.onComplete();
                    return;
                }
                io.reactivex.internal.util.a<Object> aVar = this.f303821c;
                if (aVar == null) {
                    aVar = new io.reactivex.internal.util.a<>(4);
                    this.f303821c = aVar;
                }
                aVar.c(q.k());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        if (this.f303822d) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f303822d) {
                    this.f303822d = true;
                    if (this.f303820b) {
                        io.reactivex.internal.util.a<Object> aVar = this.f303821c;
                        if (aVar == null) {
                            aVar = new io.reactivex.internal.util.a<>(4);
                            this.f303821c = aVar;
                        }
                        aVar.f(q.n(th2));
                        return;
                    }
                    this.f303820b = true;
                    z10 = false;
                }
                if (z10) {
                    io.reactivex.plugins.a.Y(th2);
                } else {
                    this.f303819a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        if (this.f303822d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f303822d) {
                    return;
                }
                if (!this.f303820b) {
                    this.f303820b = true;
                    this.f303819a.onNext(t10);
                    m8();
                } else {
                    io.reactivex.internal.util.a<Object> aVar = this.f303821c;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f303821c = aVar;
                    }
                    aVar.c(q.x(t10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.internal.util.a.InterfaceC2195a, dj.r
    public boolean test(Object obj) {
        return q.d(obj, this.f303819a);
    }
}
