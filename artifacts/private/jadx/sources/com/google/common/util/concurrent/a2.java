package com.google.common.util.concurrent;

import com.google.common.collect.e9;
import com.google.common.collect.x7;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b(emulated = true)
public final class a2 {

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BlockingQueue f119919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t1 f119920b;

        a(final BlockingQueue val$queue, final t1 val$future) {
            this.f119919a = val$queue;
            this.f119920b = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f119919a.add(this.f119920b);
        }
    }

    class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f119921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.s0 f119922b;

        b(final Executor val$executor, final com.google.common.base.s0 val$nameSupplier) {
            this.f119921a = val$executor;
            this.f119922b = val$nameSupplier;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            this.f119921a.execute(f0.g(command, this.f119922b));
        }
    }

    class c extends h3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.s0 f119923b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ExecutorService delegate, final com.google.common.base.s0 val$nameSupplier) {
            super(delegate);
            this.f119923b = val$nameSupplier;
        }

        @Override // com.google.common.util.concurrent.h3
        protected Runnable b(Runnable command) {
            return f0.g(command, this.f119923b);
        }

        @Override // com.google.common.util.concurrent.h3
        protected <T> Callable<T> c(Callable<T> callable) {
            return f0.h(callable, this.f119923b);
        }
    }

    class d extends i3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.s0 f119924c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ScheduledExecutorService delegate, final com.google.common.base.s0 val$nameSupplier) {
            super(delegate);
            this.f119924c = val$nameSupplier;
        }

        @Override // com.google.common.util.concurrent.h3
        protected Runnable b(Runnable command) {
            return f0.g(command, this.f119924c);
        }

        @Override // com.google.common.util.concurrent.h3
        protected <T> Callable<T> c(Callable<T> callable) {
            return f0.h(callable, this.f119924c);
        }
    }

    class e implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f119925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.f f119926b;

        e(final Executor val$delegate, final com.google.common.util.concurrent.f val$future) {
            this.f119925a = val$delegate;
            this.f119926b = val$future;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            try {
                this.f119925a.execute(command);
            } catch (RejectedExecutionException e10) {
                this.f119926b.C(e10);
            }
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @com.google.common.annotations.e
    static class f {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ExecutorService f119927a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f119928b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TimeUnit f119929c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f f119930d;

            a(final f this$0, final ExecutorService val$service, final long val$terminationTimeout, final TimeUnit val$timeUnit) {
                this.f119927a = val$service;
                this.f119928b = val$terminationTimeout;
                this.f119929c = val$timeUnit;
                this.f119930d = this$0;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f119927a.shutdown();
                    this.f119927a.awaitTermination(this.f119928b, this.f119929c);
                } catch (InterruptedException unused) {
                }
            }
        }

        f() {
        }

        final void a(final ExecutorService service, final long terminationTimeout, final TimeUnit timeUnit) {
            com.google.common.base.j0.E(service);
            com.google.common.base.j0.E(timeUnit);
            b(a2.n("DelayedShutdownHook-for-" + service, new a(this, service, terminationTimeout, timeUnit)));
        }

        @com.google.common.annotations.e
        void b(Thread hook) {
            Runtime.getRuntime().addShutdownHook(hook);
        }

        final ExecutorService c(ThreadPoolExecutor executor) {
            return d(executor, 120L, TimeUnit.SECONDS);
        }

        final ExecutorService d(ThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
            a2.v(executor);
            ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(executor);
            a(executor, terminationTimeout, timeUnit);
            return executorServiceUnconfigurableExecutorService;
        }

        final ScheduledExecutorService e(ScheduledThreadPoolExecutor executor) {
            return f(executor, 120L, TimeUnit.SECONDS);
        }

        final ScheduledExecutorService f(ScheduledThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
            a2.v(executor);
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(executor);
            a(executor, terminationTimeout, timeUnit);
            return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static class g extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExecutorService f119931a;

        g(ExecutorService delegate) {
            this.f119931a = (ExecutorService) com.google.common.base.j0.E(delegate);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
            return this.f119931a.awaitTermination(timeout, unit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable command) {
            this.f119931a.execute(command);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f119931a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f119931a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f119931a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f119931a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f119931a + "]";
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final class h extends g implements y1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ScheduledExecutorService f119932b;

        private static final class a<V> extends b1.a<V> implements v1<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ScheduledFuture<?> f119933b;

            public a(t1<V> listenableDelegate, ScheduledFuture<?> scheduledDelegate) {
                super(listenableDelegate);
                this.f119933b = scheduledDelegate;
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed other) {
                return this.f119933b.compareTo(other);
            }

            @Override // com.google.common.util.concurrent.a1, java.util.concurrent.Future
            public boolean cancel(boolean mayInterruptIfRunning) {
                boolean zCancel = super.cancel(mayInterruptIfRunning);
                if (zCancel) {
                    this.f119933b.cancel(mayInterruptIfRunning);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit unit) {
                return this.f119933b.getDelay(unit);
            }
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private static final class b extends com.google.common.util.concurrent.f.j<Void> implements Runnable {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Runnable f119934i;

            public b(Runnable delegate) {
                this.f119934i = (Runnable) com.google.common.base.j0.E(delegate);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f119934i.run();
                } catch (Throwable th2) {
                    C(th2);
                    throw th2;
                }
            }

            @Override // com.google.common.util.concurrent.f
            protected String y() {
                return "task=[" + this.f119934i + "]";
            }
        }

        h(ScheduledExecutorService delegate) {
            super(delegate);
            this.f119932b = (ScheduledExecutorService) com.google.common.base.j0.E(delegate);
        }

        @Override // com.google.common.util.concurrent.y1, java.util.concurrent.ScheduledExecutorService
        public v1<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
            b bVar = new b(command);
            return new a(bVar, this.f119932b.scheduleAtFixedRate(bVar, initialDelay, period, unit));
        }

        @Override // com.google.common.util.concurrent.y1, java.util.concurrent.ScheduledExecutorService
        public v1<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
            b bVar = new b(command);
            return new a(bVar, this.f119932b.scheduleWithFixedDelay(bVar, initialDelay, delay, unit));
        }

        @Override // com.google.common.util.concurrent.y1, java.util.concurrent.ScheduledExecutorService
        public v1<?> schedule(Runnable command, long delay, TimeUnit unit) {
            b3 b3VarO = b3.O(command, null);
            return new a(b3VarO, this.f119932b.schedule(b3VarO, delay, unit));
        }

        @Override // com.google.common.util.concurrent.y1, java.util.concurrent.ScheduledExecutorService
        public <V> v1<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
            b3 b3VarP = b3.P(callable);
            return new a(b3VarP, this.f119932b.schedule(b3VarP, delay, unit));
        }
    }

    private a2() {
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static void b(ExecutorService service, long terminationTimeout, TimeUnit timeUnit) {
        new f().a(service, terminationTimeout, timeUnit);
    }

    public static Executor c() {
        return m0.INSTANCE;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static ExecutorService d(ThreadPoolExecutor executor) {
        return new f().c(executor);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static ExecutorService e(ThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
        return new f().d(executor, terminationTimeout, timeUnit);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static ScheduledExecutorService f(ScheduledThreadPoolExecutor executor) {
        return new f().e(executor);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static ScheduledExecutorService g(ScheduledThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
        return new f().f(executor, terminationTimeout, timeUnit);
    }

    @com.google.common.annotations.c
    @d2
    @com.google.common.annotations.d
    static <T> T h(x1 x1Var, Collection<? extends Callable<T>> collection, boolean z10, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long jNanoTime;
        long jNanoTime2;
        com.google.common.base.j0.E(x1Var);
        com.google.common.base.j0.E(timeUnit);
        int size = collection.size();
        com.google.common.base.j0.d(size > 0);
        ArrayList arrayListU = x7.u(size);
        LinkedBlockingQueue linkedBlockingQueueK = e9.k();
        long nanos = timeUnit.toNanos(j10);
        if (z10) {
            try {
                jNanoTime = System.nanoTime();
            } catch (Throwable th2) {
                Iterator it = arrayListU.iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).cancel(true);
                }
                throw th2;
            }
        } else {
            jNanoTime = 0;
        }
        Iterator<? extends Callable<T>> it2 = collection.iterator();
        arrayListU.add(u(x1Var, it2.next(), linkedBlockingQueueK));
        int i10 = size - 1;
        int i11 = 1;
        ExecutionException executionException = null;
        while (true) {
            Future future = (Future) linkedBlockingQueueK.poll();
            if (future != null) {
                jNanoTime2 = jNanoTime;
            } else {
                if (i10 > 0) {
                    i10--;
                    arrayListU.add(u(x1Var, it2.next(), linkedBlockingQueueK));
                    i11++;
                } else {
                    if (i11 == 0) {
                        if (executionException == null) {
                            throw new ExecutionException((Throwable) null);
                        }
                        throw executionException;
                    }
                    if (z10) {
                        future = (Future) linkedBlockingQueueK.poll(nanos, TimeUnit.NANOSECONDS);
                        if (future == null) {
                            throw new TimeoutException();
                        }
                        jNanoTime2 = System.nanoTime();
                        nanos -= jNanoTime2 - jNanoTime;
                    } else {
                        future = (Future) linkedBlockingQueueK.take();
                    }
                }
                jNanoTime2 = jNanoTime;
            }
            long j11 = nanos;
            int i12 = i10;
            if (future != null) {
                i11--;
                try {
                    try {
                        T t10 = (T) future.get();
                        Iterator it3 = arrayListU.iterator();
                        while (it3.hasNext()) {
                            ((Future) it3.next()).cancel(true);
                        }
                        return t10;
                    } catch (Exception e10) {
                        executionException = new ExecutionException(e10);
                        i10 = i12;
                        nanos = j11;
                        jNanoTime = jNanoTime2;
                    }
                } catch (InterruptedException e11) {
                    throw e11;
                } catch (ExecutionException e12) {
                    executionException = e12;
                    i10 = i12;
                    nanos = j11;
                    jNanoTime = jNanoTime2;
                }
            }
            i10 = i12;
            nanos = j11;
            jNanoTime = jNanoTime2;
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static boolean i() {
        int i10 = 6 >> 0;
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
            if (Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", null).invoke(null, null) != null) {
                return true;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return false;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static x1 j(ExecutorService delegate) {
        if (delegate instanceof x1) {
            return (x1) delegate;
        }
        return delegate instanceof ScheduledExecutorService ? new h((ScheduledExecutorService) delegate) : new g(delegate);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static y1 k(ScheduledExecutorService delegate) {
        return delegate instanceof y1 ? (y1) delegate : new h(delegate);
    }

    @com.google.common.annotations.c
    public static x1 l() {
        return new n0();
    }

    @com.google.common.annotations.c
    public static Executor m(Executor delegate) {
        return new i2(delegate);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    static Thread n(String name, Runnable runnable) {
        com.google.common.base.j0.E(name);
        com.google.common.base.j0.E(runnable);
        Thread threadNewThread = o().newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        try {
            threadNewThread.setName(name);
        } catch (SecurityException unused) {
        }
        return threadNewThread;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static ThreadFactory o() {
        if (!i()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException e10) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e10);
        } catch (InvocationTargetException e11) {
            throw com.google.common.base.v0.q(e11.getCause());
        }
    }

    static Executor p(final Executor delegate, final com.google.common.util.concurrent.f<?> future) {
        com.google.common.base.j0.E(delegate);
        com.google.common.base.j0.E(future);
        return delegate == c() ? delegate : new e(delegate, future);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    static Executor q(final Executor executor, final com.google.common.base.s0<String> nameSupplier) {
        com.google.common.base.j0.E(executor);
        com.google.common.base.j0.E(nameSupplier);
        return new b(executor, nameSupplier);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    static ExecutorService r(final ExecutorService service, final com.google.common.base.s0<String> nameSupplier) {
        com.google.common.base.j0.E(service);
        com.google.common.base.j0.E(nameSupplier);
        return new c(service, nameSupplier);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    static ScheduledExecutorService s(final ScheduledExecutorService service, final com.google.common.base.s0<String> nameSupplier) {
        com.google.common.base.j0.E(service);
        com.google.common.base.j0.E(nameSupplier);
        return new d(service, nameSupplier);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @z7.a
    public static boolean t(ExecutorService service, long timeout, TimeUnit unit) {
        long nanos = unit.toNanos(timeout) / 2;
        service.shutdown();
        try {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (!service.awaitTermination(nanos, timeUnit)) {
                service.shutdownNow();
                service.awaitTermination(nanos, timeUnit);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            service.shutdownNow();
        }
        return service.isTerminated();
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static <T> t1<T> u(x1 executorService, Callable<T> task, final BlockingQueue<Future<T>> queue) {
        t1<T> t1VarSubmit = executorService.submit((Callable) task);
        t1VarSubmit.m0(new a(queue, t1VarSubmit), c());
        return t1VarSubmit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static void v(ThreadPoolExecutor executor) {
        executor.setThreadFactory(new y2().e(true).h(executor.getThreadFactory()).b());
    }
}
