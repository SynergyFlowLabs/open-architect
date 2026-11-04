package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends u {
    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public h k(com.google.zxing.r rVar) {
        String strSubstring;
        String str;
        String strC = u.c(rVar);
        if (!strC.startsWith("smtp:") && !strC.startsWith("SMTP:")) {
            return null;
        }
        String strSubstring2 = strC.substring(5);
        int iIndexOf = strSubstring2.indexOf(58);
        if (iIndexOf >= 0) {
            String strSubstring3 = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
            int iIndexOf2 = strSubstring3.indexOf(58);
            if (iIndexOf2 >= 0) {
                String strSubstring4 = strSubstring3.substring(iIndexOf2 + 1);
                strSubstring = strSubstring3.substring(0, iIndexOf2);
                str = strSubstring4;
            } else {
                str = null;
                strSubstring = strSubstring3;
            }
        } else {
            strSubstring = null;
            str = null;
        }
        return new h(new String[]{strSubstring2}, null, null, strSubstring, str);
    }
}
