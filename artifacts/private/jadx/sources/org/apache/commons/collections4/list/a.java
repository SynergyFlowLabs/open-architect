package org.apache.commons.collections4.list;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.v;
import org.apache.commons.collections4.i0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a<E> implements List<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    transient d<E> f335907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int f335908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient int f335909c;

    /* JADX INFO: renamed from: org.apache.commons.collections4.list.a$a, reason: collision with other inner class name */
    protected static class C2386a<E> implements ListIterator<E>, i0<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final a<E> f335910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected d<E> f335911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f335912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected d<E> f335913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected int f335914e;

        protected C2386a(a<E> aVar, int i10) throws IndexOutOfBoundsException {
            this.f335910a = aVar;
            this.f335914e = aVar.f335909c;
            this.f335911b = aVar.u(i10, true);
            this.f335912c = i10;
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            b();
            this.f335910a.l(this.f335911b, e10);
            this.f335913d = null;
            this.f335912c++;
            this.f335914e++;
        }

        protected void b() {
            if (this.f335910a.f335909c != this.f335914e) {
                throw new ConcurrentModificationException();
            }
        }

        protected d<E> c() throws IllegalStateException {
            d<E> dVar = this.f335913d;
            if (dVar != null) {
                return dVar;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f335911b != this.f335910a.f335907a;
        }

        @Override // java.util.ListIterator, org.apache.commons.collections4.i0
        public boolean hasPrevious() {
            return this.f335911b.f335920a != this.f335910a.f335907a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException("No element at index " + this.f335912c + ".");
            }
            E eC = this.f335911b.c();
            d<E> dVar = this.f335911b;
            this.f335913d = dVar;
            this.f335911b = dVar.f335921b;
            this.f335912c++;
            return eC;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f335912c;
        }

        @Override // java.util.ListIterator, org.apache.commons.collections4.i0
        public E previous() {
            b();
            if (!hasPrevious()) {
                throw new NoSuchElementException("Already at start of list.");
            }
            d<E> dVar = this.f335911b.f335920a;
            this.f335911b = dVar;
            E eC = dVar.c();
            this.f335913d = this.f335911b;
            this.f335912c--;
            return eC;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return nextIndex() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            d<E> dVar = this.f335913d;
            d<E> dVar2 = this.f335911b;
            if (dVar == dVar2) {
                this.f335911b = dVar2.f335921b;
                this.f335910a.B(c());
            } else {
                this.f335910a.B(c());
                this.f335912c--;
            }
            this.f335913d = null;
            this.f335914e++;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            b();
            c().f(e10);
        }
    }

    protected static class b<E> extends AbstractList<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a<E> f335915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f335916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f335917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f335918d;

        protected b(a<E> aVar, int i10, int i11) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException("fromIndex = " + i10);
            }
            if (i11 > aVar.size()) {
                throw new IndexOutOfBoundsException("toIndex = " + i11);
            }
            if (i10 <= i11) {
                this.f335915a = aVar;
                this.f335916b = i10;
                this.f335917c = i11 - i10;
                this.f335918d = aVar.f335909c;
                return;
            }
            throw new IllegalArgumentException("fromIndex(" + i10 + ") > toIndex(" + i11 + ")");
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, E e10) {
            d(i10, this.f335917c + 1);
            c();
            this.f335915a.add(i10 + this.f335916b, e10);
            this.f335918d = this.f335915a.f335909c;
            this.f335917c++;
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> collection) {
            return addAll(this.f335917c, collection);
        }

        protected void c() {
            if (this.f335915a.f335909c != this.f335918d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            c();
            Iterator<E> it = iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }

        protected void d(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("Index '" + i10 + "' out of bounds for size '" + this.f335917c + "'");
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i10) {
            d(i10, this.f335917c);
            c();
            return this.f335915a.get(i10 + this.f335916b);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            c();
            return this.f335915a.p(this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i10) {
            d(i10, this.f335917c + 1);
            c();
            return this.f335915a.r(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public E remove(int i10) {
            d(i10, this.f335917c);
            c();
            E eRemove = this.f335915a.remove(i10 + this.f335916b);
            this.f335918d = this.f335915a.f335909c;
            this.f335917c--;
            ((AbstractList) this).modCount++;
            return eRemove;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int i10, E e10) {
            d(i10, this.f335917c);
            c();
            return this.f335915a.set(i10 + this.f335916b, e10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            c();
            return this.f335917c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int i10, int i11) {
            a<E> aVar = this.f335915a;
            int i12 = this.f335916b;
            return new b(aVar, i10 + i12, i11 + i12);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection<? extends E> collection) {
            d(i10, this.f335917c + 1);
            int size = collection.size();
            if (size == 0) {
                return false;
            }
            c();
            this.f335915a.addAll(this.f335916b + i10, collection);
            this.f335918d = this.f335915a.f335909c;
            this.f335917c += size;
            ((AbstractList) this).modCount++;
            return true;
        }
    }

    protected static class c<E> extends C2386a<E> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected final b<E> f335919f;

        protected c(b<E> bVar, int i10) {
            super(bVar.f335915a, i10 + bVar.f335916b);
            this.f335919f = bVar;
        }

        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator
        public void add(E e10) {
            super.add(e10);
            b<E> bVar = this.f335919f;
            bVar.f335918d = this.f335910a.f335909c;
            bVar.f335917c++;
        }

        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return nextIndex() < this.f335919f.f335917c;
        }

        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator, org.apache.commons.collections4.i0
        public boolean hasPrevious() {
            return previousIndex() >= 0;
        }

        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator
        public int nextIndex() {
            return super.nextIndex() - this.f335919f.f335916b;
        }

        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator, java.util.Iterator
        public void remove() {
            super.remove();
            b<E> bVar = this.f335919f;
            bVar.f335918d = this.f335910a.f335909c;
            bVar.f335917c--;
        }
    }

    protected a() {
    }

    protected void A() {
        d<E> dVar = this.f335907a;
        dVar.f335921b = dVar;
        dVar.f335920a = dVar;
        this.f335908b = 0;
        this.f335909c++;
    }

    protected void B(d<E> dVar) {
        d<E> dVar2 = dVar.f335920a;
        dVar2.f335921b = dVar.f335921b;
        dVar.f335921b.f335920a = dVar2;
        this.f335908b--;
        this.f335909c++;
    }

    protected void C(d<E> dVar, E e10) {
        dVar.f(e10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e10) {
        d(e10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return addAll(this.f335908b, collection);
    }

    public boolean c(E e10) {
        k(this.f335907a, e10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        A();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean d(E e10) {
        l(this.f335907a, e10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.size() != size()) {
            return false;
        }
        ListIterator<E> listIterator = listIterator();
        ListIterator<E> listIterator2 = list.listIterator();
        while (listIterator.hasNext() && listIterator2.hasNext()) {
            E next = listIterator.next();
            E next2 = listIterator2.next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
            } else if (!next.equals(next2)) {
                return false;
            }
        }
        return (listIterator.hasNext() || listIterator2.hasNext()) ? false : true;
    }

    @Override // java.util.List
    public E get(int i10) {
        return u(i10, false).c();
    }

    public E getFirst() {
        d<E> dVar = this.f335907a;
        d<E> dVar2 = dVar.f335921b;
        if (dVar2 != dVar) {
            return dVar2.c();
        }
        throw new NoSuchElementException();
    }

    public E getLast() {
        d<E> dVar = this.f335907a;
        d<E> dVar2 = dVar.f335920a;
        if (dVar2 != dVar) {
            return dVar2.c();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next == null ? 0 : next.hashCode());
        }
        return iHashCode;
    }

    protected void i(d<E> dVar, d<E> dVar2) {
        dVar.f335921b = dVar2;
        dVar.f335920a = dVar2.f335920a;
        dVar2.f335920a.f335921b = dVar;
        dVar2.f335920a = dVar;
        this.f335908b++;
        this.f335909c++;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int i10 = 0;
        for (d<E> dVar = this.f335907a.f335921b; dVar != this.f335907a; dVar = dVar.f335921b) {
            if (w(dVar.c(), obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return listIterator();
    }

    protected void k(d<E> dVar, E e10) {
        i(n(e10), dVar.f335921b);
    }

    protected void l(d<E> dVar, E e10) {
        i(n(e10), dVar);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int i10 = this.f335908b - 1;
        d<E> dVar = this.f335907a;
        while (true) {
            dVar = dVar.f335920a;
            if (dVar == this.f335907a) {
                return -1;
            }
            if (w(dVar.c(), obj)) {
                return i10;
            }
            i10--;
        }
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C2386a(this, 0);
    }

    protected d<E> m() {
        return new d<>();
    }

    protected d<E> n(E e10) {
        return new d<>(e10);
    }

    protected Iterator<E> p(b<E> bVar) {
        return r(bVar, 0);
    }

    protected ListIterator<E> r(b<E> bVar, int i10) {
        return new c(bVar, i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        d<E> dVarU = u(i10, false);
        E eC = dVarU.c();
        B(dVarU);
        return eC;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<E> it = iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public E removeFirst() {
        d<E> dVar = this.f335907a;
        d<E> dVar2 = dVar.f335921b;
        if (dVar2 == dVar) {
            throw new NoSuchElementException();
        }
        E eC = dVar2.c();
        B(dVar2);
        return eC;
    }

    public E removeLast() {
        d<E> dVar = this.f335907a;
        d<E> dVar2 = dVar.f335920a;
        if (dVar2 == dVar) {
            throw new NoSuchElementException();
        }
        E eC = dVar2.c();
        B(dVar2);
        return eC;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Iterator<E> it = iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void s(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        v();
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            add(objectInputStream.readObject());
        }
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        d<E> dVarU = u(i10, false);
        E eC = dVarU.c();
        C(dVarU, e10);
        return eC;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f335908b;
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return new b(this, i10, i11);
    }

    protected void t(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[this.f335908b]);
    }

    public String toString() {
        if (size() == 0) {
            return v.f334777p;
        }
        StringBuilder sb2 = new StringBuilder(size() * 16);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        Iterator<E> it = iterator();
        boolean zHasNext = it.hasNext();
        while (zHasNext) {
            Object next = it.next();
            if (next == this) {
                next = "(this Collection)";
            }
            sb2.append(next);
            zHasNext = it.hasNext();
            if (zHasNext) {
                sb2.append(", ");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    protected d<E> u(int i10, boolean z10) throws IndexOutOfBoundsException {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Couldn't get the node: index (" + i10 + ") less than zero.");
        }
        if (!z10 && i10 == this.f335908b) {
            throw new IndexOutOfBoundsException("Couldn't get the node: index (" + i10 + ") is the size of the list.");
        }
        int i11 = this.f335908b;
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("Couldn't get the node: index (" + i10 + ") greater than the size of the list (" + this.f335908b + ").");
        }
        if (i10 >= i11 / 2) {
            d<E> dVar = this.f335907a;
            while (i11 > i10) {
                dVar = dVar.f335920a;
                i11--;
            }
            return dVar;
        }
        d<E> dVar2 = this.f335907a.f335921b;
        for (int i12 = 0; i12 < i10; i12++) {
            dVar2 = dVar2.f335921b;
        }
        return dVar2;
    }

    protected void v() {
        this.f335907a = m();
    }

    protected boolean w(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    protected a(Collection<? extends E> collection) {
        v();
        addAll(collection);
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        l(u(i10, true), e10);
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        d<E> dVarU = u(i10, true);
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            l(dVarU, it.next());
        }
        return true;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new C2386a(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f335908b) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f335908b));
        }
        d<E> dVar = this.f335907a.f335921b;
        int i10 = 0;
        while (dVar != this.f335907a) {
            tArr[i10] = dVar.c();
            dVar = dVar.f335921b;
            i10++;
        }
        int length = tArr.length;
        int i11 = this.f335908b;
        if (length > i11) {
            tArr[i11] = null;
        }
        return tArr;
    }

    protected static class d<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected d<E> f335920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected d<E> f335921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected E f335922c;

        protected d() {
            this.f335920a = this;
            this.f335921b = this;
        }

        protected d<E> a() {
            return this.f335921b;
        }

        protected d<E> b() {
            return this.f335920a;
        }

        protected E c() {
            return this.f335922c;
        }

        protected void d(d<E> dVar) {
            this.f335921b = dVar;
        }

        protected void e(d<E> dVar) {
            this.f335920a = dVar;
        }

        protected void f(E e10) {
            this.f335922c = e10;
        }

        protected d(E e10) {
            this.f335922c = e10;
        }

        protected d(d<E> dVar, d<E> dVar2, E e10) {
            this.f335920a = dVar;
            this.f335921b = dVar2;
            this.f335922c = e10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        d<E> dVar = this.f335907a;
        do {
            dVar = dVar.f335921b;
            if (dVar == this.f335907a) {
                return false;
            }
        } while (!w(dVar.c(), obj));
        B(dVar);
        return true;
    }
}
