package qi;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    @NotNull
    public static final SocketAddress a(@NotNull String hostname, int i10) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return new InetSocketAddress(hostname, i10);
    }

    @NotNull
    public static final String b(@NotNull SocketAddress socketAddress) {
        String hostString;
        Intrinsics.checkNotNullParameter(socketAddress, "<this>");
        InetSocketAddress inetSocketAddress = socketAddress instanceof InetSocketAddress ? (InetSocketAddress) socketAddress : null;
        return (inetSocketAddress == null || (hostString = inetSocketAddress.getHostString()) == null) ? "" : hostString;
    }

    @NotNull
    public static final String c(@NotNull SocketAddress socketAddress) {
        InetAddress address;
        String hostName;
        Intrinsics.checkNotNullParameter(socketAddress, "<this>");
        boolean z10 = socketAddress instanceof InetSocketAddress;
        String hostName2 = null;
        InetSocketAddress inetSocketAddress = z10 ? (InetSocketAddress) socketAddress : null;
        if (inetSocketAddress != null && (hostName = inetSocketAddress.getHostName()) != null) {
            return hostName;
        }
        InetSocketAddress inetSocketAddress2 = z10 ? (InetSocketAddress) socketAddress : null;
        if (inetSocketAddress2 != null && (address = inetSocketAddress2.getAddress()) != null) {
            hostName2 = address.getHostName();
        }
        return hostName2 == null ? "" : hostName2;
    }

    public static final int d(@NotNull SocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(socketAddress, "<this>");
        InetSocketAddress inetSocketAddress = socketAddress instanceof InetSocketAddress ? (InetSocketAddress) socketAddress : null;
        if (inetSocketAddress != null) {
            return inetSocketAddress.getPort();
        }
        return 0;
    }
}
