package p9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends com.google.flatbuffers.e {
    public static m C(ByteBuffer byteBuffer) {
        return D(byteBuffer, new m());
    }

    public static m D(ByteBuffer byteBuffer, m mVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return mVar.r(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void H(com.google.flatbuffers.c cVar) {
        cVar.d0(5);
    }

    public static void t(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(1, i10, 0);
    }

    public static void u(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(0, i10, 0);
    }

    public static void v(com.google.flatbuffers.c cVar, byte b10) {
        cVar.e(4, b10, 3);
    }

    public static void w(com.google.flatbuffers.c cVar, int i10) {
        cVar.r(3, i10, 0);
    }

    public static void x(com.google.flatbuffers.c cVar, int i10) {
        cVar.r(2, i10, 0);
    }

    public static int y(com.google.flatbuffers.c cVar) {
        return cVar.B();
    }

    public ByteBuffer A() {
        return j(6, 1);
    }

    public ByteBuffer B(ByteBuffer byteBuffer) {
        return k(byteBuffer, 6, 1);
    }

    public String E() {
        int iD = d(4);
        if (iD != 0) {
            return g(iD + this.f125235a);
        }
        return null;
    }

    public ByteBuffer F() {
        return j(4, 1);
    }

    public ByteBuffer G(ByteBuffer byteBuffer) {
        return k(byteBuffer, 4, 1);
    }

    public byte I() {
        int iD = d(12);
        if (iD != 0) {
            return this.f125236b.get(iD + this.f125235a);
        }
        return (byte) 3;
    }

    public o J() {
        return K(new o());
    }

    public o K(o oVar) {
        int iD = d(10);
        if (iD != 0) {
            return oVar.b(iD + this.f125235a, this.f125236b);
        }
        return null;
    }

    public o L() {
        return M(new o());
    }

    public o M(o oVar) {
        int iD = d(8);
        if (iD != 0) {
            return oVar.b(iD + this.f125235a, this.f125236b);
        }
        return null;
    }

    public m r(int i10, ByteBuffer byteBuffer) {
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

    public String z() {
        int iD = d(6);
        if (iD != 0) {
            return g(iD + this.f125235a);
        }
        return null;
    }
}
