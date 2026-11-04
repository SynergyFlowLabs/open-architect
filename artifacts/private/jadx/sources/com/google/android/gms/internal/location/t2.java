package com.google.android.gms.internal.location;

import com.google.android.gms.location.DeviceOrientation;

/* JADX INFO: loaded from: classes4.dex */
final class t2 implements com.google.android.gms.common.api.internal.o.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ DeviceOrientation f108191a;

    t2(u2 u2Var, DeviceOrientation deviceOrientation) {
        this.f108191a = deviceOrientation;
    }

    @Override // com.google.android.gms.common.api.internal.o.b
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((com.google.android.gms.location.d) obj).a(this.f108191a);
    }

    @Override // com.google.android.gms.common.api.internal.o.b
    public final void b() {
    }
}
