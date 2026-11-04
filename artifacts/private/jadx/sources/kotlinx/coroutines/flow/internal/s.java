package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class s implements kotlin.coroutines.d<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f314616a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final CoroutineContext f314617b = kotlin.coroutines.h.f312451a;

    private s() {
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        return f314617b;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@NotNull Object obj) {
    }
}
