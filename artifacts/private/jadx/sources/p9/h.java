package p9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends com.google.flatbuffers.e {
    public static int A(com.google.flatbuffers.c cVar) {
        return cVar.B();
    }

    public static void B(com.google.flatbuffers.c cVar, int i10) {
        cVar.D(i10);
    }

    public static void C(com.google.flatbuffers.c cVar, int i10) {
        cVar.H(i10);
    }

    public static h D(ByteBuffer byteBuffer) {
        return E(byteBuffer, new h());
    }

    public static h E(ByteBuffer byteBuffer, h hVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return hVar.r(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void O(com.google.flatbuffers.c cVar, int i10) {
        cVar.e0(4, i10, 4);
    }

    public static void P(com.google.flatbuffers.c cVar, int i10) {
        cVar.e0(4, i10, 4);
    }

    public static void Q(com.google.flatbuffers.c cVar) {
        cVar.d0(3);
    }

    public static void R(com.google.flatbuffers.c cVar, int i10) {
        cVar.e0(4, i10, 4);
    }

    public static void t(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(2, i10, 0);
    }

    public static void u(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(0, i10, 0);
    }

    public static void v(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(1, i10, 0);
    }

    public static int w(com.google.flatbuffers.c cVar, int[] iArr) {
        cVar.e0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            cVar.n(iArr[length]);
        }
        return cVar.C();
    }

    public static int x(com.google.flatbuffers.c cVar, int[] iArr) {
        cVar.e0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            cVar.n(iArr[length]);
        }
        return cVar.C();
    }

    public static int y(com.google.flatbuffers.c cVar, int i10, int i11, int i12) {
        cVar.d0(3);
        t(cVar, i12);
        v(cVar, i11);
        u(cVar, i10);
        return A(cVar);
    }

    public static int z(com.google.flatbuffers.c cVar, int[] iArr) {
        cVar.e0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            cVar.n(iArr[length]);
        }
        return cVar.C();
    }

    public e F(int i10) {
        return G(new e(), i10);
    }

    public e G(e eVar, int i10) {
        int iD = d(8);
        if (iD != 0) {
            return eVar.r(b(i(iD) + (i10 * 4)), this.f125236b);
        }
        return null;
    }

    public int H() {
        int iD = d(8);
        if (iD != 0) {
            return l(iD);
        }
        return 0;
    }

    public f I(int i10) {
        return J(new f(), i10);
    }

    public f J(f fVar, int i10) {
        int iD = d(4);
        if (iD != 0) {
            return fVar.r(b(i(iD) + (i10 * 4)), this.f125236b);
        }
        return null;
    }

    public int K() {
        int iD = d(4);
        if (iD != 0) {
            return l(iD);
        }
        return 0;
    }

    public i L(int i10) {
        return M(new i(), i10);
    }

    public i M(i iVar, int i10) {
        int iD = d(6);
        if (iD != 0) {
            return iVar.r(b(i(iD) + (i10 * 4)), this.f125236b);
        }
        return null;
    }

    public int N() {
        int iD = d(6);
        if (iD != 0) {
            return l(iD);
        }
        return 0;
    }

    public h r(int i10, ByteBuffer byteBuffer) {
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
