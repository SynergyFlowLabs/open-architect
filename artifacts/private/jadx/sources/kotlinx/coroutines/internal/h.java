package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements kotlinx.coroutines.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f315051a;

    public h(@NotNull CoroutineContext coroutineContext) {
        this.f315051a = coroutineContext;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f315051a;
    }

    @NotNull
    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
