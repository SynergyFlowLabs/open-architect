package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f106971a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f106972b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f106973c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private p() {
    }

    @NonNull
    @g6.a
    public static Map<String, String> a(@NonNull URI uri, @NonNull String str) {
        Map<String, String> map = Collections.EMPTY_MAP;
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            map = new HashMap<>();
            com.google.android.gms.internal.common.b bVarC = com.google.android.gms.internal.common.b.c(com.google.android.gms.internal.common.h0.b('='));
            Iterator it = com.google.android.gms.internal.common.b.c(com.google.android.gms.internal.common.h0.b(kotlin.text.b0.f313279d)).b().d(rawQuery).iterator();
            while (it.hasNext()) {
                List listF = bVarC.f((String) it.next());
                if (listF.isEmpty() || listF.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                map.put(b((String) listF.get(0), str), listF.size() == 2 ? b((String) listF.get(1), str) : null);
            }
        }
        return map;
    }

    private static String b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
