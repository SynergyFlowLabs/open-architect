package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class c4 extends n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c4 f313554b = new c4();

    private c4() {
    }

    @Override // kotlinx.coroutines.n0
    public boolean N(@NotNull CoroutineContext coroutineContext) {
        return false;
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public n0 Y(int i10, @Nullable String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.n0
    public void h(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        g4 g4Var = (g4) coroutineContext.get(g4.f315017b);
        if (g4Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        g4Var.f315018a = true;
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
