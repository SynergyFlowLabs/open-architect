package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.e.b f106630a;

    public e(com.google.android.gms.common.api.internal.e.b bVar) {
        this.f106630a = bVar;
    }

    @Override // com.google.android.gms.common.internal.service.b, com.google.android.gms.common.internal.service.l
    public final void I6(int i10) throws RemoteException {
        this.f106630a.a(new Status(i10));
    }
}
