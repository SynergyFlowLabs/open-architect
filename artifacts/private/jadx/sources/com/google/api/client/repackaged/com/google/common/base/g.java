package com.google.api.client.repackaged.com.google.common.base;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
@r7.b(emulated = true)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @r7.c
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> f115875a = new WeakHashMap();

    private static final class a<T extends Enum<T>> extends f<String, T> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f115876d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<T> f115877c;

        a(Class<T> cls) {
            this.f115877c = (Class) q.E(cls);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.f, com.google.api.client.repackaged.com.google.common.base.i
        public boolean equals(@fj.h Object obj) {
            if (obj instanceof a) {
                return this.f115877c.equals(((a) obj).f115877c);
            }
            return false;
        }

        public int hashCode() {
            return this.f115877c.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.api.client.repackaged.com.google.common.base.f
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public String g(T t10) {
            return t10.name();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.api.client.repackaged.com.google.common.base.f
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public T h(String str) {
            return (T) Enum.valueOf(this.f115877c, str);
        }

        public String toString() {
            return "Enums.stringConverter(" + this.f115877c.getName() + ".class)";
        }
    }

    private g() {
    }

    @r7.c
    static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> a(Class<T> cls) {
        Map<String, WeakReference<? extends Enum<?>>> mapD;
        Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> map = f115875a;
        synchronized (map) {
            try {
                mapD = map.get(cls);
                if (mapD == null) {
                    mapD = d(cls);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mapD;
    }

    @r7.c
    public static Field b(Enum<?> r10) {
        try {
            return r10.getDeclaringClass().getDeclaredField(r10.name());
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    public static <T extends Enum<T>> n<T> c(Class<T> cls, String str) {
        q.E(cls);
        q.E(str);
        return p.c(cls, str);
    }

    @r7.c
    private static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> d(Class<T> cls) {
        HashMap map = new HashMap();
        for (Enum r10 : EnumSet.allOf(cls)) {
            map.put(r10.name(), new WeakReference(r10));
        }
        f115875a.put(cls, map);
        return map;
    }

    public static <T extends Enum<T>> f<String, T> e(Class<T> cls) {
        return new a(cls);
    }
}
