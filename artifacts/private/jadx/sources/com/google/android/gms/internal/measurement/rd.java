package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
class rd extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f108778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f108779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f108780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f108781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile qd f108782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f108783f;

    private rd() {
        Map map = Collections.EMPTY_MAP;
        this.f108780c = map;
        this.f108783f = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object g(int i10) {
        h();
        Object value = ((od) this.f108778a[i10]).getValue();
        Object[] objArr = this.f108778a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f108779b - i10) - 1);
        this.f108779b--;
        if (!this.f108780c.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            Object[] objArr2 = this.f108778a;
            int i11 = this.f108779b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new od(this, (Comparable) entry.getKey(), entry.getValue());
            this.f108779b++;
            it.remove();
        }
        return value;
    }

    private final int m(Comparable comparable) {
        int i10 = this.f108779b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((od) this.f108778a[i11]).k());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((od) this.f108778a[i13]).k());
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
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void h() {
        if (this.f108781d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap o() {
        h();
        if (this.f108780c.isEmpty() && !(this.f108780c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f108780c = treeMap;
            this.f108783f = treeMap.descendingMap();
        }
        return (SortedMap) this.f108780c;
    }

    public void a() {
        if (this.f108781d) {
            return;
        }
        this.f108780c = this.f108780c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f108780c);
        this.f108783f = this.f108783f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f108783f);
        this.f108781d = true;
    }

    public final boolean b() {
        return this.f108781d;
    }

    public final int c() {
        return this.f108779b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.f108779b != 0) {
            this.f108778a = null;
            this.f108779b = 0;
        }
        if (this.f108780c.isEmpty()) {
            return;
        }
        this.f108780c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m(comparable) >= 0 || this.f108780c.containsKey(comparable);
    }

    public final Map.Entry d(int i10) {
        if (i10 < this.f108779b) {
            return (od) this.f108778a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final Iterable e() {
        return this.f108780c.isEmpty() ? Collections.EMPTY_SET : this.f108780c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f108782e == null) {
            this.f108782e = new qd(this, null);
        }
        return this.f108782e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd)) {
            return super.equals(obj);
        }
        rd rdVar = (rd) obj;
        int size = size();
        if (size != rdVar.size()) {
            return false;
        }
        int i10 = this.f108779b;
        if (i10 != rdVar.f108779b) {
            return entrySet().equals(rdVar.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!d(i11).equals(rdVar.d(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f108780c.equals(rdVar.f108780c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int iM = m(comparable);
        if (iM >= 0) {
            return ((od) this.f108778a[iM]).setValue(obj);
        }
        h();
        if (this.f108778a == null) {
            this.f108778a = new Object[16];
        }
        int i10 = -(iM + 1);
        if (i10 >= 16) {
            return o().put(comparable, obj);
        }
        if (this.f108779b == 16) {
            od odVar = (od) this.f108778a[15];
            this.f108779b = 15;
            o().put(odVar.k(), odVar.getValue());
        }
        Object[] objArr = this.f108778a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f108778a[i10] = new od(this, comparable, obj);
        this.f108779b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        return iM >= 0 ? ((od) this.f108778a[iM]).getValue() : this.f108780c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f108779b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f108778a[i11].hashCode();
        }
        if (this.f108780c.size() > 0) {
            iHashCode += this.f108780c.hashCode();
        }
        return iHashCode;
    }

    final /* synthetic */ Object[] i() {
        return this.f108778a;
    }

    final /* synthetic */ int j() {
        return this.f108779b;
    }

    final /* synthetic */ Map k() {
        return this.f108780c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        if (iM >= 0) {
            return g(iM);
        }
        if (this.f108780c.isEmpty()) {
            return null;
        }
        return this.f108780c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f108779b + this.f108780c.size();
    }

    /* synthetic */ rd(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f108780c = map;
        this.f108783f = map;
    }
}
