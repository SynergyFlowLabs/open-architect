package io.ktor.utils.io;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e1 implements kotlinx.coroutines.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f296874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f296875b;

    public e1(@NotNull p channel, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f296874a = channel;
        this.f296875b = coroutineContext;
    }

    @NotNull
    public final p c() {
        return this.f296874a;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f296875b;
    }
}
