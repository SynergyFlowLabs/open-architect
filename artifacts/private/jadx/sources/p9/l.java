package p9;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends com.google.flatbuffers.d {
    public static int d(com.google.flatbuffers.c cVar, float f10, float f11, float f12, float f13) {
        cVar.Q(4, 16);
        cVar.U(f13);
        cVar.U(f12);
        cVar.U(f11);
        cVar.U(f10);
        return cVar.O();
    }

    public l b(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
        return this;
    }

    public void c(int i10, ByteBuffer byteBuffer) {
        this.f125232a = i10;
        this.f125233b = byteBuffer;
    }

    public float e() {
        return this.f125233b.getFloat(this.f125232a + 12);
    }

    public float f() {
        return this.f125233b.getFloat(this.f125232a);
    }

    public float g() {
        return this.f125233b.getFloat(this.f125232a + 4);
    }

    public float h() {
        return this.f125233b.getFloat(this.f125232a + 8);
    }
}
