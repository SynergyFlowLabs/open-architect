package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements kotlin.coroutines.d<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f312475a = new c();

    private c() {
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@NotNull Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @NotNull
    public String toString() {
        return "This continuation is already complete";
    }
}
