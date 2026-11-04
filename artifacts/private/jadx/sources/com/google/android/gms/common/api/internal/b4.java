package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes4.dex */
final class b4 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d4 f105969a;

    /* synthetic */ b4(d4 d4Var, c4 c4Var) {
        this.f105969a = d4Var;
    }

    @Override // com.google.android.gms.common.api.internal.d2
    public final void a(int i10, boolean z10) {
        this.f105969a.f105999m.lock();
        try {
            d4 d4Var = this.f105969a;
            if (d4Var.f105998l) {
                d4Var.f105998l = false;
                d4.A(this.f105969a, i10, z10);
            } else {
                d4Var.f105998l = true;
                this.f105969a.f105990d.k(i10);
            }
            Lock lock = this.f105969a.f105999m;
        } finally {
            this.f105969a.f105999m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.d2
    public final void b(@androidx.annotation.p0 Bundle bundle) {
        this.f105969a.f105999m.lock();
        try {
            this.f105969a.f105997k = ConnectionResult.f105824i3;
            d4.C(this.f105969a);
            this.f105969a.f105999m.unlock();
        } catch (Throwable th2) {
            this.f105969a.f105999m.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.d2
    public final void c(@NonNull ConnectionResult connectionResult) {
        this.f105969a.f105999m.lock();
        try {
            this.f105969a.f105997k = connectionResult;
            d4.C(this.f105969a);
            this.f105969a.f105999m.unlock();
        } catch (Throwable th2) {
            this.f105969a.f105999m.unlock();
            throw th2;
        }
    }
}
