package com.google.common.base;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@k
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.c
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> f116556a = new WeakHashMap();

    @com.google.common.annotations.c
    private static final class a<T extends Enum<T>> extends i<String, T> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f116557d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<T> f116558c;

        a(Class<T> enumClass) {
            this.f116558c = (Class) j0.E(enumClass);
        }

        @Override // com.google.common.base.i, com.google.common.base.t
        public boolean equals(@fj.a Object object) {
            if (object instanceof a) {
                return this.f116558c.equals(((a) object).f116558c);
            }
            return false;
        }

        public int hashCode() {
            return this.f116558c.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.i
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String g(T enumValue) {
            return enumValue.name();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.i
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public T h(String str) {
            return (T) Enum.valueOf(this.f116558c, str);
        }

        public String toString() {
            return "Enums.stringConverter(" + this.f116558c.getName() + ".class)";
        }
    }

    private l() {
    }

    @com.google.common.annotations.c
    static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> a(Class<T> enumClass) {
        Map<String, WeakReference<? extends Enum<?>>> mapD;
        Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> map = f116556a;
        synchronized (map) {
            try {
                mapD = map.get(enumClass);
                if (mapD == null) {
                    mapD = d(enumClass);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mapD;
    }

    @com.google.common.annotations.c
    public static Field b(Enum<?> enumValue) {
        try {
            return enumValue.getDeclaringClass().getDeclaredField(enumValue.name());
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    public static <T extends Enum<T>> e0<T> c(Class<T> enumClass, String value) {
        j0.E(enumClass);
        j0.E(value);
        return i0.d(enumClass, value);
    }

    @com.google.common.annotations.c
    private static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> d(Class<T> enumClass) {
        HashMap map = new HashMap();
        for (Enum r10 : EnumSet.allOf(enumClass)) {
            map.put(r10.name(), new WeakReference(r10));
        }
        f116556a.put(enumClass, map);
        return map;
    }

    @com.google.common.annotations.c
    public static <T extends Enum<T>> i<String, T> e(Class<T> enumClass) {
        return new a(enumClass);
    }
}
