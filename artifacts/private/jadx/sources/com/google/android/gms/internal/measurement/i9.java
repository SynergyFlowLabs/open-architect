package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i9 extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f108564c;

    public i9(c cVar) {
        super("internal.eventLogger");
        this.f108564c = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final p a(e5 e5Var, List list) {
        f6.a(this.f108574a, 3, list);
        String strH = e5Var.a((p) list.get(0)).h();
        long jI = (long) f6.i(e5Var.a((p) list.get(1)).m().doubleValue());
        p pVarA = e5Var.a((p) list.get(2));
        this.f108564c.e(strH, jI, pVarA instanceof m ? f6.k((m) pVarA) : new HashMap());
        return p.S1;
    }
}
