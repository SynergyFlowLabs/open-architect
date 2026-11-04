package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f130215f = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    static boolean s(String str) {
        return str != null && f130215f.matcher(str).matches() && str.indexOf(64) >= 0;
    }

    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public h k(com.google.zxing.r rVar) {
        String[] strArrQ;
        String strC = u.c(rVar);
        if (!strC.startsWith("MATMSG:") || (strArrQ = a.q("TO:", strC, true)) == null) {
            return null;
        }
        for (String str : strArrQ) {
            if (!s(str)) {
                return null;
            }
        }
        return new h(strArrQ, null, null, a.r("SUB:", strC, false), a.r("BODY:", strC, false));
    }
}
