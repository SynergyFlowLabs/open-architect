package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends u {
    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public s k(com.google.zxing.r rVar) {
        com.google.zxing.a aVarB = rVar.b();
        if (aVarB != com.google.zxing.a.UPC_A && aVarB != com.google.zxing.a.UPC_E && aVarB != com.google.zxing.a.EAN_8 && aVarB != com.google.zxing.a.EAN_13) {
            return null;
        }
        String strC = u.c(rVar);
        if (u.d(strC, strC.length())) {
            return new s(strC, (aVarB == com.google.zxing.a.UPC_E && strC.length() == 8) ? com.google.zxing.oned.a0.s(strC) : strC);
        }
        return null;
    }
}
