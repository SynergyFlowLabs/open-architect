package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f102227a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f102228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f102229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f102230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f102231e;

    static {
        a aVar = new a("MIME", f102227a, true, '=', 76);
        f102228b = aVar;
        f102229c = new a(aVar, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        f102230d = new a(aVar, "PEM", true, '=', 64);
        StringBuilder sb2 = new StringBuilder(f102227a);
        sb2.setCharAt(sb2.indexOf(org.slf4j.h.f339615a3), org.apache.commons.codec.language.l.f335457d);
        sb2.setCharAt(sb2.indexOf("/"), '_');
        f102231e = new a("MODIFIED-FOR-URL", sb2.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    public static a a() {
        return f102229c;
    }

    public static a b(String str) throws IllegalArgumentException {
        String str2;
        a aVar = f102228b;
        if (aVar.f102223d.equals(str)) {
            return aVar;
        }
        a aVar2 = f102229c;
        if (aVar2.f102223d.equals(str)) {
            return aVar2;
        }
        a aVar3 = f102230d;
        if (aVar3.f102223d.equals(str)) {
            return aVar3;
        }
        a aVar4 = f102231e;
        if (aVar4.f102223d.equals(str)) {
            return aVar4;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            str2 = "'" + str + "'";
        }
        throw new IllegalArgumentException("No Base64Variant with name " + str2);
    }
}
