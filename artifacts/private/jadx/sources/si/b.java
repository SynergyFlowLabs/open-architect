package si;

import com.rabbitmq.client.k0;
import kotlin.e2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.u1;
import kotlin.y1;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nByteOrder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteOrder.kt\nio/ktor/utils/io/bits/ByteOrderKt\n+ 2 ByteOrderJvm.kt\nio/ktor/utils/io/bits/ByteOrderJVMKt\n*L\n1#1,74:1\n11#2:75\n19#2:76\n27#2:77\n*S KotlinDebug\n*F\n+ 1 ByteOrder.kt\nio/ktor/utils/io/bits/ByteOrderKt\n*L\n47#1:75\n54#1:76\n61#1:77\n*E\n"})
public final class b {
    public static final byte a(short s10) {
        return (byte) (s10 >>> 8);
    }

    public static final int b(long j10) {
        return (int) (j10 >>> 32);
    }

    public static final short c(int i10) {
        return (short) (i10 >>> 16);
    }

    public static final byte d(short s10) {
        return (byte) (s10 & 255);
    }

    public static final int e(long j10) {
        return (int) (j10 & k0.f265952a);
    }

    public static final short f(int i10) {
        return (short) (i10 & 65535);
    }

    public static final long g(long j10) {
        return y1.n(Long.reverseBytes(j10));
    }

    public static final int h(int i10) {
        return u1.n(Integer.reverseBytes(i10));
    }

    public static final short i(short s10) {
        return e2.n(Short.reverseBytes(s10));
    }
}
