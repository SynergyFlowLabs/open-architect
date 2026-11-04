package io.ktor.client.plugins.websocket;

import androidx.collection.g3;
import io.ktor.websocket.m0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nDurations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Durations.kt\nio/ktor/client/plugins/websocket/DurationsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
public final class x {
    @NotNull
    public static final d0 a(@Nullable kotlin.time.c cVar, long j10) {
        return new d0(cVar != null ? kotlin.time.c.f0(cVar.S0()) : 0L, j10, new m0(), null, 8, null);
    }

    public static /* synthetic */ d0 b(kotlin.time.c cVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = g3.f12256c;
        }
        return a(cVar, j10);
    }

    @Nullable
    public static final kotlin.time.c c(@NotNull d0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Long lValueOf = Long.valueOf(aVar.e());
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        kotlin.time.c.a aVar2 = kotlin.time.c.f313406b;
        return kotlin.time.c.q(kotlin.time.e.n0(lValueOf.longValue(), kotlin.time.f.MILLISECONDS));
    }

    @Nullable
    public static final kotlin.time.c d(@NotNull d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Long lValueOf = Long.valueOf(d0Var.i());
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        kotlin.time.c.a aVar = kotlin.time.c.f313406b;
        return kotlin.time.c.q(kotlin.time.e.n0(lValueOf.longValue(), kotlin.time.f.MILLISECONDS));
    }

    public static final void e(@NotNull d0.a pingInterval, @Nullable kotlin.time.c cVar) {
        Intrinsics.checkNotNullParameter(pingInterval, "$this$pingInterval");
        pingInterval.h(cVar != null ? kotlin.time.c.f0(cVar.S0()) : 0L);
    }
}
