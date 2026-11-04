package com.google.android.gms.internal.location;

import android.location.Location;

/* JADX INFO: loaded from: classes4.dex */
final class c3 extends com.google.android.gms.location.l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v2 f108091a;

    c3(v2 v2Var) {
        this.f108091a = v2Var;
    }

    @Override // com.google.android.gms.location.m1
    public final void J1(Location location) {
        this.f108091a.a().d(new a3(this, location));
    }

    final void c() {
        this.f108091a.a().a();
    }

    @Override // com.google.android.gms.location.m1
    public final void j() {
        this.f108091a.a().d(new b3(this));
    }

    final c3 n(com.google.android.gms.common.api.internal.o oVar) {
        this.f108091a.b(oVar);
        return this;
    }

    final /* synthetic */ v2 p() {
        return this.f108091a;
    }
}
