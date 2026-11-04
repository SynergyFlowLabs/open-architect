package p9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends com.google.flatbuffers.e {
    public static g A(ByteBuffer byteBuffer, g gVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return gVar.r(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void J(com.google.flatbuffers.c cVar, int i10) {
        cVar.e0(2, i10, 2);
    }

    public static void K(com.google.flatbuffers.c cVar) {
        cVar.d0(3);
    }

    public static void t(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(0, i10, 0);
    }

    public static void u(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(2, i10, 0);
    }

    public static void v(com.google.flatbuffers.c cVar, byte b10) {
        cVar.e(1, b10, 1);
    }

    public static int w(com.google.flatbuffers.c cVar, short[] sArr) {
        cVar.e0(2, sArr.length, 2);
        for (int length = sArr.length - 1; length >= 0; length--) {
            cVar.q(sArr[length]);
        }
        return cVar.C();
    }

    public static int x(com.google.flatbuffers.c cVar, int i10, byte b10, int i11) {
        cVar.d0(3);
        u(cVar, i11);
        t(cVar, i10);
        v(cVar, b10);
        return y(cVar);
    }

    public static int y(com.google.flatbuffers.c cVar) {
        return cVar.B();
    }

    public static g z(ByteBuffer byteBuffer) {
        return A(byteBuffer, new g());
    }

    public String B() {
        int iD = d(4);
        if (iD != 0) {
            return g(iD + this.f125235a);
        }
        return null;
    }

    public ByteBuffer C() {
        return j(4, 1);
    }

    public ByteBuffer D(ByteBuffer byteBuffer) {
        return k(byteBuffer, 4, 1);
    }

    public short E(int i10) {
        int iD = d(8);
        if (iD != 0) {
            return this.f125236b.getShort(i(iD) + (i10 * 2));
        }
        return (short) 0;
    }

    public ByteBuffer F() {
        return j(8, 2);
    }

    public ByteBuffer G(ByteBuffer byteBuffer) {
        return k(byteBuffer, 8, 2);
    }

    public int H() {
        int iD = d(8);
        if (iD != 0) {
            return l(iD);
        }
        return 0;
    }

    public byte I() {
        int iD = d(6);
        if (iD != 0) {
            return this.f125236b.get(iD + this.f125235a);
        }
        return (byte) 1;
    }

    public g r(int i10, ByteBuffer byteBuffer) {
        s(i10, byteBuffer);
        return this;
    }

    public void s(int i10, ByteBuffer byteBuffer) {
        this.f125235a = i10;
        this.f125236b = byteBuffer;
        int i11 = i10 - byteBuffer.getInt(i10);
        this.f125237c = i11;
        this.f125238d = this.f125236b.getShort(i11);
    }
}
