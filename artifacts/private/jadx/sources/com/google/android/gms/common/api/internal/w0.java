package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes4.dex */
final class w0 implements com.google.android.gms.common.api.l.b, com.google.android.gms.common.api.l.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ z0 f106246a;

    /* synthetic */ w0(z0 z0Var, y0 y0Var) {
        this.f106246a = z0Var;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void i(@androidx.annotation.p0 Bundle bundle) {
        ((com.google.android.gms.signin.f) com.google.android.gms.common.internal.w.r(this.f106246a.f106279k)).u(new v0(this.f106246a));
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void k(int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void n(@NonNull ConnectionResult connectionResult) {
        this.f106246a.f106270b.lock();
        try {
            if (this.f106246a.q(connectionResult)) {
                this.f106246a.i();
                this.f106246a.n();
            } else {
                this.f106246a.l(connectionResult);
            }
            Lock lock = this.f106246a.f106270b;
        } finally {
            this.f106246a.f106270b.unlock();
        }
    }
}
