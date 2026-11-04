package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends com.google.android.gms.common.internal.k {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final Bundle f107760v3;

    public q(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.auth.api.accounttransfer.v vVar, com.google.android.gms.common.api.l.b bVar, com.google.android.gms.common.api.l.c cVar) {
        super(context, looper, 128, hVar, bVar, cVar);
        this.f107760v3 = vVar == null ? new Bundle() : vVar.a();
    }

    @Override // com.google.android.gms.common.internal.f
    protected final Bundle I() {
        return this.f107760v3;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String N() {
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String O() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean b0() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final int n() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        return iInterfaceQueryLocalInterface instanceof u ? (u) iInterfaceQueryLocalInterface : new u(iBinder);
    }
}
