package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@e.a({"RestrictedApi"})
class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScheduledFuture<?> f120913i;

    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th2) {
            p.this.H(th2);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v10) {
            p.this.E(v10);
        }
    }

    interface b<T> {
        void a(Throwable th2);

        void set(T t10);
    }

    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    p(c<V> cVar) {
        this.f120913i = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f120913i.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f120913i.getDelay(timeUnit);
    }

    @Override // androidx.concurrent.futures.a
    protected void k() {
        this.f120913i.cancel(M());
    }
}
