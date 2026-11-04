package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.i;
import io.reactivex.q;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a<T> implements q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    w f303843a;

    protected final void a() {
        w wVar = this.f303843a;
        this.f303843a = j.CANCELLED;
        wVar.cancel();
    }

    protected void b() {
        c(Long.MAX_VALUE);
    }

    protected final void c(long j10) {
        w wVar = this.f303843a;
        if (wVar != null) {
            wVar.request(j10);
        }
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public final void l(w wVar) {
        if (i.f(this.f303843a, wVar, getClass())) {
            this.f303843a = wVar;
            b();
        }
    }
}
