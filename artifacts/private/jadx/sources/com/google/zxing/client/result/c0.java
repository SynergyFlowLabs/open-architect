package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f130153d = Pattern.compile(":/*([^/@]+)@[^/]+");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f130155c;

    public c0(String str, String str2) {
        super(r.URI);
        this.f130154b = i(str);
        this.f130155c = str2;
    }

    private static boolean g(String str, int i10) {
        int i11 = i10 + 1;
        int iIndexOf = str.indexOf(47, i11);
        if (iIndexOf < 0) {
            iIndexOf = str.length();
        }
        return u.e(str, i11, iIndexOf - i11);
    }

    private static String i(String str) {
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(58);
        return (iIndexOf < 0 || g(strTrim, iIndexOf)) ? "http://".concat(strTrim) : strTrim;
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(30);
        q.c(this.f130155c, sb2);
        q.c(this.f130154b, sb2);
        return sb2.toString();
    }

    public String e() {
        return this.f130155c;
    }

    public String f() {
        return this.f130154b;
    }

    public boolean h() {
        return f130153d.matcher(this.f130154b).find();
    }
}
