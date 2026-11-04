package com.rabbitmq.client.impl;

import java.time.Duration;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes13.dex */
public class l0 implements f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final org.slf4j.c f265503f = org.slf4j.e.k(l0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f265504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<e0, b> f265505b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f265506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function<Duration, Duration> f265507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function<Duration, Boolean> f265508e;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e0 f265509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, g> f265510b = new ConcurrentHashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicReference<ScheduledFuture<?>> f265511c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f265512d = new AtomicBoolean(false);

        b(e0 e0Var) {
            this.f265509a = e0Var;
        }

        void c(g gVar) {
            this.f265510b.put(gVar.f265521c, gVar);
        }

        void d(Supplier<ScheduledFuture<?>> supplier) {
            if (this.f265512d.compareAndSet(false, true)) {
                this.f265511c.set(supplier.get());
            }
        }

        void e() {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            int i10 = 0;
            while (i10 < 3) {
                l0.f265503f.D("Refreshing token for credentials provider {}", this.f265509a);
                try {
                    this.f265509a.a();
                    l0.f265503f.D("Token refreshed for credentials provider {}", this.f265509a);
                    Iterator<g> it = this.f265510b.values().iterator();
                    while (it.hasNext() && !Thread.currentThread().isInterrupted()) {
                        g next = it.next();
                        try {
                            if (!((Boolean) next.f265519a.call()).booleanValue()) {
                                l0.f265503f.g("Registration did not refresh token");
                                it.remove();
                            }
                            next.f265520b.set(0);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        } catch (Exception e10) {
                            l0.f265503f.p("Error while trying to refresh a connection token", e10);
                            next.f265520b.incrementAndGet();
                            if (next.f265520b.get() >= 5) {
                                this.f265510b.remove(next.f265521c);
                            }
                        }
                    }
                    return;
                } catch (Exception e11) {
                    l0.f265503f.w("Error while trying to refresh token: {}", e11.getMessage());
                    i10++;
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
            l0.f265503f.m0("Token refresh failed after retry, aborting callbacks");
        }

        void f(String str) {
            this.f265510b.remove(str);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ScheduledExecutorService f265513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Function<Duration, Duration> f265514b = l0.l(0.8d);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Function<Duration, Boolean> f265515c = new Function() { // from class: com.rabbitmq.client.impl.m0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.FALSE;
            }
        };

        public c b(Function<Duration, Boolean> function) {
            this.f265515c = function;
            return this;
        }

        public l0 c() {
            return new l0(this.f265513a, this.f265514b, this.f265515c);
        }

        public c d(Function<Duration, Duration> function) {
            this.f265514b = function;
            return this;
        }

        public c e(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            this.f265513a = scheduledThreadPoolExecutor;
            return this;
        }
    }

    private static class d implements Function<Duration, Duration> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Duration f265516a;

        @Override // java.util.function.Function
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Duration apply(Duration duration) {
            Duration durationMinus = duration.minus(this.f265516a);
            return durationMinus.isNegative() ? duration : durationMinus;
        }

        private d(Duration duration) {
            this.f265516a = duration;
        }
    }

    private static class e implements Function<Duration, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f265517a;

        @Override // java.util.function.Function
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean apply(Duration duration) {
            return Boolean.valueOf(duration.toMillis() <= this.f265517a);
        }

        private e(long j10) {
            this.f265517a = j10;
        }
    }

    private static class f implements Function<Duration, Duration> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f265518a;

        @Override // java.util.function.Function
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Duration apply(Duration duration) {
            return Duration.ofSeconds((long) (duration.getSeconds() * this.f265518a));
        }

        private f(double d10) {
            if (d10 >= 0.0d && d10 <= 1.0d) {
                this.f265518a = d10;
                return;
            }
            throw new IllegalArgumentException("Ratio should be > 0 and <= 1: " + d10);
        }
    }

    static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Callable<Boolean> f265519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f265520b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f265521c;

        g(String str, Callable<Boolean> callable) {
            this.f265519a = callable;
            this.f265521c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f265521c.equals(((g) obj).f265521c);
        }

        public int hashCode() {
            return this.f265521c.hashCode();
        }
    }

    public l0(ScheduledExecutorService scheduledExecutorService, Function<Duration, Duration> function, Function<Duration, Boolean> function2) {
        if (function == null) {
            throw new IllegalArgumentException("Refresh delay strategy can not be null");
        }
        this.f265507d = function;
        this.f265508e = function2 == null ? new Function() { // from class: com.rabbitmq.client.impl.h0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.FALSE;
            }
        } : function2;
        if (scheduledExecutorService == null) {
            this.f265504a = Executors.newScheduledThreadPool(1);
            this.f265506c = true;
        } else {
            this.f265504a = scheduledExecutorService;
            this.f265506c = false;
        }
    }

    public static /* synthetic */ void e(b bVar, Function function, ScheduledExecutorService scheduledExecutorService) {
        org.slf4j.c cVar = f265503f;
        cVar.g("Refreshing token");
        bVar.e();
        Duration duration = (Duration) function.apply(bVar.f265509a.c());
        cVar.D("Scheduling refresh in {} seconds", Long.valueOf(duration.getSeconds()));
        bVar.f265511c.set(scheduledExecutorService.schedule(m(scheduledExecutorService, bVar, function), duration.getSeconds(), TimeUnit.SECONDS));
    }

    public static /* synthetic */ ScheduledFuture f(l0 l0Var, e0 e0Var, b bVar) {
        Duration durationApply = l0Var.f265507d.apply(e0Var.c());
        f265503f.D("Scheduling refresh in {} seconds", Long.valueOf(durationApply.getSeconds()));
        ScheduledExecutorService scheduledExecutorService = l0Var.f265504a;
        return scheduledExecutorService.schedule(m(scheduledExecutorService, bVar, l0Var.f265507d), durationApply.getSeconds(), TimeUnit.SECONDS);
    }

    public static /* synthetic */ b g(e0 e0Var) {
        return new b(e0Var);
    }

    public static Function<Duration, Duration> j(Duration duration) {
        return new d(duration);
    }

    public static Function<Duration, Boolean> k(Duration duration) {
        return new e(duration.toMillis());
    }

    public static Function<Duration, Duration> l(double d10) {
        return new f(d10);
    }

    private static Runnable m(final ScheduledExecutorService scheduledExecutorService, final b bVar, final Function<Duration, Duration> function) {
        return new Runnable() { // from class: com.rabbitmq.client.impl.i0
            @Override // java.lang.Runnable
            public final void run() {
                l0.e(bVar, function, scheduledExecutorService);
            }
        };
    }

    @Override // com.rabbitmq.client.impl.f0
    public String a(final e0 e0Var, Callable<Boolean> callable) {
        String string = UUID.randomUUID().toString();
        f265503f.D("New registration {}", string);
        g gVar = new g(string, callable);
        final b bVarComputeIfAbsent = this.f265505b.computeIfAbsent(e0Var, new Function() { // from class: com.rabbitmq.client.impl.j0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l0.g((e0) obj);
            }
        });
        bVarComputeIfAbsent.c(gVar);
        bVarComputeIfAbsent.d(new Supplier() { // from class: com.rabbitmq.client.impl.k0
            @Override // java.util.function.Supplier
            public final Object get() {
                return l0.f(this.f265495a, e0Var, bVarComputeIfAbsent);
            }
        });
        return string;
    }

    @Override // com.rabbitmq.client.impl.f0
    public void b(e0 e0Var, String str) {
        b bVar = this.f265505b.get(e0Var);
        if (bVar != null) {
            bVar.f(str);
        }
    }

    @Override // com.rabbitmq.client.impl.f0
    public boolean c(Duration duration) {
        return this.f265508e.apply(duration).booleanValue();
    }

    public void i() {
        if (this.f265506c) {
            this.f265504a.shutdownNow();
        }
    }
}
