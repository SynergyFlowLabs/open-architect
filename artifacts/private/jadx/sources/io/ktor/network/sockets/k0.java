package io.ktor.network.sockets;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class k0 {
    public static final int a(@NotNull i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        if (i0Var instanceof a0) {
            return ((a0) i0Var).h();
        }
        throw new UnsupportedOperationException("SocketAddress " + i0Var + " does not have a port");
    }
}
