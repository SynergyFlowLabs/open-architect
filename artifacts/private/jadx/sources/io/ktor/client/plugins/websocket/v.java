package io.ktor.client.plugins.websocket;

import java.util.List;
import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.channels.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements u, io.ktor.websocket.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ io.ktor.websocket.b f295253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.call.b f295254b;

    public v(@NotNull io.ktor.client.call.b call, @NotNull io.ktor.websocket.b delegate) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f295253a = delegate;
        this.f295254b = call;
    }

    @Override // io.ktor.websocket.b
    public long M0() {
        return this.f295253a.M0();
    }

    @Override // io.ktor.websocket.b
    public long N() {
        return this.f295253a.N();
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public List<io.ktor.websocket.e0<?>> O0() {
        return this.f295253a.O0();
    }

    @Override // io.ktor.websocket.o0
    public void R0(long j10) {
        this.f295253a.R0(j10);
    }

    @Override // io.ktor.websocket.o0
    public long T() {
        return this.f295253a.T();
    }

    @Override // io.ktor.websocket.o0
    public void Y(boolean z10) {
        this.f295253a.Y(z10);
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public n0<io.ktor.websocket.e> a() {
        return this.f295253a.a();
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public o0<io.ktor.websocket.e> b() {
        return this.f295253a.b();
    }

    @Override // io.ktor.websocket.o0
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f295253a.d(dVar);
    }

    @Override // io.ktor.websocket.b
    public void d0(long j10) {
        this.f295253a.d0(j10);
    }

    @Override // io.ktor.websocket.b
    public void e1(long j10) {
        this.f295253a.e1(j10);
    }

    @Override // io.ktor.websocket.b
    @NotNull
    public a1<io.ktor.websocket.a> g() {
        return this.f295253a.g();
    }

    @Override // io.ktor.websocket.o0
    @Nullable
    public Object g1(@NotNull io.ktor.websocket.e eVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f295253a.g1(eVar, dVar);
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f295253a.getCoroutineContext();
    }

    @Override // io.ktor.client.plugins.websocket.u
    @NotNull
    public io.ktor.client.call.b h() {
        return this.f295254b;
    }

    @Override // io.ktor.websocket.b
    @io.ktor.utils.io.o0
    public void h1(@NotNull List<? extends io.ktor.websocket.e0<?>> negotiatedExtensions) {
        Intrinsics.checkNotNullParameter(negotiatedExtensions, "negotiatedExtensions");
        this.f295253a.h1(negotiatedExtensions);
    }

    @Override // io.ktor.websocket.o0
    @kotlin.l(level = kotlin.n.ERROR, message = "Use cancel() instead.", replaceWith = @b1(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void o0() {
        this.f295253a.o0();
    }

    @Override // io.ktor.websocket.o0
    public boolean o1() {
        return this.f295253a.o1();
    }
}
