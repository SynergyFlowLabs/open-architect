package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class i3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f108560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ r1 f108561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ f4 f108562g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i3(f4 f4Var, String str, r1 r1Var) {
        super(f4Var, true);
        this.f108560e = str;
        this.f108561f = r1Var;
        Objects.requireNonNull(f4Var);
        this.f108562g = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108562g.q())).getMaxUserProperties(this.f108560e, this.f108561f);
    }

    @Override // com.google.android.gms.internal.measurement.t3
    protected final void b() {
        this.f108561f.r(null);
    }
}
