package io.sentry.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f306969a = "Cookie";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f306970b = Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f306971c = Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io.sentry.r0 f306972d = new io.sentry.r0(400, 499);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final io.sentry.r0 f306973e = new io.sentry.r0(500, io.sentry.r0.f306611d);

    public static boolean a(@NotNull String str) {
        return f306970b.contains(str.toUpperCase(Locale.ROOT));
    }

    @Nullable
    public static String b(@Nullable String str, @Nullable List<String> list) {
        if (str == null) {
            return null;
        }
        try {
            String[] strArrSplit = str.split(";", -1);
            StringBuilder sb2 = new StringBuilder();
            int length = strArrSplit.length;
            boolean z10 = true;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArrSplit[i10];
                if (!z10) {
                    sb2.append(";");
                }
                String str3 = str2.split("=", -1)[0];
                if (g(str3.trim(), list)) {
                    sb2.append(str3 + "=" + r0.f306983a);
                } else {
                    sb2.append(str2);
                }
                i10++;
                z10 = false;
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static List<String> c(@Nullable Enumeration<String> enumeration, @Nullable String str, @Nullable List<String> list) {
        if (enumeration == null) {
            return null;
        }
        return d(Collections.list(enumeration), str, list);
    }

    @Nullable
    public static List<String> d(@Nullable List<String> list, @Nullable String str, @Nullable List<String> list2) {
        if (list == null) {
            return null;
        }
        if (str != null && !"Cookie".equalsIgnoreCase(str)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next(), list2));
        }
        return arrayList;
    }

    public static boolean e(int i10) {
        return f306972d.a(i10);
    }

    public static boolean f(int i10) {
        return f306973e.a(i10);
    }

    public static boolean g(@NotNull String str, @Nullable List<String> list) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (f306971c.contains(upperCase)) {
            return true;
        }
        if (list == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().toUpperCase(Locale.ROOT).equals(upperCase)) {
                return true;
            }
        }
        return false;
    }
}
