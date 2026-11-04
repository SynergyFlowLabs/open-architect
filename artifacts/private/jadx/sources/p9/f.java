package p9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends com.google.flatbuffers.e {
    public static int C(com.google.flatbuffers.c cVar, byte[] bArr) {
        cVar.e0(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            cVar.d(bArr[length]);
        }
        return cVar.C();
    }

    public static int D(com.google.flatbuffers.c cVar, int[] iArr) {
        cVar.e0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            cVar.n(iArr[length]);
        }
        return cVar.C();
    }

    public static int E(com.google.flatbuffers.c cVar, int i10, int i11, int i12, int i13, int i14) {
        cVar.d0(5);
        v(cVar, i14);
        w(cVar, i13);
        x(cVar, i12);
        t(cVar, i11);
        u(cVar, i10);
        return H(cVar);
    }

    public static int F(com.google.flatbuffers.c cVar, int[] iArr) {
        cVar.e0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            cVar.n(iArr[length]);
        }
        return cVar.C();
    }

    public static int G(com.google.flatbuffers.c cVar, float[] fArr) {
        cVar.e0(4, fArr.length, 4);
        for (int length = fArr.length - 1; length >= 0; length--) {
            cVar.h(fArr[length]);
        }
        return cVar.C();
    }

    public static int H(com.google.flatbuffers.c cVar) {
        return cVar.B();
    }

    public static f I(ByteBuffer byteBuffer) {
        return J(byteBuffer, new f());
    }

    public static f J(ByteBuffer byteBuffer, f fVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return fVar.r(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void T(com.google.flatbuffers.c cVar, int i10) {
        cVar.e0(1, i10, 1);
    }

    public static void U(com.google.flatbuffers.c cVar, int i10) {
        cVar.e0(4, i10, 4);
    }

    public static void V(com.google.flatbuffers.c cVar) {
        cVar.d0(5);
    }

    public static void W(com.google.flatbuffers.c cVar, int i10) {
        cVar.e0(4, i10, 4);
    }

    public static void X(com.google.flatbuffers.c cVar, int i10) {
        cVar.e0(4, i10, 4);
    }

    public static void t(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(1, i10, 0);
    }

    public static void u(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(0, i10, 0);
    }

    public static void v(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(4, i10, 0);
    }

    public static void w(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(3, i10, 0);
    }

    public static void x(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(2, i10, 0);
    }

    public ByteBuffer A(ByteBuffer byteBuffer) {
        return k(byteBuffer, 6, 1);
    }

    public int B() {
        int iD = d(6);
        if (iD != 0) {
            return l(iD);
        }
        return 0;
    }

    public String K() {
        int iD = d(4);
        if (iD != 0) {
            return g(iD + this.f125235a);
        }
        return null;
    }

    public ByteBuffer L() {
        return j(4, 1);
    }

    public ByteBuffer M(ByteBuffer byteBuffer) {
        return k(byteBuffer, 4, 1);
    }

    public c N(int i10) {
        return O(new c(), i10);
    }

    public c O(c cVar, int i10) {
        int iD = d(12);
        if (iD != 0) {
            return cVar.r(b(i(iD) + (i10 * 4)), this.f125236b);
        }
        return null;
    }

    public int P() {
        int iD = d(12);
        if (iD != 0) {
            return l(iD);
        }
        return 0;
    }

    public g Q(int i10) {
        return R(new g(), i10);
    }

    public g R(g gVar, int i10) {
        int iD = d(10);
        if (iD != 0) {
            return gVar.r(b(i(iD) + (i10 * 4)), this.f125236b);
        }
        return null;
    }

    public int S() {
        int iD = d(10);
        if (iD != 0) {
            return l(iD);
        }
        return 0;
    }

    public float Y(int i10) {
        int iD = d(8);
        if (iD != 0) {
            return this.f125236b.getFloat(i(iD) + (i10 * 4));
        }
        return 0.0f;
    }

    public ByteBuffer Z() {
        return j(8, 4);
    }

    public ByteBuffer a0(ByteBuffer byteBuffer) {
        return k(byteBuffer, 8, 4);
    }

    public int b0() {
        int iD = d(8);
        if (iD != 0) {
            return l(iD);
        }
        return 0;
    }

    public f r(int i10, ByteBuffer byteBuffer) {
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

    public byte y(int i10) {
        int iD = d(6);
        if (iD != 0) {
            return this.f125236b.get(i(iD) + i10);
        }
        return (byte) 0;
    }

    public ByteBuffer z() {
        return j(6, 1);
    }
}
