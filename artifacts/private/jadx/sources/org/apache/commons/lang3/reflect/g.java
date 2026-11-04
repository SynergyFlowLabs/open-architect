package org.apache.commons.lang3.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.text.b0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.v;
import org.apache.commons.lang3.c0;
import org.apache.commons.lang3.m;
import org.apache.commons.lang3.s;

/* JADX INFO: loaded from: classes14.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WildcardType f337260a = d0().c(Object.class).build();

    /* JADX INFO: Add missing generic type declarations: [T] */
    static class a<T> implements h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f337261a;

        a(Type type) {
            this.f337261a = type;
        }

        @Override // org.apache.commons.lang3.reflect.h
        public Type c() {
            return this.f337261a;
        }
    }

    private static final class b implements GenericArrayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f337262a;

        /* synthetic */ b(Type type, a aVar) {
            this(type);
        }

        public boolean equals(Object obj) {
            if (obj != this) {
                return (obj instanceof GenericArrayType) && g.j(this, (GenericArrayType) obj);
            }
            return true;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f337262a;
        }

        public int hashCode() {
            return this.f337262a.hashCode() | 1072;
        }

        public String toString() {
            return g.X(this);
        }

        private b(Type type) {
            this.f337262a = type;
        }
    }

    private static final class c implements ParameterizedType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f337263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f337264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Type[] f337265c;

        /* synthetic */ c(Class cls, Type type, Type[] typeArr, a aVar) {
            this(cls, type, typeArr);
        }

        public boolean equals(Object obj) {
            if (obj != this) {
                return (obj instanceof ParameterizedType) && g.k(this, (ParameterizedType) obj);
            }
            return true;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f337265c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f337264b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f337263a;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f337265c) | ((((this.f337263a.hashCode() | 1136) << 4) | Objects.hashCode(this.f337264b)) << 8);
        }

        public String toString() {
            return g.X(this);
        }

        private c(Class<?> cls, Type type, Type[] typeArr) {
            this.f337263a = cls;
            this.f337264b = type;
            this.f337265c = (Type[]) typeArr.clone();
        }
    }

    public static class d implements org.apache.commons.lang3.builder.a<WildcardType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Type[] f337266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Type[] f337267b;

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // org.apache.commons.lang3.builder.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WildcardType build() {
            return new e(this.f337266a, this.f337267b, null);
        }

        public d b(Type... typeArr) {
            this.f337267b = typeArr;
            return this;
        }

        public d c(Type... typeArr) {
            this.f337266a = typeArr;
            return this;
        }

        private d() {
        }
    }

    private static final class e implements WildcardType {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Type[] f337268c = new Type[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type[] f337269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type[] f337270b;

        /* synthetic */ e(Type[] typeArr, Type[] typeArr2, a aVar) {
            this(typeArr, typeArr2);
        }

        public boolean equals(Object obj) {
            return obj == this || ((obj instanceof WildcardType) && g.m(this, (WildcardType) obj));
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return (Type[]) this.f337270b.clone();
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return (Type[]) this.f337269a.clone();
        }

        public int hashCode() {
            return Arrays.hashCode(this.f337270b) | ((Arrays.hashCode(this.f337269a) | 18688) << 8);
        }

        public String toString() {
            return g.X(this);
        }

        private e(Type[] typeArr, Type[] typeArr2) {
            Type[] typeArr3 = f337268c;
            this.f337269a = (Type[]) s.r(typeArr, typeArr3);
            this.f337270b = (Type[]) s.r(typeArr2, typeArr3);
        }
    }

    public static Map<TypeVariable<?>, Type> A(ParameterizedType parameterizedType) {
        return B(parameterizedType, x(parameterizedType), null);
    }

    private static Map<TypeVariable<?>, Type> B(ParameterizedType parameterizedType, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        Map<TypeVariable<?>, Type> map2;
        Class<?> clsX = x(parameterizedType);
        if (!F(clsX, cls)) {
            return null;
        }
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType) ownerType;
            map2 = B(parameterizedType2, x(parameterizedType2), map);
        } else {
            map2 = map == null ? new HashMap<>() : new HashMap(map);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = clsX.getTypeParameters();
        for (int i10 = 0; i10 < typeParameters.length; i10++) {
            Type type = actualTypeArguments[i10];
            TypeVariable<Class<?>> typeVariable = typeParameters[i10];
            if (map2.containsKey(type)) {
                type = map2.get(type);
            }
            map2.put(typeVariable, type);
        }
        return cls.equals(clsX) ? map2 : D(t(clsX, cls), cls, map2);
    }

    public static Map<TypeVariable<?>, Type> C(Type type, Class<?> cls) {
        return D(type, cls, null);
    }

    private static Map<TypeVariable<?>, Type> D(Type type, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        if (type instanceof Class) {
            return z((Class) type, cls, map);
        }
        if (type instanceof ParameterizedType) {
            return B((ParameterizedType) type, cls, map);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (cls.isArray()) {
                cls = cls.getComponentType();
            }
            return D(genericComponentType, cls, map);
        }
        int i10 = 0;
        if (type instanceof WildcardType) {
            Type[] typeArrW = w((WildcardType) type);
            int length = typeArrW.length;
            while (i10 < length) {
                Type type2 = typeArrW[i10];
                if (F(type2, cls)) {
                    return D(type2, cls, map);
                }
                i10++;
            }
            return null;
        }
        if (!(type instanceof TypeVariable)) {
            throw new IllegalStateException("found an unhandled type: " + type);
        }
        Type[] typeArrU = u((TypeVariable) type);
        int length2 = typeArrU.length;
        while (i10 < length2) {
            Type type3 = typeArrU[i10];
            if (F(type3, cls)) {
                return D(type3, cls, map);
            }
            i10++;
        }
        return null;
    }

    public static boolean E(Type type) {
        return (type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray());
    }

    private static boolean F(Type type, Class<?> cls) {
        if (type == null) {
            if (cls != null && cls.isPrimitive()) {
                return false;
            }
            return true;
        }
        if (cls == null) {
            return false;
        }
        if (cls.equals(type)) {
            return true;
        }
        if (type instanceof Class) {
            return m.N((Class) type, cls);
        }
        if (type instanceof ParameterizedType) {
            return F(x((ParameterizedType) type), cls);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (F(type2, cls)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!cls.equals(Object.class) && (!cls.isArray() || !F(((GenericArrayType) type).getGenericComponentType(), cls.getComponentType()))) {
                return false;
            }
            return true;
        }
        if (type instanceof WildcardType) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    private static boolean G(Type type, GenericArrayType genericArrayType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (genericArrayType == null) {
            return false;
        }
        if (genericArrayType.equals(type)) {
            return true;
        }
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() && J(cls.getComponentType(), genericComponentType, map);
        }
        if (type instanceof GenericArrayType) {
            return J(((GenericArrayType) type).getGenericComponentType(), genericComponentType, map);
        }
        if (type instanceof WildcardType) {
            for (Type type2 : w((WildcardType) type)) {
                if (I(type2, genericArrayType)) {
                    return true;
                }
            }
            return false;
        }
        if (!(type instanceof TypeVariable)) {
            if (type instanceof ParameterizedType) {
                return false;
            }
            throw new IllegalStateException("found an unhandled type: " + type);
        }
        for (Type type3 : u((TypeVariable) type)) {
            if (I(type3, genericArrayType)) {
                return true;
            }
        }
        return false;
    }

    private static boolean H(Type type, ParameterizedType parameterizedType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (parameterizedType == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> clsX = x(parameterizedType);
        Map<TypeVariable<?>, Type> mapD = D(type, clsX, null);
        if (mapD == null) {
            return false;
        }
        if (mapD.isEmpty()) {
            return true;
        }
        Map<TypeVariable<?>, Type> mapB = B(parameterizedType, clsX, map);
        for (TypeVariable<?> typeVariable : mapB.keySet()) {
            Type typeB0 = b0(typeVariable, mapB);
            Type typeB1 = b0(typeVariable, mapD);
            if (typeB0 != null || !(typeB1 instanceof Class)) {
                if (typeB1 != null && !typeB0.equals(typeB1) && (!(typeB0 instanceof WildcardType) || !J(typeB1, typeB0, map))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean I(Type type, Type type2) {
        return J(type, type2, null);
    }

    private static boolean J(Type type, Type type2, Map<TypeVariable<?>, Type> map) {
        if (type2 == null || (type2 instanceof Class)) {
            return F(type, (Class) type2);
        }
        if (type2 instanceof ParameterizedType) {
            return H(type, (ParameterizedType) type2, map);
        }
        if (type2 instanceof GenericArrayType) {
            return G(type, (GenericArrayType) type2, map);
        }
        if (type2 instanceof WildcardType) {
            return L(type, (WildcardType) type2, map);
        }
        if (type2 instanceof TypeVariable) {
            return K(type, (TypeVariable) type2, map);
        }
        throw new IllegalStateException("found an unhandled type: " + type2);
    }

    private static boolean K(Type type, TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (typeVariable == null) {
            return false;
        }
        if (typeVariable.equals(type)) {
            return true;
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : u((TypeVariable) type)) {
                if (K(type2, typeVariable, map)) {
                    return true;
                }
            }
        }
        if ((type instanceof Class) || (type instanceof ParameterizedType) || (type instanceof GenericArrayType) || (type instanceof WildcardType)) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    private static boolean L(Type type, WildcardType wildcardType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (wildcardType == null) {
            return false;
        }
        if (wildcardType.equals(type)) {
            return true;
        }
        Type[] typeArrW = w(wildcardType);
        Type[] typeArrV = v(wildcardType);
        if (!(type instanceof WildcardType)) {
            for (Type type2 : typeArrW) {
                if (!J(type, U(type2, map), map)) {
                    return false;
                }
            }
            for (Type type3 : typeArrV) {
                if (!J(U(type3, map), type, map)) {
                    return false;
                }
            }
            return true;
        }
        WildcardType wildcardType2 = (WildcardType) type;
        Type[] typeArrW2 = w(wildcardType2);
        Type[] typeArrV2 = v(wildcardType2);
        for (Type type4 : typeArrW) {
            Type typeU = U(type4, map);
            for (Type type5 : typeArrW2) {
                if (!J(type5, typeU, map)) {
                    return false;
                }
            }
        }
        for (Type type6 : typeArrV) {
            Type typeU2 = U(type6, map);
            for (Type type7 : typeArrV2) {
                if (!J(typeU2, type7, map)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean M(Object obj, Type type) {
        if (type == null) {
            return false;
        }
        if (obj == null) {
            return ((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true;
        }
        return J(obj.getClass(), type, null);
    }

    private static <T> void N(Class<T> cls, ParameterizedType parameterizedType, Map<TypeVariable<?>, Type> map) {
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            N(cls, (ParameterizedType) ownerType, map);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = x(parameterizedType).getTypeParameters();
        List listAsList = Arrays.asList(cls.getTypeParameters());
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            TypeVariable<Class<?>> typeVariable = typeParameters[i10];
            Type type = actualTypeArguments[i10];
            if (listAsList.contains(type) && map.containsKey(typeVariable)) {
                map.put((TypeVariable) type, map.get(typeVariable));
            }
        }
    }

    public static Type[] O(Type[] typeArr) {
        c0.P(typeArr, "null value specified for bounds array", new Object[0]);
        if (typeArr.length < 2) {
            return typeArr;
        }
        HashSet hashSet = new HashSet(typeArr.length);
        for (Type type : typeArr) {
            int length = typeArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    hashSet.add(type);
                    break;
                }
                Type type2 = typeArr[i10];
                if (type != type2 && J(type2, type, null)) {
                    break;
                }
                i10++;
            }
        }
        return (Type[]) hashSet.toArray(new Type[hashSet.size()]);
    }

    public static final ParameterizedType P(Class<?> cls, Map<TypeVariable<?>, Type> map) {
        c0.P(cls, "raw class is null", new Object[0]);
        c0.P(map, "typeArgMappings is null", new Object[0]);
        return S(null, cls, o(map, cls.getTypeParameters()));
    }

    public static final ParameterizedType Q(Class<?> cls, Type... typeArr) {
        return S(null, cls, typeArr);
    }

    public static final ParameterizedType R(Type type, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        c0.P(cls, "raw class is null", new Object[0]);
        c0.P(map, "typeArgMappings is null", new Object[0]);
        return S(type, cls, o(map, cls.getTypeParameters()));
    }

    public static final ParameterizedType S(Type type, Class<?> cls, Type... typeArr) {
        c0.P(cls, "raw class is null", new Object[0]);
        a aVar = null;
        if (cls.getEnclosingClass() == null) {
            c0.v(type == null, "no owner allowed for top-level %s", cls);
            type = null;
        } else if (type == null) {
            type = cls.getEnclosingClass();
        } else {
            c0.v(F(type, cls.getEnclosingClass()), "%s is invalid owner type for parameterized %s", type, cls);
        }
        c0.B(typeArr, "null type argument at index %s", new Object[0]);
        c0.v(cls.getTypeParameters().length == typeArr.length, "invalid number of type parameters specified: expected %d, got %d", Integer.valueOf(cls.getTypeParameters().length), Integer.valueOf(typeArr.length));
        return new c(cls, type, typeArr, aVar);
    }

    private static String T(ParameterizedType parameterizedType) {
        StringBuilder sb2 = new StringBuilder();
        Type ownerType = parameterizedType.getOwnerType();
        Class cls = (Class) parameterizedType.getRawType();
        if (ownerType == null) {
            sb2.append(cls.getName());
        } else {
            if (ownerType instanceof Class) {
                sb2.append(((Class) ownerType).getName());
            } else {
                sb2.append(ownerType.toString());
            }
            sb2.append('.');
            sb2.append(cls.getSimpleName());
        }
        int[] iArrP = p(parameterizedType);
        if (iArrP.length > 0) {
            e(sb2, iArrP, parameterizedType.getActualTypeArguments());
        } else {
            sb2.append(b0.f313280e);
            d(sb2, ", ", parameterizedType.getActualTypeArguments()).append(b0.f313281f);
        }
        return sb2.toString();
    }

    private static Type U(Type type, Map<TypeVariable<?>, Type> map) {
        if (!(type instanceof TypeVariable) || map == null) {
            return type;
        }
        Type type2 = map.get(type);
        if (type2 != null) {
            return type2;
        }
        throw new IllegalArgumentException("missing assignment type for type variable " + type);
    }

    public static String V(TypeVariable<?> typeVariable) {
        c0.P(typeVariable, "var is null", new Object[0]);
        StringBuilder sb2 = new StringBuilder();
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class<?> enclosingClass = (Class) genericDeclaration;
            while (enclosingClass.getEnclosingClass() != null) {
                sb2.insert(0, enclosingClass.getSimpleName()).insert(0, '.');
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            sb2.insert(0, enclosingClass.getName());
        } else if (genericDeclaration instanceof Type) {
            sb2.append(X((Type) genericDeclaration));
        } else {
            sb2.append(genericDeclaration);
        }
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(Y(typeVariable));
        return sb2.toString();
    }

    private static <T> String W(T t10) {
        return t10 instanceof Type ? X((Type) t10) : t10.toString();
    }

    public static String X(Type type) {
        c0.O(type);
        if (type instanceof Class) {
            return f((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return T((ParameterizedType) type);
        }
        if (type instanceof WildcardType) {
            return e0((WildcardType) type);
        }
        if (type instanceof TypeVariable) {
            return Y((TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return r((GenericArrayType) type);
        }
        throw new IllegalArgumentException(s.w(type));
    }

    private static String Y(TypeVariable<?> typeVariable) {
        StringBuilder sb2 = new StringBuilder(typeVariable.getName());
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length > 0 && (bounds.length != 1 || !Object.class.equals(bounds[0]))) {
            sb2.append(" extends ");
            d(sb2, " & ", typeVariable.getBounds());
        }
        return sb2.toString();
    }

    public static boolean Z(Map<TypeVariable<?>, Type> map) {
        c0.P(map, "typeVarAssigns is null", new Object[0]);
        for (Map.Entry<TypeVariable<?>, Type> entry : map.entrySet()) {
            TypeVariable<?> key = entry.getKey();
            Type value = entry.getValue();
            for (Type type : u(key)) {
                if (!J(value, U(type, map), map)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Type[] a0(Map<TypeVariable<?>, Type> map, Type[] typeArr) {
        int i10 = 0;
        while (i10 < typeArr.length) {
            Type typeC0 = c0(map, typeArr[i10]);
            if (typeC0 == null) {
                typeArr = (Type[]) org.apache.commons.lang3.c.j2(typeArr, i10);
                i10--;
            } else {
                typeArr[i10] = typeC0;
            }
            i10++;
        }
        return typeArr;
    }

    private static Type b0(TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
        Type type;
        while (true) {
            type = map.get(typeVariable);
            if (!(type instanceof TypeVariable) || type.equals(typeVariable)) {
                break;
            }
            typeVariable = (TypeVariable) type;
        }
        return type;
    }

    public static Type c0(Map<TypeVariable<?>, Type> map, Type type) {
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        if (g(type)) {
            if (type instanceof TypeVariable) {
                return c0(map, map.get(type));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getOwnerType() != null) {
                    HashMap map2 = new HashMap(map);
                    map2.putAll(A(parameterizedType));
                    map = map2;
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                    Type typeC0 = c0(map, actualTypeArguments[i10]);
                    if (typeC0 != null) {
                        actualTypeArguments[i10] = typeC0;
                    }
                }
                return S(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), actualTypeArguments);
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return d0().c(a0(map, wildcardType.getUpperBounds())).b(a0(map, wildcardType.getLowerBounds())).build();
            }
        }
        return type;
    }

    private static <T> StringBuilder d(StringBuilder sb2, String str, T... tArr) {
        c0.K(c0.A(tArr));
        if (tArr.length > 0) {
            sb2.append(W(tArr[0]));
            for (int i10 = 1; i10 < tArr.length; i10++) {
                sb2.append(str);
                sb2.append(W(tArr[i10]));
            }
        }
        return sb2;
    }

    public static d d0() {
        return new d(null);
    }

    private static void e(StringBuilder sb2, int[] iArr, Type[] typeArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            sb2.append(b0.f313280e);
            d(sb2, ", ", typeArr[i10].toString()).append(b0.f313281f);
        }
        Type[] typeArr2 = (Type[]) org.apache.commons.lang3.c.u2(typeArr, iArr);
        if (typeArr2.length > 0) {
            sb2.append(b0.f313280e);
            d(sb2, ", ", typeArr2).append(b0.f313281f);
        }
    }

    private static String e0(WildcardType wildcardType) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('?');
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length > 1 || (lowerBounds.length == 1 && lowerBounds[0] != null)) {
            sb2.append(" super ");
            d(sb2, " & ", lowerBounds);
        } else if (upperBounds.length > 1 || (upperBounds.length == 1 && !Object.class.equals(upperBounds[0]))) {
            sb2.append(" extends ");
            d(sb2, " & ", upperBounds);
        }
        return sb2.toString();
    }

    private static String f(Class<?> cls) {
        if (cls.isArray()) {
            return X(cls.getComponentType()) + v.f334777p;
        }
        StringBuilder sb2 = new StringBuilder();
        if (cls.getEnclosingClass() != null) {
            sb2.append(f(cls.getEnclosingClass()));
            sb2.append('.');
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(cls.getName());
        }
        if (cls.getTypeParameters().length > 0) {
            sb2.append(b0.f313280e);
            d(sb2, ", ", cls.getTypeParameters());
            sb2.append(b0.f313281f);
        }
        return sb2.toString();
    }

    public static <T> h<T> f0(Class<T> cls) {
        return g0(cls);
    }

    public static boolean g(Type type) {
        if (type instanceof TypeVariable) {
            return true;
        }
        if (type instanceof Class) {
            return ((Class) type).getTypeParameters().length > 0;
        }
        if (!(type instanceof ParameterizedType)) {
            if (!(type instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            return g(v(wildcardType)[0]) || g(w(wildcardType)[0]);
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (g(type2)) {
                return true;
            }
        }
        return false;
    }

    public static <T> h<T> g0(Type type) {
        return new a(type);
    }

    private static boolean h(TypeVariable<?> typeVariable, ParameterizedType parameterizedType) {
        return org.apache.commons.lang3.c.S(typeVariable.getBounds(), parameterizedType);
    }

    public static Map<TypeVariable<?>, Type> i(Class<?> cls, ParameterizedType parameterizedType) {
        c0.P(cls, "cls is null", new Object[0]);
        c0.P(parameterizedType, "superType is null", new Object[0]);
        Class<?> clsX = x(parameterizedType);
        if (!F(cls, clsX)) {
            return null;
        }
        if (cls.equals(clsX)) {
            return B(parameterizedType, clsX, null);
        }
        Type typeT = t(cls, clsX);
        if (typeT instanceof Class) {
            return i((Class) typeT, parameterizedType);
        }
        ParameterizedType parameterizedType2 = (ParameterizedType) typeT;
        Map<TypeVariable<?>, Type> mapI = i(x(parameterizedType2), parameterizedType);
        N(cls, parameterizedType2, mapI);
        return mapI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(GenericArrayType genericArrayType, Type type) {
        return (type instanceof GenericArrayType) && l(genericArrayType.getGenericComponentType(), ((GenericArrayType) type).getGenericComponentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(ParameterizedType parameterizedType, Type type) {
        if (!(type instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType2 = (ParameterizedType) type;
        if (l(parameterizedType.getRawType(), parameterizedType2.getRawType()) && l(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType())) {
            return n(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        return false;
    }

    public static boolean l(Type type, Type type2) {
        if (Objects.equals(type, type2)) {
            return true;
        }
        if (type instanceof ParameterizedType) {
            return k((ParameterizedType) type, type2);
        }
        if (type instanceof GenericArrayType) {
            return j((GenericArrayType) type, type2);
        }
        if (type instanceof WildcardType) {
            return m((WildcardType) type, type2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(WildcardType wildcardType, Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType2 = (WildcardType) type;
            if (n(v(wildcardType), v(wildcardType2)) && n(w(wildcardType), w(wildcardType2))) {
                return true;
            }
        }
        return false;
    }

    private static boolean n(Type[] typeArr, Type[] typeArr2) {
        if (typeArr.length != typeArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < typeArr.length; i10++) {
            if (!l(typeArr[i10], typeArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    private static Type[] o(Map<TypeVariable<?>, Type> map, TypeVariable<?>[] typeVariableArr) {
        Type[] typeArr = new Type[typeVariableArr.length];
        int length = typeVariableArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            TypeVariable<?> typeVariable = typeVariableArr[i10];
            c0.v(map.containsKey(typeVariable), "missing argument mapping for %s", X(typeVariable));
            typeArr[i11] = map.get(typeVariable);
            i10++;
            i11++;
        }
        return typeArr;
    }

    private static int[] p(ParameterizedType parameterizedType) {
        Type[] typeArr = (Type[]) Arrays.copyOf(parameterizedType.getActualTypeArguments(), parameterizedType.getActualTypeArguments().length);
        int[] iArrJ = new int[0];
        for (int i10 = 0; i10 < typeArr.length; i10++) {
            Type type = typeArr[i10];
            if ((type instanceof TypeVariable) && h((TypeVariable) type, parameterizedType)) {
                iArrJ = org.apache.commons.lang3.c.j(iArrJ, i10);
            }
        }
        return iArrJ;
    }

    public static GenericArrayType q(Type type) {
        return new b((Type) c0.P(type, "componentType is null", new Object[0]), null);
    }

    private static String r(GenericArrayType genericArrayType) {
        return String.format("%s[]", X(genericArrayType.getGenericComponentType()));
    }

    public static Type s(Type type) {
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return ((GenericArrayType) type).getGenericComponentType();
            }
            return null;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return cls.getComponentType();
        }
        return null;
    }

    private static Type t(Class<?> cls, Class<?> cls2) {
        Class<?> clsX;
        if (cls2.isInterface()) {
            Type type = null;
            for (Type type2 : cls.getGenericInterfaces()) {
                if (type2 instanceof ParameterizedType) {
                    clsX = x((ParameterizedType) type2);
                } else {
                    if (!(type2 instanceof Class)) {
                        throw new IllegalStateException("Unexpected generic interface type found: " + type2);
                    }
                    clsX = (Class) type2;
                }
                if (F(clsX, cls2) && I(type, clsX)) {
                    type = type2;
                }
            }
            if (type != null) {
                return type;
            }
        }
        return cls.getGenericSuperclass();
    }

    public static Type[] u(TypeVariable<?> typeVariable) {
        c0.P(typeVariable, "typeVariable is null", new Object[0]);
        Type[] bounds = typeVariable.getBounds();
        return bounds.length == 0 ? new Type[]{Object.class} : O(bounds);
    }

    public static Type[] v(WildcardType wildcardType) {
        c0.P(wildcardType, "wildcardType is null", new Object[0]);
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length == 0 ? new Type[]{null} : lowerBounds;
    }

    public static Type[] w(WildcardType wildcardType) {
        c0.P(wildcardType, "wildcardType is null", new Object[0]);
        Type[] upperBounds = wildcardType.getUpperBounds();
        return upperBounds.length == 0 ? new Type[]{Object.class} : O(upperBounds);
    }

    private static Class<?> x(ParameterizedType parameterizedType) {
        Type rawType = parameterizedType.getRawType();
        if (rawType instanceof Class) {
            return (Class) rawType;
        }
        throw new IllegalStateException("Wait... What!? Type of rawType: " + rawType);
    }

    public static Class<?> y(Type type, Type type2) {
        Map<TypeVariable<?>, Type> mapC;
        Type type3;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return x((ParameterizedType) type);
        }
        if (type instanceof TypeVariable) {
            if (type2 == null) {
                return null;
            }
            GenericDeclaration genericDeclaration = ((TypeVariable) type).getGenericDeclaration();
            if (!(genericDeclaration instanceof Class) || (mapC = C(type2, (Class) genericDeclaration)) == null || (type3 = mapC.get(type)) == null) {
                return null;
            }
            return y(type3, type2);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(y(((GenericArrayType) type).getGenericComponentType(), type2), 0).getClass();
        }
        if (type instanceof WildcardType) {
            return null;
        }
        throw new IllegalArgumentException("unknown type: " + type);
    }

    private static Map<TypeVariable<?>, Type> z(Class<?> cls, Class<?> cls2, Map<TypeVariable<?>, Type> map) {
        if (!F(cls, cls2)) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (cls2.isPrimitive()) {
                return new HashMap();
            }
            cls = m.U(cls);
        }
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        return cls2.equals(cls) ? map2 : D(t(cls, cls2), cls2, map2);
    }
}
