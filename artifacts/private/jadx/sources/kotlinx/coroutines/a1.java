package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.i1(markerClass = {l2.class})
public interface a1<T> extends p2 {

    public static final class a {
        public static <T, R> R b(@NotNull a1<? extends T> a1Var, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) p2.a.d(a1Var, r10, function2);
        }

        @Nullable
        public static <T, E extends CoroutineContext.Element> E c(@NotNull a1<? extends T> a1Var, @NotNull CoroutineContext.b<E> bVar) {
            return (E) p2.a.e(a1Var, bVar);
        }

        @NotNull
        public static <T> CoroutineContext d(@NotNull a1<? extends T> a1Var, @NotNull CoroutineContext.b<?> bVar) {
            return p2.a.h(a1Var, bVar);
        }

        @NotNull
        public static <T> CoroutineContext e(@NotNull a1<? extends T> a1Var, @NotNull CoroutineContext coroutineContext) {
            return p2.a.i(a1Var, coroutineContext);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> p2 f(@NotNull a1<? extends T> a1Var, @NotNull p2 p2Var) {
            return p2.a.j(a1Var, p2Var);
        }
    }

    @NotNull
    kotlinx.coroutines.selects.h<T> b1();

    @c2
    T m();

    @Nullable
    Object q(@NotNull kotlin.coroutines.d<? super T> dVar);

    @c2
    @Nullable
    Throwable w0();
}
