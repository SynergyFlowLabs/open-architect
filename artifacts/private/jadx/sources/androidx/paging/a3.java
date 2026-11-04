package androidx.paging;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface a3<T> extends kotlinx.coroutines.s0, kotlinx.coroutines.channels.o0<T> {

    public static final class a {
        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <T> boolean a(@NotNull a3<T> a3Var, T t10) {
            return kotlinx.coroutines.channels.o0.a.c(a3Var, t10);
        }
    }

    @Nullable
    Object U0(@NotNull Function0<Unit> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @NotNull
    kotlinx.coroutines.channels.o0<T> s();
}
