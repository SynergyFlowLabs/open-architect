package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.k1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class v0 extends androidx.media3.common.audio.i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f63411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f63412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f63413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f63414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f63415m = k1.f61545f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f63416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f63417o;

    @Override // androidx.media3.common.audio.i, androidx.media3.common.audio.g
    public boolean a() {
        return super.a() && this.f63416n == 0;
    }

    @Override // androidx.media3.common.audio.g
    public void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f63414l);
        this.f63417o += (long) (iMin / this.f60338b.f60336d);
        this.f63414l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f63414l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f63416n + i11) - this.f63415m.length;
        ByteBuffer byteBufferL = l(length);
        int iW = k1.w(length, 0, this.f63416n);
        byteBufferL.put(this.f63415m, 0, iW);
        int iW2 = k1.w(length - iW, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iW2);
        byteBufferL.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iW2;
        int i13 = this.f63416n - iW;
        this.f63416n = i13;
        byte[] bArr = this.f63415m;
        System.arraycopy(bArr, iW, bArr, 0, i13);
        byteBuffer.get(this.f63415m, this.f63416n, i12);
        this.f63416n += i12;
        byteBufferL.flip();
    }

    @Override // androidx.media3.common.audio.i, androidx.media3.common.audio.g
    public ByteBuffer d() {
        int i10;
        if (super.a() && (i10 = this.f63416n) > 0) {
            int i11 = 5 & 0;
            l(i10).put(this.f63415m, 0, this.f63416n).flip();
            this.f63416n = 0;
        }
        return super.d();
    }

    @Override // androidx.media3.common.audio.g
    public long f(long j10) {
        return j10 - k1.W1(this.f63412j + this.f63411i, this.f60338b.f60333a);
    }

    @Override // androidx.media3.common.audio.i
    public androidx.media3.common.audio.g.a h(androidx.media3.common.audio.g.a aVar) throws androidx.media3.common.audio.g.b {
        int i10 = aVar.f60335c;
        if (i10 != 2 && i10 != 4) {
            throw new androidx.media3.common.audio.g.b(aVar);
        }
        this.f63413k = true;
        if (this.f63411i == 0 && this.f63412j == 0) {
            return androidx.media3.common.audio.g.a.f60332e;
        }
        return aVar;
    }

    @Override // androidx.media3.common.audio.i
    protected void i() {
        if (this.f63413k) {
            this.f63413k = false;
            int i10 = this.f63412j;
            int i11 = this.f60338b.f60336d;
            this.f63415m = new byte[i10 * i11];
            this.f63414l = this.f63411i * i11;
        }
        this.f63416n = 0;
    }

    @Override // androidx.media3.common.audio.i
    protected void j() {
        if (this.f63413k) {
            int i10 = this.f63416n;
            if (i10 > 0) {
                this.f63417o += (long) (i10 / this.f60338b.f60336d);
            }
            this.f63416n = 0;
        }
    }

    @Override // androidx.media3.common.audio.i
    protected void k() {
        this.f63415m = k1.f61545f;
    }

    public long m() {
        return this.f63417o;
    }

    public void n() {
        this.f63417o = 0L;
    }

    public void o(int i10, int i11) {
        this.f63411i = i10;
        this.f63412j = i11;
    }
}
