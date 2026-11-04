package org.apache.commons.collections4.multiset;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.collections4.e0;
import org.apache.commons.collections4.w;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b<E> extends AbstractCollection<E> implements e0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set<E> f336217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set<e0.a<E>> f336218b;

    class a implements w0<e0.a<E>, E> {
        a() {
        }

        @Override // org.apache.commons.collections4.w0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(e0.a<E> aVar) {
            return aVar.X0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: org.apache.commons.collections4.multiset.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC2399b<E> implements e0.a<E> {
        protected AbstractC2399b() {
        }

        @Override // org.apache.commons.collections4.e0.a
        public boolean equals(Object obj) {
            if (obj instanceof e0.a) {
                e0.a aVar = (e0.a) obj;
                E eX0 = X0();
                Object objX0 = aVar.X0();
                if (getCount() == aVar.getCount()) {
                    if (eX0 == objX0) {
                        return true;
                    }
                    if (eX0 != null && eX0.equals(objX0)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // org.apache.commons.collections4.e0.a
        public int hashCode() {
            E eX0 = X0();
            return getCount() ^ (eX0 == null ? 0 : eX0.hashCode());
        }

        public String toString() {
            return String.format("%s:%d", X0(), Integer.valueOf(getCount()));
        }
    }

    protected static class c<E> extends AbstractSet<e0.a<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b<E> f336220a;

        protected c(b<E> bVar) {
            this.f336220a = bVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof e0.a)) {
                return false;
            }
            e0.a aVar = (e0.a) obj;
            return this.f336220a.U0(aVar.X0()) == aVar.getCount();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<e0.a<E>> iterator() {
            return this.f336220a.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iU0;
            if (!(obj instanceof e0.a)) {
                return false;
            }
            e0.a aVar = (e0.a) obj;
            Object objX0 = aVar.X0();
            if (!this.f336220a.contains(objX0) || aVar.getCount() != (iU0 = this.f336220a.U0(objX0))) {
                return false;
            }
            this.f336220a.f0(objX0, iU0);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f336220a.p();
        }
    }

    private static class d<E> implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b<E> f336221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<e0.a<E>> f336222b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f336224d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e0.a<E> f336223c = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f336225e = false;

        public d(b<E> bVar) {
            this.f336221a = bVar;
            this.f336222b = bVar.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f336224d <= 0 && !this.f336222b.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f336224d == 0) {
                e0.a<E> next = this.f336222b.next();
                this.f336223c = next;
                this.f336224d = next.getCount();
            }
            this.f336225e = true;
            this.f336224d--;
            return this.f336223c.X0();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f336225e) {
                throw new IllegalStateException();
            }
            if (this.f336223c.getCount() > 1) {
                this.f336221a.remove(this.f336223c.X0());
            } else {
                this.f336222b.remove();
            }
            this.f336225e = false;
        }
    }

    protected static class e<E> extends AbstractSet<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final b<E> f336226a;

        protected e(b<E> bVar) {
            this.f336226a = bVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f336226a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f336226a.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f336226a.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.f336226a.l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            b<E> bVar = this.f336226a;
            return bVar.f0(obj, bVar.U0(obj)) != 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f336226a.p();
        }
    }

    protected b() {
    }

    public int H(E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    public int U0(Object obj) {
        for (e0.a<E> aVar : entrySet()) {
            E eX0 = aVar.X0();
            if (eX0 == obj || (eX0 != null && eX0.equals(obj))) {
                return aVar.getCount();
            }
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.apache.commons.collections4.e0
    public boolean add(E e10) {
        H(e10, 1);
        return true;
    }

    protected Set<e0.a<E>> c() {
        return new c(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Iterator<e0.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return U0(obj) > 0;
    }

    @Override // org.apache.commons.collections4.e0
    public Set<e0.a<E>> entrySet() {
        if (this.f336218b == null) {
            this.f336218b = c();
        }
        return this.f336218b;
    }

    @Override // java.util.Collection, org.apache.commons.collections4.e0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.size() != size()) {
            return false;
        }
        for (e0.a<E> aVar : entrySet()) {
            if (e0Var.U0(aVar.X0()) != U0(aVar.X0())) {
                return false;
            }
        }
        return true;
    }

    public int f0(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.e0
    public int g1(E e10, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Count must not be negative.");
        }
        int iU0 = U0(e10);
        if (iU0 < i10) {
            H(e10, i10 - iU0);
            return iU0;
        }
        f0(e10, iU0 - i10);
        return iU0;
    }

    @Override // java.util.Collection, org.apache.commons.collections4.e0
    public int hashCode() {
        return entrySet().hashCode();
    }

    protected abstract Iterator<e0.a<E>> i();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.e0
    public Iterator<E> iterator() {
        return new d(this);
    }

    protected Set<E> k() {
        return new e(this);
    }

    protected Iterator<E> l() {
        return w.k0(entrySet().iterator(), new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void m(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            g1(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    protected void n(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(entrySet().size());
        for (e0.a<E> aVar : entrySet()) {
            objectOutputStream.writeObject(aVar.X0());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }

    protected abstract int p();

    @Override // org.apache.commons.collections4.e0
    public Set<E> r0() {
        if (this.f336217a == null) {
            this.f336217a = k();
        }
        return this.f336217a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.apache.commons.collections4.e0
    public boolean remove(Object obj) {
        return f0(obj, 1) != 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.apache.commons.collections4.e0
    public boolean removeAll(Collection<?> collection) {
        while (true) {
            boolean z10 = false;
            for (Object obj : collection) {
                boolean z11 = f0(obj, U0(obj)) != 0;
                if (z10 || z11) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.apache.commons.collections4.e0
    public int size() {
        Iterator<e0.a<E>> it = entrySet().iterator();
        int count = 0;
        while (it.hasNext()) {
            count += it.next().getCount();
        }
        return count;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }
}
