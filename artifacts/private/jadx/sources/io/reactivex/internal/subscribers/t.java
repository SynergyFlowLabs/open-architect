package io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class t<T, R> extends AtomicLong implements io.reactivex.q<T>, w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f303417e = 7917814472626990048L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f303418f = Long.MIN_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f303419g = Long.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final org.reactivestreams.v<? super R> f303420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected w f303421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected R f303422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long f303423d;

    public t(org.reactivestreams.v<? super R> vVar) {
        this.f303420a = vVar;
    }

    protected final void a(R r10) {
        long j10 = this.f303423d;
        if (j10 != 0) {
            io.reactivex.internal.util.d.e(this, j10);
        }
        while (true) {
            long j11 = get();
            if ((j11 & Long.MIN_VALUE) != 0) {
                c(r10);
                return;
            }
            if ((j11 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.f303420a.onNext(r10);
                this.f303420a.onComplete();
                return;
            } else {
                this.f303422c = r10;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.f303422c = null;
                }
            }
        }
    }

    protected void c(R r10) {
    }

    public void cancel() {
        this.f303421b.cancel();
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public void l(w wVar) {
        if (io.reactivex.internal.subscriptions.j.q(this.f303421b, wVar)) {
            this.f303421b = wVar;
            this.f303420a.l(this);
        }
    }

    @Override // org.reactivestreams.w
    public final void request(long j10) {
        long j11;
        if (io.reactivex.internal.subscriptions.j.p(j10)) {
            do {
                j11 = get();
                if ((j11 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.f303420a.onNext(this.f303422c);
                        this.f303420a.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j11, io.reactivex.internal.util.d.c(j11, j10)));
            this.f303421b.request(j10);
        }
    }
}
