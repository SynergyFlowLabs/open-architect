package kotlinx.coroutines;

import kotlin.Result;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nCompletableDeferred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableDeferred.kt\nkotlinx/coroutines/CompletableDeferredKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public final class z {
    @NotNull
    public static final <T> x<T> a(T t10) {
        y yVar = new y(null);
        yVar.R(t10);
        return yVar;
    }

    @NotNull
    public static final <T> x<T> b(@Nullable p2 p2Var) {
        return new y(p2Var);
    }

    public static /* synthetic */ x c(p2 p2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p2Var = null;
            boolean z10 = true & false;
        }
        return b(p2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(@NotNull x<T> xVar, @NotNull Object obj) {
        Throwable thD = Result.d(obj);
        return thD == null ? xVar.R(obj) : xVar.f(thD);
    }
}
