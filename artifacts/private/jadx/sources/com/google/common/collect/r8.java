package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public final class r8 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    class a<E> extends n<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q8 f118034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q8 f118035d;

        /* JADX INFO: renamed from: com.google.common.collect.r8$a$a, reason: collision with other inner class name */
        class C1075a extends com.google.common.collect.c<q8.a<E>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f118036c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f118037d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f118038e;

            C1075a(final a this$0, final Iterator val$iterator1, final Iterator val$iterator2) {
                this.f118036c = val$iterator1;
                this.f118037d = val$iterator2;
                this.f118038e = this$0;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public q8.a<E> b() {
                if (this.f118036c.hasNext()) {
                    q8.a aVar = (q8.a) this.f118036c.next();
                    Object objX0 = aVar.X0();
                    return r8.k(objX0, Math.max(aVar.getCount(), this.f118038e.f118035d.P3(objX0)));
                }
                while (this.f118037d.hasNext()) {
                    q8.a aVar2 = (q8.a) this.f118037d.next();
                    Object objX1 = aVar2.X0();
                    if (!this.f118038e.f118034c.contains(objX1)) {
                        return r8.k(objX1, aVar2.getCount());
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(final q8 val$multiset1, final q8 val$multiset2) {
            super(null);
            this.f118034c = val$multiset1;
            this.f118035d = val$multiset2;
        }

        @Override // com.google.common.collect.q8
        public int P3(@fj.a Object element) {
            return Math.max(this.f118034c.P3(element), this.f118035d.P3(element));
        }

        @Override // com.google.common.collect.i
        Set<E> c() {
            return z9.O(this.f118034c.o(), this.f118035d.o());
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
        public boolean contains(@fj.a Object element) {
            return this.f118034c.contains(element) || this.f118035d.contains(element);
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f118034c.isEmpty() && this.f118035d.isEmpty();
        }

        @Override // com.google.common.collect.i
        Iterator<E> l() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.i
        Iterator<q8.a<E>> m() {
            return new C1075a(this, this.f118034c.entrySet().iterator(), this.f118035d.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class b<E> extends n<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q8 f118039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q8 f118040d;

        class a extends com.google.common.collect.c<q8.a<E>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f118041c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f118042d;

            a(final b this$0, final Iterator val$iterator1) {
                this.f118041c = val$iterator1;
                this.f118042d = this$0;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public q8.a<E> b() {
                while (this.f118041c.hasNext()) {
                    q8.a aVar = (q8.a) this.f118041c.next();
                    Object objX0 = aVar.X0();
                    int iMin = Math.min(aVar.getCount(), this.f118042d.f118040d.P3(objX0));
                    if (iMin > 0) {
                        return r8.k(objX0, iMin);
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(final q8 val$multiset1, final q8 val$multiset2) {
            super(null);
            this.f118039c = val$multiset1;
            this.f118040d = val$multiset2;
        }

        @Override // com.google.common.collect.q8
        public int P3(@fj.a Object element) {
            int iP3 = this.f118039c.P3(element);
            if (iP3 == 0) {
                return 0;
            }
            return Math.min(iP3, this.f118040d.P3(element));
        }

        @Override // com.google.common.collect.i
        Set<E> c() {
            return z9.n(this.f118039c.o(), this.f118040d.o());
        }

        @Override // com.google.common.collect.i
        Iterator<E> l() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.i
        Iterator<q8.a<E>> m() {
            return new a(this, this.f118039c.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class c<E> extends n<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q8 f118043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q8 f118044d;

        class a extends com.google.common.collect.c<q8.a<E>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f118045c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f118046d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f118047e;

            a(final c this$0, final Iterator val$iterator1, final Iterator val$iterator2) {
                this.f118045c = val$iterator1;
                this.f118046d = val$iterator2;
                this.f118047e = this$0;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public q8.a<E> b() {
                if (this.f118045c.hasNext()) {
                    q8.a aVar = (q8.a) this.f118045c.next();
                    Object objX0 = aVar.X0();
                    return r8.k(objX0, aVar.getCount() + this.f118047e.f118044d.P3(objX0));
                }
                while (this.f118046d.hasNext()) {
                    q8.a aVar2 = (q8.a) this.f118046d.next();
                    Object objX1 = aVar2.X0();
                    if (!this.f118047e.f118043c.contains(objX1)) {
                        return r8.k(objX1, aVar2.getCount());
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(final q8 val$multiset1, final q8 val$multiset2) {
            super(null);
            this.f118043c = val$multiset1;
            this.f118044d = val$multiset2;
        }

        @Override // com.google.common.collect.q8
        public int P3(@fj.a Object element) {
            return this.f118043c.P3(element) + this.f118044d.P3(element);
        }

        @Override // com.google.common.collect.i
        Set<E> c() {
            return z9.O(this.f118043c.o(), this.f118044d.o());
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
        public boolean contains(@fj.a Object element) {
            return this.f118043c.contains(element) || this.f118044d.contains(element);
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f118043c.isEmpty() && this.f118044d.isEmpty();
        }

        @Override // com.google.common.collect.i
        Iterator<E> l() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.i
        Iterator<q8.a<E>> m() {
            return new a(this, this.f118043c.entrySet().iterator(), this.f118044d.entrySet().iterator());
        }

        @Override // com.google.common.collect.r8.n, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
        public int size() {
            return com.google.common.math.f.t(this.f118043c.size(), this.f118044d.size());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class d<E> extends n<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q8 f118048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q8 f118049d;

        class a extends com.google.common.collect.c<E> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f118050c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ d f118051d;

            a(final d this$0, final Iterator val$iterator1) {
                this.f118050c = val$iterator1;
                this.f118051d = this$0;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.c
            @fj.a
            protected E b() {
                while (this.f118050c.hasNext()) {
                    q8.a aVar = (q8.a) this.f118050c.next();
                    E e10 = (E) aVar.X0();
                    if (aVar.getCount() > this.f118051d.f118049d.P3(e10)) {
                        return e10;
                    }
                }
                return c();
            }
        }

        class b extends com.google.common.collect.c<q8.a<E>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f118052c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ d f118053d;

            b(final d this$0, final Iterator val$iterator1) {
                this.f118052c = val$iterator1;
                this.f118053d = this$0;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public q8.a<E> b() {
                while (this.f118052c.hasNext()) {
                    q8.a aVar = (q8.a) this.f118052c.next();
                    Object objX0 = aVar.X0();
                    int count = aVar.getCount() - this.f118053d.f118049d.P3(objX0);
                    if (count > 0) {
                        return r8.k(objX0, count);
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(final q8 val$multiset1, final q8 val$multiset2) {
            super(null);
            this.f118048c = val$multiset1;
            this.f118049d = val$multiset2;
        }

        @Override // com.google.common.collect.q8
        public int P3(@fj.a Object element) {
            int iP3 = this.f118048c.P3(element);
            if (iP3 == 0) {
                return 0;
            }
            return Math.max(0, iP3 - this.f118049d.P3(element));
        }

        @Override // com.google.common.collect.r8.n, com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.r8.n, com.google.common.collect.i
        int k() {
            return p7.Y(m());
        }

        @Override // com.google.common.collect.i
        Iterator<E> l() {
            return new a(this, this.f118048c.entrySet().iterator());
        }

        @Override // com.google.common.collect.i
        Iterator<q8.a<E>> m() {
            return new b(this, this.f118048c.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class e<E> extends eb<q8.a<E>, E> {
        e(Iterator backingIterator) {
            super(backingIterator);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.eb
        @b9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public E b(q8.a<E> entry) {
            return entry.X0();
        }
    }

    static abstract class f<E> implements q8.a<E> {
        f() {
        }

        @Override // com.google.common.collect.q8.a
        public boolean equals(@fj.a Object object) {
            if (object instanceof q8.a) {
                q8.a aVar = (q8.a) object;
                if (getCount() == aVar.getCount() && com.google.common.base.d0.a(X0(), aVar.X0())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.q8.a
        public int hashCode() {
            E eX0 = X0();
            return getCount() ^ (eX0 == null ? 0 : eX0.hashCode());
        }

        @Override // com.google.common.collect.q8.a
        public String toString() {
            String strValueOf = String.valueOf(X0());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    private static final class g implements Comparator<q8.a<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Comparator<q8.a<?>> f118054a = new g();

        private g() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(q8.a<?> entry1, q8.a<?> entry2) {
            return entry2.getCount() - entry1.getCount();
        }
    }

    static abstract class h<E> extends z9.k<E> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            return l().contains(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> c10) {
            return l().containsAll(c10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return l().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        abstract q8<E> l();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object o10) {
            return l().f0(o10, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l().entrySet().size();
        }
    }

    static abstract class i<E> extends z9.k<q8.a<E>> {
        i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            if (o10 instanceof q8.a) {
                q8.a aVar = (q8.a) o10;
                if (aVar.getCount() > 0 && l().P3(aVar.X0()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        abstract q8<E> l();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object obj) {
            if (obj instanceof q8.a) {
                q8.a aVar = (q8.a) obj;
                Object objX0 = aVar.X0();
                int count = aVar.getCount();
                if (count != 0) {
                    return l().Q2(objX0, count, 0);
                }
            }
            return false;
        }
    }

    private static final class j<E> extends n<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final q8<E> f118055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.google.common.base.k0<? super E> f118056d;

        class a implements com.google.common.base.k0<q8.a<E>> {
            a() {
            }

            @Override // com.google.common.base.k0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean apply(q8.a<E> entry) {
                return j.this.f118056d.apply(entry.X0());
            }
        }

        j(q8<E> unfiltered, com.google.common.base.k0<? super E> predicate) {
            super(null);
            this.f118055c = (q8) com.google.common.base.j0.E(unfiltered);
            this.f118056d = (com.google.common.base.k0) com.google.common.base.j0.E(predicate);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.q8
        public int H(@b9 E element, int occurrences) {
            com.google.common.base.j0.y(this.f118056d.apply(element), "Element %s does not match predicate %s", element, this.f118056d);
            return this.f118055c.H(element, occurrences);
        }

        @Override // com.google.common.collect.q8
        public int P3(@fj.a Object element) {
            int iP3 = this.f118055c.P3(element);
            if (iP3 <= 0 || !this.f118056d.apply(element)) {
                return 0;
            }
            return iP3;
        }

        @Override // com.google.common.collect.i
        Set<E> c() {
            return z9.i(this.f118055c.o(), this.f118056d);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.q8
        public int f0(@fj.a Object element, int occurrences) {
            a3.b(occurrences, "occurrences");
            if (occurrences == 0) {
                return P3(element);
            }
            if (contains(element)) {
                return this.f118055c.f0(element, occurrences);
            }
            return 0;
        }

        @Override // com.google.common.collect.i
        Set<q8.a<E>> i() {
            return z9.i(this.f118055c.entrySet(), new a());
        }

        @Override // com.google.common.collect.i
        Iterator<E> l() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.i
        Iterator<q8.a<E>> m() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.r8.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.q8
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public nb<E> iterator() {
            return p7.w(this.f118055c.iterator(), this.f118056d);
        }
    }

    static class k<E> extends f<E> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f118058c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        private final E f118059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f118060b;

        k(@b9 E element, int count) {
            this.f118059a = element;
            this.f118060b = count;
            a3.b(count, "count");
        }

        @Override // com.google.common.collect.q8.a
        @b9
        public final E X0() {
            return this.f118059a;
        }

        @fj.a
        public k<E> a() {
            return null;
        }

        @Override // com.google.common.collect.q8.a
        public final int getCount() {
            return this.f118060b;
        }
    }

    static final class l<E> implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q8<E> f118061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<q8.a<E>> f118062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        private q8.a<E> f118063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f118064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f118065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f118066f;

        l(q8<E> multiset, Iterator<q8.a<E>> entryIterator) {
            this.f118061a = multiset;
            this.f118062b = entryIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f118064d <= 0 && !this.f118062b.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        @b9
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f118064d == 0) {
                q8.a<E> next = this.f118062b.next();
                this.f118063c = next;
                int count = next.getCount();
                this.f118064d = count;
                this.f118065e = count;
            }
            this.f118064d--;
            this.f118066f = true;
            q8.a<E> aVar = this.f118063c;
            Objects.requireNonNull(aVar);
            return aVar.X0();
        }

        @Override // java.util.Iterator
        public void remove() {
            a3.e(this.f118066f);
            if (this.f118065e == 1) {
                this.f118062b.remove();
            } else {
                q8<E> q8Var = this.f118061a;
                q8.a<E> aVar = this.f118063c;
                Objects.requireNonNull(aVar);
                q8Var.remove(aVar.X0());
            }
            this.f118065e--;
            this.f118066f = false;
        }
    }

    static class m<E> extends j5<E> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f118067d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q8<? extends E> f118068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @a8.b
        @fj.a
        transient Set<E> f118069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @a8.b
        @fj.a
        transient Set<q8.a<E>> f118070c;

        m(q8<? extends E> delegate) {
            this.f118068a = delegate;
        }

        @Override // com.google.common.collect.j5, com.google.common.collect.q8
        public int H(@b9 E element, int occurrences) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.j5, com.google.common.collect.q8
        public boolean Q2(@b9 E element, int oldCount, int newCount) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean add(@b9 E element) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends E> elementsToAdd) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.j5, com.google.common.collect.q8
        public Set<q8.a<E>> entrySet() {
            Set<q8.a<E>> set = this.f118070c;
            if (set != null) {
                return set;
            }
            Set<q8.a<E>> setUnmodifiableSet = Collections.unmodifiableSet(this.f118068a.entrySet());
            this.f118070c = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.j5, com.google.common.collect.q8
        public int f0(@fj.a Object element, int occurrences) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.j5, com.google.common.collect.q8
        public int g1(@b9 E element, int count) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.j5, com.google.common.collect.v4
        public q8<E> i1() {
            return this.f118068a;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return p7.e0(this.f118068a.iterator());
        }

        @Override // com.google.common.collect.j5, com.google.common.collect.q8
        public Set<E> o() {
            Set<E> set = this.f118069b;
            if (set != null) {
                return set;
            }
            Set<E> setY1 = y1();
            this.f118069b = setY1;
            return setY1;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object element) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> elementsToRemove) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> elementsToRetain) {
            throw new UnsupportedOperationException();
        }

        Set<E> y1() {
            return Collections.unmodifiableSet(this.f118068a.o());
        }
    }

    private static abstract class n<E> extends com.google.common.collect.i<E> {
        private n() {
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            o().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.q8
        public Iterator<E> iterator() {
            return r8.n(this);
        }

        @Override // com.google.common.collect.i
        int k() {
            return o().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
        public int size() {
            return r8.o(this);
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private r8() {
    }

    @Deprecated
    public static <E> q8<E> A(t6<E> multiset) {
        return (q8) com.google.common.base.j0.E(multiset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> q8<E> B(q8<? extends E> multiset) {
        if (!(multiset instanceof m) && !(multiset instanceof t6)) {
            return new m((q8) com.google.common.base.j0.E(multiset));
        }
        return multiset;
    }

    public static <E> ga<E> C(ga<E> sortedMultiset) {
        return new pb((ga) com.google.common.base.j0.E(sortedMultiset));
    }

    private static <E> boolean a(q8<E> self, com.google.common.collect.f<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        elements.n(self);
        return true;
    }

    private static <E> boolean b(q8<E> self, q8<? extends E> elements) {
        if (elements instanceof com.google.common.collect.f) {
            return a(self, (com.google.common.collect.f) elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        for (q8.a<? extends E> aVar : elements.entrySet()) {
            self.H(aVar.X0(), aVar.getCount());
        }
        return true;
    }

    static <E> boolean c(q8<E> self, Collection<? extends E> elements) {
        com.google.common.base.j0.E(self);
        com.google.common.base.j0.E(elements);
        if (elements instanceof q8) {
            return b(self, d(elements));
        }
        if (elements.isEmpty()) {
            return false;
        }
        return p7.a(self, elements.iterator());
    }

    static <T> q8<T> d(Iterable<T> iterable) {
        return (q8) iterable;
    }

    @z7.a
    public static boolean e(q8<?> superMultiset, q8<?> subMultiset) {
        com.google.common.base.j0.E(superMultiset);
        com.google.common.base.j0.E(subMultiset);
        for (q8.a<?> aVar : subMultiset.entrySet()) {
            if (superMultiset.P3(aVar.X0()) < aVar.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static <E> t6<E> f(q8<E> multiset) {
        q8.a[] aVarArr = (q8.a[]) multiset.entrySet().toArray(new q8.a[0]);
        Arrays.sort(aVarArr, g.f118054a);
        return t6.t(Arrays.asList(aVarArr));
    }

    public static <E> q8<E> g(final q8<E> multiset1, final q8<?> multiset2) {
        com.google.common.base.j0.E(multiset1);
        com.google.common.base.j0.E(multiset2);
        return new d(multiset1, multiset2);
    }

    static <E> Iterator<E> h(Iterator<q8.a<E>> entryIterator) {
        return new e(entryIterator);
    }

    static boolean i(q8<?> multiset, @fj.a Object object) {
        if (object == multiset) {
            return true;
        }
        if (object instanceof q8) {
            q8 q8Var = (q8) object;
            if (multiset.size() == q8Var.size() && multiset.entrySet().size() == q8Var.entrySet().size()) {
                for (q8.a aVar : q8Var.entrySet()) {
                    if (multiset.P3(aVar.X0()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <E> q8<E> j(q8<E> unfiltered, com.google.common.base.k0<? super E> predicate) {
        if (!(unfiltered instanceof j)) {
            return new j(unfiltered, predicate);
        }
        j jVar = (j) unfiltered;
        return new j(jVar.f118055c, com.google.common.base.l0.d(jVar.f118056d, predicate));
    }

    public static <E> q8.a<E> k(@b9 E e10, int n10) {
        return new k(e10, n10);
    }

    static int l(Iterable<?> elements) {
        if (elements instanceof q8) {
            return ((q8) elements).o().size();
        }
        return 11;
    }

    public static <E> q8<E> m(final q8<E> multiset1, final q8<?> multiset2) {
        com.google.common.base.j0.E(multiset1);
        com.google.common.base.j0.E(multiset2);
        return new b(multiset1, multiset2);
    }

    static <E> Iterator<E> n(q8<E> multiset) {
        return new l(multiset, multiset.entrySet().iterator());
    }

    static int o(q8<?> multiset) {
        Iterator<q8.a<?>> it = multiset.entrySet().iterator();
        long count = 0;
        while (it.hasNext()) {
            count += (long) it.next().getCount();
        }
        return com.google.common.primitives.l.A(count);
    }

    static boolean p(q8<?> self, Collection<?> elementsToRemove) {
        if (elementsToRemove instanceof q8) {
            elementsToRemove = ((q8) elementsToRemove).o();
        }
        return self.o().removeAll(elementsToRemove);
    }

    @z7.a
    public static boolean q(q8<?> multisetToModify, q8<?> occurrencesToRemove) {
        com.google.common.base.j0.E(multisetToModify);
        com.google.common.base.j0.E(occurrencesToRemove);
        Iterator<q8.a<?>> it = multisetToModify.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            q8.a<?> next = it.next();
            int iP3 = occurrencesToRemove.P3(next.X0());
            if (iP3 >= next.getCount()) {
                it.remove();
            } else if (iP3 > 0) {
                multisetToModify.f0(next.X0(), iP3);
            }
            z10 = true;
        }
        return z10;
    }

    @z7.a
    public static boolean r(q8<?> multisetToModify, Iterable<?> occurrencesToRemove) {
        if (occurrencesToRemove instanceof q8) {
            return q(multisetToModify, (q8) occurrencesToRemove);
        }
        com.google.common.base.j0.E(multisetToModify);
        com.google.common.base.j0.E(occurrencesToRemove);
        Iterator<?> it = occurrencesToRemove.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= multisetToModify.remove(it.next());
        }
        return zRemove;
    }

    static boolean s(q8<?> self, Collection<?> elementsToRetain) {
        com.google.common.base.j0.E(elementsToRetain);
        if (elementsToRetain instanceof q8) {
            elementsToRetain = ((q8) elementsToRetain).o();
        }
        return self.o().retainAll(elementsToRetain);
    }

    @z7.a
    public static boolean t(q8<?> multisetToModify, q8<?> multisetToRetain) {
        return u(multisetToModify, multisetToRetain);
    }

    private static <E> boolean u(q8<E> multisetToModify, q8<?> occurrencesToRetain) {
        com.google.common.base.j0.E(multisetToModify);
        com.google.common.base.j0.E(occurrencesToRetain);
        Iterator<q8.a<E>> it = multisetToModify.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            q8.a<E> next = it.next();
            int iP3 = occurrencesToRetain.P3(next.X0());
            if (iP3 == 0) {
                it.remove();
            } else if (iP3 < next.getCount()) {
                multisetToModify.g1(next.X0(), iP3);
            }
            z10 = true;
        }
        return z10;
    }

    static <E> int v(q8<E> self, @b9 E element, int count) {
        a3.b(count, "count");
        int iP3 = self.P3(element);
        int i10 = count - iP3;
        if (i10 > 0) {
            self.H(element, i10);
            return iP3;
        }
        if (i10 < 0) {
            self.f0(element, -i10);
        }
        return iP3;
    }

    static <E> boolean w(q8<E> self, @b9 E element, int oldCount, int newCount) {
        a3.b(oldCount, "oldCount");
        a3.b(newCount, "newCount");
        if (self.P3(element) != oldCount) {
            return false;
        }
        self.g1(element, newCount);
        return true;
    }

    public static <E> q8<E> x(final q8<? extends E> multiset1, final q8<? extends E> multiset2) {
        com.google.common.base.j0.E(multiset1);
        com.google.common.base.j0.E(multiset2);
        return new c(multiset1, multiset2);
    }

    @d6
    public static <T, E, M extends q8<E>> Collector<T, ?, M> y(Function<? super T, E> elementFunction, ToIntFunction<? super T> countFunction, Supplier<M> multisetSupplier) {
        return y2.Y(elementFunction, countFunction, multisetSupplier);
    }

    public static <E> q8<E> z(final q8<? extends E> multiset1, final q8<? extends E> multiset2) {
        com.google.common.base.j0.E(multiset1);
        com.google.common.base.j0.E(multiset2);
        return new a(multiset1, multiset2);
    }
}
