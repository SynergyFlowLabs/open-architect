package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final class a0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f108272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e5 f108273b;

    a0(j jVar, e5 e5Var) {
        this.f108272a = jVar;
        this.f108273b = e5Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        p pVar = (p) obj;
        p pVar2 = (p) obj2;
        if (pVar instanceof u) {
            return !(pVar2 instanceof u) ? 1 : 0;
        }
        if (pVar2 instanceof u) {
            return -1;
        }
        j jVar = this.f108272a;
        return jVar == null ? pVar.h().compareTo(pVar2.h()) : (int) f6.i(jVar.a(this.f108273b, Arrays.asList(pVar, pVar2)).m().doubleValue());
    }
}
