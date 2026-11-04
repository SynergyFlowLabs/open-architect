package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class m2 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f108673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f108674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ r1 f108675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ f4 f108676h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m2(f4 f4Var, String str, String str2, r1 r1Var) {
        super(f4Var, true);
        this.f108673e = str;
        this.f108674f = str2;
        this.f108675g = r1Var;
        Objects.requireNonNull(f4Var);
        this.f108676h = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108676h.q())).getConditionalUserProperties(this.f108673e, this.f108674f, this.f108675g);
    }

    @Override // com.google.android.gms.internal.measurement.t3
    protected final void b() {
        this.f108675g.r(null);
    }
}
