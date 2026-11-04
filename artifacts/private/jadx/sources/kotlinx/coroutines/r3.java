package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface r3<S> extends CoroutineContext.Element {

    public static final class a {
        public static <S, R> R a(@NotNull r3<S> r3Var, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(r3Var, r10, function2);
        }

        @Nullable
        public static <S, E extends CoroutineContext.Element> E b(@NotNull r3<S> r3Var, @NotNull CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(r3Var, bVar);
        }

        @NotNull
        public static <S> CoroutineContext c(@NotNull r3<S> r3Var, @NotNull CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(r3Var, bVar);
        }

        @NotNull
        public static <S> CoroutineContext d(@NotNull r3<S> r3Var, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(r3Var, coroutineContext);
        }
    }

    void I(@NotNull CoroutineContext coroutineContext, S s10);

    S l1(@NotNull CoroutineContext coroutineContext);
}
