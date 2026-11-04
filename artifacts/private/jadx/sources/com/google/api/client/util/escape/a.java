package com.google.api.client.util.escape;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f116051a = new c(c.f116056d, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f116052b = new c(c.f116057e, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f116053c = new c(c.f116058f, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f116054d = new c(c.f116059g, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f116055e = new c(c.f116060h, false);

    private a() {
    }

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String b(String str) {
        return f116051a.a(str);
    }

    public static String c(String str) {
        return f116052b.a(str);
    }

    public static String d(String str) {
        return f116053c.a(str);
    }

    public static String e(String str) {
        return f116055e.a(str);
    }

    public static String f(String str) {
        return f116054d.a(str);
    }
}
