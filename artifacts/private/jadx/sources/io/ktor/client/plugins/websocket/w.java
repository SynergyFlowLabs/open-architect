package io.ktor.client.plugins.websocket;

import io.ktor.websocket.o0;
import java.util.List;
import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements u, o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ o0 f295255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.call.b f295256b;

    public w(@NotNull io.ktor.client.call.b call, @NotNull o0 session) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f295255a = session;
        this.f295256b = call;
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public List<io.ktor.websocket.e0<?>> O0() {
        return this.f295255a.O0();
    }

    @Override // io.ktor.websocket.o0
    public void R0(long j10) {
        this.f295255a.R0(j10);
    }

    @Override // io.ktor.websocket.o0
    public long T() {
        return this.f295255a.T();
    }

    @Override // io.ktor.websocket.o0
    public void Y(boolean z10) {
        this.f295255a.Y(z10);
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public n0<io.ktor.websocket.e> a() {
        return this.f295255a.a();
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public kotlinx.coroutines.channels.o0<io.ktor.websocket.e> b() {
        return this.f295255a.b();
    }

    @Override // io.ktor.websocket.o0
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f295255a.d(dVar);
    }

    @Override // io.ktor.websocket.o0
    @Nullable
    public Object g1(@NotNull io.ktor.websocket.e eVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f295255a.g1(eVar, dVar);
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f295255a.getCoroutineContext();
    }

    @Override // io.ktor.client.plugins.websocket.u
    @NotNull
    public io.ktor.client.call.b h() {
        return this.f295256b;
    }

    @Override // io.ktor.websocket.o0
    @kotlin.l(level = kotlin.n.ERROR, message = "Use cancel() instead.", replaceWith = @b1(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void o0() {
        this.f295255a.o0();
    }

    @Override // io.ktor.websocket.o0
    public boolean o1() {
        return this.f295255a.o1();
    }
}
