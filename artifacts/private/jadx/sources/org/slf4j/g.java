package org.slf4j;

import java.io.Closeable;
import java.util.Deque;
import java.util.Map;
import org.slf4j.helpers.l;
import org.slf4j.helpers.p;
import org.slf4j.spi.j;

/* JADX INFO: loaded from: classes14.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f339610a = "http://www.slf4j.org/codes.html#null_MDCA";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f339611b = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f339612c = "http://www.slf4j.org/codes.html#no_static_mdc_binder";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static org.slf4j.spi.g f339613d;

    public static class b implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f339614a;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            g.j(this.f339614a);
        }

        private b(String str) {
            this.f339614a = str;
        }
    }

    static {
        j jVarM = e.m();
        if (jVarM != null) {
            f339613d = jVarM.c();
            return;
        }
        p.b("Failed to find provider.");
        p.b("Defaulting to no-operation MDCAdapter implementation.");
        f339613d = new l();
    }

    private g() {
    }

    public static void a() {
        org.slf4j.spi.g gVar = f339613d;
        if (gVar == null) {
            throw new IllegalStateException(f339611b);
        }
        gVar.clear();
    }

    public static String b(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        org.slf4j.spi.g gVar = f339613d;
        if (gVar != null) {
            return gVar.get(str);
        }
        throw new IllegalStateException(f339611b);
    }

    public static Map<String, String> c() {
        org.slf4j.spi.g gVar = f339613d;
        if (gVar != null) {
            return gVar.d();
        }
        throw new IllegalStateException(f339611b);
    }

    public static org.slf4j.spi.g e() {
        return f339613d;
    }

    public static String f(String str) {
        org.slf4j.spi.g gVar = f339613d;
        if (gVar != null) {
            return gVar.b(str);
        }
        throw new IllegalStateException(f339611b);
    }

    public static void g(String str, String str2) {
        org.slf4j.spi.g gVar = f339613d;
        if (gVar == null) {
            throw new IllegalStateException(f339611b);
        }
        gVar.c(str, str2);
    }

    public static void h(String str, String str2) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        org.slf4j.spi.g gVar = f339613d;
        if (gVar == null) {
            throw new IllegalStateException(f339611b);
        }
        gVar.a(str, str2);
    }

    public static b i(String str, String str2) throws IllegalArgumentException {
        h(str, str2);
        return new b(str);
    }

    public static void j(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        org.slf4j.spi.g gVar = f339613d;
        if (gVar == null) {
            throw new IllegalStateException(f339611b);
        }
        gVar.remove(str);
    }

    public static void k(Map<String, String> map) {
        org.slf4j.spi.g gVar = f339613d;
        if (gVar == null) {
            throw new IllegalStateException(f339611b);
        }
        gVar.e(map);
    }

    public Deque<String> d(String str) {
        org.slf4j.spi.g gVar = f339613d;
        if (gVar != null) {
            return gVar.f(str);
        }
        throw new IllegalStateException(f339611b);
    }
}
