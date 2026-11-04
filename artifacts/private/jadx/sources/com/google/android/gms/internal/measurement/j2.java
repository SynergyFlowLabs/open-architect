package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class j2 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f108577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f108578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f108579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f108580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ f4 f108581i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j2(f4 f4Var, String str, String str2, Object obj, boolean z10) {
        super(f4Var, true);
        this.f108577e = str;
        this.f108578f = str2;
        this.f108579g = obj;
        this.f108580h = z10;
        Objects.requireNonNull(f4Var);
        this.f108581i = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108581i.q())).setUserProperty(this.f108577e, this.f108578f, com.google.android.gms.dynamic.f.p(this.f108579g), this.f108580h, this.f108861a);
    }
}
