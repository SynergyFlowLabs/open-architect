package org.apache.commons.collections4.multiset;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.e0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a<E> extends org.apache.commons.collections4.multiset.b<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Map<E, d> f336199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient int f336200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f336201e;

    /* JADX INFO: renamed from: org.apache.commons.collections4.multiset.a$a, reason: collision with other inner class name */
    protected static class C2398a<E> implements Iterator<e0.a<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final a<E> f336202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final Iterator<Map.Entry<E, d>> f336203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected e0.a<E> f336204c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected boolean f336205d = false;

        protected C2398a(Iterator<Map.Entry<E, d>> it, a<E> aVar) {
            this.f336203b = it;
            this.f336202a = aVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e0.a<E> next() {
            c cVar = new c(this.f336203b.next());
            this.f336204c = cVar;
            this.f336205d = true;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f336203b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f336205d) {
                throw new IllegalStateException("Iterator remove() can only be called once after next()");
            }
            this.f336203b.remove();
            this.f336204c = null;
            this.f336205d = false;
        }
    }

    private static class b<E> implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<E> f336206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<Map.Entry<E, d>> f336207b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f336209d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f336210e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map.Entry<E, d> f336208c = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f336211f = false;

        public b(a<E> aVar) {
            this.f336206a = aVar;
            this.f336207b = ((a) aVar).f336199c.entrySet().iterator();
            this.f336210e = ((a) aVar).f336201e;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f336209d <= 0 && !this.f336207b.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public E next() {
            if (((a) this.f336206a).f336201e != this.f336210e) {
                throw new ConcurrentModificationException();
            }
            if (this.f336209d == 0) {
                Map.Entry<E, d> next = this.f336207b.next();
                this.f336208c = next;
                this.f336209d = next.getValue().f336213a;
            }
            this.f336211f = true;
            this.f336209d--;
            return this.f336208c.getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (((a) this.f336206a).f336201e != this.f336210e) {
                throw new ConcurrentModificationException();
            }
            if (!this.f336211f) {
                throw new IllegalStateException();
            }
            d value = this.f336208c.getValue();
            int i10 = value.f336213a;
            if (i10 > 1) {
                value.f336213a = i10 - 1;
            } else {
                this.f336207b.remove();
            }
            a.t(this.f336206a);
            this.f336211f = false;
        }
    }

    protected static class c<E> extends org.apache.commons.collections4.multiset.b.AbstractC2399b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Map.Entry<E, d> f336212a;

        protected c(Map.Entry<E, d> entry) {
            this.f336212a = entry;
        }

        @Override // org.apache.commons.collections4.e0.a
        public E X0() {
            return this.f336212a.getKey();
        }

        @Override // org.apache.commons.collections4.e0.a
        public int getCount() {
            return this.f336212a.getValue().f336213a;
        }
    }

    protected static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f336213a;

        d(int i10) {
            this.f336213a = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).f336213a == this.f336213a;
        }

        public int hashCode() {
            return this.f336213a;
        }
    }

    protected static class e<E> extends org.apache.commons.collections4.iterators.c<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final a<E> f336214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected E f336215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected boolean f336216d;

        protected e(Iterator<E> it, a<E> aVar) {
            super(it);
            this.f336215c = null;
            this.f336216d = false;
            this.f336214b = aVar;
        }

        @Override // org.apache.commons.collections4.iterators.c, java.util.Iterator
        public E next() {
            E e10 = (E) super.next();
            this.f336215c = e10;
            this.f336216d = true;
            return e10;
        }

        @Override // org.apache.commons.collections4.iterators.g, java.util.Iterator
        public void remove() {
            if (!this.f336216d) {
                throw new IllegalStateException("Iterator remove() can only be called once after next()");
            }
            int iU0 = this.f336214b.U0(this.f336215c);
            super.remove();
            this.f336214b.f0(this.f336215c, iU0);
            this.f336215c = null;
            int i10 = 6 << 0;
            this.f336216d = false;
        }
    }

    protected a() {
    }

    static /* synthetic */ int t(a aVar) {
        int i10 = aVar.f336200d;
        aVar.f336200d = i10 - 1;
        return i10;
    }

    @Override // org.apache.commons.collections4.multiset.b, org.apache.commons.collections4.e0
    public int H(E e10, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Occurrences must not be negative.");
        }
        d dVar = this.f336199c.get(e10);
        int i11 = dVar != null ? dVar.f336213a : 0;
        if (i10 > 0) {
            this.f336201e++;
            this.f336200d += i10;
            if (dVar == null) {
                this.f336199c.put(e10, new d(i10));
                return i11;
            }
            dVar.f336213a += i10;
        }
        return i11;
    }

    @Override // org.apache.commons.collections4.multiset.b, org.apache.commons.collections4.e0
    public int U0(Object obj) {
        d dVar = this.f336199c.get(obj);
        if (dVar != null) {
            return dVar.f336213a;
        }
        return 0;
    }

    @Override // org.apache.commons.collections4.multiset.b, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f336201e++;
        this.f336199c.clear();
        this.f336200d = 0;
    }

    @Override // org.apache.commons.collections4.multiset.b, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f336199c.containsKey(obj);
    }

    @Override // org.apache.commons.collections4.multiset.b, java.util.Collection, org.apache.commons.collections4.e0
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
        for (E e10 : this.f336199c.keySet()) {
            if (e0Var.U0(e10) != U0(e10)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.commons.collections4.multiset.b, org.apache.commons.collections4.e0
    public int f0(Object obj, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Occurrences must not be negative.");
        }
        d dVar = this.f336199c.get(obj);
        if (dVar == null) {
            return 0;
        }
        int i11 = dVar.f336213a;
        if (i10 > 0) {
            this.f336201e++;
            if (i10 < i11) {
                dVar.f336213a = i11 - i10;
                this.f336200d -= i10;
                return i11;
            }
            this.f336199c.remove(obj);
            this.f336200d -= dVar.f336213a;
        }
        return i11;
    }

    @Override // org.apache.commons.collections4.multiset.b, java.util.Collection, org.apache.commons.collections4.e0
    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<E, d> entry : this.f336199c.entrySet()) {
            E key = entry.getKey();
            iHashCode += entry.getValue().f336213a ^ (key == null ? 0 : key.hashCode());
        }
        return iHashCode;
    }

    @Override // org.apache.commons.collections4.multiset.b
    protected Iterator<e0.a<E>> i() {
        return new C2398a(this.f336199c.entrySet().iterator(), this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f336199c.isEmpty();
    }

    @Override // org.apache.commons.collections4.multiset.b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.e0
    public Iterator<E> iterator() {
        return new b(this);
    }

    @Override // org.apache.commons.collections4.multiset.b
    protected Iterator<E> l() {
        return new e(u().keySet().iterator(), this);
    }

    @Override // org.apache.commons.collections4.multiset.b
    protected void m(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            Object object = objectInputStream.readObject();
            int i12 = objectInputStream.readInt();
            this.f336199c.put((E) object, new d(i12));
            this.f336200d += i12;
        }
    }

    @Override // org.apache.commons.collections4.multiset.b
    protected void n(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f336199c.size());
        for (Map.Entry<E, d> entry : this.f336199c.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().f336213a);
        }
    }

    @Override // org.apache.commons.collections4.multiset.b
    protected int p() {
        return this.f336199c.size();
    }

    @Override // org.apache.commons.collections4.multiset.b, java.util.AbstractCollection, java.util.Collection, org.apache.commons.collections4.e0
    public int size() {
        return this.f336200d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        int i10 = 0;
        for (Map.Entry<E, d> entry : this.f336199c.entrySet()) {
            E key = entry.getKey();
            int i11 = entry.getValue().f336213a;
            while (i11 > 0) {
                objArr[i10] = key;
                i11--;
                i10++;
            }
        }
        return objArr;
    }

    protected Map<E, d> u() {
        return this.f336199c;
    }

    protected void v(Map<E, d> map) {
        this.f336199c = map;
    }

    protected a(Map<E, d> map) {
        this.f336199c = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        int i10 = 0;
        for (Map.Entry<E, d> entry : this.f336199c.entrySet()) {
            E key = entry.getKey();
            int i11 = entry.getValue().f336213a;
            while (i11 > 0) {
                tArr[i10] = key;
                i11--;
                i10++;
            }
        }
        while (i10 < tArr.length) {
            tArr[i10] = null;
            i10++;
        }
        return tArr;
    }
}
