package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class d1 implements com.google.android.gms.common.api.l.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a0 f105985a;

    d1(i1 i1Var, a0 a0Var) {
        this.f105985a = a0Var;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void n(@NonNull ConnectionResult connectionResult) {
        this.f105985a.o(new Status(8));
    }
}
