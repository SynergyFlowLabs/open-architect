package androidx.media3.decoder;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class k extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h.a<k> f62726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public ByteBuffer f62727f;

    public k(h.a<k> aVar) {
        this.f62726e = aVar;
    }

    @Override // androidx.media3.decoder.h
    public void D() {
        this.f62726e.a(this);
    }

    public ByteBuffer E(int i10) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) androidx.media3.common.util.a.g(this.f62727f);
        if (i10 >= byteBuffer.limit()) {
            z10 = true;
            int i11 = 1 << 1;
        } else {
            z10 = false;
        }
        androidx.media3.common.util.a.a(z10);
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iPosition);
        byteBufferOrder.limit(i10);
        this.f62727f = byteBufferOrder;
        return byteBufferOrder;
    }

    public ByteBuffer H(long j10, int i10) {
        this.f62708b = j10;
        ByteBuffer byteBuffer = this.f62727f;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f62727f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        }
        this.f62727f.position(0);
        this.f62727f.limit(i10);
        return this.f62727f;
    }

    @Override // androidx.media3.decoder.h, androidx.media3.decoder.a
    public void o() {
        super.o();
        ByteBuffer byteBuffer = this.f62727f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }
}
