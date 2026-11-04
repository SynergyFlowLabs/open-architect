package com.appsflyer.internal.connector.purcahse;

/* JADX INFO: loaded from: classes3.dex */
public final class AFPurchaseConnectorA1s {
    public static void getOneTimePurchaseOfferDetails(int i10, int i11, boolean z10, int i12, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z10) {
            getPackageName(iArr);
        }
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i10 ^ iArr[i13];
            int i15 = i11 ^ ((iArr2[2][(i14 >>> 8) & 255] ^ (iArr2[0][i14 >>> 24] + iArr2[1][(i14 >>> 16) & 255])) + iArr2[3][i14 & 255]);
            i13++;
            i11 = i14;
            i10 = i15;
        }
        int i16 = i10 ^ iArr[iArr.length - 2];
        int i17 = i11 ^ iArr[iArr.length - 1];
        if (!z10) {
            getPackageName(iArr);
        }
        iArr3[0] = i17;
        iArr3[1] = i16;
    }

    private static void getPackageName(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }
}
