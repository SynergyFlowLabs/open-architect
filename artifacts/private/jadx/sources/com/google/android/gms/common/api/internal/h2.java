package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class h2 extends t3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.tasks.l f106043f;

    private h2(n nVar) {
        super(nVar, com.google.android.gms.common.f.x());
        this.f106043f = new com.google.android.gms.tasks.l();
        this.f106121a.j("GmsAvailabilityHelper", this);
    }

    public static h2 u(@NonNull Activity activity) {
        n nVarC = m.c(activity);
        h2 h2Var = (h2) nVarC.b("GmsAvailabilityHelper", h2.class);
        if (h2Var == null) {
            return new h2(nVarC);
        }
        if (h2Var.f106043f.a().t()) {
            h2Var.f106043f = new com.google.android.gms.tasks.l();
        }
        return h2Var;
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void h() {
        super.h();
        this.f106043f.d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // com.google.android.gms.common.api.internal.t3
    protected final void n(ConnectionResult connectionResult, int i10) {
        String strT1 = connectionResult.T1();
        if (strT1 == null) {
            strT1 = "Error connecting to Google Play services";
        }
        this.f106043f.b(new com.google.android.gms.common.api.b(new Status(connectionResult, strT1, connectionResult.O1())));
    }

    @Override // com.google.android.gms.common.api.internal.t3
    protected final void o() {
        Activity activityF = this.f106121a.f();
        if (activityF == null) {
            this.f106043f.d(new com.google.android.gms.common.api.b(new Status(8)));
            return;
        }
        int iJ = this.f106209e.j(activityF);
        if (iJ == 0) {
            this.f106043f.e(null);
        } else {
            if (this.f106043f.a().t()) {
                return;
            }
            t(new ConnectionResult(iJ, null), 0);
        }
    }

    public final Task v() {
        return this.f106043f.a();
    }
}
