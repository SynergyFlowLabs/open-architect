package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 extends u {
    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public c0 k(com.google.zxing.r rVar) {
        int iIndexOf;
        String strC = u.c(rVar);
        if ((strC.startsWith("urlto:") || strC.startsWith("URLTO:")) && (iIndexOf = strC.indexOf(58, 6)) >= 0) {
            return new c0(strC.substring(iIndexOf + 1), iIndexOf > 6 ? strC.substring(6, iIndexOf) : null);
        }
        return null;
    }
}
