package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class o2 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ zzdf f108705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f108706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f108707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ f4 f108708h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o2(f4 f4Var, zzdf zzdfVar, String str, String str2) {
        super(f4Var, true);
        this.f108705e = zzdfVar;
        this.f108706f = str;
        this.f108707g = str2;
        Objects.requireNonNull(f4Var);
        this.f108708h = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108708h.q())).setCurrentScreenByScionActivityInfo(this.f108705e, this.f108706f, this.f108707g, this.f108861a);
    }
}
