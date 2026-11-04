package w2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements AutoCloseable, s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f385874a;

    public b(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f385874a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        u2.i(getCoroutineContext(), null, 1, null);
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f385874a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull s0 coroutineScope) {
        this(coroutineScope.getCoroutineContext());
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }
}
