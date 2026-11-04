package org.apache.commons.collections4.bag;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.v;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b<E> implements org.apache.commons.collections4.c<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Map<E, C2383b> f335494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f335495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f335496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Set<E> f335497d;

    static class a<E> implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b<E> f335498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<Map.Entry<E, C2383b>> f335499b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f335501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f335502e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map.Entry<E, C2383b> f335500c = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f335503f = false;

        public a(b<E> bVar) {
            this.f335498a = bVar;
            this.f335499b = ((b) bVar).f335494a.entrySet().iterator();
            this.f335502e = ((b) bVar).f335496c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f335501d > 0 || this.f335499b.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (((b) this.f335498a).f335496c != this.f335502e) {
                throw new ConcurrentModificationException();
            }
            if (this.f335501d == 0) {
                Map.Entry<E, C2383b> next = this.f335499b.next();
                this.f335500c = next;
                this.f335501d = next.getValue().f335504a;
            }
            this.f335503f = true;
            this.f335501d--;
            return this.f335500c.getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (((b) this.f335498a).f335496c != this.f335502e) {
                throw new ConcurrentModificationException();
            }
            if (!this.f335503f) {
                throw new IllegalStateException();
            }
            C2383b value = this.f335500c.getValue();
            int i10 = value.f335504a;
            if (i10 > 1) {
                value.f335504a = i10 - 1;
            } else {
                this.f335499b.remove();
            }
            b.i(this.f335498a);
            this.f335503f = false;
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.collections4.bag.b$b, reason: collision with other inner class name */
    protected static class C2383b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f335504a;

        C2383b(int i10) {
            this.f335504a = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2383b) && ((C2383b) obj).f335504a == this.f335504a;
        }

        public int hashCode() {
            return this.f335504a;
        }
    }

    protected b() {
    }

    static /* synthetic */ int i(b bVar) {
        int i10 = bVar.f335495b;
        bVar.f335495b = i10 - 1;
        return i10;
    }

    @Override // org.apache.commons.collections4.c
    public boolean H(E e10, int i10) {
        this.f335496c++;
        if (i10 > 0) {
            C2383b c2383b = this.f335494a.get(e10);
            this.f335495b += i10;
            if (c2383b == null) {
                this.f335494a.put(e10, new C2383b(i10));
                return true;
            }
            c2383b.f335504a += i10;
        }
        return false;
    }

    @Override // org.apache.commons.collections4.c
    public int U0(Object obj) {
        C2383b c2383b = this.f335494a.get(obj);
        if (c2383b != null) {
            return c2383b.f335504a;
        }
        return 0;
    }

    @Override // org.apache.commons.collections4.c, java.util.Collection
    public boolean add(E e10) {
        return H(e10, 1);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                boolean zAdd = add(it.next());
                if (z10 || zAdd) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.Collection
    public void clear() {
        this.f335496c++;
        this.f335494a.clear();
        this.f335495b = 0;
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f335494a.containsKey(obj);
    }

    @Override // org.apache.commons.collections4.c, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return collection instanceof org.apache.commons.collections4.c ? k((org.apache.commons.collections4.c) collection) : k(new f(collection));
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.apache.commons.collections4.c)) {
            return false;
        }
        org.apache.commons.collections4.c cVar = (org.apache.commons.collections4.c) obj;
        if (cVar.size() != size()) {
            return false;
        }
        for (E e10 : this.f335494a.keySet()) {
            if (cVar.U0(e10) != U0(e10)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.commons.collections4.c
    public boolean f0(Object obj, int i10) {
        C2383b c2383b = this.f335494a.get(obj);
        if (c2383b == null || i10 <= 0) {
            return false;
        }
        this.f335496c++;
        int i11 = c2383b.f335504a;
        if (i10 < i11) {
            c2383b.f335504a = i11 - i10;
            this.f335495b -= i10;
        } else {
            this.f335494a.remove(obj);
            this.f335495b -= c2383b.f335504a;
        }
        return true;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<E, C2383b> entry : this.f335494a.entrySet()) {
            E key = entry.getKey();
            iHashCode += entry.getValue().f335504a ^ (key == null ? 0 : key.hashCode());
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f335494a.isEmpty();
    }

    @Override // org.apache.commons.collections4.c, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a(this);
    }

    boolean k(org.apache.commons.collections4.c<?> cVar) {
        for (Object obj : cVar.r0()) {
            if (U0(obj) < cVar.U0(obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void l(Map<E, C2383b> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f335494a = map;
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            Object object = objectInputStream.readObject();
            int i12 = objectInputStream.readInt();
            map.put(object, new C2383b(i12));
            this.f335495b += i12;
        }
    }

    protected void m(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f335494a.size());
        for (Map.Entry<E, C2383b> entry : this.f335494a.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().f335504a);
        }
    }

    protected Map<E, C2383b> n() {
        return this.f335494a;
    }

    boolean p(org.apache.commons.collections4.c<?> cVar) {
        f fVar = new f();
        for (E e10 : r0()) {
            int iU0 = U0(e10);
            int iU1 = cVar.U0(e10);
            if (1 > iU1 || iU1 > iU0) {
                fVar.H(e10, iU0);
            } else {
                fVar.H(e10, iU0 - iU1);
            }
        }
        if (fVar.isEmpty()) {
            return false;
        }
        return removeAll(fVar);
    }

    @Override // org.apache.commons.collections4.c
    public Set<E> r0() {
        if (this.f335497d == null) {
            this.f335497d = org.apache.commons.collections4.set.o.k(this.f335494a.keySet());
        }
        return this.f335497d;
    }

    @Override // org.apache.commons.collections4.c, java.util.Collection
    public boolean remove(Object obj) {
        C2383b c2383b = this.f335494a.get(obj);
        if (c2383b == null) {
            return false;
        }
        this.f335496c++;
        this.f335494a.remove(obj);
        this.f335495b -= c2383b.f335504a;
        return true;
    }

    @Override // org.apache.commons.collections4.c, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        if (collection == null) {
            return false;
        }
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                boolean zF0 = f0(it.next(), 1);
                if (z10 || zF0) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // org.apache.commons.collections4.c, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return collection instanceof org.apache.commons.collections4.c ? p((org.apache.commons.collections4.c) collection) : p(new f(collection));
    }

    @Override // org.apache.commons.collections4.c, java.util.Collection
    public int size() {
        return this.f335495b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        int i10 = 0;
        for (E e10 : this.f335494a.keySet()) {
            int iU0 = U0(e10);
            while (iU0 > 0) {
                objArr[i10] = e10;
                iU0--;
                i10++;
            }
        }
        return objArr;
    }

    public String toString() {
        if (size() == 0) {
            return v.f334777p;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        Iterator<E> it = r0().iterator();
        while (it.hasNext()) {
            E next = it.next();
            sb2.append(U0(next));
            sb2.append(AbstractJsonLexerKt.COLON);
            sb2.append(next);
            if (it.hasNext()) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    protected b(Map<E, C2383b> map) {
        this.f335494a = map;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        int i10 = 0;
        for (E e10 : this.f335494a.keySet()) {
            int iU0 = U0(e10);
            while (iU0 > 0) {
                tArr[i10] = e10;
                iU0--;
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
