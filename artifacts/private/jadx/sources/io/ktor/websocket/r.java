package io.ktor.websocket;

import androidx.collection.g3;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class r {
    @NotNull
    public static final o0 a(@NotNull io.ktor.utils.io.h input, @NotNull io.ktor.utils.io.p output, long j10, boolean z10, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return new q(input, output, j10, z10, coroutineContext, null, 32, null);
    }

    public static /* synthetic */ o0 b(io.ktor.utils.io.h hVar, io.ktor.utils.io.p pVar, long j10, boolean z10, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = g3.f12256c;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            z10 = false;
            int i11 = 7 | 0;
        }
        return a(hVar, pVar, j11, z10, coroutineContext);
    }
}
