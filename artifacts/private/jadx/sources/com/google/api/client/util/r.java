package com.google.api.client.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<Field, r> f116153d = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f116154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Field f116155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f116156c;

    r(Field field, String str) {
        this.f116155b = field;
        this.f116156c = str == null ? null : str.intern();
        this.f116154a = n.d(g());
    }

    public static Object d(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static r k(Enum<?> r10) {
        try {
            r rVarL = l(r10.getClass().getField(r10.name()));
            h0.c(rVarL != null, "enum constant missing @Value or @NullValue annotation: %s", r10);
            return rVarL;
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static r l(Field field) {
        String strValue = null;
        if (field == null) {
            return null;
        }
        Map<Field, r> map = f116153d;
        synchronized (map) {
            try {
                r rVar = map.get(field);
                boolean zIsEnumConstant = field.isEnumConstant();
                if (rVar == null && (zIsEnumConstant || !Modifier.isStatic(field.getModifiers()))) {
                    if (zIsEnumConstant) {
                        r0 r0Var = (r0) field.getAnnotation(r0.class);
                        if (r0Var != null) {
                            strValue = r0Var.value();
                        } else if (((d0) field.getAnnotation(d0.class)) == null) {
                            return null;
                        }
                    } else {
                        v vVar = (v) field.getAnnotation(v.class);
                        if (vVar == null) {
                            return null;
                        }
                        strValue = vVar.value();
                        field.setAccessible(true);
                    }
                    if ("##default".equals(strValue)) {
                        strValue = field.getName();
                    }
                    rVar = new r(field, strValue);
                    map.put(field, rVar);
                }
                return rVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void m(Field field, Object obj, Object obj2) {
        if (!Modifier.isFinal(field.getModifiers())) {
            try {
                field.set(obj, obj2);
                return;
            } catch (IllegalAccessException e10) {
                throw new IllegalArgumentException(e10);
            } catch (SecurityException e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        Object objD = d(field, obj);
        if (obj2 == null) {
            if (objD == null) {
                return;
            }
        } else if (obj2.equals(objD)) {
            return;
        }
        throw new IllegalArgumentException("expected final value <" + objD + "> but was <" + obj2 + "> on " + field.getName() + " field in " + obj.getClass().getName());
    }

    public <T extends Enum<T>> T a() {
        return (T) Enum.valueOf(this.f116155b.getDeclaringClass(), this.f116155b.getName());
    }

    public k b() {
        return k.h(this.f116155b.getDeclaringClass());
    }

    public Field c() {
        return this.f116155b;
    }

    public Type e() {
        return this.f116155b.getGenericType();
    }

    public String f() {
        return this.f116156c;
    }

    public Class<?> g() {
        return this.f116155b.getType();
    }

    public Object h(Object obj) {
        return d(this.f116155b, obj);
    }

    public boolean i() {
        return Modifier.isFinal(this.f116155b.getModifiers());
    }

    public boolean j() {
        return this.f116154a;
    }

    public void n(Object obj, Object obj2) {
        m(this.f116155b, obj, obj2);
    }
}
