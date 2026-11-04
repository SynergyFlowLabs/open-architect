package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.i;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c<T> implements q<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<w> f303845a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.reactivex.internal.disposables.f f303846b = new io.reactivex.internal.disposables.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicLong f303847c = new AtomicLong();

    public final void a(io.reactivex.disposables.c cVar) {
        io.reactivex.internal.functions.b.g(cVar, "resource is null");
        this.f303846b.c(cVar);
    }

    protected void b() {
        c(Long.MAX_VALUE);
    }

    protected final void c(long j10) {
        j.c(this.f303845a, this.f303847c, j10);
    }

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        if (j.b(this.f303845a)) {
            this.f303846b.dispose();
        }
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return this.f303845a.get() == j.CANCELLED;
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public final void l(w wVar) {
        if (i.d(this.f303845a, wVar, getClass())) {
            long andSet = this.f303847c.getAndSet(0L);
            if (andSet != 0) {
                wVar.request(andSet);
            }
            b();
        }
    }
}
