package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f108436a;

    public g(Boolean bool) {
        this.f108436a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p Y() {
        return new g(Boolean.valueOf(this.f108436a));
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Iterator c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f108436a == ((g) obj).f108436a;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final String h() {
        return Boolean.toString(this.f108436a);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f108436a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Boolean j() {
        return Boolean.valueOf(this.f108436a);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Double m() {
        return Double.valueOf(true != this.f108436a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p p(String str, e5 e5Var, List list) {
        if ("toString".equals(str)) {
            return new t(Boolean.toString(this.f108436a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f108436a), str));
    }

    public final String toString() {
        return String.valueOf(this.f108436a);
    }
}
