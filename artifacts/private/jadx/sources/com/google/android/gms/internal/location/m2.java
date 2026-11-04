package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes4.dex */
final class m2 implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.o f108147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f108148b;

    m2(d3 d3Var, com.google.android.gms.common.api.internal.o oVar, com.google.android.gms.tasks.l lVar) {
        this.f108147a = oVar;
        this.f108148b = lVar;
    }

    @Override // com.google.android.gms.internal.location.v2
    public final com.google.android.gms.common.api.internal.o a() {
        return this.f108147a;
    }

    @Override // com.google.android.gms.internal.location.v2
    public final void b(com.google.android.gms.common.api.internal.o oVar) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.location.v2
    public final void h() {
        this.f108148b.e(null);
    }
}
