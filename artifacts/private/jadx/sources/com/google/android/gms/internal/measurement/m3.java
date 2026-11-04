package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class m3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f108677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f4 f108678f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m3(f4 f4Var, boolean z10) {
        super(f4Var, true);
        this.f108677e = z10;
        Objects.requireNonNull(f4Var);
        this.f108678f = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108678f.q())).setDataCollectionEnabled(this.f108677e);
    }
}
