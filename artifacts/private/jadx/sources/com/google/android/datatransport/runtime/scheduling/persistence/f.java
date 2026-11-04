package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
@y5.e
public abstract class f {
    @y5.f
    @ij.b("SQLITE_DB_NAME")
    static String b() {
        return "com.google.android.datatransport.events";
    }

    @y5.f
    @ij.b("PACKAGE_NAME")
    @ij.f
    static String d(Context context) {
        return context.getPackageName();
    }

    @y5.f
    @ij.b("SCHEMA_VERSION")
    static int e() {
        return w0.f103798w;
    }

    @y5.f
    static e f() {
        return e.f103727f;
    }

    @y5.a
    abstract c a(n0 n0Var);

    @y5.a
    abstract d c(n0 n0Var);

    @y5.a
    abstract b6.b g(n0 n0Var);
}
