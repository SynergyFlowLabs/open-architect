package com.google.api.client.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public class q0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static class a<T> implements Iterable<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f116149a;

        /* JADX INFO: renamed from: com.google.api.client.util.q0$a$a, reason: collision with other inner class name */
        class C1035a implements Iterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final int f116150a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f116151b = 0;

            C1035a() {
                this.f116150a = Array.getLength(a.this.f116149a);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f116151b < this.f116150a;
            }

            @Override // java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = a.this.f116149a;
                int i10 = this.f116151b;
                this.f116151b = i10 + 1;
                return (T) Array.get(obj, i10);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        a(Object obj) {
            this.f116149a = obj;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new C1035a();
        }
    }

    private q0() {
    }

    private static Type a(Type type, Class<?> cls, int i10) {
        Type typeN;
        ParameterizedType parameterizedTypeH = h(type, cls);
        if (parameterizedTypeH == null) {
            return null;
        }
        Type type2 = parameterizedTypeH.getActualTypeArguments()[i10];
        return (!(type2 instanceof TypeVariable) || (typeN = n(Arrays.asList(type), (TypeVariable) type2)) == null) ? type2 : typeN;
    }

    public static Type b(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type c(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length != 0 ? lowerBounds[0] : wildcardType.getUpperBounds()[0];
    }

    public static Type d(Type type) {
        return a(type, Iterable.class, 0);
    }

    public static Type e(Type type) {
        return a(type, Map.class, 1);
    }

    public static Class<?> f(List<Type> list, Type type) {
        if (type instanceof TypeVariable) {
            type = n(list, (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(f(list, b(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return g((ParameterizedType) type);
        }
        h0.c(type == null, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    public static Class<?> g(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    public static ParameterizedType h(Type type, Class<?> cls) {
        Class<?> cls2;
        if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
            return null;
        }
        while (type != null && type != Object.class) {
            if (type instanceof Class) {
                cls2 = (Class) type;
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class<?> clsG = g(parameterizedType);
                if (clsG == cls) {
                    return parameterizedType;
                }
                if (cls.isInterface()) {
                    Type[] genericInterfaces = clsG.getGenericInterfaces();
                    int length = genericInterfaces.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            Type type2 = genericInterfaces[i10];
                            if (cls.isAssignableFrom(type2 instanceof Class ? (Class) type2 : g((ParameterizedType) type2))) {
                                type = type2;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                cls2 = clsG;
            }
            type = cls2.getGenericSuperclass();
        }
        return null;
    }

    private static IllegalArgumentException i(Exception exc, Class<?> cls) {
        StringBuilder sb2 = new StringBuilder("unable to create new instance of class ");
        sb2.append(cls.getName());
        ArrayList<String> arrayList = new ArrayList();
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (Modifier.isPublic(cls.getModifiers())) {
                try {
                    cls.getConstructor(null);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            } else {
                arrayList.add("possibly because it is not public");
            }
        }
        boolean z10 = false;
        for (String str : arrayList) {
            if (z10) {
                sb2.append(" and");
            } else {
                z10 = true;
            }
            sb2.append(" ");
            sb2.append(str);
        }
        return new IllegalArgumentException(sb2.toString(), exc);
    }

    public static boolean j(Type type) {
        if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
            return false;
        }
        return true;
    }

    public static boolean k(Class<?> cls, Class<?> cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    public static <T> Iterable<T> l(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        h0.c(cls.isArray(), "not an array or Iterable: %s", cls);
        return !cls.getComponentType().isPrimitive() ? Arrays.asList((Object[]) obj) : new a(obj);
    }

    public static <T> T m(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e10) {
            throw i(e10, cls);
        } catch (InstantiationException e11) {
            throw i(e11, cls);
        }
    }

    public static Type n(List<Type> list, TypeVariable<?> typeVariable) {
        Type typeN;
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            ParameterizedType parameterizedTypeH = null;
            while (parameterizedTypeH == null && (size = size - 1) >= 0) {
                parameterizedTypeH = h(list.get(size), cls);
            }
            if (parameterizedTypeH != null) {
                TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
                int i10 = 0;
                while (i10 < typeParameters.length && !typeParameters[i10].equals(typeVariable)) {
                    i10++;
                }
                Type type = parameterizedTypeH.getActualTypeArguments()[i10];
                return (!(type instanceof TypeVariable) || (typeN = n(list, (TypeVariable) type)) == null) ? type : typeN;
            }
        }
        return null;
    }

    public static Object o(Collection<?> collection, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object objNewInstance = Array.newInstance(cls, collection.size());
        Iterator<?> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Array.set(objNewInstance, i10, it.next());
            i10++;
        }
        return objNewInstance;
    }
}
