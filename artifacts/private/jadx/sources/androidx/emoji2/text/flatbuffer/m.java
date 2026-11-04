package androidx.emoji2.text.flatbuffer;

import com.rabbitmq.client.k0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends b {
    public m f(int i10, ByteBuffer byteBuffer) {
        b(i10, 4, byteBuffer);
        return this;
    }

    public int g(int i10) {
        return this.f51111d.getInt(a(i10));
    }

    public long h(int i10) {
        return ((long) g(i10)) & k0.f265952a;
    }
}
