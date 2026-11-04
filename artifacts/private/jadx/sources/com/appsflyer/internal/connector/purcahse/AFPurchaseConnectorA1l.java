package com.appsflyer.internal.connector.purcahse;

/* JADX INFO: loaded from: classes3.dex */
public final class AFPurchaseConnectorA1l {
    public int InAppPurchaseEvent;
    public int getPackageName;
    public int toJsonMap;

    public static void getOneTimePurchaseOfferDetails(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }

    public static int toJsonMap(int i10) {
        int[][] iArr = AFPurchaseConnectorA1n.InAppPurchaseEvent.toJsonMap;
        return ((iArr[0][(i10 >>> 24) & 255] + iArr[1][(i10 >>> 16) & 255]) ^ iArr[2][(i10 >>> 8) & 255]) + iArr[3][i10 & 255];
    }
}
