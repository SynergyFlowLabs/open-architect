package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class e3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f108378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f108379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f108380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ r1 f108381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ f4 f108382i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e3(f4 f4Var, String str, String str2, boolean z10, r1 r1Var) {
        super(f4Var, true);
        this.f108378e = str;
        this.f108379f = str2;
        this.f108380g = z10;
        this.f108381h = r1Var;
        Objects.requireNonNull(f4Var);
        this.f108382i = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108382i.q())).getUserProperties(this.f108378e, this.f108379f, this.f108380g, this.f108381h);
    }

    @Override // com.google.android.gms.internal.measurement.t3
    protected final void b() {
        this.f108381h.r(null);
    }
}
