package org.apache.commons.collections4;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes14.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SortedSet f336251a = org.apache.commons.collections4.set.p.l(new TreeSet());

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class a<E> extends g<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f336252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f336253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f336254c;

        a(Set set, Set set2, g gVar) {
            this.f336252a = set;
            this.f336253b = set2;
            this.f336254c = gVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!this.f336252a.contains(obj) && !this.f336253b.contains(obj)) {
                return false;
            }
            return true;
        }

        @Override // org.apache.commons.collections4.r0.g
        public Iterator<E> i() {
            return w.u(this.f336252a.iterator(), this.f336254c.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f336252a.isEmpty() && this.f336253b.isEmpty();
        }

        @Override // org.apache.commons.collections4.r0.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f336252a.size() + this.f336254c.size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class b<E> implements l0<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f336255a;

        b(Set set) {
            this.f336255a = set;
        }

        @Override // org.apache.commons.collections4.l0
        public boolean a(E e10) {
            return !this.f336255a.contains(e10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class c<E> extends g<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f336256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f336257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0 f336258c;

        c(Set set, Set set2, l0 l0Var) {
            this.f336256a = set;
            this.f336257b = set2;
            this.f336258c = l0Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f336256a.contains(obj) && !this.f336257b.contains(obj);
        }

        @Override // org.apache.commons.collections4.r0.g
        public Iterator<E> i() {
            return w.F(this.f336256a.iterator(), this.f336258c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class d<E> implements l0<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f336259a;

        d(Set set) {
            this.f336259a = set;
        }

        @Override // org.apache.commons.collections4.l0
        public boolean a(E e10) {
            return this.f336259a.contains(e10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class e<E> extends g<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f336260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f336261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0 f336262c;

        e(Set set, Set set2, l0 l0Var) {
            this.f336260a = set;
            this.f336261b = set2;
            this.f336262c = l0Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f336260a.contains(obj) && this.f336261b.contains(obj);
        }

        @Override // org.apache.commons.collections4.r0.g
        public Iterator<E> i() {
            return w.F(this.f336260a.iterator(), this.f336262c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class f<E> extends g<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f336263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f336264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f336265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f336266d;

        f(Set set, Set set2, g gVar, g gVar2) {
            this.f336263a = set;
            this.f336264b = set2;
            this.f336265c = gVar;
            this.f336266d = gVar2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f336264b.contains(obj) ^ this.f336263a.contains(obj);
        }

        @Override // org.apache.commons.collections4.r0.g
        public Iterator<E> i() {
            return w.u(this.f336265c.iterator(), this.f336266d.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f336265c.isEmpty() && this.f336266d.isEmpty();
        }

        @Override // org.apache.commons.collections4.r0.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f336265c.size() + this.f336266d.size();
        }
    }

    public static abstract class g<E> extends AbstractSet<E> {
        public <S extends Set<E>> void c(S s10) {
            j.a(s10, this);
        }

        protected abstract Iterator<E> i();

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return w.l0(i());
        }

        public Set<E> k() {
            HashSet hashSet = new HashSet(size());
            c(hashSet);
            return hashSet;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return w.a0(iterator());
        }
    }

    private r0() {
    }

    public static <E> g<E> a(Set<? extends E> set, Set<? extends E> set2) {
        if (set == null || set2 == null) {
            throw new NullPointerException("Sets must not be null.");
        }
        return new c(set, set2, new b(set2));
    }

    public static <E> g<E> b(Set<? extends E> set, Set<? extends E> set2) {
        if (set == null || set2 == null) {
            throw new NullPointerException("Sets must not be null.");
        }
        return new f(set, set2, a(set, set2), a(set2, set));
    }

    public static <T> Set<T> c(Set<T> set) {
        return set == null ? Collections.EMPTY_SET : set;
    }

    public static <E> Set<E> d() {
        return Collections.EMPTY_SET;
    }

    public static <E> SortedSet<E> e() {
        return f336251a;
    }

    public static <T> int f(Collection<T> collection) {
        int iHashCode = 0;
        if (collection == null) {
            return 0;
        }
        for (T t10 : collection) {
            if (t10 != null) {
                iHashCode += t10.hashCode();
            }
        }
        return iHashCode;
    }

    public static <E> g<E> g(Set<? extends E> set, Set<? extends E> set2) {
        if (set == null || set2 == null) {
            throw new NullPointerException("Sets must not be null.");
        }
        return new e(set, set2, new d(set2));
    }

    public static boolean h(Collection<?> collection, Collection<?> collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection != null && collection2 != null && collection.size() == collection2.size()) {
            return collection.containsAll(collection2);
        }
        return false;
    }

    public static <E> Set<E> i() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static <E> Set<E> j(Set<E> set) {
        return org.apache.commons.collections4.set.f.n(set);
    }

    public static <E> SortedSet<E> k(NavigableSet<E> navigableSet, l0<? super E> l0Var) {
        return org.apache.commons.collections4.set.h.u(navigableSet, l0Var);
    }

    public static <E> Set<E> l(Set<E> set, l0<? super E> l0Var) {
        return org.apache.commons.collections4.set.i.p(set, l0Var);
    }

    public static <E> SortedSet<E> m(SortedSet<E> sortedSet, l0<? super E> l0Var) {
        return org.apache.commons.collections4.set.j.s(sortedSet, l0Var);
    }

    public static <E> Set<E> n(Set<E> set) {
        return Collections.synchronizedSet(set);
    }

    public static <E> SortedSet<E> o(SortedSet<E> sortedSet) {
        return Collections.synchronizedSortedSet(sortedSet);
    }

    public static <E> SortedSet<E> p(NavigableSet<E> navigableSet, w0<? super E, ? extends E> w0Var) {
        return org.apache.commons.collections4.set.k.w(navigableSet, w0Var);
    }

    public static <E> Set<E> q(Set<E> set, w0<? super E, ? extends E> w0Var) {
        return org.apache.commons.collections4.set.l.p(set, w0Var);
    }

    public static <E> SortedSet<E> r(SortedSet<E> sortedSet, w0<? super E, ? extends E> w0Var) {
        return org.apache.commons.collections4.set.m.t(sortedSet, w0Var);
    }

    public static <E> g<E> s(Set<? extends E> set, Set<? extends E> set2) {
        if (set == null || set2 == null) {
            throw new NullPointerException("Sets must not be null.");
        }
        return new a(set, set2, a(set2, set));
    }

    public static <E> SortedSet<E> t(NavigableSet<E> navigableSet) {
        return org.apache.commons.collections4.set.n.m(navigableSet);
    }

    public static <E> Set<E> u(Set<? extends E> set) {
        return org.apache.commons.collections4.set.o.k(set);
    }

    public static <E> SortedSet<E> v(SortedSet<E> sortedSet) {
        return org.apache.commons.collections4.set.p.l(sortedSet);
    }
}
