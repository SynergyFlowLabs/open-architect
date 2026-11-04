package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class x1 implements com.google.android.gms.common.internal.f.c, w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.api.a.f f106250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f106251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.gms.common.internal.o f106252c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private Set f106253d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f106254e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f106255f;

    public x1(i iVar, com.google.android.gms.common.api.a.f fVar, c cVar) {
        this.f106255f = iVar;
        this.f106250a = fVar;
        this.f106251b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    public final void i() {
        com.google.android.gms.common.internal.o oVar;
        if (this.f106254e && (oVar = this.f106252c) != null) {
            this.f106250a.k(oVar, this.f106253d);
        }
    }

    @Override // com.google.android.gms.common.internal.f.c
    public final void a(@NonNull ConnectionResult connectionResult) {
        this.f106255f.f106064n.post(new w1(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.w2
    @androidx.annotation.m1
    public final void b(@androidx.annotation.p0 com.google.android.gms.common.internal.o oVar, @androidx.annotation.p0 Set set) {
        if (oVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            d(new ConnectionResult(4));
        } else {
            this.f106252c = oVar;
            this.f106253d = set;
            i();
        }
    }

    @Override // com.google.android.gms.common.api.internal.w2
    @androidx.annotation.m1
    public final void c(int i10) {
        u1 u1Var = (u1) this.f106255f.f106060j.get(this.f106251b);
        if (u1Var != null) {
            if (u1Var.f106224i) {
                u1Var.J(new ConnectionResult(17));
                return;
            }
            u1Var.k(i10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.w2
    @androidx.annotation.m1
    public final void d(ConnectionResult connectionResult) {
        u1 u1Var = (u1) this.f106255f.f106060j.get(this.f106251b);
        if (u1Var != null) {
            u1Var.J(connectionResult);
        }
    }
}
