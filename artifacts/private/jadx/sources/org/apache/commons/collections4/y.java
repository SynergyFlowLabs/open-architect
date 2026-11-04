package org.apache.commons.collections4;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class y {

    private static final class b extends AbstractList<Character> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f336417a;

        public b(CharSequence charSequence) {
            this.f336417a = charSequence;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Character get(int i10) {
            return Character.valueOf(this.f336417a.charAt(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f336417a.length();
        }
    }

    private static final class c<E> implements org.apache.commons.collections4.sequence.a<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<E> f336418a = new ArrayList<>();

        @Override // org.apache.commons.collections4.sequence.a
        public void a(E e10) {
        }

        @Override // org.apache.commons.collections4.sequence.a
        public void b(E e10) {
        }

        @Override // org.apache.commons.collections4.sequence.a
        public void c(E e10) {
            this.f336418a.add(e10);
        }

        public List<E> d() {
            return this.f336418a;
        }
    }

    private static class d<T> extends AbstractList<List<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<T> f336419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f336420b;

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<T> get(int i10) {
            int size = size();
            if (i10 < 0) {
                throw new IndexOutOfBoundsException("Index " + i10 + " must not be negative");
            }
            if (i10 < size) {
                int i11 = this.f336420b;
                int i12 = i10 * i11;
                return this.f336419a.subList(i12, Math.min(i11 + i12, this.f336419a.size()));
            }
            throw new IndexOutOfBoundsException("Index " + i10 + " must be less than size " + size);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f336419a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return (int) Math.ceil(((double) this.f336419a.size()) / ((double) this.f336420b));
        }

        private d(List<T> list, int i10) {
            this.f336419a = list;
            this.f336420b = i10;
        }
    }

    private y() {
    }

    public static <T> List<T> a(List<T> list, List<T> list2) {
        return list == null ? list2 : list;
    }

    public static <T> List<T> b(List<T> list) {
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public static <E> List<E> c(List<E> list) {
        return org.apache.commons.collections4.list.e.k(list);
    }

    public static int d(Collection<?> collection) {
        if (collection == null) {
            return 0;
        }
        Iterator<?> it = collection.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next == null ? 0 : next.hashCode());
        }
        return iHashCode;
    }

    public static <E> int e(List<E> list, l0<E> l0Var) {
        if (list == null || l0Var == null) {
            return -1;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (l0Var.a(list.get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public static <E> List<E> f(List<? extends E> list, List<? extends E> list2) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > list2.size()) {
            list2 = list;
            list = list2;
        }
        HashSet hashSet = new HashSet(list);
        for (E e10 : list2) {
            if (hashSet.contains(e10)) {
                arrayList.add(e10);
                hashSet.remove(e10);
            }
        }
        return arrayList;
    }

    public static boolean g(Collection<?> collection, Collection<?> collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection != null && collection2 != null && collection.size() == collection2.size()) {
            Iterator<?> it = collection.iterator();
            Iterator<?> it2 = collection2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                Object next2 = it2.next();
                if (next == null) {
                    if (next2 != null) {
                        return false;
                    }
                } else if (!next.equals(next2)) {
                    return false;
                }
            }
            if (!it.hasNext() && !it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static <E> List<E> h(List<E> list, n<? extends E> nVar) {
        return org.apache.commons.collections4.list.g.k(list, nVar);
    }

    public static String i(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new NullPointerException("CharSequence must not be null");
        }
        List listJ = j(new b(charSequence), new b(charSequence2));
        StringBuilder sb2 = new StringBuilder();
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            sb2.append((Character) it.next());
        }
        return sb2.toString();
    }

    public static <E> List<E> j(List<E> list, List<E> list2) {
        return k(list, list2, org.apache.commons.collections4.functors.m.c());
    }

    public static <E> List<E> k(List<E> list, List<E> list2, m<? super E> mVar) {
        if (list == null || list2 == null) {
            throw new NullPointerException("List must not be null");
        }
        if (mVar == null) {
            throw new NullPointerException("Equator must not be null");
        }
        org.apache.commons.collections4.sequence.d dVarD = new org.apache.commons.collections4.sequence.i(list, list2, mVar).d();
        c cVar = new c();
        dVarD.f(cVar);
        return cVar.d();
    }

    public static <T> List<List<T>> l(List<T> list, int i10) {
        if (list == null) {
            throw new NullPointerException("List must not be null");
        }
        if (i10 > 0) {
            return new d(list, i10);
        }
        throw new IllegalArgumentException("Size must be greater than 0");
    }

    public static <E> List<E> m(List<E> list, l0<E> l0Var) {
        return org.apache.commons.collections4.list.i.s(list, l0Var);
    }

    public static <E> List<E> n(Collection<E> collection, Collection<?> collection2) {
        ArrayList arrayList = new ArrayList();
        for (E e10 : collection) {
            if (!collection2.contains(e10)) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    public static <E> List<E> o(Collection<E> collection, Collection<?> collection2) {
        ArrayList arrayList = new ArrayList(Math.min(collection.size(), collection2.size()));
        for (E e10 : collection) {
            if (collection2.contains(e10)) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    public static <E> List<E> p(Collection<? extends E> collection, l0<? super E> l0Var) {
        return (List) j.c0(collection, l0Var, new ArrayList(collection.size()));
    }

    public static <E> List<E> q(Collection<? extends E> collection, l0<? super E> l0Var) {
        return (List) j.f0(collection, l0Var, new ArrayList(collection.size()));
    }

    public static <E> List<E> r(List<E> list, List<? extends E> list2) {
        ArrayList arrayList = new ArrayList();
        org.apache.commons.collections4.bag.f fVar = new org.apache.commons.collections4.bag.f(list2);
        for (E e10 : list) {
            if (!fVar.f0(e10, 1)) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    public static <E> List<E> s(List<? extends E> list, List<? extends E> list2) {
        return r(v(list, list2), f(list, list2));
    }

    public static <E> List<E> t(List<E> list) {
        return Collections.synchronizedList(list);
    }

    public static <E> List<E> u(List<E> list, w0<? super E, ? extends E> w0Var) {
        return org.apache.commons.collections4.list.k.t(list, w0Var);
    }

    public static <E> List<E> v(List<? extends E> list, List<? extends E> list2) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public static <E> List<E> w(List<? extends E> list) {
        return org.apache.commons.collections4.list.m.k(list);
    }
}
