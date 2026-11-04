package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    final Map f108958a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final k0 f108959b = new k0();

    public x() {
        a(new v());
        a(new y());
        a(new z());
        a(new d0());
        a(new i0());
        a(new j0());
        a(new l0());
    }

    final void a(w wVar) {
        Iterator it = wVar.f108934a.iterator();
        while (it.hasNext()) {
            this.f108958a.put(((m0) it.next()).k().toString(), wVar);
        }
    }

    public final p b(e5 e5Var, p pVar) {
        f6.l(e5Var);
        if (!(pVar instanceof q)) {
            return pVar;
        }
        q qVar = (q) pVar;
        ArrayList arrayListB = qVar.b();
        String strA = qVar.a();
        Map map = this.f108958a;
        return (map.containsKey(strA) ? (w) map.get(strA) : this.f108959b).a(strA, e5Var, arrayListB);
    }
}
