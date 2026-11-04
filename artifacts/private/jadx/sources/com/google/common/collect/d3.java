package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
class d3<E> extends AbstractSet<E> implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.google.common.annotations.e
    static final double f117286f = 0.001d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f117287g = 9;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.a
    private transient Object f117288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private transient int[] f117289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    transient Object[] f117290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient int f117291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f117292e;

    class a implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f117293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f117294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f117295c = -1;

        a() {
            this.f117293a = d3.this.f117291d;
            this.f117294b = d3.this.w();
        }

        private void b() {
            if (d3.this.f117291d != this.f117293a) {
                throw new ConcurrentModificationException();
            }
        }

        void c() {
            this.f117293a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f117294b < 0) {
                return false;
            }
            int i10 = 7 << 1;
            return true;
        }

        @Override // java.util.Iterator
        @b9
        public E next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f117294b;
            this.f117295c = i10;
            E e10 = (E) d3.this.u(i10);
            this.f117294b = d3.this.A(this.f117294b);
            return e10;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            a3.e(this.f117295c >= 0);
            c();
            d3 d3Var = d3.this;
            d3Var.remove(d3Var.u(this.f117295c));
            this.f117294b = d3.this.i(this.f117294b, this.f117295c);
            this.f117295c = -1;
        }
    }

    d3() {
        D(3);
    }

    private int B() {
        return (1 << (this.f117291d & 31)) - 1;
    }

    private Object[] L() {
        Object[] objArr = this.f117290c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] M() {
        int[] iArr = this.f117289b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object N() {
        Object obj = this.f117288a;
        Objects.requireNonNull(obj);
        return obj;
    }

    private void P(int newSize) {
        int iMin;
        int length = M().length;
        if (newSize > length && (iMin = Math.min(kotlinx.coroutines.internal.h0.f315057j, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            O(iMin);
        }
    }

    @z7.a
    private int Q(int oldMask, int newCapacity, int targetHash, int targetEntryIndex) {
        Object objA = e3.a(newCapacity);
        int i10 = newCapacity - 1;
        if (targetEntryIndex != 0) {
            e3.i(objA, targetHash & i10, targetEntryIndex + 1);
        }
        Object objN = N();
        int[] iArrM = M();
        for (int i11 = 0; i11 <= oldMask; i11++) {
            int iH = e3.h(objN, i11);
            while (iH != 0) {
                int i12 = iH - 1;
                int i13 = iArrM[i12];
                int iB = e3.b(i13, oldMask) | i11;
                int i14 = iB & i10;
                int iH2 = e3.h(objA, i14);
                e3.i(objA, i14, iH);
                iArrM[i12] = e3.d(iB, iH2, i10);
                iH = e3.c(i13, oldMask);
            }
        }
        this.f117288a = objA;
        T(i10);
        return i10;
    }

    private void R(int i10, E value) {
        L()[i10] = value;
    }

    private void S(int i10, int value) {
        M()[i10] = value;
    }

    private void T(int mask) {
        this.f117291d = e3.d(this.f117291d, 32 - Integer.numberOfLeadingZeros(mask), 31);
    }

    public static <E> d3<E> m() {
        return new d3<>();
    }

    public static <E> d3<E> n(Collection<? extends E> collection) {
        d3<E> d3VarS = s(collection.size());
        d3VarS.addAll(collection);
        return d3VarS;
    }

    @SafeVarargs
    public static <E> d3<E> p(E... elements) {
        d3<E> d3VarS = s(elements.length);
        Collections.addAll(d3VarS, elements);
        return d3VarS;
    }

    private Set<E> r(int tableSize) {
        return new LinkedHashSet(tableSize, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int i10 = stream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Invalid size: " + i10);
        }
        D(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            add(stream.readObject());
        }
    }

    public static <E> d3<E> s(int expectedSize) {
        return new d3<>(expectedSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E u(int i10) {
        return (E) L()[i10];
    }

    private int v(int i10) {
        return M()[i10];
    }

    @com.google.common.annotations.d
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
    }

    int A(int entryIndex) {
        int i10 = entryIndex + 1;
        if (i10 < this.f117292e) {
            return i10;
        }
        return -1;
    }

    void C() {
        this.f117291d += 32;
    }

    void D(int expectedSize) {
        com.google.common.base.j0.e(expectedSize >= 0, "Expected size must be >= 0");
        this.f117291d = com.google.common.primitives.l.h(expectedSize, 1, kotlinx.coroutines.internal.h0.f315057j);
    }

    void F(int entryIndex, @b9 E object, int hash, int mask) {
        S(entryIndex, e3.d(hash, 0, mask));
        R(entryIndex, object);
    }

    @com.google.common.annotations.e
    boolean G() {
        return t() != null;
    }

    void J(int dstIndex, int mask) {
        Object objN = N();
        int[] iArrM = M();
        Object[] objArrL = L();
        int size = size();
        int i10 = size - 1;
        if (dstIndex >= i10) {
            objArrL[dstIndex] = null;
            iArrM[dstIndex] = 0;
            return;
        }
        Object obj = objArrL[i10];
        objArrL[dstIndex] = obj;
        objArrL[i10] = null;
        iArrM[dstIndex] = iArrM[i10];
        iArrM[i10] = 0;
        int iD = c6.d(obj) & mask;
        int iH = e3.h(objN, iD);
        if (iH == size) {
            e3.i(objN, iD, dstIndex + 1);
            return;
        }
        while (true) {
            int i11 = iH - 1;
            int i12 = iArrM[i11];
            int iC = e3.c(i12, mask);
            if (iC == size) {
                iArrM[i11] = e3.d(i12, dstIndex + 1, mask);
                return;
            }
            iH = iC;
        }
    }

    boolean K() {
        return this.f117288a == null;
    }

    void O(int newCapacity) {
        this.f117289b = Arrays.copyOf(M(), newCapacity);
        this.f117290c = Arrays.copyOf(L(), newCapacity);
    }

    public void U() {
        if (K()) {
            return;
        }
        Set<E> setT = t();
        if (setT != null) {
            Set<E> setR = r(size());
            setR.addAll(setT);
            this.f117288a = setR;
            return;
        }
        int i10 = this.f117292e;
        if (i10 < M().length) {
            O(i10);
        }
        int iJ = e3.j(i10);
        int iB = B();
        if (iJ < iB) {
            Q(iB, iJ, 0, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @z7.a
    public boolean add(@b9 E object) {
        if (K()) {
            k();
        }
        Set<E> setT = t();
        if (setT != null) {
            return setT.add(object);
        }
        int[] iArrM = M();
        Object[] objArrL = L();
        int i10 = this.f117292e;
        int i11 = i10 + 1;
        int iD = c6.d(object);
        int iB = B();
        int i12 = iD & iB;
        int iH = e3.h(N(), i12);
        if (iH != 0) {
            int iB2 = e3.b(iD, iB);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrM[i14];
                if (e3.b(i15, iB) == iB2 && com.google.common.base.d0.a(object, objArrL[i14])) {
                    return false;
                }
                int iC = e3.c(i15, iB);
                i13++;
                if (iC != 0) {
                    iH = iC;
                } else {
                    if (i13 >= 9) {
                        return l().add(object);
                    }
                    if (i11 > iB) {
                        iB = Q(iB, e3.e(iB), iD, i10);
                    } else {
                        iArrM[i14] = e3.d(i15, i11, iB);
                    }
                }
            }
        } else if (i11 > iB) {
            iB = Q(iB, e3.e(iB), iD, i10);
        } else {
            e3.i(N(), i12, i11);
        }
        P(i11);
        F(i10, object, iD, iB);
        this.f117292e = i11;
        C();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (K()) {
            return;
        }
        C();
        Set<E> setT = t();
        if (setT != null) {
            this.f117291d = com.google.common.primitives.l.h(size(), 3, kotlinx.coroutines.internal.h0.f315057j);
            setT.clear();
            this.f117288a = null;
            this.f117292e = 0;
            return;
        }
        Arrays.fill(L(), 0, this.f117292e, (Object) null);
        e3.g(N());
        Arrays.fill(M(), 0, this.f117292e, 0);
        this.f117292e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object object) {
        if (K()) {
            return false;
        }
        Set<E> setT = t();
        if (setT != null) {
            return setT.contains(object);
        }
        int iD = c6.d(object);
        int iB = B();
        int iH = e3.h(N(), iD & iB);
        if (iH == 0) {
            return false;
        }
        int iB2 = e3.b(iD, iB);
        do {
            int i10 = iH - 1;
            int iV = v(i10);
            if (e3.b(iV, iB) == iB2 && com.google.common.base.d0.a(object, u(i10))) {
                return true;
            }
            iH = e3.c(iV, iB);
        } while (iH != 0);
        return false;
    }

    int i(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setT = t();
        return setT != null ? setT.iterator() : new a();
    }

    @z7.a
    int k() {
        com.google.common.base.j0.h0(K(), "Arrays already allocated");
        int i10 = this.f117291d;
        int iJ = e3.j(i10);
        this.f117288a = e3.a(iJ);
        T(iJ - 1);
        this.f117289b = new int[i10];
        this.f117290c = new Object[i10];
        return i10;
    }

    @z7.a
    Set<E> l() {
        Set<E> setR = r(B() + 1);
        int iW = w();
        while (iW >= 0) {
            setR.add(u(iW));
            iW = A(iW);
        }
        this.f117288a = setR;
        this.f117289b = null;
        this.f117290c = null;
        C();
        return setR;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @z7.a
    public boolean remove(@fj.a Object object) {
        if (K()) {
            return false;
        }
        Set<E> setT = t();
        if (setT != null) {
            return setT.remove(object);
        }
        int iB = B();
        int iF = e3.f(object, null, iB, N(), M(), L(), null);
        if (iF == -1) {
            return false;
        }
        J(iF, iB);
        this.f117292e--;
        C();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setT = t();
        return setT != null ? setT.size() : this.f117292e;
    }

    @com.google.common.annotations.e
    @fj.a
    Set<E> t() {
        Object obj = this.f117288a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (K()) {
            return new Object[0];
        }
        Set<E> setT = t();
        return setT != null ? setT.toArray() : Arrays.copyOf(L(), this.f117292e);
    }

    int w() {
        return isEmpty() ? -1 : 0;
    }

    d3(int expectedSize) {
        D(expectedSize);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @z7.a
    public <T> T[] toArray(T[] tArr) {
        if (K()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setT = t();
        if (setT != null) {
            return (T[]) setT.toArray(tArr);
        }
        return (T[]) x8.n(L(), 0, this.f117292e, tArr);
    }
}
