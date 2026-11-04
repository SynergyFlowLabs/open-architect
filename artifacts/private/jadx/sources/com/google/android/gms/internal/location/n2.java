package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class n2 extends com.google.android.gms.common.api.internal.k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f108152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f108153b;

    n2(Object obj, com.google.android.gms.tasks.l lVar) {
        this.f108152a = obj;
        this.f108153b = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final void s6(Status status) {
        com.google.android.gms.common.api.internal.c0.b(status, this.f108152a, this.f108153b);
    }
}
