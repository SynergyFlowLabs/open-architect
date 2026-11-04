package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
class b9 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f109059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f109060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f109061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f109062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile z8 f109063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f109064f;

    private b9() {
        Map map = Collections.EMPTY_MAP;
        this.f109061c = map;
        this.f109064f = map;
    }

    private final int l(Comparable comparable) {
        int i10 = this.f109060b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((x8) this.f109059a[i11]).k());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((x8) this.f109059a[i13]).k());
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(int i10) {
        o();
        Object value = ((x8) this.f109059a[i10]).getValue();
        Object[] objArr = this.f109059a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f109060b - i10) - 1);
        this.f109060b--;
        if (!this.f109061c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            Object[] objArr2 = this.f109059a;
            int i11 = this.f109060b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new x8(this, (Comparable) entry.getKey(), entry.getValue());
            this.f109060b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap n() {
        o();
        if (this.f109061c.isEmpty() && !(this.f109061c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f109061c = treeMap;
            this.f109064f = treeMap.descendingMap();
        }
        return (SortedMap) this.f109061c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.f109062d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (!this.f109062d) {
            this.f109061c = this.f109061c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f109061c);
            this.f109064f = this.f109064f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f109064f);
            this.f109062d = true;
        }
    }

    public final int c() {
        return this.f109060b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (this.f109060b != 0) {
            this.f109059a = null;
            this.f109060b = 0;
        }
        if (!this.f109061c.isEmpty()) {
            this.f109061c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f109061c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f109061c.isEmpty() ? Collections.EMPTY_SET : this.f109061c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f109063e == null) {
            this.f109063e = new z8(this, null);
        }
        return this.f109063e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9)) {
            return super.equals(obj);
        }
        b9 b9Var = (b9) obj;
        int size = size();
        if (size != b9Var.size()) {
            return false;
        }
        int i10 = this.f109060b;
        if (i10 != b9Var.f109060b) {
            return entrySet().equals(b9Var.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!g(i11).equals(b9Var.g(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f109061c.equals(b9Var.f109061c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int iL = l(comparable);
        if (iL >= 0) {
            return ((x8) this.f109059a[iL]).setValue(obj);
        }
        o();
        if (this.f109059a == null) {
            this.f109059a = new Object[16];
        }
        int i10 = -(iL + 1);
        if (i10 >= 16) {
            return n().put(comparable, obj);
        }
        if (this.f109060b == 16) {
            x8 x8Var = (x8) this.f109059a[15];
            this.f109060b = 15;
            n().put(x8Var.k(), x8Var.getValue());
        }
        Object[] objArr = this.f109059a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f109059a[i10] = new x8(this, comparable, obj);
        this.f109060b++;
        return null;
    }

    public final Map.Entry g(int i10) {
        if (i10 < this.f109060b) {
            return (x8) this.f109059a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? ((x8) this.f109059a[iL]).getValue() : this.f109061c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f109060b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f109059a[i11].hashCode();
        }
        return this.f109061c.size() > 0 ? iHashCode + this.f109061c.hashCode() : iHashCode;
    }

    public final boolean j() {
        return this.f109062d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return m(iL);
        }
        if (this.f109061c.isEmpty()) {
            return null;
        }
        return this.f109061c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f109060b + this.f109061c.size();
    }

    /* synthetic */ b9(a9 a9Var) {
        Map map = Collections.EMPTY_MAP;
        this.f109061c = map;
        this.f109064f = map;
    }
}
