package org.commonmark.internal.util;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f337696a = "[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f337697b = "&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f337698c = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f337699d = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f337700e = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char[] f337701f = {l.f338160j, l.f338161k, l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', l.f338157g};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f337702g = Pattern.compile("[ \t\r\n]+");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f337703h = new C2413a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final c f337704i = new b();

    /* JADX INFO: renamed from: org.commonmark.internal.util.a$a, reason: collision with other inner class name */
    static class C2413a implements c {
        C2413a() {
        }

        @Override // org.commonmark.internal.util.a.c
        public void a(String str, StringBuilder sb2) {
            if (str.charAt(0) == '\\') {
                sb2.append((CharSequence) str, 1, str.length());
            } else {
                sb2.append(org.commonmark.internal.util.b.a(str));
            }
        }
    }

    static class b implements c {
        b() {
        }

        @Override // org.commonmark.internal.util.a.c
        public void a(String str, StringBuilder sb2) {
            if (str.startsWith("%")) {
                if (str.length() == 3) {
                    sb2.append(str);
                    return;
                } else {
                    sb2.append("%25");
                    sb2.append((CharSequence) str, 1, str.length());
                    return;
                }
            }
            for (byte b10 : str.getBytes(Charset.forName("UTF-8"))) {
                sb2.append('%');
                sb2.append(a.f337701f[(b10 >> 4) & 15]);
                sb2.append(a.f337701f[b10 & com.google.common.base.c.f116464q]);
            }
        }
    }

    private interface c {
        void a(String str, StringBuilder sb2);
    }

    public static String b(String str) {
        String str2;
        StringBuilder sb2 = null;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"') {
                str2 = "&quot;";
            } else if (cCharAt == '&') {
                str2 = "&amp;";
            } else if (cCharAt != '<') {
                if (cCharAt == '>') {
                    str2 = "&gt;";
                } else if (sb2 != null) {
                    sb2.append(cCharAt);
                }
            } else {
                str2 = "&lt;";
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
                sb2.append((CharSequence) str, 0, i10);
            }
            sb2.append(str2);
        }
        return sb2 != null ? sb2.toString() : str;
    }

    public static String c(String str) {
        return f337702g.matcher(str.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
    }

    public static String d(String str) {
        return c(str.substring(1, str.length() - 1));
    }

    public static String e(String str) {
        return f(f337700e, str, f337704i);
    }

    private static String f(Pattern pattern, String str, c cVar) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb2.append((CharSequence) str, iEnd, matcher.start());
            cVar.a(matcher.group(), sb2);
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb2.append((CharSequence) str, iEnd, str.length());
        }
        return sb2.toString();
    }

    public static String g(String str) {
        return f337698c.matcher(str).find() ? f(f337699d, str, f337703h) : str;
    }
}
