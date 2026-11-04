package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.x0;
import kotlinx.coroutines.x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
class a<E> extends q<E> implements c<E> {
    public a(@NotNull CoroutineContext coroutineContext, @NotNull p<E> pVar, boolean z10) {
        super(coroutineContext, pVar, false, z10);
        q1((p2) coroutineContext.get(p2.M2));
    }

    @Override // kotlinx.coroutines.w2
    protected void I1(@Nullable Throwable th2) {
        p<E> pVarI2 = i2();
        CancellationException cancellationExceptionA = null;
        if (th2 != null) {
            cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = x1.a(x0.a(this) + " was cancelled", th2);
            }
        }
        pVarI2.e(cancellationExceptionA);
    }

    @Override // kotlinx.coroutines.w2
    protected boolean n1(@NotNull Throwable th2) {
        kotlinx.coroutines.p0.b(getContext(), th2);
        return true;
    }
}
