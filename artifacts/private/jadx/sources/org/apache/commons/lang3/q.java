package org.apache.commons.lang3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes14.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<String, List<Locale>> f337247a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, List<Locale>> f337248b = new ConcurrentHashMap();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final List<Locale> f337249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Set<Locale> f337250b;

        static {
            ArrayList arrayList = new ArrayList(Arrays.asList(Locale.getAvailableLocales()));
            f337249a = Collections.unmodifiableList(arrayList);
            f337250b = Collections.unmodifiableSet(new HashSet(arrayList));
        }

        a() {
        }
    }

    public static List<Locale> a() {
        return a.f337249a;
    }

    public static Set<Locale> b() {
        return a.f337250b;
    }

    public static List<Locale> c(String str) {
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        List<Locale> list = f337248b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Locale locale : a()) {
            if (str.equals(locale.getLanguage()) && locale.getCountry().length() != 0 && locale.getVariant().isEmpty()) {
                arrayList.add(locale);
            }
        }
        List<Locale> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        ConcurrentMap<String, List<Locale>> concurrentMap = f337248b;
        concurrentMap.putIfAbsent(str, listUnmodifiableList);
        return concurrentMap.get(str);
    }

    public static boolean d(Locale locale) {
        return a().contains(locale);
    }

    private static boolean e(String str) {
        return z.r0(str) && str.length() == 2;
    }

    private static boolean f(String str) {
        if (z.q0(str)) {
            return str.length() == 2 || str.length() == 3;
        }
        return false;
    }

    private static boolean g(String str) {
        return z.G0(str) && str.length() == 3;
    }

    public static List<Locale> h(String str) {
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        List<Locale> list = f337247a.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Locale locale : a()) {
            if (str.equals(locale.getCountry()) && locale.getVariant().isEmpty()) {
                arrayList.add(locale);
            }
        }
        List<Locale> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        ConcurrentMap<String, List<Locale>> concurrentMap = f337247a;
        concurrentMap.putIfAbsent(str, listUnmodifiableList);
        return concurrentMap.get(str);
    }

    public static List<Locale> i(Locale locale) {
        return j(locale, locale);
    }

    public static List<Locale> j(Locale locale, Locale locale2) {
        ArrayList arrayList = new ArrayList(4);
        if (locale != null) {
            arrayList.add(locale);
            if (locale.getVariant().length() > 0) {
                arrayList.add(new Locale(locale.getLanguage(), locale.getCountry()));
            }
            if (locale.getCountry().length() > 0) {
                arrayList.add(new Locale(locale.getLanguage(), ""));
            }
            if (!arrayList.contains(locale2)) {
                arrayList.add(locale2);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static Locale k(String str) {
        if (f(str)) {
            return new Locale(str);
        }
        String[] strArrSplit = str.split("_", -1);
        String str2 = strArrSplit[0];
        if (strArrSplit.length == 2) {
            String str3 = strArrSplit[1];
            if ((f(str2) && e(str3)) || g(str3)) {
                return new Locale(str2, str3);
            }
        } else if (strArrSplit.length == 3) {
            String str4 = strArrSplit[1];
            String str5 = strArrSplit[2];
            if (f(str2) && ((str4.length() == 0 || e(str4) || g(str4)) && str5.length() > 0)) {
                return new Locale(str2, str4, str5);
            }
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }

    public static Locale l(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new Locale("", "");
        }
        if (str.contains("#")) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        int length = str.length();
        if (length < 2) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        if (str.charAt(0) != '_') {
            return k(str);
        }
        if (length < 3) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        char cCharAt = str.charAt(1);
        char cCharAt2 = str.charAt(2);
        if (!Character.isUpperCase(cCharAt) || !Character.isUpperCase(cCharAt2)) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        if (length == 3) {
            return new Locale("", str.substring(1, 3));
        }
        if (length < 5) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        if (str.charAt(3) == '_') {
            return new Locale("", str.substring(1, 3), str.substring(4));
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }
}
