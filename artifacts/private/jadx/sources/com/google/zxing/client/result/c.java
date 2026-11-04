package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends a {
    private static String t(String str) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf < 0) {
            return str;
        }
        return str.substring(iIndexOf + 1) + ' ' + str.substring(0, iIndexOf);
    }

    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public d k(com.google.zxing.r rVar) {
        String[] strArrQ;
        String strC = u.c(rVar);
        if (!strC.startsWith("MECARD:") || (strArrQ = a.q("N:", strC, true)) == null) {
            return null;
        }
        String strT = t(strArrQ[0]);
        String strR = a.r("SOUND:", strC, true);
        String[] strArrQ2 = a.q("TEL:", strC, true);
        String[] strArrQ3 = a.q("EMAIL:", strC, true);
        String strR2 = a.r("NOTE:", strC, false);
        String[] strArrQ4 = a.q("ADR:", strC, true);
        String strR3 = a.r("BDAY:", strC, true);
        return new d(u.j(strT), null, strR, strArrQ2, null, strArrQ3, null, null, strR2, strArrQ4, null, a.r("ORG:", strC, true), !u.d(strR3, 8) ? null : strR3, null, a.q("URL:", strC, true), null);
    }
}
