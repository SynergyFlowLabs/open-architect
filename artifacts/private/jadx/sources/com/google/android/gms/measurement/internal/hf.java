package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f110061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f110062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.p7 f110063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BitSet f110064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BitSet f110065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f110066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f110067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ e f110068h;

    /* synthetic */ hf(e eVar, String str, com.google.android.gms.internal.measurement.p7 p7Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.f110068h = eVar;
        this.f110061a = str;
        this.f110064d = bitSet;
        this.f110065e = bitSet2;
        this.f110066f = map;
        this.f110067g = new androidx.collection.a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f110067g.put(num, arrayList);
        }
        this.f110062b = false;
        this.f110063c = p7Var;
    }

    final void a(@NonNull c cVar) {
        int iA = cVar.a();
        if (cVar.f109802c != null) {
            this.f110065e.set(iA, true);
        }
        Boolean bool = cVar.f109803d;
        if (bool != null) {
            this.f110064d.set(iA, bool.booleanValue());
        }
        if (cVar.f109804e != null) {
            Map map = this.f110066f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l10 = (Long) map.get(numValueOf);
            long jLongValue = cVar.f109804e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                this.f110066f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (cVar.f109805f != null) {
            Map map2 = this.f110067g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f110067g.put(numValueOf2, arrayList);
            }
            if (cVar.b()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.jf.a();
            h7 h7Var = this.f110068h.f110184a;
            k kVarW = h7Var.w();
            String str = this.f110061a;
            y4 y4Var = z4.G0;
            if (kVarW.H(str, y4Var) && cVar.c()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.jf.a();
            if (h7Var.w().H(this.f110061a, y4Var)) {
                Long lValueOf = Long.valueOf(cVar.f109805f.longValue() / 1000);
                if (!arrayList.contains(lValueOf)) {
                    arrayList.add(lValueOf);
                }
            } else {
                arrayList.add(Long.valueOf(cVar.f109805f.longValue() / 1000));
            }
        }
    }

    @NonNull
    final com.google.android.gms.internal.measurement.m6 b(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.l6 l6VarL = com.google.android.gms.internal.measurement.m6.L();
        l6VarL.u(i10);
        l6VarL.x(this.f110062b);
        com.google.android.gms.internal.measurement.p7 p7Var = this.f110063c;
        if (p7Var != null) {
            l6VarL.w(p7Var);
        }
        com.google.android.gms.internal.measurement.o7 o7VarM = com.google.android.gms.internal.measurement.p7.M();
        o7VarM.w(ve.Q(this.f110064d));
        o7VarM.u(ve.Q(this.f110065e));
        Map map = this.f110066f;
        if (map == null) {
            arrayList = null;
            int i11 = 2 << 0;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f110066f.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = (Long) this.f110066f.get(num);
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.v6 v6VarI = com.google.android.gms.internal.measurement.w6.I();
                    v6VarI.u(iIntValue);
                    v6VarI.v(l10.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.w6) v6VarI.r());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            o7VarM.z(arrayList);
        }
        Map map2 = this.f110067g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f110067g.keySet()) {
                com.google.android.gms.internal.measurement.q7 q7VarJ = com.google.android.gms.internal.measurement.r7.J();
                q7VarJ.u(num2.intValue());
                List list2 = (List) this.f110067g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    q7VarJ.v(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.r7) q7VarJ.r());
            }
            list = arrayList3;
        }
        o7VarM.B(list);
        l6VarL.v(o7VarM);
        return (com.google.android.gms.internal.measurement.m6) l6VarL.r();
    }

    final /* synthetic */ BitSet c() {
        return this.f110064d;
    }

    /* synthetic */ hf(e eVar, String str, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.f110068h = eVar;
        this.f110061a = str;
        this.f110062b = true;
        this.f110064d = new BitSet();
        this.f110065e = new BitSet();
        this.f110066f = new androidx.collection.a();
        this.f110067g = new androidx.collection.a();
    }
}
