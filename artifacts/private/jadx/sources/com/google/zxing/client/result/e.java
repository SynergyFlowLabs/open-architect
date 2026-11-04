package com.google.zxing.client.result;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends a {
    private static String s(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + ' ' + str2;
    }

    private static String[] t(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public d k(com.google.zxing.r rVar) {
        String strC = u.c(rVar);
        if (!strC.startsWith("BIZCARD:")) {
            return null;
        }
        String strS = s(a.r("N:", strC, true), a.r("X:", strC, true));
        String strR = a.r("T:", strC, true);
        String strR2 = a.r("C:", strC, true);
        return new d(u.j(strS), null, null, t(a.r("B:", strC, true), a.r("M:", strC, true), a.r("F:", strC, true)), null, u.j(a.r("E:", strC, true)), null, null, null, a.q("A:", strC, true), null, strR2, null, strR, null, null);
    }
}
