package androidx.core.text;

import android.icu.util.ULocale;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48247a = "ICUCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f48248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f48249c;

    @w0(21)
    static class a {
        private a() {
        }

        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    @w0(24)
    static class b {
        private b() {
        }

        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    private e() {
    }

    @e.a({"BanUncheckedReflection"})
    private static String a(Locale locale) {
        String string = locale.toString();
        try {
            Method method = f48249c;
            if (method != null) {
                return (String) method.invoke(null, string);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return string;
    }

    @e.a({"BanUncheckedReflection"})
    private static String b(String str) {
        try {
            Method method = f48248b;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    @p0
    public static String c(@NonNull Locale locale) {
        return b.c(b.a(b.b(locale)));
    }
}
