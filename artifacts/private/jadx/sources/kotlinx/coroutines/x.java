package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.i1(markerClass = {l2.class})
public interface x<T> extends a1<T> {

    public static final class a {
        public static <T, R> R b(@NotNull x<T> xVar, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) a1.a.b(xVar, r10, function2);
        }

        @Nullable
        public static <T, E extends CoroutineContext.Element> E c(@NotNull x<T> xVar, @NotNull CoroutineContext.b<E> bVar) {
            return (E) a1.a.c(xVar, bVar);
        }

        @NotNull
        public static <T> CoroutineContext d(@NotNull x<T> xVar, @NotNull CoroutineContext.b<?> bVar) {
            return a1.a.d(xVar, bVar);
        }

        @NotNull
        public static <T> CoroutineContext e(@NotNull x<T> xVar, @NotNull CoroutineContext coroutineContext) {
            return a1.a.e(xVar, coroutineContext);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> p2 f(@NotNull x<T> xVar, @NotNull p2 p2Var) {
            return a1.a.f(xVar, p2Var);
        }
    }

    boolean R(T t10);

    boolean f(@NotNull Throwable th2);
}
