package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends u {
    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public z k(com.google.zxing.r rVar) {
        String str;
        String strC = u.c(rVar);
        if (!strC.startsWith("tel:") && !strC.startsWith("TEL:")) {
            return null;
        }
        if (strC.startsWith("TEL:")) {
            str = "tel:" + strC.substring(4);
        } else {
            str = strC;
        }
        int iIndexOf = strC.indexOf(63, 4);
        return new z(iIndexOf < 0 ? strC.substring(4) : strC.substring(4, iIndexOf), str, null);
    }
}
