package org.apache.commons.lang3.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.lang3.c0;
import org.apache.commons.lang3.m;

/* JADX INFO: loaded from: classes14.dex */
public class e {
    public static Object A(Class<?> cls, String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object[] objArrW1 = org.apache.commons.lang3.c.W1(objArr);
        return B(cls, str, objArrW1, m.X(objArrW1));
    }

    public static Object B(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object[] objArrW1 = org.apache.commons.lang3.c.W1(objArr);
        Method methodH = h(cls, str, org.apache.commons.lang3.c.R1(clsArr));
        if (methodH != null) {
            return methodH.invoke(null, C(methodH, objArrW1));
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on class: " + cls.getName());
    }

    private static Object[] C(Method method, Object[] objArr) {
        return method.isVarArgs() ? o(objArr, method.getParameterTypes()) : objArr;
    }

    private static int a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (!m.Q(clsArr, clsArr2, true)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < clsArr.length; i11++) {
            if (!clsArr[i11].equals(clsArr2[i11])) {
                i10 = (!m.O(clsArr[i11], clsArr2[i11], true) || m.O(clsArr[i11], clsArr2[i11], false)) ? i10 + 2 : i10 + 1;
            }
        }
        return i10;
    }

    public static Method b(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return c(cls.getMethod(str, clsArr));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method c(Method method) {
        if (!d.g(method)) {
            return null;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        if (Modifier.isPublic(declaringClass.getModifiers())) {
            return method;
        }
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method methodD = d(declaringClass, name, parameterTypes);
        return methodD == null ? e(declaringClass, name, parameterTypes) : methodD;
    }

    private static Method d(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (Modifier.isPublic(cls2.getModifiers())) {
                    try {
                        return cls2.getDeclaredMethod(str, clsArr);
                    } catch (NoSuchMethodException unused) {
                        Method methodD = d(cls2, str, clsArr);
                        if (methodD != null) {
                            return methodD;
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    private static Method e(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (Modifier.isPublic(superclass.getModifiers())) {
                try {
                    return superclass.getMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    private static List<Class<?>> f(Class<?> cls) {
        int i10;
        Class<?> cls2;
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<Class<?>> listG = m.g(cls);
        List<Class<?>> listE = m.e(cls);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= listE.size() && i12 >= listG.size()) {
                return arrayList;
            }
            if (i11 >= listE.size()) {
                i10 = i12 + 1;
                cls2 = listG.get(i12);
            } else if (i12 < listG.size() && i11 >= i12 && i12 < i11) {
                i10 = i12 + 1;
                cls2 = listG.get(i12);
            } else {
                int i13 = i11 + 1;
                Class<?> cls3 = listE.get(i11);
                int i14 = i12;
                cls2 = cls3;
                i11 = i13;
                i10 = i14;
            }
            arrayList.add(cls2);
            i12 = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.annotation.Annotation] */
    /* JADX WARN: Type inference failed for: r0v3, types: [A extends java.lang.annotation.Annotation] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.annotation.Annotation] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static <A extends Annotation> A g(Method method, Class<A> cls, boolean z10, boolean z11) {
        c0.v(method != null, "The method must not be null", new Object[0]);
        c0.v(cls != null, "The annotation class must not be null", new Object[0]);
        if (!z11 && !d.g(method)) {
            return null;
        }
        ?? method2 = (A) method.getAnnotation(cls);
        if (method2 == 0 && z10) {
            for (Class<?> cls2 : f(method.getDeclaringClass())) {
                if (z11) {
                    try {
                        method2 = (A) cls2.getDeclaredMethod(method.getName(), method.getParameterTypes());
                    } catch (NoSuchMethodException unused) {
                        continue;
                    }
                } else {
                    method2 = cls2.getMethod(method.getName(), method.getParameterTypes());
                }
                method2 = (A) method2.getAnnotation(cls);
                if (method2 != 0) {
                    break;
                }
            }
        }
        return (A) method2;
    }

    public static Method h(Class<?> cls, String str, Class<?>... clsArr) {
        Method methodC;
        try {
            Method method = cls.getMethod(str, clsArr);
            d.l(method);
            return method;
        } catch (NoSuchMethodException unused) {
            Method method2 = null;
            for (Method method3 : cls.getMethods()) {
                if (method3.getName().equals(str) && d.j(method3, clsArr) && (methodC = c(method3)) != null && (method2 == null || d.b(methodC, method2, clsArr) < 0)) {
                    method2 = methodC;
                }
            }
            if (method2 != null) {
                d.l(method2);
            }
            if (method2 != null && method2.isVarArgs() && method2.getParameterTypes().length > 0 && clsArr.length > 0) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                String name = m.U(parameterTypes[parameterTypes.length - 1].getComponentType()).getName();
                String name2 = clsArr[clsArr.length - 1].getName();
                String name3 = clsArr[clsArr.length - 1].getSuperclass().getName();
                if (!name.equals(name2) && !name.equals(name3)) {
                    return null;
                }
            }
            return method2;
        }
    }

    public static Method i(Class<?> cls, String str, Class<?>... clsArr) {
        c0.P(cls, "Null class not allowed.", new Object[0]);
        c0.F(str, "Null or blank methodName not allowed.", new Object[0]);
        Method[] declaredMethods = cls.getDeclaredMethods();
        Iterator<Class<?>> it = m.g(cls).iterator();
        while (it.hasNext()) {
            declaredMethods = (Method[]) org.apache.commons.lang3.c.z(declaredMethods, it.next().getDeclaredMethods());
        }
        Method method = null;
        for (Method method2 : declaredMethods) {
            if (str.equals(method2.getName()) && Objects.deepEquals(clsArr, method2.getParameterTypes())) {
                return method2;
            }
            if (str.equals(method2.getName())) {
                int i10 = 2 << 1;
                if (m.Q(clsArr, method2.getParameterTypes(), true) && (method == null || a(clsArr, method2.getParameterTypes()) < a(clsArr, method.getParameterTypes()))) {
                    method = method2;
                }
            }
        }
        return method;
    }

    public static List<Method> j(Class<?> cls, Class<? extends Annotation> cls2) {
        return k(cls, cls2, false, false);
    }

    public static List<Method> k(Class<?> cls, Class<? extends Annotation> cls2, boolean z10, boolean z11) {
        c0.v(cls != null, "The class must not be null", new Object[0]);
        c0.v(cls2 != null, "The annotation class must not be null", new Object[0]);
        List<Class> listF = z10 ? f(cls) : new ArrayList();
        listF.add(0, cls);
        ArrayList arrayList = new ArrayList();
        for (Class cls3 : listF) {
            for (Method method : z11 ? cls3.getDeclaredMethods() : cls3.getMethods()) {
                if (method.getAnnotation(cls2) != null) {
                    arrayList.add(method);
                }
            }
        }
        return arrayList;
    }

    public static Method[] l(Class<?> cls, Class<? extends Annotation> cls2) {
        return m(cls, cls2, false, false);
    }

    public static Method[] m(Class<?> cls, Class<? extends Annotation> cls2, boolean z10, boolean z11) {
        List<Method> listK = k(cls, cls2, z10, z11);
        return (Method[]) listK.toArray(new Method[listK.size()]);
    }

    public static Set<Method> n(Method method, m.c cVar) {
        c0.O(method);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(method);
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?> declaringClass = method.getDeclaringClass();
        Iterator<Class<?>> it = m.M(declaringClass, cVar).iterator();
        it.next();
        while (it.hasNext()) {
            Method methodH = h(it.next(), method.getName(), parameterTypes);
            if (methodH != null) {
                if (!Arrays.equals(methodH.getParameterTypes(), parameterTypes)) {
                    Map<TypeVariable<?>, Type> mapC = g.C(declaringClass, methodH.getDeclaringClass());
                    int i10 = 0;
                    boolean z10 = false;
                    while (true) {
                        if (i10 >= parameterTypes.length) {
                            linkedHashSet.add(methodH);
                            break;
                        }
                        if (!g.l(g.c0(mapC, method.getGenericParameterTypes()[i10]), g.c0(mapC, methodH.getGenericParameterTypes()[i10]))) {
                            break;
                        }
                        i10++;
                    }
                } else {
                    linkedHashSet.add(methodH);
                }
            }
        }
        return linkedHashSet;
    }

    static Object[] o(Object[] objArr, Class<?>[] clsArr) {
        if (objArr.length == clsArr.length && objArr[objArr.length - 1].getClass().equals(clsArr[clsArr.length - 1])) {
            return objArr;
        }
        Object[] objArr2 = new Object[clsArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, clsArr.length - 1);
        Class<?> componentType = clsArr[clsArr.length - 1].getComponentType();
        int length = (objArr.length - clsArr.length) + 1;
        Object objNewInstance = Array.newInstance(m.U(componentType), length);
        System.arraycopy(objArr, clsArr.length - 1, objNewInstance, 0, length);
        if (componentType.isPrimitive()) {
            objNewInstance = org.apache.commons.lang3.c.L4(objNewInstance);
        }
        objArr2[clsArr.length - 1] = objNewInstance;
        return objArr2;
    }

    public static Object p(Object obj, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return r(obj, str, org.apache.commons.lang3.c.f337035a, null);
    }

    public static Object q(Object obj, String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object[] objArrW1 = org.apache.commons.lang3.c.W1(objArr);
        return r(obj, str, objArrW1, m.X(objArrW1));
    }

    public static Object r(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object[] objArrW1 = org.apache.commons.lang3.c.W1(objArr);
        Method methodB = b(obj.getClass(), str, org.apache.commons.lang3.c.R1(clsArr));
        if (methodB != null) {
            return methodB.invoke(obj, objArrW1);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on object: " + obj.getClass().getName());
    }

    public static Object s(Class<?> cls, String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object[] objArrW1 = org.apache.commons.lang3.c.W1(objArr);
        return t(cls, str, objArrW1, m.X(objArrW1));
    }

    public static Object t(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object[] objArrW1 = org.apache.commons.lang3.c.W1(objArr);
        Method methodB = b(cls, str, org.apache.commons.lang3.c.R1(clsArr));
        if (methodB != null) {
            return methodB.invoke(null, objArrW1);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on class: " + cls.getName());
    }

    public static Object u(Object obj, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return w(obj, str, org.apache.commons.lang3.c.f337035a, null);
    }

    public static Object v(Object obj, String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object[] objArrW1 = org.apache.commons.lang3.c.W1(objArr);
        return w(obj, str, objArrW1, m.X(objArrW1));
    }

    public static Object w(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return z(obj, false, str, objArr, clsArr);
    }

    public static Object x(Object obj, boolean z10, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return z(obj, z10, str, org.apache.commons.lang3.c.f337035a, null);
    }

    public static Object y(Object obj, boolean z10, String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object[] objArrW1 = org.apache.commons.lang3.c.W1(objArr);
        return z(obj, z10, str, objArrW1, m.X(objArrW1));
    }

    public static Object z(Object obj, boolean z10, String str, Object[] objArr, Class<?>[] clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method methodH;
        String str2;
        Class<?>[] clsArrR1 = org.apache.commons.lang3.c.R1(clsArr);
        Object[] objArrW1 = org.apache.commons.lang3.c.W1(objArr);
        if (z10) {
            methodH = i(obj.getClass(), str, clsArrR1);
            if (methodH != null && !methodH.isAccessible()) {
                methodH.setAccessible(true);
            }
            str2 = "No such method: ";
        } else {
            methodH = h(obj.getClass(), str, clsArrR1);
            str2 = "No such accessible method: ";
        }
        if (methodH != null) {
            return methodH.invoke(obj, C(methodH, objArrW1));
        }
        throw new NoSuchMethodException(str2 + str + "() on object: " + obj.getClass().getName());
    }
}
