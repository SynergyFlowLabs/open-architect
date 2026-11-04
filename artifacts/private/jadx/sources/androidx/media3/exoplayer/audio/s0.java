package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class s0 extends androidx.media3.common.audio.i {
    public static final long A = 2000000;

    @Deprecated
    public static final long B = 20000;
    private static final int C = 0;
    private static final int D = 1;
    private static final int E = 0;
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 3;
    private static final int I = 1000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f63369w = 0.2f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f63370x = 10;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final short f63371y = 1024;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f63372z = 100000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f63373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final short f63374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f63375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f63376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f63377m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f63378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f63379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f63380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f63381q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f63382r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f63383s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f63384t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f63385u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f63386v;

    public s0() {
        this(f63372z, 0.2f, A, 10, f63371y);
    }

    private void A(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        androidx.media3.common.util.a.a(this.f63385u >= i10);
        if (i11 == 2) {
            int i12 = this.f63384t;
            int i13 = this.f63385u;
            int i14 = i12 + i13;
            byte[] bArr = this.f63383s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, (i12 + i13) - i10, this.f63386v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f63386v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f63386v, 0, i15);
                    System.arraycopy(this.f63383s, 0, this.f63386v, i15, length);
                }
            }
        } else {
            int i16 = this.f63384t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f63383s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f63386v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f63386v, 0, length2);
                System.arraycopy(this.f63383s, 0, this.f63386v, length2, i10 - length2);
            }
        }
        androidx.media3.common.util.a.b(i10 % this.f63378n == 0, "sizeToOutput is not aligned to frame size: " + i10);
        androidx.media3.common.util.a.i(this.f63384t < this.f63383s.length);
        y(this.f63386v, i10, i11);
    }

    private void B(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f63383s.length));
        int iS = s(byteBuffer);
        if (iS == byteBuffer.position()) {
            this.f63380p = 1;
        } else {
            byteBuffer.limit(Math.min(iS, byteBuffer.capacity()));
            x(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private static void C(byte[] bArr, int i10, int i11) {
        if (i11 >= 32767) {
            bArr[i10] = -1;
            bArr[i10 + 1] = 127;
        } else if (i11 <= -32768) {
            bArr[i10] = 0;
            bArr[i10 + 1] = -128;
        } else {
            bArr[i10] = (byte) (i11 & 255);
            bArr[i10 + 1] = (byte) (i11 >> 8);
        }
    }

    private void E(ByteBuffer byteBuffer) {
        int length;
        int i10;
        androidx.media3.common.util.a.i(this.f63384t < this.f63383s.length);
        int iLimit = byteBuffer.limit();
        int iT = t(byteBuffer);
        int iPosition = iT - byteBuffer.position();
        int i11 = this.f63384t;
        int i12 = this.f63385u;
        int i13 = i11 + i12;
        byte[] bArr = this.f63383s;
        if (i13 < bArr.length) {
            length = bArr.length - (i12 + i11);
            i10 = i11 + i12;
        } else {
            int length2 = i12 - (bArr.length - i11);
            length = i11 - length2;
            i10 = length2;
        }
        boolean z10 = iT < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f63383s, i10, iMin);
        int i14 = this.f63385u + iMin;
        this.f63385u = i14;
        androidx.media3.common.util.a.i(i14 <= this.f63383s.length);
        boolean z11 = z10 && iPosition < length;
        z(z11);
        if (z11) {
            this.f63380p = 0;
            this.f63382r = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private static int F(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    private int m(float f10) {
        return n((int) f10);
    }

    private int n(int i10) {
        int i11 = this.f63378n;
        return (i10 / i11) * i11;
    }

    private int o(int i10, int i11) {
        int i12 = this.f63375k;
        return i12 + ((((100 - i12) * (i10 * 1000)) / i11) / 1000);
    }

    private int p(int i10, int i11) {
        return (((this.f63375k - 100) * ((i10 * 1000) / i11)) / 1000) + 100;
    }

    private int q(int i10) {
        int iR = ((r(this.f63377m) - this.f63382r) * this.f63378n) - (this.f63383s.length / 2);
        androidx.media3.common.util.a.i(iR >= 0);
        return m(Math.min((i10 * this.f63373i) + 0.5f, iR));
    }

    private int r(long j10) {
        return (int) ((j10 * ((long) this.f60338b.f60333a)) / 1000000);
    }

    private int s(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (v(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i10 = this.f63378n;
                return ((iLimit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    private int t(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (v(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i10 = this.f63378n;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    private boolean v(byte b10, byte b11) {
        return Math.abs(F(b10, b11)) > this.f63374j;
    }

    private void w(byte[] bArr, int i10, int i11) {
        if (i11 == 3) {
            return;
        }
        for (int i12 = 0; i12 < i10; i12 += 2) {
            C(bArr, i12, (F(bArr[i12 + 1], bArr[i12]) * (i11 == 0 ? p(i12, i10 - 1) : i11 == 2 ? o(i12, i10 - 1) : this.f63375k)) / 100);
        }
    }

    private void x(ByteBuffer byteBuffer) {
        l(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void y(byte[] bArr, int i10, int i11) {
        androidx.media3.common.util.a.b(i10 % this.f63378n == 0, "byteOutput size is not aligned to frame size " + i10);
        w(bArr, i10, i11);
        l(i10).put(bArr, 0, i10).flip();
    }

    private void z(boolean z10) {
        int length;
        int iQ;
        int i10 = this.f63385u;
        byte[] bArr = this.f63383s;
        if (i10 == bArr.length || z10) {
            if (this.f63382r == 0) {
                if (z10) {
                    A(i10, 3);
                    length = i10;
                } else {
                    androidx.media3.common.util.a.i(i10 >= bArr.length / 2);
                    length = this.f63383s.length / 2;
                    A(length, 0);
                }
                iQ = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iQ2 = q(length2) + (this.f63383s.length / 2);
                A(iQ2, 2);
                iQ = iQ2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iQ = q(length);
                A(iQ, 1);
            }
            androidx.media3.common.util.a.j(length % this.f63378n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            androidx.media3.common.util.a.i(i10 >= iQ);
            this.f63385u -= length;
            int i11 = this.f63384t + length;
            this.f63384t = i11;
            this.f63384t = i11 % this.f63383s.length;
            int i12 = this.f63382r;
            int i13 = this.f63378n;
            this.f63382r = i12 + (iQ / i13);
            this.f63381q += (long) ((length - iQ) / i13);
        }
    }

    public void D(boolean z10) {
        this.f63379o = z10;
    }

    @Override // androidx.media3.common.audio.g
    public void b(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i10 = this.f63380p;
            if (i10 == 0) {
                B(byteBuffer);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                E(byteBuffer);
            }
        }
    }

    @Override // androidx.media3.common.audio.i
    protected androidx.media3.common.audio.g.a h(androidx.media3.common.audio.g.a aVar) throws androidx.media3.common.audio.g.b {
        if (aVar.f60335c != 2) {
            throw new androidx.media3.common.audio.g.b(aVar);
        }
        int i10 = 6 | (-1);
        return aVar.f60333a == -1 ? androidx.media3.common.audio.g.a.f60332e : aVar;
    }

    @Override // androidx.media3.common.audio.i
    public void i() {
        if (isActive()) {
            this.f63378n = this.f60338b.f60334b * 2;
            int iN = n(r(this.f63376l) / 2) * 2;
            if (this.f63383s.length != iN) {
                this.f63383s = new byte[iN];
                this.f63386v = new byte[iN];
            }
        }
        this.f63380p = 0;
        this.f63381q = 0L;
        this.f63382r = 0;
        this.f63384t = 0;
        this.f63385u = 0;
    }

    @Override // androidx.media3.common.audio.i, androidx.media3.common.audio.g
    public boolean isActive() {
        return super.isActive() && this.f63379o;
    }

    @Override // androidx.media3.common.audio.i
    public void j() {
        if (this.f63385u > 0) {
            z(true);
            this.f63382r = 0;
        }
    }

    @Override // androidx.media3.common.audio.i
    public void k() {
        this.f63379o = false;
        byte[] bArr = k1.f61545f;
        this.f63383s = bArr;
        this.f63386v = bArr;
    }

    public long u() {
        return this.f63381q;
    }

    @Deprecated
    public s0(long j10, long j11, short s10) {
        this(j10, j11 / j10, j10, 0, s10);
    }

    public s0(long j10, float f10, long j11, int i10, short s10) {
        boolean z10 = false;
        this.f63382r = 0;
        this.f63384t = 0;
        this.f63385u = 0;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        androidx.media3.common.util.a.a(z10);
        this.f63376l = j10;
        this.f63373i = f10;
        this.f63377m = j11;
        this.f63375k = i10;
        this.f63374j = s10;
        byte[] bArr = k1.f61545f;
        this.f63383s = bArr;
        this.f63386v = bArr;
    }
}
