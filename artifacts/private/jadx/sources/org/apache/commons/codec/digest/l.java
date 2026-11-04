package org.apache.commons.codec.digest;

import com.rabbitmq.client.k0;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes9.dex */
public class l implements Checksum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f335285g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f335286h = 13;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f335287i = -1640531535;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f335288j = -2048144777;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f335289k = -1028477379;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f335290l = 668265263;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f335291m = 374761393;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f335292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f335293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f335294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f335295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f335296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f335297f;

    public l() {
        this(0);
    }

    private static long a(byte[] bArr, int i10, int i11) {
        if (i11 > 8) {
            throw new IllegalArgumentException("can't read more than eight bytes into a long value");
        }
        long j10 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j10 |= (((long) bArr[i10 + i12]) & 255) << (i12 * 8);
        }
        return j10;
    }

    private static int b(byte[] bArr, int i10) {
        return (int) (a(bArr, i10, 4) & k0.f265952a);
    }

    private void c() {
        int[] iArr = this.f335293b;
        int i10 = this.f335295d;
        iArr[0] = 606290984 + i10;
        iArr[1] = f335288j + i10;
        iArr[2] = i10;
        iArr[3] = i10 - f335287i;
    }

    private void d(byte[] bArr, int i10) {
        int[] iArr = this.f335293b;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int iRotateLeft = Integer.rotateLeft(i11 + (b(bArr, i10) * f335288j), 13) * f335287i;
        int iRotateLeft2 = Integer.rotateLeft(i12 + (b(bArr, i10 + 4) * f335288j), 13) * f335287i;
        int iRotateLeft3 = Integer.rotateLeft(i13 + (b(bArr, i10 + 8) * f335288j), 13) * f335287i;
        int iRotateLeft4 = Integer.rotateLeft(i14 + (b(bArr, i10 + 12) * f335288j), 13) * f335287i;
        int[] iArr2 = this.f335293b;
        iArr2[0] = iRotateLeft;
        iArr2[1] = iRotateLeft2;
        iArr2[2] = iRotateLeft3;
        iArr2[3] = iRotateLeft4;
        this.f335297f = 0;
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        int i10 = 0;
        int iRotateLeft = (this.f335296e > 16 ? Integer.rotateLeft(this.f335293b[0], 1) + Integer.rotateLeft(this.f335293b[1], 7) + Integer.rotateLeft(this.f335293b[2], 12) + Integer.rotateLeft(this.f335293b[3], 18) : this.f335293b[2] + f335291m) + this.f335296e;
        int i11 = this.f335297f - 4;
        while (i10 <= i11) {
            iRotateLeft = Integer.rotateLeft(iRotateLeft + (b(this.f335294c, i10) * f335289k), 17) * f335290l;
            i10 += 4;
        }
        while (i10 < this.f335297f) {
            iRotateLeft = Integer.rotateLeft(iRotateLeft + ((this.f335294c[i10] & 255) * f335291m), 11) * f335287i;
            i10++;
        }
        int i12 = ((iRotateLeft >>> 15) ^ iRotateLeft) * f335288j;
        int i13 = (i12 ^ (i12 >>> 13)) * f335289k;
        return ((long) (i13 ^ (i13 >>> 16))) & k0.f265952a;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        c();
        this.f335296e = 0;
        this.f335297f = 0;
    }

    @Override // java.util.zip.Checksum
    public void update(int i10) {
        byte[] bArr = this.f335292a;
        bArr[0] = (byte) (i10 & 255);
        update(bArr, 0, 1);
    }

    public l(int i10) {
        this.f335292a = new byte[1];
        this.f335293b = new int[4];
        this.f335294c = new byte[16];
        this.f335295d = i10;
        c();
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 <= 0) {
            return;
        }
        this.f335296e += i11;
        int i12 = i10 + i11;
        int i13 = this.f335297f;
        if (i13 + i11 < 16) {
            System.arraycopy(bArr, i10, this.f335294c, i13, i11);
            this.f335297f += i11;
            return;
        }
        if (i13 > 0) {
            int i14 = 16 - i13;
            System.arraycopy(bArr, i10, this.f335294c, i13, i14);
            d(this.f335294c, 0);
            i10 += i14;
        }
        int i15 = i12 - 16;
        while (i10 <= i15) {
            d(bArr, i10);
            i10 += 16;
        }
        if (i10 < i12) {
            int i16 = i12 - i10;
            this.f335297f = i16;
            System.arraycopy(bArr, i10, this.f335294c, 0, i16);
        }
    }
}
