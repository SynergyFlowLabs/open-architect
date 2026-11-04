package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f337363a = i.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f337364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final f f337365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f337366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final f f337367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f337368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final f f337369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final f f337370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final f f337371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final f f337372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f337373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final f f337374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f337375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final f f337376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f337377o;

    static {
        f fVarX = f.x("yyyy-MM-dd'T'HH:mm:ss");
        f337364b = fVarX;
        f337365c = fVarX;
        f fVarX2 = f.x("yyyy-MM-dd'T'HH:mm:ssZZ");
        f337366d = fVarX2;
        f337367e = fVarX2;
        f fVarX3 = f.x("yyyy-MM-dd");
        f337368f = fVarX3;
        f337369g = fVarX3;
        f337370h = f.x("yyyy-MM-ddZZ");
        f337371i = f.x("'T'HH:mm:ss");
        f337372j = f.x("'T'HH:mm:ssZZ");
        f fVarX4 = f.x("HH:mm:ss");
        f337373k = fVarX4;
        f337374l = fVarX4;
        f fVarX5 = f.x("HH:mm:ssZZ");
        f337375m = fVarX5;
        f337376n = fVarX5;
        f337377o = f.z("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
    }

    public static String a(long j10, String str) {
        return l(new Date(j10), str, null, null);
    }

    public static String b(long j10, String str, Locale locale) {
        return l(new Date(j10), str, null, locale);
    }

    public static String c(long j10, String str, TimeZone timeZone) {
        return l(new Date(j10), str, timeZone, null);
    }

    public static String d(long j10, String str, TimeZone timeZone, Locale locale) {
        return l(new Date(j10), str, timeZone, locale);
    }

    public static String e(Calendar calendar, String str) {
        return h(calendar, str, null, null);
    }

    public static String f(Calendar calendar, String str, Locale locale) {
        return h(calendar, str, null, locale);
    }

    public static String g(Calendar calendar, String str, TimeZone timeZone) {
        return h(calendar, str, timeZone, null);
    }

    public static String h(Calendar calendar, String str, TimeZone timeZone, Locale locale) {
        return f.B(str, timeZone, locale).f(calendar);
    }

    public static String i(Date date, String str) {
        return l(date, str, null, null);
    }

    public static String j(Date date, String str, Locale locale) {
        return l(date, str, null, locale);
    }

    public static String k(Date date, String str, TimeZone timeZone) {
        return l(date, str, timeZone, null);
    }

    public static String l(Date date, String str, TimeZone timeZone, Locale locale) {
        return f.B(str, timeZone, locale).d(date);
    }

    public static String m(long j10, String str) {
        return l(new Date(j10), str, f337363a, null);
    }

    public static String n(long j10, String str, Locale locale) {
        return l(new Date(j10), str, f337363a, locale);
    }

    public static String o(Date date, String str) {
        return l(date, str, f337363a, null);
    }

    public static String p(Date date, String str, Locale locale) {
        return l(date, str, f337363a, locale);
    }
}
