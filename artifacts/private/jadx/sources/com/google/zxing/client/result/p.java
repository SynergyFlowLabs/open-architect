package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends u {
    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public o k(com.google.zxing.r rVar) {
        if (rVar.b() != com.google.zxing.a.EAN_13) {
            return null;
        }
        String strC = u.c(rVar);
        if (strC.length() != 13) {
            return null;
        }
        if (strC.startsWith("978") || strC.startsWith("979")) {
            return new o(strC);
        }
        return null;
    }
}
