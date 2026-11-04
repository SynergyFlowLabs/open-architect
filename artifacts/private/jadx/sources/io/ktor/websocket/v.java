package io.ktor.websocket;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nUtilsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtilsJvm.kt\nio/ktor/websocket/UtilsKt__UtilsJvmKt\n+ 2 Utils.kt\nio/ktor/websocket/UtilsKt__UtilsKt\n*L\n1#1,24:1\n11#2:25\n*S KotlinDebug\n*F\n+ 1 UtilsJvm.kt\nio/ktor/websocket/UtilsKt__UtilsJvmKt\n*L\n18#1:25\n*E\n"})
final /* synthetic */ class v {
    public static final int a() {
        String property = System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        if (property != null) {
            return Integer.parseInt(property);
        }
        return 8;
    }

    public static final void b(@NotNull ByteBuffer byteBuffer, @NotNull ByteBuffer other) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = other.slice();
        int iRemaining = byteBufferSlice2.remaining();
        int iRemaining2 = byteBufferSlice.remaining();
        for (int i10 = 0; i10 < iRemaining2; i10++) {
            byteBufferSlice.put(i10, (byte) (byteBufferSlice.get(i10) ^ byteBufferSlice2.get(i10 % iRemaining)));
        }
    }
}
