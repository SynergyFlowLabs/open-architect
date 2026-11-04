package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@a4
public final class q3<E> extends i<E> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f117975d = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient ConcurrentMap<E, AtomicInteger> f117976c;

    class a extends o5<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f117977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3 f117978b;

        a(final q3 this$0, final Set val$delegate) {
            this.f117977a = val$delegate;
            this.f117978b = this$0;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object object) {
            return object != null && b3.j(this.f117977a, object);
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return V0(collection);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.o5, com.google.common.collect.v4
        public Set<E> i1() {
            return this.f117977a;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object object) {
            return object != null && b3.k(this.f117977a, object);
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c10) {
            return Y0(c10);
        }
    }

    class b extends com.google.common.collect.c<q8.a<E>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Iterator<Map.Entry<E, AtomicInteger>> f117979c;

        b() {
            this.f117979c = q3.this.f117976c.entrySet().iterator();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c
        @fj.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public q8.a<E> b() {
            while (this.f117979c.hasNext()) {
                Map.Entry<E, AtomicInteger> next = this.f117979c.next();
                int i10 = next.getValue().get();
                if (i10 != 0) {
                    return r8.k(next.getKey(), i10);
                }
            }
            return c();
        }
    }

    class c extends c5<q8.a<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        private q8.a<E> f117981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f117982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q3 f117983c;

        c(final q3 this$0, final Iterator val$readOnlyIterator) {
            this.f117982b = val$readOnlyIterator;
            this.f117983c = this$0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c5, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0 */
        public Iterator<q8.a<E>> i1() {
            return this.f117982b;
        }

        @Override // com.google.common.collect.c5, java.util.Iterator
        /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
        public q8.a<E> next() {
            q8.a<E> aVar = (q8.a) super.next();
            this.f117981a = aVar;
            return aVar;
        }

        @Override // com.google.common.collect.c5, java.util.Iterator
        public void remove() {
            com.google.common.base.j0.h0(this.f117981a != null, "no calls to next() since the last call to remove()");
            this.f117983c.g1(this.f117981a.X0(), 0);
            this.f117981a = null;
        }
    }

    private class d extends i<E>.b {
        private d() {
            super();
        }

        private List<q8.a<E>> n() {
            ArrayList arrayListV = x7.v(size());
            p7.a(arrayListV, iterator());
            return arrayListV;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.i.b, com.google.common.collect.r8.i
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public q3<E> l() {
            return q3.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return n().toArray();
        }

        /* synthetic */ d(q3 q3Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) n().toArray(tArr);
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final x9.b<? super q3<?>> f117985a = x9.a(q3.class, "countMap");

        private e() {
        }
    }

    @com.google.common.annotations.e
    q3(ConcurrentMap<E, AtomicInteger> countMap) {
        com.google.common.base.j0.u(countMap.isEmpty(), "the backing map (%s) must be empty", countMap);
        this.f117976c = countMap;
    }

    public static <E> q3<E> p() {
        return new q3<>(new ConcurrentHashMap());
    }

    public static <E> q3<E> r(Iterable<? extends E> elements) {
        q3<E> q3VarP = p();
        o7.a(q3VarP, elements);
        return q3VarP;
    }

    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        Objects.requireNonNull(object);
        e.f117985a.b(this, (ConcurrentMap) object);
    }

    public static <E> q3<E> s(ConcurrentMap<E, AtomicInteger> countMap) {
        return new q3<>(countMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<E> u() {
        ArrayList arrayListV = x7.v(size());
        for (q8.a aVar : entrySet()) {
            Object objX0 = aVar.X0();
            for (int count = aVar.getCount(); count > 0; count--) {
                arrayListV.add(objX0);
            }
        }
        return arrayListV;
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.f117976c);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    public int H(E element, int occurrences) {
        AtomicInteger atomicIntegerPutIfAbsent;
        int i10;
        AtomicInteger atomicInteger;
        com.google.common.base.j0.E(element);
        if (occurrences == 0) {
            return P3(element);
        }
        a3.d(occurrences, "occurrences");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) b8.p0(this.f117976c, element);
            if (atomicIntegerPutIfAbsent == null && (atomicIntegerPutIfAbsent = this.f117976c.putIfAbsent(element, new AtomicInteger(occurrences))) == null) {
                return 0;
            }
            do {
                i10 = atomicIntegerPutIfAbsent.get();
                if (i10 == 0) {
                    atomicInteger = new AtomicInteger(occurrences);
                    if (this.f117976c.putIfAbsent(element, atomicInteger) == null) {
                        break;
                    }
                } else {
                    try {
                    } catch (ArithmeticException unused) {
                        throw new IllegalArgumentException("Overflow adding " + occurrences + " occurrences to a count of " + i10);
                    }
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i10, com.google.common.math.f.c(i10, occurrences)));
            return i10;
        } while (!this.f117976c.replace(element, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // com.google.common.collect.q8
    public int P3(@fj.a Object element) {
        AtomicInteger atomicInteger = (AtomicInteger) b8.p0(this.f117976c, element);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    public boolean Q2(E element, int expectedOldCount, int newCount) {
        com.google.common.base.j0.E(element);
        a3.b(expectedOldCount, "oldCount");
        a3.b(newCount, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) b8.p0(this.f117976c, element);
        if (atomicInteger == null) {
            if (expectedOldCount != 0) {
                return false;
            }
            return newCount == 0 || this.f117976c.putIfAbsent(element, new AtomicInteger(newCount)) == null;
        }
        int i10 = atomicInteger.get();
        if (i10 == expectedOldCount) {
            if (i10 == 0) {
                if (newCount == 0) {
                    this.f117976c.remove(element, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(newCount);
                return this.f117976c.putIfAbsent(element, atomicInteger2) == null || this.f117976c.replace(element, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i10, newCount)) {
                if (newCount == 0) {
                    this.f117976c.remove(element, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.i
    Set<E> c() {
        return new a(this, this.f117976c.keySet());
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f117976c.clear();
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    public /* bridge */ /* synthetic */ boolean contains(@fj.a Object element) {
        return super.contains(element);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    public int f0(@fj.a Object element, int occurrences) {
        int i10;
        int iMax;
        if (occurrences == 0) {
            return P3(element);
        }
        a3.d(occurrences, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) b8.p0(this.f117976c, element);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i10 = atomicInteger.get();
            if (i10 == 0) {
                return 0;
            }
            iMax = Math.max(0, i10 - occurrences);
        } while (!atomicInteger.compareAndSet(i10, iMax));
        if (iMax == 0) {
            this.f117976c.remove(element, atomicInteger);
        }
        return i10;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    public int g1(E element, int count) {
        AtomicInteger atomicIntegerPutIfAbsent;
        AtomicInteger atomicInteger;
        com.google.common.base.j0.E(element);
        a3.b(count, "count");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) b8.p0(this.f117976c, element);
            if (atomicIntegerPutIfAbsent != null || (count != 0 && (atomicIntegerPutIfAbsent = this.f117976c.putIfAbsent(element, new AtomicInteger(count))) != null)) {
                while (true) {
                    int i10 = atomicIntegerPutIfAbsent.get();
                    if (i10 == 0) {
                        break;
                    }
                    if (atomicIntegerPutIfAbsent.compareAndSet(i10, count)) {
                        if (count == 0) {
                            this.f117976c.remove(element, atomicIntegerPutIfAbsent);
                        }
                        return i10;
                    }
                }
                if (count != 0) {
                    atomicInteger = new AtomicInteger(count);
                    if (this.f117976c.putIfAbsent(element, atomicInteger) == null) {
                        break;
                    }
                } else {
                    return 0;
                }
            }
            return 0;
        } while (!this.f117976c.replace(element, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // com.google.common.collect.i
    @Deprecated
    public Set<q8.a<E>> i() {
        return new d(this, null);
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f117976c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.q8
    public Iterator<E> iterator() {
        return r8.n(this);
    }

    @Override // com.google.common.collect.i
    int k() {
        return this.f117976c.size();
    }

    @Override // com.google.common.collect.i
    Iterator<E> l() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.i
    Iterator<q8.a<E>> m() {
        return new c(this, new b());
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    public /* bridge */ /* synthetic */ Set o() {
        return super.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    public int size() {
        Iterator<AtomicInteger> it = this.f117976c.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += (long) it.next().get();
        }
        return com.google.common.primitives.l.A(j10);
    }

    @z7.a
    public boolean t(@fj.a Object element, int occurrences) {
        int i10;
        int i11;
        if (occurrences == 0) {
            return true;
        }
        a3.d(occurrences, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) b8.p0(this.f117976c, element);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i10 = atomicInteger.get();
            if (i10 < occurrences) {
                return false;
            }
            i11 = i10 - occurrences;
        } while (!atomicInteger.compareAndSet(i10, i11));
        if (i11 == 0) {
            this.f117976c.remove(element, atomicInteger);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return u().toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) u().toArray(tArr);
    }
}
