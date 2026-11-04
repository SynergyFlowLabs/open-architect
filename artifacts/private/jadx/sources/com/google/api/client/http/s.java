package com.google.api.client.http;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f115695e = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f115696f = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f115697g = Pattern.compile("\\s*([^\\s/=;\"]+)/([^\\s/=;\"]+)\\s*(;.*)?", 32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f115698h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f115699a = "application";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f115700b = "octet-stream";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SortedMap<String, String> f115701c = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f115702d;

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\"([^\"]*)\"");
        sb2.append("|");
        sb2.append("[^\\s;\"]*");
        f115698h = Pattern.compile("\\s*;\\s*([^\\s/=;\"]+)=(" + sb2.toString() + ")");
    }

    public s(String str, String str2) {
        q(str);
        p(str2);
    }

    public static boolean d(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        return (str == null || str2 == null || !new s(str).c(new s(str2))) ? false : true;
    }

    private s e(String str) {
        Matcher matcher = f115697g.matcher(str);
        com.google.api.client.util.h0.b(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        q(matcher.group(1));
        p(matcher.group(2));
        String strGroup = matcher.group(3);
        if (strGroup != null) {
            Matcher matcher2 = f115698h.matcher(strGroup);
            while (matcher2.find()) {
                String strGroup2 = matcher2.group(1);
                String strGroup3 = matcher2.group(3);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(2);
                }
                o(strGroup2, strGroup3);
            }
        }
        return this;
    }

    static boolean k(String str) {
        return f115696f.matcher(str).matches();
    }

    private static String l(String str) {
        return "\"" + str.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
    }

    public String a() {
        String str = this.f115702d;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f115699a);
        sb2.append('/');
        sb2.append(this.f115700b);
        SortedMap<String, String> sortedMap = this.f115701c;
        if (sortedMap != null) {
            for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
                String value = entry.getValue();
                sb2.append("; ");
                sb2.append(entry.getKey());
                sb2.append("=");
                if (!k(value)) {
                    value = l(value);
                }
                sb2.append(value);
            }
        }
        String string = sb2.toString();
        this.f115702d = string;
        return string;
    }

    public void b() {
        this.f115702d = null;
        this.f115701c.clear();
    }

    public boolean c(s sVar) {
        return sVar != null && j().equalsIgnoreCase(sVar.j()) && i().equalsIgnoreCase(sVar.i());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return c(sVar) && this.f115701c.equals(sVar.f115701c);
    }

    public Charset f() {
        String strG = g(hi.c.C1916c.f285814c);
        if (strG == null) {
            return null;
        }
        return Charset.forName(strG);
    }

    public String g(String str) {
        return this.f115701c.get(str.toLowerCase(Locale.US));
    }

    public Map<String, String> h() {
        return Collections.unmodifiableMap(this.f115701c);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String i() {
        return this.f115700b;
    }

    public String j() {
        return this.f115699a;
    }

    public s m(String str) {
        this.f115702d = null;
        this.f115701c.remove(str.toLowerCase(Locale.US));
        return this;
    }

    public s n(Charset charset) {
        o(hi.c.C1916c.f285814c, charset == null ? null : charset.name());
        return this;
    }

    public s o(String str, String str2) {
        if (str2 == null) {
            m(str);
            return this;
        }
        com.google.api.client.util.h0.b(f115696f.matcher(str).matches(), "Name contains reserved characters");
        this.f115702d = null;
        this.f115701c.put(str.toLowerCase(Locale.US), str2);
        return this;
    }

    public s p(String str) {
        com.google.api.client.util.h0.b(f115695e.matcher(str).matches(), "Subtype contains reserved characters");
        this.f115700b = str;
        this.f115702d = null;
        return this;
    }

    public s q(String str) {
        com.google.api.client.util.h0.b(f115695e.matcher(str).matches(), "Type contains reserved characters");
        this.f115699a = str;
        int i10 = 7 >> 0;
        this.f115702d = null;
        return this;
    }

    public String toString() {
        return a();
    }

    public s(String str) {
        e(str);
    }
}
