package com.google.api.client.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Boolean f116097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f116098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Character f116099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Byte f116100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Short f116101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Integer f116102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Float f116103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Long f116104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Double f116105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final BigInteger f116106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final BigDecimal f116107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p f116108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ConcurrentHashMap<Class<?>, Object> f116109m;

    static {
        Boolean bool = new Boolean(true);
        f116097a = bool;
        String str = new String();
        f116098b = str;
        Character ch2 = new Character((char) 0);
        f116099c = ch2;
        Byte b10 = new Byte((byte) 0);
        f116100d = b10;
        Short sh2 = new Short((short) 0);
        f116101e = sh2;
        Integer num = new Integer(0);
        f116102f = num;
        Float f10 = new Float(0.0f);
        f116103g = f10;
        Long l10 = new Long(0L);
        f116104h = l10;
        Double d10 = new Double(0.0d);
        f116105i = d10;
        BigInteger bigInteger = new BigInteger(com.facebook.appevents.p.f99189d0);
        f116106j = bigInteger;
        BigDecimal bigDecimal = new BigDecimal(com.facebook.appevents.p.f99189d0);
        f116107k = bigDecimal;
        p pVar = new p(0L);
        f116108l = pVar;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        f116109m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch2);
        concurrentHashMap.put(Byte.class, b10);
        concurrentHashMap.put(Short.class, sh2);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f10);
        concurrentHashMap.put(Long.class, l10);
        concurrentHashMap.put(Double.class, d10);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(p.class, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(T t10) {
        T t11;
        if (t10 == 0 || d(t10.getClass())) {
            return t10;
        }
        if (t10 instanceof s) {
            return (T) ((s) t10).clone();
        }
        Class<?> cls = t10.getClass();
        if (cls.isArray()) {
            t11 = (T) Array.newInstance(cls.getComponentType(), Array.getLength(t10));
        } else if (t10 instanceof a) {
            t11 = (T) ((a) t10).clone();
        } else {
            if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
                Object[] array = ((List) t10).toArray();
                b(array, array);
                return (T) Arrays.asList(array);
            }
            t11 = (T) q0.m(cls);
        }
        b(t10, t11);
        return t11;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1104)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1058)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static void b(Object obj, Object obj2) {
        Class<?> cls = obj.getClass();
        int i10 = 0;
        h0.a(cls == obj2.getClass());
        if (cls.isArray()) {
            h0.a(Array.getLength(obj) == Array.getLength(obj2));
            Iterator it = q0.l(obj).iterator();
            while (it.hasNext()) {
                Array.set(obj2, i10, a(it.next()));
                i10++;
            }
            return;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            Collection collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                collection2.add(a(it2.next()));
            }
            return;
        }
        boolean zIsAssignableFrom = s.class.isAssignableFrom(cls);
        if (!zIsAssignableFrom && Map.class.isAssignableFrom(cls)) {
            if (!a.class.isAssignableFrom(cls)) {
                Map map = (Map) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put(entry.getKey(), a(entry.getValue()));
                }
                return;
            }
            a aVar = (a) obj2;
            a aVar2 = (a) obj;
            int size = aVar2.size();
            while (i10 < size) {
                aVar.n(i10, a(aVar2.i(i10)));
                i10++;
            }
            return;
        }
        k kVarH = zIsAssignableFrom ? ((s) obj).f116158b : k.h(cls);
        Iterator<String> it3 = kVarH.f116093d.iterator();
        while (it3.hasNext()) {
            r rVarB = kVarH.b(it3.next());
            if (!rVarB.i() && (!zIsAssignableFrom || !rVarB.j())) {
                Object objH = rVarB.h(obj);
                if (objH != null) {
                    rVarB.n(obj2, a(objH));
                }
            }
        }
    }

    public static boolean c(Object obj) {
        return obj != null && obj == f116109m.get(obj.getClass());
    }

    public static boolean d(Type type) {
        if (type instanceof WildcardType) {
            type = q0.c((WildcardType) type);
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Class cls = (Class) type;
        return cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == p.class || cls == Boolean.class;
    }

    public static boolean e(Object obj) {
        return obj == null || d(obj.getClass());
    }

    public static Map<String, Object> f(Object obj) {
        if (obj == null || c(obj)) {
            return Collections.EMPTY_MAP;
        }
        return obj instanceof Map ? (Map) obj : new o(obj, false);
    }

    public static Collection<Object> g(Type type) {
        if (type instanceof WildcardType) {
            type = q0.c((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || (type instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls != null) {
            if (cls.isAssignableFrom(HashSet.class)) {
                return new HashSet();
            }
            return cls.isAssignableFrom(TreeSet.class) ? new TreeSet() : (Collection) q0.m(cls);
        }
        throw new IllegalArgumentException("unable to create new instance of type: " + type);
    }

    public static Map<String, Object> h(Class<?> cls) {
        if (cls == null || cls.isAssignableFrom(a.class)) {
            return a.c();
        }
        return cls.isAssignableFrom(TreeMap.class) ? new TreeMap() : (Map) q0.m(cls);
    }

    public static <T> T i(Class<?> cls) {
        Object objM;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = f116109m;
        T t10 = (T) concurrentHashMap.get(cls);
        if (t10 != null) {
            return t10;
        }
        synchronized (concurrentHashMap) {
            try {
                objM = (T) concurrentHashMap.get(cls);
                if (objM == null) {
                    if (cls.isArray()) {
                        int i10 = 0;
                        Class<?> componentType = cls;
                        do {
                            componentType = componentType.getComponentType();
                            i10++;
                        } while (componentType.isArray());
                        objM = (T) Array.newInstance(componentType, new int[i10]);
                    } else if (cls.isEnum()) {
                        r rVarB = k.h(cls).b(null);
                        h0.f(rVarB, "enum missing constant with @NullValue annotation: %s", cls);
                        objM = rVarB.a();
                    } else {
                        objM = q0.m(cls);
                    }
                    f116109m.put(cls, objM);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (T) objM;
    }

    public static Object j(Type type, String str) {
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str != null && cls != null && !cls.isAssignableFrom(String.class)) {
                if (cls == Character.class || cls == Character.TYPE) {
                    if (str.length() == 1) {
                        return Character.valueOf(str.charAt(0));
                    }
                    throw new IllegalArgumentException("expected type Character/char but got " + cls);
                }
                if (cls == Boolean.class || cls == Boolean.TYPE) {
                    return Boolean.valueOf(str);
                }
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls != Integer.class && cls != Integer.TYPE) {
                    if (cls == Long.class || cls == Long.TYPE) {
                        return Long.valueOf(str);
                    }
                    if (cls != Float.class && cls != Float.TYPE) {
                        if (cls == Double.class || cls == Double.TYPE) {
                            return Double.valueOf(str);
                        }
                        if (cls == p.class) {
                            return p.e(str);
                        }
                        if (cls == BigInteger.class) {
                            return new BigInteger(str);
                        }
                        if (cls == BigDecimal.class) {
                            return new BigDecimal(str);
                        }
                        if (cls.isEnum()) {
                            return k.h(cls).b(str).a();
                        }
                    }
                    return Float.valueOf(str);
                }
                return Integer.valueOf(str);
            }
            return str;
        }
        throw new IllegalArgumentException("expected primitive class, but got: " + type);
    }

    public static Type k(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = q0.c((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type typeN = q0.n(list, (TypeVariable) type);
            if (typeN != null) {
                type = typeN;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }
}
