package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class kb extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ md f108605c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kb(lc lcVar, String str, md mdVar) {
        super("getValue");
        this.f108605c = mdVar;
        Objects.requireNonNull(lcVar);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final p a(e5 e5Var, List list) {
        f6.a("getValue", 2, list);
        p pVarA = e5Var.a((p) list.get(0));
        p pVarA2 = e5Var.a((p) list.get(1));
        String strA = this.f108605c.a(pVarA.h());
        return strA != null ? new t(strA) : pVarA2;
    }
}
