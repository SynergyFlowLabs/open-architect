package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class m implements p, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    final Map f108629a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.p
    public final p Y() {
        m mVar = new m();
        for (Map.Entry entry : this.f108629a.entrySet()) {
            if (entry.getValue() instanceof l) {
                mVar.f108629a.put((String) entry.getKey(), (p) entry.getValue());
            } else {
                mVar.f108629a.put((String) entry.getKey(), ((p) entry.getValue()).Y());
            }
        }
        return mVar;
    }

    public final List a() {
        return new ArrayList(this.f108629a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Iterator c() {
        return l.k(this.f108629a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.f108629a.equals(((m) obj).f108629a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final String h() {
        return "[object Object]";
    }

    public final int hashCode() {
        return this.f108629a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final p i(String str) {
        Map map = this.f108629a;
        return map.containsKey(str) ? (p) map.get(str) : p.S1;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Boolean j() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final boolean l(String str) {
        return this.f108629a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Double m() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final void n(String str, p pVar) {
        Map map = this.f108629a;
        if (pVar == null) {
            map.remove(str);
        } else {
            map.put(str, pVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p
    public p p(String str, e5 e5Var, List list) {
        return "toString".equals(str) ? new t(toString()) : l.d(this, new t(str), e5Var, list);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        Map map = this.f108629a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
