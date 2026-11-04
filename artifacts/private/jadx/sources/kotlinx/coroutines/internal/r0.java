package kotlinx.coroutines.internal;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class r0 {
    public static final <E> void a(@NotNull Function1<? super E, Unit> function1, E e10, @NotNull CoroutineContext coroutineContext) {
        p1 p1VarB = b(function1, e10, null);
        if (p1VarB != null) {
            kotlinx.coroutines.p0.b(coroutineContext, p1VarB);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E> p1 b(@NotNull Function1<? super E, Unit> function1, E e10, @Nullable p1 p1Var) {
        try {
            function1.invoke(e10);
            return p1Var;
        } catch (Throwable th2) {
            if (p1Var != null && p1Var.getCause() != th2) {
                kotlin.p.a(p1Var, th2);
                return p1Var;
            }
            return new p1("Exception in undelivered element handler for " + e10, th2);
        }
    }

    public static /* synthetic */ p1 c(Function1 function1, Object obj, p1 p1Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            p1Var = null;
        }
        return b(function1, obj, p1Var);
    }
}
