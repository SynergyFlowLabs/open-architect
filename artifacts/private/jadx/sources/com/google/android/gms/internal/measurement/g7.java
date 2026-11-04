package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class g7 {
    public static p a(Object obj) {
        if (obj == null) {
            return p.T1;
        }
        if (obj instanceof String) {
            return new t((String) obj);
        }
        if (obj instanceof Double) {
            return new i((Double) obj);
        }
        if (obj instanceof Long) {
            return new i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            f fVar = new f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                fVar.w(fVar.t(), a(it.next()));
            }
            return fVar;
        }
        m mVar = new m();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            p pVarA = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                mVar.n((String) string, pVarA);
            }
        }
        return mVar;
    }

    public static p b(m8 m8Var) {
        if (m8Var == null) {
            return p.S1;
        }
        int iN = m8Var.N() - 1;
        if (iN == 1) {
            return m8Var.G() ? new t(m8Var.H()) : p.Z1;
        }
        int i10 = 1 >> 2;
        if (iN == 2) {
            return m8Var.K() ? new i(Double.valueOf(m8Var.L())) : new i(null);
        }
        if (iN == 3) {
            return m8Var.I() ? new g(Boolean.valueOf(m8Var.J())) : new g(null);
        }
        if (iN != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listE = m8Var.E();
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(b((m8) it.next()));
        }
        return new q(m8Var.F(), arrayList);
    }
}
