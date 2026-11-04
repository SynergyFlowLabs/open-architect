package org.apache.commons.lang3.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.apache.commons.lang3.m;

/* JADX INFO: loaded from: classes14.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f337253a = 7;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f337254b = {Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};

    d() {
    }

    static int a(Constructor<?> constructor, Constructor<?> constructor2, Class<?>[] clsArr) {
        return c(a.e(constructor), a.e(constructor2), clsArr);
    }

    static int b(Method method, Method method2, Class<?>[] clsArr) {
        return c(a.f(method), a.f(method2), clsArr);
    }

    private static int c(a aVar, a aVar2, Class<?>[] clsArr) {
        float f10 = f(clsArr, aVar);
        float f11 = f(clsArr, aVar2);
        if (f10 >= f11) {
            return f11 < f10 ? 1 : 0;
        }
        int i10 = 2 ^ (-1);
        return -1;
    }

    private static float d(Class<?> cls, Class<?> cls2) {
        if (cls2.isPrimitive()) {
            return e(cls, cls2);
        }
        float f10 = 0.0f;
        while (cls != null && !cls2.equals(cls)) {
            if (cls2.isInterface() && m.N(cls, cls2)) {
                f10 += 0.25f;
                break;
            }
            f10 += 1.0f;
            cls = cls.getSuperclass();
        }
        if (cls == null) {
            f10 += 1.5f;
        }
        return f10;
    }

    private static float e(Class<?> cls, Class<?> cls2) {
        float f10;
        if (cls.isPrimitive()) {
            f10 = 0.0f;
        } else {
            cls = m.Y(cls);
            f10 = 0.1f;
        }
        int i10 = 0;
        while (cls != cls2) {
            Class<?>[] clsArr = f337254b;
            if (i10 >= clsArr.length) {
                break;
            }
            if (cls == clsArr[i10]) {
                f10 += 0.1f;
                if (i10 < clsArr.length - 1) {
                    cls = clsArr[i10 + 1];
                }
            }
            i10++;
        }
        return f10;
    }

    private static float f(Class<?>[] clsArr, a aVar) {
        float fD;
        Class<?>[] clsArrC = aVar.c();
        boolean zD = aVar.d();
        int length = clsArrC.length;
        if (zD) {
            length--;
        }
        long j10 = length;
        if (clsArr.length < j10) {
            return Float.MAX_VALUE;
        }
        boolean z10 = false;
        float fD2 = 0.0f;
        for (int i10 = 0; i10 < j10; i10++) {
            fD2 += d(clsArr[i10], clsArrC[i10]);
        }
        if (zD) {
            boolean z11 = clsArr.length < clsArrC.length;
            if (clsArr.length == clsArrC.length && clsArr[clsArr.length - 1].isArray()) {
                z10 = true;
            }
            Class<?> componentType = clsArrC[clsArrC.length - 1].getComponentType();
            if (z11) {
                fD = d(componentType, Object.class);
            } else if (z10) {
                fD = d(clsArr[clsArr.length - 1].getComponentType(), componentType);
            } else {
                for (int length2 = clsArrC.length - 1; length2 < clsArr.length; length2++) {
                    fD2 += d(clsArr[length2], componentType) + 0.001f;
                }
            }
            return fD2 + fD + 0.001f;
        }
        return fD2;
    }

    static boolean g(Member member) {
        return (member == null || !Modifier.isPublic(member.getModifiers()) || member.isSynthetic()) ? false : true;
    }

    static boolean h(Constructor<?> constructor, Class<?>[] clsArr) {
        return i(a.e(constructor), clsArr);
    }

    private static boolean i(a aVar, Class<?>[] clsArr) {
        Class<?>[] clsArrC = aVar.c();
        if (m.Q(clsArr, clsArrC, true)) {
            return true;
        }
        if (!aVar.d()) {
            return false;
        }
        int i10 = 0;
        while (i10 < clsArrC.length - 1 && i10 < clsArr.length) {
            if (!m.O(clsArr[i10], clsArrC[i10], true)) {
                return false;
            }
            i10++;
        }
        Class<?> componentType = clsArrC[clsArrC.length - 1].getComponentType();
        while (i10 < clsArr.length) {
            if (!m.O(clsArr[i10], componentType, true)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    static boolean j(Method method, Class<?>[] clsArr) {
        return i(a.f(method), clsArr);
    }

    static boolean k(int i10) {
        return (i10 & 7) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean l(AccessibleObject accessibleObject) {
        if (accessibleObject != 0 && !accessibleObject.isAccessible()) {
            Member member = (Member) accessibleObject;
            if (!accessibleObject.isAccessible() && Modifier.isPublic(member.getModifiers()) && k(member.getDeclaringClass().getModifiers())) {
                try {
                    accessibleObject.setAccessible(true);
                    return true;
                } catch (SecurityException unused) {
                }
            }
        }
        return false;
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?>[] f337255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f337256b;

        private a(Method method) {
            this.f337255a = method.getParameterTypes();
            this.f337256b = method.isVarArgs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a e(Constructor<?> constructor) {
            return new a(constructor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a f(Method method) {
            return new a(method);
        }

        public Class<?>[] c() {
            return this.f337255a;
        }

        public boolean d() {
            return this.f337256b;
        }

        private a(Constructor<?> constructor) {
            this.f337255a = constructor.getParameterTypes();
            this.f337256b = constructor.isVarArgs();
        }
    }
}
