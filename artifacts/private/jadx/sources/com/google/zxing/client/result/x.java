package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends u {
    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public w k(com.google.zxing.r rVar) {
        String strSubstring;
        String strC = u.c(rVar);
        if (!strC.startsWith("smsto:") && !strC.startsWith("SMSTO:") && !strC.startsWith("mmsto:") && !strC.startsWith("MMSTO:")) {
            return null;
        }
        String strSubstring2 = strC.substring(6);
        int iIndexOf = strSubstring2.indexOf(58);
        if (iIndexOf >= 0) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            strSubstring = null;
        }
        return new w(strSubstring2, (String) null, (String) null, strSubstring);
    }
}
