package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@c2
@f1
public interface g0<S> extends r3<S> {

    public static final class a {
        public static <S, R> R a(@NotNull g0<S> g0Var, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) r3.a.a(g0Var, r10, function2);
        }

        @Nullable
        public static <S, E extends CoroutineContext.Element> E b(@NotNull g0<S> g0Var, @NotNull CoroutineContext.b<E> bVar) {
            return (E) r3.a.b(g0Var, bVar);
        }

        @NotNull
        public static <S> CoroutineContext c(@NotNull g0<S> g0Var, @NotNull CoroutineContext.b<?> bVar) {
            return r3.a.c(g0Var, bVar);
        }

        @NotNull
        public static <S> CoroutineContext d(@NotNull g0<S> g0Var, @NotNull CoroutineContext coroutineContext) {
            return r3.a.d(g0Var, coroutineContext);
        }
    }

    @NotNull
    g0<S> H();

    @NotNull
    CoroutineContext o(@NotNull CoroutineContext.Element element);
}
