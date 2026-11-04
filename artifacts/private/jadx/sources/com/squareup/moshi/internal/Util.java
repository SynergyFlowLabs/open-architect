package com.squareup.moshi.internal;

import com.squareup.moshi.a0;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import com.squareup.moshi.l;
import com.squareup.moshi.m;
import com.squareup.moshi.w;
import fj.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.v;

/* JADX INFO: loaded from: classes13.dex */
public final class Util {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<Annotation> f267158a = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type[] f267159b = new Type[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @h
    public static final Class<?> f267160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @h
    private static final Class<? extends Annotation> f267161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f267162e;

    public static final class GenericArrayTypeImpl implements GenericArrayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f267163a;

        public GenericArrayTypeImpl(Type type) {
            this.f267163a = Util.b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && a0.e(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f267163a;
        }

        public int hashCode() {
            return this.f267163a.hashCode();
        }

        public String toString() {
            return Util.z(this.f267163a) + v.f334777p;
        }
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @h
        private final Type f267164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f267165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Type[] f267166c;

        public ParameterizedTypeImpl(@h Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || a0.j(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f267164a = type == null ? null : Util.b(type);
            this.f267165b = Util.b(type2);
            this.f267166c = (Type[]) typeArr.clone();
            int i10 = 0;
            while (true) {
                Type[] typeArr2 = this.f267166c;
                if (i10 >= typeArr2.length) {
                    return;
                }
                typeArr2[i10].getClass();
                Util.c(this.f267166c[i10]);
                Type[] typeArr3 = this.f267166c;
                typeArr3[i10] = Util.b(typeArr3[i10]);
                i10++;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !a0.e(this, (ParameterizedType) obj)) {
                return false;
            }
            int i10 = 7 & 1;
            return true;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f267166c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @h
        public Type getOwnerType() {
            return this.f267164a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f267165b;
        }

        public int hashCode() {
            return Util.i(this.f267164a) ^ (Arrays.hashCode(this.f267166c) ^ this.f267165b.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((this.f267166c.length + 1) * 30);
            sb2.append(Util.z(this.f267165b));
            if (this.f267166c.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(Util.z(this.f267166c[0]));
            for (int i10 = 1; i10 < this.f267166c.length; i10++) {
                sb2.append(", ");
                sb2.append(Util.z(this.f267166c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static final class WildcardTypeImpl implements WildcardType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f267167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @h
        private final Type f267168b;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                Util.c(typeArr[0]);
                this.f267168b = null;
                this.f267167a = Util.b(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            Util.c(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f267168b = Util.b(typeArr2[0]);
            this.f267167a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && a0.e(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f267168b;
            return type != null ? new Type[]{type} : Util.f267159b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f267167a};
        }

        public int hashCode() {
            Type type = this.f267168b;
            return (this.f267167a.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
        }

        public String toString() {
            if (this.f267168b != null) {
                return "? super " + Util.z(this.f267168b);
            }
            if (this.f267167a == Object.class) {
                return com.planner5d.library.model.payments.a.f222474i;
            }
            return "? extends " + Util.z(this.f267167a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<? extends Annotation> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = 0;
        }
        f267161d = cls;
        f267160c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f267162e = Collections.unmodifiableMap(linkedHashMap);
    }

    private Util() {
    }

    public static boolean A(Type type, Type type2) {
        return a0.e(type, type2);
    }

    public static j B(String str, String str2, m mVar) {
        String strS = mVar.S();
        return new j(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, strS) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, strS));
    }

    public static <T> Class<T> a(Class<T> cls) {
        Class<T> cls2 = (Class) f267162e.get(cls);
        return cls2 == null ? cls : cls2;
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new GenericArrayTypeImpl(b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof ParameterizedTypeImpl) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof GenericArrayTypeImpl ? type : new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof WildcardTypeImpl)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    @h
    static Class<?> d(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    private static <T> Constructor<T> e(Class<T> cls) {
        for (Object obj : cls.getDeclaredConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length != 0 && parameterTypes[parameterTypes.length - 1].equals(f267160c)) {
                return constructor;
            }
        }
        throw new IllegalStateException("No defaults constructor found for " + cls);
    }

    @h
    public static com.squareup.moshi.h<?> f(w wVar, Type type, Class<?> cls) throws NoSuchMethodException {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        i iVar = (i) cls.getAnnotation(i.class);
        Class<?> cls2 = null;
        if (iVar != null && iVar.generateAdapter()) {
            try {
                try {
                    Class<?> cls3 = Class.forName(a0.g(cls.getName()), true, cls.getClassLoader());
                    try {
                        if (type instanceof ParameterizedType) {
                            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                            try {
                                declaredConstructor = cls3.getDeclaredConstructor(w.class, Type[].class);
                                objArr = new Object[]{wVar, actualTypeArguments};
                            } catch (NoSuchMethodException unused) {
                                declaredConstructor = cls3.getDeclaredConstructor(Type[].class);
                                objArr = new Object[]{actualTypeArguments};
                            }
                        } else {
                            try {
                                objArr = new Object[]{wVar};
                                declaredConstructor = cls3.getDeclaredConstructor(w.class);
                            } catch (NoSuchMethodException unused2) {
                                declaredConstructor = cls3.getDeclaredConstructor(null);
                                objArr = new Object[0];
                            }
                        }
                        declaredConstructor.setAccessible(true);
                        return ((com.squareup.moshi.h) declaredConstructor.newInstance(objArr)).j();
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        cls2 = cls3;
                        if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                            throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                        }
                        throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                    }
                } catch (NoSuchMethodException e11) {
                    e = e11;
                }
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e12);
            } catch (IllegalAccessException e13) {
                throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e13);
            } catch (InstantiationException e14) {
                throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e14);
            } catch (InvocationTargetException e15) {
                throw x(e15);
            }
        }
        return null;
    }

    public static Type g(Type type, Class<?> cls, Class<?> cls2) {
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
                    return g(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
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
                    return g(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static boolean h(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    static int i(@h Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    static int j(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean k(Set<? extends Annotation> set, Class<? extends Annotation> cls) {
        if (set.isEmpty()) {
            return false;
        }
        Iterator<? extends Annotation> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().annotationType() == cls) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(Class<?> cls) {
        Class<? extends Annotation> cls2 = f267161d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static boolean m(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set<? extends Annotation> n(AnnotatedElement annotatedElement) {
        return o(annotatedElement.getAnnotations());
    }

    public static Set<? extends Annotation> o(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(l.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f267158a;
    }

    public static String p(String str, @h g gVar) {
        if (gVar != null) {
            String strName = gVar.name();
            if (!g.Z2.equals(strName)) {
                return strName;
            }
        }
        return str;
    }

    public static String q(String str, AnnotatedElement annotatedElement) {
        return p(str, (g) annotatedElement.getAnnotation(g.class));
    }

    public static <T> Constructor<T> r(Class<T> cls) {
        if (f267160c == null) {
            throw new IllegalStateException("DefaultConstructorMarker not on classpath. Make sure the Kotlin stdlib is on the classpath.");
        }
        Constructor<T> constructorE = e(cls);
        constructorE.setAccessible(true);
        return constructorE;
    }

    public static j s(String str, String str2, m mVar) {
        String strS = mVar.S();
        return new j(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, strS) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, strS));
    }

    public static Type t(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    public static Type u(Type type, Class<?> cls, Type type2) {
        return v(type, cls, type2, new LinkedHashSet());
    }

    private static Type v(Type type, Class<?> cls, Type type2, Collection<TypeVariable<?>> collection) {
        Type type3;
        WildcardType wildcardType;
        Type typeV;
        while (type2 instanceof TypeVariable) {
            TypeVariable<?> typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = w(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeV2 = v(type, cls, componentType, collection);
                return componentType == typeV2 ? cls2 : a0.b(typeV2);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeV3 = v(type, cls, genericComponentType, collection);
            return genericComponentType == typeV3 ? genericArrayType : a0.b(typeV3);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeV4 = v(type, cls, ownerType, collection);
            boolean z10 = typeV4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                Type typeV5 = v(type, cls, actualTypeArguments[i10], collection);
                if (typeV5 != actualTypeArguments[i10]) {
                    if (!z10) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z10 = true;
                    }
                    actualTypeArguments[i10] = typeV5;
                }
            }
            return z10 ? new ParameterizedTypeImpl(typeV4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type2 instanceof WildcardType) {
            wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeV6 = v(type, cls, lowerBounds[0], collection);
                if (typeV6 != lowerBounds[0]) {
                    type3 = type2;
                    type3 = wildcardType;
                    return a0.q(typeV6);
                }
            } else if (upperBounds.length == 1 && (typeV = v(type, cls, upperBounds[0], collection)) != upperBounds[0]) {
                type3 = type2;
                type3 = wildcardType;
                type3 = wildcardType;
                return a0.p(typeV);
            }
        }
        type3 = type2;
        type3 = wildcardType;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        return type3;
    }

    static Type w(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsD = d(typeVariable);
        if (clsD != null) {
            Type typeG = g(type, cls, clsD);
            if (typeG instanceof ParameterizedType) {
                return ((ParameterizedType) typeG).getActualTypeArguments()[j(clsD.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static RuntimeException x(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
        throw new RuntimeException(targetException);
    }

    public static String y(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    static String z(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
