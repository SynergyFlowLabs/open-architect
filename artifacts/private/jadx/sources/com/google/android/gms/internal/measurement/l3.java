package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class l3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ r1 f108616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f108617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ f4 f108618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l3(f4 f4Var, r1 r1Var, int i10) {
        super(f4Var, true);
        this.f108616e = r1Var;
        this.f108617f = i10;
        Objects.requireNonNull(f4Var);
        this.f108618g = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108618g.q())).getTestFlag(this.f108616e, this.f108617f);
    }

    @Override // com.google.android.gms.internal.measurement.t3
    protected final void b() {
        this.f108616e.r(null);
    }
}
