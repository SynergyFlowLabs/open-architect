package androidx.core.text.util;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@w0(21)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48314a = "j";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f48315b = {"BS", "BZ", "KY", "PR", "PW", "US"};

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48316a;

        static {
            int[] iArr = new int[DateFormat.HourCycle.values().length];
            f48316a = iArr;
            try {
                iArr[DateFormat.HourCycle.HOUR_CYCLE_11.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48316a[DateFormat.HourCycle.HOUR_CYCLE_12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48316a[DateFormat.HourCycle.HOUR_CYCLE_23.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48316a[DateFormat.HourCycle.HOUR_CYCLE_24.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @w0(24)
    private static class b {
        private b() {
        }

        static String a(@NonNull Locale locale) {
            return Calendar.getInstance(locale).getType();
        }

        static Locale b() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    @w0(33)
    private static class c {
        private c() {
        }

        static String a(@NonNull Locale locale) {
            return b(DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        private static String b(DateFormat.HourCycle hourCycle) {
            int i10 = a.f48316a[hourCycle.ordinal()];
            if (i10 == 1) {
                return f.f48340b;
            }
            if (i10 == 2) {
                return f.f48341c;
            }
            if (i10 != 3) {
                return i10 != 4 ? "" : f.f48343e;
            }
            return f.f48342d;
        }

        static String c(@NonNull Locale locale) {
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith(g.f48347c) ? g.f48347c : identifier;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f48317a = "ca";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f48318b = "chinese";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f48319c = "dangi";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f48320d = "gregorian";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f48321e = "hebrew";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f48322f = "indian";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f48323g = "islamic";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f48324h = "islamic-civil";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f48325i = "islamic-rgsa";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f48326j = "islamic-tbla";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f48327k = "islamic-umalqura";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f48328l = "persian";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f48329m = "";

        @Retention(RetentionPolicy.SOURCE)
        @b1({b1.a.LIBRARY})
        public @interface a {
        }

        private d() {
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f48330a = "fw";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f48331b = "sun";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f48332c = "mon";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f48333d = "tue";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f48334e = "wed";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f48335f = "thu";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f48336g = "fri";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f48337h = "sat";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f48338i = "";

        @Retention(RetentionPolicy.SOURCE)
        @b1({b1.a.LIBRARY})
        public @interface a {
        }

        private e() {
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f48339a = "hc";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f48340b = "h11";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f48341c = "h12";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f48342d = "h23";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f48343e = "h24";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f48344f = "";

        @Retention(RetentionPolicy.SOURCE)
        @b1({b1.a.LIBRARY})
        public @interface a {
        }

        private f() {
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f48345a = "mu";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f48346b = "celsius";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f48347c = "fahrenhe";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f48348d = "kelvin";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f48349e = "";

        @Retention(RetentionPolicy.SOURCE)
        @b1({b1.a.LIBRARY})
        public @interface a {
        }

        private g() {
        }
    }

    private j() {
    }

    private static String a(@NonNull Locale locale) {
        return p(java.util.Calendar.getInstance(locale).getFirstDayOfWeek());
    }

    private static String b(@NonNull Locale locale) {
        return android.text.format.DateFormat.getBestDateTimePattern(locale, "jm").contains("H") ? f.f48342d : f.f48341c;
    }

    @NonNull
    public static String c() {
        return f(true);
    }

    @NonNull
    public static String d(@NonNull Locale locale) {
        return e(locale, true);
    }

    @NonNull
    public static String e(@NonNull Locale locale, boolean z10) {
        String strV = v("ca", "", locale, z10);
        return strV != null ? strV : b.a(locale);
    }

    @NonNull
    public static String f(boolean z10) {
        return e(b.b(), z10);
    }

    private static Locale g() {
        return Locale.getDefault();
    }

    @NonNull
    public static String h() {
        return k(true);
    }

    @NonNull
    public static String i(@NonNull Locale locale) {
        return j(locale, true);
    }

    @NonNull
    public static String j(@NonNull Locale locale, boolean z10) {
        String strV = v("fw", "", locale, z10);
        return strV != null ? strV : a(locale);
    }

    @NonNull
    public static String k(boolean z10) {
        return j(b.b(), z10);
    }

    @NonNull
    public static String l() {
        return o(true);
    }

    @NonNull
    public static String m(@NonNull Locale locale) {
        return n(locale, true);
    }

    @NonNull
    public static String n(@NonNull Locale locale, boolean z10) {
        String strV = v("hc", "", locale, z10);
        if (strV != null) {
            return strV;
        }
        return Build.VERSION.SDK_INT >= 33 ? c.a(locale) : b(locale);
    }

    @NonNull
    public static String o(boolean z10) {
        return n(b.b(), z10);
    }

    private static String p(int i10) {
        return (i10 < 1 || i10 > 7) ? "" : new String[]{e.f48331b, e.f48332c, e.f48333d, e.f48334e, e.f48335f, e.f48336g, e.f48337h}[i10 - 1];
    }

    private static String q(Locale locale) {
        return Arrays.binarySearch(f48315b, locale.getCountry()) >= 0 ? g.f48347c : g.f48346b;
    }

    @NonNull
    public static String r() {
        return u(true);
    }

    @NonNull
    public static String s(@NonNull Locale locale) {
        return t(locale, true);
    }

    @NonNull
    public static String t(@NonNull Locale locale, boolean z10) {
        String strV = v("mu", "", locale, z10);
        if (strV != null) {
            return strV;
        }
        return Build.VERSION.SDK_INT >= 33 ? c.c(locale) : q(locale);
    }

    @NonNull
    public static String u(boolean z10) {
        return t(b.b(), z10);
    }

    private static String v(String str, String str2, Locale locale, boolean z10) {
        String unicodeLocaleType = locale.getUnicodeLocaleType(str);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (z10) {
            return null;
        }
        return str2;
    }
}
