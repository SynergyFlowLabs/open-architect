package io.ktor.util;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class p0 implements z, m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final p0 f296751b = new p0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f296752c = "gzip";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ m0 f296753a = n0.e();

    private p0() {
    }

    @Override // io.ktor.util.m0
    @NotNull
    public io.ktor.utils.io.h a(@NotNull io.ktor.utils.io.h source, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return this.f296753a.a(source, coroutineContext);
    }

    @Override // io.ktor.util.m0
    @NotNull
    public io.ktor.utils.io.h b(@NotNull io.ktor.utils.io.h source, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return this.f296753a.b(source, coroutineContext);
    }

    @Override // io.ktor.util.m0
    @NotNull
    public io.ktor.utils.io.p c(@NotNull io.ktor.utils.io.p source, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return this.f296753a.c(source, coroutineContext);
    }

    @Override // io.ktor.util.z
    @Nullable
    public Long d(long j10) {
        return z.a.a(this, j10);
    }

    @Override // io.ktor.util.z
    @NotNull
    public String getName() {
        return f296752c;
    }
}
