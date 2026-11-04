package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f51208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f51209b;

    public void a() {
        b(0, null);
    }

    protected void b(int i10, ByteBuffer byteBuffer) {
        this.f51209b = byteBuffer;
        if (byteBuffer != null) {
            this.f51208a = i10;
        } else {
            this.f51208a = 0;
        }
    }
}
