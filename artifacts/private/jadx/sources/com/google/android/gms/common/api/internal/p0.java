package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
final class p0 implements com.google.android.gms.common.internal.f.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f106161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f106162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f106163c;

    public p0(z0 z0Var, com.google.android.gms.common.api.a aVar, boolean z10) {
        this.f106161a = new WeakReference(z0Var);
        this.f106162b = aVar;
        this.f106163c = z10;
    }

    @Override // com.google.android.gms.common.internal.f.c
    public final void a(@NonNull ConnectionResult connectionResult) {
        z0 z0Var = (z0) this.f106161a.get();
        if (z0Var == null) {
            return;
        }
        com.google.android.gms.common.internal.w.y(Looper.myLooper() == z0Var.f106269a.f106136n.r(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        z0Var.f106270b.lock();
        try {
            if (z0Var.o(0)) {
                if (!connectionResult.f2()) {
                    z0Var.m(connectionResult, this.f106162b, this.f106163c);
                }
                if (z0Var.p()) {
                    z0Var.n();
                }
            }
            z0Var.f106270b.unlock();
        } catch (Throwable th2) {
            z0Var.f106270b.unlock();
            throw th2;
        }
    }
}
