package com.appsflyer.internal.connector.purcahse;

/* JADX INFO: loaded from: classes3.dex */
public final class AFPurchaseConnectorA1h {
    public int InAppPurchaseEvent;
    public int toJsonMap;

    public static char[] toJsonMap(long j10, char[] cArr, int i10) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 4;
        while (i11 < cArr.length) {
            if ((((j10 >>> i11) & 1) != i10 || i12 >= 4) && i13 < length) {
                cArr2[i13] = cArr[i11];
                i13++;
            } else {
                cArr2[i12] = cArr[i11];
                i12++;
            }
            i11++;
        }
        return cArr2;
    }
}
