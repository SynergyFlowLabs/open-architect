package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class AFk1oSDK extends FilterInputStream {
    private int AFInAppEventType;
    private int AFLogger;
    private final byte[][] areAllFieldsValid;
    private final byte[] component1;
    private final int[] component2;
    private final int component3;
    private final int[] component4;
    private int copy;
    private final int copydefault;
    private final byte[] equals;
    private final int hashCode;
    private int toString;
    private static final byte[] getMonetizationNetwork = AFk1uSDK.getMonetizationNetwork;
    private static final int[] getRevenue = AFk1uSDK.getMediationNetwork;
    private static final int[] getMediationNetwork = AFk1uSDK.AFAdRevenueData;
    private static final int[] getCurrencyIso4217Code = AFk1uSDK.getCurrencyIso4217Code;
    private static final int[] AFAdRevenueData = AFk1uSDK.getRevenue;

    public AFk1oSDK(InputStream inputStream, int i10, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i10, bArr, bArr2, (byte) 0);
    }

    private void AFAdRevenueData(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.component4;
        char c10 = 1;
        char c11 = 2;
        char c12 = '\b';
        char c13 = 3;
        int i10 = (bArr[0] << com.google.common.base.c.B) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.component2;
        iArr[0] = i10 ^ iArr2[0];
        char c14 = 5;
        char c15 = 6;
        iArr[1] = ((((bArr[4] << com.google.common.base.c.B) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << com.google.common.base.c.B) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c16 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << com.google.common.base.c.B)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i11 = 1;
        int i12 = 4;
        while (i11 < this.component3) {
            int[] iArr3 = getRevenue;
            int[] iArr4 = this.component4;
            char c17 = c10;
            byte[][] bArr3 = this.areAllFieldsValid;
            byte[] bArr4 = bArr3[0];
            int i13 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = getMediationNetwork;
            byte[] bArr5 = bArr3[c17];
            char c18 = c11;
            int i14 = i13 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = getCurrencyIso4217Code;
            byte[] bArr6 = bArr3[c18];
            char c19 = c13;
            int i15 = i14 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = AFAdRevenueData;
            byte[] bArr7 = bArr3[c19];
            char c20 = c12;
            int i16 = i15 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.component2;
            int i17 = i16 ^ iArr8[i12];
            char c21 = c16;
            char c22 = c14;
            int i18 = (((iArr3[iArr4[bArr4[c17]] >>> 24] ^ iArr5[(iArr4[bArr5[c17]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c17]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c17]] & 255]) ^ iArr8[i12 + 1];
            int i19 = (((iArr3[iArr4[bArr4[c18]] >>> 24] ^ iArr5[(iArr4[bArr5[c18]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c18]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c18]] & 255]) ^ iArr8[i12 + 2];
            int i20 = (((iArr3[iArr4[bArr4[c19]] >>> 24] ^ iArr5[(iArr4[bArr5[c19]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c19]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c19]] & 255]) ^ iArr8[i12 + 3];
            iArr4[0] = i17;
            iArr4[c17] = i18;
            iArr4[c18] = i19;
            iArr4[c19] = i20;
            i11++;
            i12 += 4;
            c10 = c17;
            c11 = c18;
            c13 = c19;
            c12 = c20;
            c14 = c22;
            c16 = c21;
            c15 = c15;
        }
        char c23 = c10;
        char c24 = c11;
        char c25 = c13;
        char c26 = c12;
        int[] iArr9 = this.component2;
        int i21 = iArr9[i12];
        byte[] bArr8 = getMonetizationNetwork;
        int[] iArr10 = this.component4;
        byte[][] bArr9 = this.areAllFieldsValid;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i21 >>> 24));
        byte[] bArr11 = bArr9[c23];
        bArr2[c23] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i21 >>> 16));
        byte[] bArr12 = bArr9[c24];
        bArr2[c24] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i21 >>> 8));
        byte[] bArr13 = bArr9[c25];
        bArr2[c25] = (byte) (i21 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i22 = iArr9[i12 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[c23]] >>> 24] ^ (i22 >>> 24));
        bArr2[c14] = (byte) (bArr8[(iArr10[bArr11[c23]] >>> 16) & 255] ^ (i22 >>> 16));
        bArr2[c15] = (byte) (bArr8[(iArr10[bArr12[c23]] >>> 8) & 255] ^ (i22 >>> 8));
        bArr2[7] = (byte) (i22 ^ bArr8[iArr10[bArr13[c23]] & 255]);
        int i23 = iArr9[i12 + 2];
        bArr2[c26] = (byte) (bArr8[iArr10[bArr10[c24]] >>> 24] ^ (i23 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c24]] >>> 16) & 255] ^ (i23 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c24]] >>> 8) & 255] ^ (i23 >>> 8));
        bArr2[11] = (byte) (i23 ^ bArr8[iArr10[bArr13[c24]] & 255]);
        int i24 = iArr9[i12 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c25]] >>> 24] ^ (i24 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c25]] >>> 16) & 255] ^ (i24 >>> 16));
        bArr2[c16] = (byte) (bArr8[(iArr10[bArr12[c25]] >>> 8) & 255] ^ (i24 >>> 8));
        bArr2[15] = (byte) (bArr8[iArr10[bArr13[c25]] & 255] ^ i24);
    }

    private int getMediationNetwork() throws IOException {
        if (this.toString == Integer.MAX_VALUE) {
            this.toString = ((FilterInputStream) this).in.read();
        }
        if (this.AFInAppEventType == 16) {
            byte[] bArr = this.component1;
            int i10 = this.toString;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.component1, i11, 16 - i11);
                if (i12 <= 0) {
                    break;
                }
                i11 += i12;
            } while (i11 < 16);
            if (i11 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.copydefault;
            if (i13 == this.hashCode) {
                AFAdRevenueData(this.component1, this.equals);
            } else {
                if (this.copy <= i13) {
                    AFAdRevenueData(this.component1, this.equals);
                } else {
                    byte[] bArr2 = this.component1;
                    System.arraycopy(bArr2, 0, this.equals, 0, bArr2.length);
                }
                int i14 = this.copy;
                if (i14 < this.hashCode) {
                    this.copy = i14 + 1;
                } else {
                    this.copy = 1;
                }
            }
            int i15 = ((FilterInputStream) this).in.read();
            this.toString = i15;
            this.AFInAppEventType = 0;
            this.AFLogger = i15 < 0 ? 16 - (this.equals[15] & 255) : 16;
        }
        return this.AFLogger;
    }

    private static byte[][] getRevenue(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = new byte[bArr[i10].length];
            int i11 = 0;
            while (true) {
                byte[] bArr3 = bArr[i10];
                if (i11 < bArr3.length) {
                    bArr2[i10][bArr3[i11]] = (byte) i11;
                    i11++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getMediationNetwork();
        return this.AFLogger - this.AFInAppEventType;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMediationNetwork();
        int i10 = this.AFInAppEventType;
        if (i10 >= this.AFLogger) {
            return -1;
        }
        byte[] bArr = this.equals;
        this.AFInAppEventType = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    private AFk1oSDK(InputStream inputStream, int i10, byte[] bArr, byte[][] bArr2, byte b10) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component4 = new int[4];
        this.component1 = new byte[16];
        this.equals = new byte[16];
        this.copy = 1;
        this.toString = Integer.MAX_VALUE;
        this.AFInAppEventType = 16;
        this.AFLogger = 16;
        this.component3 = i10;
        this.component2 = AFk1uSDK.getCurrencyIso4217Code(bArr, i10);
        this.areAllFieldsValid = getRevenue(bArr2);
        this.copydefault = 100;
        this.hashCode = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            getMediationNetwork();
            int i14 = this.AFInAppEventType;
            if (i14 >= this.AFLogger) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.equals;
            this.AFInAppEventType = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
