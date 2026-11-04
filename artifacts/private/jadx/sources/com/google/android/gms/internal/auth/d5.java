package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c5 f107619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c5 f107620b;

    static {
        c5 c5Var = null;
        try {
            c5Var = (c5) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f107619a = c5Var;
        f107620b = new c5();
    }

    static c5 a() {
        return f107619a;
    }

    static c5 b() {
        return f107620b;
    }
}
