package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class i0 {

    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f125486a;

        class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f125487b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f125487b = method;
            }

            @Override // com.google.gson.internal.i0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f125487b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* JADX INFO: renamed from: com.google.gson.internal.i0$b$b, reason: collision with other inner class name */
        class C1199b extends b {
            C1199b() {
                super();
            }

            @Override // com.google.gson.internal.i0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (z.d()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C1199b();
            }
            f125486a = aVar;
        }

        private b() {
        }

        abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    private i0() {
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f125486a.a(accessibleObject, obj);
    }

    public static com.google.gson.x.e b(List<com.google.gson.x> list, Class<?> cls) {
        Iterator<com.google.gson.x> it = list.iterator();
        while (it.hasNext()) {
            com.google.gson.x.e eVarA = it.next().a(cls);
            if (eVarA != com.google.gson.x.e.INDECISIVE) {
                return eVarA;
            }
        }
        return com.google.gson.x.e.ALLOW;
    }

    public static boolean c(Class<?> cls) {
        return d(cls.getName());
    }

    private static boolean d(String str) {
        if (!str.startsWith("android.") && !str.startsWith("androidx.") && !g(str)) {
            return false;
        }
        return true;
    }

    public static boolean e(Class<?> cls) {
        String name = cls.getName();
        return d(name) || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static boolean f(Class<?> cls) {
        return g(cls.getName());
    }

    private static boolean g(String str) {
        if (!str.startsWith("java.") && !str.startsWith("javax.")) {
            return false;
        }
        return true;
    }
}
