package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.b1;
import kotlinx.coroutines.f3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.l(level = kotlin.n.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@f3
public interface d<E> extends o0<E> {

    public static final class a {
        public static /* synthetic */ void a(d dVar, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            dVar.e(cancellationException);
        }

        public static /* synthetic */ boolean b(d dVar, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return dVar.c(th2);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull d<E> dVar, E e10) {
            return o0.a.c(dVar, e10);
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility only")
    /* synthetic */ boolean c(Throwable th2);

    void e(@Nullable CancellationException cancellationException);

    @NotNull
    n0<E> k();
}
