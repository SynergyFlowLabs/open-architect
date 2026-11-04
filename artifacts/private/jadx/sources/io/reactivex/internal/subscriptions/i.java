package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public class i extends AtomicInteger implements w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f303460i = -2189523197179400958L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    w f303461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f303462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<w> f303463c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicLong f303464d = new AtomicLong();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicLong f303465e = new AtomicLong();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f303466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile boolean f303467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f303468h;

    public i(boolean z10) {
        this.f303466f = z10;
    }

    final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        d();
    }

    public void cancel() {
        if (!this.f303467g) {
            this.f303467g = true;
            c();
        }
    }

    final void d() {
        int iAddAndGet = 1;
        long jC = 0;
        w wVar = null;
        do {
            w andSet = this.f303463c.get();
            if (andSet != null) {
                andSet = this.f303463c.getAndSet(null);
            }
            long andSet2 = this.f303464d.get();
            if (andSet2 != 0) {
                andSet2 = this.f303464d.getAndSet(0L);
            }
            long andSet3 = this.f303465e.get();
            if (andSet3 != 0) {
                andSet3 = this.f303465e.getAndSet(0L);
            }
            w wVar2 = this.f303461a;
            if (this.f303467g) {
                if (wVar2 != null) {
                    wVar2.cancel();
                    this.f303461a = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jC2 = this.f303462b;
                if (jC2 != Long.MAX_VALUE) {
                    jC2 = io.reactivex.internal.util.d.c(jC2, andSet2);
                    if (jC2 != Long.MAX_VALUE) {
                        jC2 -= andSet3;
                        if (jC2 < 0) {
                            j.f(jC2);
                            jC2 = 0;
                        }
                    }
                    this.f303462b = jC2;
                }
                if (andSet != null) {
                    if (wVar2 != null && this.f303466f) {
                        wVar2.cancel();
                    }
                    this.f303461a = andSet;
                    if (jC2 != 0) {
                        jC = io.reactivex.internal.util.d.c(jC, jC2);
                        wVar = andSet;
                    }
                } else if (wVar2 != null && andSet2 != 0) {
                    jC = io.reactivex.internal.util.d.c(jC, andSet2);
                    wVar = wVar2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jC != 0) {
            wVar.request(jC);
        }
    }

    public final boolean e() {
        return this.f303467g;
    }

    public final boolean f() {
        return this.f303468h;
    }

    public final void g(long j10) {
        if (this.f303468h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            io.reactivex.internal.util.d.a(this.f303465e, j10);
            c();
            return;
        }
        long j11 = this.f303462b;
        if (j11 != Long.MAX_VALUE) {
            long j12 = j11 - j10;
            if (j12 < 0) {
                j.f(j12);
                j12 = 0;
            }
            this.f303462b = j12;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        d();
    }

    public final void h(w wVar) {
        if (this.f303467g) {
            wVar.cancel();
            return;
        }
        io.reactivex.internal.functions.b.g(wVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            w andSet = this.f303463c.getAndSet(wVar);
            if (andSet != null && this.f303466f) {
                andSet.cancel();
            }
            c();
            return;
        }
        w wVar2 = this.f303461a;
        if (wVar2 != null && this.f303466f) {
            wVar2.cancel();
        }
        this.f303461a = wVar;
        long j10 = this.f303462b;
        if (decrementAndGet() != 0) {
            d();
        }
        if (j10 != 0) {
            wVar.request(j10);
        }
    }

    @Override // org.reactivestreams.w
    public final void request(long j10) {
        if (!j.p(j10) || this.f303468h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            io.reactivex.internal.util.d.a(this.f303464d, j10);
            c();
            return;
        }
        long j11 = this.f303462b;
        if (j11 != Long.MAX_VALUE) {
            long jC = io.reactivex.internal.util.d.c(j11, j10);
            this.f303462b = jC;
            if (jC == Long.MAX_VALUE) {
                this.f303468h = true;
            }
        }
        w wVar = this.f303461a;
        if (decrementAndGet() != 0) {
            d();
        }
        if (wVar != null) {
            wVar.request(j10);
        }
    }
}
