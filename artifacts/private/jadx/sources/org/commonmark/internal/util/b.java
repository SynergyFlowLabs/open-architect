package org.commonmark.internal.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f337705a = b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f337706b = Pattern.compile("^&#[Xx]?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f337707c = "/org/commonmark/internal/util/entities.properties";

    public static String a(String str) {
        Matcher matcher = f337706b.matcher(str);
        if (!matcher.find()) {
            String str2 = f337705a.get(str.substring(1, str.length() - 1));
            return str2 != null ? str2 : str;
        }
        try {
            int i10 = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), matcher.end() == 2 ? 10 : 16);
            return i10 == 0 ? "�" : new String(Character.toChars(i10));
        } catch (IllegalArgumentException unused) {
            return "�";
        }
    }

    private static Map<String, String> b() {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(b.class.getResourceAsStream(f337707c), Charset.forName("UTF-8")));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", "\n");
                        return map;
                    }
                    if (line.length() != 0) {
                        int iIndexOf = line.indexOf("=");
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                throw new IllegalStateException("Failed reading data for HTML named character references", e);
            }
        } catch (IOException e10) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e10);
        }
    }
}
