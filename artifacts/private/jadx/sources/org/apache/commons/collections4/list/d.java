package org.apache.commons.collections4.list;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes14.dex */
public class d<E> extends org.apache.commons.collections4.list.a<E> implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335925e = 8836393098519411393L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient List<WeakReference<a<E>>> f335926d;

    public static class a<E> extends org.apache.commons.collections4.list.a.C2386a<E> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f335927f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f335928g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f335929h;

        protected a(d<E> dVar, int i10) {
            super(dVar, i10);
            this.f335928g = true;
            this.f335929h = false;
            this.f335927f = true;
        }

        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator
        public void add(E e10) {
            super.add(e10);
            this.f335911b = this.f335911b.f335921b;
        }

        @Override // org.apache.commons.collections4.list.a.C2386a
        protected void b() {
            if (!this.f335927f) {
                throw new ConcurrentModificationException("Cursor closed");
            }
        }

        public void d() {
            if (this.f335927f) {
                ((d) this.f335910a).M(this);
                this.f335927f = false;
            }
        }

        protected void e(org.apache.commons.collections4.list.a.d<E> dVar) {
        }

        protected void f(org.apache.commons.collections4.list.a.d<E> dVar) {
            if (dVar.f335920a == this.f335913d) {
                this.f335911b = dVar;
            } else if (this.f335911b.f335920a == dVar) {
                this.f335911b = dVar;
            } else {
                this.f335928g = false;
            }
        }

        protected void g(org.apache.commons.collections4.list.a.d<E> dVar) {
            org.apache.commons.collections4.list.a.d<E> dVar2 = this.f335911b;
            if (dVar == dVar2 && dVar == this.f335913d) {
                this.f335911b = dVar.f335921b;
                this.f335913d = null;
                this.f335929h = true;
            } else if (dVar == dVar2) {
                this.f335911b = dVar.f335921b;
                this.f335929h = false;
            } else if (dVar != this.f335913d) {
                this.f335928g = false;
                this.f335929h = false;
            } else {
                this.f335913d = null;
                this.f335929h = true;
                this.f335912c--;
            }
        }

        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ boolean hasNext() {
            return super.hasNext();
        }

        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator, org.apache.commons.collections4.i0
        public /* bridge */ /* synthetic */ boolean hasPrevious() {
            return super.hasPrevious();
        }

        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return super.next();
        }

        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator
        public int nextIndex() {
            if (!this.f335928g) {
                org.apache.commons.collections4.list.a.d<E> dVar = this.f335911b;
                org.apache.commons.collections4.list.a<E> aVar = this.f335910a;
                org.apache.commons.collections4.list.a.d<E> dVar2 = aVar.f335907a;
                if (dVar == dVar2) {
                    this.f335912c = aVar.size();
                } else {
                    int i10 = 0;
                    for (org.apache.commons.collections4.list.a.d<E> dVar3 = dVar2.f335921b; dVar3 != this.f335911b; dVar3 = dVar3.f335921b) {
                        i10++;
                    }
                    this.f335912c = i10;
                }
                this.f335928g = true;
            }
            return this.f335912c;
        }

        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator, org.apache.commons.collections4.i0
        public /* bridge */ /* synthetic */ Object previous() {
            return super.previous();
        }

        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator
        public /* bridge */ /* synthetic */ int previousIndex() {
            return super.previousIndex();
        }

        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator, java.util.Iterator
        public void remove() {
            if (this.f335913d != null || !this.f335929h) {
                b();
                this.f335910a.B(c());
            }
            this.f335929h = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            super.set(obj);
        }
    }

    protected static class b<E> extends a<E> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected final org.apache.commons.collections4.list.a.b<E> f335930i;

        protected b(org.apache.commons.collections4.list.a.b<E> bVar, int i10) {
            super((d) bVar.f335915a, i10 + bVar.f335916b);
            this.f335930i = bVar;
        }

        @Override // org.apache.commons.collections4.list.d.a, org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator
        public void add(E e10) {
            super.add(e10);
            org.apache.commons.collections4.list.a.b<E> bVar = this.f335930i;
            bVar.f335918d = this.f335910a.f335909c;
            bVar.f335917c++;
        }

        @Override // org.apache.commons.collections4.list.d.a, org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return nextIndex() < this.f335930i.f335917c;
        }

        @Override // org.apache.commons.collections4.list.d.a, org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator, org.apache.commons.collections4.i0
        public boolean hasPrevious() {
            return previousIndex() >= 0;
        }

        @Override // org.apache.commons.collections4.list.d.a, org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator
        public int nextIndex() {
            return super.nextIndex() - this.f335930i.f335916b;
        }

        @Override // org.apache.commons.collections4.list.d.a, org.apache.commons.collections4.list.a.C2386a, java.util.ListIterator, java.util.Iterator
        public void remove() {
            super.remove();
            org.apache.commons.collections4.list.a.b<E> bVar = this.f335930i;
            bVar.f335918d = this.f335910a.f335909c;
            bVar.f335917c--;
        }
    }

    public d() {
        v();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        s(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        t(objectOutputStream);
    }

    @Override // org.apache.commons.collections4.list.a
    protected void A() {
        if (size() > 0) {
            Iterator<E> it = iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
    }

    @Override // org.apache.commons.collections4.list.a
    protected void B(org.apache.commons.collections4.list.a.d<E> dVar) {
        super.B(dVar);
        G(dVar);
    }

    @Override // org.apache.commons.collections4.list.a
    protected void C(org.apache.commons.collections4.list.a.d<E> dVar, E e10) {
        super.C(dVar, e10);
        D(dVar);
    }

    protected void D(org.apache.commons.collections4.list.a.d<E> dVar) {
        Iterator<WeakReference<a<E>>> it = this.f335926d.iterator();
        while (it.hasNext()) {
            a<E> aVar = it.next().get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.e(dVar);
            }
        }
    }

    protected void F(org.apache.commons.collections4.list.a.d<E> dVar) {
        Iterator<WeakReference<a<E>>> it = this.f335926d.iterator();
        while (it.hasNext()) {
            a<E> aVar = it.next().get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.f(dVar);
            }
        }
    }

    protected void G(org.apache.commons.collections4.list.a.d<E> dVar) {
        Iterator<WeakReference<a<E>>> it = this.f335926d.iterator();
        while (it.hasNext()) {
            a<E> aVar = it.next().get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.g(dVar);
            }
        }
    }

    public a<E> J() {
        return K(0);
    }

    public a<E> K(int i10) {
        a<E> aVar = new a<>(this, i10);
        L(aVar);
        return aVar;
    }

    protected void L(a<E> aVar) {
        Iterator<WeakReference<a<E>>> it = this.f335926d.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
        this.f335926d.add(new WeakReference<>(aVar));
    }

    protected void M(a<E> aVar) {
        Iterator<WeakReference<a<E>>> it = this.f335926d.iterator();
        while (it.hasNext()) {
            WeakReference<a<E>> next = it.next();
            a<E> aVar2 = next.get();
            if (aVar2 == null) {
                it.remove();
            } else if (aVar2 == aVar) {
                next.clear();
                it.remove();
                return;
            }
        }
    }

    @Override // org.apache.commons.collections4.list.a
    protected void i(org.apache.commons.collections4.list.a.d<E> dVar, org.apache.commons.collections4.list.a.d<E> dVar2) {
        super.i(dVar, dVar2);
        F(dVar);
    }

    @Override // org.apache.commons.collections4.list.a, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return super.listIterator(0);
    }

    @Override // org.apache.commons.collections4.list.a, java.util.List
    public ListIterator<E> listIterator() {
        return K(0);
    }

    @Override // org.apache.commons.collections4.list.a
    protected ListIterator<E> r(org.apache.commons.collections4.list.a.b<E> bVar, int i10) {
        b bVar2 = new b(bVar, i10);
        L(bVar2);
        return bVar2;
    }

    @Override // org.apache.commons.collections4.list.a
    protected void v() {
        super.v();
        this.f335926d = new ArrayList();
    }

    @Override // org.apache.commons.collections4.list.a, java.util.List
    public ListIterator<E> listIterator(int i10) {
        return K(i10);
    }

    public d(Collection<? extends E> collection) {
        super(collection);
    }
}
