package p9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends com.google.flatbuffers.e {
    public static int C(com.google.flatbuffers.c cVar) {
        return cVar.B();
    }

    public static c E(ByteBuffer byteBuffer) {
        return F(byteBuffer, new c());
    }

    public static c F(ByteBuffer byteBuffer, c cVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return cVar.r(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void M(com.google.flatbuffers.c cVar) {
        cVar.d0(7);
    }

    public static void t(com.google.flatbuffers.c cVar, int i10) {
        cVar.r(2, i10, 0);
    }

    public static void u(com.google.flatbuffers.c cVar, float f10) {
        cVar.i(4, f10, 0.0d);
    }

    public static void v(com.google.flatbuffers.c cVar, int i10) {
        cVar.r(1, i10, 0);
    }

    public static void w(com.google.flatbuffers.c cVar, int i10) {
        cVar.r(3, i10, 0);
    }

    public static void x(com.google.flatbuffers.c cVar, float f10) {
        cVar.i(5, f10, 0.0d);
    }

    public static void y(com.google.flatbuffers.c cVar, float f10) {
        cVar.i(6, f10, 0.0d);
    }

    public static void z(com.google.flatbuffers.c cVar, byte b10) {
        cVar.e(0, b10, 0);
    }

    public p A() {
        return B(new p());
    }

    public p B(p pVar) {
        int iD = d(8);
        if (iD != 0) {
            return pVar.b(iD + this.f125235a, this.f125236b);
        }
        return null;
    }

    public float D() {
        int iD = d(12);
        if (iD != 0) {
            return this.f125236b.getFloat(iD + this.f125235a);
        }
        return 0.0f;
    }

    public p G() {
        return H(new p());
    }

    public p H(p pVar) {
        int iD = d(6);
        if (iD != 0) {
            return pVar.b(iD + this.f125235a, this.f125236b);
        }
        return null;
    }

    public o I() {
        return J(new o());
    }

    public o J(o oVar) {
        int iD = d(10);
        if (iD != 0) {
            return oVar.b(iD + this.f125235a, this.f125236b);
        }
        return null;
    }

    public float K() {
        int iD = d(14);
        if (iD != 0) {
            return this.f125236b.getFloat(iD + this.f125235a);
        }
        return 0.0f;
    }

    public float L() {
        int iD = d(16);
        if (iD != 0) {
            return this.f125236b.getFloat(iD + this.f125235a);
        }
        return 0.0f;
    }

    public byte N() {
        int iD = d(4);
        if (iD != 0) {
            return this.f125236b.get(iD + this.f125235a);
        }
        return (byte) 0;
    }

    public c r(int i10, ByteBuffer byteBuffer) {
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
