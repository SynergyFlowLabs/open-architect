package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class d<T> implements q<T>, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v<? super T> f303848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    w f303849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f303850c;

    public d(v<? super T> vVar) {
        this.f303848a = vVar;
    }

    void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        int i10 = 6 << 2;
        try {
            this.f303848a.l(g.INSTANCE);
            try {
                this.f303848a.onError(nullPointerException);
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
        this.f303850c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f303848a.l(g.INSTANCE);
            try {
                this.f303848a.onError(nullPointerException);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(nullPointerException, th3));
        }
    }

    @Override // org.reactivestreams.w
    public void cancel() {
        try {
            this.f303849b.cancel();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public void l(w wVar) {
        if (j.q(this.f303849b, wVar)) {
            this.f303849b = wVar;
            try {
                this.f303848a.l(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f303850c = true;
                try {
                    wVar.cancel();
                    io.reactivex.plugins.a.Y(th2);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, th3));
                }
            }
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        if (this.f303850c) {
            return;
        }
        this.f303850c = true;
        if (this.f303849b == null) {
            a();
            return;
        }
        try {
            this.f303848a.onComplete();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        if (this.f303850c) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303850c = true;
        if (this.f303849b != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f303848a.onError(th2);
                return;
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f303848a.l(g.INSTANCE);
            try {
                this.f303848a.onError(new io.reactivex.exceptions.a(th2, nullPointerException));
            } catch (Throwable th4) {
                io.reactivex.exceptions.b.b(th4);
                io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            io.reactivex.exceptions.b.b(th5);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, nullPointerException, th5));
        }
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        if (this.f303850c) {
            return;
        }
        if (this.f303849b == null) {
            b();
            return;
        }
        if (t10 == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f303849b.cancel();
                onError(nullPointerException);
                return;
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                int i10 = 7 & 0;
                onError(new io.reactivex.exceptions.a(nullPointerException, th2));
                return;
            }
        }
        try {
            this.f303848a.onNext(t10);
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            try {
                this.f303849b.cancel();
                onError(th3);
            } catch (Throwable th4) {
                io.reactivex.exceptions.b.b(th4);
                onError(new io.reactivex.exceptions.a(th3, th4));
            }
        }
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        try {
            this.f303849b.request(j10);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            try {
                this.f303849b.cancel();
                io.reactivex.plugins.a.Y(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, th3));
            }
        }
    }
}
