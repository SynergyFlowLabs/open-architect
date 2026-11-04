package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.i1(markerClass = {l2.class})
public interface a0 extends p2 {

    public static final class a {
        public static <R> R b(@NotNull a0 a0Var, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) p2.a.d(a0Var, r10, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E c(@NotNull a0 a0Var, @NotNull CoroutineContext.b<E> bVar) {
            return (E) p2.a.e(a0Var, bVar);
        }

        @NotNull
        public static CoroutineContext d(@NotNull a0 a0Var, @NotNull CoroutineContext.b<?> bVar) {
            return p2.a.h(a0Var, bVar);
        }

        @NotNull
        public static CoroutineContext e(@NotNull a0 a0Var, @NotNull CoroutineContext coroutineContext) {
            return p2.a.i(a0Var, coroutineContext);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static p2 f(@NotNull a0 a0Var, @NotNull p2 p2Var) {
            return p2.a.j(a0Var, p2Var);
        }
    }

    boolean complete();

    boolean f(@NotNull Throwable th2);
}
