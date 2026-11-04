package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class f3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f108410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f108411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ f4 f108412g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f3(f4 f4Var, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(f4Var, false);
        this.f108410e = str;
        this.f108411f = obj;
        Objects.requireNonNull(f4Var);
        this.f108412g = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108412g.q())).logHealthData(5, this.f108410e, com.google.android.gms.dynamic.f.p(this.f108411f), com.google.android.gms.dynamic.f.p(null), com.google.android.gms.dynamic.f.p(null));
    }
}
