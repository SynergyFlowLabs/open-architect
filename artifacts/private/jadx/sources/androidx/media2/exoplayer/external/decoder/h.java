package androidx.media2.exoplayer.external.decoder;

import androidx.annotation.b1;
import androidx.annotation.p0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class h extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g<?, h, ?> f53809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public ByteBuffer f53810e;

    public h(g<?, h, ?> owner) {
        this.f53809d = owner;
    }

    @Override // androidx.media2.exoplayer.external.decoder.a
    public void o() {
        super.o();
        ByteBuffer byteBuffer = this.f53810e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // androidx.media2.exoplayer.external.decoder.f
    public void x() {
        this.f53809d.r(this);
    }

    public ByteBuffer z(long timeUs, int size) {
        this.f53793b = timeUs;
        ByteBuffer byteBuffer = this.f53810e;
        if (byteBuffer == null || byteBuffer.capacity() < size) {
            this.f53810e = ByteBuffer.allocateDirect(size).order(ByteOrder.nativeOrder());
        }
        this.f53810e.position(0);
        this.f53810e.limit(size);
        return this.f53810e;
    }
}
