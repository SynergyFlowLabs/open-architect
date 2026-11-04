package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@a4
@com.google.common.annotations.b(emulated = true)
abstract class a<K, V> extends g5<K, V> implements w<K, V>, Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final long f116987f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Map<K, V> f116988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @r9.j
    transient a<V, K> f116989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Set<K> f116990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Set<V> f116991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Set<Map.Entry<K, V>> f116992e;

    /* JADX INFO: renamed from: com.google.common.collect.a$a, reason: collision with other inner class name */
    class C1053a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        Map.Entry<K, V> f116993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f116994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f116995c;

        C1053a(final a this$0, final Iterator val$iterator) {
            this.f116994b = val$iterator;
            this.f116995c = this$0;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry = (Map.Entry) this.f116994b.next();
            this.f116993a = entry;
            return new b(entry);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f116994b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            Map.Entry<K, V> entry = this.f116993a;
            if (entry == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            V value = entry.getValue();
            this.f116994b.remove();
            this.f116995c.x1(value);
            this.f116993a = null;
        }
    }

    class b extends h5<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map.Entry<K, V> f116996a;

        b(Map.Entry<K, V> delegate) {
            this.f116996a = delegate;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.h5, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0 */
        public Map.Entry<K, V> i1() {
            return this.f116996a;
        }

        @Override // com.google.common.collect.h5, java.util.Map.Entry
        public V setValue(V value) {
            a.this.n1(value);
            com.google.common.base.j0.h0(a.this.entrySet().contains(this), "entry no longer in map");
            if (com.google.common.base.d0.a(value, getValue())) {
                return value;
            }
            com.google.common.base.j0.u(!a.this.containsValue(value), "value already present: %s", value);
            V value2 = this.f116996a.setValue(value);
            com.google.common.base.j0.h0(com.google.common.base.d0.a(value, a.this.get(getKey())), "entry no longer in map");
            a.this.A1(getKey(), true, value2, value);
            return value2;
        }
    }

    private class c extends o5<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Set<Map.Entry<K, V>> f116998a;

        private c() {
            this.f116998a = a.this.f116988a.entrySet();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public void clear() {
            a.this.clear();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            return b8.p(i1(), o10);
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> c10) {
            return V0(c10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.o5, com.google.common.collect.v4
        public Set<Map.Entry<K, V>> i1() {
            return this.f116998a;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return a.this.q1();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object object) {
            if (!this.f116998a.contains(object) || !(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            ((a) a.this.f116989b).f116988a.remove(entry.getValue());
            this.f116998a.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c10) {
            return Y0(c10);
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c10) {
            return Z0(c10);
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return a1();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) c1(tArr);
        }

        /* synthetic */ c(a aVar, C1053a c1053a) {
            this();
        }
    }

    static class d<K, V> extends a<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private static final long f117000g = 0;

        d(Map<K, V> backward, a<V, K> forward) {
            super(backward, forward, null);
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
            stream.defaultReadObject();
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            z1((a) object);
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(Y2());
        }

        @Override // com.google.common.collect.a, com.google.common.collect.g5, com.google.common.collect.m5
        /* JADX INFO: renamed from: K0 */
        protected /* bridge */ /* synthetic */ Object i1() {
            return super.i1();
        }

        @Override // com.google.common.collect.a
        @b9
        K m1(@b9 K key) {
            return this.f116989b.n1(key);
        }

        @Override // com.google.common.collect.a
        @b9
        V n1(@b9 V value) {
            return this.f116989b.m1(value);
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object readResolve() {
            return Y2().Y2();
        }

        @Override // com.google.common.collect.a, com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    private class e extends o5<K> {
        private e() {
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public void clear() {
            a.this.clear();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.o5, com.google.common.collect.v4
        public Set<K> i1() {
            return a.this.f116988a.keySet();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return b8.S(a.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object key) {
            if (!contains(key)) {
                return false;
            }
            a.this.v1(key);
            return true;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> keysToRemove) {
            return Y0(keysToRemove);
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> keysToRetain) {
            return Z0(keysToRetain);
        }

        /* synthetic */ e(a aVar, C1053a c1053a) {
            this();
        }
    }

    private class f extends o5<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Set<V> f117002a;

        private f() {
            this.f117002a = a.this.f116989b.keySet();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.o5, com.google.common.collect.v4
        public Set<V> i1() {
            return this.f117002a;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return b8.R0(a.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return a1();
        }

        @Override // com.google.common.collect.m5
        public String toString() {
            return f1();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) c1(tArr);
        }

        /* synthetic */ f(a aVar, C1053a c1053a) {
            this();
        }
    }

    /* synthetic */ a(Map map, a aVar, C1053a c1053a) {
        this(map, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void A1(@b9 K key, boolean containedKey, @fj.a V oldValue, @b9 V newValue) {
        if (containedKey) {
            x1(u8.a(oldValue));
        }
        this.f116989b.f116988a.put(newValue, key);
    }

    @fj.a
    private V t1(@b9 K key, @b9 V value, boolean force) {
        m1(key);
        n1(value);
        boolean zContainsKey = containsKey(key);
        if (zContainsKey && com.google.common.base.d0.a(value, get(key))) {
            return value;
        }
        if (force) {
            Y2().remove(value);
        } else {
            com.google.common.base.j0.u(!containsValue(value), "value already present: %s", value);
        }
        V vPut = this.f116988a.put(key, value);
        A1(key, zContainsKey, vPut, value);
        return vPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @z7.a
    @b9
    public V v1(@fj.a Object obj) {
        V v10 = (V) u8.a(this.f116988a.remove(obj));
        x1(v10);
        return v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x1(@b9 V oldValue) {
        this.f116989b.f116988a.remove(oldValue);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.g5, com.google.common.collect.m5
    /* JADX INFO: renamed from: L0 */
    public Map<K, V> i1() {
        return this.f116988a;
    }

    @Override // com.google.common.collect.w
    @z7.a
    @fj.a
    public V L2(@b9 K key, @b9 V value) {
        return t1(key, value, true);
    }

    @Override // com.google.common.collect.w
    public w<V, K> Y2() {
        return this.f116989b;
    }

    @Override // com.google.common.collect.g5, java.util.Map
    public void clear() {
        this.f116988a.clear();
        this.f116989b.f116988a.clear();
    }

    @Override // com.google.common.collect.g5, java.util.Map
    public boolean containsValue(@fj.a Object value) {
        return this.f116989b.containsKey(value);
    }

    @Override // com.google.common.collect.g5, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> cVar = this.f116992e;
        if (cVar == null) {
            cVar = new c(this, null);
            this.f116992e = cVar;
        }
        return cVar;
    }

    @Override // com.google.common.collect.g5, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f116990c;
        if (set != null) {
            return set;
        }
        e eVar = new e(this, null);
        this.f116990c = eVar;
        return eVar;
    }

    @z7.a
    @b9
    K m1(@b9 K key) {
        return key;
    }

    @z7.a
    @b9
    V n1(@b9 V value) {
        return value;
    }

    @Override // com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
    @z7.a
    @fj.a
    public V put(@b9 K key, @b9 V value) {
        return t1(key, value, false);
    }

    @Override // com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    Iterator<Map.Entry<K, V>> q1() {
        return new C1053a(this, this.f116988a.entrySet().iterator());
    }

    a<V, K> r1(Map<V, K> backward) {
        return new d(backward, this);
    }

    @Override // com.google.common.collect.g5, java.util.Map
    @z7.a
    @fj.a
    public V remove(@fj.a Object key) {
        if (containsKey(key)) {
            return v1(key);
        }
        return null;
    }

    void y1(Map<K, V> forward, Map<V, K> backward) {
        com.google.common.base.j0.g0(this.f116988a == null);
        com.google.common.base.j0.g0(this.f116989b == null);
        com.google.common.base.j0.d(forward.isEmpty());
        com.google.common.base.j0.d(backward.isEmpty());
        com.google.common.base.j0.d(forward != backward);
        this.f116988a = forward;
        this.f116989b = r1(backward);
    }

    void z1(a<V, K> inverse) {
        this.f116989b = inverse;
    }

    a(Map<K, V> forward, Map<V, K> backward) {
        y1(forward, backward);
    }

    @Override // com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
    public Set<V> values() {
        Set<V> fVar = this.f116991d;
        if (fVar == null) {
            fVar = new f(this, null);
            this.f116991d = fVar;
        }
        return fVar;
    }

    private a(Map<K, V> backward, a<V, K> forward) {
        this.f116988a = backward;
        this.f116989b = forward;
    }
}
