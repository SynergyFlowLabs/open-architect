package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class z extends c0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Location f108223t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(d0 d0Var, com.google.android.gms.common.api.l lVar, Location location) {
        super(lVar);
        this.f108223t = location;
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        ((d3) bVar).w0(this.f108223t, d0.m(this));
    }
}
