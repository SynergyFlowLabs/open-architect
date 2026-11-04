package org.apache.commons.lang3.time;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
abstract class j<F extends Format> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f337500b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap<a, String> f337501c = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<a, F> f337502a = new ConcurrentHashMap(7);

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object[] f337503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f337504b;

        a(Object... objArr) {
            this.f337503a = objArr;
        }

        public boolean equals(Object obj) {
            return Arrays.equals(this.f337503a, ((a) obj).f337503a);
        }

        public int hashCode() {
            if (this.f337504b == 0) {
                int i10 = 4 >> 0;
                int iHashCode = 0;
                for (Object obj : this.f337503a) {
                    if (obj != null) {
                        iHashCode = (iHashCode * 7) + obj.hashCode();
                    }
                }
                this.f337504b = iHashCode;
            }
            return this.f337504b;
        }
    }

    j() {
    }

    private F d(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return (F) f(g(num, num2, locale), timeZone, locale);
    }

    static String g(Integer num, Integer num2, Locale locale) {
        DateFormat dateInstance;
        a aVar = new a(num, num2, locale);
        ConcurrentMap<a, String> concurrentMap = f337501c;
        String str = concurrentMap.get(aVar);
        if (str != null) {
            return str;
        }
        try {
            if (num == null) {
                dateInstance = DateFormat.getTimeInstance(num2.intValue(), locale);
            } else {
                dateInstance = num2 == null ? DateFormat.getDateInstance(num.intValue(), locale) : DateFormat.getDateTimeInstance(num.intValue(), num2.intValue(), locale);
            }
            String pattern = ((SimpleDateFormat) dateInstance).toPattern();
            String strPutIfAbsent = concurrentMap.putIfAbsent(aVar, pattern);
            return strPutIfAbsent != null ? strPutIfAbsent : pattern;
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("No date time pattern for locale: " + locale);
        }
    }

    protected abstract F a(String str, TimeZone timeZone, Locale locale);

    F b(int i10, TimeZone timeZone, Locale locale) {
        return (F) d(Integer.valueOf(i10), null, timeZone, locale);
    }

    F c(int i10, int i11, TimeZone timeZone, Locale locale) {
        return (F) d(Integer.valueOf(i10), Integer.valueOf(i11), timeZone, locale);
    }

    public F e() {
        return (F) c(3, 3, TimeZone.getDefault(), Locale.getDefault());
    }

    public F f(String str, TimeZone timeZone, Locale locale) {
        c0.P(str, "pattern must not be null", new Object[0]);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        a aVar = new a(str, timeZone, locale);
        F f10 = this.f337502a.get(aVar);
        if (f10 != null) {
            return f10;
        }
        F f11 = (F) a(str, timeZone, locale);
        F fPutIfAbsent = this.f337502a.putIfAbsent(aVar, f11);
        return fPutIfAbsent != null ? fPutIfAbsent : f11;
    }

    F h(int i10, TimeZone timeZone, Locale locale) {
        return (F) d(null, Integer.valueOf(i10), timeZone, locale);
    }
}
