package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
abstract class h3 extends g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.tasks.l f106044b;

    public h3(int i10, com.google.android.gms.tasks.l lVar) {
        super(i10);
        this.f106044b = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.m3
    public final void a(@NonNull Status status) {
        this.f106044b.d(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.m3
    public final void b(@NonNull Exception exc) {
        this.f106044b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.m3
    public final void c(u1 u1Var) throws DeadObjectException {
        try {
            h(u1Var);
        } catch (DeadObjectException e10) {
            a(m3.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(m3.e(e11));
        } catch (RuntimeException e12) {
            this.f106044b.d(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.m3
    public void d(@NonNull h0 h0Var, boolean z10) {
    }

    protected abstract void h(u1 u1Var) throws RemoteException;
}
