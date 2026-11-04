package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j implements p, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f108574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Map f108575b = new HashMap();

    public j(String str) {
        this.f108574a = str;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public p Y() {
        return this;
    }

    public abstract p a(e5 e5Var, List list);

    public final String b() {
        return this.f108574a;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Iterator c() {
        return l.k(this.f108575b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.f108574a;
        if (str != null) {
            return str.equals(jVar.f108574a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final String h() {
        return this.f108574a;
    }

    public final int hashCode() {
        String str = this.f108574a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final p i(String str) {
        Map map = this.f108575b;
        return map.containsKey(str) ? (p) map.get(str) : p.S1;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Boolean j() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final boolean l(String str) {
        return this.f108575b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Double m() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final void n(String str, p pVar) {
        Map map = this.f108575b;
        if (pVar == null) {
            map.remove(str);
        } else {
            map.put(str, pVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p p(String str, e5 e5Var, List list) {
        return "toString".equals(str) ? new t(this.f108574a) : l.d(this, new t(str), e5Var, list);
    }
}
