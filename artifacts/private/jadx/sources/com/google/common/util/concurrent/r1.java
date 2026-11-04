package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public final class r1 {

    /* JADX INFO: Access modifiers changed from: private */
    static class a<V> extends a1<V> implements t1<V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final ThreadFactory f120295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Executor f120296f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f120297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q0 f120298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f120299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Future<V> f120300d;

        static {
            ThreadFactory threadFactoryB = new y2().e(true).f("ListenableFutureAdapter-thread-%d").b();
            f120295e = threadFactoryB;
            f120296f = Executors.newCachedThreadPool(threadFactoryB);
        }

        a(Future<V> delegate) {
            this(delegate, f120296f);
        }

        public static /* synthetic */ void N0(a aVar) {
            aVar.getClass();
            try {
                f3.f(aVar.f120300d);
            } catch (Throwable unused) {
            }
            aVar.f120298b.b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.a1, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
        public Future<V> i1() {
            return this.f120300d;
        }

        @Override // com.google.common.util.concurrent.t1
        public void m0(Runnable listener, Executor exec) {
            this.f120298b.a(listener, exec);
            if (this.f120299c.compareAndSet(false, true)) {
                if (this.f120300d.isDone()) {
                    this.f120298b.b();
                } else {
                    this.f120297a.execute(new Runnable() { // from class: com.google.common.util.concurrent.q1
                        @Override // java.lang.Runnable
                        public final void run() {
                            r1.a.N0(this.f120286a);
                        }
                    });
                }
            }
        }

        a(Future<V> delegate, Executor adapterExecutor) {
            this.f120298b = new q0();
            this.f120299c = new AtomicBoolean(false);
            this.f120300d = (Future) com.google.common.base.j0.E(delegate);
            this.f120297a = (Executor) com.google.common.base.j0.E(adapterExecutor);
        }
    }

    private r1() {
    }

    public static <V> t1<V> a(Future<V> future) {
        return future instanceof t1 ? (t1) future : new a(future);
    }

    public static <V> t1<V> b(Future<V> future, Executor executor) {
        com.google.common.base.j0.E(executor);
        return future instanceof t1 ? (t1) future : new a(future, executor);
    }
}
