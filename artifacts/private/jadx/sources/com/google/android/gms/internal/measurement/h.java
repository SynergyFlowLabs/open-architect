package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f108474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f108475b;

    public h() {
        this.f108474a = p.S1;
        this.f108475b = "return";
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p Y() {
        return new h(this.f108475b, this.f108474a.Y());
    }

    public final p a() {
        return this.f108474a;
    }

    public final String b() {
        return this.f108475b;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Iterator c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f108475b.equals(hVar.f108475b) && this.f108474a.equals(hVar.f108474a);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final String h() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return (this.f108475b.hashCode() * 31) + this.f108474a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Boolean j() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Double m() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p p(String str, e5 e5Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public h(String str) {
        this.f108474a = p.S1;
        this.f108475b = str;
    }

    public h(String str, p pVar) {
        this.f108474a = pVar;
        this.f108475b = str;
    }
}
