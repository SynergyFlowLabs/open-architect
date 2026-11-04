package p9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends com.google.flatbuffers.e {
    public static void A(com.google.flatbuffers.c cVar, int i10) {
        cVar.r(9, i10, 0);
    }

    public static void B(com.google.flatbuffers.c cVar, float f10) {
        cVar.i(10, f10, 0.0d);
    }

    public static void C(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(8, i10, 0);
    }

    public static void D(com.google.flatbuffers.c cVar, float f10) {
        cVar.i(13, f10, 0.0d);
    }

    public static void E(com.google.flatbuffers.c cVar, boolean z10) {
        cVar.b(12, z10, false);
    }

    public static int G(com.google.flatbuffers.c cVar, int[] iArr) {
        cVar.e0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            cVar.n(iArr[length]);
        }
        return cVar.C();
    }

    public static int M(com.google.flatbuffers.c cVar) {
        return cVar.B();
    }

    public static e N(ByteBuffer byteBuffer) {
        return O(byteBuffer, new e());
    }

    public static e O(ByteBuffer byteBuffer, e eVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return eVar.r(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void W(com.google.flatbuffers.c cVar) {
        cVar.d0(17);
    }

    public static void X(com.google.flatbuffers.c cVar, int i10) {
        cVar.e0(4, i10, 4);
    }

    public static void t(com.google.flatbuffers.c cVar, float f10) {
        cVar.i(11, f10, 0.0d);
    }

    public static void u(com.google.flatbuffers.c cVar, int i10) {
        cVar.r(1, i10, 0);
    }

    public static void v(com.google.flatbuffers.c cVar, float f10) {
        cVar.i(14, f10, 0.0d);
    }

    public static void w(com.google.flatbuffers.c cVar, boolean z10) {
        cVar.b(15, z10, false);
    }

    public static void x(com.google.flatbuffers.c cVar, boolean z10) {
        cVar.b(16, z10, false);
    }

    public static void y(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(0, i10, 0);
    }

    public static void z(com.google.flatbuffers.c cVar, float f10) {
        cVar.i(7, f10, 0.0d);
    }

    public float F() {
        int iD = d(26);
        if (iD != 0) {
            return this.f125236b.getFloat(iD + this.f125235a);
        }
        return 0.0f;
    }

    public b H() {
        return I(new b());
    }

    public b I(b bVar) {
        int iD = d(6);
        if (iD != 0) {
            return bVar.b(iD + this.f125235a, this.f125236b);
        }
        return null;
    }

    public float J() {
        int iD = d(32);
        if (iD != 0) {
            return this.f125236b.getFloat(iD + this.f125235a);
        }
        return 0.0f;
    }

    public boolean K() {
        int iD = d(34);
        return (iD == 0 || this.f125236b.get(iD + this.f125235a) == 0) ? false : true;
    }

    public boolean L() {
        int iD = d(36);
        return (iD == 0 || this.f125236b.get(iD + this.f125235a) == 0) ? false : true;
    }

    public String P() {
        int iD = d(4);
        if (iD != 0) {
            return g(iD + this.f125235a);
        }
        return null;
    }

    public ByteBuffer Q() {
        return j(4, 1);
    }

    public ByteBuffer R(ByteBuffer byteBuffer) {
        return k(byteBuffer, 4, 1);
    }

    public float S() {
        int iD = d(18);
        if (iD != 0) {
            return this.f125236b.getFloat(iD + this.f125235a);
        }
        return 0.0f;
    }

    public b T() {
        return U(new b());
    }

    public b U(b bVar) {
        int iD = d(22);
        if (iD != 0) {
            return bVar.b(iD + this.f125235a, this.f125236b);
        }
        return null;
    }

    public float V() {
        int iD = d(24);
        if (iD != 0) {
            return this.f125236b.getFloat(iD + this.f125235a);
        }
        return 0.0f;
    }

    public m Y(int i10) {
        return Z(new m(), i10);
    }

    public m Z(m mVar, int i10) {
        int iD = d(20);
        if (iD != 0) {
            return mVar.r(b(i(iD) + (i10 * 4)), this.f125236b);
        }
        return null;
    }

    public int a0() {
        int iD = d(20);
        if (iD != 0) {
            return l(iD);
        }
        return 0;
    }

    public float b0() {
        int iD = d(30);
        if (iD != 0) {
            return this.f125236b.getFloat(iD + this.f125235a);
        }
        return 0.0f;
    }

    public boolean c0() {
        int iD = d(28);
        return (iD == 0 || this.f125236b.get(iD + this.f125235a) == 0) ? false : true;
    }

    public e r(int i10, ByteBuffer byteBuffer) {
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
