package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements p {
    @Override // com.google.android.gms.internal.measurement.p
    public final p Y() {
        return p.S1;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Iterator c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof u;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final String h() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Boolean j() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Double m() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p p(String str, e5 e5Var, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
