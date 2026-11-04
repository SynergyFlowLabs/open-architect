package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends j implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.common.annotations.e
    protected final List f108702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.google.common.annotations.e
    protected final List f108703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.google.common.annotations.e
    protected e5 f108704e;

    private o(o oVar) {
        super(oVar.f108574a);
        ArrayList arrayList = new ArrayList(oVar.f108702c.size());
        this.f108702c = arrayList;
        arrayList.addAll(oVar.f108702c);
        ArrayList arrayList2 = new ArrayList(oVar.f108703d.size());
        this.f108703d = arrayList2;
        arrayList2.addAll(oVar.f108703d);
        this.f108704e = oVar.f108704e;
    }

    @Override // com.google.android.gms.internal.measurement.j, com.google.android.gms.internal.measurement.p
    public final p Y() {
        return new o(this);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final p a(e5 e5Var, List list) {
        e5 e5VarC = this.f108704e.c();
        int i10 = 0;
        while (true) {
            List list2 = this.f108702c;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                e5VarC.f((String) list2.get(i10), e5Var.a((p) list.get(i10)));
            } else {
                e5VarC.f((String) list2.get(i10), p.S1);
            }
            i10++;
        }
        for (p pVar : this.f108703d) {
            p pVarA = e5VarC.a(pVar);
            if (pVarA instanceof q) {
                pVarA = e5VarC.a(pVar);
            }
            if (pVarA instanceof h) {
                return ((h) pVarA).a();
            }
        }
        return p.S1;
    }

    public o(String str, List list, List list2, e5 e5Var) {
        super(str);
        this.f108702c = new ArrayList();
        this.f108704e = e5Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f108702c.add(((p) it.next()).h());
            }
        }
        this.f108703d = new ArrayList(list2);
    }
}
