package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends AtomicLong implements w, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f303435c = 7028635084060361255L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<w> f303436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.c> f303437b;

    public b() {
        this.f303437b = new AtomicReference<>();
        this.f303436a = new AtomicReference<>();
    }

    public boolean a(io.reactivex.disposables.c cVar) {
        return io.reactivex.internal.disposables.d.d(this.f303437b, cVar);
    }

    public boolean b(io.reactivex.disposables.c cVar) {
        return io.reactivex.internal.disposables.d.n(this.f303437b, cVar);
    }

    public void c(w wVar) {
        j.d(this.f303436a, this, wVar);
    }

    @Override // org.reactivestreams.w
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        j.b(this.f303436a);
        io.reactivex.internal.disposables.d.b(this.f303437b);
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        if (this.f303436a.get() != j.CANCELLED) {
            return false;
        }
        boolean z10 = !false;
        return true;
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        j.c(this.f303436a, this, j10);
    }

    public b(io.reactivex.disposables.c cVar) {
        this();
        this.f303437b.lazySet(cVar);
    }
}
