package io.reactivex.processors;

import io.reactivex.internal.util.q;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
final class g<T> extends c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final c<T> f303697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f303698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    io.reactivex.internal.util.a<Object> f303699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f303700e;

    g(c<T> cVar) {
        this.f303697b = cVar;
    }

    @Override // io.reactivex.processors.c
    @cj.g
    public Throwable M8() {
        return this.f303697b.M8();
    }

    @Override // io.reactivex.processors.c
    public boolean N8() {
        return this.f303697b.N8();
    }

    @Override // io.reactivex.processors.c
    public boolean O8() {
        return this.f303697b.O8();
    }

    @Override // io.reactivex.processors.c
    public boolean P8() {
        return this.f303697b.P8();
    }

    void R8() {
        io.reactivex.internal.util.a<Object> aVar;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f303699d;
                    if (aVar == null) {
                        this.f303698c = false;
                        return;
                    }
                    this.f303699d = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            aVar.b(this.f303697b);
        }
    }

    @Override // io.reactivex.l
    protected void k6(v<? super T> vVar) {
        this.f303697b.e(vVar);
    }

    @Override // org.reactivestreams.v
    public void l(w wVar) {
        boolean z10 = true;
        if (!this.f303700e) {
            synchronized (this) {
                try {
                    if (!this.f303700e) {
                        if (this.f303698c) {
                            io.reactivex.internal.util.a<Object> aVar = this.f303699d;
                            if (aVar == null) {
                                aVar = new io.reactivex.internal.util.a<>(4);
                                this.f303699d = aVar;
                            }
                            aVar.c(q.z(wVar));
                            return;
                        }
                        this.f303698c = true;
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            wVar.cancel();
        } else {
            this.f303697b.l(wVar);
            R8();
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        if (this.f303700e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f303700e) {
                    return;
                }
                this.f303700e = true;
                if (!this.f303698c) {
                    this.f303698c = true;
                    this.f303697b.onComplete();
                    return;
                }
                io.reactivex.internal.util.a<Object> aVar = this.f303699d;
                if (aVar == null) {
                    aVar = new io.reactivex.internal.util.a<>(4);
                    this.f303699d = aVar;
                }
                aVar.c(q.k());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        if (this.f303700e) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f303700e) {
                    this.f303700e = true;
                    if (this.f303698c) {
                        io.reactivex.internal.util.a<Object> aVar = this.f303699d;
                        if (aVar == null) {
                            aVar = new io.reactivex.internal.util.a<>(4);
                            this.f303699d = aVar;
                        }
                        aVar.f(q.n(th2));
                        return;
                    }
                    this.f303698c = true;
                    z10 = false;
                }
                if (z10) {
                    io.reactivex.plugins.a.Y(th2);
                } else {
                    this.f303697b.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        if (this.f303700e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f303700e) {
                    return;
                }
                if (!this.f303698c) {
                    this.f303698c = true;
                    this.f303697b.onNext(t10);
                    R8();
                } else {
                    io.reactivex.internal.util.a<Object> aVar = this.f303699d;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f303699d = aVar;
                    }
                    aVar.c(q.x(t10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
