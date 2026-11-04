package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Type, com.google.gson.h<?>> f125524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f125525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.google.gson.x> f125526c;

    public v(Map<Type, com.google.gson.h<?>> map, boolean z10, List<com.google.gson.x> list) {
        this.f125524a = map;
        this.f125525b = z10;
        this.f125526c = list;
    }

    private static <T> f0<T> A(Class<? super T> cls, com.google.gson.x.e eVar) {
        final String strP;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            com.google.gson.x.e eVar2 = com.google.gson.x.e.ALLOW;
            if (eVar != eVar2 && (!i0.a(declaredConstructor, null) || (eVar == com.google.gson.x.e.BLOCK_ALL && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
                return new f0() { // from class: com.google.gson.internal.j
                    @Override // com.google.gson.internal.f0
                    public final Object a() {
                        return v.n(str);
                    }
                };
            }
            return (eVar != eVar2 || (strP = com.google.gson.internal.reflect.a.p(declaredConstructor)) == null) ? new f0() { // from class: com.google.gson.internal.m
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.s(declaredConstructor);
                }
            } : new f0() { // from class: com.google.gson.internal.k
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.k(strP);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static <T> f0<T> B(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return (f0<T>) z(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (f0<T>) C(type, cls);
        }
        return null;
    }

    private static f0<? extends Map<? extends Object, Object>> C(Type type, Class<?> cls) {
        if (cls.isAssignableFrom(c0.class) && y(type)) {
            return new f0() { // from class: com.google.gson.internal.e
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.p();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new f0() { // from class: com.google.gson.internal.f
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.c();
                }
            };
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new f0() { // from class: com.google.gson.internal.g
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.j();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new f0() { // from class: com.google.gson.internal.h
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.a();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new f0() { // from class: com.google.gson.internal.i
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.h();
                }
            };
        }
        return null;
    }

    private static <T> f0<T> D(final Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new f0() { // from class: com.google.gson.internal.c
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.m(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new f0() { // from class: com.google.gson.internal.d
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.f(type);
                }
            };
        }
        return null;
    }

    private <T> f0<T> E(final Class<? super T> cls) {
        if (this.f125525b) {
            return new f0() { // from class: com.google.gson.internal.u
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.e(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new f0() { // from class: com.google.gson.internal.b
            @Override // com.google.gson.internal.f0
            public final Object a() {
                return v.o(str);
            }
        };
    }

    public static /* synthetic */ Map a() {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Collection b() {
        return new ArrayList();
    }

    public static /* synthetic */ Map c() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ Object d(String str) {
        throw new com.google.gson.m(str);
    }

    public static /* synthetic */ Object e(Class cls) {
        try {
            return l0.f125496a.d(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    public static /* synthetic */ Object f(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new com.google.gson.m("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new com.google.gson.m("Invalid EnumMap type: " + type.toString());
    }

    public static /* synthetic */ Map h() {
        return new ConcurrentSkipListMap();
    }

    public static /* synthetic */ Map j() {
        return new TreeMap();
    }

    public static /* synthetic */ Object k(String str) {
        throw new com.google.gson.m(str);
    }

    public static /* synthetic */ Collection l() {
        return new LinkedHashSet();
    }

    public static /* synthetic */ Object m(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new com.google.gson.m("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new com.google.gson.m("Invalid EnumSet type: " + type.toString());
    }

    public static /* synthetic */ Object n(String str) {
        throw new com.google.gson.m(str);
    }

    public static /* synthetic */ Object o(String str) {
        throw new com.google.gson.m(str);
    }

    public static /* synthetic */ Map p() {
        return new c0();
    }

    public static /* synthetic */ Object q(String str) {
        throw new com.google.gson.m(str);
    }

    public static /* synthetic */ Collection r() {
        return new TreeSet();
    }

    public static /* synthetic */ Object s(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw com.google.gson.internal.reflect.a.e(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + com.google.gson.internal.reflect.a.c(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + com.google.gson.internal.reflect.a.c(constructor) + "' with no args", e12.getCause());
        }
    }

    public static /* synthetic */ Collection t() {
        return new ArrayDeque();
    }

    public static /* synthetic */ Object u(String str) {
        throw new com.google.gson.m(str);
    }

    static String v(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + k0.a("r8-abstract-class");
    }

    private static boolean y(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length != 0 && y.k(actualTypeArguments[0]) == String.class;
    }

    private static f0<? extends Collection<? extends Object>> z(Class<?> cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new f0() { // from class: com.google.gson.internal.q
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.b();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new f0() { // from class: com.google.gson.internal.r
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.l();
                }
            };
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new f0() { // from class: com.google.gson.internal.s
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.r();
                }
            };
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new f0() { // from class: com.google.gson.internal.t
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.t();
                }
            };
        }
        return null;
    }

    public String toString() {
        return this.f125524a.toString();
    }

    public <T> f0<T> w(com.google.gson.reflect.a<T> aVar) {
        return x(aVar, true);
    }

    public <T> f0<T> x(com.google.gson.reflect.a<T> aVar, boolean z10) {
        final Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        final com.google.gson.h<?> hVar = this.f125524a.get(type);
        if (hVar != null) {
            return new f0() { // from class: com.google.gson.internal.a
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return hVar.a(type);
                }
            };
        }
        final com.google.gson.h<?> hVar2 = this.f125524a.get(rawType);
        if (hVar2 != null) {
            return new f0() { // from class: com.google.gson.internal.l
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return hVar2.a(type);
                }
            };
        }
        f0<T> f0VarD = D(type, rawType);
        if (f0VarD != null) {
            return f0VarD;
        }
        com.google.gson.x.e eVarB = i0.b(this.f125526c, rawType);
        f0<T> f0VarA = A(rawType, eVarB);
        if (f0VarA != null) {
            return f0VarA;
        }
        f0<T> f0VarB = B(type, rawType);
        if (f0VarB != null) {
            return f0VarB;
        }
        final String strV = v(rawType);
        if (strV != null) {
            return new f0() { // from class: com.google.gson.internal.n
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.q(strV);
                }
            };
        }
        if (!z10) {
            final String str = "Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.";
            return new f0() { // from class: com.google.gson.internal.o
                @Override // com.google.gson.internal.f0
                public final Object a() {
                    return v.d(str);
                }
            };
        }
        if (eVarB == com.google.gson.x.e.ALLOW) {
            return E(rawType);
        }
        final String str2 = "Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new f0() { // from class: com.google.gson.internal.p
            @Override // com.google.gson.internal.f0
            public final Object a() {
                return v.u(str2);
            }
        };
    }
}
