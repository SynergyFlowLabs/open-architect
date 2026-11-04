package io.ably.lib.util;

import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f288204a = " ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f288205b = "/";

    public static String a(Map<String, String> map, n nVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(io.ably.lib.transport.c.f287838b);
        if (map != null && !map.isEmpty()) {
            sb2.append(" ");
            sb2.append(b(map));
        }
        String strA = nVar.a();
        if (strA != null) {
            sb2.append(" ");
            sb2.append(strA);
        }
        return sb2.toString();
    }

    private static String b(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            sb2.append(str);
            if (str2 != null) {
                sb2.append("/");
                sb2.append(str2);
            }
            sb2.append(" ");
        }
        return sb2.toString().trim();
    }
}
