package io.ktor.network.sockets;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.io.c0 f296317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i0 f296318b;

    public q(@NotNull kotlinx.io.c0 packet, @NotNull i0 address) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f296317a = packet;
        this.f296318b = address;
        if (ui.l.j(packet) <= okhttp3.internal.ws.g.f334653t) {
            return;
        }
        throw new IllegalArgumentException(("Datagram size limit exceeded: " + ui.l.j(packet) + " of possible 65535").toString());
    }

    @NotNull
    public final i0 a() {
        return this.f296318b;
    }

    @NotNull
    public final kotlinx.io.c0 b() {
        return this.f296317a;
    }
}
