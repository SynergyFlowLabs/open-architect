package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f108745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f108746b;

    public q(String str, List list) {
        this.f108745a = str;
        ArrayList arrayList = new ArrayList();
        this.f108746b = arrayList;
        arrayList.addAll(list);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p Y() {
        return this;
    }

    public final String a() {
        return this.f108745a;
    }

    public final ArrayList b() {
        return this.f108746b;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Iterator c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        String str = this.f108745a;
        if (str == null ? qVar.f108745a == null : str.equals(qVar.f108745a)) {
            return this.f108746b.equals(qVar.f108746b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final String h() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.f108745a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f108746b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Boolean j() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Double m() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p p(String str, e5 e5Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
