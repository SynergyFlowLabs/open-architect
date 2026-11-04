package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b
class o1<V> implements t1<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final t1<?> f120226b = new o1(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s1 f120227c = new s1(o1.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d2
    private final V f120228a;

    static final class a<V> extends f.j<V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @fj.a
        static final a<Object> f120229i;

        static {
            f120229i = f.f119962d ? null : new a<>();
        }

        a() {
            cancel(false);
        }
    }

    static final class b<V> extends f.j<V> {
        b(Throwable thrown) {
            C(thrown);
        }
    }

    o1(@d2 V value) {
        this.f120228a = value;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @d2
    public V get() {
        return this.f120228a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // com.google.common.util.concurrent.t1
    public void m0(Runnable listener, Executor executor) {
        com.google.common.base.j0.F(listener, "Runnable was null.");
        com.google.common.base.j0.F(executor, "Executor was null.");
        try {
            executor.execute(listener);
        } catch (Exception e10) {
            f120227c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + listener + " with executor " + executor, (Throwable) e10);
        }
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f120228a + "]]";
    }

    @Override // java.util.concurrent.Future
    @d2
    public V get(long timeout, TimeUnit unit) throws ExecutionException {
        com.google.common.base.j0.E(unit);
        return get();
    }
}
