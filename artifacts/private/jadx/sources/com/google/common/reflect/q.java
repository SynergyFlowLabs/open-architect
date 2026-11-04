package com.google.common.reflect;

import com.google.common.base.a0;
import com.google.common.base.j0;
import com.google.common.base.k0;
import com.google.common.collect.a9;
import com.google.common.collect.b8;
import com.google.common.collect.l6;
import com.google.common.collect.n6;
import com.google.common.collect.nb;
import com.google.common.collect.o5;
import com.google.common.collect.s4;
import com.google.common.collect.z6;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.d
public abstract class q<T> extends m<T> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f119855d = 3637540370352322684L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f119856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient o f119857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient o f119858c;

    class a extends com.google.common.reflect.g.b<T> {
        a(Method method) {
            super(method);
        }

        @Override // com.google.common.reflect.g.b, com.google.common.reflect.g
        Type[] d() {
            return q.this.r().l(super.d());
        }

        @Override // com.google.common.reflect.g.b, com.google.common.reflect.g
        Type[] e() {
            return q.this.u().l(super.e());
        }

        @Override // com.google.common.reflect.g.b, com.google.common.reflect.g
        Type f() {
            return q.this.r().j(super.f());
        }

        @Override // com.google.common.reflect.g
        public q<T> g() {
            return q.this;
        }

        @Override // com.google.common.reflect.g
        public String toString() {
            return g() + "." + super.toString();
        }
    }

    class b extends com.google.common.reflect.g.a<T> {
        b(Constructor constructor) {
            super(constructor);
        }

        @Override // com.google.common.reflect.g.a, com.google.common.reflect.g
        Type[] d() {
            return q.this.r().l(super.d());
        }

        @Override // com.google.common.reflect.g.a, com.google.common.reflect.g
        Type[] e() {
            return q.this.u().l(super.e());
        }

        @Override // com.google.common.reflect.g.a, com.google.common.reflect.g
        Type f() {
            return q.this.r().j(super.f());
        }

        @Override // com.google.common.reflect.g
        public q<T> g() {
            return q.this;
        }

        @Override // com.google.common.reflect.g
        public String toString() {
            return g() + "(" + a0.p(", ").n(e()) + ")";
        }
    }

    class c extends s {
        c() {
        }

        @Override // com.google.common.reflect.s
        void c(GenericArrayType type) {
            a(type.getGenericComponentType());
        }

        @Override // com.google.common.reflect.s
        void d(ParameterizedType type) {
            a(type.getActualTypeArguments());
            a(type.getOwnerType());
        }

        @Override // com.google.common.reflect.s
        void e(TypeVariable<?> type) {
            throw new IllegalArgumentException(q.this.f119856a + "contains a type variable and is not safe for the operation");
        }

        @Override // com.google.common.reflect.s
        void f(WildcardType type) {
            a(type.getLowerBounds());
            a(type.getUpperBounds());
        }
    }

    class d extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z6.a f119862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f119863c;

        d(final q this$0, final z6.a val$builder) {
            this.f119862b = val$builder;
            this.f119863c = this$0;
        }

        @Override // com.google.common.reflect.s
        void b(Class<?> t10) {
            this.f119862b.a(t10);
        }

        @Override // com.google.common.reflect.s
        void c(GenericArrayType t10) {
            this.f119862b.a(t.h(q.T(t10.getGenericComponentType()).w()));
        }

        @Override // com.google.common.reflect.s
        void d(ParameterizedType t10) {
            this.f119862b.a((Class) t10.getRawType());
        }

        @Override // com.google.common.reflect.s
        void e(TypeVariable<?> t10) {
            a(t10.getBounds());
        }

        @Override // com.google.common.reflect.s
        void f(WildcardType t10) {
            a(t10.getUpperBounds());
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type[] f119864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f119865b;

        e(Type[] bounds, boolean target) {
            this.f119864a = bounds;
            this.f119865b = target;
        }

        boolean a(Type supertype) {
            for (Type type : this.f119864a) {
                boolean zJ = q.T(type).J(supertype);
                boolean z10 = this.f119865b;
                if (zJ == z10) {
                    return z10;
                }
            }
            return !this.f119865b;
        }

        boolean b(Type subtype) {
            q<?> qVarT = q.T(subtype);
            for (Type type : this.f119864a) {
                boolean zJ = qVarT.J(type);
                boolean z10 = this.f119865b;
                if (zJ == z10) {
                    return z10;
                }
            }
            return !this.f119865b;
        }
    }

    private final class f extends q<T>.k {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f119866f = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        private transient z6<q<? super T>> f119867d;

        private f() {
            super();
        }

        private Object readResolve() {
            return q.this.D().n1();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.q.k, com.google.common.collect.o5, com.google.common.collect.v4
        public Set<q<? super T>> i1() {
            z6<q<? super T>> z6Var = this.f119867d;
            if (z6Var != null) {
                return z6Var;
            }
            z6<q<? super T>> z6VarU = s4.D(i.f119874a.a().d(q.this)).v(j.f119880a).U();
            this.f119867d = z6VarU;
            return z6VarU;
        }

        @Override // com.google.common.reflect.q.k
        public q<T>.k n1() {
            return this;
        }

        @Override // com.google.common.reflect.q.k
        public q<T>.k q1() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        @Override // com.google.common.reflect.q.k
        public Set<Class<? super T>> r1() {
            return z6.A(i.f119875b.a().c(q.this.x()));
        }

        /* synthetic */ f(q qVar, a aVar) {
            this();
        }
    }

    private final class g extends q<T>.k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f119869g = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient q<T>.k f119870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.a
        private transient z6<q<? super T>> f119871e;

        g(q<T>.k allTypes) {
            super();
            this.f119870d = allTypes;
        }

        private Object readResolve() {
            return q.this.D().q1();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.q.k, com.google.common.collect.o5, com.google.common.collect.v4
        public Set<q<? super T>> i1() {
            z6<q<? super T>> z6Var = this.f119871e;
            if (z6Var != null) {
                return z6Var;
            }
            z6<q<? super T>> z6VarU = s4.D(this.f119870d).v(j.f119881b).U();
            this.f119871e = z6VarU;
            return z6VarU;
        }

        @Override // com.google.common.reflect.q.k
        public q<T>.k n1() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        @Override // com.google.common.reflect.q.k
        public q<T>.k q1() {
            return this;
        }

        @Override // com.google.common.reflect.q.k
        public Set<Class<? super T>> r1() {
            return s4.D(i.f119875b.c(q.this.x())).v(new k0() { // from class: com.google.common.reflect.r
                @Override // com.google.common.base.k0
                public final boolean apply(Object obj) {
                    return ((Class) obj).isInterface();
                }
            }).U();
        }
    }

    private static final class h<T> extends q<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f119873e = 0;

        h(Type type) {
            super(type, null);
        }
    }

    private static abstract class i<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final i<q<?>> f119874a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final i<Class<?>> f119875b = new b();

        class a extends i<q<?>> {
            a() {
                super(null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.q.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends q<?>> e(q<?> type) {
                return type.s();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.q.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> f(q<?> type) {
                return type.w();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.q.i
            @fj.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public q<?> g(q<?> type) {
                return type.t();
            }
        }

        class b extends i<Class<?>> {
            b() {
                super(null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.q.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends Class<?>> e(Class<?> type) {
                return Arrays.asList(type.getInterfaces());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.q.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> f(Class<?> type) {
                return type;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.q.i
            @fj.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Class<?> g(Class<?> type) {
                return type.getSuperclass();
            }
        }

        class c extends e<K> {
            c(i delegate) {
                super(delegate);
            }

            @Override // com.google.common.reflect.q.i
            l6<K> c(Iterable<? extends K> types) {
                l6.a aVarS = l6.s();
                for (K k10 : types) {
                    if (!f(k10).isInterface()) {
                        aVarS.a(k10);
                    }
                }
                return super.c(aVarS.e());
            }

            @Override // com.google.common.reflect.q.i.e, com.google.common.reflect.q.i
            Iterable<? extends K> e(K type) {
                return z6.G();
            }
        }

        class d extends a9<K> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Comparator f119877c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f119878d;

            d(final Comparator val$valueComparator, final Map val$map) {
                this.f119877c = val$valueComparator;
                this.f119878d = val$map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.a9, java.util.Comparator
            public int compare(K left, K right) {
                Comparator comparator = this.f119877c;
                Object obj = this.f119878d.get(left);
                Objects.requireNonNull(obj);
                Object obj2 = this.f119878d.get(right);
                Objects.requireNonNull(obj2);
                return comparator.compare(obj, obj2);
            }
        }

        private static class e<K> extends i<K> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final i<K> f119879c;

            e(i<K> delegate) {
                super(null);
                this.f119879c = delegate;
            }

            @Override // com.google.common.reflect.q.i
            Iterable<? extends K> e(K type) {
                return this.f119879c.e(type);
            }

            @Override // com.google.common.reflect.q.i
            Class<?> f(K type) {
                return this.f119879c.f(type);
            }

            @Override // com.google.common.reflect.q.i
            @fj.a
            K g(K type) {
                return this.f119879c.g(type);
            }
        }

        private i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @z7.a
        private int b(K k10, Map<? super K, Integer> map) {
            Integer num = map.get(k10);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = f(k10).isInterface();
            Iterator<? extends K> it = e(k10).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, b(it.next(), map));
            }
            K kG = g(k10);
            int iMax2 = iMax;
            if (kG != null) {
                iMax2 = Math.max(iMax, b(kG, map));
            }
            int i10 = iMax2 + 1;
            map.put(k10, Integer.valueOf(i10));
            return i10;
        }

        private static <K, V> l6<K> h(Map<K, V> map, Comparator<? super V> comparator) {
            return (l6<K>) new d(comparator, map).l(map.keySet());
        }

        final i<K> a() {
            return new c(this);
        }

        l6<K> c(Iterable<? extends K> types) {
            HashMap mapY = b8.Y();
            Iterator<? extends K> it = types.iterator();
            while (it.hasNext()) {
                b(it.next(), mapY);
            }
            return h(mapY, a9.z().E());
        }

        final l6<K> d(K type) {
            return c(l6.G(type));
        }

        abstract Iterable<? extends K> e(K type);

        abstract Class<?> f(K type);

        @fj.a
        abstract K g(K type);

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class j implements k0<q<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f119880a = new a("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f119881b = new b("INTERFACE_ONLY", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ j[] f119882c = k();

        final enum a extends j {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.base.k0
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public boolean apply(q<?> type) {
                return ((((q) type).f119856a instanceof TypeVariable) || (((q) type).f119856a instanceof WildcardType)) ? false : true;
            }
        }

        final enum b extends j {
            b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.base.k0
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public boolean apply(q<?> type) {
                return type.w().isInterface();
            }
        }

        static {
            int i10 = 4 >> 1;
        }

        private j(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ j[] k() {
            return new j[]{f119880a, f119881b};
        }

        public static j valueOf(String name) {
            return (j) Enum.valueOf(j.class, name);
        }

        public static j[] values() {
            return (j[]) f119882c.clone();
        }

        /* synthetic */ j(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    public class k extends o5<q<? super T>> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f119883c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        private transient z6<q<? super T>> f119884a;

        k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.o5, com.google.common.collect.v4
        public Set<q<? super T>> i1() {
            z6<q<? super T>> z6VarU = this.f119884a;
            if (z6VarU == null) {
                z6VarU = s4.D(i.f119874a.d(q.this)).v(j.f119880a).U();
                this.f119884a = z6VarU;
            }
            return z6VarU;
        }

        public q<T>.k n1() {
            return new f(q.this, null);
        }

        public q<T>.k q1() {
            return new g(this);
        }

        public Set<Class<? super T>> r1() {
            return z6.A(i.f119875b.c(q.this.x()));
        }
    }

    /* synthetic */ q(Type type, a aVar) {
        this(type);
    }

    private q<? super T> B(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            q<?> qVarT = T(type);
            if (qVarT.J(cls)) {
                return (q<? super T>) qVarT.A(cls);
            }
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    private boolean E(Type formalType, TypeVariable<?> declaration) {
        if (this.f119856a.equals(formalType)) {
            return true;
        }
        if (!(formalType instanceof WildcardType)) {
            return l(this.f119856a).equals(l(formalType));
        }
        WildcardType wildcardTypeJ = j(declaration, (WildcardType) formalType);
        return n(wildcardTypeJ.getUpperBounds()).b(this.f119856a) && n(wildcardTypeJ.getLowerBounds()).a(this.f119856a);
    }

    private boolean G(Type supertype) {
        Iterator<q<? super T>> it = D().iterator();
        while (it.hasNext()) {
            Type typeV = it.next().v();
            if (typeV != null && T(typeV).J(supertype)) {
                return true;
            }
        }
        return false;
    }

    private boolean K(GenericArrayType supertype) {
        Type type = this.f119856a;
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return T(((GenericArrayType) type).getGenericComponentType()).J(supertype.getGenericComponentType());
            }
            return false;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return S(cls.getComponentType()).J(supertype.getGenericComponentType());
        }
        return false;
    }

    private boolean L(ParameterizedType supertype) {
        Class<? super Object> clsW = T(supertype).w();
        if (!Y(clsW)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = clsW.getTypeParameters();
        Type[] actualTypeArguments = supertype.getActualTypeArguments();
        for (int i10 = 0; i10 < typeParameters.length; i10++) {
            if (!T(r().j(typeParameters[i10])).E(actualTypeArguments[i10], typeParameters[i10])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) supertype.getRawType()).getModifiers()) || supertype.getOwnerType() == null || G(supertype.getOwnerType());
    }

    private boolean O(GenericArrayType subtype) {
        Type type = this.f119856a;
        if (type instanceof Class) {
            Class cls = (Class) type;
            return !cls.isArray() ? cls.isAssignableFrom(Object[].class) : T(subtype.getGenericComponentType()).J(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return T(subtype.getGenericComponentType()).J(((GenericArrayType) this.f119856a).getGenericComponentType());
        }
        return false;
    }

    private boolean P() {
        return com.google.common.primitives.q.c().contains(this.f119856a);
    }

    private static Type R(Type componentType) {
        return t.d.f119896b.n(componentType);
    }

    public static <T> q<T> S(Class<T> type) {
        return new h(type);
    }

    public static q<?> T(Type type) {
        return new h(type);
    }

    private q<?> V(Type type) {
        q<?> qVarT = T(r().j(type));
        qVarT.f119858c = this.f119858c;
        qVarT.f119857b = this.f119857b;
        return qVarT;
    }

    private Type X(Class<?> subclass) {
        if ((this.f119856a instanceof Class) && (subclass.getTypeParameters().length == 0 || w().getTypeParameters().length != 0)) {
            return subclass;
        }
        q qVarZ = Z(subclass);
        return new o().n(qVarZ.A(w()).f119856a, this.f119856a).j(qVarZ.f119856a);
    }

    private boolean Y(Class<?> superclass) {
        nb<Class<? super T>> it = x().iterator();
        while (it.hasNext()) {
            if (superclass.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    @com.google.common.annotations.e
    static <T> q<? extends T> Z(Class<T> cls) {
        if (cls.isArray()) {
            return (q<? extends T>) T(t.j(Z(cls.getComponentType()).f119856a));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : Z(cls.getEnclosingClass()).f119856a;
        if (typeParameters.length <= 0 && (type == null || type == cls.getEnclosingClass())) {
            return S(cls);
        }
        return (q<? extends T>) T(t.m(type, cls, typeParameters));
    }

    private static e f(Type[] bounds) {
        return new e(bounds, true);
    }

    @fj.a
    private q<? super T> g(Type type) {
        q<? super T> qVar = (q<? super T>) T(type);
        if (!qVar.w().isInterface()) {
            return qVar;
        }
        int i10 = 3 | 0;
        return null;
    }

    private l6<q<? super T>> h(Type[] bounds) {
        l6.a aVarS = l6.s();
        for (Type type : bounds) {
            q<?> qVarT = T(type);
            if (qVarT.w().isInterface()) {
                aVarS.a(qVarT);
            }
        }
        return aVarS.e();
    }

    private static Type i(TypeVariable<?> declaration, Type typeArg) {
        return typeArg instanceof WildcardType ? j(declaration, (WildcardType) typeArg) : l(typeArg);
    }

    private static WildcardType j(TypeVariable<?> declaration, WildcardType type) {
        Type[] bounds = declaration.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type2 : type.getUpperBounds()) {
            if (!f(bounds).a(type2)) {
                arrayList.add(l(type2));
            }
        }
        return new t.i(type.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    private static ParameterizedType k(ParameterizedType type) {
        Class cls = (Class) type.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = type.getActualTypeArguments();
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            actualTypeArguments[i10] = i(typeParameters[i10], actualTypeArguments[i10]);
        }
        return t.m(type.getOwnerType(), cls, actualTypeArguments);
    }

    private static Type l(Type type) {
        if (type instanceof ParameterizedType) {
            return k((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            type = t.j(l(((GenericArrayType) type).getGenericComponentType()));
        }
        return type;
    }

    private static e n(Type[] bounds) {
        return new e(bounds, false);
    }

    private q<? extends T> o(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != null) {
            q<?> qVarQ = q();
            Objects.requireNonNull(qVarQ);
            return (q<? extends T>) T(R(qVarQ.y(componentType).f119856a));
        }
        throw new IllegalArgumentException(cls + " does not appear to be a subtype of " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private q<? super T> p(Class<? super T> cls) {
        q<?> qVarQ = q();
        if (qVarQ != 0) {
            Class<?> componentType = cls.getComponentType();
            Objects.requireNonNull(componentType);
            return (q<? super T>) T(R(qVarQ.A(componentType).f119856a));
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o r() {
        o oVarD = this.f119858c;
        if (oVarD == null) {
            oVarD = o.d(this.f119856a);
            this.f119858c = oVarD;
        }
        return oVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o u() {
        o oVar = this.f119857b;
        if (oVar != null) {
            return oVar;
        }
        o oVarF = o.f(this.f119856a);
        this.f119857b = oVarF;
        return oVarF;
    }

    @fj.a
    private Type v() {
        Type type = this.f119856a;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public z6<Class<? super T>> x() {
        z6.a aVarS = z6.s();
        new d(this, aVarS).a(this.f119856a);
        return aVarS.e();
    }

    private q<? extends T> z(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (q<? extends T>) T(typeArr[0]).y(cls);
        }
        throw new IllegalArgumentException(cls + " isn't a subclass of " + this);
    }

    public final q<? super T> A(Class<? super T> cls) {
        j0.y(Y(cls), "%s is not a super class of %s", cls, this);
        Type type = this.f119856a;
        if (type instanceof TypeVariable) {
            return B(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return B(cls, ((WildcardType) type).getUpperBounds());
        }
        return cls.isArray() ? p(cls) : (q<? super T>) V(Z(cls).f119856a);
    }

    public final Type C() {
        return this.f119856a;
    }

    public final q<T>.k D() {
        return new k();
    }

    public final boolean F() {
        return q() != null;
    }

    public final boolean H() {
        Type type = this.f119856a;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean I(q<?> type) {
        return J(type.C());
    }

    public final boolean J(Type supertype) {
        j0.E(supertype);
        if (supertype instanceof WildcardType) {
            return f(((WildcardType) supertype).getLowerBounds()).b(this.f119856a);
        }
        Type type = this.f119856a;
        if (type instanceof WildcardType) {
            return f(((WildcardType) type).getUpperBounds()).a(supertype);
        }
        if (type instanceof TypeVariable) {
            return type.equals(supertype) || f(((TypeVariable) this.f119856a).getBounds()).a(supertype);
        }
        if (type instanceof GenericArrayType) {
            return T(supertype).O((GenericArrayType) this.f119856a);
        }
        if (supertype instanceof Class) {
            return Y((Class) supertype);
        }
        if (supertype instanceof ParameterizedType) {
            return L((ParameterizedType) supertype);
        }
        if (supertype instanceof GenericArrayType) {
            return K((GenericArrayType) supertype);
        }
        return false;
    }

    public final boolean M(q<?> type) {
        return type.J(C());
    }

    public final boolean N(Type type) {
        return T(type).J(C());
    }

    public final com.google.common.reflect.g<T, Object> Q(Method method) {
        j0.y(Y(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new a(method);
    }

    @z7.a
    final q<T> U() {
        new c().a(this.f119856a);
        return this;
    }

    public final q<?> W(Type type) {
        j0.E(type);
        return T(u().j(type));
    }

    public final q<T> a0() {
        return P() ? S(com.google.common.primitives.q.e((Class) this.f119856a)) : this;
    }

    public final <X> q<T> b0(n<X> typeParam, q<X> typeArg) {
        return new h(new o().o(n6.s(new o.d(typeParam.f119841a), typeArg.f119856a)).j(this.f119856a));
    }

    public final <X> q<T> c0(n<X> typeParam, Class<X> typeArg) {
        return b0(typeParam, S(typeArg));
    }

    public final q<T> d0() {
        return H() ? S(com.google.common.primitives.q.f((Class) this.f119856a)) : this;
    }

    public boolean equals(@fj.a Object o10) {
        if (o10 instanceof q) {
            return this.f119856a.equals(((q) o10).f119856a);
        }
        return false;
    }

    public int hashCode() {
        return this.f119856a.hashCode();
    }

    public final com.google.common.reflect.g<T, T> m(Constructor<?> constructor) {
        j0.y(constructor.getDeclaringClass() == w(), "%s not declared by %s", constructor, w());
        return new b(constructor);
    }

    @fj.a
    public final q<?> q() {
        Type typeI = t.i(this.f119856a);
        if (typeI == null) {
            return null;
        }
        return T(typeI);
    }

    final l6<q<? super T>> s() {
        Type type = this.f119856a;
        if (type instanceof TypeVariable) {
            return h(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds());
        }
        l6.a aVarS = l6.s();
        for (Type type2 : w().getGenericInterfaces()) {
            aVarS.a(V(type2));
        }
        return aVarS.e();
    }

    @fj.a
    final q<? super T> t() {
        Type type = this.f119856a;
        if (type instanceof TypeVariable) {
            return g(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = w().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (q<? super T>) V(genericSuperclass);
    }

    public String toString() {
        return t.s(this.f119856a);
    }

    public final Class<? super T> w() {
        return x().iterator().next();
    }

    protected Object writeReplace() {
        return T(new o().j(this.f119856a));
    }

    public final q<? extends T> y(Class<?> cls) {
        j0.u(!(this.f119856a instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.f119856a;
        if (type instanceof WildcardType) {
            return z(cls, ((WildcardType) type).getLowerBounds());
        }
        if (F()) {
            return o(cls);
        }
        j0.y(w().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        q<? extends T> qVar = (q<? extends T>) T(X(cls));
        j0.y(qVar.I(this), "%s does not appear to be a subtype of %s", qVar, this);
        return qVar;
    }

    protected q() {
        Type typeA = a();
        this.f119856a = typeA;
        j0.x0(!(typeA instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeA);
    }

    protected q(Class<?> declaringClass) {
        Type typeA = super.a();
        if (typeA instanceof Class) {
            this.f119856a = typeA;
        } else {
            this.f119856a = o.d(declaringClass).j(typeA);
        }
    }

    private q(Type type) {
        this.f119856a = (Type) j0.E(type);
    }
}
