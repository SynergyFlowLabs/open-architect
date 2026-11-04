package com.google.common.collect;

import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public final class x7 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    class a<E> extends g<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @com.google.common.annotations.d
        private static final long f118286b = 0;

        a(List backingList) {
            super(backingList);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            return this.f118288a.listIterator(index);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class b<E> extends c<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @com.google.common.annotations.d
        private static final long f118287b = 0;

        b(List backingList) {
            super(backingList);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            return this.f118288a.listIterator(index);
        }
    }

    private static class c<E> extends AbstractList<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<E> f118288a;

        c(List<E> backingList) {
            this.f118288a = (List) com.google.common.base.j0.E(backingList);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, @b9 E element) {
            this.f118288a.add(index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, Collection<? extends E> c10) {
            return this.f118288a.addAll(index, c10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@fj.a Object o10) {
            return this.f118288a.contains(o10);
        }

        @Override // java.util.AbstractList, java.util.List
        @b9
        public E get(int index) {
            return this.f118288a.get(index);
        }

        @Override // java.util.AbstractList, java.util.List
        @b9
        public E remove(int index) {
            return this.f118288a.remove(index);
        }

        @Override // java.util.AbstractList, java.util.List
        @b9
        public E set(int index, @b9 E element) {
            return this.f118288a.set(index, element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f118288a.size();
        }
    }

    private static final class d extends AbstractList<Character> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f118289a;

        d(CharSequence sequence) {
            this.f118289a = sequence;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Character get(int index) {
            com.google.common.base.j0.C(index, size());
            return Character.valueOf(this.f118289a.charAt(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f118289a.length();
        }
    }

    private static class e<E> extends AbstractList<E> implements Serializable, RandomAccess {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @com.google.common.annotations.d
        private static final long f118290c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        final E f118291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final E[] f118292b;

        e(@b9 E e10, E[] eArr) {
            this.f118291a = e10;
            this.f118292b = (E[]) ((Object[]) com.google.common.base.j0.E(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @b9
        public E get(int index) {
            com.google.common.base.j0.C(index, size());
            return index == 0 ? this.f118291a : this.f118292b[index - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.f.t(this.f118292b.length, 1);
        }
    }

    private static class f<T> extends AbstractList<List<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<T> f118293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f118294b;

        f(List<T> list, int size) {
            this.f118293a = list;
            this.f118294b = size;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<T> get(int index) {
            com.google.common.base.j0.C(index, size());
            int i10 = this.f118294b;
            int i11 = index * i10;
            return this.f118293a.subList(i11, Math.min(i10 + i11, this.f118293a.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f118293a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.f.g(this.f118293a.size(), this.f118294b, RoundingMode.CEILING);
        }
    }

    private static class g<E> extends c<E> implements RandomAccess {
        g(List<E> backingList) {
            super(backingList);
        }
    }

    private static class h<T> extends f<T> implements RandomAccess {
        h(List<T> list, int size) {
            super(list, size);
        }
    }

    private static class i<T> extends j<T> implements RandomAccess {
        i(List<T> forwardList) {
            super(forwardList);
        }
    }

    private static class j<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<T> f118295a;

        class a implements ListIterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f118296a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ListIterator f118297b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f118298c;

            a(final j this$0, final ListIterator val$forwardIterator) {
                this.f118297b = val$forwardIterator;
                this.f118298c = this$0;
            }

            @Override // java.util.ListIterator
            public void add(@b9 T e10) {
                this.f118297b.add(e10);
                this.f118297b.previous();
                this.f118296a = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f118297b.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f118297b.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            @b9
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f118296a = true;
                return (T) this.f118297b.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f118298c.l(this.f118297b.nextIndex());
            }

            @Override // java.util.ListIterator
            @b9
            public T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f118296a = true;
                return (T) this.f118297b.next();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a3.e(this.f118296a);
                this.f118297b.remove();
                this.f118296a = false;
            }

            @Override // java.util.ListIterator
            public void set(@b9 T e10) {
                com.google.common.base.j0.g0(this.f118296a);
                this.f118297b.set(e10);
            }
        }

        j(List<T> forwardList) {
            this.f118295a = (List) com.google.common.base.j0.E(forwardList);
        }

        private int k(int index) {
            int size = size();
            com.google.common.base.j0.C(index, size);
            return (size - 1) - index;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int l(int index) {
            int size = size();
            com.google.common.base.j0.d0(index, size);
            return size - index;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, @b9 T element) {
            this.f118295a.add(l(index), element);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f118295a.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @b9
        public T get(int index) {
            return this.f118295a.get(k(index));
        }

        List<T> i() {
            return this.f118295a;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int index) {
            return new a(this, this.f118295a.listIterator(l(index)));
        }

        @Override // java.util.AbstractList, java.util.List
        @b9
        public T remove(int index) {
            return this.f118295a.remove(k(index));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int fromIndex, int toIndex) {
            subList(fromIndex, toIndex).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @b9
        public T set(int index, @b9 T element) {
            return this.f118295a.set(k(index), element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f118295a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            com.google.common.base.j0.f0(fromIndex, toIndex, size());
            return x7.B(this.f118295a.subList(l(toIndex), l(fromIndex)));
        }
    }

    private static final class k extends l6<Character> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f118299f;

        k(String string) {
            this.f118299f = string;
        }

        @Override // com.google.common.collect.l6, java.util.List
        /* JADX INFO: renamed from: Y */
        public l6<Character> subList(int fromIndex, int toIndex) {
            com.google.common.base.j0.f0(fromIndex, toIndex, size());
            return x7.g(this.f118299f.substring(fromIndex, toIndex));
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public Character get(int index) {
            com.google.common.base.j0.C(index, size());
            return Character.valueOf(this.f118299f.charAt(index));
        }

        @Override // com.google.common.collect.l6, java.util.List
        public int indexOf(@fj.a Object object) {
            if (object instanceof Character) {
                return this.f118299f.indexOf(((Character) object).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.l6, java.util.List
        public int lastIndexOf(@fj.a Object object) {
            if (object instanceof Character) {
                return this.f118299f.lastIndexOf(((Character) object).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f118299f.length();
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private static class l<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f118300c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<F> f118301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.common.base.t<? super F, ? extends T> f118302b;

        class a extends fb<F, T> {
            a(ListIterator backingIterator) {
                super(backingIterator);
            }

            @Override // com.google.common.collect.eb
            T b(F from) {
                return l.this.f118302b.apply(from);
            }
        }

        l(List<F> fromList, com.google.common.base.t<? super F, ? extends T> function) {
            this.f118301a = (List) com.google.common.base.j0.E(fromList);
            this.f118302b = (com.google.common.base.t) com.google.common.base.j0.E(function);
        }

        @Override // java.util.AbstractList, java.util.List
        @b9
        public T get(int i10) {
            return this.f118302b.apply(this.f118301a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f118301a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int index) {
            return new a(this.f118301a.listIterator(index));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i10) {
            return this.f118302b.apply(this.f118301a.remove(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int fromIndex, int toIndex) {
            this.f118301a.subList(fromIndex, toIndex).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f118301a.size();
        }
    }

    private static class m<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f118304c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<F> f118305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.common.base.t<? super F, ? extends T> f118306b;

        class a extends fb<F, T> {
            a(ListIterator backingIterator) {
                super(backingIterator);
            }

            @Override // com.google.common.collect.eb
            @b9
            T b(@b9 F from) {
                return m.this.f118306b.apply(from);
            }
        }

        m(List<F> fromList, com.google.common.base.t<? super F, ? extends T> function) {
            this.f118305a = (List) com.google.common.base.j0.E(fromList);
            this.f118306b = (com.google.common.base.t) com.google.common.base.j0.E(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f118305a.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(final int index) {
            return new a(this.f118305a.listIterator(index));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int fromIndex, int toIndex) {
            this.f118305a.subList(fromIndex, toIndex).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f118305a.size();
        }
    }

    private static class n<E> extends AbstractList<E> implements Serializable, RandomAccess {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @com.google.common.annotations.d
        private static final long f118308d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        final E f118309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @b9
        final E f118310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final E[] f118311c;

        n(@b9 E e10, @b9 E e11, E[] eArr) {
            this.f118309a = e10;
            this.f118310b = e11;
            this.f118311c = (E[]) ((Object[]) com.google.common.base.j0.E(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @b9
        public E get(int index) {
            if (index == 0) {
                return this.f118309a;
            }
            if (index == 1) {
                return this.f118310b;
            }
            com.google.common.base.j0.C(index, size());
            return this.f118311c[index - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.f.t(this.f118311c.length, 2);
        }
    }

    private x7() {
    }

    public static <T> List<List<T>> A(List<T> list, int size) {
        com.google.common.base.j0.E(list);
        com.google.common.base.j0.d(size > 0);
        return list instanceof RandomAccess ? new h(list, size) : new f(list, size);
    }

    public static <T> List<T> B(List<T> list) {
        if (list instanceof l6) {
            return ((l6) list).U();
        }
        if (list instanceof j) {
            return ((j) list).i();
        }
        return list instanceof RandomAccess ? new i(list) : new j(list);
    }

    static <E> List<E> C(final List<E> list, int fromIndex, int toIndex) {
        return (list instanceof RandomAccess ? new a(list) : new b(list)).subList(fromIndex, toIndex);
    }

    public static <F, T> List<T> D(List<F> fromList, com.google.common.base.t<? super F, ? extends T> function) {
        return fromList instanceof RandomAccess ? new l(fromList, function) : new m(fromList, function);
    }

    static <E> boolean a(List<E> list, int index, Iterable<? extends E> elements) {
        ListIterator<E> listIterator = list.listIterator(index);
        Iterator<? extends E> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            listIterator.add(it.next());
            z10 = true;
        }
        return z10;
    }

    public static <E> List<E> b(@b9 E first, @b9 E second, E[] rest) {
        return new n(first, second, rest);
    }

    public static <E> List<E> c(@b9 E first, E[] rest) {
        return new e(first, rest);
    }

    public static <B> List<List<B>> d(List<? extends List<? extends B>> lists) {
        return z.i(lists);
    }

    @SafeVarargs
    public static <B> List<List<B>> e(List<? extends B>... lists) {
        return d(Arrays.asList(lists));
    }

    static <T> List<T> f(Iterable<T> iterable) {
        return (List) iterable;
    }

    public static l6<Character> g(String string) {
        return new k((String) com.google.common.base.j0.E(string));
    }

    public static List<Character> h(CharSequence sequence) {
        return new d((CharSequence) com.google.common.base.j0.E(sequence));
    }

    @com.google.common.annotations.e
    static int i(int arraySize) {
        a3.b(arraySize, "arraySize");
        return com.google.common.primitives.l.A(((long) arraySize) + 5 + ((long) (arraySize / 10)));
    }

    static boolean j(List<?> thisList, @fj.a Object other) {
        if (other == com.google.common.base.j0.E(thisList)) {
            return true;
        }
        if (!(other instanceof List)) {
            return false;
        }
        List list = (List) other;
        int size = thisList.size();
        if (size != list.size()) {
            return false;
        }
        if (!(thisList instanceof RandomAccess) || !(list instanceof RandomAccess)) {
            return p7.s(thisList.iterator(), list.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!com.google.common.base.d0.a(thisList.get(i10), list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static int k(List<?> list) {
        Iterator<?> it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~((i10 * 31) + (next == null ? 0 : next.hashCode())));
        }
        return i10;
    }

    static int l(List<?> list, @fj.a Object element) {
        if (list instanceof RandomAccess) {
            return m(list, element);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (com.google.common.base.d0.a(element, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int m(List<?> list, @fj.a Object element) {
        int size = list.size();
        int i10 = 0;
        if (element == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
        } else {
            while (i10 < size) {
                if (element.equals(list.get(i10))) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    static int n(List<?> list, @fj.a Object element) {
        if (list instanceof RandomAccess) {
            return o(list, element);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (com.google.common.base.d0.a(element, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int o(List<?> list, @fj.a Object element) {
        if (element == null) {
            int size = list.size();
            do {
                size--;
                if (size >= 0) {
                }
            } while (list.get(size) != null);
            return size;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (element.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    static <E> ListIterator<E> p(List<E> list, int index) {
        return new c(list).listIterator(index);
    }

    @com.google.common.annotations.b(serializable = true)
    public static <E> ArrayList<E> q() {
        return new ArrayList<>();
    }

    @com.google.common.annotations.b(serializable = true)
    public static <E> ArrayList<E> r(Iterable<? extends E> elements) {
        com.google.common.base.j0.E(elements);
        return elements instanceof Collection ? new ArrayList<>((Collection) elements) : s(elements.iterator());
    }

    @com.google.common.annotations.b(serializable = true)
    public static <E> ArrayList<E> s(Iterator<? extends E> elements) {
        ArrayList<E> arrayListQ = q();
        p7.a(arrayListQ, elements);
        return arrayListQ;
    }

    @SafeVarargs
    @com.google.common.annotations.b(serializable = true)
    public static <E> ArrayList<E> t(E... elements) {
        com.google.common.base.j0.E(elements);
        ArrayList<E> arrayList = new ArrayList<>(i(elements.length));
        Collections.addAll(arrayList, elements);
        return arrayList;
    }

    @com.google.common.annotations.b(serializable = true)
    public static <E> ArrayList<E> u(int initialArraySize) {
        a3.b(initialArraySize, "initialArraySize");
        return new ArrayList<>(initialArraySize);
    }

    @com.google.common.annotations.b(serializable = true)
    public static <E> ArrayList<E> v(int estimatedSize) {
        return new ArrayList<>(i(estimatedSize));
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> CopyOnWriteArrayList<E> w() {
        return new CopyOnWriteArrayList<>();
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <E> CopyOnWriteArrayList<E> x(Iterable<? extends E> elements) {
        return new CopyOnWriteArrayList<>(elements instanceof Collection ? (Collection) elements : r(elements));
    }

    @com.google.common.annotations.b(serializable = true)
    public static <E> LinkedList<E> y() {
        return new LinkedList<>();
    }

    @com.google.common.annotations.b(serializable = true)
    public static <E> LinkedList<E> z(Iterable<? extends E> elements) {
        LinkedList<E> linkedListY = y();
        o7.a(linkedListY, elements);
        return linkedListY;
    }
}
