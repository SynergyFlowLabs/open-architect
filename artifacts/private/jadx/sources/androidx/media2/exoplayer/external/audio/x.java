package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import androidx.annotation.p0;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class x extends w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private int[] f53516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private int[] f53518j;

    x() {
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public void b(ByteBuffer inputBuffer) {
        int[] iArr = (int[]) androidx.media2.exoplayer.external.util.a.g(this.f53518j);
        int iPosition = inputBuffer.position();
        int iLimit = inputBuffer.limit();
        ByteBuffer byteBufferM = m(((iLimit - iPosition) / (this.f53511c * 2)) * iArr.length * 2);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferM.putShort(inputBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f53511c * 2;
        }
        inputBuffer.position(iLimit);
        byteBufferM.flip();
    }

    @Override // androidx.media2.exoplayer.external.audio.w, androidx.media2.exoplayer.external.audio.j
    public int e() {
        int[] iArr = this.f53518j;
        return iArr == null ? this.f53511c : iArr.length;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public boolean h(int sampleRateHz, int channelCount, int encoding) throws j.a {
        boolean zEquals = Arrays.equals(this.f53516h, this.f53518j);
        boolean z10 = !zEquals;
        int[] iArr = this.f53516h;
        this.f53518j = iArr;
        if (iArr == null) {
            this.f53517i = false;
            return z10;
        }
        if (encoding != 2) {
            throw new j.a(sampleRateHz, channelCount, encoding);
        }
        if (zEquals && !n(sampleRateHz, channelCount, encoding)) {
            return false;
        }
        this.f53517i = channelCount != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= channelCount) {
                throw new j.a(sampleRateHz, channelCount, encoding);
            }
            this.f53517i = (i11 != i10) | this.f53517i;
            i10++;
        }
        return true;
    }

    @Override // androidx.media2.exoplayer.external.audio.w, androidx.media2.exoplayer.external.audio.j
    public boolean isActive() {
        return this.f53517i;
    }

    @Override // androidx.media2.exoplayer.external.audio.w
    protected void l() {
        this.f53518j = null;
        this.f53516h = null;
        this.f53517i = false;
    }

    public void o(@p0 int[] outputChannels) {
        this.f53516h = outputChannels;
    }
}
