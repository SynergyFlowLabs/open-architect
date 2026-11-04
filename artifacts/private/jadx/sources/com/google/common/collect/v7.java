package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public class v7<K, V> extends com.google.common.collect.h<K, V> implements w7<K, V>, Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final long f118213k = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @fj.a
    private transient g<K, V> f118214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @fj.a
    private transient g<K, V> f118215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Map<K, f<K, V>> f118216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient int f118217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient int f118218j;

    class a extends AbstractSequentialList<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f118219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v7 f118220b;

        a(final v7 this$0, final Object val$key) {
            this.f118219a = val$key;
            this.f118220b = this$0;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int index) {
            return new i(this.f118219a, index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            f fVar = (f) this.f118220b.f118216h.get(this.f118219a);
            if (fVar == null) {
                return 0;
            }
            return fVar.f118233c;
        }
    }

    class b extends AbstractSequentialList<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<Map.Entry<K, V>> listIterator(int index) {
            return new h(index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return v7.this.f118217i;
        }
    }

    class c extends z9.k<K> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object key) {
            return v7.this.containsKey(key);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new e(v7.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object o10) {
            return !v7.this.c(o10).isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v7.this.f118216h.size();
        }
    }

    class d extends AbstractSequentialList<V> {

        class a extends fb<Map.Entry<K, V>, V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f118224b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f118225c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(final d this$1, ListIterator backingIterator, final h val$nodeItr) {
                super(backingIterator);
                this.f118224b = val$nodeItr;
                this.f118225c = this$1;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.eb
            @b9
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public V b(Map.Entry<K, V> entry) {
                return entry.getValue();
            }

            @Override // com.google.common.collect.fb, java.util.ListIterator
            public void set(@b9 V value) {
                this.f118224b.g(value);
            }
        }

        d() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int index) {
            h hVar = new h(index);
            return new a(this, hVar, hVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return v7.this.f118217i;
        }
    }

    private static class f<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g<K, V> f118231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g<K, V> f118232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f118233c;

        f(g<K, V> firstNode) {
            this.f118231a = firstNode;
            this.f118232b = firstNode;
            firstNode.f118239f = null;
            firstNode.f118238e = null;
            int i10 = 4 ^ 1;
            this.f118233c = 1;
        }
    }

    static final class g<K, V> extends com.google.common.collect.g<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        final K f118234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @b9
        V f118235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        g<K, V> f118236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        g<K, V> f118237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.a
        g<K, V> f118238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.a
        g<K, V> f118239f;

        g(@b9 K key, @b9 V value) {
            this.f118234a = key;
            this.f118235b = value;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public K getKey() {
            return this.f118234a;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public V getValue() {
            return this.f118235b;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public V setValue(@b9 V newValue) {
            V v10 = this.f118235b;
            this.f118235b = newValue;
            return v10;
        }
    }

    private class h implements ListIterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f118240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        g<K, V> f118241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        g<K, V> f118242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        g<K, V> f118243d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118244e;

        h(int index) {
            this.f118244e = v7.this.f118218j;
            int size = v7.this.size();
            com.google.common.base.j0.d0(index, size);
            if (index < size / 2) {
                this.f118241b = v7.this.f118214f;
                while (true) {
                    int i10 = index - 1;
                    if (index <= 0) {
                        break;
                    }
                    next();
                    index = i10;
                }
            } else {
                this.f118243d = v7.this.f118215g;
                this.f118240a = size;
                while (true) {
                    int i11 = index + 1;
                    if (index >= size) {
                        break;
                    }
                    previous();
                    index = i11;
                }
            }
            this.f118242c = null;
        }

        private void c() {
            if (v7.this.f118218j != this.f118244e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(Map.Entry<K, V> e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @z7.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public g<K, V> next() {
            c();
            g<K, V> gVar = this.f118241b;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f118242c = gVar;
            this.f118243d = gVar;
            this.f118241b = gVar.f118236c;
            this.f118240a++;
            return gVar;
        }

        @Override // java.util.ListIterator
        @z7.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public g<K, V> previous() {
            c();
            g<K, V> gVar = this.f118243d;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f118242c = gVar;
            this.f118241b = gVar;
            this.f118243d = gVar.f118237d;
            this.f118240a--;
            return gVar;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void set(Map.Entry<K, V> e10) {
            throw new UnsupportedOperationException();
        }

        void g(@b9 V value) {
            com.google.common.base.j0.g0(this.f118242c != null);
            this.f118242c.f118235b = value;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            c();
            return this.f118241b != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            c();
            return this.f118243d != null;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f118240a;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f118240a - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            c();
            com.google.common.base.j0.h0(this.f118242c != null, "no calls to next() since the last call to remove()");
            g<K, V> gVar = this.f118242c;
            if (gVar != this.f118241b) {
                this.f118243d = gVar.f118237d;
                this.f118240a--;
            } else {
                this.f118241b = gVar.f118236c;
            }
            v7.this.E(gVar);
            this.f118242c = null;
            this.f118244e = v7.this.f118218j;
        }
    }

    v7() {
        this(12);
    }

    private List<V> C(@b9 K key) {
        return Collections.unmodifiableList(x7.s(new i(key)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(@b9 K key) {
        p7.g(new i(key));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(g<K, V> node) {
        g<K, V> gVar = node.f118237d;
        if (gVar != null) {
            gVar.f118236c = node.f118236c;
        } else {
            this.f118214f = node.f118236c;
        }
        g<K, V> gVar2 = node.f118236c;
        if (gVar2 != null) {
            gVar2.f118237d = gVar;
        } else {
            this.f118215g = gVar;
        }
        if (node.f118239f == null && node.f118238e == null) {
            f<K, V> fVarRemove = this.f118216h.remove(node.f118234a);
            Objects.requireNonNull(fVarRemove);
            fVarRemove.f118233c = 0;
            this.f118218j++;
        } else {
            f<K, V> fVar = this.f118216h.get(node.f118234a);
            Objects.requireNonNull(fVar);
            fVar.f118233c--;
            g<K, V> gVar3 = node.f118239f;
            if (gVar3 == null) {
                g<K, V> gVar4 = node.f118238e;
                Objects.requireNonNull(gVar4);
                fVar.f118231a = gVar4;
            } else {
                gVar3.f118238e = node.f118238e;
            }
            g<K, V> gVar5 = node.f118238e;
            if (gVar5 == null) {
                g<K, V> gVar6 = node.f118239f;
                Objects.requireNonNull(gVar6);
                fVar.f118232b = gVar6;
            } else {
                gVar5.f118239f = node.f118239f;
            }
        }
        this.f118217i--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        this.f118216h = f3.e0();
        int i10 = stream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            put(stream.readObject(), stream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @z7.a
    public g<K, V> u(@b9 K key, @b9 V value, @fj.a g<K, V> nextSibling) {
        g<K, V> gVar = new g<>(key, value);
        if (this.f118214f == null) {
            this.f118215g = gVar;
            this.f118214f = gVar;
            this.f118216h.put(key, new f<>(gVar));
            this.f118218j++;
        } else if (nextSibling == null) {
            g<K, V> gVar2 = this.f118215g;
            Objects.requireNonNull(gVar2);
            gVar2.f118236c = gVar;
            gVar.f118237d = this.f118215g;
            this.f118215g = gVar;
            f<K, V> fVar = this.f118216h.get(key);
            if (fVar == null) {
                this.f118216h.put(key, new f<>(gVar));
                this.f118218j++;
            } else {
                fVar.f118233c++;
                g<K, V> gVar3 = fVar.f118232b;
                gVar3.f118238e = gVar;
                gVar.f118239f = gVar3;
                fVar.f118232b = gVar;
            }
        } else {
            f<K, V> fVar2 = this.f118216h.get(key);
            Objects.requireNonNull(fVar2);
            fVar2.f118233c++;
            gVar.f118237d = nextSibling.f118237d;
            gVar.f118239f = nextSibling.f118239f;
            gVar.f118236c = nextSibling;
            gVar.f118238e = nextSibling;
            g<K, V> gVar4 = nextSibling.f118239f;
            if (gVar4 == null) {
                fVar2.f118231a = gVar;
            } else {
                gVar4.f118238e = gVar;
            }
            g<K, V> gVar5 = nextSibling.f118237d;
            if (gVar5 == null) {
                this.f118214f = gVar;
            } else {
                gVar5.f118236c = gVar;
            }
            nextSibling.f118237d = gVar;
            nextSibling.f118239f = gVar;
        }
        this.f118217i++;
        return gVar;
    }

    public static <K, V> v7<K, V> w() {
        return new v7<>();
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        for (Map.Entry<K, V> entry : u()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    public static <K, V> v7<K, V> x(int expectedKeys) {
        return new v7<>(expectedKeys);
    }

    public static <K, V> v7<K, V> y(k8<? extends K, ? extends V> multimap) {
        return new v7<>(multimap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public List<V> g() {
        return new d();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public List<Map.Entry<K, V>> u() {
        return (List) super.u();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public List<V> values() {
        return (List) super.values();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean I0(@fj.a Object key, @fj.a Object value) {
        return super.I0(key, value);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean R(k8 multimap) {
        return super.R(multimap);
    }

    @Override // com.google.common.collect.h
    Map<K, Collection<V>> a() {
        return new n8.a(this);
    }

    @Override // com.google.common.collect.k8
    public void clear() {
        this.f118214f = null;
        this.f118215g = null;
        this.f118216h.clear();
        this.f118217i = 0;
        this.f118218j++;
    }

    @Override // com.google.common.collect.k8
    public boolean containsKey(@fj.a Object key) {
        return this.f118216h.containsKey(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public boolean containsValue(@fj.a Object value) {
        return values().contains(value);
    }

    @Override // com.google.common.collect.h
    Set<K> e() {
        return new c();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    public /* bridge */ /* synthetic */ boolean equals(@fj.a Object object) {
        return super.equals(object);
    }

    @Override // com.google.common.collect.h
    q8<K> f() {
        return new n8.g(this);
    }

    @Override // com.google.common.collect.h
    Iterator<Map.Entry<K, V>> h() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public boolean isEmpty() {
        return this.f118214f == null;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ q8 keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    public /* bridge */ /* synthetic */ Map l() {
        return super.l();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public boolean put(@b9 K key, @b9 V value) {
        u(key, value, null);
        return true;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean remove(@fj.a Object key, @fj.a Object value) {
        return super.remove(key, value);
    }

    @Override // com.google.common.collect.k8
    public int size() {
        return this.f118217i;
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean v(@b9 Object key, Iterable values) {
        return super.v(key, values);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public List<Map.Entry<K, V>> b() {
        return new b();
    }

    private v7(int expectedKeys) {
        this.f118216h = d9.d(expectedKeys);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public List<V> c(@fj.a Object key) {
        List<V> listC = C(key);
        D(key);
        return listC;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public List<V> d(@b9 K key, Iterable<? extends V> values) {
        List<V> listC = C(key);
        i iVar = new i(key);
        Iterator<? extends V> it = values.iterator();
        while (iVar.hasNext() && it.hasNext()) {
            iVar.next();
            iVar.set(it.next());
        }
        while (iVar.hasNext()) {
            iVar.next();
            iVar.remove();
        }
        while (it.hasNext()) {
            iVar.add(it.next());
        }
        return listC;
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: get */
    public List<V> x(@b9 final K key) {
        return new a(this, key);
    }

    private class e implements Iterator<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Set<K> f118226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        g<K, V> f118227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        g<K, V> f118228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f118229d;

        private e() {
            this.f118226a = z9.y(v7.this.keySet().size());
            this.f118227b = v7.this.f118214f;
            this.f118229d = v7.this.f118218j;
        }

        private void b() {
            if (v7.this.f118218j != this.f118229d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f118227b != null;
        }

        @Override // java.util.Iterator
        @b9
        public K next() {
            g<K, V> gVar;
            b();
            g<K, V> gVar2 = this.f118227b;
            if (gVar2 == null) {
                throw new NoSuchElementException();
            }
            this.f118228c = gVar2;
            this.f118226a.add(gVar2.f118234a);
            do {
                gVar = this.f118227b.f118236c;
                this.f118227b = gVar;
                if (gVar == null) {
                    break;
                }
            } while (!this.f118226a.add(gVar.f118234a));
            return this.f118228c.f118234a;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            com.google.common.base.j0.h0(this.f118228c != null, "no calls to next() since the last call to remove()");
            v7.this.D(this.f118228c.f118234a);
            this.f118228c = null;
            this.f118229d = v7.this.f118218j;
        }

        /* synthetic */ e(v7 v7Var, a aVar) {
            this();
        }
    }

    private class i implements ListIterator<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        final K f118246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f118247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        g<K, V> f118248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        g<K, V> f118249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.a
        g<K, V> f118250e;

        i(K key) {
            this.f118246a = key;
            f fVar = (f) v7.this.f118216h.get(key);
            this.f118248c = fVar == null ? null : fVar.f118231a;
        }

        @Override // java.util.ListIterator
        public void add(@b9 V value) {
            this.f118250e = v7.this.u(this.f118246a, value, this.f118248c);
            this.f118247b++;
            this.f118249d = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f118248c != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f118250e != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @z7.a
        @b9
        public V next() {
            g<K, V> gVar = this.f118248c;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f118249d = gVar;
            this.f118250e = gVar;
            this.f118248c = gVar.f118238e;
            this.f118247b++;
            return gVar.f118235b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f118247b;
        }

        @Override // java.util.ListIterator
        @z7.a
        @b9
        public V previous() {
            g<K, V> gVar = this.f118250e;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f118249d = gVar;
            this.f118248c = gVar;
            this.f118250e = gVar.f118239f;
            this.f118247b--;
            return gVar.f118235b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f118247b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            com.google.common.base.j0.h0(this.f118249d != null, "no calls to next() since the last call to remove()");
            g<K, V> gVar = this.f118249d;
            if (gVar != this.f118248c) {
                this.f118250e = gVar.f118239f;
                this.f118247b--;
            } else {
                this.f118248c = gVar.f118238e;
            }
            v7.this.E(gVar);
            this.f118249d = null;
        }

        @Override // java.util.ListIterator
        public void set(@b9 V value) {
            com.google.common.base.j0.g0(this.f118249d != null);
            this.f118249d.f118235b = value;
        }

        public i(K key, int index) {
            f fVar = (f) v7.this.f118216h.get(key);
            int i10 = fVar == null ? 0 : fVar.f118233c;
            com.google.common.base.j0.d0(index, i10);
            if (index < i10 / 2) {
                this.f118248c = fVar == null ? null : fVar.f118231a;
                while (true) {
                    int i11 = index - 1;
                    if (index <= 0) {
                        break;
                    }
                    next();
                    index = i11;
                }
            } else {
                this.f118250e = fVar == null ? null : fVar.f118232b;
                this.f118247b = i10;
                while (true) {
                    int i12 = index + 1;
                    if (index >= i10) {
                        break;
                    }
                    previous();
                    index = i12;
                }
            }
            this.f118246a = key;
            this.f118249d = null;
        }
    }

    private v7(k8<? extends K, ? extends V> multimap) {
        this(multimap.keySet().size());
        R(multimap);
    }
}
