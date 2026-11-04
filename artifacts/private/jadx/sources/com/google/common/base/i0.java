package com.google.common.base;

import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b(emulated = true)
@k
final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h0 f116553a = e();

    private static final class b implements h0 {
        private b() {
        }

        @Override // com.google.common.base.h0
        public h a(String pattern) {
            return new z(Pattern.compile(pattern));
        }

        @Override // com.google.common.base.h0
        public boolean b() {
            return true;
        }
    }

    private i0() {
    }

    static h a(String pattern) {
        j0.E(pattern);
        return f116553a.a(pattern);
    }

    @fj.a
    static String b(@fj.a String string) {
        if (i(string)) {
            string = null;
        }
        return string;
    }

    static String c(double value) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(value));
    }

    static <T extends Enum<T>> e0<T> d(Class<T> enumClass, String value) {
        WeakReference<? extends Enum<?>> weakReference = l.a(enumClass).get(value);
        return weakReference == null ? e0.a() : e0.c(enumClass.cast(weakReference.get()));
    }

    private static h0 e() {
        return new b();
    }

    static String f(@fj.a String string) {
        if (string == null) {
            string = "";
        }
        return string;
    }

    static boolean g() {
        return f116553a.b();
    }

    static e h(e matcher) {
        return matcher.K();
    }

    static boolean i(@fj.a String string) {
        return string == null || string.isEmpty();
    }
}
