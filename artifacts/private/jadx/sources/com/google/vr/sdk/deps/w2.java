package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f129638a = d();

    public static x2 a() {
        if (f129638a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return x2.f129666d;
    }

    private static final x2 b(String str) throws Exception {
        return (x2) f129638a.getDeclaredMethod(str, null).invoke(null, null);
    }

    static x2 c() {
        x2 x2VarB;
        if (f129638a != null) {
            try {
                x2VarB = b("loadGeneratedRegistry");
            } catch (Exception unused) {
                x2VarB = null;
            }
        } else {
            x2VarB = null;
        }
        if (x2VarB == null) {
            x2VarB = x2.d();
        }
        return x2VarB == null ? a() : x2VarB;
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
