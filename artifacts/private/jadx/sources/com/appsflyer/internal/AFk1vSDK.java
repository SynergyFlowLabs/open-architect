package com.appsflyer.internal;

import androidx.core.view.s0;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class AFk1vSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private int areAllFieldsValid;
    private byte[] component1;
    private int[] component2;
    private byte[] component3;
    private byte[] component4;
    private int copydefault;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private AFk1sSDK getMonetizationNetwork;
    private int getRevenue;
    private int hashCode;
    private int toString;

    public AFk1vSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i10, boolean z10, int i11) throws IOException {
        this(inputStream, iArr, bArr, i10, false, i11, (byte) 0);
    }

    private int AFAdRevenueData() throws IOException {
        if (this.hashCode == Integer.MAX_VALUE) {
            this.hashCode = ((FilterInputStream) this).in.read();
        }
        if (this.areAllFieldsValid == 8) {
            byte[] bArr = this.component4;
            int i10 = this.hashCode;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.component4, i11, 8 - i11);
                if (i12 <= 0) {
                    break;
                }
                i11 += i12;
            } while (i11 < 8);
            if (i11 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.getMediationNetwork;
            if (i13 == this.AFAdRevenueData) {
                getCurrencyIso4217Code();
            } else {
                if (this.getRevenue <= i13) {
                    getCurrencyIso4217Code();
                }
                int i14 = this.getRevenue;
                if (i14 < this.AFAdRevenueData) {
                    this.getRevenue = i14 + 1;
                } else {
                    this.getRevenue = 1;
                }
            }
            int i15 = ((FilterInputStream) this).in.read();
            this.hashCode = i15;
            this.areAllFieldsValid = 0;
            this.toString = i15 < 0 ? 8 - (this.component4[7] & 255) : 8;
        }
        return this.toString;
    }

    private void getCurrencyIso4217Code() {
        if (this.copydefault == 2) {
            byte[] bArr = this.component4;
            System.arraycopy(bArr, 0, this.component3, 0, bArr.length);
        }
        byte[] bArr2 = this.component4;
        int i10 = ((bArr2[0] << com.google.common.base.c.B) & (-16777216)) + ((bArr2[1] << com.google.common.base.c.f116465r) & 16711680) + ((bArr2[2] << 8) & s0.f48920f) + (bArr2[3] & 255);
        int i11 = ((-16777216) & (bArr2[4] << com.google.common.base.c.B)) + (16711680 & (bArr2[5] << com.google.common.base.c.f116465r)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i12 = this.getCurrencyIso4217Code;
        AFk1sSDK aFk1sSDK = this.getMonetizationNetwork;
        AFk1tSDK.AFAdRevenueData(i10, i11, false, i12, aFk1sSDK.getCurrencyIso4217Code, aFk1sSDK.getRevenue, this.component2);
        int[] iArr = this.component2;
        int i13 = iArr[0];
        int i14 = iArr[1];
        byte[] bArr3 = this.component4;
        bArr3[0] = (byte) (i13 >> 24);
        bArr3[1] = (byte) (i13 >> 16);
        bArr3[2] = (byte) (i13 >> 8);
        bArr3[3] = (byte) i13;
        bArr3[4] = (byte) (i14 >> 24);
        bArr3[5] = (byte) (i14 >> 16);
        bArr3[6] = (byte) (i14 >> 8);
        bArr3[7] = (byte) i14;
        if (this.copydefault == 2) {
            for (int i15 = 0; i15 < 8; i15++) {
                byte[] bArr4 = this.component4;
                bArr4[i15] = (byte) (bArr4[i15] ^ this.component1[i15]);
            }
            byte[] bArr5 = this.component3;
            System.arraycopy(bArr5, 0, this.component1, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFAdRevenueData();
        return this.toString - this.areAllFieldsValid;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFAdRevenueData();
        int i10 = this.areAllFieldsValid;
        if (i10 >= this.toString) {
            return -1;
        }
        byte[] bArr = this.component4;
        this.areAllFieldsValid = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    private AFk1vSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i10, boolean z10, int i11, byte b10) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getRevenue = 1;
        this.hashCode = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i10, 3), 16);
        this.getCurrencyIso4217Code = iMin;
        this.component4 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.component1 = bArr2;
        this.component3 = new byte[8];
        int i12 = 3 << 2;
        this.component2 = new int[2];
        this.areAllFieldsValid = 8;
        this.toString = 8;
        this.copydefault = i11;
        if (i11 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getMonetizationNetwork = new AFk1sSDK(iArr, iMin, true, false);
        this.getMediationNetwork = 100;
        this.AFAdRevenueData = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            AFAdRevenueData();
            int i14 = this.areAllFieldsValid;
            if (i14 >= this.toString) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.component4;
            this.areAllFieldsValid = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
