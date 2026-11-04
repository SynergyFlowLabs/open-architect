package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements p {
    @Override // com.google.android.gms.internal.measurement.p
    public final p Y() {
        return p.T1;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Iterator c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof n;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final String h() {
        return AbstractJsonLexerKt.NULL;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Boolean j() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Double m() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p p(String str, e5 e5Var, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }
}
