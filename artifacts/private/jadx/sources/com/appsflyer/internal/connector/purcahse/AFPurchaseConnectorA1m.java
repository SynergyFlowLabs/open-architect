package com.appsflyer.internal.connector.purcahse;

import androidx.collection.g3;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class AFPurchaseConnectorA1m extends FilterInputStream {
    private long[] InAppPurchaseEvent;
    private int PurchaseClient;
    private int equals;
    private long[] getOneTimePurchaseOfferDetails;
    private short getPackageName;
    private byte[] getQuantity;
    private int stopObservingTransactions;
    private final int toJsonMap;

    public AFPurchaseConnectorA1m(InputStream inputStream, int i10, int i11, short s10, int i12, int i13) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.PurchaseClient = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max((int) s10, 4), 8);
        this.toJsonMap = iMin;
        this.getQuantity = new byte[iMin];
        this.getOneTimePurchaseOfferDetails = new long[4];
        this.InAppPurchaseEvent = new long[4];
        this.equals = iMin;
        this.stopObservingTransactions = iMin;
        this.getOneTimePurchaseOfferDetails = AFPurchaseConnectorA1p.getPackageName(i10 ^ i13, iMin ^ i13);
        this.InAppPurchaseEvent = AFPurchaseConnectorA1p.getPackageName(i11 ^ i13, i12 ^ i13);
    }

    private void InAppPurchaseEvent() {
        long[] jArr = this.getOneTimePurchaseOfferDetails;
        long[] jArr2 = this.InAppPurchaseEvent;
        short s10 = this.getPackageName;
        long j10 = jArr[s10 % 4] * 2147483085;
        long j11 = jArr2[(s10 + 2) % 4];
        long j12 = (j10 + j11) % g3.f12256c;
        int i10 = (s10 + 3) % 4;
        jArr2[i10] = ((jArr[i10] * 2147483085) + j11) / g3.f12256c;
        jArr[i10] = j12;
        for (int i11 = 0; i11 < this.toJsonMap; i11++) {
            byte[] bArr = this.getQuantity;
            bArr[i11] = (byte) (((long) bArr[i11]) ^ ((this.getOneTimePurchaseOfferDetails[this.getPackageName] >> (i11 << 3)) & 255));
        }
        this.getPackageName = (short) ((this.getPackageName + 1) % 4);
    }

    private int getPackageName() throws IOException {
        int i10;
        if (this.PurchaseClient == Integer.MAX_VALUE) {
            this.PurchaseClient = ((FilterInputStream) this).in.read();
        }
        if (this.equals == this.toJsonMap) {
            byte[] bArr = this.getQuantity;
            int i11 = this.PurchaseClient;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.getQuantity, i12, this.toJsonMap - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < this.toJsonMap);
            if (i12 < this.toJsonMap) {
                throw new IllegalStateException("unexpected block size");
            }
            InAppPurchaseEvent();
            int i14 = ((FilterInputStream) this).in.read();
            this.PurchaseClient = i14;
            this.equals = 0;
            if (i14 < 0) {
                int i15 = this.toJsonMap;
                i10 = i15 - (this.getQuantity[i15 - 1] & 255);
            } else {
                i10 = this.toJsonMap;
            }
            this.stopObservingTransactions = i10;
        }
        return this.stopObservingTransactions;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getPackageName();
        return this.stopObservingTransactions - this.equals;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getPackageName();
        int i10 = this.equals;
        if (i10 >= this.stopObservingTransactions) {
            return -1;
        }
        byte[] bArr = this.getQuantity;
        this.equals = i10 + 1;
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            getPackageName();
            int i14 = this.equals;
            if (i14 >= this.stopObservingTransactions) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.getQuantity;
            this.equals = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
