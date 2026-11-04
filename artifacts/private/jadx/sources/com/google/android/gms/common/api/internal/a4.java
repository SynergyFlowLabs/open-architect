package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes4.dex */
final class a4 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d4 f105958a;

    /* synthetic */ a4(d4 d4Var, c4 c4Var) {
        this.f105958a = d4Var;
    }

    @Override // com.google.android.gms.common.api.internal.d2
    public final void a(int i10, boolean z10) {
        this.f105958a.f105999m.lock();
        try {
            d4 d4Var = this.f105958a;
            if (d4Var.f105998l || d4Var.f105997k == null || !d4Var.f105997k.f2()) {
                this.f105958a.f105998l = false;
                d4.A(this.f105958a, i10, z10);
            } else {
                this.f105958a.f105998l = true;
                this.f105958a.f105991e.k(i10);
            }
            this.f105958a.f105999m.unlock();
        } catch (Throwable th2) {
            this.f105958a.f105999m.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.d2
    public final void b(@androidx.annotation.p0 Bundle bundle) {
        this.f105958a.f105999m.lock();
        try {
            d4.B(this.f105958a, bundle);
            this.f105958a.f105996j = ConnectionResult.f105824i3;
            d4.C(this.f105958a);
            this.f105958a.f105999m.unlock();
        } catch (Throwable th2) {
            this.f105958a.f105999m.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.d2
    public final void c(@NonNull ConnectionResult connectionResult) {
        this.f105958a.f105999m.lock();
        try {
            this.f105958a.f105996j = connectionResult;
            d4.C(this.f105958a);
            Lock lock = this.f105958a.f105999m;
        } finally {
            this.f105958a.f105999m.unlock();
        }
    }
}
