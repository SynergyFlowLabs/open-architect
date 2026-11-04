package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
final class n3 implements com.google.android.gms.common.api.l.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f106148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.l f106149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    public final com.google.android.gms.common.api.l.c f106150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ o3 f106151d;

    public n3(o3 o3Var, int i10, @androidx.annotation.p0 com.google.android.gms.common.api.l lVar, com.google.android.gms.common.api.l.c cVar) {
        this.f106151d = o3Var;
        this.f106148a = i10;
        this.f106149b = lVar;
        this.f106150c = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void n(@NonNull ConnectionResult connectionResult) {
        "beginFailureResolution for ".concat(String.valueOf(connectionResult));
        this.f106151d.t(connectionResult, this.f106148a);
    }
}
