package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    public final e5 f108384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    final x f108385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.common.annotations.e
    final Map f108386c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.google.common.annotations.e
    final Map f108387d = new HashMap();

    public e5(e5 e5Var, x xVar) {
        this.f108384a = e5Var;
        this.f108385b = xVar;
    }

    public final p a(p pVar) {
        return this.f108385b.b(this, pVar);
    }

    public final p b(f fVar) {
        p pVarB = p.S1;
        Iterator itS = fVar.s();
        while (itS.hasNext()) {
            pVarB = this.f108385b.b(this, fVar.v(((Integer) itS.next()).intValue()));
            if (pVarB instanceof h) {
                break;
            }
        }
        return pVarB;
    }

    public final e5 c() {
        return new e5(this, this.f108385b);
    }

    public final boolean d(String str) {
        if (this.f108386c.containsKey(str)) {
            return true;
        }
        e5 e5Var = this.f108384a;
        if (e5Var != null) {
            return e5Var.d(str);
        }
        return false;
    }

    public final void e(String str, p pVar) {
        e5 e5Var;
        Map map = this.f108386c;
        if (!map.containsKey(str) && (e5Var = this.f108384a) != null && e5Var.d(str)) {
            e5Var.e(str, pVar);
            return;
        }
        if (this.f108387d.containsKey(str)) {
            return;
        }
        if (pVar == null) {
            map.remove(str);
        } else {
            map.put(str, pVar);
        }
    }

    public final void f(String str, p pVar) {
        if (this.f108387d.containsKey(str)) {
            return;
        }
        if (pVar == null) {
            this.f108386c.remove(str);
        } else {
            this.f108386c.put(str, pVar);
        }
    }

    public final void g(String str, p pVar) {
        f(str, pVar);
        this.f108387d.put(str, Boolean.TRUE);
    }

    public final p h(String str) {
        Map map = this.f108386c;
        if (map.containsKey(str)) {
            return (p) map.get(str);
        }
        e5 e5Var = this.f108384a;
        if (e5Var != null) {
            return e5Var.h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }
}
