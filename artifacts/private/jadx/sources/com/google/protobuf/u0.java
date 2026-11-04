package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f126401a = "com.google.protobuf.ExtensionRegistry";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Class<?> f126402b = e();

    u0() {
    }

    public static v0 a() {
        v0 v0VarC = c("newInstance");
        return v0VarC != null ? v0VarC : new v0();
    }

    public static v0 b() {
        v0 v0VarC = c("getEmptyRegistry");
        return v0VarC != null ? v0VarC : v0.f126424f;
    }

    private static final v0 c(String methodName) {
        Class<?> cls = f126402b;
        if (cls == null) {
            return null;
        }
        try {
            return (v0) cls.getDeclaredMethod(methodName, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean d(v0 registry) {
        Class<?> cls = f126402b;
        return cls != null && cls.isAssignableFrom(registry.getClass());
    }

    static Class<?> e() {
        try {
            return Class.forName(f126401a);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
