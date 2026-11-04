package io.ktor.utils.io;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class z0 implements kotlinx.coroutines.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f297183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f297184b;

    public z0(@NotNull h channel, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f297183a = channel;
        this.f297184b = coroutineContext;
    }

    @NotNull
    public final h c() {
        return this.f297183a;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f297184b;
    }
}
