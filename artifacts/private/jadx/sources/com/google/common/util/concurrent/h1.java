package com.google.common.util.concurrent;

import com.google.common.collect.l6;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b(emulated = true)
public final class h1 extends n1 {

    /* JADX INFO: Add missing generic type declarations: [O] */
    class a<O> implements Future<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Future f120083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.t f120084b;

        a(final Future val$input, final com.google.common.base.t val$function) {
            this.f120083a = val$input;
            this.f120084b = val$function;
        }

        private O a(I i10) throws ExecutionException {
            try {
                return (O) this.f120084b.apply(i10);
            } catch (Throwable th2) {
                throw new ExecutionException(th2);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean mayInterruptIfRunning) {
            return this.f120083a.cancel(mayInterruptIfRunning);
        }

        @Override // java.util.concurrent.Future
        public O get() throws ExecutionException, InterruptedException {
            return a(this.f120083a.get());
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f120083a.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f120083a.isDone();
        }

        @Override // java.util.concurrent.Future
        public O get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
            return a(this.f120083a.get(timeout, unit));
        }
    }

    private static final class b<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Future<V> f120085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final e1<? super V> f120086b;

        b(Future<V> future, e1<? super V> callback) {
            this.f120085a = future;
            this.f120086b = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Future<V> future = this.f120085a;
            if ((future instanceof com.google.common.util.concurrent.internal.a) && (thA = com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) future)) != null) {
                this.f120086b.onFailure(thA);
                return;
            }
            try {
                this.f120086b.b(h1.j(this.f120085a));
            } catch (ExecutionException e10) {
                this.f120086b.onFailure(e10.getCause());
            } catch (Throwable th2) {
                this.f120086b.onFailure(th2);
            }
        }

        public String toString() {
            return com.google.common.base.b0.c(this).s(this.f120086b).toString();
        }
    }

    @com.google.common.annotations.b
    public static final class c<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f120087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l6<t1<? extends V>> f120088b;

        class a implements Callable<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f120089a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f120090b;

            a(final c this$0, final Runnable val$combiner) {
                this.f120089a = val$combiner;
                this.f120090b = this$0;
            }

            @Override // java.util.concurrent.Callable
            @fj.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                this.f120089a.run();
                int i10 = 0 << 0;
                return null;
            }
        }

        /* synthetic */ c(boolean z10, l6 l6Var, a aVar) {
            this(z10, l6Var);
        }

        public <C> t1<C> a(Callable<C> combiner, Executor executor) {
            return new k0(this.f120088b, this.f120087a, executor, combiner);
        }

        public <C> t1<C> b(v<C> combiner, Executor executor) {
            return new k0(this.f120088b, this.f120087a, executor, combiner);
        }

        public t1<?> c(final Runnable combiner, Executor executor) {
            return a(new a(this, combiner), executor);
        }

        private c(boolean allMustSucceed, l6<t1<? extends V>> futures) {
            this.f120087a = allMustSucceed;
            this.f120088b = futures;
        }
    }

    private static final class d<T> extends com.google.common.util.concurrent.f<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @fj.a
        private e<T> f120091i;

        /* synthetic */ d(e eVar, a aVar) {
            this(eVar);
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        public boolean cancel(boolean interruptIfRunning) {
            e<T> eVar = this.f120091i;
            if (!super.cancel(interruptIfRunning)) {
                return false;
            }
            Objects.requireNonNull(eVar);
            eVar.g(interruptIfRunning);
            return true;
        }

        @Override // com.google.common.util.concurrent.f
        protected void m() {
            this.f120091i = null;
        }

        @Override // com.google.common.util.concurrent.f
        @fj.a
        protected String y() {
            e<T> eVar = this.f120091i;
            if (eVar == null) {
                return null;
            }
            return "inputCount=[" + ((e) eVar).f120095d.length + "], remaining=[" + ((e) eVar).f120094c.get() + "]";
        }

        private d(e<T> state) {
            this.f120091i = state;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f120092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f120093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f120094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final t1<? extends T>[] f120095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile int f120096e;

        /* synthetic */ e(t1[] t1VarArr, a aVar) {
            this(t1VarArr);
        }

        private void e() {
            if (this.f120094c.decrementAndGet() == 0 && this.f120092a) {
                for (t1<? extends T> t1Var : this.f120095d) {
                    if (t1Var != null) {
                        t1Var.cancel(this.f120093b);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(l6<com.google.common.util.concurrent.f<T>> delegates, int inputFutureIndex) {
            t1<? extends T> t1Var = this.f120095d[inputFutureIndex];
            Objects.requireNonNull(t1Var);
            t1<? extends T> t1Var2 = t1Var;
            this.f120095d[inputFutureIndex] = null;
            for (int i10 = this.f120096e; i10 < delegates.size(); i10++) {
                if (delegates.get(i10).D(t1Var2)) {
                    e();
                    this.f120096e = i10 + 1;
                    return;
                }
            }
            this.f120096e = delegates.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(boolean interruptIfRunning) {
            this.f120092a = true;
            if (!interruptIfRunning) {
                this.f120093b = false;
            }
            e();
        }

        private e(t1<? extends T>[] inputFutures) {
            this.f120092a = false;
            this.f120093b = true;
            this.f120096e = 0;
            this.f120095d = inputFutures;
            this.f120094c = new AtomicInteger(inputFutures.length);
        }
    }

    private static final class f<V> extends com.google.common.util.concurrent.f.j<V> implements Runnable {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @a8.b
        @fj.a
        private t1<V> f120097i;

        f(final t1<V> delegate) {
            this.f120097i = delegate;
        }

        @Override // com.google.common.util.concurrent.f
        protected void m() {
            this.f120097i = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            t1<V> t1Var = this.f120097i;
            if (t1Var != null) {
                D(t1Var);
            }
        }

        @Override // com.google.common.util.concurrent.f
        @fj.a
        protected String y() {
            t1<V> t1Var = this.f120097i;
            if (t1Var == null) {
                return null;
            }
            return "delegate=[" + t1Var + "]";
        }
    }

    private h1() {
    }

    public static <I, O> t1<O> A(t1<I> input, w<? super I, ? extends O> function, Executor executor) {
        return q.O(input, function, executor);
    }

    public static <V> c<V> B(Iterable<? extends t1<? extends V>> futures) {
        return new c<>(false, l6.v(futures), null);
    }

    @SafeVarargs
    public static <V> c<V> C(t1<? extends V>... futures) {
        return new c<>(false, l6.B(futures), null);
    }

    public static <V> c<V> D(Iterable<? extends t1<? extends V>> futures) {
        return new c<>(true, l6.v(futures), null);
    }

    @SafeVarargs
    public static <V> c<V> E(t1<? extends V>... futures) {
        return new c<>(true, l6.B(futures), null);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <V> t1<V> F(t1<V> delegate, long time, TimeUnit unit, ScheduledExecutorService scheduledExecutor) {
        return delegate.isDone() ? delegate : a3.Q(delegate, time, unit, scheduledExecutor);
    }

    private static void G(Throwable cause) {
        if (!(cause instanceof Error)) {
            throw new d3(cause);
        }
        throw new p0((Error) cause);
    }

    public static <V> void c(final t1<V> future, final e1<? super V> callback, Executor executor) {
        com.google.common.base.j0.E(callback);
        future.m0(new b(future, callback), executor);
    }

    public static <V> t1<List<V>> d(Iterable<? extends t1<? extends V>> futures) {
        return new j0.a(l6.v(futures), true);
    }

    @SafeVarargs
    public static <V> t1<List<V>> e(t1<? extends V>... futures) {
        return new j0.a(l6.B(futures), true);
    }

    @com.google.common.annotations.d
    @e2.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public static <V, X extends Throwable> t1<V> f(t1<? extends V> input, Class<X> exceptionType, com.google.common.base.t<? super X, ? extends V> fallback, Executor executor) {
        return com.google.common.util.concurrent.a.N(input, exceptionType, fallback, executor);
    }

    @com.google.common.annotations.d
    @e2.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public static <V, X extends Throwable> t1<V> g(t1<? extends V> input, Class<X> exceptionType, w<? super X, ? extends V> fallback, Executor executor) {
        return com.google.common.util.concurrent.a.O(input, exceptionType, fallback, executor);
    }

    @com.google.common.annotations.c
    @d2
    @com.google.common.annotations.d
    @z7.a
    public static <V, X extends Exception> V h(Future<V> future, Class<X> cls) throws Exception {
        return (V) l1.g(future, cls);
    }

    @com.google.common.annotations.c
    @d2
    @com.google.common.annotations.d
    @z7.a
    public static <V, X extends Exception> V i(Future<V> future, Class<X> cls, long j10, TimeUnit timeUnit) throws Exception {
        return (V) l1.h(future, cls, j10, timeUnit);
    }

    @d2
    @z7.a
    public static <V> V j(Future<V> future) throws ExecutionException {
        com.google.common.base.j0.x0(future.isDone(), "Future was expected to be done: %s", future);
        return (V) f3.f(future);
    }

    @d2
    @z7.a
    public static <V> V k(Future<V> future) {
        com.google.common.base.j0.E(future);
        try {
            return (V) f3.f(future);
        } catch (ExecutionException e10) {
            G(e10.getCause());
            throw new AssertionError();
        }
    }

    private static <T> t1<? extends T>[] l(Iterable<? extends t1<? extends T>> futures) {
        return (t1[]) (futures instanceof Collection ? (Collection) futures : l6.v(futures)).toArray(new t1[0]);
    }

    public static <V> t1<V> m() {
        o1.a<Object> aVar = o1.a.f120229i;
        return aVar != null ? aVar : new o1.a();
    }

    public static <V> t1<V> n(Throwable throwable) {
        com.google.common.base.j0.E(throwable);
        return new o1.b(throwable);
    }

    public static <V> t1<V> o(@d2 V v10) {
        return v10 == null ? (t1<V>) o1.f120226b : new o1(v10);
    }

    public static t1<Void> p() {
        return o1.f120226b;
    }

    public static <T> l6<t1<T>> q(Iterable<? extends t1<? extends T>> futures) {
        t1[] t1VarArrL = l(futures);
        a aVar = null;
        final e eVar = new e(t1VarArrL, aVar);
        l6.a aVarT = l6.t(t1VarArrL.length);
        for (int i10 = 0; i10 < t1VarArrL.length; i10++) {
            aVarT.a(new d(eVar, aVar));
        }
        final l6<t1<T>> l6VarE = aVarT.e();
        for (final int i11 = 0; i11 < t1VarArrL.length; i11++) {
            t1VarArrL[i11].m0(new Runnable() { // from class: com.google.common.util.concurrent.f1
                @Override // java.lang.Runnable
                public final void run() {
                    eVar.f(l6VarE, i11);
                }
            }, a2.c());
        }
        return l6VarE;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <I, O> Future<O> r(final Future<I> input, final com.google.common.base.t<? super I, ? extends O> function) {
        com.google.common.base.j0.E(input);
        com.google.common.base.j0.E(function);
        return new a(input, function);
    }

    public static <V> t1<V> s(t1<V> future) {
        if (future.isDone()) {
            return future;
        }
        f fVar = new f(future);
        future.m0(fVar, a2.c());
        return fVar;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <O> t1<O> t(v<O> callable, long delay, TimeUnit timeUnit, ScheduledExecutorService executorService) {
        b3 b3VarN = b3.N(callable);
        final ScheduledFuture<?> scheduledFutureSchedule = executorService.schedule(b3VarN, delay, timeUnit);
        b3VarN.m0(new Runnable() { // from class: com.google.common.util.concurrent.g1
            @Override // java.lang.Runnable
            public final void run() {
                scheduledFutureSchedule.cancel(false);
            }
        }, a2.c());
        return b3VarN;
    }

    public static t1<Void> u(Runnable runnable, Executor executor) {
        b3 b3VarO = b3.O(runnable, null);
        executor.execute(b3VarO);
        return b3VarO;
    }

    public static <O> t1<O> v(Callable<O> callable, Executor executor) {
        b3 b3VarP = b3.P(callable);
        executor.execute(b3VarP);
        return b3VarP;
    }

    public static <O> t1<O> w(v<O> callable, Executor executor) {
        b3 b3VarN = b3.N(callable);
        executor.execute(b3VarN);
        return b3VarN;
    }

    public static <V> t1<List<V>> x(Iterable<? extends t1<? extends V>> futures) {
        return new j0.a(l6.v(futures), false);
    }

    @SafeVarargs
    public static <V> t1<List<V>> y(t1<? extends V>... futures) {
        return new j0.a(l6.B(futures), false);
    }

    public static <I, O> t1<O> z(t1<I> input, com.google.common.base.t<? super I, ? extends O> function, Executor executor) {
        return q.N(input, function, executor);
    }
}
