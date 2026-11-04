package org.apache.commons.collections4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection f335887a = Collections.EMPTY_LIST;

    static class a implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f335888a;

        a(m mVar) {
            this.f335888a = mVar;
        }

        @Override // org.apache.commons.collections4.w0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e<?> a(Object obj) {
            return new e<>(this.f335888a, obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class b<E> implements w0<E, e<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f335889a;

        b(m mVar) {
            this.f335889a = mVar;
        }

        @Override // org.apache.commons.collections4.w0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e<E> a(E e10) {
            return new e<>(this.f335889a, e10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    static class c<E> implements w0<E, e<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f335890a;

        c(m mVar) {
            this.f335890a = mVar;
        }

        @Override // org.apache.commons.collections4.w0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e<E> a(E e10) {
            return new e<>(this.f335890a, e10);
        }
    }

    private static class d<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<O, Integer> f335891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<O, Integer> f335892b;

        public d(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
            this.f335891a = j.J(iterable);
            this.f335892b = j.J(iterable2);
        }

        private int i(Object obj, Map<?, Integer> map) {
            Integer num = map.get(obj);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        public int c(Object obj) {
            return i(obj, this.f335891a);
        }

        public int d(Object obj) {
            return i(obj, this.f335892b);
        }

        public final int k(Object obj) {
            return Math.max(c(obj), d(obj));
        }

        public final int l(Object obj) {
            return Math.min(c(obj), d(obj));
        }
    }

    private static class e<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m<? super O> f335893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final O f335894b;

        public e(m<? super O> mVar, O o10) {
            this.f335893a = mVar;
            this.f335894b = o10;
        }

        public O a() {
            return this.f335894b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.f335893a.b(this.f335894b, (Object) ((e) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return this.f335893a.a(this.f335894b);
        }
    }

    private static class f<O> extends d<O> implements Iterable<O> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<O> f335895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<O> f335896d;

        public f(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
            super(iterable, iterable2);
            HashSet hashSet = new HashSet();
            this.f335895c = hashSet;
            j.a(hashSet, iterable);
            j.a(hashSet, iterable2);
            this.f335896d = new ArrayList(hashSet.size());
        }

        @Override // java.lang.Iterable
        public Iterator<O> iterator() {
            return this.f335895c.iterator();
        }

        public Collection<O> m() {
            return this.f335896d;
        }

        public void n(O o10, int i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                this.f335896d.add(o10);
            }
        }
    }

    private j() {
    }

    @Deprecated
    public static <T> T A(Iterable<T> iterable, l0<? super T> l0Var) {
        if (l0Var != null) {
            return (T) v.r(iterable, l0Var);
        }
        return null;
    }

    @Deprecated
    public static <T, C extends h<? super T>> T B(Iterable<T> iterable, C c10) {
        if (c10 != null) {
            return (T) v.u(iterable, c10);
        }
        return null;
    }

    @Deprecated
    public static <T, C extends h<? super T>> T C(Iterator<T> it, C c10) {
        if (c10 != null) {
            return (T) w.K(it, c10);
        }
        return null;
    }

    @Deprecated
    public static <T, C extends h<? super T>> C D(Iterable<T> iterable, C c10) {
        if (c10 != null) {
            v.t(iterable, c10);
        }
        return c10;
    }

    @Deprecated
    public static <T, C extends h<? super T>> C E(Iterator<T> it, C c10) {
        if (c10 != null) {
            w.J(it, c10);
        }
        return c10;
    }

    @Deprecated
    public static <T> T F(Iterable<T> iterable, int i10) {
        return (T) v.w(iterable, i10);
    }

    public static Object G(Object obj, int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative: " + i10);
        }
        if (obj instanceof Map) {
            return w.L(((Map) obj).entrySet().iterator(), i10);
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj)[i10];
        }
        if (obj instanceof Iterator) {
            return w.L((Iterator) obj, i10);
        }
        if (obj instanceof Iterable) {
            return v.w((Iterable) obj, i10);
        }
        if (obj instanceof Enumeration) {
            return l.a((Enumeration) obj, i10);
        }
        if (obj == null) {
            throw new IllegalArgumentException("Unsupported object type: null");
        }
        try {
            return Array.get(obj, i10);
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
        }
    }

    @Deprecated
    public static <T> T H(Iterator<T> it, int i10) {
        return (T) w.L(it, i10);
    }

    public static <K, V> Map.Entry<K, V> I(Map<K, V> map, int i10) {
        g(i10);
        return (Map.Entry) F(map.entrySet(), i10);
    }

    public static <O> Map<O, Integer> J(Iterable<? extends O> iterable) {
        HashMap map = new HashMap();
        for (O o10 : iterable) {
            Integer num = (Integer) map.get(o10);
            if (num == null) {
                map.put(o10, 1);
            } else {
                map.put(o10, Integer.valueOf(num.intValue() + 1));
            }
        }
        return map;
    }

    public static <O> Collection<O> K(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
        f fVar = new f(iterable, iterable2);
        for (O o10 : fVar) {
            fVar.n(o10, fVar.l(o10));
        }
        return fVar.m();
    }

    public static boolean L(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean M(Collection<?> collection, Collection<?> collection2) {
        if (collection.size() != collection2.size()) {
            return false;
        }
        d dVar = new d(collection, collection2);
        if (dVar.f335891a.size() != dVar.f335892b.size()) {
            return false;
        }
        for (Object obj : dVar.f335891a.keySet()) {
            if (dVar.c(obj) != dVar.d(obj)) {
                return false;
            }
        }
        return true;
    }

    public static <E> boolean N(Collection<? extends E> collection, Collection<? extends E> collection2, m<? super E> mVar) {
        if (mVar == null) {
            throw new NullPointerException("Equator must not be null.");
        }
        if (collection.size() != collection2.size()) {
            return false;
        }
        a aVar = new a(mVar);
        return M(l(collection, aVar), l(collection2, aVar));
    }

    public static boolean O(Collection<? extends Object> collection) {
        if (collection == null) {
            throw new NullPointerException("The collection must not be null");
        }
        if (collection instanceof org.apache.commons.collections4.f) {
            return ((org.apache.commons.collections4.f) collection).isFull();
        }
        try {
            return org.apache.commons.collections4.collection.g.k(collection).isFull();
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean P(Collection<?> collection) {
        return !L(collection);
    }

    public static boolean Q(Collection<?> collection, Collection<?> collection2) {
        return collection.size() < collection2.size() && R(collection, collection2);
    }

    public static boolean R(Collection<?> collection, Collection<?> collection2) {
        d dVar = new d(collection, collection2);
        for (Object obj : collection) {
            if (dVar.c(obj) > dVar.d(obj)) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public static <C> boolean S(Iterable<C> iterable, l0<? super C> l0Var) {
        return l0Var != null && v.A(iterable, l0Var);
    }

    public static int T(Collection<? extends Object> collection) {
        if (collection == null) {
            throw new NullPointerException("The collection must not be null");
        }
        if (collection instanceof org.apache.commons.collections4.f) {
            return ((org.apache.commons.collections4.f) collection).o0();
        }
        try {
            return org.apache.commons.collections4.collection.g.k(collection).o0();
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    public static <E> Collection<List<E>> U(Collection<E> collection) {
        org.apache.commons.collections4.iterators.g0 g0Var = new org.apache.commons.collections4.iterators.g0(collection);
        ArrayList arrayList = new ArrayList();
        while (g0Var.hasNext()) {
            arrayList.add(g0Var.next());
        }
        return arrayList;
    }

    public static <C> Collection<C> V(Collection<C> collection, l0<? super C> l0Var) {
        return org.apache.commons.collections4.collection.d.l(collection, l0Var);
    }

    public static <E> Collection<E> W(Iterable<E> iterable, Iterable<? extends E> iterable2, m<? super E> mVar) {
        Set set = (Set) m(iterable2, new c(mVar), new HashSet());
        ArrayList arrayList = new ArrayList();
        for (E e10 : iterable) {
            if (!set.contains(new e(mVar, e10))) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    public static <E> Collection<E> X(Collection<E> collection, Collection<?> collection2) {
        return y.n(collection, collection2);
    }

    public static <E> Collection<E> Y(Iterable<E> iterable, Iterable<? extends E> iterable2, m<? super E> mVar) {
        Set set = (Set) m(iterable2, new b(mVar), new HashSet());
        ArrayList arrayList = new ArrayList();
        for (E e10 : iterable) {
            if (set.contains(new e(mVar, e10))) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    public static <C> Collection<C> Z(Collection<C> collection, Collection<?> collection2) {
        return y.o(collection, collection2);
    }

    public static <C> boolean a(Collection<C> collection, Iterable<? extends C> iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : c(collection, iterable.iterator());
    }

    public static void a0(Object[] objArr) {
        int length = objArr.length - 1;
        for (int i10 = 0; length > i10; i10++) {
            Object obj = objArr[length];
            objArr[length] = objArr[i10];
            objArr[i10] = obj;
            length--;
        }
    }

    public static <C> boolean b(Collection<C> collection, Enumeration<? extends C> enumeration) {
        boolean zAdd = false;
        while (enumeration.hasMoreElements()) {
            zAdd |= collection.add(enumeration.nextElement());
        }
        return zAdd;
    }

    public static <O> Collection<O> b0(Iterable<? extends O> iterable, l0<? super O> l0Var) {
        return c0(iterable, l0Var, iterable instanceof Collection ? new ArrayList(((Collection) iterable).size()) : new ArrayList());
    }

    public static <C> boolean c(Collection<C> collection, Iterator<? extends C> it) {
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static <O, R extends Collection<? super O>> R c0(Iterable<? extends O> iterable, l0<? super O> l0Var, R r10) {
        if (iterable != null && l0Var != null) {
            for (O o10 : iterable) {
                if (l0Var.a(o10)) {
                    r10.add(o10);
                }
            }
        }
        return r10;
    }

    public static <C> boolean d(Collection<C> collection, C... cArr) {
        boolean zAdd = false;
        for (C c10 : cArr) {
            zAdd |= collection.add(c10);
        }
        return zAdd;
    }

    public static <O, R extends Collection<? super O>> R d0(Iterable<? extends O> iterable, l0<? super O> l0Var, R r10, R r11) {
        if (iterable != null && l0Var != null) {
            for (O o10 : iterable) {
                if (l0Var.a(o10)) {
                    r10.add(o10);
                } else {
                    r11.add(o10);
                }
            }
        }
        return r10;
    }

    public static <T> boolean e(Collection<T> collection, T t10) {
        if (collection != null) {
            return t10 != null && collection.add(t10);
        }
        throw new NullPointerException("The collection must not be null");
    }

    public static <O> Collection<O> e0(Iterable<? extends O> iterable, l0<? super O> l0Var) {
        return f0(iterable, l0Var, iterable instanceof Collection ? new ArrayList(((Collection) iterable).size()) : new ArrayList());
    }

    @Deprecated
    public static <O> int f(O o10, Iterable<? super O> iterable) {
        if (iterable != null) {
            return v.v(iterable, o10);
        }
        throw new NullPointerException("coll must not be null.");
    }

    public static <O, R extends Collection<? super O>> R f0(Iterable<? extends O> iterable, l0<? super O> l0Var, R r10) {
        if (iterable != null && l0Var != null) {
            for (O o10 : iterable) {
                if (!l0Var.a(o10)) {
                    r10.add(o10);
                }
            }
        }
        return r10;
    }

    static void g(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("Index cannot be negative: " + i10);
    }

    public static int g0(Object obj) {
        int i10 = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        if (obj instanceof Iterable) {
            return v.G((Iterable) obj);
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj).length;
        }
        if (obj instanceof Iterator) {
            return w.a0((Iterator) obj);
        }
        if (obj instanceof Enumeration) {
            Enumeration enumeration = (Enumeration) obj;
            while (enumeration.hasMoreElements()) {
                i10++;
                enumeration.nextElement();
            }
            return i10;
        }
        try {
            return Array.getLength(obj);
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
        }
    }

    public static <O extends Comparable<? super O>> List<O> h(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
        return j(iterable, iterable2, k.f(), true);
    }

    public static boolean h0(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Iterable) {
            return v.y((Iterable) obj);
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj).length == 0;
        }
        if (obj instanceof Iterator) {
            return !((Iterator) obj).hasNext();
        }
        if (obj instanceof Enumeration) {
            return !((Enumeration) obj).hasMoreElements();
        }
        try {
            return Array.getLength(obj) == 0;
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
        }
    }

    public static <O> List<O> i(Iterable<? extends O> iterable, Iterable<? extends O> iterable2, Comparator<? super O> comparator) {
        return j(iterable, iterable2, comparator, true);
    }

    public static <O> Collection<O> i0(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
        return j0(iterable, iterable2, org.apache.commons.collections4.functors.y0.c());
    }

    public static <O> List<O> j(Iterable<? extends O> iterable, Iterable<? extends O> iterable2, Comparator<? super O> comparator, boolean z10) {
        if (iterable == null || iterable2 == null) {
            throw new NullPointerException("The collections must not be null");
        }
        if (comparator == null) {
            throw new NullPointerException("The comparator must not be null");
        }
        int iMax = ((iterable instanceof Collection) && (iterable2 instanceof Collection)) ? Math.max(1, ((Collection) iterable).size() + ((Collection) iterable2).size()) : 10;
        org.apache.commons.collections4.iterators.k kVar = new org.apache.commons.collections4.iterators.k(comparator, iterable.iterator(), iterable2.iterator());
        if (z10) {
            return w.f0(kVar, iMax);
        }
        ArrayList arrayList = new ArrayList(iMax);
        Object obj = null;
        while (kVar.hasNext()) {
            Object next = kVar.next();
            if (obj == null || !obj.equals(next)) {
                arrayList.add(next);
            }
            obj = next;
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static <O> Collection<O> j0(Iterable<? extends O> iterable, Iterable<? extends O> iterable2, l0<O> l0Var) {
        ArrayList arrayList = new ArrayList();
        org.apache.commons.collections4.bag.f fVar = new org.apache.commons.collections4.bag.f();
        for (O o10 : iterable2) {
            if (l0Var.a(o10)) {
                fVar.add(o10);
            }
        }
        for (O o11 : iterable) {
            if (!fVar.f0(o11, 1)) {
                arrayList.add(o11);
            }
        }
        return arrayList;
    }

    public static <O extends Comparable<? super O>> List<O> k(Iterable<? extends O> iterable, Iterable<? extends O> iterable2, boolean z10) {
        return j(iterable, iterable2, k.f(), z10);
    }

    @Deprecated
    public static <C> Collection<C> k0(Collection<C> collection) {
        return org.apache.commons.collections4.collection.e.d(collection);
    }

    public static <I, O> Collection<O> l(Iterable<I> iterable, w0<? super I, ? extends O> w0Var) {
        return m(iterable, w0Var, iterable instanceof Collection ? new ArrayList(((Collection) iterable).size()) : new ArrayList());
    }

    public static <C> void l0(Collection<C> collection, w0<? super C, ? extends C> w0Var) {
        if (collection != null && w0Var != null) {
            if (collection instanceof List) {
                ListIterator listIterator = ((List) collection).listIterator();
                while (listIterator.hasNext()) {
                    listIterator.set(w0Var.a((Object) listIterator.next()));
                }
            } else {
                Collection<? extends C> collectionL = l(collection, w0Var);
                collection.clear();
                collection.addAll(collectionL);
            }
        }
    }

    public static <I, O, R extends Collection<? super O>> R m(Iterable<? extends I> iterable, w0<? super I, ? extends O> w0Var, R r10) {
        return iterable != null ? (R) o(iterable.iterator(), w0Var, r10) : r10;
    }

    public static <E> Collection<E> m0(Collection<E> collection, w0<? super E, ? extends E> w0Var) {
        return org.apache.commons.collections4.collection.f.m(collection, w0Var);
    }

    public static <I, O> Collection<O> n(Iterator<I> it, w0<? super I, ? extends O> w0Var) {
        return o(it, w0Var, new ArrayList());
    }

    public static <O> Collection<O> n0(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
        f fVar = new f(iterable, iterable2);
        for (O o10 : fVar) {
            fVar.n(o10, fVar.k(o10));
        }
        return fVar.m();
    }

    public static <I, O, R extends Collection<? super O>> R o(Iterator<? extends I> it, w0<? super I, ? extends O> w0Var, R r10) {
        if (it != null && w0Var != null) {
            while (it.hasNext()) {
                r10.add(w0Var.a(it.next()));
            }
        }
        return r10;
    }

    @Deprecated
    public static <C> Collection<C> o0(Collection<? extends C> collection) {
        return org.apache.commons.collections4.collection.h.i(collection);
    }

    public static boolean p(Collection<?> collection, Collection<?> collection2) {
        if (collection2.isEmpty()) {
            return true;
        }
        HashSet hashSet = new HashSet();
        for (Object obj : collection2) {
            if (!hashSet.contains(obj)) {
                for (Object obj2 : collection) {
                    hashSet.add(obj2);
                    if (obj == null) {
                        if (obj2 == null) {
                        }
                    } else if (obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean q(Collection<?> collection, Collection<?> collection2) {
        if (collection.size() < collection2.size()) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (collection2.contains(it.next())) {
                    return true;
                }
            }
            return false;
        }
        Iterator<?> it2 = collection2.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean r(Collection<?> collection, T... tArr) {
        if (collection.size() < tArr.length) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (org.apache.commons.collections4.b.a(tArr, it.next())) {
                    return true;
                }
            }
        } else {
            for (T t10 : tArr) {
                if (collection.contains(t10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public static <C> int s(Iterable<C> iterable, l0<? super C> l0Var) {
        if (l0Var == null) {
            return 0;
        }
        return (int) v.m(iterable, l0Var);
    }

    public static <O> Collection<O> t(Iterable<? extends O> iterable, Iterable<? extends O> iterable2) {
        f fVar = new f(iterable, iterable2);
        for (O o10 : fVar) {
            fVar.n(o10, fVar.k(o10) - fVar.l(o10));
        }
        return fVar.m();
    }

    public static <T> Collection<T> u() {
        return f335887a;
    }

    public static <T> Collection<T> v(Collection<T> collection) {
        if (collection == null) {
            collection = u();
        }
        return collection;
    }

    @Deprecated
    public static <C> boolean w(Iterable<C> iterable, l0<? super C> l0Var) {
        return l0Var != null && v.B(iterable, l0Var);
    }

    public static <E> E x(Collection<E> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        if (collection.size() == 1) {
            return collection.iterator().next();
        }
        throw new IllegalArgumentException("Can extract singleton only when collection size == 1");
    }

    public static <T> boolean y(Iterable<T> iterable, l0<? super T> l0Var) {
        boolean z10 = false;
        if (iterable != null && l0Var != null) {
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                if (!l0Var.a(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public static <T> boolean z(Iterable<T> iterable, l0<? super T> l0Var) {
        return y(iterable, l0Var == null ? null : m0.s(l0Var));
    }
}
