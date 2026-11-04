package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.w0;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    @w0(21)
    static class a {
        private a() {
        }

        static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @w0(24)
    static class b {
        private b() {
        }

        static androidx.core.os.p a(Configuration configuration) {
            return androidx.core.os.p.c(configuration.getLocales().toLanguageTags());
        }
    }

    @w0(33)
    static class c {
        private c() {
        }

        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static LocaleList b(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    private q() {
    }

    @NonNull
    @androidx.annotation.d
    public static androidx.core.os.p a(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return androidx.core.os.p.c(j.b(context));
        }
        Object objC = c(context);
        return objC != null ? androidx.core.os.p.o(c.a(objC)) : androidx.core.os.p.g();
    }

    @l1
    static androidx.core.os.p b(Configuration configuration) {
        return b.a(configuration);
    }

    @w0(33)
    private static Object c(Context context) {
        return context.getSystemService("locale");
    }

    @NonNull
    @androidx.annotation.d
    public static androidx.core.os.p d(@NonNull Context context) {
        androidx.core.os.p pVarG = androidx.core.os.p.g();
        if (Build.VERSION.SDK_INT < 33) {
            return b(Resources.getSystem().getConfiguration());
        }
        Object objC = c(context);
        return objC != null ? androidx.core.os.p.o(c.b(objC)) : pVarG;
    }
}
