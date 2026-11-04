package com.google.api.client.repackaged.com.google.common.base;

import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@r7.b(emulated = true)
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f115908a = Logger.getLogger(p.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f115909b = d();

    private static final class b implements o {
        private b() {
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.o
        public e a(String str) {
            return new j(Pattern.compile(str));
        }
    }

    private p() {
    }

    static e a(String str) {
        q.E(str);
        return f115909b.a(str);
    }

    static String b(double d10) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d10));
    }

    static <T extends Enum<T>> n<T> c(Class<T> cls, String str) {
        WeakReference<? extends Enum<?>> weakReference = g.a(cls).get(str);
        return weakReference == null ? n.a() : n.f(cls.cast(weakReference.get()));
    }

    private static o d() {
        return new b();
    }

    private static void e(ServiceConfigurationError serviceConfigurationError) {
        f115908a.log(Level.WARNING, "Error loading regex compiler, falling back to next option", (Throwable) serviceConfigurationError);
    }

    static c f(c cVar) {
        return cVar.K();
    }

    static boolean g(@fj.h String str) {
        return str == null || str.isEmpty();
    }

    static long h() {
        return System.nanoTime();
    }

    static boolean i() {
        return f115909b instanceof b;
    }
}
