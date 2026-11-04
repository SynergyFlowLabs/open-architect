package com.google.android.gms.internal.auth;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
class v5 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f107858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f107859b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f107860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f107861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile t5 f107862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f107863f;

    /* synthetic */ v5(int i10, u5 u5Var) {
        this.f107858a = i10;
        Map map = Collections.EMPTY_MAP;
        this.f107860c = map;
        this.f107863f = map;
    }

    private final int k(Comparable comparable) {
        int size = this.f107859b.size();
        int i10 = size - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int iCompareTo = comparable.compareTo(((p5) this.f107859b.get(i10)).k());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int iCompareTo2 = comparable.compareTo(((p5) this.f107859b.get(i12)).k());
            if (iCompareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(int i10) {
        n();
        Object value = ((p5) this.f107859b.remove(i10)).getValue();
        if (!this.f107860c.isEmpty()) {
            Iterator it = m().entrySet().iterator();
            List list = this.f107859b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new p5(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap m() {
        n();
        if (this.f107860c.isEmpty() && !(this.f107860c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f107860c = treeMap;
            this.f107863f = treeMap.descendingMap();
        }
        return (SortedMap) this.f107860c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        if (this.f107861d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f107861d) {
            return;
        }
        this.f107860c = this.f107860c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f107860c);
        this.f107863f = this.f107863f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f107863f);
        this.f107861d = true;
    }

    public final int b() {
        return this.f107859b.size();
    }

    public final Iterable c() {
        return this.f107860c.isEmpty() ? o5.a() : this.f107860c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        if (!this.f107859b.isEmpty()) {
            this.f107859b.clear();
        }
        if (this.f107860c.isEmpty()) {
            return;
        }
        this.f107860c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return k(comparable) >= 0 || this.f107860c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        n();
        int iK = k(comparable);
        if (iK >= 0) {
            return ((p5) this.f107859b.get(iK)).setValue(obj);
        }
        n();
        if (this.f107859b.isEmpty() && !(this.f107859b instanceof ArrayList)) {
            this.f107859b = new ArrayList(this.f107858a);
        }
        int i10 = -(iK + 1);
        if (i10 >= this.f107858a) {
            return m().put(comparable, obj);
        }
        int size = this.f107859b.size();
        int i11 = this.f107858a;
        if (size == i11) {
            p5 p5Var = (p5) this.f107859b.remove(i11 - 1);
            m().put(p5Var.k(), p5Var.getValue());
        }
        this.f107859b.add(i10, new p5(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f107862e == null) {
            this.f107862e = new t5(this, null);
        }
        return this.f107862e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5)) {
            return super.equals(obj);
        }
        v5 v5Var = (v5) obj;
        int size = size();
        if (size != v5Var.size()) {
            return false;
        }
        int iB = b();
        if (iB != v5Var.b()) {
            return entrySet().equals(v5Var.entrySet());
        }
        for (int i10 = 0; i10 < iB; i10++) {
            if (!g(i10).equals(v5Var.g(i10))) {
                return false;
            }
        }
        if (iB != size) {
            return this.f107860c.equals(v5Var.f107860c);
        }
        return true;
    }

    public final Map.Entry g(int i10) {
        return (Map.Entry) this.f107859b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iK = k(comparable);
        return iK >= 0 ? ((p5) this.f107859b.get(iK)).getValue() : this.f107860c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            iHashCode += ((p5) this.f107859b.get(i10)).hashCode();
        }
        return this.f107860c.size() > 0 ? iHashCode + this.f107860c.hashCode() : iHashCode;
    }

    public final boolean j() {
        return this.f107861d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        n();
        Comparable comparable = (Comparable) obj;
        int iK = k(comparable);
        if (iK >= 0) {
            return l(iK);
        }
        if (this.f107860c.isEmpty()) {
            return null;
        }
        return this.f107860c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f107859b.size() + this.f107860c.size();
    }
}
