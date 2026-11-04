package com.badlogic.gdx.utils.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f95744a;

    f(Method method) {
        this.f95744a = method;
    }

    public a a(Class<? extends Annotation> cls) {
        Annotation[] declaredAnnotations = this.f95744a.getDeclaredAnnotations();
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

    public a[] b() {
        Annotation[] declaredAnnotations = this.f95744a.getDeclaredAnnotations();
        a[] aVarArr = new a[declaredAnnotations.length];
        for (int i10 = 0; i10 < declaredAnnotations.length; i10++) {
            aVarArr[i10] = new a(declaredAnnotations[i10]);
        }
        return aVarArr;
    }

    public Class c() {
        return this.f95744a.getDeclaringClass();
    }

    public String d() {
        return this.f95744a.getName();
    }

    public Class[] e() {
        return this.f95744a.getParameterTypes();
    }

    public Class f() {
        return this.f95744a.getReturnType();
    }

    public Object g(Object obj, Object... objArr) throws g {
        try {
            return this.f95744a.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new g("Illegal access to method: " + d(), e10);
        } catch (IllegalArgumentException e11) {
            throw new g("Illegal argument(s) supplied to method: " + d(), e11);
        } catch (InvocationTargetException e12) {
            throw new g("Exception occurred in method: " + d(), e12);
        }
    }

    public boolean h() {
        return Modifier.isAbstract(this.f95744a.getModifiers());
    }

    public boolean i() {
        return this.f95744a.isAccessible();
    }

    public boolean j(Class<? extends Annotation> cls) {
        return this.f95744a.isAnnotationPresent(cls);
    }

    public boolean k() {
        return (n() || o() || p()) ? false : true;
    }

    public boolean l() {
        return Modifier.isFinal(this.f95744a.getModifiers());
    }

    public boolean m() {
        return Modifier.isNative(this.f95744a.getModifiers());
    }

    public boolean n() {
        return Modifier.isPrivate(this.f95744a.getModifiers());
    }

    public boolean o() {
        return Modifier.isProtected(this.f95744a.getModifiers());
    }

    public boolean p() {
        return Modifier.isPublic(this.f95744a.getModifiers());
    }

    public boolean q() {
        return Modifier.isStatic(this.f95744a.getModifiers());
    }

    public boolean r() {
        return this.f95744a.isVarArgs();
    }

    public void s(boolean z10) {
        this.f95744a.setAccessible(z10);
    }
}
