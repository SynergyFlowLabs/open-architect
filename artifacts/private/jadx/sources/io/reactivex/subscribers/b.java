package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.i;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b<T> implements q<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<w> f303844a = new AtomicReference<>();

    protected final void b() {
        dispose();
    }

    protected void c() {
        this.f303844a.get().request(Long.MAX_VALUE);
    }

    protected final void d(long j10) {
        this.f303844a.get().request(j10);
    }

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        j.b(this.f303844a);
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return this.f303844a.get() == j.CANCELLED;
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public final void l(w wVar) {
        if (i.d(this.f303844a, wVar, getClass())) {
            c();
        }
    }
}
