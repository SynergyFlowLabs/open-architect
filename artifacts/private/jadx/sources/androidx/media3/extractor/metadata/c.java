package androidx.media3.extractor.metadata;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class c implements a {
    @Override // androidx.media3.extractor.metadata.a
    @p0
    public final r0 a(b bVar) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) androidx.media3.common.util.a.g(bVar.f62700d);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
            int i10 = 5 & 1;
        } else {
            z10 = false;
        }
        androidx.media3.common.util.a.a(z10);
        return b(bVar, byteBuffer);
    }

    @p0
    protected abstract r0 b(b bVar, ByteBuffer byteBuffer);
}
