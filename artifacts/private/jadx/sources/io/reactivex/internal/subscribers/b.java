package io.reactivex.internal.subscribers;

import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b<T, R> implements io.reactivex.q<T>, ej.l<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final org.reactivestreams.v<? super R> f303331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected w f303332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ej.l<T> f303333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f303334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f303335e;

    public b(org.reactivestreams.v<? super R> vVar) {
        this.f303331a = vVar;
    }

    protected void a() {
    }

    protected boolean b() {
        return true;
    }

    protected final void c(Throwable th2) {
        io.reactivex.exceptions.b.b(th2);
        this.f303332b.cancel();
        onError(th2);
    }

    @Override // org.reactivestreams.w
    public void cancel() {
        this.f303332b.cancel();
    }

    public void clear() {
        this.f303333c.clear();
    }

    protected final int d(int i10) {
        ej.l<T> lVar = this.f303333c;
        if (lVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iP = lVar.p(i10);
        if (iP != 0) {
            this.f303335e = iP;
        }
        return iP;
    }

    @Override // ej.o
    public boolean isEmpty() {
        return this.f303333c.isEmpty();
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public final void l(w wVar) {
        if (io.reactivex.internal.subscriptions.j.q(this.f303332b, wVar)) {
            this.f303332b = wVar;
            if (wVar instanceof ej.l) {
                this.f303333c = (ej.l) wVar;
            }
            if (b()) {
                this.f303331a.l(this);
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
        if (this.f303334d) {
            return;
        }
        this.f303334d = true;
        this.f303331a.onComplete();
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        if (this.f303334d) {
            io.reactivex.plugins.a.Y(th2);
        } else {
            this.f303334d = true;
            this.f303331a.onError(th2);
        }
    }

    @Override // ej.o
    public final boolean r(R r10, R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        this.f303332b.request(j10);
    }
}
