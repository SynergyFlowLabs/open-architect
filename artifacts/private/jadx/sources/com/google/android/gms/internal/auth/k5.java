package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f107684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final z5 f107685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final z5 f107686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f107687d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        z5 z5Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f107684a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                z5Var = (z5) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f107685b = z5Var;
        f107686c = new c6();
    }

    public static z5 a() {
        return f107685b;
    }

    public static z5 b() {
        return f107686c;
    }

    static Object c(Object obj, int i10, int i11, Object obj2, z5 z5Var) {
        if (obj2 == null) {
            obj2 = z5Var.a(obj);
        }
        z5Var.d(obj2, i10, i11);
        return obj2;
    }

    static void d(z5 z5Var, Object obj, Object obj2) {
        z5Var.f(obj, z5Var.c(z5Var.b(obj), z5Var.b(obj2)));
    }

    public static void e(Class cls) {
        Class cls2;
        if (!t3.class.isAssignableFrom(cls) && (cls2 = f107684a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
