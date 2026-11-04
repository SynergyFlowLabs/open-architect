package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class x2 extends com.google.android.gms.signin.internal.c implements com.google.android.gms.common.api.l.b, com.google.android.gms.common.api.l.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.AbstractC0967a f106256h = com.google.android.gms.signin.e.f110927c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f106257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f106258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.a.AbstractC0967a f106259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f106260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.common.internal.h f106261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.signin.f f106262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w2 f106263g;

    @androidx.annotation.m1
    public x2(Context context, Handler handler, @NonNull com.google.android.gms.common.internal.h hVar) {
        com.google.android.gms.common.api.a.AbstractC0967a abstractC0967a = f106256h;
        this.f106257a = context;
        this.f106258b = handler;
        this.f106261e = (com.google.android.gms.common.internal.h) com.google.android.gms.common.internal.w.s(hVar, "ClientSettings must not be null");
        this.f106260d = hVar.i();
        this.f106259c = abstractC0967a;
    }

    static /* bridge */ /* synthetic */ void u(x2 x2Var, zak zakVar) {
        ConnectionResult connectionResultO1 = zakVar.O1();
        if (connectionResultO1.f2()) {
            zav zavVar = (zav) com.google.android.gms.common.internal.w.r(zakVar.T1());
            ConnectionResult connectionResultO2 = zavVar.O1();
            if (!connectionResultO2.f2()) {
                String strValueOf = String.valueOf(connectionResultO2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                x2Var.f106263g.d(connectionResultO2);
                x2Var.f106262f.d();
                return;
            }
            x2Var.f106263g.b(zavVar.T1(), x2Var.f106260d);
        } else {
            x2Var.f106263g.d(connectionResultO1);
        }
        x2Var.f106262f.d();
    }

    @Override // com.google.android.gms.common.api.internal.f
    @androidx.annotation.m1
    public final void i(@androidx.annotation.p0 Bundle bundle) {
        this.f106262f.u(this);
    }

    @Override // com.google.android.gms.common.api.internal.f
    @androidx.annotation.m1
    public final void k(int i10) {
        this.f106263g.c(i10);
    }

    @Override // com.google.android.gms.common.api.internal.r
    @androidx.annotation.m1
    public final void n(@NonNull ConnectionResult connectionResult) {
        this.f106263g.d(connectionResult);
    }

    @androidx.annotation.m1
    public final void v(w2 w2Var) {
        com.google.android.gms.signin.f fVar = this.f106262f;
        if (fVar != null) {
            fVar.d();
        }
        this.f106261e.o(Integer.valueOf(System.identityHashCode(this)));
        com.google.android.gms.common.api.a.AbstractC0967a abstractC0967a = this.f106259c;
        Context context = this.f106257a;
        Handler handler = this.f106258b;
        com.google.android.gms.common.internal.h hVar = this.f106261e;
        this.f106262f = (com.google.android.gms.signin.f) abstractC0967a.c(context, handler.getLooper(), hVar, hVar.k(), this, this);
        this.f106263g = w2Var;
        Set set = this.f106260d;
        if (set == null || set.isEmpty()) {
            this.f106258b.post(new u2(this));
        } else {
            this.f106262f.l();
        }
    }

    @Override // com.google.android.gms.signin.internal.c, com.google.android.gms.signin.internal.e
    @androidx.annotation.g
    public final void v9(zak zakVar) {
        this.f106258b.post(new v2(this, zakVar));
    }

    public final void w() {
        com.google.android.gms.signin.f fVar = this.f106262f;
        if (fVar != null) {
            fVar.d();
        }
    }
}
