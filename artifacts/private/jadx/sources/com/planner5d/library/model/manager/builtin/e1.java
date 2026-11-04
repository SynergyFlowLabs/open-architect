package com.planner5d.library.model.manager.builtin;

import androidx.annotation.m1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f180967a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, ? extends String> f180968b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.manager.y0> f180969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fg.e<i> f180970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fg.e<n> f180971e;

    public e1(fg.e<com.planner5d.library.model.manager.y0> eVar, fg.e<i> eVar2, fg.e<n> eVar3) {
        this.f180969c = eVar;
        this.f180970d = eVar2;
        this.f180971e = eVar3;
    }

    @fj.h
    private d1 b(String str) {
        d1 d1Var;
        synchronized (this.f180967a) {
            if (str == null) {
                d1Var = null;
            } else {
                try {
                    d1Var = new d1(str, this.f180968b.get(str));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return d1Var;
    }

    private com.planner5d.library.services.download.g[] f(com.planner5d.library.model.d dVar, d1 d1Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(d1Var.d(dVar, true)));
        arrayList.addAll(Arrays.asList(d1Var.d(dVar, false)));
        return (com.planner5d.library.services.download.g[]) arrayList.toArray(new com.planner5d.library.services.download.g[0]);
    }

    @m1
    private boolean h(com.planner5d.library.services.download.g[] gVarArr, d1 d1Var) {
        return (gVarArr == null || d1Var == null || !this.f180969c.get().o(gVarArr, d1Var.a())) ? false : true;
    }

    @fj.h
    public d1 a(com.planner5d.library.model.p pVar, com.planner5d.library.model.p.a aVar, com.planner5d.library.model.p.b bVar) {
        com.planner5d.library.model.p.c cVarB;
        if (pVar == null || (cVarB = pVar.b(aVar)) == null || cVarB.f222458a == null) {
            return null;
        }
        return b(pVar.d(cVarB, bVar));
    }

    @fj.h
    @m1
    public String c(com.planner5d.library.model.p pVar, com.planner5d.library.model.p.a aVar, com.planner5d.library.model.p.b bVar) {
        d1 d1VarA = a(pVar, aVar, bVar);
        if (d1VarA == null) {
            return null;
        }
        String strA = d1VarA.a();
        if (strA == null) {
            strA = this.f180970d.get().T(d1VarA.c(), i.a.BuiltIn);
        }
        if (this.f180971e.get().q(d1VarA.c(), strA) || strA == null) {
            return d1VarA.c();
        }
        return null;
    }

    @fj.h
    public com.planner5d.library.services.download.g[] d(com.planner5d.library.model.d dVar, com.planner5d.library.model.p pVar, com.planner5d.library.model.p.a aVar, com.planner5d.library.model.p.b bVar) {
        d1 d1VarA;
        LinkedList linkedList = new LinkedList();
        d1 d1VarA2 = a(pVar, aVar, bVar);
        if (d1VarA2 != null) {
            Collections.addAll(linkedList, f(dVar, d1VarA2));
        }
        for (com.planner5d.library.model.p.b bVar2 : com.planner5d.library.model.p.b.values()) {
            if (bVar != bVar2 && (d1VarA = a(pVar, aVar, bVar2)) != null) {
                Collections.addAll(linkedList, f(dVar, d1VarA));
            }
        }
        return (com.planner5d.library.services.download.g[]) linkedList.toArray(new com.planner5d.library.services.download.g[0]);
    }

    @fj.h
    public com.planner5d.library.services.download.g[] e(com.planner5d.library.model.d dVar, String str) {
        d1 d1VarB = b(str);
        if (d1VarB == null) {
            return null;
        }
        return d1VarB.d(dVar, false);
    }

    @m1
    public boolean g(com.planner5d.library.model.d dVar, com.planner5d.library.model.p pVar, com.planner5d.library.model.p.a aVar, com.planner5d.library.model.p.b bVar) {
        d1 d1VarA = a(pVar, aVar, bVar);
        if (d1VarA != null) {
            int i10 = 7 & 1;
            if (h(d1VarA.d(dVar, false), d1VarA) || h(d1VarA.d(dVar, true), d1VarA)) {
                return true;
            }
        }
        return false;
    }

    public void i(Map<String, ? extends String> map) {
        synchronized (this.f180967a) {
            try {
                this.f180968b = map;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
