package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 {
    @NotNull
    public static final s0 a(@NotNull CoroutineContext coroutineContext) {
        if (coroutineContext.get(p2.M2) == null) {
            coroutineContext = coroutineContext.plus(u2.c(null, 1, null));
        }
        return new kotlinx.coroutines.internal.h(coroutineContext);
    }

    @NotNull
    public static final s0 b() {
        return new kotlinx.coroutines.internal.h(q3.c(null, 1, null).plus(l1.e()));
    }

    public static final void c(@NotNull s0 s0Var, @NotNull String str, @Nullable Throwable th2) {
        d(s0Var, x1.a(str, th2));
    }

    public static final void d(@NotNull s0 s0Var, @Nullable CancellationException cancellationException) {
        p2 p2Var = (p2) s0Var.getCoroutineContext().get(p2.M2);
        if (p2Var != null) {
            p2Var.e(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + s0Var).toString());
    }

    public static /* synthetic */ void e(s0 s0Var, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        c(s0Var, str, th2);
    }

    public static /* synthetic */ void f(s0 s0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d(s0Var, cancellationException);
    }

    @Nullable
    public static final <R> Object g(@NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super R> dVar) {
        kotlinx.coroutines.internal.v0 v0Var = new kotlinx.coroutines.internal.v0(dVar.getContext(), dVar);
        Object objD = bk.b.d(v0Var, v0Var, function2);
        if (objD == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objD;
    }

    @Nullable
    public static final Object h(@NotNull kotlin.coroutines.d<? super CoroutineContext> dVar) {
        return dVar.getContext();
    }

    private static final Object i(kotlin.coroutines.d<? super CoroutineContext> dVar) {
        kotlin.jvm.internal.h0.e(3);
        throw null;
    }

    public static final void j(@NotNull s0 s0Var) {
        s2.y(s0Var.getCoroutineContext());
    }

    public static final boolean k(@NotNull s0 s0Var) {
        p2 p2Var = (p2) s0Var.getCoroutineContext().get(p2.M2);
        if (p2Var != null) {
            return p2Var.isActive();
        }
        return true;
    }

    public static /* synthetic */ void l(s0 s0Var) {
    }

    @NotNull
    public static final s0 m(@NotNull s0 s0Var, @NotNull CoroutineContext coroutineContext) {
        return new kotlinx.coroutines.internal.h(s0Var.getCoroutineContext().plus(coroutineContext));
    }
}
