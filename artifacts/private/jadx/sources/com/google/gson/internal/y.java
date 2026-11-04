package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Type[] f125542a = new Type[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f125543b = false;

    private static final class a implements GenericArrayType, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f125544b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f125545a;

        a(Type type) {
            Objects.requireNonNull(type);
            this.f125545a = y.b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && y.f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f125545a;
        }

        public int hashCode() {
            return this.f125545a.hashCode();
        }

        public String toString() {
            return y.u(this.f125545a) + okhttp3.v.f334777p;
        }
    }

    private static final class b implements ParameterizedType, Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f125546d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f125547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f125548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Type[] f125549c;

        b(Type type, Class<?> cls, Type... typeArr) {
            Objects.requireNonNull(cls);
            if (type == null && y.o(cls)) {
                throw new IllegalArgumentException("Must specify owner type for " + cls);
            }
            this.f125547a = type == null ? null : y.b(type);
            this.f125548b = y.b(cls);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f125549c = typeArr2;
            int length = typeArr2.length;
            int i10 = 7 >> 0;
            for (int i11 = 0; i11 < length; i11++) {
                Objects.requireNonNull(this.f125549c[i11]);
                y.c(this.f125549c[i11]);
                Type[] typeArr3 = this.f125549c;
                typeArr3[i11] = y.b(typeArr3[i11]);
            }
        }

        private static int a(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && y.f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f125549c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f125547a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f125548b;
        }

        public int hashCode() {
            return a(this.f125547a) ^ (Arrays.hashCode(this.f125549c) ^ this.f125548b.hashCode());
        }

        public String toString() {
            int length = this.f125549c.length;
            if (length == 0) {
                return y.u(this.f125548b);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(y.u(this.f125548b));
            sb2.append("<");
            sb2.append(y.u(this.f125549c[0]));
            int i10 = 6 | 1;
            for (int i11 = 1; i11 < length; i11++) {
                sb2.append(", ");
                sb2.append(y.u(this.f125549c[i11]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    private static final class c implements WildcardType, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f125550c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f125551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f125552b;

        c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException("At most one lower bound is supported");
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException("Exactly one upper bound must be specified");
            }
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                y.c(typeArr[0]);
                this.f125552b = null;
                this.f125551a = y.b(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            y.c(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
            }
            this.f125552b = y.b(typeArr2[0]);
            this.f125551a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && y.f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f125552b;
            return type != null ? new Type[]{type} : y.f125542a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f125551a};
        }

        public int hashCode() {
            Type type = this.f125552b;
            return (this.f125551a.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
        }

        public String toString() {
            if (this.f125552b != null) {
                return "? super " + y.u(this.f125552b);
            }
            if (this.f125551a == Object.class) {
                return com.planner5d.library.model.payments.a.f222474i;
            }
            return "? extends " + y.u(this.f125551a);
        }
    }

    private y() {
        throw new UnsupportedOperationException();
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Primitive type is not allowed");
        }
    }

    private static Class<?> d(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    private static boolean e(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static boolean f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
        if (type instanceof TypeVariable) {
            if (!(type2 instanceof TypeVariable)) {
                return false;
            }
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
        }
        return false;
    }

    public static Type g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type h(Type type, Class<?> cls) {
        Type typeL = l(type, cls, Collection.class);
        return typeL instanceof ParameterizedType ? ((ParameterizedType) typeL).getActualTypeArguments()[0] : Object.class;
    }

    private static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return i(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] j(Type type, Class<?> cls) {
        if (Properties.class.isAssignableFrom(cls)) {
            return new Type[]{String.class, String.class};
        }
        Type typeL = l(type, cls, Map.class);
        return typeL instanceof ParameterizedType ? ((ParameterizedType) typeL).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class<?> k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return k(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? AbstractJsonLexerKt.NULL : type.getClass().getName()));
    }

    private static Type l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return p(type, cls, i(type, cls, cls2));
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    private static int m(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType n(Type type, Class<?> cls, Type... typeArr) {
        return new b(type, cls, typeArr);
    }

    public static boolean o(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                return true;
            }
        }
        return false;
    }

    public static Type p(Type type, Class<?> cls, Type type2) {
        return q(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d A[EDGE_INSN: B:30:0x006d->B:59:0x00fe BREAK  A[LOOP:0: B:3:0x0001->B:65:?]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7 A[EDGE_INSN: B:53:0x00e7->B:59:0x00fe BREAK  A[LOOP:0: B:3:0x0001->B:65:?]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6 A[SYNTHETIC] */
    private static Type q(Type type, Class<?> cls, Type type2, Map<TypeVariable<?>, Type> map) {
        int i10;
        WildcardType wildcardType;
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeQ;
        Type typeQ2;
        ParameterizedType parameterizedType;
        boolean zE;
        int length;
        Type[] typeArr;
        boolean z10;
        Type typeN;
        Type typeQ3;
        GenericArrayType genericArrayType;
        Type genericComponentType;
        Type typeQ4;
        Type typeS;
        TypeVariable<?> typeVariable = null;
        while (true) {
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            wildcardType = (WildcardType) type2;
                            lowerBounds = wildcardType.getLowerBounds();
                            upperBounds = wildcardType.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                typeS = type2;
                                typeS = wildcardType;
                                typeS = wildcardType;
                                typeS = s(typeQ);
                                break;
                            }
                            typeQ2 = q(type, cls, lowerBounds[0], map);
                            if (typeQ2 != lowerBounds[0]) {
                                break;
                            }
                            typeS = type2;
                            typeS = wildcardType;
                            typeS = t(typeQ2);
                            break;
                        }
                        parameterizedType = (ParameterizedType) type2;
                        Type ownerType = parameterizedType.getOwnerType();
                        Type typeQ5 = q(type, cls, ownerType, map);
                        zE = e(typeQ5, ownerType);
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        typeArr = actualTypeArguments;
                        z10 = false;
                        for (i10 = 0; i10 < length; i10++) {
                            typeQ3 = q(type, cls, typeArr[i10], map);
                            if (e(typeQ3, typeArr[i10])) {
                                if (!z10) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z10 = true;
                                }
                                typeArr[i10] = typeQ3;
                            }
                        }
                        if (!zE) {
                        }
                        typeS = parameterizedType;
                        typeN = n(typeQ5, (Class) parameterizedType.getRawType(), typeArr);
                        typeS = typeN;
                        break;
                    }
                    genericArrayType = (GenericArrayType) type2;
                    genericComponentType = genericArrayType.getGenericComponentType();
                    typeQ4 = q(type, cls, genericComponentType, map);
                    if (e(genericComponentType, typeQ4)) {
                        typeN = a(typeQ4);
                        typeS = typeN;
                        break;
                    }
                    break;
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            wildcardType = (WildcardType) type2;
                            lowerBounds = wildcardType.getLowerBounds();
                            upperBounds = wildcardType.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeQ = q(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    typeS = type2;
                                    typeS = wildcardType;
                                    typeS = wildcardType;
                                    typeS = s(typeQ);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeQ2 = q(type, cls, lowerBounds[0], map);
                            if (typeQ2 != lowerBounds[0]) {
                                break;
                            }
                            typeS = type2;
                            typeS = wildcardType;
                            typeS = t(typeQ2);
                            break;
                        }
                        parameterizedType = (ParameterizedType) type2;
                        Type ownerType2 = parameterizedType.getOwnerType();
                        Type typeQ6 = q(type, cls, ownerType2, map);
                        zE = e(typeQ6, ownerType2);
                        Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
                        length = actualTypeArguments2.length;
                        typeArr = actualTypeArguments2;
                        z10 = false;
                        while (i10 < length) {
                            typeQ3 = q(type, cls, typeArr[i10], map);
                            if (e(typeQ3, typeArr[i10])) {
                                if (!z10) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z10 = true;
                                }
                                typeArr[i10] = typeQ3;
                            }
                        }
                        if (!zE && !z10) {
                            break;
                        }
                        typeS = parameterizedType;
                        typeN = n(typeQ6, (Class) parameterizedType.getRawType(), typeArr);
                        typeS = typeN;
                        break;
                    }
                    genericArrayType = (GenericArrayType) type2;
                    genericComponentType = genericArrayType.getGenericComponentType();
                    typeQ4 = q(type, cls, genericComponentType, map);
                    if (e(genericComponentType, typeQ4)) {
                        typeN = a(typeQ4);
                        typeS = typeN;
                        break;
                    }
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeQ7 = q(type, cls, componentType, map);
                if (!e(componentType, typeQ7)) {
                    typeN = a(typeQ7);
                    typeS = typeN;
                    break;
                }
                typeS = cls2;
                break;
            }
            TypeVariable<?> typeVariable2 = (TypeVariable) type2;
            Type type3 = map.get(typeVariable2);
            Type type4 = Void.TYPE;
            if (type3 != null) {
                return type3 == type4 ? type2 : type3;
            }
            map.put(typeVariable2, type4);
            if (typeVariable == null) {
                typeVariable = typeVariable2;
            }
            type2 = r(type, cls, typeVariable2);
            if (type2 == typeVariable2) {
                typeS = type2;
                break;
            }
        }
        if (typeVariable != null) {
            typeS = genericArrayType;
            map.put(typeVariable, typeS);
        }
        typeS = genericArrayType;
        return typeS;
    }

    private static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsD = d(typeVariable);
        if (clsD != null) {
            Type typeI = i(type, cls, clsD);
            if (typeI instanceof ParameterizedType) {
                return ((ParameterizedType) typeI).getActualTypeArguments()[m(clsD.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static WildcardType s(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f125542a);
    }

    public static WildcardType t(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
