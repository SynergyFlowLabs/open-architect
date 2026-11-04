package com.google.common.reflect;

import com.google.common.base.a0;
import com.google.common.base.d0;
import com.google.common.base.j0;
import com.google.common.base.l0;
import com.google.common.collect.l6;
import com.google.common.collect.n6;
import com.google.common.collect.nb;
import com.google.common.collect.o7;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.b0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.d
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a0 f119887a = a0.p(", ").s(AbstractJsonLexerKt.NULL);

    class a extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f119888b;

        a(final AtomicReference val$result) {
            this.f119888b = val$result;
        }

        @Override // com.google.common.reflect.s
        void b(Class<?> t10) {
            this.f119888b.set(t10.getComponentType());
        }

        @Override // com.google.common.reflect.s
        void c(GenericArrayType t10) {
            this.f119888b.set(t10.getGenericComponentType());
        }

        @Override // com.google.common.reflect.s
        void e(TypeVariable<?> t10) {
            this.f119888b.set(t.p(t10.getBounds()));
        }

        @Override // com.google.common.reflect.s
        void f(WildcardType t10) {
            this.f119888b.set(t.p(t10.getUpperBounds()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f119889a = new a("OWNED_BY_ENCLOSING_CLASS", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f119890b = new c("LOCAL_CLASS_HAS_NO_OWNER", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f119892d = k();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f119891c = l();

        final enum a extends b {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.reflect.t.b
            @fj.a
            Class<?> n(Class<?> rawType) {
                return rawType.getEnclosingClass();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.t$b$b, reason: collision with other inner class name */
        class C1114b<T> {
            C1114b() {
            }
        }

        final enum c extends b {
            c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.reflect.t.b
            @fj.a
            Class<?> n(Class<?> rawType) {
                if (rawType.isLocalClass()) {
                    return null;
                }
                return rawType.getEnclosingClass();
            }
        }

        class d extends C1114b<String> {
            d() {
            }
        }

        private b(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ b[] k() {
            return new b[]{f119889a, f119890b};
        }

        private static b l() {
            new d();
            ParameterizedType parameterizedType = (ParameterizedType) d.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (b bVar : values()) {
                if (bVar.n(C1114b.class) == parameterizedType2.getOwnerType()) {
                    return bVar;
                }
            }
            throw new AssertionError();
        }

        public static b valueOf(String name) {
            return (b) Enum.valueOf(b.class, name);
        }

        public static b[] values() {
            return (b[]) f119892d.clone();
        }

        @fj.a
        abstract Class<?> n(Class<?> rawType);

        /* synthetic */ b(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    private static final class c implements GenericArrayType, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f119893b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f119894a;

        c(Type componentType) {
            this.f119894a = d.f119899e.q(componentType);
        }

        public boolean equals(@fj.a Object obj) {
            if (obj instanceof GenericArrayType) {
                return d0.a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f119894a;
        }

        public int hashCode() {
            return this.f119894a.hashCode();
        }

        public String toString() {
            return t.s(this.f119894a) + okhttp3.v.f334777p;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f119895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f119896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f119897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f119898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final d f119899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ d[] f119900f;

        final enum a extends d {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.reflect.t.d
            Type q(Type type) {
                j0.E(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new c(cls.getComponentType()) : type;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.t.d
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public GenericArrayType n(Type componentType) {
                return new c(componentType);
            }
        }

        final enum b extends d {
            b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.reflect.t.d
            Type n(Type componentType) {
                return componentType instanceof Class ? t.h((Class) componentType) : new c(componentType);
            }

            @Override // com.google.common.reflect.t.d
            Type q(Type type) {
                return (Type) j0.E(type);
            }
        }

        final enum c extends d {
            c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.reflect.t.d
            Type n(Type componentType) {
                return d.f119896b.n(componentType);
            }

            @Override // com.google.common.reflect.t.d
            String o(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    throw new RuntimeException(e10);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                }
            }

            @Override // com.google.common.reflect.t.d
            Type q(Type type) {
                return d.f119896b.q(type);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.t$d$d, reason: collision with other inner class name */
        final enum C1115d extends d {
            C1115d(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.reflect.t.d
            boolean l() {
                return false;
            }

            @Override // com.google.common.reflect.t.d
            Type n(Type componentType) {
                return d.f119897c.n(componentType);
            }

            @Override // com.google.common.reflect.t.d
            String o(Type type) {
                return d.f119897c.o(type);
            }

            @Override // com.google.common.reflect.t.d
            Type q(Type type) {
                return d.f119897c.q(type);
            }
        }

        class e extends m<Map.Entry<String, int[][]>> {
            e() {
            }
        }

        class f extends m<int[]> {
            f() {
            }
        }

        static {
            a aVar = new a("JAVA6", 0);
            f119895a = aVar;
            b bVar = new b("JAVA7", 1);
            f119896b = bVar;
            c cVar = new c("JAVA8", 2);
            f119897c = cVar;
            C1115d c1115d = new C1115d("JAVA9", 3);
            f119898d = c1115d;
            f119900f = k();
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new e().a().toString().contains("java.util.Map.java.util.Map")) {
                    f119899e = cVar;
                    return;
                } else {
                    f119899e = c1115d;
                    return;
                }
            }
            if (new f().a() instanceof Class) {
                f119899e = bVar;
            } else {
                f119899e = aVar;
            }
        }

        private d(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ d[] k() {
            return new d[]{f119895a, f119896b, f119897c, f119898d};
        }

        public static d valueOf(String name) {
            return (d) Enum.valueOf(d.class, name);
        }

        public static d[] values() {
            return (d[]) f119900f.clone();
        }

        boolean l() {
            return true;
        }

        abstract Type n(Type componentType);

        String o(Type type) {
            return t.s(type);
        }

        final l6<Type> p(Type[] types) {
            l6.a aVarS = l6.s();
            for (Type type : types) {
                aVarS.a(q(type));
            }
            return aVarS.e();
        }

        abstract Type q(Type type);

        /* synthetic */ d(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    static final class e<X> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final boolean f119901a = !e.class.getTypeParameters()[0].equals(t.k(e.class, org.locationtech.jts.io.gml2.a.f338503u, new Type[0]));

        e() {
        }
    }

    private static final class f implements ParameterizedType, Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f119902d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        private final Type f119903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l6<Type> f119904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<?> f119905c;

        f(@fj.a Type ownerType, Class<?> rawType, Type[] typeArguments) {
            j0.E(rawType);
            j0.d(typeArguments.length == rawType.getTypeParameters().length);
            t.f(typeArguments, "type parameter");
            this.f119903a = ownerType;
            this.f119905c = rawType;
            this.f119904b = d.f119899e.p(typeArguments);
        }

        public boolean equals(@fj.a Object other) {
            if (!(other instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) other;
            return getRawType().equals(parameterizedType.getRawType()) && d0.a(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return t.r(this.f119904b);
        }

        @Override // java.lang.reflect.ParameterizedType
        @fj.a
        public Type getOwnerType() {
            return this.f119903a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f119905c;
        }

        public int hashCode() {
            Type type = this.f119903a;
            return this.f119905c.hashCode() ^ ((type == null ? 0 : type.hashCode()) ^ this.f119904b.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f119903a != null) {
                d dVar = d.f119899e;
                if (dVar.l()) {
                    sb2.append(dVar.o(this.f119903a));
                    sb2.append('.');
                }
            }
            sb2.append(this.f119905c.getName());
            sb2.append(b0.f313280e);
            a0 a0Var = t.f119887a;
            l6<Type> l6Var = this.f119904b;
            final d dVar2 = d.f119899e;
            Objects.requireNonNull(dVar2);
            sb2.append(a0Var.k(o7.T(l6Var, new com.google.common.base.t() { // from class: com.google.common.reflect.u
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return dVar2.o((Type) obj);
                }
            })));
            sb2.append(b0.f313281f);
            return sb2.toString();
        }
    }

    private static final class g<D extends GenericDeclaration> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final D f119906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f119907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l6<Type> f119908c;

        g(D genericDeclaration, String name, Type[] bounds) {
            t.f(bounds, "bound for type variable");
            this.f119906a = (D) j0.E(genericDeclaration);
            this.f119907b = (String) j0.E(name);
            this.f119908c = l6.B(bounds);
        }

        public Type[] a() {
            return t.r(this.f119908c);
        }

        public D b() {
            return this.f119906a;
        }

        public String c() {
            return this.f119907b;
        }

        public String d() {
            return this.f119907b;
        }

        public boolean equals(@fj.a Object obj) {
            if (!e.f119901a) {
                if (obj instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) obj;
                    if (this.f119907b.equals(typeVariable.getName()) && this.f119906a.equals(typeVariable.getGenericDeclaration())) {
                        return true;
                    }
                }
                return false;
            }
            if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof h)) {
                g gVar = ((h) Proxy.getInvocationHandler(obj)).f119910a;
                if (this.f119907b.equals(gVar.c()) && this.f119906a.equals(gVar.b()) && this.f119908c.equals(gVar.f119908c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f119907b.hashCode() ^ this.f119906a.hashCode();
        }

        public String toString() {
            return this.f119907b;
        }
    }

    private static final class h implements InvocationHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final n6<String, Method> f119909b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g<?> f119910a;

        static {
            n6.b bVarB = n6.b();
            for (Method method : g.class.getMethods()) {
                if (method.getDeclaringClass().equals(g.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    bVarB.i(method.getName(), method);
                }
            }
            f119909b = bVarB.c();
        }

        h(g<?> typeVariableImpl) {
            this.f119910a = typeVariableImpl;
        }

        @Override // java.lang.reflect.InvocationHandler
        @fj.a
        public Object invoke(Object proxy, Method method, @fj.a Object[] args) throws Throwable {
            String name = method.getName();
            Method method2 = f119909b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f119910a, args);
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        }
    }

    static final class i implements WildcardType, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f119911c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l6<Type> f119912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l6<Type> f119913b;

        i(Type[] lowerBounds, Type[] upperBounds) {
            t.f(lowerBounds, "lower bound for wildcard");
            t.f(upperBounds, "upper bound for wildcard");
            d dVar = d.f119899e;
            this.f119912a = dVar.p(lowerBounds);
            this.f119913b = dVar.p(upperBounds);
        }

        public boolean equals(@fj.a Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (this.f119912a.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f119913b.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return t.r(this.f119912a);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return t.r(this.f119913b);
        }

        public int hashCode() {
            return this.f119913b.hashCode() ^ this.f119912a.hashCode();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(com.planner5d.library.model.payments.a.f222474i);
            nb<Type> it = this.f119912a.iterator();
            while (it.hasNext()) {
                Type next = it.next();
                sb2.append(" super ");
                sb2.append(d.f119899e.o(next));
            }
            for (Type type : t.g(this.f119913b)) {
                sb2.append(" extends ");
                sb2.append(d.f119899e.o(type));
            }
            return sb2.toString();
        }
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Type[] types, String usedAs) {
        for (Type type : types) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                j0.y(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, usedAs);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterable<Type> g(Iterable<Type> bounds) {
        return o7.o(bounds, l0.q(l0.m(Object.class)));
    }

    static Class<?> h(Class<?> componentType) {
        return Array.newInstance(componentType, 0).getClass();
    }

    @fj.a
    static Type i(Type type) {
        j0.E(type);
        AtomicReference atomicReference = new AtomicReference();
        new a(atomicReference).a(type);
        return (Type) atomicReference.get();
    }

    static Type j(Type componentType) {
        if (!(componentType instanceof WildcardType)) {
            return d.f119899e.n(componentType);
        }
        WildcardType wildcardType = (WildcardType) componentType;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        boolean z10 = true;
        j0.e(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return q(j(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            z10 = false;
        }
        j0.e(z10, "Wildcard should have only one upper bound.");
        return o(j(upperBounds[0]));
    }

    static <D extends GenericDeclaration> TypeVariable<D> k(D declaration, String name, Type... bounds) {
        if (bounds.length == 0) {
            bounds = new Type[]{Object.class};
        }
        return n(declaration, name, bounds);
    }

    static ParameterizedType l(Class<?> rawType, Type... arguments) {
        return new f(b.f119891c.n(rawType), rawType, arguments);
    }

    static ParameterizedType m(@fj.a Type ownerType, Class<?> rawType, Type... arguments) {
        if (ownerType == null) {
            return l(rawType, arguments);
        }
        j0.E(arguments);
        j0.u(rawType.getEnclosingClass() != null, "Owner type for unenclosed %s", rawType);
        return new f(ownerType, rawType, arguments);
    }

    private static <D extends GenericDeclaration> TypeVariable<D> n(D genericDeclaration, String name, Type[] bounds) {
        return (TypeVariable) l.d(TypeVariable.class, new h(new g(genericDeclaration, name, bounds)));
    }

    @com.google.common.annotations.e
    static WildcardType o(Type upperBound) {
        return new i(new Type[0], new Type[]{upperBound});
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fj.a
    public static Type p(Type[] bounds) {
        for (Type type : bounds) {
            Type typeI = i(type);
            if (typeI != null) {
                if (typeI instanceof Class) {
                    Class cls = (Class) typeI;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return o(typeI);
            }
        }
        return null;
    }

    @com.google.common.annotations.e
    static WildcardType q(Type lowerBound) {
        return new i(new Type[]{lowerBound}, new Type[]{Object.class});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Type[] r(Collection<Type> types) {
        return (Type[]) types.toArray(new Type[0]);
    }

    static String s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
