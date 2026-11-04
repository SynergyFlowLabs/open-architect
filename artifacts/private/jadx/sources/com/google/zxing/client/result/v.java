package com.google.zxing.client.result;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends u {
    private static void q(Collection<String> collection, Collection<String> collection2, String str) {
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            collection.add(str);
            collection2.add(null);
        } else {
            collection.add(str.substring(0, iIndexOf));
            String strSubstring = str.substring(iIndexOf + 1);
            collection2.add(strSubstring.startsWith("via=") ? strSubstring.substring(4) : null);
        }
    }

    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public w k(com.google.zxing.r rVar) {
        boolean z10;
        String str;
        String strC = u.c(rVar);
        String str2 = null;
        if (!strC.startsWith("sms:") && !strC.startsWith("SMS:") && !strC.startsWith("mms:") && !strC.startsWith("MMS:")) {
            return null;
        }
        Map<String, String> mapM = u.m(strC);
        if (mapM == null || mapM.isEmpty()) {
            z10 = false;
            str = null;
        } else {
            str2 = mapM.get("subject");
            str = mapM.get("body");
            z10 = true;
        }
        int iIndexOf = strC.indexOf(63, 4);
        String strSubstring = (iIndexOf < 0 || !z10) ? strC.substring(4) : strC.substring(4, iIndexOf);
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        int i10 = -1;
        while (true) {
            int i11 = i10 + 1;
            int iIndexOf2 = strSubstring.indexOf(44, i11);
            if (iIndexOf2 <= i10) {
                q(arrayList, arrayList2, strSubstring.substring(i11));
                return new w((String[]) arrayList.toArray(new String[arrayList.size()]), (String[]) arrayList2.toArray(new String[arrayList2.size()]), str2, str);
            }
            q(arrayList, arrayList2, strSubstring.substring(i11, iIndexOf2));
            i10 = iIndexOf2;
        }
    }
}
