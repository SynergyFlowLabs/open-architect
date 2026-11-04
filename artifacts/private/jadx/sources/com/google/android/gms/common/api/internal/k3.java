package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class k3 extends g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f106112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.tasks.l f106113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f106114d;

    public k3(int i10, b0 b0Var, com.google.android.gms.tasks.l lVar, z zVar) {
        super(i10);
        this.f106113c = lVar;
        this.f106112b = b0Var;
        this.f106114d = zVar;
        if (i10 == 2 && b0Var.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.m3
    public final void a(@NonNull Status status) {
        this.f106113c.d(this.f106114d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.m3
    public final void b(@NonNull Exception exc) {
        this.f106113c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.m3
    public final void c(u1 u1Var) throws DeadObjectException {
        try {
            this.f106112b.b(u1Var.w(), this.f106113c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(m3.e(e11));
        } catch (RuntimeException e12) {
            this.f106113c.d(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.m3
    public final void d(@NonNull h0 h0Var, boolean z10) {
        h0Var.d(this.f106113c, z10);
    }

    @Override // com.google.android.gms.common.api.internal.g2
    public final boolean f(u1 u1Var) {
        return this.f106112b.c();
    }

    @Override // com.google.android.gms.common.api.internal.g2
    @androidx.annotation.p0
    public final Feature[] g(u1 u1Var) {
        return this.f106112b.e();
    }
}
