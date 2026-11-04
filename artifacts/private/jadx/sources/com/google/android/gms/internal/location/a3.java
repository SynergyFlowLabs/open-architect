package com.google.android.gms.internal.location;

import android.location.Location;

/* JADX INFO: loaded from: classes4.dex */
final class a3 implements com.google.android.gms.common.api.internal.o.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Location f108084a;

    a3(c3 c3Var, Location location) {
        this.f108084a = location;
    }

    @Override // com.google.android.gms.common.api.internal.o.b
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((com.google.android.gms.location.o) obj).onLocationChanged(this.f108084a);
    }

    @Override // com.google.android.gms.common.api.internal.o.b
    public final void b() {
    }
}
