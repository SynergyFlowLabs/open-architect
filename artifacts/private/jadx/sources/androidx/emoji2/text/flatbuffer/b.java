package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f51108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ByteBuffer f51111d;

    protected int a(int i10) {
        return this.f51108a + (i10 * this.f51110c);
    }

    protected void b(int i10, int i11, ByteBuffer byteBuffer) {
        this.f51111d = byteBuffer;
        if (byteBuffer != null) {
            this.f51108a = i10;
            this.f51109b = byteBuffer.getInt(i10 - 4);
            this.f51110c = i11;
        } else {
            this.f51108a = 0;
            this.f51109b = 0;
            this.f51110c = 0;
        }
    }

    protected int c() {
        return this.f51108a;
    }

    public int d() {
        return this.f51109b;
    }

    public void e() {
        b(0, 0, null);
    }
}
