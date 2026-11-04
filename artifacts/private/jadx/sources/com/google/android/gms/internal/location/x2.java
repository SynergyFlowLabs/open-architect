package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes4.dex */
final class x2 implements com.google.android.gms.common.api.internal.o.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ LocationAvailability f108215a;

    x2(z2 z2Var, LocationAvailability locationAvailability) {
        this.f108215a = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.o.b
    public final /* synthetic */ void a(Object obj) {
        ((com.google.android.gms.location.n) obj).a(this.f108215a);
    }

    @Override // com.google.android.gms.common.api.internal.o.b
    public final void b() {
    }
}
