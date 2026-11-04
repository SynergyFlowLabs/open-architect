package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r4 f107796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r4 f107797b;

    static {
        r4 r4Var = null;
        try {
            r4Var = (r4) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f107796a = r4Var;
        f107797b = new r4();
    }

    static r4 a() {
        return f107796a;
    }

    static r4 b() {
        return f107797b;
    }
}
