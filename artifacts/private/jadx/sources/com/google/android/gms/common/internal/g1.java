package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
abstract class g1 extends u1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f106549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    public final Bundle f106550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f f106551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @androidx.annotation.g
    protected g1(f fVar, @androidx.annotation.p0 int i10, Bundle bundle) {
        super(fVar, Boolean.TRUE);
        this.f106551f = fVar;
        this.f106549d = i10;
        this.f106550e = bundle;
    }

    @Override // com.google.android.gms.common.internal.u1
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f106549d != 0) {
            this.f106551f.r0(1, null);
            Bundle bundle = this.f106550e;
            f(new ConnectionResult(this.f106549d, bundle != null ? (PendingIntent) bundle.getParcelable(f.f106512n3) : null));
        } else {
            if (g()) {
                return;
            }
            this.f106551f.r0(1, null);
            f(new ConnectionResult(8, null));
        }
    }

    @Override // com.google.android.gms.common.internal.u1
    protected final void b() {
    }

    protected abstract void f(ConnectionResult connectionResult);

    protected abstract boolean g();
}
