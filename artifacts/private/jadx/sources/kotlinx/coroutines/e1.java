package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@k2
public interface e1 extends c1 {

    public static final class a {
        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @Nullable
        public static Object a(@NotNull e1 e1Var, long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objA = c1.a.a(e1Var, j10, dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }

        @NotNull
        public static o1 b(@NotNull e1 e1Var, long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
            return c1.a.b(e1Var, j10, runnable, coroutineContext);
        }
    }

    @NotNull
    String a(long j10);
}
