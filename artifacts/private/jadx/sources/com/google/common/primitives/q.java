package com.google.common.primitives;

import com.google.common.base.j0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f119770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f119771b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        a(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        a(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        a(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        a(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        a(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        a(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        a(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        a(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        a(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        f119770a = Collections.unmodifiableMap(linkedHashMap);
        f119771b = Collections.unmodifiableMap(linkedHashMap2);
    }

    private q() {
    }

    private static void a(Map<Class<?>, Class<?>> forward, Map<Class<?>, Class<?>> backward, Class<?> key, Class<?> value) {
        forward.put(key, value);
        backward.put(value, key);
    }

    public static Set<Class<?>> b() {
        return f119770a.keySet();
    }

    public static Set<Class<?>> c() {
        return f119771b.keySet();
    }

    public static boolean d(Class<?> type) {
        return f119771b.containsKey(j0.E(type));
    }

    public static <T> Class<T> e(Class<T> type) {
        j0.E(type);
        Class<T> cls = (Class) f119771b.get(type);
        return cls == null ? type : cls;
    }

    public static <T> Class<T> f(Class<T> type) {
        j0.E(type);
        Class<T> cls = (Class) f119770a.get(type);
        return cls == null ? type : cls;
    }
}
