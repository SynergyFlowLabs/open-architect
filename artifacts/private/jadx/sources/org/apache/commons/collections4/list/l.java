package org.apache.commons.collections4.list;

import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.collections4.i0;

/* JADX INFO: loaded from: classes14.dex */
public class l<E> extends AbstractList<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b<E> f335951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f335952b;

    static class c<E> implements ListIterator<E>, i0<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l<E> f335960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b<E> f335961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f335962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b<E> f335963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f335964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f335965f;

        protected c(l<E> lVar, int i10) throws IndexOutOfBoundsException {
            this.f335960a = lVar;
            this.f335965f = ((AbstractList) lVar).modCount;
            this.f335961b = ((l) lVar).f335951a == null ? null : ((l) lVar).f335951a.f(i10);
            this.f335962c = i10;
            this.f335964e = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            b();
            this.f335960a.add(this.f335962c, e10);
            this.f335963d = null;
            this.f335964e = -1;
            this.f335962c++;
            this.f335965f++;
        }

        protected void b() {
            if (((AbstractList) this.f335960a).modCount != this.f335965f) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f335962c < this.f335960a.size();
        }

        @Override // java.util.ListIterator, org.apache.commons.collections4.i0
        public boolean hasPrevious() {
            return this.f335962c > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException("No element at index " + this.f335962c + ".");
            }
            if (this.f335961b == null) {
                this.f335961b = ((l) this.f335960a).f335951a.f(this.f335962c);
            }
            E eK = this.f335961b.k();
            b<E> bVar = this.f335961b;
            this.f335963d = bVar;
            int i10 = this.f335962c;
            this.f335962c = i10 + 1;
            this.f335964e = i10;
            this.f335961b = bVar.s();
            return eK;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f335962c;
        }

        @Override // java.util.ListIterator, org.apache.commons.collections4.i0
        public E previous() {
            b();
            if (!hasPrevious()) {
                throw new NoSuchElementException("Already at start of list.");
            }
            b<E> bVar = this.f335961b;
            if (bVar == null) {
                this.f335961b = ((l) this.f335960a).f335951a.f(this.f335962c - 1);
            } else {
                this.f335961b = bVar.t();
            }
            E eK = this.f335961b.k();
            this.f335963d = this.f335961b;
            int i10 = this.f335962c - 1;
            this.f335962c = i10;
            this.f335964e = i10;
            return eK;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return nextIndex() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i10 = this.f335964e;
            if (i10 == -1) {
                throw new IllegalStateException();
            }
            this.f335960a.remove(i10);
            int i11 = this.f335962c;
            if (i11 != this.f335964e) {
                this.f335962c = i11 - 1;
            }
            this.f335961b = null;
            this.f335963d = null;
            this.f335964e = -1;
            this.f335965f++;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            b();
            b<E> bVar = this.f335963d;
            if (bVar == null) {
                throw new IllegalStateException();
            }
            bVar.E(e10);
        }
    }

    public l() {
    }

    private void k(int i10, int i11, int i12) {
        if (i10 < i11 || i10 > i12) {
            throw new IndexOutOfBoundsException("Invalid index:" + i10 + ", size=" + size());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        ((AbstractList) this).modCount++;
        k(i10, 0, size());
        b<E> bVar = this.f335951a;
        if (bVar == null) {
            this.f335951a = new b<>(i10, e10, null, null);
        } else {
            this.f335951a = bVar.n(i10, e10);
        }
        this.f335952b++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount += collection.size();
        b<E> bVar = new b<>(collection);
        b<E> bVar2 = this.f335951a;
        if (bVar2 != null) {
            bVar = bVar2.d(bVar, this.f335952b);
        }
        this.f335951a = bVar;
        this.f335952b += collection.size();
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ((AbstractList) this).modCount++;
        this.f335951a = null;
        this.f335952b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        k(i10, 0, size() - 1);
        return this.f335951a.f(i10).k();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        b<E> bVar = this.f335951a;
        if (bVar == null) {
            return -1;
        }
        return bVar.m(obj, ((b) bVar).f335958f);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        ((AbstractList) this).modCount++;
        k(i10, 0, size() - 1);
        E e10 = get(i10);
        this.f335951a = this.f335951a.v(i10);
        this.f335952b--;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        k(i10, 0, size() - 1);
        b<E> bVarF = this.f335951a.f(i10);
        E e11 = (E) ((b) bVarF).f335959g;
        bVarF.E(e10);
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f335952b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        b<E> bVar = this.f335951a;
        if (bVar != null) {
            bVar.F(objArr, ((b) bVar).f335958f);
        }
        return objArr;
    }

    static class b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b<E> f335953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f335954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b<E> f335955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f335956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f335957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f335958f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private E f335959g;

        private b<E> A() {
            b<E> bVar = this.f335953a;
            b<E> bVarJ = h().j();
            int i10 = this.f335958f + i(bVar);
            int i11 = -bVar.f335958f;
            int i12 = i(bVar) + i(bVarJ);
            B(bVarJ, bVar);
            bVar.D(this, null);
            C(bVar, i10);
            C(this, i11);
            C(bVarJ, i12);
            return bVar;
        }

        private void B(b<E> bVar, b<E> bVar2) {
            boolean z10 = bVar == null;
            this.f335954b = z10;
            if (z10) {
                bVar = bVar2;
            }
            this.f335953a = bVar;
            u();
        }

        private int C(b<E> bVar, int i10) {
            if (bVar == null) {
                return 0;
            }
            int i11 = i(bVar);
            bVar.f335958f = i10;
            return i11;
        }

        private void D(b<E> bVar, b<E> bVar2) {
            boolean z10 = bVar == null;
            this.f335956d = z10;
            if (z10) {
                bVar = bVar2;
            }
            this.f335955c = bVar;
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b<E> d(b<E> bVar, int i10) {
            b<E> bVarQ = q();
            b<E> bVarR = bVar.r();
            if (bVar.f335957e > this.f335957e) {
                b<E> bVarW = w();
                ArrayDeque arrayDeque = new ArrayDeque();
                int i11 = 0;
                i11 = bVar.f335958f + i10;
                b<E> bVar2 = bVar;
                while (bVar2 != null && bVar2.f335957e > g(bVarW)) {
                    arrayDeque.push(bVar2);
                    bVar2 = bVar2.f335953a;
                    if (bVar2 != null) {
                        i11 = bVar2.f335958f + i11;
                    }
                }
                bVarQ.B(bVarW, null);
                bVarQ.D(bVar2, bVarR);
                if (bVarW != null) {
                    bVarW.q().D(null, bVarQ);
                    bVarW.f335958f -= i10 - 1;
                }
                if (bVar2 != null) {
                    bVar2.r().B(null, bVarQ);
                    bVar2.f335958f = (i11 - i10) + 1;
                }
                bVarQ.f335958f = (i10 - 1) - i11;
                bVar.f335958f += i10;
                while (!arrayDeque.isEmpty()) {
                    b bVar3 = (b) arrayDeque.pop();
                    bVar3.B(bVarQ, null);
                    bVarQ = bVar3.e();
                }
                return bVarQ;
            }
            b<E> bVarX = bVar.x();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int i12 = this.f335958f;
            int i13 = 0;
            b<E> bVar4 = this;
            while (bVar4 != null && bVar4.f335957e > g(bVarX)) {
                arrayDeque2.push(bVar4);
                bVar4 = bVar4.f335955c;
                if (bVar4 != null) {
                    int i14 = i12;
                    i12 = bVar4.f335958f + i12;
                    i13 = i14;
                } else {
                    i13 = i12;
                }
            }
            bVarR.D(bVarX, null);
            bVarR.B(bVar4, bVarQ);
            if (bVarX != null) {
                bVarX.r().B(null, bVarR);
                bVarX.f335958f++;
            }
            if (bVar4 != null) {
                bVar4.q().D(null, bVarR);
                bVar4.f335958f = i12 - i10;
            }
            bVarR.f335958f = i10 - i13;
            while (!arrayDeque2.isEmpty()) {
                b bVar5 = (b) arrayDeque2.pop();
                bVar5.D(bVarR, null);
                bVarR = bVar5.e();
            }
            return bVarR;
        }

        private b<E> e() {
            int iL = l();
            if (iL == -2) {
                if (this.f335953a.l() > 0) {
                    B(this.f335953a.z(), null);
                }
                return A();
            }
            if (iL == -1 || iL == 0 || iL == 1) {
                return this;
            }
            if (iL != 2) {
                throw new RuntimeException("tree inconsistent!");
            }
            if (this.f335955c.l() < 0) {
                D(this.f335955c.A(), null);
            }
            return z();
        }

        private int g(b<E> bVar) {
            if (bVar == null) {
                return -1;
            }
            return bVar.f335957e;
        }

        private b<E> h() {
            if (this.f335954b) {
                return null;
            }
            return this.f335953a;
        }

        private int i(b<E> bVar) {
            if (bVar == null) {
                return 0;
            }
            return bVar.f335958f;
        }

        private b<E> j() {
            if (this.f335956d) {
                return null;
            }
            return this.f335955c;
        }

        private int l() {
            return g(j()) - g(h());
        }

        private b<E> o(int i10, E e10) {
            if (h() == null) {
                B(new b<>(-1, e10, this, this.f335953a), null);
            } else {
                B(this.f335953a.n(i10, e10), null);
            }
            int i11 = this.f335958f;
            if (i11 >= 0) {
                this.f335958f = i11 + 1;
            }
            b<E> bVarE = e();
            u();
            return bVarE;
        }

        private b<E> p(int i10, E e10) {
            if (j() == null) {
                D(new b<>(1, e10, this.f335955c, this), null);
            } else {
                D(this.f335955c.n(i10, e10), null);
            }
            int i11 = this.f335958f;
            if (i11 < 0) {
                this.f335958f = i11 - 1;
            }
            b<E> bVarE = e();
            u();
            return bVarE;
        }

        private b<E> q() {
            return j() == null ? this : this.f335955c.q();
        }

        private b<E> r() {
            return h() == null ? this : this.f335953a.r();
        }

        private void u() {
            this.f335957e = Math.max(h() == null ? -1 : h().f335957e, j() != null ? j().f335957e : -1) + 1;
        }

        private b<E> w() {
            if (j() == null) {
                return y();
            }
            D(this.f335955c.w(), this.f335955c.f335955c);
            int i10 = this.f335958f;
            if (i10 < 0) {
                this.f335958f = i10 + 1;
            }
            u();
            return e();
        }

        private b<E> x() {
            if (h() == null) {
                return y();
            }
            B(this.f335953a.x(), this.f335953a.f335953a);
            int i10 = this.f335958f;
            if (i10 > 0) {
                this.f335958f = i10 - 1;
            }
            u();
            return e();
        }

        private b<E> y() {
            if (j() == null && h() == null) {
                return null;
            }
            if (j() == null) {
                int i10 = this.f335958f;
                if (i10 > 0) {
                    this.f335953a.f335958f += i10;
                }
                this.f335953a.q().D(null, this.f335955c);
                return this.f335953a;
            }
            if (h() == null) {
                b<E> bVar = this.f335955c;
                int i11 = bVar.f335958f;
                int i12 = this.f335958f;
                bVar.f335958f = i11 + (i12 - (i12 < 0 ? 0 : 1));
                bVar.r().B(null, this.f335953a);
                return this.f335955c;
            }
            if (l() > 0) {
                b<E> bVarR = this.f335955c.r();
                this.f335959g = bVarR.f335959g;
                if (this.f335954b) {
                    this.f335953a = bVarR.f335953a;
                }
                this.f335955c = this.f335955c.x();
                int i13 = this.f335958f;
                if (i13 < 0) {
                    this.f335958f = i13 + 1;
                }
            } else {
                b<E> bVarQ = this.f335953a.q();
                this.f335959g = bVarQ.f335959g;
                if (this.f335956d) {
                    this.f335955c = bVarQ.f335955c;
                }
                b<E> bVar2 = this.f335953a;
                b<E> bVar3 = bVar2.f335953a;
                b<E> bVarW = bVar2.w();
                this.f335953a = bVarW;
                if (bVarW == null) {
                    this.f335953a = bVar3;
                    this.f335954b = true;
                }
                int i14 = this.f335958f;
                if (i14 > 0) {
                    this.f335958f = i14 - 1;
                }
            }
            u();
            return this;
        }

        private b<E> z() {
            b<E> bVar = this.f335955c;
            b<E> bVarH = j().h();
            int i10 = this.f335958f + i(bVar);
            int i11 = -bVar.f335958f;
            int i12 = i(bVar) + i(bVarH);
            D(bVarH, bVar);
            int i13 = 3 ^ 0;
            bVar.B(this, null);
            C(bVar, i10);
            C(this, i11);
            C(bVarH, i12);
            return bVar;
        }

        void E(E e10) {
            this.f335959g = e10;
        }

        void F(Object[] objArr, int i10) {
            objArr[i10] = this.f335959g;
            if (h() != null) {
                b<E> bVar = this.f335953a;
                bVar.F(objArr, bVar.f335958f + i10);
            }
            if (j() != null) {
                b<E> bVar2 = this.f335955c;
                bVar2.F(objArr, i10 + bVar2.f335958f);
            }
        }

        b<E> f(int i10) {
            int i11 = i10 - this.f335958f;
            if (i11 == 0) {
                return this;
            }
            b<E> bVarH = i11 < 0 ? h() : j();
            if (bVarH == null) {
                return null;
            }
            return bVarH.f(i11);
        }

        E k() {
            return this.f335959g;
        }

        int m(Object obj, int i10) {
            if (h() != null) {
                b<E> bVar = this.f335953a;
                int iM = bVar.m(obj, bVar.f335958f + i10);
                if (iM != -1) {
                    return iM;
                }
            }
            E e10 = this.f335959g;
            if (e10 != null ? e10.equals(obj) : e10 == obj) {
                return i10;
            }
            if (j() == null) {
                return -1;
            }
            b<E> bVar2 = this.f335955c;
            return bVar2.m(obj, i10 + bVar2.f335958f);
        }

        b<E> n(int i10, E e10) {
            int i11 = i10 - this.f335958f;
            return i11 <= 0 ? o(i11, e10) : p(i11, e10);
        }

        b<E> s() {
            b<E> bVar;
            return (this.f335956d || (bVar = this.f335955c) == null) ? this.f335955c : bVar.r();
        }

        b<E> t() {
            b<E> bVar;
            return (this.f335954b || (bVar = this.f335953a) == null) ? this.f335953a : bVar.q();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AVLNode(");
            sb2.append(this.f335958f);
            sb2.append(AbstractJsonLexerKt.COMMA);
            int i10 = 5 ^ 0;
            sb2.append(this.f335953a != null);
            sb2.append(AbstractJsonLexerKt.COMMA);
            sb2.append(this.f335959g);
            sb2.append(AbstractJsonLexerKt.COMMA);
            sb2.append(j() != null);
            sb2.append(", faedelung ");
            sb2.append(this.f335956d);
            sb2.append(" )");
            return sb2.toString();
        }

        b<E> v(int i10) {
            int i11 = i10 - this.f335958f;
            if (i11 == 0) {
                return y();
            }
            if (i11 > 0) {
                D(this.f335955c.v(i11), this.f335955c.f335955c);
                int i12 = this.f335958f;
                if (i12 < 0) {
                    this.f335958f = i12 + 1;
                }
            } else {
                B(this.f335953a.v(i11), this.f335953a.f335953a);
                int i13 = this.f335958f;
                if (i13 > 0) {
                    this.f335958f = i13 - 1;
                }
            }
            u();
            return e();
        }

        private b(int i10, E e10, b<E> bVar, b<E> bVar2) {
            this.f335958f = i10;
            this.f335959g = e10;
            this.f335956d = true;
            this.f335954b = true;
            this.f335955c = bVar;
            this.f335953a = bVar2;
        }

        private b(Collection<? extends E> collection) {
            this(collection.iterator(), 0, collection.size() - 1, 0, null, null);
        }

        private b(Iterator<? extends E> it, int i10, int i11, int i12, b<E> bVar, b<E> bVar2) {
            b<E> bVar3;
            int i13 = i10 + ((i11 - i10) / 2);
            if (i10 < i13) {
                b<E> bVar4 = new b<>(it, i10, i13 - 1, i13, bVar, this);
                bVar3 = this;
                bVar3.f335953a = bVar4;
            } else {
                bVar3 = this;
                bVar3.f335954b = true;
                bVar3.f335953a = bVar;
            }
            bVar3.f335959g = it.next();
            bVar3.f335958f = i13 - i12;
            if (i13 < i11) {
                bVar3.f335955c = new b<>(it, i13 + 1, i11, i13, bVar3, bVar2);
            } else {
                bVar3.f335956d = true;
                bVar3.f335955c = bVar2;
            }
            bVar3.u();
        }
    }

    public l(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return;
        }
        this.f335951a = new b<>(collection);
        this.f335952b = collection.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        k(i10, 0, size());
        return new c(this, i10);
    }
}
