package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes3.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k0<Class, o0> f95732a = new k0<>();

    private q0() {
    }

    public static void a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object cannot be null.");
        }
        o0 o0VarP = f95732a.p(obj.getClass());
        if (o0VarP == null) {
            return;
        }
        o0VarP.b(obj);
    }

    public static void b(b bVar) {
        c(bVar, false);
    }

    public static void c(b bVar, boolean z10) {
        if (bVar == null) {
            throw new IllegalArgumentException("Objects cannot be null.");
        }
        int i10 = bVar.f95174b;
        o0 o0VarP = null;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = bVar.get(i11);
            if (obj != null && (o0VarP != null || (o0VarP = f95732a.p(obj.getClass())) != null)) {
                o0VarP.b(obj);
                if (!z10) {
                    o0VarP = null;
                }
            }
        }
    }

    public static <T> o0<T> d(Class<T> cls) {
        return e(cls, 100);
    }

    public static <T> o0<T> e(Class<T> cls, int i10) {
        k0<Class, o0> k0Var = f95732a;
        o0<T> o0VarP = k0Var.p(cls);
        if (o0VarP != null) {
            return o0VarP;
        }
        u0 u0Var = new u0(cls, 4, i10);
        k0Var.C(cls, u0Var);
        return u0Var;
    }

    public static <T> T f(Class<T> cls) {
        return (T) d(cls).f();
    }

    public static <T> void g(Class<T> cls, o0<T> o0Var) {
        f95732a.C(cls, o0Var);
    }
}
