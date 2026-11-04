package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k3 f107710a = new l3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k3 f107711b;

    static {
        k3 k3Var = null;
        try {
            k3Var = (k3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f107711b = k3Var;
    }

    static k3 a() {
        k3 k3Var = f107711b;
        if (k3Var != null) {
            return k3Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static k3 b() {
        return f107710a;
    }
}
