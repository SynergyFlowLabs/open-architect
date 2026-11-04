package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 extends u {
    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public j0 k(com.google.zxing.r rVar) {
        String strSubstring;
        String strG;
        String strC = u.c(rVar);
        if (!strC.startsWith("WIFI:") || (strG = u.g("S:", (strSubstring = strC.substring(5)), ';', false)) == null || strG.isEmpty()) {
            return null;
        }
        String strG2 = u.g("P:", strSubstring, ';', false);
        String strG3 = u.g("T:", strSubstring, ';', false);
        if (strG3 == null) {
            strG3 = "nopass";
        }
        return new j0(strG3, strG, strG2, Boolean.parseBoolean(u.g("H:", strSubstring, ';', false)), u.g("I:", strSubstring, ';', false), u.g("A:", strSubstring, ';', false), u.g("E:", strSubstring, ';', false), u.g("H:", strSubstring, ';', false));
    }
}
