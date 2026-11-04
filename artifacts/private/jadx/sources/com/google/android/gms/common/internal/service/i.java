package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends com.google.android.gms.common.internal.k<m> {
    public i(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.l.b bVar, com.google.android.gms.common.api.l.c cVar) {
        super(context, looper, 39, hVar, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String N() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String O() {
        return "com.google.android.gms.common.service.START";
    }

    @Override // com.google.android.gms.common.internal.f
    protected final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
    }
}
