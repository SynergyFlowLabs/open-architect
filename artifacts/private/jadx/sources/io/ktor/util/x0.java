package io.ktor.util;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class x0 implements z, m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final x0 f296820b = new x0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f296821c = "identity";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ w0 f296822a = w0.f296819a;

    private x0() {
    }

    @Override // io.ktor.util.m0
    @NotNull
    public io.ktor.utils.io.h a(@NotNull io.ktor.utils.io.h source, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return this.f296822a.a(source, coroutineContext);
    }

    @Override // io.ktor.util.m0
    @NotNull
    public io.ktor.utils.io.h b(@NotNull io.ktor.utils.io.h source, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return this.f296822a.b(source, coroutineContext);
    }

    @Override // io.ktor.util.m0
    @NotNull
    public io.ktor.utils.io.p c(@NotNull io.ktor.utils.io.p source, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return this.f296822a.c(source, coroutineContext);
    }

    @Override // io.ktor.util.z
    @NotNull
    public Long d(long j10) {
        return Long.valueOf(j10);
    }

    @Override // io.ktor.util.z
    @NotNull
    public String getName() {
        return f296821c;
    }
}
