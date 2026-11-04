package com.google.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
class r3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f126290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<r3<K, V>.e> f126291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<K, V> f126292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f126293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile r3<K, V>.g f126294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<K, V> f126295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile r3<K, V>.c f126296g;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    class a<FieldDescriptorType> extends r3<FieldDescriptorType, Object> {
        a(int arraySize) {
            super(arraySize, null);
        }

        @Override // com.google.protobuf.r3, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object key, Object value) {
            return super.put((Comparable) key, value);
        }

        @Override // com.google.protobuf.r3
        public void q() {
            if (!p()) {
                for (int i10 = 0; i10 < k(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryJ = j(i10);
                    if (((f1.c) entryJ.getKey()).F()) {
                        entryJ.setValue(Collections.unmodifiableList((List) entryJ.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m()) {
                    if (((f1.c) entry.getKey()).F()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    private class c extends r3<K, V>.g {
        private c() {
            super(r3.this, null);
        }

        @Override // com.google.protobuf.r3.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(r3.this, null);
        }

        /* synthetic */ c(r3 r3Var, a aVar) {
            this();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f126301a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f126302b = new b();

        class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f126301a;
            }
        }

        private d() {
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f126302b;
        }
    }

    private class e implements Map.Entry<K, V>, Comparable<r3<K, V>.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f126303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private V f126304b;

        e(final r3 this$0, Map.Entry<K, V> copy) {
            this(copy.getKey(), copy.getValue());
        }

        private boolean c(Object o10, Object o11) {
            if (o10 == null) {
                return o11 == null;
            }
            return o10.equals(o11);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(r3<K, V>.e other) {
            return getKey().compareTo(other.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object o10) {
            if (o10 == this) {
                return true;
            }
            if (!(o10 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o10;
            return c(this.f126303a, entry.getKey()) && c(this.f126304b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f126304b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f126303a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f126304b;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f126303a;
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            r3.this.g();
            V v10 = this.f126304b;
            this.f126304b = newValue;
            return v10;
        }

        public String toString() {
            return this.f126303a + "=" + this.f126304b;
        }

        e(K key, V value) {
            this.f126303a = key;
            this.f126304b = value;
        }
    }

    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            r3.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            r3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o10) {
            Map.Entry entry = (Map.Entry) o10;
            Object obj = r3.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj == value || (obj != null && obj.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(r3.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o10) {
            Map.Entry entry = (Map.Entry) o10;
            if (!contains(entry)) {
                return false;
            }
            r3.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return r3.this.size();
        }

        /* synthetic */ g(r3 r3Var, a aVar) {
            this();
        }
    }

    /* synthetic */ r3(int i10, a aVar) {
        this(i10);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0049 A[SYNTHETIC] */
    private int f(K key) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f126291b.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = key.compareTo(this.f126291b.get(i12).getKey());
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = key.compareTo(this.f126291b.get(i13).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = key.compareTo(this.f126291b.get(i12).getKey());
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f126293d) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f126291b.isEmpty() || (this.f126291b instanceof ArrayList)) {
            return;
        }
        this.f126291b = new ArrayList(this.f126290a);
    }

    private SortedMap<K, V> o() {
        g();
        if (this.f126292c.isEmpty() && !(this.f126292c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f126292c = treeMap;
            this.f126295f = treeMap.descendingMap();
        }
        return (SortedMap) this.f126292c;
    }

    static <FieldDescriptorType extends f1.c<FieldDescriptorType>> r3<FieldDescriptorType, Object> s(int arraySize) {
        return new a(arraySize);
    }

    static <K extends Comparable<K>, V> r3<K, V> t(int arraySize) {
        return new r3<>(arraySize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V v(int index) {
        g();
        V value = this.f126291b.remove(index).getValue();
        if (!this.f126292c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.f126291b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f126291b.isEmpty()) {
            this.f126291b.clear();
        }
        if (this.f126292c.isEmpty()) {
            return;
        }
        this.f126292c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object o10) {
        Comparable comparable = (Comparable) o10;
        return f(comparable) >= 0 || this.f126292c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f126294e == null) {
            this.f126294e = new g(this, null);
        }
        return this.f126294e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof r3)) {
            return super.equals(o10);
        }
        r3 r3Var = (r3) o10;
        int size = size();
        if (size != r3Var.size()) {
            return false;
        }
        int iK = k();
        if (iK != r3Var.k()) {
            return entrySet().equals(r3Var.entrySet());
        }
        for (int i10 = 0; i10 < iK; i10++) {
            if (!j(i10).equals(r3Var.j(i10))) {
                return false;
            }
        }
        if (iK != size) {
            return this.f126292c.equals(r3Var.f126292c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object o10) {
        Comparable comparable = (Comparable) o10;
        int iF = f(comparable);
        return iF >= 0 ? this.f126291b.get(iF).getValue() : this.f126292c.get(comparable);
    }

    Set<Map.Entry<K, V>> h() {
        if (this.f126296g == null) {
            int i10 = 7 << 0;
            this.f126296g = new c(this, null);
        }
        return this.f126296g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            iHashCode += this.f126291b.get(i10).hashCode();
        }
        return l() > 0 ? iHashCode + this.f126292c.hashCode() : iHashCode;
    }

    public Map.Entry<K, V> j(int index) {
        return this.f126291b.get(index);
    }

    public int k() {
        return this.f126291b.size();
    }

    public int l() {
        return this.f126292c.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.f126292c.isEmpty() ? d.b() : this.f126292c.entrySet();
    }

    Iterable<Map.Entry<K, V>> n() {
        return this.f126295f.isEmpty() ? d.b() : this.f126295f.entrySet();
    }

    public boolean p() {
        return this.f126293d;
    }

    public void q() {
        if (this.f126293d) {
            return;
        }
        this.f126292c = this.f126292c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f126292c);
        this.f126295f = this.f126295f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f126295f);
        this.f126293d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object o10) {
        g();
        Comparable comparable = (Comparable) o10;
        int iF = f(comparable);
        if (iF >= 0) {
            return v(iF);
        }
        if (this.f126292c.isEmpty()) {
            return null;
        }
        return this.f126292c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f126291b.size() + this.f126292c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        g();
        int iF = f(k10);
        if (iF >= 0) {
            return this.f126291b.get(iF).setValue(v10);
        }
        i();
        int i10 = -(iF + 1);
        if (i10 >= this.f126290a) {
            return o().put(k10, v10);
        }
        int size = this.f126291b.size();
        int i11 = this.f126290a;
        if (size == i11) {
            r3<K, V>.e eVarRemove = this.f126291b.remove(i11 - 1);
            o().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.f126291b.add(i10, new e(k10, v10));
        return null;
    }

    private class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f126297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f126298b;

        private b() {
            this.f126297a = r3.this.f126291b.size();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f126298b == null) {
                this.f126298b = r3.this.f126295f.entrySet().iterator();
            }
            return this.f126298b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (b().hasNext()) {
                return b().next();
            }
            List list = r3.this.f126291b;
            int i10 = this.f126297a - 1;
            this.f126297a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f126297a;
            return (i10 > 0 && i10 <= r3.this.f126291b.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(r3 r3Var, a aVar) {
            this();
        }
    }

    private class f implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f126306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f126307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f126308c;

        private f() {
            this.f126306a = -1;
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f126308c == null) {
                this.f126308c = r3.this.f126292c.entrySet().iterator();
            }
            return this.f126308c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f126307b = true;
            int i10 = this.f126306a + 1;
            this.f126306a = i10;
            return i10 < r3.this.f126291b.size() ? (Map.Entry) r3.this.f126291b.get(this.f126306a) : b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f126306a + 1 < r3.this.f126291b.size() || (!r3.this.f126292c.isEmpty() && b().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f126307b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f126307b = false;
            r3.this.g();
            if (this.f126306a >= r3.this.f126291b.size()) {
                b().remove();
                return;
            }
            r3 r3Var = r3.this;
            int i10 = this.f126306a;
            this.f126306a = i10 - 1;
            r3Var.v(i10);
        }

        /* synthetic */ f(r3 r3Var, a aVar) {
            this();
        }
    }

    private r3(int arraySize) {
        this.f126290a = arraySize;
        this.f126291b = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f126292c = map;
        this.f126295f = map;
    }
}
