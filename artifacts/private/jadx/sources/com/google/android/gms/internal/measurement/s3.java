package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class s3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Long f108791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f108792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f108793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Bundle f108794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f108795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f108796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ f4 f108797k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s3(f4 f4Var, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(f4Var, true);
        this.f108791e = l10;
        this.f108792f = str;
        this.f108793g = str2;
        this.f108794h = bundle;
        this.f108795i = z10;
        this.f108796j = z11;
        Objects.requireNonNull(f4Var);
        this.f108797k = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        Long l10 = this.f108791e;
        ((u1) com.google.android.gms.common.internal.w.r(this.f108797k.q())).logEvent(this.f108792f, this.f108793g, this.f108794h, this.f108795i, this.f108796j, l10 == null ? this.f108861a : l10.longValue());
    }
}
