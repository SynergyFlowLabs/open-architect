package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.k1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class u0 extends androidx.media3.common.audio.i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f63407i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final double f63408j = 4.656612875245797E-10d;

    u0() {
    }

    private static void m(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i10) * f63408j));
        if (iFloatToIntBits == f63407i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // androidx.media3.common.audio.g
    public void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferL;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f60338b.f60335c;
        if (i11 == 21) {
            byteBufferL = l((i10 / 3) * 4);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferL);
                iPosition += 3;
            }
        } else if (i11 == 22) {
            byteBufferL = l(i10);
            while (iPosition < iLimit) {
                m((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferL);
                iPosition += 4;
            }
        } else if (i11 == 1342177280) {
            byteBufferL = l((i10 / 3) * 4);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferL);
                iPosition += 3;
            }
        } else {
            if (i11 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferL = l(i10);
            while (iPosition < iLimit) {
                m((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferL);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferL.flip();
    }

    @Override // androidx.media3.common.audio.i
    public androidx.media3.common.audio.g.a h(androidx.media3.common.audio.g.a aVar) throws androidx.media3.common.audio.g.b {
        int i10 = aVar.f60335c;
        if (!k1.g1(i10)) {
            throw new androidx.media3.common.audio.g.b(aVar);
        }
        int i11 = 0 | 4;
        return i10 != 4 ? new androidx.media3.common.audio.g.a(aVar.f60333a, aVar.f60334b, 4) : androidx.media3.common.audio.g.a.f60332e;
    }
}
