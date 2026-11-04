package com.badlogic.gdx.utils.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static Class a(String str) throws g {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new g("Class not found: " + str, e10);
        }
    }

    public static d b(Class cls, Class... clsArr) throws g {
        try {
            return new d(cls.getConstructor(clsArr));
        } catch (NoSuchMethodException e10) {
            throw new g("Constructor not found for class: " + cls.getName(), e10);
        } catch (SecurityException e11) {
            throw new g("Security violation occurred while getting constructor for class: '" + cls.getName() + "'.", e11);
        }
    }

    public static d[] c(Class cls) {
        Constructor<?>[] constructors = cls.getConstructors();
        d[] dVarArr = new d[constructors.length];
        int length = constructors.length;
        for (int i10 = 0; i10 < length; i10++) {
            dVarArr[i10] = new d(constructors[i10]);
        }
        return dVarArr;
    }

    public static a d(Class cls, Class<? extends Annotation> cls2) {
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            if (annotation.annotationType().equals(cls2)) {
                return new a(annotation);
            }
        }
        return null;
    }

    public static a[] e(Class cls) {
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        a[] aVarArr = new a[declaredAnnotations.length];
        for (int i10 = 0; i10 < declaredAnnotations.length; i10++) {
            aVarArr[i10] = new a(declaredAnnotations[i10]);
        }
        return aVarArr;
    }

    public static d f(Class cls, Class... clsArr) throws g {
        try {
            return new d(cls.getDeclaredConstructor(clsArr));
        } catch (NoSuchMethodException e10) {
            throw new g("Constructor not found for class: " + cls.getName(), e10);
        } catch (SecurityException e11) {
            throw new g("Security violation while getting constructor for class: " + cls.getName(), e11);
        }
    }

    public static e g(Class cls, String str) throws g {
        try {
            return new e(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new g("Field not found: " + str + ", for class: " + cls.getName(), e10);
        } catch (SecurityException e11) {
            throw new g("Security violation while getting field: " + str + ", for class: " + cls.getName(), e11);
        }
    }

    public static e[] h(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        e[] eVarArr = new e[declaredFields.length];
        int length = declaredFields.length;
        for (int i10 = 0; i10 < length; i10++) {
            eVarArr[i10] = new e(declaredFields[i10]);
        }
        return eVarArr;
    }

    public static f i(Class cls, String str, Class... clsArr) throws g {
        try {
            return new f(cls.getDeclaredMethod(str, clsArr));
        } catch (NoSuchMethodException e10) {
            throw new g("Method not found: " + str + ", for class: " + cls.getName(), e10);
        } catch (SecurityException e11) {
            throw new g("Security violation while getting method: " + str + ", for class: " + cls.getName(), e11);
        }
    }

    public static f[] j(Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        f[] fVarArr = new f[declaredMethods.length];
        int length = declaredMethods.length;
        for (int i10 = 0; i10 < length; i10++) {
            fVarArr[i10] = new f(declaredMethods[i10]);
        }
        return fVarArr;
    }

    public static e k(Class cls, String str) throws g {
        try {
            return new e(cls.getField(str));
        } catch (NoSuchFieldException e10) {
            throw new g("Field not found: " + str + ", for class: " + cls.getName(), e10);
        } catch (SecurityException e11) {
            throw new g("Security violation while getting field: " + str + ", for class: " + cls.getName(), e11);
        }
    }

    public static e[] l(Class cls) {
        Field[] fields = cls.getFields();
        e[] eVarArr = new e[fields.length];
        int length = fields.length;
        for (int i10 = 0; i10 < length; i10++) {
            eVarArr[i10] = new e(fields[i10]);
        }
        return eVarArr;
    }

    public static f m(Class cls, String str, Class... clsArr) throws g {
        try {
            return new f(cls.getMethod(str, clsArr));
        } catch (NoSuchMethodException e10) {
            throw new g("Method not found: " + str + ", for class: " + cls.getName(), e10);
        } catch (SecurityException e11) {
            throw new g("Security violation while getting method: " + str + ", for class: " + cls.getName(), e11);
        }
    }

    public static f[] n(Class cls) {
        Method[] methods = cls.getMethods();
        f[] fVarArr = new f[methods.length];
        int length = methods.length;
        for (int i10 = 0; i10 < length; i10++) {
            fVarArr[i10] = new f(methods[i10]);
        }
        return fVarArr;
    }

    public static String o(Class cls) {
        return cls.getSimpleName();
    }

    public static boolean p(Class cls, Class<? extends Annotation> cls2) {
        return cls.isAnnotationPresent(cls2);
    }

    public static boolean q(Class cls) {
        return cls.isArray();
    }

    public static boolean r(Class cls, Class cls2) {
        return cls.isAssignableFrom(cls2);
    }

    public static boolean s(Class cls, Object obj) {
        return cls.isInstance(obj);
    }

    public static boolean t(Class cls) {
        return cls.isMemberClass();
    }

    public static boolean u(Class cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static <T> T v(Class<T> cls) throws g {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e10) {
            throw new g("Could not instantiate instance of class: " + cls.getName(), e10);
        } catch (InstantiationException e11) {
            throw new g("Could not instantiate instance of class: " + cls.getName(), e11);
        }
    }
}
