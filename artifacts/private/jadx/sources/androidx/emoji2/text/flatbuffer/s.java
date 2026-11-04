package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import kotlin.e2;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends b {
    public s f(int i10, ByteBuffer byteBuffer) {
        b(i10, 2, byteBuffer);
        return this;
    }

    public short g(int i10) {
        return this.f51111d.getShort(a(i10));
    }

    public int h(int i10) {
        return g(i10) & e2.f312492d;
    }
}
