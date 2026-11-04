package io.ktor.util;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class w0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w0 f296819a = new w0();

    private w0() {
    }

    @Override // io.ktor.util.m0
    @NotNull
    public io.ktor.utils.io.h a(@NotNull io.ktor.utils.io.h source, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return source;
    }

    @Override // io.ktor.util.m0
    @NotNull
    public io.ktor.utils.io.h b(@NotNull io.ktor.utils.io.h source, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return source;
    }

    @Override // io.ktor.util.m0
    @NotNull
    public io.ktor.utils.io.p c(@NotNull io.ktor.utils.io.p source, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return source;
    }
}
