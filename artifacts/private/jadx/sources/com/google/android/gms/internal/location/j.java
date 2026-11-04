package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class j implements com.google.android.gms.common.api.internal.e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.tasks.l f108123a;

    public j(com.google.android.gms.tasks.l lVar) {
        com.google.android.gms.common.internal.w.r(lVar);
        this.f108123a = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.e.b
    public final /* synthetic */ void a(Object obj) {
        com.google.android.gms.common.api.internal.c0.b((Status) obj, null, this.f108123a);
    }

    @Override // com.google.android.gms.common.api.internal.e.b
    public final void b(@androidx.annotation.p0 Status status) {
        if (status == null) {
            return;
        }
        this.f108123a.b(new com.google.android.gms.common.api.b(status));
    }
}
