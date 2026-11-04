package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.k1;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class b0 extends androidx.media3.common.audio.i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private int[] f63150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private int[] f63151j;

    b0() {
    }

    @Override // androidx.media3.common.audio.g
    public void b(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) androidx.media3.common.util.a.g(this.f63151j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.f60338b.f60336d) * this.f60339c.f60336d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                int iF0 = (k1.f0(this.f60338b.f60335c) * i10) + iPosition;
                int i11 = this.f60338b.f60335c;
                if (i11 == 2) {
                    byteBufferL.putShort(byteBuffer.getShort(iF0));
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("Unexpected encoding: " + this.f60338b.f60335c);
                    }
                    byteBufferL.putFloat(byteBuffer.getFloat(iF0));
                }
            }
            iPosition += this.f60338b.f60336d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // androidx.media3.common.audio.i
    public androidx.media3.common.audio.g.a h(androidx.media3.common.audio.g.a aVar) throws androidx.media3.common.audio.g.b {
        int[] iArr = this.f63150i;
        if (iArr == null) {
            return androidx.media3.common.audio.g.a.f60332e;
        }
        int i10 = aVar.f60335c;
        if (i10 != 2 && i10 != 4) {
            throw new androidx.media3.common.audio.g.b(aVar);
        }
        boolean z10 = aVar.f60334b != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= aVar.f60334b) {
                throw new androidx.media3.common.audio.g.b("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z10 |= i12 != i11;
            i11++;
        }
        return z10 ? new androidx.media3.common.audio.g.a(aVar.f60333a, iArr.length, aVar.f60335c) : androidx.media3.common.audio.g.a.f60332e;
    }

    @Override // androidx.media3.common.audio.i
    protected void i() {
        this.f63151j = this.f63150i;
    }

    @Override // androidx.media3.common.audio.i
    protected void k() {
        this.f63151j = null;
        this.f63150i = null;
    }

    public void m(@androidx.annotation.p0 int[] iArr) {
        this.f63150i = iArr;
    }
}
