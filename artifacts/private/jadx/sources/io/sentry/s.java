package io.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class s implements m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f306750j = 100;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f306751k = 30000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f306757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n8 f306758g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f306752a = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private volatile Timer f306753b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, List<e4>> f306754c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f306759h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f306760i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<d1> f306755d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<c1> f306756e = new ArrayList();

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Iterator it = s.this.f306755d.iterator();
            while (it.hasNext()) {
                ((d1) it.next()).c();
            }
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - s.this.f306760i <= 10) {
                return;
            }
            s.this.f306760i = jCurrentTimeMillis;
            e4 e4Var = new e4(new f8().k());
            Iterator it = s.this.f306755d.iterator();
            while (it.hasNext()) {
                ((d1) it.next()).d(e4Var);
            }
            Iterator it2 = s.this.f306754c.values().iterator();
            while (it2.hasNext()) {
                ((List) it2.next()).add(e4Var);
            }
        }
    }

    public s(@NotNull n8 n8Var) {
        boolean z10 = false;
        this.f306758g = (n8) io.sentry.util.y.c(n8Var, "The options object is required.");
        for (b1 b1Var : n8Var.getPerformanceCollectors()) {
            if (b1Var instanceof d1) {
                this.f306755d.add((d1) b1Var);
            }
            if (b1Var instanceof c1) {
                this.f306756e.add((c1) b1Var);
            }
        }
        if (this.f306755d.isEmpty() && this.f306756e.isEmpty()) {
            z10 = true;
        }
        this.f306757f = z10;
    }

    @Override // io.sentry.m
    public void a(@NotNull p1 p1Var) {
        Iterator<c1> it = this.f306756e.iterator();
        while (it.hasNext()) {
            it.next().a(p1Var);
        }
    }

    @Override // io.sentry.m
    public void b(@NotNull p1 p1Var) {
        Iterator<c1> it = this.f306756e.iterator();
        while (it.hasNext()) {
            it.next().b(p1Var);
        }
    }

    @Override // io.sentry.m
    @Nullable
    public List<e4> c(@NotNull r1 r1Var) {
        this.f306758g.getLogger().c(y7.DEBUG, "stop collecting performance info for transactions %s (%s)", r1Var.getName(), r1Var.m().p().toString());
        Iterator<c1> it = this.f306756e.iterator();
        while (it.hasNext()) {
            it.next().a(r1Var);
        }
        return e(r1Var.x().toString());
    }

    @Override // io.sentry.m
    public void close() {
        this.f306758g.getLogger().c(y7.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f306754c.clear();
        Iterator<c1> it = this.f306756e.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        if (this.f306759h.getAndSet(false)) {
            m1 m1VarA = this.f306752a.a();
            try {
                if (this.f306753b != null) {
                    this.f306753b.cancel();
                    this.f306753b = null;
                }
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.m
    public void d(@NotNull final r1 r1Var) {
        if (this.f306757f) {
            this.f306758g.getLogger().c(y7.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator<c1> it = this.f306756e.iterator();
        while (it.hasNext()) {
            it.next().b(r1Var);
        }
        if (!this.f306754c.containsKey(r1Var.x().toString())) {
            this.f306754c.put(r1Var.x().toString(), new ArrayList());
            try {
                this.f306758g.getExecutorService().b(new Runnable() { // from class: io.sentry.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f306608a.c(r1Var);
                    }
                }, 30000L);
            } catch (RejectedExecutionException e10) {
                this.f306758g.getLogger().a(y7.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e10);
            }
        }
        f(r1Var.x().toString());
    }

    @Override // io.sentry.m
    @Nullable
    public List<e4> e(@NotNull String str) {
        List<e4> listRemove = this.f306754c.remove(str);
        if (this.f306754c.isEmpty()) {
            close();
        }
        return listRemove;
    }

    @Override // io.sentry.m
    public void f(@NotNull String str) {
        if (this.f306757f) {
            this.f306758g.getLogger().c(y7.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f306754c.containsKey(str)) {
            this.f306754c.put(str, new ArrayList());
        }
        if (!this.f306759h.getAndSet(true)) {
            m1 m1VarA = this.f306752a.a();
            try {
                if (this.f306753b == null) {
                    this.f306753b = new Timer(true);
                }
                this.f306753b.schedule(new a(), 0L);
                this.f306753b.scheduleAtFixedRate(new b(), f306750j, f306750j);
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } catch (Throwable th2) {
                if (m1VarA == null) {
                    throw th2;
                }
                try {
                    m1VarA.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }
    }
}
