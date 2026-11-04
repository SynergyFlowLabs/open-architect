package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class l2 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f108612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f108613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Bundle f108614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ f4 f108615h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l2(f4 f4Var, String str, String str2, Bundle bundle) {
        super(f4Var, true);
        this.f108612e = str;
        this.f108613f = str2;
        this.f108614g = bundle;
        Objects.requireNonNull(f4Var);
        this.f108615h = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108615h.q())).clearConditionalUserProperty(this.f108612e, this.f108613f, this.f108614g);
    }
}
