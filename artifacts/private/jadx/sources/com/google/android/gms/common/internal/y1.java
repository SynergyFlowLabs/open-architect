package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class y1 extends g1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ f f106672g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @androidx.annotation.g
    public y1(f fVar, @androidx.annotation.p0 int i10, Bundle bundle) {
        super(fVar, i10, bundle);
        this.f106672g = fVar;
    }

    @Override // com.google.android.gms.common.internal.g1
    protected final void f(ConnectionResult connectionResult) {
        if (this.f106672g.A() && f.q0(this.f106672g)) {
            f.m0(this.f106672g, 16);
        } else {
            this.f106672g.f106538s.a(connectionResult);
            this.f106672g.U(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.internal.g1
    protected final boolean g() {
        this.f106672g.f106538s.a(ConnectionResult.f105824i3);
        return true;
    }
}
