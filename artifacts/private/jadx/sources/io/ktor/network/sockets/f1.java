package io.ktor.network.sockets;

import java.io.IOException;
import java.nio.channels.DatagramChannel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nUDPSocketBuilderJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UDPSocketBuilderJvm.kt\nio/ktor/network/sockets/UDPSocketBuilderJvmKt\n+ 2 SelectorManager.kt\nio/ktor/network/selector/SelectorManagerKt\n*L\n1#1,43:1\n61#2,8:44\n61#2,8:52\n*S KotlinDebug\n*F\n+ 1 UDPSocketBuilderJvm.kt\nio/ktor/network/sockets/UDPSocketBuilderJvmKt\n*L\n14#1:44,8\n32#1:52,8\n*E\n"})
public final class f1 {
    @Nullable
    public static final Object a(@NotNull io.ktor.network.selector.j jVar, @Nullable i0 i0Var, @NotNull p0.f fVar, @NotNull kotlin.coroutines.d<? super g> dVar) throws IOException {
        DatagramChannel datagramChannelOpenDatagramChannel = jVar.u0().openDatagramChannel();
        try {
            Intrinsics.checkNotNull(datagramChannelOpenDatagramChannel);
            c0.a(datagramChannelOpenDatagramChannel, fVar);
            c0.c(datagramChannelOpenDatagramChannel);
            if (c0.b()) {
                datagramChannelOpenDatagramChannel.bind(i0Var != null ? b0.a(i0Var) : null);
            } else {
                datagramChannelOpenDatagramChannel.socket().bind(i0Var != null ? b0.a(i0Var) : null);
            }
            return new y(datagramChannelOpenDatagramChannel, jVar);
        } catch (Throwable th2) {
            datagramChannelOpenDatagramChannel.close();
            throw th2;
        }
    }

    @Nullable
    public static final Object b(@NotNull io.ktor.network.selector.j jVar, @NotNull i0 i0Var, @Nullable i0 i0Var2, @NotNull p0.f fVar, @NotNull kotlin.coroutines.d<? super o> dVar) throws IOException {
        DatagramChannel datagramChannelOpenDatagramChannel = jVar.u0().openDatagramChannel();
        try {
            Intrinsics.checkNotNull(datagramChannelOpenDatagramChannel);
            c0.a(datagramChannelOpenDatagramChannel, fVar);
            c0.c(datagramChannelOpenDatagramChannel);
            if (c0.b()) {
                datagramChannelOpenDatagramChannel.bind(i0Var2 != null ? b0.a(i0Var2) : null);
            } else {
                datagramChannelOpenDatagramChannel.socket().bind(i0Var2 != null ? b0.a(i0Var2) : null);
            }
            datagramChannelOpenDatagramChannel.connect(b0.a(i0Var));
            return new y(datagramChannelOpenDatagramChannel, jVar);
        } catch (Throwable th2) {
            datagramChannelOpenDatagramChannel.close();
            throw th2;
        }
    }
}
