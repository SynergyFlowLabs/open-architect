package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class x1 extends g1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    public final IBinder f106663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ f f106664h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @androidx.annotation.g
    public x1(f fVar, @androidx.annotation.p0 int i10, @androidx.annotation.p0 IBinder iBinder, Bundle bundle) {
        super(fVar, i10, bundle);
        this.f106664h = fVar;
        this.f106663g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.g1
    protected final void f(ConnectionResult connectionResult) {
        if (this.f106664h.Z != null) {
            this.f106664h.Z.n(connectionResult);
        }
        this.f106664h.U(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.g1
    protected final boolean g() {
        try {
            IBinder iBinder = this.f106663g;
            w.r(iBinder);
            if (!this.f106664h.N().equals(iBinder.getInterfaceDescriptor())) {
                this.f106664h.N();
                return false;
            }
            IInterface iInterfaceZ = this.f106664h.z(this.f106663g);
            if (iInterfaceZ != null && (f.p0(this.f106664h, 2, 4, iInterfaceZ) || f.p0(this.f106664h, 3, 4, iInterfaceZ))) {
                this.f106664h.f106523g3 = null;
                f fVar = this.f106664h;
                Bundle bundleF = fVar.F();
                if (fVar.Y != null) {
                    this.f106664h.Y.i(bundleF);
                }
                return true;
            }
            return false;
        } catch (RemoteException unused) {
        }
    }
}
