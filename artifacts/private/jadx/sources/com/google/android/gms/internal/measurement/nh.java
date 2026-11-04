package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class nh extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rh f108701c;

    public nh(rh rhVar) {
        super("internal.registerCallback");
        this.f108701c = rhVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final p a(e5 e5Var, List list) {
        f6.a(this.f108574a, 3, list);
        String strH = e5Var.a((p) list.get(0)).h();
        p pVarA = e5Var.a((p) list.get(1));
        if (!(pVarA instanceof o)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        p pVarA2 = e5Var.a((p) list.get(2));
        if (!(pVarA2 instanceof m)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        m mVar = (m) pVarA2;
        if (!mVar.l("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f108701c.a(strH, mVar.l("priority") ? f6.g(mVar.i("priority").m().doubleValue()) : 1000, (o) pVarA, mVar.i("type").h());
        return p.S1;
    }
}
