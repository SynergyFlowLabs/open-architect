package io.ktor.client.plugins.sse;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ o0 f295023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.call.b f295024b;

    public d0(@NotNull io.ktor.client.call.b call, @NotNull o0 delegate) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f295023a = delegate;
        this.f295024b = call;
    }

    @Override // io.ktor.client.plugins.sse.o0
    @NotNull
    public Function2<ri.b, String, Object> T0() {
        return this.f295023a.T0();
    }

    @Override // io.ktor.client.plugins.sse.o0
    @NotNull
    public kotlinx.coroutines.flow.i<li.d<String>> a() {
        return this.f295023a.a();
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f295023a.getCoroutineContext();
    }

    @NotNull
    public final io.ktor.client.call.b h() {
        return this.f295024b;
    }
}
