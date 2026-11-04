package com.badlogic.gdx.utils.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f95743a;

    e(Field field) {
        this.f95743a = field;
    }

    public Object a(Object obj) throws g {
        try {
            return this.f95743a.get(obj);
        } catch (IllegalAccessException e10) {
            throw new g("Illegal access to field: " + f(), e10);
        } catch (IllegalArgumentException e11) {
            throw new g("Object is not an instance of " + d(), e11);
        }
    }

    public a b(Class<? extends Annotation> cls) {
        Annotation[] declaredAnnotations = this.f95743a.getDeclaredAnnotations();
        if (declaredAnnotations == null) {
            return null;
        }
        for (Annotation annotation : declaredAnnotations) {
            if (annotation.annotationType().equals(cls)) {
                return new a(annotation);
            }
        }
        return null;
    }

    public a[] c() {
        Annotation[] declaredAnnotations = this.f95743a.getDeclaredAnnotations();
        a[] aVarArr = new a[declaredAnnotations.length];
        for (int i10 = 0; i10 < declaredAnnotations.length; i10++) {
            aVarArr[i10] = new a(declaredAnnotations[i10]);
        }
        return aVarArr;
    }

    public Class d() {
        return this.f95743a.getDeclaringClass();
    }

    public Class e(int i10) {
        Type genericType = this.f95743a.getGenericType();
        if (genericType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
            if (actualTypeArguments.length - 1 >= i10) {
                Type type = actualTypeArguments[i10];
                if (type instanceof Class) {
                    return (Class) type;
                }
                if (type instanceof ParameterizedType) {
                    return (Class) ((ParameterizedType) type).getRawType();
                }
                if (type instanceof GenericArrayType) {
                    Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                    if (genericComponentType instanceof Class) {
                        return b.c((Class) genericComponentType, 0).getClass();
                    }
                }
            }
        }
        return null;
    }

    public String f() {
        return this.f95743a.getName();
    }

    public Class g() {
        return this.f95743a.getType();
    }

    public boolean h() {
        return this.f95743a.isAccessible();
    }

    public boolean i(Class<? extends Annotation> cls) {
        return this.f95743a.isAnnotationPresent(cls);
    }

    public boolean j() {
        return (l() || m() || n()) ? false : true;
    }

    public boolean k() {
        return Modifier.isFinal(this.f95743a.getModifiers());
    }

    public boolean l() {
        return Modifier.isPrivate(this.f95743a.getModifiers());
    }

    public boolean m() {
        return Modifier.isProtected(this.f95743a.getModifiers());
    }

    public boolean n() {
        return Modifier.isPublic(this.f95743a.getModifiers());
    }

    public boolean o() {
        return Modifier.isStatic(this.f95743a.getModifiers());
    }

    public boolean p() {
        return this.f95743a.isSynthetic();
    }

    public boolean q() {
        return Modifier.isTransient(this.f95743a.getModifiers());
    }

    public boolean r() {
        return Modifier.isVolatile(this.f95743a.getModifiers());
    }

    public void s(Object obj, Object obj2) throws g {
        try {
            this.f95743a.set(obj, obj2);
        } catch (IllegalAccessException e10) {
            throw new g("Illegal access to field: " + f(), e10);
        } catch (IllegalArgumentException e11) {
            throw new g("Argument not valid for field: " + f(), e11);
        }
    }

    public void t(boolean z10) {
        this.f95743a.setAccessible(z10);
    }
}
