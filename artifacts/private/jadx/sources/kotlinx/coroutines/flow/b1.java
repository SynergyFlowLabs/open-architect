package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.internal.z0 f314095a = new kotlinx.coroutines.internal.z0("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.internal.z0 f314096b = new kotlinx.coroutines.internal.z0("PENDING");

    @NotNull
    public static final <T> k0<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) kotlinx.coroutines.flow.internal.u.f314619a;
        }
        return new a1(t10);
    }

    @NotNull
    public static final <T> i<T> d(@NotNull z0<? extends T> z0Var, @NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || jVar != kotlinx.coroutines.channels.j.DROP_OLDEST) ? q0.e(z0Var, coroutineContext, i10, jVar) : z0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T e(@NotNull k0<T> k0Var, @NotNull Function1<? super T, ? extends T> function1) {
        ?? r10;
        do {
            r10 = (Object) k0Var.getValue();
        } while (!k0Var.compareAndSet(r10, function1.invoke(r10)));
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void f(@NotNull k0<T> k0Var, @NotNull Function1<? super T, ? extends T> function1) {
        a0.c cVar;
        do {
            cVar = (Object) k0Var.getValue();
        } while (!k0Var.compareAndSet(cVar, function1.invoke(cVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T g(@NotNull k0<T> k0Var, @NotNull Function1<? super T, ? extends T> function1) {
        a0.c cVar;
        T tInvoke;
        do {
            cVar = (Object) k0Var.getValue();
            tInvoke = function1.invoke(cVar);
        } while (!k0Var.compareAndSet(cVar, tInvoke));
        return tInvoke;
    }
}
