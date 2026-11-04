package kotlinx.coroutines.channels;

import kotlin.b1;
import kotlinx.coroutines.f3;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@f3
public interface c<E> extends s0, n0<E> {

    public static final class a {
        @NotNull
        public static <E> kotlinx.coroutines.selects.h<E> b(@NotNull c<E> cVar) {
            return n0.a.d(cVar);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E c(@NotNull c<E> cVar) {
            return (E) n0.a.h(cVar);
        }

        @kotlin.internal.h
        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
        @Nullable
        public static <E> Object d(@NotNull c<E> cVar, @NotNull kotlin.coroutines.d<? super E> dVar) {
            return n0.a.i(cVar, dVar);
        }
    }

    @NotNull
    p<E> s();
}
