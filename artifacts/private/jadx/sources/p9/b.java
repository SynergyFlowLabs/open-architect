package p9;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends com.google.flatbuffers.d {
    public static int e(com.google.flatbuffers.c cVar, byte b10, byte b11, byte b12) {
        cVar.Q(1, 3);
        cVar.S(b12);
        cVar.S(b11);
        cVar.S(b10);
        return cVar.O();
    }

    public b b(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
        return this;
    }

    public void c(int i10, ByteBuffer byteBuffer) {
        this.f125232a = i10;
        this.f125233b = byteBuffer;
    }

    public byte d() {
        return this.f125233b.get(this.f125232a + 2);
    }

    public byte f() {
        return this.f125233b.get(this.f125232a + 1);
    }

    public byte g() {
        return this.f125233b.get(this.f125232a);
    }
}
