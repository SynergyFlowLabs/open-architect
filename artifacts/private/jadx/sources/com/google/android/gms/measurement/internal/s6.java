package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class s6 implements com.google.android.gms.internal.measurement.md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ x6 f110472b;

    s6(x6 x6Var, String str) {
        this.f110471a = str;
        Objects.requireNonNull(x6Var);
        this.f110472b = x6Var;
    }

    @Override // com.google.android.gms.internal.measurement.md
    public final String a(String str) {
        Map map = (Map) this.f110472b.p().get(this.f110471a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
