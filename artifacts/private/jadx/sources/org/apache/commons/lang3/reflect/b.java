package org.apache.commons.lang3.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.c0;
import org.apache.commons.lang3.m;
import org.apache.commons.lang3.z;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static void A(Object obj, String str, Object obj2) throws IllegalAccessException {
        B(obj, str, obj2, false);
    }

    public static void B(Object obj, String str, Object obj2, boolean z10) throws IllegalAccessException {
        c0.v(obj != null, "target object must not be null", new Object[0]);
        Class<?> cls = obj.getClass();
        Field fieldF = f(cls, str, z10);
        c0.v(fieldF != null, "Cannot locate declared field %s.%s", cls.getName(), str);
        D(fieldF, obj, obj2, false);
    }

    public static void C(Field field, Object obj, Object obj2) throws IllegalAccessException {
        D(field, obj, obj2, false);
    }

    public static void D(Field field, Object obj, Object obj2, boolean z10) throws IllegalAccessException {
        c0.v(field != null, "The field must not be null", new Object[0]);
        if (!z10 || field.isAccessible()) {
            d.l(field);
        } else {
            field.setAccessible(true);
        }
        field.set(obj, obj2);
    }

    public static void E(Class<?> cls, String str, Object obj) throws IllegalAccessException {
        F(cls, str, obj, false);
    }

    public static void F(Class<?> cls, String str, Object obj, boolean z10) throws IllegalAccessException {
        Field fieldF = f(cls, str, z10);
        c0.v(fieldF != null, "Cannot locate field %s on %s", str, cls);
        H(fieldF, obj, false);
    }

    public static void G(Field field, Object obj) throws IllegalAccessException {
        H(field, obj, false);
    }

    public static void H(Field field, Object obj, boolean z10) throws IllegalAccessException {
        c0.v(field != null, "The field must not be null", new Object[0]);
        c0.v(Modifier.isStatic(field.getModifiers()), "The field %s.%s is not static", field.getDeclaringClass().getName(), field.getName());
        D(field, null, obj, z10);
    }

    public static Field[] a(Class<?> cls) {
        List<Field> listB = b(cls);
        return (Field[]) listB.toArray(new Field[listB.size()]);
    }

    public static List<Field> b(Class<?> cls) {
        c0.v(cls != null, "The class must not be null", new Object[0]);
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            Collections.addAll(arrayList, cls.getDeclaredFields());
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    public static Field c(Class<?> cls, String str) {
        return d(cls, str, false);
    }

    public static Field d(Class<?> cls, String str, boolean z10) {
        c0.v(cls != null, "The class must not be null", new Object[0]);
        c0.v(z.E0(str), "The field name must not be blank/empty", new Object[0]);
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (d.g(declaredField)) {
                return declaredField;
            }
            if (!z10) {
                return null;
            }
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static Field e(Class<?> cls, String str) {
        Field fieldF = f(cls, str, false);
        d.l(fieldF);
        return fieldF;
    }

    public static Field f(Class<?> cls, String str, boolean z10) {
        c0.v(cls != null, "The class must not be null", new Object[0]);
        c0.v(z.E0(str), "The field name must not be blank/empty", new Object[0]);
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!Modifier.isPublic(declaredField.getModifiers())) {
                    if (z10) {
                        declaredField.setAccessible(true);
                    } else {
                        continue;
                    }
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        Iterator<Class<?>> it = m.e(cls).iterator();
        Field field = null;
        while (it.hasNext()) {
            try {
                Field field2 = it.next().getField(str);
                c0.v(field == null, "Reference to field %s is ambiguous relative to %s; a matching field exists on two or more implemented interfaces.", str, cls);
                field = field2;
            } catch (NoSuchFieldException unused2) {
            }
        }
        return field;
    }

    public static List<Field> g(Class<?> cls, Class<? extends Annotation> cls2) {
        boolean z10;
        if (cls2 != null) {
            z10 = true;
            int i10 = 7 & 1;
        } else {
            z10 = false;
        }
        c0.v(z10, "The annotation class must not be null", new Object[0]);
        List<Field> listB = b(cls);
        ArrayList arrayList = new ArrayList();
        for (Field field : listB) {
            if (field.getAnnotation(cls2) != null) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    public static Field[] h(Class<?> cls, Class<? extends Annotation> cls2) {
        List<Field> listG = g(cls, cls2);
        return (Field[]) listG.toArray(new Field[listG.size()]);
    }

    public static Object i(Object obj, String str) throws IllegalAccessException {
        return j(obj, str, false);
    }

    public static Object j(Object obj, String str, boolean z10) throws IllegalAccessException {
        c0.v(obj != null, "target object must not be null", new Object[0]);
        Class<?> cls = obj.getClass();
        Field fieldD = d(cls, str, z10);
        c0.v(fieldD != null, "Cannot locate declared field %s.%s", cls, str);
        return p(fieldD, obj, false);
    }

    public static Object k(Class<?> cls, String str) throws IllegalAccessException {
        return l(cls, str, false);
    }

    public static Object l(Class<?> cls, String str, boolean z10) throws IllegalAccessException {
        Field fieldD = d(cls, str, z10);
        c0.v(fieldD != null, "Cannot locate declared field %s.%s", cls.getName(), str);
        return t(fieldD, false);
    }

    public static Object m(Object obj, String str) throws IllegalAccessException {
        return n(obj, str, false);
    }

    public static Object n(Object obj, String str, boolean z10) throws IllegalAccessException {
        c0.v(obj != null, "target object must not be null", new Object[0]);
        Class<?> cls = obj.getClass();
        Field fieldF = f(cls, str, z10);
        c0.v(fieldF != null, "Cannot locate field %s on %s", str, cls);
        return p(fieldF, obj, false);
    }

    public static Object o(Field field, Object obj) throws IllegalAccessException {
        return p(field, obj, false);
    }

    public static Object p(Field field, Object obj, boolean z10) throws IllegalAccessException {
        c0.v(field != null, "The field must not be null", new Object[0]);
        if (!z10 || field.isAccessible()) {
            d.l(field);
        } else {
            field.setAccessible(true);
        }
        return field.get(obj);
    }

    public static Object q(Class<?> cls, String str) throws IllegalAccessException {
        return r(cls, str, false);
    }

    public static Object r(Class<?> cls, String str, boolean z10) throws IllegalAccessException {
        Field fieldF = f(cls, str, z10);
        c0.v(fieldF != null, "Cannot locate field '%s' on %s", str, cls);
        return t(fieldF, false);
    }

    public static Object s(Field field) throws IllegalAccessException {
        return t(field, false);
    }

    public static Object t(Field field, boolean z10) throws IllegalAccessException {
        c0.v(field != null, "The field must not be null", new Object[0]);
        c0.v(Modifier.isStatic(field.getModifiers()), "The field '%s' is not static", field.getName());
        return p(field, null, z10);
    }

    public static void u(Field field) {
        v(field, true);
    }

    public static void v(Field field, boolean z10) {
        c0.v(field != null, "The field must not be null", new Object[0]);
        try {
            if (Modifier.isFinal(field.getModifiers())) {
                Field declaredField = Field.class.getDeclaredField("modifiers");
                boolean z11 = z10 && !declaredField.isAccessible();
                if (z11) {
                    declaredField.setAccessible(true);
                }
                try {
                    declaredField.setInt(field, field.getModifiers() & (-17));
                    if (z11) {
                        declaredField.setAccessible(false);
                    }
                } catch (Throwable th2) {
                    if (z11) {
                        declaredField.setAccessible(false);
                    }
                    throw th2;
                }
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    public static void w(Object obj, String str, Object obj2) throws IllegalAccessException {
        x(obj, str, obj2, false);
    }

    public static void x(Object obj, String str, Object obj2, boolean z10) throws IllegalAccessException {
        c0.v(obj != null, "target object must not be null", new Object[0]);
        Class<?> cls = obj.getClass();
        Field fieldD = d(cls, str, z10);
        c0.v(fieldD != null, "Cannot locate declared field %s.%s", cls.getName(), str);
        D(fieldD, obj, obj2, false);
    }

    public static void y(Class<?> cls, String str, Object obj) throws IllegalAccessException {
        z(cls, str, obj, false);
    }

    public static void z(Class<?> cls, String str, Object obj, boolean z10) throws IllegalAccessException {
        Field fieldD = d(cls, str, z10);
        c0.v(fieldD != null, "Cannot locate declared field %s.%s", cls.getName(), str);
        D(fieldD, null, obj, false);
    }
}
