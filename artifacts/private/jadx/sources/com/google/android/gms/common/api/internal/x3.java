package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class x3 implements com.google.android.gms.common.api.l.b, com.google.android.gms.common.api.l.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.common.api.a f106264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f106265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private y3 f106266c;

    public x3(com.google.android.gms.common.api.a aVar, boolean z10) {
        this.f106264a = aVar;
        this.f106265b = z10;
    }

    private final y3 b() {
        com.google.android.gms.common.internal.w.s(this.f106266c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f106266c;
    }

    public final void a(y3 y3Var) {
        this.f106266c = y3Var;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void i(@androidx.annotation.p0 Bundle bundle) {
        b().i(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void k(int i10) {
        b().k(i10);
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void n(@NonNull ConnectionResult connectionResult) {
        b().L(connectionResult, this.f106264a, this.f106265b);
    }
}
