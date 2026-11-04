package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
@fj.c
public final class a0 {

    class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f267126a;

        a(Class cls) {
            this.f267126a = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            name.getClass();
            switch (name) {
                case "toString":
                    return "@" + this.f267126a.getName() + "()";
                case "equals":
                    return Boolean.valueOf(this.f267126a.isInstance(objArr[0]));
                case "hashCode":
                    return 0;
                case "annotationType":
                    return this.f267126a;
                default:
                    return method.invoke(obj, objArr);
            }
        }
    }

    private a0() {
    }

    static Type a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    public static GenericArrayType b(Type type) {
        return new Util.GenericArrayTypeImpl(type);
    }

    public static Type c(Type type, Class<?> cls) {
        Type typeK = k(type, cls, Collection.class);
        if (typeK instanceof WildcardType) {
            typeK = ((WildcardType) typeK).getUpperBounds()[0];
        }
        return typeK instanceof ParameterizedType ? ((ParameterizedType) typeK).getActualTypeArguments()[0] : Object.class;
    }

    static <T extends Annotation> T d(Class<T> cls) {
        if (!cls.isAnnotation()) {
            throw new IllegalArgumentException(cls + " must be an annotation.");
        }
        if (!cls.isAnnotationPresent(l.class)) {
            throw new IllegalArgumentException(cls + " must have @JsonQualifier.");
        }
        if (cls.getDeclaredMethods().length == 0) {
            return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        }
        throw new IllegalArgumentException(cls + " must not declare methods.");
    }

    public static boolean e(@fj.h Type type, @fj.h Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? e(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof Util.ParameterizedTypeImpl ? ((Util.ParameterizedTypeImpl) parameterizedType).f267166c : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof Util.ParameterizedTypeImpl ? ((Util.ParameterizedTypeImpl) parameterizedType2).f267166c : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return e(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static String f(Class<?> cls) {
        if (cls.getAnnotation(i.class) != null) {
            return g(cls.getName());
        }
        throw new IllegalArgumentException("Class does not have a JsonClass annotation: " + cls);
    }

    public static String g(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    @Deprecated
    public static Set<? extends Annotation> h(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            LinkedHashSet linkedHashSet = new LinkedHashSet(declaredAnnotations.length);
            for (Annotation annotation : declaredAnnotations) {
                if (annotation.annotationType().isAnnotationPresent(l.class)) {
                    linkedHashSet.add(annotation);
                }
            }
            return Collections.unmodifiableSet(linkedHashSet);
        } catch (NoSuchFieldException e10) {
            throw new IllegalArgumentException("Could not access field " + str + " on class " + cls.getCanonicalName(), e10);
        }
    }

    static Type i(Type type) {
        Class<?> clsJ = j(type);
        return Util.u(type, clsJ, clsJ.getGenericSuperclass());
    }

    public static Class<?> j(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(j(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return j(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? AbstractJsonLexerKt.NULL : type.getClass().getName()));
    }

    static Type k(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return Util.u(type, cls, Util.g(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    static Type[] l(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeK = k(type, cls, Map.class);
        return typeK instanceof ParameterizedType ? ((ParameterizedType) typeK).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static ParameterizedType m(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new Util.ParameterizedTypeImpl(null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    public static ParameterizedType n(Type type, Type type2, Type... typeArr) {
        if (typeArr.length != 0) {
            return new Util.ParameterizedTypeImpl(type, type2, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type2);
    }

    @fj.h
    public static Set<? extends Annotation> o(Set<? extends Annotation> set, Class<? extends Annotation> cls) {
        if (!cls.isAnnotationPresent(l.class)) {
            throw new IllegalArgumentException(cls + " is not a JsonQualifier.");
        }
        if (set.isEmpty()) {
            return null;
        }
        for (Annotation annotation : set) {
            if (cls.equals(annotation.annotationType())) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(set);
                linkedHashSet.remove(annotation);
                return Collections.unmodifiableSet(linkedHashSet);
            }
        }
        return null;
    }

    public static WildcardType p(Type type) {
        return new Util.WildcardTypeImpl(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, Util.f267159b);
    }

    public static WildcardType q(Type type) {
        return new Util.WildcardTypeImpl(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }
}
