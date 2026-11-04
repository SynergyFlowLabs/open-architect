package com.google.vr.sdk.deps;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
class n5<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f129496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<u5> f129497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<K, V> f129498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f129499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile w5 f129500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<K, V> f129501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile q5 f129502g;

    private n5(int i10) {
        this.f129496a = i10;
        this.f129497b = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f129498c = map;
        this.f129501f = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0049 A[SYNTHETIC] */
    private final int a(K k10) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f129497b.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = k10.compareTo(this.f129497b.get(i12).k());
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
            int iCompareTo2 = k10.compareTo(this.f129497b.get(i13).k());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = k10.compareTo(this.f129497b.get(i12).k());
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

    static <FieldDescriptorType extends b3<FieldDescriptorType>> n5<FieldDescriptorType, Object> b(int i10) {
        return new o5(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V k(int i10) {
        p();
        V v10 = (V) this.f129497b.remove(i10).getValue();
        if (!this.f129498c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = q().entrySet().iterator();
            this.f129497b.add(new u5(this, it.next()));
            it.remove();
        }
        return v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        if (this.f129499d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> q() {
        p();
        if (this.f129498c.isEmpty() && !(this.f129498c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f129498c = treeMap;
            this.f129501f = treeMap.descendingMap();
        }
        return (SortedMap) this.f129498c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        p();
        if (!this.f129497b.isEmpty()) {
            this.f129497b.clear();
        }
        if (!this.f129498c.isEmpty()) {
            this.f129498c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f129498c.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        p();
        int iA = a(k10);
        if (iA >= 0) {
            return (V) this.f129497b.get(iA).setValue(v10);
        }
        p();
        if (this.f129497b.isEmpty() && !(this.f129497b instanceof ArrayList)) {
            this.f129497b = new ArrayList(this.f129496a);
        }
        int i10 = -(iA + 1);
        if (i10 >= this.f129496a) {
            return q().put(k10, v10);
        }
        int size = this.f129497b.size();
        int i11 = this.f129496a;
        if (size == i11) {
            u5 u5VarRemove = this.f129497b.remove(i11 - 1);
            q().put(u5VarRemove.k(), u5VarRemove.getValue());
        }
        this.f129497b.add(i10, new u5(this, k10, v10));
        return null;
    }

    public void e() {
        if (this.f129499d) {
            return;
        }
        this.f129498c = this.f129498c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f129498c);
        this.f129501f = this.f129501f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f129501f);
        this.f129499d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f129500e == null) {
            this.f129500e = new w5(this, (byte) 0);
        }
        return this.f129500e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return super.equals(obj);
        }
        n5 n5Var = (n5) obj;
        int size = size();
        if (size != n5Var.size()) {
            return false;
        }
        int iJ = j();
        if (iJ != n5Var.j()) {
            return entrySet().equals(n5Var.entrySet());
        }
        for (int i10 = 0; i10 < iJ; i10++) {
            if (!h(i10).equals(n5Var.h(i10))) {
                return false;
            }
        }
        if (iJ != size) {
            return this.f129498c.equals(n5Var.f129498c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? (V) this.f129497b.get(iA).getValue() : this.f129498c.get(comparable);
    }

    public final Map.Entry<K, V> h(int i10) {
        return this.f129497b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iJ = j();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iJ; i10++) {
            iHashCode += this.f129497b.get(i10).hashCode();
        }
        return this.f129498c.size() > 0 ? iHashCode + this.f129498c.hashCode() : iHashCode;
    }

    public final boolean i() {
        return this.f129499d;
    }

    public final int j() {
        return this.f129497b.size();
    }

    public final Iterable<Map.Entry<K, V>> m() {
        return this.f129498c.isEmpty() ? r5.a() : this.f129498c.entrySet();
    }

    final Set<Map.Entry<K, V>> o() {
        if (this.f129502g == null) {
            this.f129502g = new q5(this, (byte) 0);
        }
        return this.f129502g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return k(iA);
        }
        if (this.f129498c.isEmpty()) {
            return null;
        }
        return this.f129498c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f129497b.size() + this.f129498c.size();
    }

    /* synthetic */ n5(int i10, byte b10) {
        this(i10);
    }
}
