package com.google.android.gms.internal.measurement;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Iterable, p, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    final SortedMap f108402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    final Map f108403b;

    public f() {
        this.f108402a = new TreeMap();
        this.f108403b = new TreeMap();
    }

    public final boolean A(int i10) {
        if (i10 >= 0) {
            SortedMap sortedMap = this.f108402a;
            if (i10 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i10));
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final void B() {
        this.f108402a.clear();
    }

    public final void C(int i10, p pVar) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Invalid value index: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 >= t()) {
            w(i10, pVar);
            return;
        }
        SortedMap sortedMap = this.f108402a;
        for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i10; iIntValue--) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            p pVar2 = (p) sortedMap.get(numValueOf);
            if (pVar2 != null) {
                w(iIntValue + 1, pVar2);
                sortedMap.remove(numValueOf);
            }
        }
        w(i10, pVar);
    }

    public final void D(int i10) {
        SortedMap sortedMap = this.f108402a;
        int iIntValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i10 <= iIntValue && i10 >= 0) {
            sortedMap.remove(Integer.valueOf(i10));
            if (i10 != iIntValue) {
                while (true) {
                    i10++;
                    if (i10 > ((Integer) sortedMap.lastKey()).intValue()) {
                        break;
                    }
                    Integer numValueOf = Integer.valueOf(i10);
                    p pVar = (p) sortedMap.get(numValueOf);
                    if (pVar != null) {
                        sortedMap.put(Integer.valueOf(i10 - 1), pVar);
                        sortedMap.remove(numValueOf);
                    }
                }
            } else {
                int i11 = i10 - 1;
                Integer numValueOf2 = Integer.valueOf(i11);
                if (!sortedMap.containsKey(numValueOf2) && i11 >= 0) {
                    sortedMap.put(numValueOf2, p.S1);
                }
            }
        }
    }

    public final String F(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f108402a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= t()) {
                    break;
                }
                p pVarV = v(i10);
                sb2.append(str2);
                if (!(pVarV instanceof u) && !(pVarV instanceof n)) {
                    sb2.append(pVarV.h());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p Y() {
        f fVar = new f();
        for (Map.Entry entry : this.f108402a.entrySet()) {
            if (entry.getValue() instanceof l) {
                fVar.f108402a.put((Integer) entry.getKey(), (p) entry.getValue());
            } else {
                fVar.f108402a.put((Integer) entry.getKey(), ((p) entry.getValue()).Y());
            }
        }
        return fVar;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Iterator c() {
        return new d(this, this.f108402a.keySet().iterator(), this.f108403b.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (t() != fVar.t()) {
            return false;
        }
        SortedMap sortedMap = this.f108402a;
        if (sortedMap.isEmpty()) {
            return fVar.f108402a.isEmpty();
        }
        for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
            if (!v(iIntValue).equals(fVar.v(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final String h() {
        return F(",");
    }

    public final int hashCode() {
        return this.f108402a.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final p i(String str) {
        p pVar;
        if (io.sentry.n7.b.f305917e.equals(str)) {
            return new i(Double.valueOf(t()));
        }
        return (!l(str) || (pVar = (p) this.f108403b.get(str)) == null) ? p.S1 : pVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Boolean j() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final boolean l(String str) {
        return io.sentry.n7.b.f305917e.equals(str) || this.f108403b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Double m() {
        SortedMap sortedMap = this.f108402a;
        if (sortedMap.size() == 1) {
            return v(0).m();
        }
        return sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final void n(String str, p pVar) {
        Map map = this.f108403b;
        if (pVar == null) {
            map.remove(str);
        } else {
            map.put(str, pVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p p(String str, e5 e5Var, List list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !MetricTracker.Place.PUSH.equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return l.d(this, new t(str), e5Var, list);
        }
        return c0.a(str, this, e5Var, list);
    }

    public final List r() {
        ArrayList arrayList = new ArrayList(t());
        for (int i10 = 0; i10 < t(); i10++) {
            arrayList.add(v(i10));
        }
        return arrayList;
    }

    public final Iterator s() {
        return this.f108402a.keySet().iterator();
    }

    public final int t() {
        SortedMap sortedMap = this.f108402a;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final String toString() {
        return F(",");
    }

    public final int u() {
        return this.f108402a.size();
    }

    public final p v(int i10) {
        p pVar;
        if (i10 < t()) {
            return (!A(i10) || (pVar = (p) this.f108402a.get(Integer.valueOf(i10))) == null) ? p.S1 : pVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @il.m({"elements"})
    public final void w(int i10, p pVar) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Out of bounds index: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (pVar == null) {
            this.f108402a.remove(Integer.valueOf(i10));
        } else {
            this.f108402a.put(Integer.valueOf(i10), pVar);
        }
    }

    public f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                w(i10, (p) list.get(i10));
            }
        }
    }
}
