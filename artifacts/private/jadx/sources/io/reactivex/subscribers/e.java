package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class e<T> implements q<T>, w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f303851g = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v<? super T> f303852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f303853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    w f303854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f303855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    io.reactivex.internal.util.a<Object> f303856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f303857f;

    public e(v<? super T> vVar) {
        this(vVar, false);
    }

    void a() {
        io.reactivex.internal.util.a<Object> aVar;
        do {
            synchronized (this) {
                try {
                    aVar = this.f303856e;
                    if (aVar == null) {
                        this.f303855d = false;
                        return;
                    }
                    this.f303856e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!aVar.b(this.f303852a));
    }

    @Override // org.reactivestreams.w
    public void cancel() {
        this.f303854c.cancel();
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public void l(w wVar) {
        if (j.q(this.f303854c, wVar)) {
            this.f303854c = wVar;
            this.f303852a.l(this);
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        if (this.f303857f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f303857f) {
                    return;
                }
                if (!this.f303855d) {
                    this.f303857f = true;
                    this.f303855d = true;
                    this.f303852a.onComplete();
                } else {
                    io.reactivex.internal.util.a<Object> aVar = this.f303856e;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f303856e = aVar;
                    }
                    aVar.c(io.reactivex.internal.util.q.k());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        if (this.f303857f) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f303857f) {
                    if (this.f303855d) {
                        this.f303857f = true;
                        io.reactivex.internal.util.a<Object> aVar = this.f303856e;
                        if (aVar == null) {
                            aVar = new io.reactivex.internal.util.a<>(4);
                            this.f303856e = aVar;
                        }
                        Object objN = io.reactivex.internal.util.q.n(th2);
                        if (this.f303853b) {
                            aVar.c(objN);
                        } else {
                            aVar.f(objN);
                        }
                        return;
                    }
                    this.f303857f = true;
                    this.f303855d = true;
                    z10 = false;
                }
                if (z10) {
                    io.reactivex.plugins.a.Y(th2);
                } else {
                    this.f303852a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        if (this.f303857f) {
            return;
        }
        if (t10 == null) {
            this.f303854c.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f303857f) {
                    return;
                }
                if (!this.f303855d) {
                    this.f303855d = true;
                    this.f303852a.onNext(t10);
                    a();
                } else {
                    io.reactivex.internal.util.a<Object> aVar = this.f303856e;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f303856e = aVar;
                    }
                    aVar.c(io.reactivex.internal.util.q.x(t10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        this.f303854c.request(j10);
    }

    public e(v<? super T> vVar, boolean z10) {
        this.f303852a = vVar;
        this.f303853b = z10;
    }
}
