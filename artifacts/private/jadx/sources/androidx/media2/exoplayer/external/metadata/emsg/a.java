package androidx.media2.exoplayer.external.metadata.emsg;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.metadata.d;
import androidx.media2.exoplayer.external.util.x;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a implements androidx.media2.exoplayer.external.metadata.b {
    @Override // androidx.media2.exoplayer.external.metadata.b
    @p0
    public Metadata a(d inputBuffer) {
        ByteBuffer byteBuffer = (ByteBuffer) androidx.media2.exoplayer.external.util.a.g(inputBuffer.f53789c);
        EventMessage eventMessageB = b(new x(byteBuffer.array(), byteBuffer.limit()));
        if (eventMessageB == null) {
            return null;
        }
        return new Metadata(eventMessageB);
    }

    @p0
    public EventMessage b(x emsgData) {
        try {
            return new EventMessage((String) androidx.media2.exoplayer.external.util.a.g(emsgData.x()), (String) androidx.media2.exoplayer.external.util.a.g(emsgData.x()), emsgData.F(), emsgData.F(), Arrays.copyOfRange(emsgData.f57720a, emsgData.c(), emsgData.d()));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
