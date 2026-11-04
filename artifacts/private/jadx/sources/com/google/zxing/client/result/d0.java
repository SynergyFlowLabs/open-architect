package com.google.zxing.client.result;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 extends u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f130172f = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f130173g = Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    static boolean q(String str) {
        if (str.contains(" ")) {
            return false;
        }
        Matcher matcher = f130172f.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f130173g.matcher(str);
        return matcher2.find() && matcher2.start() == 0;
    }

    @Override // com.google.zxing.client.result.u
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public c0 k(com.google.zxing.r rVar) {
        String strC = u.c(rVar);
        if (!strC.startsWith("URL:") && !strC.startsWith("URI:")) {
            String strTrim = strC.trim();
            if (q(strTrim)) {
                return new c0(strTrim, null);
            }
            return null;
        }
        return new c0(strC.substring(4).trim(), null);
    }
}
