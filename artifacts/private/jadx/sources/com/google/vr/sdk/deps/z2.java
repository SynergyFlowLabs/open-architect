package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y2<?> f129711a = new y2<>((byte) 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final y2<?> f129712b = c();

    static y2<?> a() {
        return f129711a;
    }

    static y2<?> b() {
        y2<?> y2Var = f129712b;
        if (y2Var != null) {
            return y2Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static y2<?> c() {
        try {
            return (y2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
