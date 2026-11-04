package io.ktor.websocket;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nDefaultWebSocketSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n1#2:393\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f297254b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f297253a = pi.a.a("io.ktor.websocket.WebSocket");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final r0 f297255c = new r0("ws-incoming-processor");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final r0 f297256d = new r0("ws-outgoing-processor");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final a f297257e = new a(a.EnumC2106a.NORMAL, "OK");

    @NotNull
    public static final b a(@NotNull o0 session, long j10, long j11) {
        Intrinsics.checkNotNullParameter(session, "session");
        if (session instanceof b) {
            throw new IllegalArgumentException("Cannot wrap other DefaultWebSocketSession");
        }
        return new c(session, j10, j11);
    }

    public static /* synthetic */ b b(o0 o0Var, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        if ((i10 & 4) != 0) {
            j11 = 15000;
        }
        return a(o0Var, j10, j11);
    }

    @NotNull
    public static final org.slf4j.c f() {
        return f297253a;
    }

    @Nullable
    public static final kotlin.time.c g(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Long lValueOf = Long.valueOf(bVar.M0());
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        kotlin.time.c.a aVar = kotlin.time.c.f313406b;
        return kotlin.time.c.q(kotlin.time.e.n0(lValueOf.longValue(), kotlin.time.f.MILLISECONDS));
    }

    public static final long h(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        kotlin.time.c.a aVar = kotlin.time.c.f313406b;
        return kotlin.time.e.n0(bVar.N(), kotlin.time.f.MILLISECONDS);
    }

    public static final void i(@NotNull b pingInterval, @Nullable kotlin.time.c cVar) {
        Intrinsics.checkNotNullParameter(pingInterval, "$this$pingInterval");
        pingInterval.e1(cVar != null ? kotlin.time.c.f0(cVar.S0()) : 0L);
    }

    public static final void j(@NotNull b timeout, long j10) {
        Intrinsics.checkNotNullParameter(timeout, "$this$timeout");
        timeout.d0(kotlin.time.c.f0(j10));
    }
}
