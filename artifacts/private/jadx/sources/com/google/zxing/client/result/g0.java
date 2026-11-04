package com.google.zxing.client.result;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 extends u {
    private static String q(CharSequence charSequence, String str, boolean z10) {
        List<String> listT = f0.t(charSequence, str, z10, false);
        if (listT == null || listT.isEmpty()) {
            return null;
        }
        return listT.get(0);
    }

    private static String[] r(CharSequence charSequence, String str, boolean z10) {
        List<List<String>> listU = f0.u(charSequence, str, z10, false);
        if (listU == null || listU.isEmpty()) {
            return null;
        }
        int size = listU.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = listU.get(i10).get(0);
        }
        return strArr;
    }

    private static String t(String str) {
        if (str != null && (str.startsWith(androidx.core.net.c.f48012b) || str.startsWith("MAILTO:"))) {
            str = str.substring(7);
        }
        return str;
    }

    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public g k(com.google.zxing.r rVar) {
        double d10;
        double d11;
        String strC = u.c(rVar);
        if (strC.indexOf("BEGIN:VEVENT") < 0) {
            return null;
        }
        String strQ = q("SUMMARY", strC, true);
        String strQ2 = q("DTSTART", strC, true);
        if (strQ2 == null) {
            return null;
        }
        String strQ3 = q("DTEND", strC, true);
        String strQ4 = q("DURATION", strC, true);
        String strQ5 = q(com.google.android.gms.stats.a.D1, strC, true);
        String strT = t(q("ORGANIZER", strC, true));
        String[] strArrR = r("ATTENDEE", strC, true);
        if (strArrR != null) {
            for (int i10 = 0; i10 < strArrR.length; i10++) {
                strArrR[i10] = t(strArrR[i10]);
            }
        }
        String strQ6 = q(com.facebook.share.internal.f.W, strC, true);
        String strQ7 = q("GEO", strC, true);
        if (strQ7 == null) {
            d10 = Double.NaN;
            d11 = Double.NaN;
        } else {
            int iIndexOf = strQ7.indexOf(59);
            if (iIndexOf < 0) {
                return null;
            }
            try {
                d10 = Double.parseDouble(strQ7.substring(0, iIndexOf));
                d11 = Double.parseDouble(strQ7.substring(iIndexOf + 1));
            } catch (NumberFormatException | IllegalArgumentException unused) {
                return null;
            }
        }
        return new g(strQ, strQ2, strQ3, strQ4, strQ5, strT, strArrR, strQ6, d10, d11);
    }
}
