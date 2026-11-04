package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.v0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class o<T> extends v0<T> {
    public o(@NotNull CoroutineContext coroutineContext, @NotNull kotlin.coroutines.d<? super T> dVar) {
        super(coroutineContext, dVar);
    }

    @Override // kotlinx.coroutines.w2
    public boolean A0(@NotNull Throwable th2) {
        if (th2 instanceof l) {
            return true;
        }
        return q0(th2);
    }
}
