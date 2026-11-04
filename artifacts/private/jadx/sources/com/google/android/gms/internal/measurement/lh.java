package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lh extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qg f108628c;

    public lh(qg qgVar) {
        super("internal.logger");
        this.f108628c = qgVar;
        boolean z10 = false | true;
        this.f108575b.put("log", new kh(this, false, true));
        this.f108575b.put(androidx.core.app.w.f47213f1, new ne(this, androidx.core.app.w.f47213f1));
        ((j) this.f108575b.get(androidx.core.app.w.f47213f1)).n("log", new kh(this, true, true));
        this.f108575b.put("unmonitored", new pf(this, "unmonitored"));
        ((j) this.f108575b.get("unmonitored")).n("log", new kh(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final p a(e5 e5Var, List list) {
        return p.S1;
    }

    final /* synthetic */ qg e() {
        return this.f108628c;
    }
}
