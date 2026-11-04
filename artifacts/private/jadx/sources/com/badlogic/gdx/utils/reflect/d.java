package com.badlogic.gdx.utils.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Constructor f95742a;

    d(Constructor constructor) {
        this.f95742a = constructor;
    }

    public Class a() {
        return this.f95742a.getDeclaringClass();
    }

    public Class[] b() {
        return this.f95742a.getParameterTypes();
    }

    public boolean c() {
        return this.f95742a.isAccessible();
    }

    public Object d(Object... objArr) throws g {
        try {
            return this.f95742a.newInstance(objArr);
        } catch (IllegalAccessException e10) {
            throw new g("Could not instantiate instance of class: " + a().getName(), e10);
        } catch (IllegalArgumentException e11) {
            throw new g("Illegal argument(s) supplied to constructor for class: " + a().getName(), e11);
        } catch (InstantiationException e12) {
            throw new g("Could not instantiate instance of class: " + a().getName(), e12);
        } catch (InvocationTargetException e13) {
            throw new g("Exception occurred in constructor for class: " + a().getName(), e13);
        }
    }

    public void e(boolean z10) {
        this.f95742a.setAccessible(z10);
    }
}
