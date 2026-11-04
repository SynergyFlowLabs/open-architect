package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@k2
@kotlin.l(level = kotlin.n.ERROR, message = "This is internal API and may be removed in the future releases")
public interface g3 extends p2 {

    public static final class a {
        public static <R> R b(@NotNull g3 g3Var, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) p2.a.d(g3Var, r10, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E c(@NotNull g3 g3Var, @NotNull CoroutineContext.b<E> bVar) {
            return (E) p2.a.e(g3Var, bVar);
        }

        @NotNull
        public static CoroutineContext d(@NotNull g3 g3Var, @NotNull CoroutineContext.b<?> bVar) {
            return p2.a.h(g3Var, bVar);
        }

        @NotNull
        public static CoroutineContext e(@NotNull g3 g3Var, @NotNull CoroutineContext coroutineContext) {
            return p2.a.i(g3Var, coroutineContext);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static p2 f(@NotNull g3 g3Var, @NotNull p2 p2Var) {
            return p2.a.j(g3Var, p2Var);
        }
    }

    @k2
    @NotNull
    CancellationException Q0();
}
