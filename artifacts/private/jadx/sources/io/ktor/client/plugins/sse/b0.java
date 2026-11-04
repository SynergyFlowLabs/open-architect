package io.ktor.client.plugins.sse;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ n0 f295014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.call.b f295015b;

    public b0(@NotNull io.ktor.client.call.b call, @NotNull n0 delegate) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f295014a = delegate;
        this.f295015b = call;
    }

    @Override // io.ktor.client.plugins.sse.n0
    @NotNull
    public kotlinx.coroutines.flow.i<li.a> a() {
        return this.f295014a.a();
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f295014a.getCoroutineContext();
    }

    @NotNull
    public final io.ktor.client.call.b h() {
        return this.f295015b;
    }
}
