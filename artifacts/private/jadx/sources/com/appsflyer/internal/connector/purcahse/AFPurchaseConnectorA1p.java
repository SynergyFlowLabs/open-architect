package com.appsflyer.internal.connector.purcahse;

import com.rabbitmq.client.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class AFPurchaseConnectorA1p {
    static long[] getPackageName(int i10, int i11) {
        long[] jArr = new long[4];
        jArr[0] = (((long) i11) & k0.f265952a) | ((((long) i10) & k0.f265952a) << 32);
        for (int i12 = 1; i12 < 4; i12++) {
            long j10 = jArr[i12 - 1];
            jArr[i12] = ((j10 ^ (j10 >> 30)) * 1812433253) + ((long) i12);
        }
        return jArr;
    }
}
