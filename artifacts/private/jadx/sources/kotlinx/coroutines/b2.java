package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b2 {
    @c2
    public static /* synthetic */ void a() {
    }

    @NotNull
    public static final Executor b(@NotNull n0 n0Var) {
        Executor executorM0;
        z1 z1Var = n0Var instanceof z1 ? (z1) n0Var : null;
        return (z1Var == null || (executorM0 = z1Var.M0()) == null) ? new k1(n0Var) : executorM0;
    }

    @oj.i(name = "from")
    @NotNull
    public static final n0 c(@NotNull Executor executor) {
        n0 n0Var;
        k1 k1Var = executor instanceof k1 ? (k1) executor : null;
        if (k1Var != null && (n0Var = k1Var.f315163a) != null) {
            return n0Var;
        }
        return new a2(executor);
    }

    @oj.i(name = "from")
    @NotNull
    public static final z1 d(@NotNull ExecutorService executorService) {
        return new a2(executorService);
    }
}
