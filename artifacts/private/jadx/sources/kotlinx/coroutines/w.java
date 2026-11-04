package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@k2
@kotlin.l(level = kotlin.n.ERROR, message = "This is internal API and may be removed in the future releases")
public interface w extends p2 {

    public static final class a {
        public static <R> R b(@NotNull w wVar, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) p2.a.d(wVar, r10, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E c(@NotNull w wVar, @NotNull CoroutineContext.b<E> bVar) {
            return (E) p2.a.e(wVar, bVar);
        }

        @NotNull
        public static CoroutineContext d(@NotNull w wVar, @NotNull CoroutineContext.b<?> bVar) {
            return p2.a.h(wVar, bVar);
        }

        @NotNull
        public static CoroutineContext e(@NotNull w wVar, @NotNull CoroutineContext coroutineContext) {
            return p2.a.i(wVar, coroutineContext);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static p2 f(@NotNull w wVar, @NotNull p2 p2Var) {
            return p2.a.j(wVar, p2Var);
        }
    }

    @k2
    void r(@NotNull g3 g3Var);
}
