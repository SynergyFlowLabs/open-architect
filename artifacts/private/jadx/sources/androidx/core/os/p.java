package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.w0;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p f48070b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f48071a;

    @w0(21)
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Locale[] f48072a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        private a() {
        }

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : f48072a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(@NonNull Locale locale, @NonNull Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            if (!b(locale) && !b(locale2)) {
                String strC = androidx.core.text.e.c(locale);
                if (!strC.isEmpty()) {
                    return strC.equals(androidx.core.text.e.c(locale2));
                }
                String country = locale.getCountry();
                if (!country.isEmpty() && !country.equals(locale2.getCountry())) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    @w0(24)
    static class b {
        private b() {
        }

        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private p(r rVar) {
        this.f48071a = rVar;
    }

    @NonNull
    public static p a(@NonNull Locale... localeArr) {
        return o(b.a(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @NonNull
    public static p c(@androidx.annotation.p0 String str) {
        if (str == null || str.isEmpty()) {
            return g();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    @NonNull
    @d1(min = 1)
    public static p e() {
        return o(b.b());
    }

    @NonNull
    @d1(min = 1)
    public static p f() {
        return o(b.c());
    }

    @NonNull
    public static p g() {
        return f48070b;
    }

    @w0(21)
    public static boolean k(@NonNull Locale locale, @NonNull Locale locale2) {
        return Build.VERSION.SDK_INT >= 33 ? LocaleList.matchesLanguageAndScript(locale, locale2) : a.c(locale, locale2);
    }

    @NonNull
    @w0(24)
    public static p o(@NonNull LocaleList localeList) {
        return new p(new s(localeList));
    }

    @w0(24)
    @Deprecated
    public static p p(Object obj) {
        return o((LocaleList) obj);
    }

    @androidx.annotation.p0
    public Locale d(int i10) {
        return this.f48071a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && this.f48071a.equals(((p) obj).f48071a);
    }

    @androidx.annotation.p0
    public Locale h(@NonNull String[] strArr) {
        return this.f48071a.c(strArr);
    }

    public int hashCode() {
        return this.f48071a.hashCode();
    }

    @androidx.annotation.g0(from = -1)
    public int i(@androidx.annotation.p0 Locale locale) {
        return this.f48071a.d(locale);
    }

    public boolean j() {
        return this.f48071a.isEmpty();
    }

    @androidx.annotation.g0(from = 0)
    public int l() {
        return this.f48071a.size();
    }

    @NonNull
    public String m() {
        return this.f48071a.a();
    }

    @androidx.annotation.p0
    public Object n() {
        return this.f48071a.b();
    }

    @NonNull
    public String toString() {
        return this.f48071a.toString();
    }
}
