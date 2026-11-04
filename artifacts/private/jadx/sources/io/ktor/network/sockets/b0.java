package io.ktor.network.sockets;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 {
    @NotNull
    public static final SocketAddress a(@NotNull i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        return i0Var.a();
    }

    @NotNull
    public static final i0 b(@NotNull SocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(socketAddress, "<this>");
        if (socketAddress instanceof InetSocketAddress) {
            return new a0((InetSocketAddress) socketAddress);
        }
        if (Intrinsics.areEqual(socketAddress.getClass().getName(), j0.f296268a)) {
            return new g1(socketAddress);
        }
        throw new IllegalStateException("Unknown socket address type");
    }
}
