package org.apache.commons.io;

import java.io.File;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final g f336486a = new g();

    @Deprecated
    public static synchronized void a() {
        try {
            f336486a.b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static g b() {
        return f336486a;
    }

    @Deprecated
    public static int c() {
        return f336486a.d();
    }

    @Deprecated
    public static void d(File file, Object obj) {
        f336486a.e(file, obj);
    }

    @Deprecated
    public static void e(File file, Object obj, h hVar) {
        f336486a.f(file, obj, hVar);
    }

    @Deprecated
    public static void f(String str, Object obj) {
        f336486a.g(str, obj);
    }

    @Deprecated
    public static void g(String str, Object obj, h hVar) {
        f336486a.h(str, obj, hVar);
    }
}
