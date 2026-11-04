package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class e4 extends com.google.android.gms.common.internal.k {
    public e4(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.r rVar) {
        super(context, looper, 23, hVar, fVar, rVar);
    }

    @Override // com.google.android.gms.common.internal.f
    public final Feature[] C() {
        return com.google.android.gms.location.b1.f109646p;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final Bundle I() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", "activity_recognition");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String N() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String O() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean b0() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final int n() {
        return 11717000;
    }

    public final void w0(PendingIntent pendingIntent) throws RemoteException {
        com.google.android.gms.common.internal.w.r(pendingIntent);
        ((q4) M()).P6(pendingIntent);
    }

    @Override // com.google.android.gms.common.internal.f
    protected final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof q4 ? (q4) iInterfaceQueryLocalInterface : new p4(iBinder);
    }
}
