package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class i3 extends m3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final e.a f106095b;

    public i3(int i10, e.a aVar) {
        super(i10);
        this.f106095b = (e.a) com.google.android.gms.common.internal.w.s(aVar, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.m3
    public final void a(@NonNull Status status) {
        try {
            this.f106095b.b(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.m3
    public final void b(@NonNull Exception exc) {
        try {
            this.f106095b.b(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.m3
    public final void c(u1 u1Var) throws DeadObjectException {
        try {
            this.f106095b.A(u1Var.w());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.m3
    public final void d(@NonNull h0 h0Var, boolean z10) {
        h0Var.c(this.f106095b, z10);
    }
}
