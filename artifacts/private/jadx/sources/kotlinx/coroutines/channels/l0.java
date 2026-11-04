package kotlinx.coroutines.channels;

import kotlin.b1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface l0<E> extends s0, o0<E> {

    public static final class a {
        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean a(@NotNull l0<? super E> l0Var, E e10) {
            return o0.a.c(l0Var, e10);
        }
    }

    @NotNull
    o0<E> s();
}
