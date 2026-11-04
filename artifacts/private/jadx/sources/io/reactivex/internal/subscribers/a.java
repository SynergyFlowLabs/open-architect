package io.reactivex.internal.subscribers;

import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a<T, R> implements ej.a<T>, ej.l<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ej.a<? super R> f303326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected w f303327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ej.l<T> f303328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f303329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f303330e;

    public a(ej.a<? super R> aVar) {
        this.f303326a = aVar;
    }

    protected void a() {
    }

    protected boolean b() {
        return true;
    }

    protected final void c(Throwable th2) {
        io.reactivex.exceptions.b.b(th2);
        this.f303327b.cancel();
        onError(th2);
    }

    @Override // org.reactivestreams.w
    public void cancel() {
        this.f303327b.cancel();
    }

    @Override // ej.o
    public void clear() {
        this.f303328c.clear();
    }

    protected final int d(int i10) {
        ej.l<T> lVar = this.f303328c;
        if (lVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iP = lVar.p(i10);
        if (iP != 0) {
            this.f303330e = iP;
        }
        return iP;
    }

    @Override // ej.o
    public boolean isEmpty() {
        return this.f303328c.isEmpty();
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public final void l(w wVar) {
        if (io.reactivex.internal.subscriptions.j.q(this.f303327b, wVar)) {
            this.f303327b = wVar;
            if (wVar instanceof ej.l) {
                this.f303328c = (ej.l) wVar;
            }
            if (b()) {
                this.f303326a.l(this);
                a();
            }
        }
    }

    @Override // ej.o
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        if (this.f303329d) {
            return;
        }
        this.f303329d = true;
        this.f303326a.onComplete();
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        if (this.f303329d) {
            io.reactivex.plugins.a.Y(th2);
        } else {
            this.f303329d = true;
            this.f303326a.onError(th2);
        }
    }

    @Override // ej.o
    public final boolean r(R r10, R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        this.f303327b.request(j10);
    }
}
