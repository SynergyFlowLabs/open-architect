package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public final class z9 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    class a<E> extends m<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f118450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f118451b;

        /* JADX INFO: renamed from: com.google.common.collect.z9$a$a, reason: collision with other inner class name */
        class C1077a extends com.google.common.collect.c<E> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator<? extends E> f118452c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final Iterator<? extends E> f118453d;

            C1077a() {
                this.f118452c = a.this.f118450a.iterator();
                this.f118453d = a.this.f118451b.iterator();
            }

            @Override // com.google.common.collect.c
            @fj.a
            protected E b() {
                if (this.f118452c.hasNext()) {
                    return this.f118452c.next();
                }
                while (this.f118453d.hasNext()) {
                    E next = this.f118453d.next();
                    if (!a.this.f118450a.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(final Set val$set1, final Set val$set2) {
            super(null);
            this.f118450a = val$set1;
            this.f118451b = val$set2;
        }

        @Override // com.google.common.collect.z9.m
        public <S extends Set<E>> S c(S set) {
            set.addAll(this.f118450a);
            set.addAll(this.f118451b);
            return set;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object object) {
            return this.f118450a.contains(object) || this.f118451b.contains(object);
        }

        @Override // com.google.common.collect.z9.m
        public z6<E> i() {
            return new z6.a().c(this.f118450a).c(this.f118451b).e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f118450a.isEmpty() && this.f118451b.isEmpty();
        }

        @Override // com.google.common.collect.z9.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public nb<E> iterator() {
            return new C1077a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f118450a.size();
            Iterator<E> it = this.f118451b.iterator();
            while (it.hasNext()) {
                if (!this.f118450a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class b<E> extends m<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f118455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f118456b;

        class a extends com.google.common.collect.c<E> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator<E> f118457c;

            a() {
                this.f118457c = b.this.f118455a.iterator();
            }

            @Override // com.google.common.collect.c
            @fj.a
            protected E b() {
                while (this.f118457c.hasNext()) {
                    E next = this.f118457c.next();
                    if (b.this.f118456b.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(final Set val$set1, final Set val$set2) {
            super(null);
            this.f118455a = val$set1;
            this.f118456b = val$set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object object) {
            return this.f118455a.contains(object) && this.f118456b.contains(object);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f118455a.containsAll(collection) && this.f118456b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f118456b, this.f118455a);
        }

        @Override // com.google.common.collect.z9.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k */
        public nb<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f118455a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f118456b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class c<E> extends m<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f118459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f118460b;

        class a extends com.google.common.collect.c<E> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator<E> f118461c;

            a() {
                this.f118461c = c.this.f118459a.iterator();
            }

            @Override // com.google.common.collect.c
            @fj.a
            protected E b() {
                while (this.f118461c.hasNext()) {
                    E next = this.f118461c.next();
                    if (!c.this.f118460b.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(final Set val$set1, final Set val$set2) {
            super(null);
            this.f118459a = val$set1;
            this.f118460b = val$set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object element) {
            return this.f118459a.contains(element) && !this.f118460b.contains(element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f118460b.containsAll(this.f118459a);
        }

        @Override // com.google.common.collect.z9.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k */
        public nb<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f118459a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (!this.f118460b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class d<E> extends m<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f118463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f118464b;

        class a extends com.google.common.collect.c<E> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f118465c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f118466d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ d f118467e;

            a(final d this$0, final Iterator val$itr1, final Iterator val$itr2) {
                this.f118465c = val$itr1;
                this.f118466d = val$itr2;
                this.f118467e = this$0;
            }

            @Override // com.google.common.collect.c
            @fj.a
            public E b() {
                while (this.f118465c.hasNext()) {
                    E e10 = (E) this.f118465c.next();
                    if (!this.f118467e.f118464b.contains(e10)) {
                        return e10;
                    }
                }
                while (this.f118466d.hasNext()) {
                    E e11 = (E) this.f118466d.next();
                    if (!this.f118467e.f118463a.contains(e11)) {
                        return e11;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(final Set val$set1, final Set val$set2) {
            super(null);
            this.f118463a = val$set1;
            this.f118464b = val$set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object element) {
            return this.f118464b.contains(element) ^ this.f118463a.contains(element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f118463a.equals(this.f118464b);
        }

        @Override // com.google.common.collect.z9.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k */
        public nb<E> iterator() {
            return new a(this, this.f118463a.iterator(), this.f118464b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f118463a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (!this.f118464b.contains(it.next())) {
                    i10++;
                }
            }
            Iterator<E> it2 = this.f118464b.iterator();
            while (it2.hasNext()) {
                if (!this.f118463a.contains(it2.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class e<E> extends AbstractSet<Set<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f118468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n6 f118469b;

        class a extends com.google.common.collect.c<Set<E>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final BitSet f118470c;

            /* JADX INFO: renamed from: com.google.common.collect.z9$e$a$a, reason: collision with other inner class name */
            class C1078a extends AbstractSet<E> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ BitSet f118472a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f118473b;

                /* JADX INFO: renamed from: com.google.common.collect.z9$e$a$a$a, reason: collision with other inner class name */
                class C1079a extends com.google.common.collect.c<E> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f118474c = -1;

                    C1079a() {
                    }

                    @Override // com.google.common.collect.c
                    @fj.a
                    protected E b() {
                        int iNextSetBit = C1078a.this.f118472a.nextSetBit(this.f118474c + 1);
                        this.f118474c = iNextSetBit;
                        return iNextSetBit == -1 ? c() : e.this.f118469b.keySet().c().get(this.f118474c);
                    }
                }

                C1078a(final a this$1, final BitSet val$copy) {
                    this.f118472a = val$copy;
                    this.f118473b = this$1;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(@fj.a Object o10) {
                    Integer num = (Integer) e.this.f118469b.get(o10);
                    return num != null && this.f118472a.get(num.intValue());
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<E> iterator() {
                    return new C1079a();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return e.this.f118468a;
                }
            }

            a() {
                this.f118470c = new BitSet(e.this.f118469b.size());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Set<E> b() {
                if (this.f118470c.isEmpty()) {
                    this.f118470c.set(0, e.this.f118468a);
                } else {
                    int iNextSetBit = this.f118470c.nextSetBit(0);
                    int iNextClearBit = this.f118470c.nextClearBit(iNextSetBit);
                    if (iNextClearBit == e.this.f118469b.size()) {
                        return c();
                    }
                    int i10 = (iNextClearBit - iNextSetBit) - 1;
                    this.f118470c.set(0, i10);
                    this.f118470c.clear(i10, iNextClearBit);
                    this.f118470c.set(iNextClearBit);
                }
                return new C1078a(this, (BitSet) this.f118470c.clone());
            }
        }

        e(final int val$size, final n6 val$index) {
            this.f118468a = val$size;
            this.f118469b = val$index;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            if (o10 instanceof Set) {
                Set set = (Set) o10;
                if (set.size() == this.f118468a && this.f118469b.keySet().containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.math.f.a(this.f118469b.size(), this.f118468a);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "Sets.combinations(" + this.f118469b.keySet() + ", " + this.f118468a + ")";
        }
    }

    private static final class f<E> extends v4<List<E>> implements Set<List<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final transient l6<z6<E>> f118476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final transient z<E> f118477b;

        class a extends l6<List<E>> {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l6 f118478f;

            a(final l6 val$axes) {
                this.f118478f = val$axes;
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
            public List<E> get(int i10) {
                return ((z6) this.f118478f.get(i10)).c();
            }

            @Override // com.google.common.collect.h6
            boolean m() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.f118478f.size();
            }

            @Override // com.google.common.collect.l6, com.google.common.collect.h6
            @com.google.common.annotations.c
            @com.google.common.annotations.d
            Object writeReplace() {
                return super.writeReplace();
            }
        }

        private f(l6<z6<E>> axes, z<E> delegate) {
            this.f118476a = axes;
            this.f118477b = delegate;
        }

        static <E> Set<List<E>> i1(List<? extends Set<? extends E>> sets) {
            l6.a aVar = new l6.a(sets.size());
            Iterator<? extends Set<? extends E>> it = sets.iterator();
            while (it.hasNext()) {
                z6 z6VarA = z6.A(it.next());
                if (z6VarA.isEmpty()) {
                    return z6.G();
                }
                aVar.a(z6VarA);
            }
            l6<E> l6VarN = aVar.e();
            return new f(l6VarN, new z(new a(l6VarN)));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.v4, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
        public Collection<List<E>> i1() {
            return this.f118477b;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object object) {
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (list.size() != this.f118476a.size()) {
                return false;
            }
            Iterator<E> it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (!this.f118476a.get(i10).contains(it.next())) {
                    return false;
                }
                i10++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@fj.a Object object) {
            if (object instanceof f) {
                return this.f118476a.equals(((f) object).f118476a);
            }
            if (object instanceof Set) {
                Set set = (Set) object;
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i10 = 1;
            int size = size() - 1;
            for (int i11 = 0; i11 < this.f118476a.size(); i11++) {
                size = ~(~(size * 31));
            }
            nb<z6<E>> it = this.f118476a.iterator();
            while (it.hasNext()) {
                z6<E> next = it.next();
                i10 = ~(~((i10 * 31) + ((size() / next.size()) * next.hashCode())));
            }
            return ~(~(i10 + size));
        }
    }

    @com.google.common.annotations.c
    static class g<E> extends l5<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NavigableSet<E> f118479a;

        g(NavigableSet<E> forward) {
            this.f118479a = forward;
        }

        private static <T> a9<T> I1(Comparator<T> forward) {
            return a9.i(forward).E();
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        @fj.a
        public E ceiling(@b9 E e10) {
            return this.f118479a.floor(e10);
        }

        @Override // com.google.common.collect.s5, java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator = this.f118479a.comparator();
            return comparator == null ? a9.z().E() : I1(comparator);
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return this.f118479a.iterator();
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return this.f118479a;
        }

        @Override // com.google.common.collect.s5, java.util.SortedSet
        @b9
        public E first() {
            return this.f118479a.last();
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        @fj.a
        public E floor(@b9 E e10) {
            return this.f118479a.ceiling(e10);
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        public NavigableSet<E> headSet(@b9 E toElement, boolean inclusive) {
            return this.f118479a.tailSet(toElement, inclusive).descendingSet();
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        @fj.a
        public E higher(@b9 E e10) {
            return this.f118479a.lower(e10);
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.f118479a.descendingIterator();
        }

        @Override // com.google.common.collect.s5, java.util.SortedSet
        @b9
        public E last() {
            return this.f118479a.first();
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        @fj.a
        public E lower(@b9 E e10) {
            return this.f118479a.higher(e10);
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        @fj.a
        public E pollFirst() {
            return this.f118479a.pollLast();
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        @fj.a
        public E pollLast() {
            return this.f118479a.pollFirst();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.l5, com.google.common.collect.s5
        /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> L0() {
            return this.f118479a;
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        public NavigableSet<E> subSet(@b9 E fromElement, boolean fromInclusive, @b9 E toElement, boolean toInclusive) {
            return this.f118479a.subSet(toElement, toInclusive, fromElement, fromInclusive).descendingSet();
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        public NavigableSet<E> tailSet(@b9 E fromElement, boolean inclusive) {
            return this.f118479a.headSet(fromElement, inclusive).descendingSet();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return a1();
        }

        @Override // com.google.common.collect.m5
        public String toString() {
            return f1();
        }

        @Override // com.google.common.collect.s5, java.util.SortedSet
        public SortedSet<E> headSet(@b9 E toElement) {
            return y1(toElement);
        }

        @Override // com.google.common.collect.s5, java.util.SortedSet
        public SortedSet<E> subSet(@b9 E fromElement, @b9 E toElement) {
            return q1(fromElement, toElement);
        }

        @Override // com.google.common.collect.s5, java.util.SortedSet
        public SortedSet<E> tailSet(@b9 E fromElement) {
            return H1(fromElement);
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) c1(tArr);
        }
    }

    @com.google.common.annotations.c
    private static class h<E> extends j<E> implements NavigableSet<E> {
        h(NavigableSet<E> unfiltered, com.google.common.base.k0<? super E> predicate) {
            super(unfiltered, predicate);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E ceiling(@b9 E e10) {
            return (E) o7.r(i().tailSet(e10, true), this.f117104b, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return p7.w(i().descendingIterator(), this.f117104b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return z9.h(i().descendingSet(), this.f117104b);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E floor(@b9 E e10) {
            return (E) p7.z(i().headSet(e10, true).descendingIterator(), this.f117104b, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@b9 E toElement, boolean inclusive) {
            return z9.h(i().headSet(toElement, inclusive), this.f117104b);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E higher(@b9 E e10) {
            return (E) o7.r(i().tailSet(e10, false), this.f117104b, null);
        }

        NavigableSet<E> i() {
            return (NavigableSet) this.f117103a;
        }

        @Override // com.google.common.collect.z9.j, java.util.SortedSet
        @b9
        public E last() {
            return (E) p7.y(i().descendingIterator(), this.f117104b);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E lower(@b9 E e10) {
            return (E) p7.z(i().headSet(e10, false).descendingIterator(), this.f117104b, null);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E pollFirst() {
            return (E) o7.I(i(), this.f117104b);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E pollLast() {
            return (E) o7.I(i().descendingSet(), this.f117104b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@b9 E fromElement, boolean fromInclusive, @b9 E toElement, boolean toInclusive) {
            return z9.h(i().subSet(fromElement, fromInclusive, toElement, toInclusive), this.f117104b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@b9 E fromElement, boolean inclusive) {
            return z9.h(i().tailSet(fromElement, inclusive), this.f117104b);
        }
    }

    private static class i<E> extends b3.a<E> implements Set<E> {
        i(Set<E> unfiltered, com.google.common.base.k0<? super E> predicate) {
            super(unfiltered, predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@fj.a Object object) {
            return z9.g(this, object);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return z9.k(this);
        }
    }

    private static class j<E> extends i<E> implements SortedSet<E> {
        j(SortedSet<E> unfiltered, com.google.common.base.k0<? super E> predicate) {
            super(unfiltered, predicate);
        }

        @Override // java.util.SortedSet
        @fj.a
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f117103a).comparator();
        }

        @Override // java.util.SortedSet
        @b9
        public E first() {
            return (E) p7.y(this.f117103a.iterator(), this.f117104b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@b9 E toElement) {
            return new j(((SortedSet) this.f117103a).headSet(toElement), this.f117104b);
        }

        @b9
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f117103a;
            while (true) {
                E e10 = (Object) sortedSetHeadSet.last();
                if (this.f117104b.apply(e10)) {
                    return e10;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@b9 E fromElement, @b9 E toElement) {
            return new j(((SortedSet) this.f117103a).subSet(fromElement, toElement), this.f117104b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@b9 E fromElement) {
            return new j(((SortedSet) this.f117103a).tailSet(fromElement), this.f117104b);
        }
    }

    static abstract class k<E> extends AbstractSet<E> {
        k() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c10) {
            return z9.I(this, c10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c10) {
            return super.retainAll((Collection) com.google.common.base.j0.E(c10));
        }
    }

    private static final class l<E> extends AbstractSet<Set<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n6<E, Integer> f118480a;

        class a extends com.google.common.collect.b<Set<E>> {
            a(int size) {
                super(size);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Set<E> b(final int setBits) {
                return new n(l.this.f118480a, setBits);
            }
        }

        l(Set<E> input) {
            com.google.common.base.j0.k(input.size() <= 30, "Too many elements to create power set: %s > 30", input.size());
            this.f118480a = b8.Q(input);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.f118480a.keySet().containsAll((Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@fj.a Object obj) {
            return obj instanceof l ? this.f118480a.keySet().equals(((l) obj).f118480a.keySet()) : super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f118480a.keySet().hashCode() << (this.f118480a.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a(size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.f118480a.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "powerSet(" + this.f118480a + ")";
        }
    }

    public static abstract class m<E> extends AbstractSet<E> {
        /* synthetic */ m(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @z7.a
        @Deprecated
        @z7.e("Always throws UnsupportedOperationException")
        public final boolean add(@b9 E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @z7.a
        @Deprecated
        @z7.e("Always throws UnsupportedOperationException")
        public final boolean addAll(Collection<? extends E> newElements) {
            throw new UnsupportedOperationException();
        }

        @z7.a
        public <S extends Set<E>> S c(S set) {
            set.addAll(this);
            return set;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @z7.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        public z6<E> i() {
            return z6.A(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k */
        public abstract nb<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @z7.a
        @z7.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(@fj.a Object object) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @z7.a
        @Deprecated
        @z7.e("Always throws UnsupportedOperationException")
        public final boolean removeAll(Collection<?> oldElements) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @z7.a
        @Deprecated
        @z7.e("Always throws UnsupportedOperationException")
        public final boolean retainAll(Collection<?> elementsToKeep) {
            throw new UnsupportedOperationException();
        }

        private m() {
        }
    }

    private static final class n<E> extends AbstractSet<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n6<E, Integer> f118482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f118483b;

        class a extends nb<E> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final l6<E> f118484a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f118485b;

            a() {
                this.f118484a = n.this.f118482a.keySet().c();
                this.f118485b = n.this.f118483b;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f118485b != 0;
            }

            @Override // java.util.Iterator
            public E next() {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f118485b);
                if (iNumberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.f118485b &= ~(1 << iNumberOfTrailingZeros);
                return this.f118484a.get(iNumberOfTrailingZeros);
            }
        }

        n(n6<E, Integer> inputSet, int mask) {
            this.f118482a = inputSet;
            this.f118483b = mask;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            Integer num = this.f118482a.get(o10);
            return (num == null || (this.f118483b & (1 << num.intValue())) == 0) ? false : true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.f118483b);
        }
    }

    static final class o<E> extends s5<E> implements NavigableSet<E>, Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f118487d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NavigableSet<E> f118488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SortedSet<E> f118489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @a8.b
        @fj.a
        private transient o<E> f118490c;

        o(NavigableSet<E> delegate) {
            this.f118488a = (NavigableSet) com.google.common.base.j0.E(delegate);
            this.f118489b = Collections.unmodifiableSortedSet(delegate);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E ceiling(@b9 E e10) {
            return this.f118488a.ceiling(e10);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return p7.e0(this.f118488a.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            o<E> oVar = this.f118490c;
            if (oVar != null) {
                return oVar;
            }
            o<E> oVar2 = new o<>(this.f118488a.descendingSet());
            this.f118490c = oVar2;
            oVar2.f118490c = this;
            return oVar2;
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E floor(@b9 E e10) {
            return this.f118488a.floor(e10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@b9 E toElement, boolean inclusive) {
            return z9.P(this.f118488a.headSet(toElement, inclusive));
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E higher(@b9 E e10) {
            return this.f118488a.higher(e10);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E lower(@b9 E e10) {
            return this.f118488a.lower(e10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.s5, com.google.common.collect.o5
        /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedSet<E> i1() {
            return this.f118489b;
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@b9 E fromElement, boolean fromInclusive, @b9 E toElement, boolean toInclusive) {
            return z9.P(this.f118488a.subSet(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@b9 E fromElement, boolean inclusive) {
            return z9.P(this.f118488a.tailSet(fromElement, inclusive));
        }
    }

    private z9() {
    }

    public static <E> LinkedHashSet<E> A() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> B(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new LinkedHashSet<>((Collection) elements);
        }
        LinkedHashSet<E> linkedHashSetA = A();
        o7.a(linkedHashSetA, elements);
        return linkedHashSetA;
    }

    public static <E> LinkedHashSet<E> C(int expectedSize) {
        return new LinkedHashSet<>(b8.o(expectedSize));
    }

    @Deprecated
    public static <E> Set<E> D(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> E() {
        return new TreeSet<>();
    }

    public static <E extends Comparable> TreeSet<E> F(Iterable<? extends E> elements) {
        TreeSet<E> treeSetE = E();
        o7.a(treeSetE, elements);
        return treeSetE;
    }

    public static <E> TreeSet<E> G(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) com.google.common.base.j0.E(comparator));
    }

    @com.google.common.annotations.b(serializable = false)
    public static <E> Set<Set<E>> H(Set<E> set) {
        return new l(set);
    }

    static boolean I(Set<?> set, Collection<?> collection) {
        com.google.common.base.j0.E(collection);
        if (collection instanceof q8) {
            collection = ((q8) collection).o();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? J(set, collection.iterator()) : p7.U(set.iterator(), collection);
    }

    static boolean J(Set<?> set, Iterator<?> iterator) {
        boolean zRemove = false;
        while (iterator.hasNext()) {
            zRemove |= set.remove(iterator.next());
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.annotations.c
    public static <K extends Comparable<? super K>> NavigableSet<K> K(NavigableSet<K> set, f9<K> range) {
        if (set.comparator() != null && set.comparator() != a9.z() && range.q() && range.r()) {
            com.google.common.base.j0.e(set.comparator().compare(range.y(), range.J()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.q() && range.r()) {
            Comparable comparableY = range.y();
            x xVarX = range.x();
            x xVar = x.CLOSED;
            return set.subSet(comparableY, xVarX == xVar, range.J(), range.I() == xVar);
        }
        if (range.q()) {
            return set.tailSet(range.y(), range.x() == x.CLOSED);
        }
        if (range.r()) {
            return set.headSet(range.J(), range.I() == x.CLOSED);
        }
        return (NavigableSet) com.google.common.base.j0.E(set);
    }

    public static <E> m<E> L(final Set<? extends E> set1, final Set<? extends E> set2) {
        com.google.common.base.j0.F(set1, "set1");
        com.google.common.base.j0.F(set2, "set2");
        return new d(set1, set2);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> NavigableSet<E> M(NavigableSet<E> navigableSet) {
        return na.q(navigableSet);
    }

    @d6
    public static <E extends Enum<E>> Collector<E, ?, z6<E>> N() {
        return y2.J();
    }

    public static <E> m<E> O(final Set<? extends E> set1, final Set<? extends E> set2) {
        com.google.common.base.j0.F(set1, "set1");
        com.google.common.base.j0.F(set2, "set2");
        return new a(set1, set2);
    }

    public static <E> NavigableSet<E> P(NavigableSet<E> set) {
        if (!(set instanceof h6) && !(set instanceof o)) {
            return new o(set);
        }
        return set;
    }

    public static <B> Set<List<B>> a(List<? extends Set<? extends B>> sets) {
        return f.i1(sets);
    }

    @SafeVarargs
    public static <B> Set<List<B>> b(Set<? extends B>... sets) {
        return a(Arrays.asList(sets));
    }

    public static <E> Set<Set<E>> c(Set<E> set, final int size) {
        n6 n6VarQ = b8.Q(set);
        a3.b(size, "size");
        com.google.common.base.j0.m(size <= n6VarQ.size(), "size (%s) must be <= set.size() (%s)", size, n6VarQ.size());
        if (size == 0) {
            return z6.J(z6.G());
        }
        return size == n6VarQ.size() ? z6.J(n6VarQ.keySet()) : new e(size, n6VarQ);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E extends Enum<E>> EnumSet<E> d(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        com.google.common.base.j0.e(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return o(collection, collection.iterator().next().getDeclaringClass());
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E extends Enum<E>> EnumSet<E> e(Collection<E> collection, Class<E> type) {
        com.google.common.base.j0.E(collection);
        return collection instanceof EnumSet ? EnumSet.complementOf((EnumSet) collection) : o(collection, type);
    }

    public static <E> m<E> f(final Set<E> set1, final Set<?> set2) {
        com.google.common.base.j0.F(set1, "set1");
        com.google.common.base.j0.F(set2, "set2");
        return new c(set1, set2);
    }

    static boolean g(Set<?> s10, @fj.a Object object) {
        if (s10 == object) {
            return true;
        }
        if (object instanceof Set) {
            Set set = (Set) object;
            try {
                if (s10.size() == set.size() && s10.containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.annotations.c
    public static <E> NavigableSet<E> h(NavigableSet<E> unfiltered, com.google.common.base.k0<? super E> predicate) {
        if (!(unfiltered instanceof i)) {
            return new h((NavigableSet) com.google.common.base.j0.E(unfiltered), (com.google.common.base.k0) com.google.common.base.j0.E(predicate));
        }
        i iVar = (i) unfiltered;
        return new h((NavigableSet) iVar.f117103a, com.google.common.base.l0.d(iVar.f117104b, predicate));
    }

    public static <E> Set<E> i(Set<E> unfiltered, com.google.common.base.k0<? super E> predicate) {
        if (unfiltered instanceof SortedSet) {
            return j((SortedSet) unfiltered, predicate);
        }
        if (!(unfiltered instanceof i)) {
            return new i((Set) com.google.common.base.j0.E(unfiltered), (com.google.common.base.k0) com.google.common.base.j0.E(predicate));
        }
        i iVar = (i) unfiltered;
        return new i((Set) iVar.f117103a, com.google.common.base.l0.d(iVar.f117104b, predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> j(SortedSet<E> unfiltered, com.google.common.base.k0<? super E> predicate) {
        if (!(unfiltered instanceof i)) {
            return new j((SortedSet) com.google.common.base.j0.E(unfiltered), (com.google.common.base.k0) com.google.common.base.j0.E(predicate));
        }
        i iVar = (i) unfiltered;
        return new j((SortedSet) iVar.f117103a, com.google.common.base.l0.d(iVar.f117104b, predicate));
    }

    static int k(Set<?> s10) {
        Iterator<?> it = s10.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    @com.google.common.annotations.b(serializable = true)
    public static <E extends Enum<E>> z6<E> l(E anElement, E... otherElements) {
        return k6.R(EnumSet.of((Enum) anElement, (Enum[]) otherElements));
    }

    @com.google.common.annotations.b(serializable = true)
    public static <E extends Enum<E>> z6<E> m(Iterable<E> elements) {
        if (elements instanceof k6) {
            return (k6) elements;
        }
        if (elements instanceof Collection) {
            Collection collection = (Collection) elements;
            return collection.isEmpty() ? z6.G() : k6.R(EnumSet.copyOf(collection));
        }
        Iterator<E> it = elements.iterator();
        if (!it.hasNext()) {
            return z6.G();
        }
        EnumSet enumSetOf = EnumSet.of((Enum) it.next());
        p7.a(enumSetOf, it);
        return k6.R(enumSetOf);
    }

    public static <E> m<E> n(final Set<E> set1, final Set<?> set2) {
        com.google.common.base.j0.F(set1, "set1");
        com.google.common.base.j0.F(set2, "set2");
        return new b(set1, set2);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static <E extends Enum<E>> EnumSet<E> o(Collection<E> collection, Class<E> type) {
        EnumSet<E> enumSetAllOf = EnumSet.allOf(type);
        enumSetAllOf.removeAll(collection);
        return enumSetAllOf;
    }

    public static <E> Set<E> p() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> Set<E> q(Iterable<? extends E> elements) {
        Set<E> setP = p();
        o7.a(setP, elements);
        return setP;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> CopyOnWriteArraySet<E> r() {
        return new CopyOnWriteArraySet<>();
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> CopyOnWriteArraySet<E> s(Iterable<? extends E> elements) {
        return new CopyOnWriteArraySet<>(elements instanceof Collection ? (Collection) elements : x7.r(elements));
    }

    public static <E extends Enum<E>> EnumSet<E> t(Iterable<E> iterable, Class<E> elementType) {
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(elementType);
        o7.a(enumSetNoneOf, iterable);
        return enumSetNoneOf;
    }

    public static <E> HashSet<E> u() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> v(Iterable<? extends E> elements) {
        return elements instanceof Collection ? new HashSet<>((Collection) elements) : w(elements.iterator());
    }

    public static <E> HashSet<E> w(Iterator<? extends E> elements) {
        HashSet<E> hashSetU = u();
        p7.a(hashSetU, elements);
        return hashSetU;
    }

    public static <E> HashSet<E> x(E... elements) {
        HashSet<E> hashSetY = y(elements.length);
        Collections.addAll(hashSetY, elements);
        return hashSetY;
    }

    public static <E> HashSet<E> y(int expectedSize) {
        return new HashSet<>(b8.o(expectedSize));
    }

    public static <E> Set<E> z() {
        return Collections.newSetFromMap(b8.b0());
    }
}
