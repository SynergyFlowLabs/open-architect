package io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class k<T> extends AtomicReference<w> implements io.reactivex.q<T>, w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f303362h = 22876611072430776L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final l<T> f303363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f303364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f303365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile ej.o<T> f303366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f303367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f303368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f303369g;

    public k(l<T> lVar, int i10) {
        this.f303363a = lVar;
        this.f303364b = i10;
        this.f303365c = i10 - (i10 >> 2);
    }

    public boolean a() {
        return this.f303367e;
    }

    public ej.o<T> b() {
        return this.f303366d;
    }

    public void c() {
        if (this.f303369g != 1) {
            long j10 = this.f303368f + 1;
            if (j10 == this.f303365c) {
                this.f303368f = 0L;
                get().request(j10);
                return;
            }
            this.f303368f = j10;
        }
    }

    @Override // org.reactivestreams.w
    public void cancel() {
        io.reactivex.internal.subscriptions.j.b(this);
    }

    public void d() {
        this.f303367e = true;
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public void l(w wVar) {
        if (io.reactivex.internal.subscriptions.j.n(this, wVar)) {
            if (wVar instanceof ej.l) {
                ej.l lVar = (ej.l) wVar;
                int iP = lVar.p(3);
                if (iP == 1) {
                    this.f303369g = iP;
                    this.f303366d = lVar;
                    this.f303367e = true;
                    this.f303363a.a(this);
                    return;
                }
                if (iP == 2) {
                    this.f303369g = iP;
                    this.f303366d = lVar;
                    io.reactivex.internal.util.v.j(wVar, this.f303364b);
                    return;
                }
            }
            this.f303366d = io.reactivex.internal.util.v.c(this.f303364b);
            io.reactivex.internal.util.v.j(wVar, this.f303364b);
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        this.f303363a.a(this);
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        this.f303363a.b(this, th2);
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        if (this.f303369g == 0) {
            this.f303363a.d(this, t10);
        } else {
            this.f303363a.c();
        }
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        if (this.f303369g != 1) {
            long j11 = this.f303368f + j10;
            if (j11 < this.f303365c) {
                this.f303368f = j11;
            } else {
                this.f303368f = 0L;
                get().request(j11);
            }
        }
    }
}
