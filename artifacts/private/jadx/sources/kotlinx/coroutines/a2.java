package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a2 extends z1 implements c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Executor f313523c;

    public a2(@NotNull Executor executor) {
        this.f313523c = executor;
        kotlinx.coroutines.internal.d.b(M0());
    }

    private final void O0(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        s2.f(coroutineContext, x1.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> R0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            O0(coroutineContext, e10);
            return null;
        }
    }

    @Override // kotlinx.coroutines.z1
    @NotNull
    public Executor M0() {
        return this.f313523c;
    }

    @Override // kotlinx.coroutines.c1
    public void b(long j10, @NotNull n<? super Unit> nVar) {
        long j11;
        Executor executorM0 = M0();
        ScheduledFuture<?> scheduledFutureR0 = null;
        ScheduledExecutorService scheduledExecutorService = executorM0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorM0 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            scheduledFutureR0 = R0(scheduledExecutorService, new k3(this, nVar), nVar.getContext(), j11);
        } else {
            j11 = j10;
        }
        if (scheduledFutureR0 != null) {
            r.c(nVar, new l(scheduledFutureR0));
        } else {
            y0.f315719h.b(j11, nVar);
        }
    }

    @Override // kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorM0 = M0();
        ExecutorService executorService = executorM0 instanceof ExecutorService ? (ExecutorService) executorM0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.c1
    @NotNull
    public o1 d(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        long j11;
        Runnable runnable2;
        CoroutineContext coroutineContext2;
        Executor executorM0 = M0();
        ScheduledFuture<?> scheduledFutureR0 = null;
        ScheduledExecutorService scheduledExecutorService = executorM0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorM0 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
            scheduledFutureR0 = R0(scheduledExecutorService, runnable2, coroutineContext2, j11);
        } else {
            j11 = j10;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
        }
        return scheduledFutureR0 != null ? new n1(scheduledFutureR0) : y0.f315719h.d(j11, runnable2, coroutineContext2);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof a2) || ((a2) obj).M0() != M0()) {
            return false;
        }
        int i10 = 5 << 1;
        return true;
    }

    @Override // kotlinx.coroutines.c1
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object g(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return c1.a.a(this, j10, dVar);
    }

    @Override // kotlinx.coroutines.n0
    public void h(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Runnable runnableI;
        try {
            Executor executorM0 = M0();
            b bVar = c.f313549a;
            if (bVar == null || (runnableI = bVar.i(runnable)) == null) {
                runnableI = runnable;
            }
            executorM0.execute(runnableI);
        } catch (RejectedExecutionException e10) {
            b bVar2 = c.f313549a;
            if (bVar2 != null) {
                bVar2.f();
            }
            O0(coroutineContext, e10);
            l1.c().h(coroutineContext, runnable);
        }
    }

    public int hashCode() {
        return System.identityHashCode(M0());
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public String toString() {
        return M0().toString();
    }
}
