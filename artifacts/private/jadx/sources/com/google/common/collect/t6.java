package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public abstract class t6<E> extends u6<E> implements q8<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f118126f = 912559;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient l6<E> f118127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient z6<q8.a<E>> f118128e;

    class a extends nb<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f118129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        E f118130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f118131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t6 f118132d;

        a(final t6 this$0, final Iterator val$entryIterator) {
            this.f118131c = val$entryIterator;
            this.f118132d = this$0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f118129a > 0 || this.f118131c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f118129a <= 0) {
                q8.a aVar = (q8.a) this.f118131c.next();
                this.f118130b = (E) aVar.X0();
                this.f118129a = aVar.getCount();
            }
            this.f118129a--;
            E e10 = this.f118130b;
            Objects.requireNonNull(e10);
            return e10;
        }
    }

    public static class b<E> extends h6.b<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        y8<E> f118133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f118134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f118135d;

        public b() {
            this(4);
        }

        @fj.a
        static <T> y8<T> n(Iterable<T> iterable) {
            if (iterable instanceof o9) {
                return ((o9) iterable).f117914g;
            }
            if (iterable instanceof f) {
                return ((f) iterable).f117377c;
            }
            return null;
        }

        @Override // com.google.common.collect.h6.b
        @z7.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b<E> a(E element) {
            return k(element, 1);
        }

        @Override // com.google.common.collect.h6.b
        @z7.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b<E> b(E... elements) {
            super.b(elements);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.h6.b
        @z7.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b<E> c(Iterable<? extends E> elements) {
            Objects.requireNonNull(this.f118133b);
            if (!(elements instanceof q8)) {
                super.c(elements);
                return this;
            }
            q8 q8VarD = r8.d(elements);
            y8 y8VarN = n(q8VarD);
            if (y8VarN != null) {
                y8<E> y8Var = this.f118133b;
                y8Var.e(Math.max(y8Var.D(), y8VarN.D()));
                for (int iF = y8VarN.f(); iF >= 0; iF = y8VarN.t(iF)) {
                    k(y8VarN.j(iF), y8VarN.l(iF));
                }
            } else {
                Set<q8.a<E>> setEntrySet = q8VarD.entrySet();
                y8<E> y8Var2 = this.f118133b;
                y8Var2.e(Math.max(y8Var2.D(), setEntrySet.size()));
                for (q8.a<E> aVar : q8VarD.entrySet()) {
                    k(aVar.X0(), aVar.getCount());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.h6.b
        @z7.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b<E> d(Iterator<? extends E> elements) {
            super.d(elements);
            return this;
        }

        @z7.a
        public b<E> k(E element, int occurrences) {
            Objects.requireNonNull(this.f118133b);
            if (occurrences == 0) {
                return this;
            }
            if (this.f118134c) {
                this.f118133b = new y8<>(this.f118133b);
                this.f118135d = false;
            }
            this.f118134c = false;
            com.google.common.base.j0.E(element);
            y8<E> y8Var = this.f118133b;
            y8Var.v(element, occurrences + y8Var.g(element));
            return this;
        }

        @Override // com.google.common.collect.h6.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public t6<E> e() {
            Objects.requireNonNull(this.f118133b);
            if (this.f118133b.D() == 0) {
                return t6.F();
            }
            if (this.f118135d) {
                this.f118133b = new y8<>(this.f118133b);
                this.f118135d = false;
            }
            this.f118134c = true;
            return new o9(this.f118133b);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @z7.a
        public b<E> m(E e10, int i10) {
            Objects.requireNonNull(this.f118133b);
            if (i10 == 0 && !this.f118135d) {
                this.f118133b = new z8(this.f118133b);
                this.f118135d = true;
            } else if (this.f118134c) {
                this.f118133b = new y8<>(this.f118133b);
                this.f118135d = false;
            }
            this.f118134c = false;
            com.google.common.base.j0.E(e10);
            if (i10 == 0) {
                this.f118133b.w(e10);
                return this;
            }
            this.f118133b.v((E) com.google.common.base.j0.E(e10), i10);
            return this;
        }

        b(int estimatedDistinct) {
            this.f118134c = false;
            this.f118135d = false;
            this.f118133b = y8.d(estimatedDistinct);
        }

        b(boolean forSubtype) {
            this.f118134c = false;
            this.f118135d = false;
            this.f118133b = null;
        }
    }

    private final class c extends l7<q8.a<E>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @com.google.common.annotations.d
        private static final long f118136j = 0;

        private c() {
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.l7
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public q8.a<E> get(int index) {
            return t6.this.D(index);
        }

        @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            if (o10 instanceof q8.a) {
                q8.a aVar = (q8.a) o10;
                if (aVar.getCount() <= 0) {
                    return false;
                }
                if (t6.this.P3(aVar.X0()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.z6, java.util.Collection, java.util.Set
        public int hashCode() {
            return t6.this.hashCode();
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return t6.this.m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t6.this.o().size();
        }

        @Override // com.google.common.collect.l7, com.google.common.collect.z6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return new d(t6.this);
        }

        /* synthetic */ c(t6 t6Var, a aVar) {
            this();
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    static class d<E> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final t6<E> f118138a;

        d(t6<E> multiset) {
            this.f118138a = multiset;
        }

        Object readResolve() {
            return this.f118138a.entrySet();
        }
    }

    t6() {
    }

    private z6<q8.a<E>> A() {
        return isEmpty() ? z6.G() : new c(this, null);
    }

    public static <E> t6<E> F() {
        return o9.f117913j;
    }

    public static <E> t6<E> G(E e10) {
        return s(e10);
    }

    public static <E> t6<E> J(E e10, E e11) {
        return s(e10, e11);
    }

    public static <E> t6<E> K(E e10, E e11, E e12) {
        return s(e10, e11, e12);
    }

    public static <E> t6<E> L(E e10, E e11, E e12, E e13) {
        return s(e10, e11, e12, e13);
    }

    public static <E> t6<E> M(E e10, E e11, E e12, E e13, E e14) {
        return s(e10, e11, e12, e13, e14);
    }

    public static <E> t6<E> N(E e10, E e11, E e12, E e13, E e14, E e15, E... others) {
        return new b().a(e10).a(e11).a(e12).a(e13).a(e14).a(e15).b(others).e();
    }

    @d6
    public static <E> Collector<E, ?, t6<E>> O() {
        return y2.P(Function.identity(), new ToIntFunction() { // from class: com.google.common.collect.s6
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return t6.p(obj);
            }
        });
    }

    @d6
    public static <T, E> Collector<T, ?, t6<E>> P(Function<? super T, ? extends E> elementFunction, ToIntFunction<? super T> countFunction) {
        return y2.P(elementFunction, countFunction);
    }

    public static /* synthetic */ int p(Object obj) {
        return 1;
    }

    public static <E> b<E> r() {
        return new b<>();
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private static <E> t6<E> s(E... elements) {
        return new b().b(elements).e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> t6<E> t(Collection<? extends q8.a<? extends E>> entries) {
        b bVar = new b(entries.size());
        for (q8.a<? extends E> aVar : entries) {
            bVar.k(aVar.X0(), aVar.getCount());
        }
        return bVar.e();
    }

    public static <E> t6<E> u(Iterable<? extends E> elements) {
        if (elements instanceof t6) {
            t6<E> t6Var = (t6) elements;
            if (!t6Var.m()) {
                return t6Var;
            }
        }
        b bVar = new b(r8.l(elements));
        bVar.c(elements);
        return bVar.e();
    }

    public static <E> t6<E> v(Iterator<? extends E> elements) {
        return new b().d(elements).e();
    }

    public static <E> t6<E> w(E[] elements) {
        return s(elements);
    }

    @Override // com.google.common.collect.q8
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public abstract z6<E> o();

    @Override // com.google.common.collect.q8
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public z6<q8.a<E>> entrySet() {
        z6<q8.a<E>> z6VarA = this.f118128e;
        if (z6VarA == null) {
            z6VarA = A();
            this.f118128e = z6VarA;
        }
        return z6VarA;
    }

    abstract q8.a<E> D(int index);

    @Override // com.google.common.collect.q8
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    public final int H(E element, int occurrences) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q8
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    public final boolean Q2(E element, int oldCount, int newCount) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h6
    public l6<E> c() {
        l6<E> l6Var = this.f118127d;
        if (l6Var != null) {
            return l6Var;
        }
        l6<E> l6VarC = super.c();
        this.f118127d = l6VarC;
        return l6VarC;
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object object) {
        return P3(object) > 0;
    }

    @Override // com.google.common.collect.h6
    @com.google.common.annotations.c
    int d(Object[] dst, int offset) {
        nb<q8.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            q8.a<E> next = it.next();
            Arrays.fill(dst, offset, next.getCount() + offset, next.X0());
            offset += next.getCount();
        }
        return offset;
    }

    @Override // java.util.Collection, com.google.common.collect.q8
    public boolean equals(@fj.a Object object) {
        return r8.i(this, object);
    }

    @Override // com.google.common.collect.q8
    @z7.a
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final int f0(@fj.a Object element, int occurrences) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q8
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    public final int g1(E element, int count) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, com.google.common.collect.q8
    public int hashCode() {
        return z9.k(entrySet());
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public nb<E> iterator() {
        return new a(this, entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.q8
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    abstract Object writeReplace();
}
