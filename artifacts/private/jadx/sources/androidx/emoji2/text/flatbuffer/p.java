package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends v {

    public static final class a extends b {
        public a f(int i10, int i11, ByteBuffer byteBuffer) {
            b(i10, i11, byteBuffer);
            return this;
        }

        public p g(int i10) {
            return h(new p(), i10);
        }

        public p h(p pVar, int i10) {
            return pVar.v(v.c(a(i10), this.f51111d), this.f51111d);
        }
    }

    public static void A(i iVar, int i10) {
        iVar.k(0, i10, 0);
    }

    public static int B(i iVar, int[] iArr) {
        iVar.h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            iVar.n(iArr[length]);
        }
        return iVar.E();
    }

    public static int C(i iVar, int i10, int i11, int i12) {
        iVar.g0(3);
        z(iVar, i12);
        y(iVar, i11);
        A(iVar, i10);
        return D(iVar);
    }

    public static int D(i iVar) {
        return iVar.D();
    }

    public static void E(i iVar, int i10) {
        iVar.F(i10);
    }

    public static void F(i iVar, int i10) {
        iVar.J(i10);
    }

    public static p G(ByteBuffer byteBuffer) {
        return H(byteBuffer, new p());
    }

    public static p H(ByteBuffer byteBuffer, p pVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return pVar.v(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void Q(i iVar, int i10) {
        iVar.h0(4, i10, 4);
    }

    public static void R(i iVar) {
        iVar.g0(3);
    }

    public static void u() {
        g.a();
    }

    public static void y(i iVar, int i10) {
        iVar.o(1, i10, 0);
    }

    public static void z(i iVar, int i10) {
        iVar.o(2, i10, 0);
    }

    public o I(int i10) {
        return J(new o(), i10);
    }

    public o J(o oVar, int i10) {
        int iD = d(6);
        if (iD != 0) {
            return oVar.v(b(l(iD) + (i10 * 4)), this.f51211b);
        }
        return null;
    }

    public int K() {
        int iD = d(6);
        if (iD != 0) {
            return o(iD);
        }
        return 0;
    }

    public o.a L() {
        return M(new o.a());
    }

    public o.a M(o.a aVar) {
        int iD = d(6);
        if (iD != 0) {
            return aVar.f(l(iD), 4, this.f51211b);
        }
        return null;
    }

    public String N() {
        int iD = d(8);
        if (iD != 0) {
            return h(iD + this.f51210a);
        }
        return null;
    }

    public ByteBuffer O() {
        return m(8, 1);
    }

    public ByteBuffer P(ByteBuffer byteBuffer) {
        return n(byteBuffer, 8, 1);
    }

    public int S() {
        int iD = d(4);
        if (iD != 0) {
            return this.f51211b.getInt(iD + this.f51210a);
        }
        return 0;
    }

    public p v(int i10, ByteBuffer byteBuffer) {
        w(i10, byteBuffer);
        return this;
    }

    public void w(int i10, ByteBuffer byteBuffer) {
        g(i10, byteBuffer);
    }
}
