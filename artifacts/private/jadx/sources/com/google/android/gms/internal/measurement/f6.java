package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f6 {
    public static void a(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void b(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void c(String str, int i10, List list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean d(p pVar) {
        if (pVar == null) {
            return false;
        }
        Double dM = pVar.m();
        return !dM.isNaN() && dM.doubleValue() >= 0.0d && dM.equals(Double.valueOf(Math.floor(dM.doubleValue())));
    }

    public static m0 e(String str) {
        m0 m0VarB = null;
        if (str != null && !str.isEmpty()) {
            m0VarB = m0.b(Integer.parseInt(str));
        }
        if (m0VarB != null) {
            return m0VarB;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static boolean f(p pVar, p pVar2) {
        if (!pVar.getClass().equals(pVar2.getClass())) {
            return false;
        }
        if ((pVar instanceof u) || (pVar instanceof n)) {
            return true;
        }
        if (pVar instanceof i) {
            if (Double.isNaN(pVar.m().doubleValue()) || Double.isNaN(pVar2.m().doubleValue())) {
                return false;
            }
            return pVar.m().equals(pVar2.m());
        }
        if (pVar instanceof t) {
            return pVar.h().equals(pVar2.h());
        }
        if (pVar instanceof g) {
            return pVar.j().equals(pVar2.j());
        }
        return pVar == pVar2;
    }

    public static int g(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static long h(double d10) {
        return ((long) g(d10)) & com.rabbitmq.client.k0.f265952a;
    }

    public static double i(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return ((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static Object j(p pVar) {
        if (p.T1.equals(pVar)) {
            return null;
        }
        if (p.S1.equals(pVar)) {
            return "";
        }
        if (pVar instanceof m) {
            return k((m) pVar);
        }
        if (!(pVar instanceof f)) {
            return !pVar.m().isNaN() ? pVar.m() : pVar.h();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((f) pVar).iterator();
        while (it.hasNext()) {
            Object objJ = j((p) it.next());
            if (objJ != null) {
                arrayList.add(objJ);
            }
        }
        return arrayList;
    }

    public static Map k(m mVar) {
        HashMap map = new HashMap();
        for (String str : mVar.a()) {
            Object objJ = j(mVar.i(str));
            if (objJ != null) {
                map.put(str, objJ);
            }
        }
        return map;
    }

    public static int l(e5 e5Var) {
        int iG = g(e5Var.h("runtime.counter").m().doubleValue() + 1.0d);
        if (iG > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        e5Var.e("runtime.counter", new i(Double.valueOf(iG)));
        return iG;
    }
}
