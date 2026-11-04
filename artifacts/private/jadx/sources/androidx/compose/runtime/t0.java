package androidx.compose.runtime;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f36635a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final f1<androidx.compose.runtime.tooling.x> f36636b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f36637c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f36638d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f36639e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f36640f = 3;

    public static final class a implements f1<androidx.compose.runtime.tooling.x> {
        a() {
        }
    }

    @NotNull
    public static final o0 a(@NotNull i<?> iVar, @NotNull p0 p0Var) {
        return new s0(p0Var, iVar, null, 4, null);
    }

    @c2
    @NotNull
    public static final o0 b(@NotNull i<?> iVar, @NotNull p0 p0Var, @NotNull CoroutineContext coroutineContext) {
        return new s0(p0Var, iVar, coroutineContext);
    }

    @lm.n
    @NotNull
    public static final l1 c(@NotNull i<?> iVar, @NotNull p0 p0Var) {
        return new s0(p0Var, iVar, null, 4, null);
    }

    @c2
    @lm.n
    @NotNull
    public static final l1 d(@NotNull i<?> iVar, @NotNull p0 p0Var, @NotNull CoroutineContext coroutineContext) {
        return new s0(p0Var, iVar, coroutineContext);
    }

    @NotNull
    public static final p5 e(@NotNull i<?> iVar, @NotNull p0 p0Var) {
        return new s0(p0Var, iVar, null, 4, null);
    }

    @Nullable
    public static final <T> T g(@NotNull o0 o0Var, @NotNull f1<T> f1Var) {
        g1 g1Var = o0Var instanceof g1 ? (g1) o0Var : null;
        if (g1Var != null) {
            return (T) g1Var.h(f1Var);
        }
        return null;
    }

    @NotNull
    public static final f1<androidx.compose.runtime.tooling.x> h() {
        return f36636b;
    }

    public static /* synthetic */ void i() {
    }

    @NotNull
    public static final CoroutineContext j(@NotNull l1 l1Var) {
        CoroutineContext coroutineContextE0;
        s0 s0Var = l1Var instanceof s0 ? (s0) l1Var : null;
        return (s0Var == null || (coroutineContextE0 = s0Var.e0()) == null) ? kotlin.coroutines.h.f312451a : coroutineContextE0;
    }

    @c2
    public static /* synthetic */ void k(l1 l1Var) {
    }

    public static final <R> R l(@NotNull l1 l1Var, @NotNull t5 t5Var, @NotNull Function0<? extends R> function0) {
        t5 t5VarS = l1Var.S(t5Var);
        try {
            R rInvoke = function0.invoke();
            kotlin.jvm.internal.h0.d(1);
            l1Var.S(t5VarS);
            kotlin.jvm.internal.h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            l1Var.S(t5VarS);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }
}
