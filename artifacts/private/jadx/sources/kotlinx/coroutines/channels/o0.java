package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.internal.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface o0<E> {

    public static final class a {
        public static /* synthetic */ boolean a(o0 o0Var, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return o0Var.F(th2);
        }

        @f1
        public static /* synthetic */ void b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull o0<? super E> o0Var, E e10) throws Throwable {
            Object objP = o0Var.p(e10);
            if (t.m(objP)) {
                int i10 = 4 | 1;
                return true;
            }
            Throwable thF = t.f(objP);
            if (thF == null) {
                return false;
            }
            throw y0.m(thF);
        }
    }

    boolean B();

    boolean F(@Nullable Throwable th2);

    @Nullable
    Object G(E e10, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @NotNull
    kotlinx.coroutines.selects.j<E, o0<E>> i();

    void n(@NotNull Function1<? super Throwable, Unit> function1);

    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e10);

    @NotNull
    Object p(E e10);
}
