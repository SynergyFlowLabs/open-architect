package com.google.gson.reflect;

import com.facebook.internal.z0;
import com.google.gson.internal.k0;
import com.google.gson.internal.y;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class a<T> {
    private final int hashCode;
    private final Class<? super T> rawType;
    private final Type type;

    protected a() {
        Type typeB = b();
        this.type = typeB;
        this.rawType = (Class<? super T>) y.k(typeB);
        this.hashCode = typeB.hashCode();
    }

    private static IllegalArgumentException a(Type type, Class<?>... clsArr) {
        StringBuilder sb2 = new StringBuilder("Unsupported type, expected one of: ");
        for (Class<?> cls : clsArr) {
            sb2.append(cls.getName());
            sb2.append(", ");
        }
        sb2.append("but got: ");
        sb2.append(type.getClass().getName());
        sb2.append(", for type token: ");
        sb2.append(type.toString());
        return new IllegalArgumentException(sb2.toString());
    }

    private Type b() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type typeB = y.b(parameterizedType.getActualTypeArguments()[0]);
                if (e()) {
                    h(typeB);
                }
                return typeB;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + k0.a("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v9 */
    private static boolean c(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class) {
            type = (Class) type;
            while (type.isArray()) {
                type = type.getComponentType();
            }
        }
        return d(type, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static boolean d(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> clsK = y.k(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = clsK.getTypeParameters();
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                Type type2 = actualTypeArguments[i10];
                TypeVariable<Class<?>> typeVariable = typeParameters[i10];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (g(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : clsK.getGenericInterfaces()) {
            if (d(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return d(clsK.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    private static boolean e() {
        return !Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), z0.P);
    }

    private static boolean f(Type type, Type type2, Map<String, Type> map) {
        if (type2.equals(type)) {
            return true;
        }
        return (type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName()));
    }

    private static boolean g(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            if (!f(actualTypeArguments[i10], actualTypeArguments2[i10], map)) {
                return false;
            }
        }
        return true;
    }

    public static a<?> get(Type type) {
        return new a<>(type);
    }

    public static a<?> getArray(Type type) {
        return new a<>(y.a(type));
    }

    public static a<?> getParameterized(Type type, Type... typeArr) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(typeArr);
        if (!(type instanceof Class)) {
            throw new IllegalArgumentException("rawType must be of type Class, but was " + type);
        }
        Class cls = (Class) type;
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        if (typeArr.length == 0) {
            return get(cls);
        }
        if (y.o(type)) {
            throw new IllegalArgumentException("Raw type " + cls.getName() + " is not supported because it requires specifying an owner type");
        }
        for (int i10 = 0; i10 < length; i10++) {
            Type type2 = typeArr[i10];
            Objects.requireNonNull(type2, "Type argument must not be null");
            Type type3 = type2;
            Class<?> clsK = y.k(type3);
            TypeVariable<Class<T>> typeVariable = typeParameters[i10];
            for (Type type4 : typeVariable.getBounds()) {
                if (!y.k(type4).isAssignableFrom(clsK)) {
                    throw new IllegalArgumentException("Type argument " + type3 + " does not satisfy bounds for type variable " + typeVariable + " declared by " + type);
                }
            }
        }
        return new a<>(y.n(null, cls, typeArr));
    }

    private static void h(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + k0.a("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            h(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i10 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                h(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i10 < length) {
                h(actualTypeArguments[i10]);
                i10++;
            }
        } else {
            if (!(type instanceof WildcardType)) {
                if (type == null) {
                    throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
                }
                return;
            }
            WildcardType wildcardType = (WildcardType) type;
            for (Type type2 : wildcardType.getLowerBounds()) {
                h(type2);
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            int length2 = upperBounds.length;
            while (i10 < length2) {
                h(upperBounds[i10]);
                i10++;
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && y.f(this.type, ((a) obj).type);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public final String toString() {
        return y.u(this.type);
    }

    public static <T> a<T> get(Class<T> cls) {
        return new a<>(cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type) {
        if (type == null) {
            return false;
        }
        if (this.type.equals(type)) {
            return true;
        }
        Type type2 = this.type;
        if (type2 instanceof Class) {
            return this.rawType.isAssignableFrom(y.k(type));
        }
        if (type2 instanceof ParameterizedType) {
            return d(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return this.rawType.isAssignableFrom(y.k(type)) && c(type, (GenericArrayType) this.type);
        }
        throw a(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    private a(Type type) {
        Objects.requireNonNull(type);
        Type typeB = y.b(type);
        this.type = typeB;
        this.rawType = (Class<? super T>) y.k(typeB);
        this.hashCode = typeB.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(a<?> aVar) {
        return isAssignableFrom(aVar.getType());
    }
}
