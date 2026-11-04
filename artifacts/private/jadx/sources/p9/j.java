package p9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends com.google.flatbuffers.e {
    public static void F(com.google.flatbuffers.c cVar) {
        cVar.d0(2);
    }

    public static void t(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(1, i10, 0);
    }

    public static void u(com.google.flatbuffers.c cVar, int i10) {
        cVar.o(0, i10, 0);
    }

    public static int v(com.google.flatbuffers.c cVar, int i10, int i11) {
        cVar.d0(2);
        t(cVar, i11);
        u(cVar, i10);
        return w(cVar);
    }

    public static int w(com.google.flatbuffers.c cVar) {
        return cVar.B();
    }

    public static j x(ByteBuffer byteBuffer) {
        return y(byteBuffer, new j());
    }

    public static j y(ByteBuffer byteBuffer, j jVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return jVar.r(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public ByteBuffer A() {
        return j(6, 1);
    }

    public ByteBuffer B(ByteBuffer byteBuffer) {
        return k(byteBuffer, 6, 1);
    }

    public String C() {
        int iD = d(4);
        if (iD != 0) {
            return g(iD + this.f125235a);
        }
        return null;
    }

    public ByteBuffer D() {
        return j(4, 1);
    }

    public ByteBuffer E(ByteBuffer byteBuffer) {
        return k(byteBuffer, 4, 1);
    }

    public j r(int i10, ByteBuffer byteBuffer) {
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
