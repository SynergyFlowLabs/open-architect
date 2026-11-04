package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.location.CurrentLocationRequest;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class r0 implements com.google.android.gms.common.api.internal.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CurrentLocationRequest f108175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.tasks.a f108176b;

    /* synthetic */ r0(CurrentLocationRequest currentLocationRequest, com.google.android.gms.tasks.a aVar) {
        this.f108175a = currentLocationRequest;
        this.f108176b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.w
    public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        com.google.android.gms.common.api.a aVar = k0.f108133o;
        ((d3) obj).F0(this.f108175a, this.f108176b, (com.google.android.gms.tasks.l) obj2);
    }
}
