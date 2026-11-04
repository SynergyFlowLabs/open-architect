package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@y
final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w0<?> f126516a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final w0<?> f126517b = c();

    y0() {
    }

    static w0<?> a() {
        w0<?> w0Var = f126517b;
        if (w0Var != null) {
            return w0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static w0<?> b() {
        return f126516a;
    }

    private static w0<?> c() {
        try {
            return (w0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
