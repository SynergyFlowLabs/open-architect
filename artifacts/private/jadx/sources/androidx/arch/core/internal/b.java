package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c<K, V> f11711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c<K, V> f11712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f11713c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11714d = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f11718d;
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f11717c;
        }
    }

    /* JADX INFO: renamed from: androidx.arch.core.internal.b$b, reason: collision with other inner class name */
    private static class C0036b<K, V> extends e<K, V> {
        C0036b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f11717c;
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f11718d;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final K f11715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        final V f11716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c<K, V> f11717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c<K, V> f11718d;

        c(@NonNull K k10, @NonNull V v10) {
            this.f11715a = k10;
            this.f11716b = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f11715a.equals(cVar.f11715a) && this.f11716b.equals(cVar.f11716b);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public K getKey() {
            return this.f11715a;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V getValue() {
            return this.f11716b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f11716b.hashCode() ^ this.f11715a.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f11715a + "=" + this.f11716b;
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c<K, V> f11719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11720b = true;

        d() {
        }

        @Override // androidx.arch.core.internal.b.f
        void b(@NonNull c<K, V> cVar) {
            c<K, V> cVar2 = this.f11719a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f11718d;
                this.f11719a = cVar3;
                this.f11720b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f11720b) {
                this.f11720b = false;
                this.f11719a = b.this.f11711a;
            } else {
                c<K, V> cVar = this.f11719a;
                this.f11719a = cVar != null ? cVar.f11717c : null;
            }
            return this.f11719a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f11720b) {
                return b.this.f11711a != null;
            }
            c<K, V> cVar = this.f11719a;
            return (cVar == null || cVar.f11717c == null) ? false : true;
        }
    }

    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c<K, V> f11722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c<K, V> f11723b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f11722a = cVar2;
            this.f11723b = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f11723b;
            c<K, V> cVar2 = this.f11722a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // androidx.arch.core.internal.b.f
        public void b(@NonNull c<K, V> cVar) {
            if (this.f11722a == cVar && cVar == this.f11723b) {
                this.f11723b = null;
                this.f11722a = null;
            }
            c<K, V> cVar2 = this.f11722a;
            if (cVar2 == cVar) {
                this.f11722a = c(cVar2);
            }
            if (this.f11723b == cVar) {
                this.f11723b = f();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f11723b;
            this.f11723b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11723b != null;
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static abstract class f<K, V> {
        abstract void b(@NonNull c<K, V> cVar);
    }

    @p0
    public Map.Entry<K, V> c() {
        return this.f11711a;
    }

    @p0
    protected c<K, V> d(K k10) {
        c<K, V> cVar = this.f11711a;
        while (cVar != null && !cVar.f11715a.equals(k10)) {
            cVar = cVar.f11717c;
        }
        return cVar;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0036b c0036b = new C0036b(this.f11712b, this.f11711a);
        this.f11713c.put(c0036b, Boolean.FALSE);
        return c0036b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @NonNull
    public b<K, V>.d i() {
        b<K, V>.d dVar = new d();
        this.f11713c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f11711a, this.f11712b);
        this.f11713c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    @p0
    public Map.Entry<K, V> k() {
        return this.f11712b;
    }

    c<K, V> l(@NonNull K k10, @NonNull V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f11714d++;
        c<K, V> cVar2 = this.f11712b;
        if (cVar2 == null) {
            this.f11711a = cVar;
            this.f11712b = cVar;
            return cVar;
        }
        cVar2.f11717c = cVar;
        cVar.f11718d = cVar2;
        this.f11712b = cVar;
        return cVar;
    }

    public V m(@NonNull K k10, @NonNull V v10) {
        c<K, V> cVarD = d(k10);
        if (cVarD != null) {
            return cVarD.f11716b;
        }
        l(k10, v10);
        return null;
    }

    public V n(@NonNull K k10) {
        c<K, V> cVarD = d(k10);
        if (cVarD == null) {
            return null;
        }
        this.f11714d--;
        if (!this.f11713c.isEmpty()) {
            Iterator<f<K, V>> it = this.f11713c.keySet().iterator();
            while (it.hasNext()) {
                it.next().b(cVarD);
            }
        }
        c<K, V> cVar = cVarD.f11718d;
        if (cVar != null) {
            cVar.f11717c = cVarD.f11717c;
        } else {
            this.f11711a = cVarD.f11717c;
        }
        c<K, V> cVar2 = cVarD.f11717c;
        if (cVar2 != null) {
            cVar2.f11718d = cVar;
        } else {
            this.f11712b = cVar;
        }
        cVarD.f11717c = null;
        cVarD.f11718d = null;
        return cVarD.f11716b;
    }

    public int size() {
        return this.f11714d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
