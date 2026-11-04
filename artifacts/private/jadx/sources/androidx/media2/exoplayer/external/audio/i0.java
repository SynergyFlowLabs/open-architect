package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class i0 extends w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f53420q = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f53421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f53422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f53423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f53424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f53425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f53427n = q0.f57631f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f53428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f53429p;

    @Override // androidx.media2.exoplayer.external.audio.w, androidx.media2.exoplayer.external.audio.j
    public boolean a() {
        return super.a() && this.f53428o == 0;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public void b(ByteBuffer inputBuffer) {
        int iPosition = inputBuffer.position();
        int iLimit = inputBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 != 0) {
            this.f53425l = true;
            int iMin = Math.min(i10, this.f53426m);
            this.f53429p += (long) (iMin / this.f53424k);
            this.f53426m -= iMin;
            inputBuffer.position(iPosition + iMin);
            if (this.f53426m <= 0) {
                int i11 = i10 - iMin;
                int length = (this.f53428o + i11) - this.f53427n.length;
                ByteBuffer byteBufferM = m(length);
                int iR = q0.r(length, 0, this.f53428o);
                byteBufferM.put(this.f53427n, 0, iR);
                int iR2 = q0.r(length - iR, 0, i11);
                inputBuffer.limit(inputBuffer.position() + iR2);
                byteBufferM.put(inputBuffer);
                inputBuffer.limit(iLimit);
                int i12 = i11 - iR2;
                int i13 = this.f53428o - iR;
                this.f53428o = i13;
                byte[] bArr = this.f53427n;
                System.arraycopy(bArr, iR, bArr, 0, i13);
                inputBuffer.get(this.f53427n, this.f53428o, i12);
                this.f53428o += i12;
                byteBufferM.flip();
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.w, androidx.media2.exoplayer.external.audio.j
    public ByteBuffer d() {
        int i10;
        if (super.a() && (i10 = this.f53428o) > 0) {
            m(i10).put(this.f53427n, 0, this.f53428o).flip();
            this.f53428o = 0;
        }
        return super.d();
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public boolean h(int sampleRateHz, int channelCount, int encoding) throws j.a {
        if (encoding != 2) {
            throw new j.a(sampleRateHz, channelCount, encoding);
        }
        int i10 = this.f53428o;
        if (i10 > 0) {
            this.f53429p += (long) (i10 / this.f53424k);
        }
        int iV = q0.V(2, channelCount);
        this.f53424k = iV;
        int i11 = this.f53423j;
        this.f53427n = new byte[i11 * iV];
        this.f53428o = 0;
        int i12 = this.f53422i;
        this.f53426m = iV * i12;
        boolean z10 = this.f53421h;
        this.f53421h = (i12 == 0 && i11 == 0) ? false : true;
        this.f53425l = false;
        n(sampleRateHz, channelCount, encoding);
        return z10 != this.f53421h;
    }

    @Override // androidx.media2.exoplayer.external.audio.w, androidx.media2.exoplayer.external.audio.j
    public boolean isActive() {
        return this.f53421h;
    }

    @Override // androidx.media2.exoplayer.external.audio.w
    protected void j() {
        if (this.f53425l) {
            this.f53426m = 0;
        }
        this.f53428o = 0;
    }

    @Override // androidx.media2.exoplayer.external.audio.w
    protected void l() {
        this.f53427n = q0.f57631f;
    }

    public long o() {
        return this.f53429p;
    }

    public void p() {
        this.f53429p = 0L;
    }

    public void q(int trimStartFrames, int trimEndFrames) {
        this.f53422i = trimStartFrames;
        this.f53423j = trimEndFrames;
    }
}
