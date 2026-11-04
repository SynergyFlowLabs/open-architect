package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 {
    @NotNull
    public static final g0 a(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return new g0(hVar);
    }

    public static final long b(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        throw new IllegalStateException("Counter is no longer available on the regular ByteReadChannel. Use CounterByteReadChannel instead.");
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Counter is no longer available on the regular ByteReadChannel. Use CounterByteReadChannel instead.", replaceWith = @kotlin.b1(expression = "this.counted().totalBytesRead", imports = {}))
    public static /* synthetic */ void c(h hVar) {
    }
}
