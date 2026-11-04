package com.google.common.reflect;

import com.google.common.base.a0;
import com.google.common.base.d0;
import com.google.common.base.j0;
import com.google.common.collect.b8;
import com.google.common.collect.n6;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.b0;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.d
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f119842a;

    class a extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f119843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type f119844c;

        a(final Map val$mappings, final Type val$to) {
            this.f119843b = val$mappings;
            this.f119844c = val$to;
        }

        @Override // com.google.common.reflect.s
        void b(Class<?> fromClass) {
            if (this.f119844c instanceof WildcardType) {
                return;
            }
            throw new IllegalArgumentException("No type mapping from " + fromClass + " to " + this.f119844c);
        }

        @Override // com.google.common.reflect.s
        void c(GenericArrayType fromArrayType) {
            Type type = this.f119844c;
            if (type instanceof WildcardType) {
                return;
            }
            Type typeI = t.i(type);
            j0.u(typeI != null, "%s is not an array type.", this.f119844c);
            o.g(this.f119843b, fromArrayType.getGenericComponentType(), typeI);
        }

        @Override // com.google.common.reflect.s
        void d(ParameterizedType fromParameterizedType) {
            Type type = this.f119844c;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType = (ParameterizedType) o.e(ParameterizedType.class, type);
            if (fromParameterizedType.getOwnerType() != null && parameterizedType.getOwnerType() != null) {
                o.g(this.f119843b, fromParameterizedType.getOwnerType(), parameterizedType.getOwnerType());
            }
            j0.y(fromParameterizedType.getRawType().equals(parameterizedType.getRawType()), "Inconsistent raw type: %s vs. %s", fromParameterizedType, this.f119844c);
            Type[] actualTypeArguments = fromParameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
            j0.y(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", fromParameterizedType, parameterizedType);
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                o.g(this.f119843b, actualTypeArguments[i10], actualTypeArguments2[i10]);
            }
        }

        @Override // com.google.common.reflect.s
        void e(TypeVariable<?> typeVariable) {
            this.f119843b.put(new d(typeVariable), this.f119844c);
        }

        @Override // com.google.common.reflect.s
        void f(WildcardType fromWildcardType) {
            Type type = this.f119844c;
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] upperBounds = fromWildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType.getUpperBounds();
                Type[] lowerBounds = fromWildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType.getLowerBounds();
                j0.y(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", fromWildcardType, this.f119844c);
                for (int i10 = 0; i10 < upperBounds.length; i10++) {
                    o.g(this.f119843b, upperBounds[i10], upperBounds2[i10]);
                }
                for (int i11 = 0; i11 < lowerBounds.length; i11++) {
                    o.g(this.f119843b, lowerBounds[i11], lowerBounds2[i11]);
                }
            }
        }
    }

    private static final class b extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<d, Type> f119845b = b8.Y();

        private b() {
        }

        static n6<d, Type> g(Type contextType) {
            j0.E(contextType);
            b bVar = new b();
            bVar.a(contextType);
            return n6.g(bVar.f119845b);
        }

        private void h(d var, Type arg) {
            if (this.f119845b.containsKey(var)) {
                return;
            }
            Type type = arg;
            while (type != null) {
                if (var.a(type)) {
                    while (arg != null) {
                        arg = this.f119845b.remove(d.c(arg));
                    }
                    return;
                }
                type = this.f119845b.get(d.c(type));
            }
            this.f119845b.put(var, arg);
        }

        @Override // com.google.common.reflect.s
        void b(Class<?> clazz) {
            a(clazz.getGenericSuperclass());
            a(clazz.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.s
        void d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int i10 = 4 ^ 0;
            j0.g0(typeParameters.length == actualTypeArguments.length);
            for (int i11 = 0; i11 < typeParameters.length; i11++) {
                h(new d(typeParameters[i11]), actualTypeArguments[i11]);
            }
            a(cls);
            a(parameterizedType.getOwnerType());
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

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TypeVariable<?> f119850a;

        d(TypeVariable<?> var) {
            this.f119850a = (TypeVariable) j0.E(var);
        }

        private boolean b(TypeVariable<?> that) {
            if (!this.f119850a.getGenericDeclaration().equals(that.getGenericDeclaration()) || !this.f119850a.getName().equals(that.getName())) {
                return false;
            }
            int i10 = 4 >> 1;
            return true;
        }

        @fj.a
        static d c(Type t10) {
            if (t10 instanceof TypeVariable) {
                return new d((TypeVariable) t10);
            }
            return null;
        }

        boolean a(Type type) {
            if (type instanceof TypeVariable) {
                return b((TypeVariable) type);
            }
            return false;
        }

        public boolean equals(@fj.a Object obj) {
            if (obj instanceof d) {
                return b(((d) obj).f119850a);
            }
            return false;
        }

        public int hashCode() {
            return d0.b(this.f119850a.getGenericDeclaration(), this.f119850a.getName());
        }

        public String toString() {
            return this.f119850a.toString();
        }
    }

    private static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final e f119851b = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f119852a;

        class a extends e {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TypeVariable f119853c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f119854d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(final e this$0, AtomicInteger id2, final TypeVariable val$typeParam) {
                super(id2, null);
                this.f119853c = val$typeParam;
                this.f119854d = this$0;
            }

            @Override // com.google.common.reflect.o.e
            TypeVariable<?> b(Type[] upperBounds) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(upperBounds));
                linkedHashSet.addAll(Arrays.asList(this.f119853c.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.b((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        /* synthetic */ e(AtomicInteger atomicInteger, a aVar) {
            this(atomicInteger);
        }

        @fj.a
        private Type c(@fj.a Type type) {
            if (type == null) {
                return null;
            }
            return a(type);
        }

        private e d(TypeVariable<?> typeParam) {
            return new a(this, this.f119852a, typeParam);
        }

        private e e() {
            return new e(this.f119852a);
        }

        final Type a(Type type) {
            j0.E(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return t.j(e().a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof ParameterizedType)) {
                if (!(type instanceof WildcardType)) {
                    throw new AssertionError("must have been one of the known types");
                }
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? b(wildcardType.getUpperBounds()) : type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable<?>[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                actualTypeArguments[i10] = d(typeParameters[i10]).a(actualTypeArguments[i10]);
            }
            return t.m(e().c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
        }

        TypeVariable<?> b(Type[] upperBounds) {
            return t.k(e.class, "capture#" + this.f119852a.incrementAndGet() + "-of ? extends " + a0.o(b0.f313279d).n(upperBounds), upperBounds);
        }

        private e() {
            this(new AtomicInteger());
        }

        private e(AtomicInteger id2) {
            this.f119852a = id2;
        }
    }

    /* synthetic */ o(c cVar, a aVar) {
        this(cVar);
    }

    static o d(Type contextType) {
        return new o().o(b.g(contextType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T e(Class<T> type, Object arg) {
        try {
            return type.cast(arg);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(arg + " is not a " + type.getSimpleName());
        }
    }

    static o f(Type contextType) {
        return new o().o(b.g(e.f119851b.a(contextType)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Map<d, Type> mappings, Type from, Type to) {
        if (from.equals(to)) {
            return;
        }
        new a(mappings, to).a(from);
    }

    private Type h(GenericArrayType type) {
        return t.j(j(type.getGenericComponentType()));
    }

    private ParameterizedType i(ParameterizedType type) {
        Type ownerType = type.getOwnerType();
        return t.m(ownerType == null ? null : j(ownerType), (Class) j(type.getRawType()), k(type.getActualTypeArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Type[] k(Type[] types) {
        Type[] typeArr = new Type[types.length];
        for (int i10 = 0; i10 < types.length; i10++) {
            typeArr[i10] = j(types[i10]);
        }
        return typeArr;
    }

    private WildcardType m(WildcardType type) {
        return new t.i(k(type.getLowerBounds()), k(type.getUpperBounds()));
    }

    public Type j(Type type) {
        j0.E(type);
        if (type instanceof TypeVariable) {
            return this.f119842a.a((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return i((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return h((GenericArrayType) type);
        }
        return type instanceof WildcardType ? m((WildcardType) type) : type;
    }

    Type[] l(Type[] types) {
        for (int i10 = 0; i10 < types.length; i10++) {
            types[i10] = j(types[i10]);
        }
        return types;
    }

    public o n(Type formal, Type actual) {
        HashMap mapY = b8.Y();
        g(mapY, (Type) j0.E(formal), (Type) j0.E(actual));
        return o(mapY);
    }

    o o(Map<d, ? extends Type> mappings) {
        return new o(this.f119842a.c(mappings));
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n6<d, Type> f119846a;

        class a extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TypeVariable f119847b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f119848c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f119849d;

            a(final c this$0, final TypeVariable val$var, final c val$unguarded) {
                this.f119847b = val$var;
                this.f119848c = val$unguarded;
                this.f119849d = this$0;
            }

            @Override // com.google.common.reflect.o.c
            public Type b(TypeVariable<?> intermediateVar, c forDependent) {
                return intermediateVar.getGenericDeclaration().equals(this.f119847b.getGenericDeclaration()) ? intermediateVar : this.f119848c.b(intermediateVar, forDependent);
            }
        }

        c() {
            this.f119846a = n6.q();
        }

        final Type a(TypeVariable<?> var) {
            return b(var, new a(this, var, this));
        }

        Type b(TypeVariable<?> var, c forDependants) {
            Type type = this.f119846a.get(new d(var));
            a aVar = null;
            if (type != null) {
                return new o(forDependants, aVar).j(type);
            }
            Type[] bounds = var.getBounds();
            if (bounds.length != 0) {
                Type[] typeArrK = new o(forDependants, aVar).k(bounds);
                if (!t.e.f119901a || !Arrays.equals(bounds, typeArrK)) {
                    return t.k(var.getGenericDeclaration(), var.getName(), typeArrK);
                }
            }
            return var;
        }

        final c c(Map<d, ? extends Type> mappings) {
            n6.b bVarB = n6.b();
            bVarB.l(this.f119846a);
            for (Map.Entry<d, ? extends Type> entry : mappings.entrySet()) {
                d key = entry.getKey();
                Type value = entry.getValue();
                j0.u(!key.a(value), "Type variable %s bound to itself", key);
                bVarB.i(key, value);
            }
            return new c(bVarB.d());
        }

        private c(n6<d, Type> map) {
            this.f119846a = map;
        }
    }

    public o() {
        this.f119842a = new c();
    }

    private o(c typeTable) {
        this.f119842a = typeTable;
    }
}
