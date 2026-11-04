package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f51106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51107b;

    public a() {
        this(10);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void E(int i10, boolean z10) {
        h(i10, z10 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public byte[] K() {
        return this.f51106a;
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void X(int i10, int i11) {
        g(i10 + 4);
        byte[] bArr = this.f51106a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void a(float f10) {
        d0(this.f51107b, f10);
        this.f51107b += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void b(int i10) {
        X(this.f51107b, i10);
        this.f51107b += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void c(long j10) {
        k0(this.f51107b, j10);
        this.f51107b += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void d(double d10) {
        g0(this.f51107b, d10);
        this.f51107b += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void d0(int i10, float f10) {
        g(i10 + 4);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        byte[] bArr = this.f51106a;
        bArr[i10] = (byte) (iFloatToRawIntBits & 255);
        bArr[i10 + 1] = (byte) ((iFloatToRawIntBits >> 8) & 255);
        bArr[i10 + 2] = (byte) ((iFloatToRawIntBits >> 16) & 255);
        bArr[i10 + 3] = (byte) ((iFloatToRawIntBits >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void e(short s10) {
        m(this.f51107b, s10);
        this.f51107b += 2;
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void f(boolean z10) {
        E(this.f51107b, z10);
        this.f51107b++;
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public boolean g(int i10) {
        byte[] bArr = this.f51106a;
        if (bArr.length > i10) {
            return true;
        }
        int length = bArr.length;
        this.f51106a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void g0(int i10, double d10) {
        g(i10 + 8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        int i11 = (int) jDoubleToRawLongBits;
        byte[] bArr = this.f51106a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
        int i12 = (int) (jDoubleToRawLongBits >> 32);
        bArr[i10 + 4] = (byte) (i12 & 255);
        bArr[i10 + 5] = (byte) ((i12 >> 8) & 255);
        bArr[i10 + 6] = (byte) ((i12 >> 16) & 255);
        bArr[i10 + 7] = (byte) ((i12 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public byte get(int i10) {
        return this.f51106a[i10];
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public double getDouble(int i10) {
        return Double.longBitsToDouble(getLong(i10));
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public float getFloat(int i10) {
        return Float.intBitsToFloat(getInt(i10));
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public int getInt(int i10) {
        byte[] bArr = this.f51106a;
        return (bArr[i10] & 255) | (bArr[i10 + 3] << com.google.common.base.c.B) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public long getLong(int i10) {
        byte[] bArr = this.f51106a;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40);
        return (((long) bArr[i10 + 7]) << 56) | j10 | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public short getShort(int i10) {
        byte[] bArr = this.f51106a;
        return (short) ((bArr[i10] & 255) | (bArr[i10 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void h(int i10, byte b10) {
        g(i10 + 1);
        this.f51106a[i10] = b10;
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public int i() {
        return this.f51107b;
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void j(byte b10) {
        h(this.f51107b, b10);
        this.f51107b++;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public boolean j0(int i10) {
        return this.f51106a[i10] != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void k(int i10, byte[] bArr, int i11, int i12) {
        g((i12 - i11) + i10);
        System.arraycopy(bArr, i11, this.f51106a, i10, i12);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void k0(int i10, long j10) {
        g(i10 + 8);
        int i11 = (int) j10;
        byte[] bArr = this.f51106a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
        int i12 = (int) (j10 >> 32);
        bArr[i10 + 4] = (byte) (i12 & 255);
        bArr[i10 + 5] = (byte) ((i12 >> 8) & 255);
        bArr[i10 + 6] = (byte) ((i12 >> 16) & 255);
        bArr[i10 + 7] = (byte) ((i12 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public String l(int i10, int i11) {
        return a0.g(this.f51106a, i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.r, androidx.emoji2.text.flatbuffer.q
    public int limit() {
        return this.f51107b;
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void m(int i10, short s10) {
        g(i10 + 2);
        byte[] bArr = this.f51106a;
        bArr[i10] = (byte) (s10 & 255);
        bArr[i10 + 1] = (byte) ((s10 >> 8) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void n(byte[] bArr, int i10, int i11) {
        k(this.f51107b, bArr, i10, i11);
        this.f51107b += i11;
    }

    public a(int i10) {
        this(new byte[i10]);
    }

    public a(byte[] bArr) {
        this.f51106a = bArr;
        this.f51107b = 0;
    }

    public a(byte[] bArr, int i10) {
        this.f51106a = bArr;
        this.f51107b = i10;
    }
}
