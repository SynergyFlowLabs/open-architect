package mj;

import com.rabbitmq.tools.jsonrpc.j;
import kotlin.e1;
import kotlin.internal.f;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    @e1(version = j.f266120g)
    @f
    private static final byte a(byte b10, byte b11) {
        return (byte) (b10 & b11);
    }

    @e1(version = j.f266120g)
    @f
    private static final short b(short s10, short s11) {
        return (short) (s10 & s11);
    }

    @e1(version = j.f266120g)
    @f
    private static final byte c(byte b10) {
        return (byte) (~b10);
    }

    @e1(version = j.f266120g)
    @f
    private static final short d(short s10) {
        return (short) (~s10);
    }

    @e1(version = j.f266120g)
    @f
    private static final byte e(byte b10, byte b11) {
        return (byte) (b10 | b11);
    }

    @e1(version = j.f266120g)
    @f
    private static final short f(short s10, short s11) {
        return (short) (s10 | s11);
    }

    @e1(version = j.f266120g)
    @f
    private static final byte g(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }

    @e1(version = j.f266120g)
    @f
    private static final short h(short s10, short s11) {
        return (short) (s10 ^ s11);
    }
}
