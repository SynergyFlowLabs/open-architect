package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
class u3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f50672g = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<u3<K, V>.d> f50673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<K, V> f50674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile u3<K, V>.f f50676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<K, V> f50677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile u3<K, V>.c f50678f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    class a<FieldDescriptorType> extends u3<FieldDescriptorType, Object> {
        a() {
            super(null);
        }

        @Override // androidx.datastore.preferences.protobuf.u3
        public void p() {
            if (!o()) {
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
            super.p();
        }

        @Override // androidx.datastore.preferences.protobuf.u3, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object key, Object value) {
            return super.put((Comparable) key, value);
        }
    }

    private class c extends u3<K, V>.f {
        private c() {
            super(u3.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.u3.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(u3.this, null);
        }

        /* synthetic */ c(u3 u3Var, a aVar) {
            this();
        }
    }

    private class d implements Map.Entry<K, V>, Comparable<u3<K, V>.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f50683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private V f50684b;

        d(final u3 this$0, Map.Entry<K, V> copy) {
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
        public int compareTo(u3<K, V>.d other) {
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
            return c(this.f50683a, entry.getKey()) && c(this.f50684b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f50684b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f50683a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f50684b;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f50683a;
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            u3.this.g();
            V v10 = this.f50684b;
            this.f50684b = newValue;
            return v10;
        }

        public String toString() {
            return this.f50683a + "=" + this.f50684b;
        }

        d(K key, V value) {
            this.f50683a = key;
            this.f50684b = value;
        }
    }

    private class f extends AbstractSet<Map.Entry<K, V>> {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            u3.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o10) {
            Map.Entry entry = (Map.Entry) o10;
            Object obj = u3.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj != value) {
                return obj != null && obj.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(u3.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o10) {
            Map.Entry entry = (Map.Entry) o10;
            if (!contains(entry)) {
                return false;
            }
            u3.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u3.this.size();
        }

        /* synthetic */ f(u3 u3Var, a aVar) {
            this();
        }
    }

    /* synthetic */ u3(a aVar) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0042 A[SYNTHETIC] */
    private int f(K key) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f50673a.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = key.compareTo(this.f50673a.get(i12).getKey());
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
            int iCompareTo2 = key.compareTo(this.f50673a.get(i13).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = key.compareTo(this.f50673a.get(i12).getKey());
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
        if (this.f50675c) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f50673a.isEmpty() || (this.f50673a instanceof ArrayList)) {
            return;
        }
        this.f50673a = new ArrayList(16);
    }

    private SortedMap<K, V> n() {
        g();
        if (this.f50674b.isEmpty() && !(this.f50674b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f50674b = treeMap;
            this.f50677e = treeMap.descendingMap();
        }
        return (SortedMap) this.f50674b;
    }

    static <FieldDescriptorType extends f1.c<FieldDescriptorType>> u3<FieldDescriptorType, Object> q() {
        return new a();
    }

    static <K extends Comparable<K>, V> u3<K, V> s() {
        return new u3<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V u(int index) {
        g();
        V value = this.f50673a.remove(index).getValue();
        if (!this.f50674b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            this.f50673a.add(new d(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f50673a.isEmpty()) {
            this.f50673a.clear();
        }
        if (this.f50674b.isEmpty()) {
            return;
        }
        this.f50674b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object o10) {
        Comparable comparable = (Comparable) o10;
        return f(comparable) >= 0 || this.f50674b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f50676d == null) {
            this.f50676d = new f(this, null);
        }
        return this.f50676d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof u3)) {
            return super.equals(o10);
        }
        u3 u3Var = (u3) o10;
        int size = size();
        if (size != u3Var.size()) {
            return false;
        }
        int iK = k();
        if (iK != u3Var.k()) {
            return entrySet().equals(u3Var.entrySet());
        }
        for (int i10 = 0; i10 < iK; i10++) {
            if (!j(i10).equals(u3Var.j(i10))) {
                return false;
            }
        }
        if (iK != size) {
            return this.f50674b.equals(u3Var.f50674b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object o10) {
        Comparable comparable = (Comparable) o10;
        int iF = f(comparable);
        return iF >= 0 ? this.f50673a.get(iF).getValue() : this.f50674b.get(comparable);
    }

    Set<Map.Entry<K, V>> h() {
        if (this.f50678f == null) {
            this.f50678f = new c(this, null);
        }
        return this.f50678f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            iHashCode += this.f50673a.get(i10).hashCode();
        }
        return l() > 0 ? iHashCode + this.f50674b.hashCode() : iHashCode;
    }

    public Map.Entry<K, V> j(int index) {
        return this.f50673a.get(index);
    }

    public int k() {
        return this.f50673a.size();
    }

    public int l() {
        return this.f50674b.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.f50674b.isEmpty() ? Collections.EMPTY_SET : this.f50674b.entrySet();
    }

    public boolean o() {
        return this.f50675c;
    }

    public void p() {
        if (this.f50675c) {
            return;
        }
        this.f50674b = this.f50674b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f50674b);
        this.f50677e = this.f50677e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f50677e);
        this.f50675c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object o10) {
        g();
        Comparable comparable = (Comparable) o10;
        int iF = f(comparable);
        if (iF >= 0) {
            return u(iF);
        }
        if (this.f50674b.isEmpty()) {
            return null;
        }
        return this.f50674b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f50673a.size() + this.f50674b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        g();
        int iF = f(k10);
        if (iF >= 0) {
            return this.f50673a.get(iF).setValue(v10);
        }
        i();
        int i10 = -(iF + 1);
        if (i10 >= 16) {
            return n().put(k10, v10);
        }
        if (this.f50673a.size() == 16) {
            u3<K, V>.d dVarRemove = this.f50673a.remove(15);
            n().put(dVarRemove.getKey(), dVarRemove.getValue());
        }
        this.f50673a.add(i10, new d(k10, v10));
        return null;
    }

    private class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f50680b;

        private b() {
            this.f50679a = u3.this.f50673a.size();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f50680b == null) {
                this.f50680b = u3.this.f50677e.entrySet().iterator();
            }
            return this.f50680b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (b().hasNext()) {
                return b().next();
            }
            List list = u3.this.f50673a;
            int i10 = this.f50679a - 1;
            this.f50679a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f50679a;
            return (i10 > 0 && i10 <= u3.this.f50673a.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(u3 u3Var, a aVar) {
            this();
        }
    }

    private class e implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f50687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f50688c;

        private e() {
            this.f50686a = -1;
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f50688c == null) {
                this.f50688c = u3.this.f50674b.entrySet().iterator();
            }
            return this.f50688c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f50687b = true;
            int i10 = this.f50686a + 1;
            this.f50686a = i10;
            return i10 < u3.this.f50673a.size() ? (Map.Entry) u3.this.f50673a.get(this.f50686a) : b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50686a + 1 < u3.this.f50673a.size() || (!u3.this.f50674b.isEmpty() && b().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f50687b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f50687b = false;
            u3.this.g();
            if (this.f50686a >= u3.this.f50673a.size()) {
                b().remove();
                return;
            }
            u3 u3Var = u3.this;
            int i10 = this.f50686a;
            this.f50686a = i10 - 1;
            u3Var.u(i10);
        }

        /* synthetic */ e(u3 u3Var, a aVar) {
            this();
        }
    }

    private u3() {
        this.f50673a = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f50674b = map;
        this.f50677e = map;
    }
}
