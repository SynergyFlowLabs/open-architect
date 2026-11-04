package com.google.zxing.client.result;

import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends u {
    private static String[] q(String str, int i10, String str2, boolean z10) {
        ArrayList arrayList = null;
        for (int i11 = 1; i11 <= i10; i11++) {
            String strG = u.g(str + i11 + AbstractJsonLexerKt.COLON, str2, org.apache.commons.lang3.k.f337188d, z10);
            if (strG == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i10);
            }
            arrayList.add(strG);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public d k(com.google.zxing.r rVar) {
        String strC = u.c(rVar);
        if (!strC.contains("MEMORY") || !strC.contains("\r\n")) {
            return null;
        }
        String strG = u.g("NAME1:", strC, org.apache.commons.lang3.k.f337188d, true);
        String strG2 = u.g("NAME2:", strC, org.apache.commons.lang3.k.f337188d, true);
        String[] strArrQ = q("TEL", 3, strC, true);
        String[] strArrQ2 = q("MAIL", 3, strC, true);
        String strG3 = u.g("MEMORY:", strC, org.apache.commons.lang3.k.f337188d, false);
        String strG4 = u.g("ADD:", strC, org.apache.commons.lang3.k.f337188d, true);
        return new d(u.j(strG), null, strG2, strArrQ, null, strArrQ2, null, null, strG3, strG4 != null ? new String[]{strG4} : null, null, null, null, null, null, null);
    }
}
