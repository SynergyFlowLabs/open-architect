package p9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends com.google.flatbuffers.e {
    public static int A(com.google.flatbuffers.c cVar, int[] iArr) {
        cVar.e0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            cVar.n(iArr[length]);
        }
        return cVar.C();
    }

    public static int B(com.google.flatbuffers.c cVar) {
        return cVar.B();
    }

    public static i C(ByteBuffer byteBuffer) {
        return D(byteBuffer, new i());
    }

    public static i D(ByteBuffer byteBuffer, i iVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return iVar.r(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void U(com.google.flatbuffers.c cVar) {
        cVar.d0(7);
    }

    public static void V(com.google.flatbuffers.c cVar, int i10) {
        cVar.e0(4, i10, 4);
    }

    public static void t(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(0, i10, 0);
    }

    public static void u(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(2, i10, 0);
    }

    public static void v(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(1, i10, 0);
    }

    public static void w(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(6, i10, 0);
    }

    public static void x(com.google.flatbuffers.c cVar, int i10) {
        cVar.r(5, i10, 0);
    }

    public static void y(com.google.flatbuffers.c cVar, int i10) {
        cVar.r(4, i10, 0);
    }

    public static void z(com.google.flatbuffers.c cVar, int i10) {
        cVar.r(3, i10, 0);
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

    public String H() {
        int iD = d(8);
        if (iD != 0) {
            return g(iD + this.f125235a);
        }
        return null;
    }

    public ByteBuffer I() {
        return j(8, 1);
    }

    public ByteBuffer J(ByteBuffer byteBuffer) {
        return k(byteBuffer, 8, 1);
    }

    public String K() {
        int iD = d(6);
        if (iD != 0) {
            return g(iD + this.f125235a);
        }
        return null;
    }

    public ByteBuffer L() {
        return j(6, 1);
    }

    public ByteBuffer M(ByteBuffer byteBuffer) {
        return k(byteBuffer, 6, 1);
    }

    public j N(int i10) {
        return O(new j(), i10);
    }

    public j O(j jVar, int i10) {
        int iD = d(16);
        if (iD != 0) {
            return jVar.r(b(i(iD) + (i10 * 4)), this.f125236b);
        }
        return null;
    }

    public int P() {
        int iD = d(16);
        if (iD != 0) {
            return l(iD);
        }
        return 0;
    }

    public l Q() {
        return R(new l());
    }

    public l R(l lVar) {
        int iD = d(14);
        if (iD != 0) {
            return lVar.b(iD + this.f125235a, this.f125236b);
        }
        return null;
    }

    public p S() {
        return T(new p());
    }

    public p T(p pVar) {
        int iD = d(12);
        if (iD != 0) {
            return pVar.b(iD + this.f125235a, this.f125236b);
        }
        return null;
    }

    public p W() {
        return X(new p());
    }

    public p X(p pVar) {
        int iD = d(10);
        if (iD != 0) {
            return pVar.b(iD + this.f125235a, this.f125236b);
        }
        return null;
    }

    public i r(int i10, ByteBuffer byteBuffer) {
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
