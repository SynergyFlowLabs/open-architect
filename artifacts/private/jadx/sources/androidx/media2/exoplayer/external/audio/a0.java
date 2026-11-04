package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class a0 extends w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f53250h = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final double f53251i = 4.656612875245797E-10d;

    a0() {
    }

    private static void o(int pcm32BitInt, ByteBuffer buffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) pcm32BitInt) * f53251i));
        if (iFloatToIntBits == f53250h) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        buffer.putInt(iFloatToIntBits);
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public void b(ByteBuffer inputBuffer) {
        boolean z10 = this.f53512d == 1073741824;
        int iPosition = inputBuffer.position();
        int iLimit = inputBuffer.limit();
        int i10 = iLimit - iPosition;
        if (!z10) {
            i10 = (i10 / 3) * 4;
        }
        ByteBuffer byteBufferM = m(i10);
        if (z10) {
            while (iPosition < iLimit) {
                o((inputBuffer.get(iPosition) & 255) | ((inputBuffer.get(iPosition + 1) & 255) << 8) | ((inputBuffer.get(iPosition + 2) & 255) << 16) | ((inputBuffer.get(iPosition + 3) & 255) << 24), byteBufferM);
                iPosition += 4;
            }
        } else {
            while (iPosition < iLimit) {
                o(((inputBuffer.get(iPosition) & 255) << 8) | ((inputBuffer.get(iPosition + 1) & 255) << 16) | ((inputBuffer.get(iPosition + 2) & 255) << 24), byteBufferM);
                iPosition += 3;
            }
        }
        inputBuffer.position(inputBuffer.limit());
        byteBufferM.flip();
    }

    @Override // androidx.media2.exoplayer.external.audio.w, androidx.media2.exoplayer.external.audio.j
    public int g() {
        return 4;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public boolean h(int sampleRateHz, int channelCount, int encoding) throws j.a {
        if (q0.n0(encoding)) {
            return n(sampleRateHz, channelCount, encoding);
        }
        throw new j.a(sampleRateHz, channelCount, encoding);
    }

    @Override // androidx.media2.exoplayer.external.audio.w, androidx.media2.exoplayer.external.audio.j
    public boolean isActive() {
        return q0.n0(this.f53512d);
    }
}
