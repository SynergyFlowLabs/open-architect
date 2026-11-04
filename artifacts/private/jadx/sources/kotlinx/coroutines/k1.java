package kotlinx.coroutines;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class k1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final n0 f315163a;

    public k1(@NotNull n0 n0Var) {
        this.f315163a = n0Var;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        n0 n0Var = this.f315163a;
        kotlin.coroutines.h hVar = kotlin.coroutines.h.f312451a;
        if (kotlinx.coroutines.internal.n.f(n0Var, hVar)) {
            kotlinx.coroutines.internal.n.e(this.f315163a, hVar, runnable);
        } else {
            runnable.run();
        }
    }

    @NotNull
    public String toString() {
        return this.f315163a.toString();
    }
}
