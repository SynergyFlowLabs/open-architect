package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
class n3 extends a<Unit> {
    public n3(@NotNull CoroutineContext coroutineContext, boolean z10) {
        super(coroutineContext, true, z10);
    }

    @Override // kotlinx.coroutines.w2
    protected boolean n1(@NotNull Throwable th2) {
        p0.b(getContext(), th2);
        return true;
    }
}
