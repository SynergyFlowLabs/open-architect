package androidx.collection;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends h3<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    a<K, V>.C0046a f12110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    a<K, V>.c f12111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    a<K, V>.e f12112f;

    /* JADX INFO: renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    final class C0046a extends AbstractSet<Map.Entry<K, V>> {
        C0046a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NonNull
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a.this.size();
        }
    }

    final class b extends z<K> {
        b() {
            super(a.this.size());
        }

        @Override // androidx.collection.z
        protected K b(int i10) {
            return a.this.g(i10);
        }

        @Override // androidx.collection.z
        protected void c(int i10) {
            a.this.i(i10);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12117b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f12118c;

        d() {
            this.f12116a = a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f12117b++;
            this.f12118c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f12118c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return t.a.c(entry.getKey(), a.this.g(this.f12117b)) && t.a.c(entry.getValue(), a.this.k(this.f12117b));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f12118c) {
                return a.this.g(this.f12117b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f12118c) {
                return a.this.k(this.f12117b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12117b < this.f12116a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f12118c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kG = a.this.g(this.f12117b);
            V vK = a.this.k(this.f12117b);
            return (kG == null ? 0 : kG.hashCode()) ^ (vK != null ? vK.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f12118c) {
                throw new IllegalStateException();
            }
            a.this.i(this.f12117b);
            this.f12117b--;
            this.f12116a--;
            this.f12118c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (this.f12118c) {
                return a.this.j(this.f12117b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class f extends z<V> {
        f() {
            super(a.this.size());
        }

        @Override // androidx.collection.z
        protected V b(int i10) {
            return a.this.k(i10);
        }

        @Override // androidx.collection.z
        protected void c(int i10) {
            a.this.i(i10);
        }
    }

    public a() {
    }

    static <T> boolean m(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.h3, java.util.Map
    public boolean containsKey(@androidx.annotation.p0 Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.h3, java.util.Map
    public boolean containsValue(@androidx.annotation.p0 Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.C0046a c0046a = this.f12110d;
        if (c0046a == null) {
            c0046a = new C0046a();
            this.f12110d = c0046a;
        }
        return c0046a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.h3, java.util.Map
    public V get(@androidx.annotation.p0 Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<K> keySet() {
        a<K, V>.c cVar = this.f12111e;
        if (cVar != null) {
            return cVar;
        }
        a<K, V>.c cVar2 = new c();
        this.f12111e = cVar2;
        return cVar2;
    }

    public boolean l(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean n(@NonNull Collection<?> collection) {
        int size = size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public boolean o(@NonNull Collection<?> collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(g(size2))) {
                i(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(@NonNull Map<? extends K, ? extends V> map) {
        b(size() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.h3, java.util.Map
    public V remove(@androidx.annotation.p0 Object obj) {
        return (V) super.remove(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Collection<V> values() {
        a<K, V>.e eVar = this.f12112f;
        if (eVar != null) {
            return eVar;
        }
        a<K, V>.e eVar2 = new e();
        this.f12112f = eVar2;
        return eVar2;
    }

    public a(int i10) {
        super(i10);
    }

    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(@NonNull Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@NonNull Collection<?> collection) {
            return a.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return a.m(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = a.this.size() - 1; size >= 0; size--) {
                K kG = a.this.g(size);
                iHashCode += kG == null ? 0 : kG.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @NonNull
        public Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iE = a.this.e(obj);
            if (iE < 0) {
                return false;
            }
            a.this.i(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(@NonNull Collection<?> collection) {
            return a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(@NonNull Collection<?> collection) {
            return a.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public Object[] toArray() {
            int size = a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = a.this.g(i10);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public <T> T[] toArray(@NonNull T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = a.this.g(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(@NonNull Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NonNull
        public Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iA = a.this.a(obj);
            if (iA < 0) {
                return false;
            }
            a.this.i(iA);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(@NonNull Collection<?> collection) {
            int size = a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(a.this.k(i10))) {
                    a.this.i(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(@NonNull Collection<?> collection) {
            int size = a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(a.this.k(i10))) {
                    a.this.i(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return a.this.size();
        }

        @Override // java.util.Collection
        @NonNull
        public Object[] toArray() {
            int size = a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = a.this.k(i10);
            }
            return objArr;
        }

        @Override // java.util.Collection
        @NonNull
        public <T> T[] toArray(@NonNull T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = a.this.k(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public a(@androidx.annotation.p0 h3 h3Var) {
        super(h3Var);
    }
}
