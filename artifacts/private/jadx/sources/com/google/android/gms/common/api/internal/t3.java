package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t3 extends m implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile boolean f106206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AtomicReference f106207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f106208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final com.google.android.gms.common.f f106209e;

    @androidx.annotation.l1
    t3(n nVar, com.google.android.gms.common.f fVar) {
        super(nVar);
        this.f106207c = new AtomicReference(null);
        this.f106208d = new com.google.android.gms.internal.base.q(Looper.getMainLooper());
        this.f106209e = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(ConnectionResult connectionResult, int i10) {
        this.f106207c.set(null);
        n(connectionResult, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        this.f106207c.set(null);
        o();
    }

    private static final int q(@androidx.annotation.p0 q3 q3Var) {
        if (q3Var == null) {
            return -1;
        }
        return q3Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void f(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        q3 q3Var = (q3) this.f106207c.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iJ = this.f106209e.j(b());
                if (iJ == 0) {
                    p();
                    return;
                } else {
                    if (q3Var == null) {
                        return;
                    }
                    if (q3Var.b().O1() == 18 && iJ == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            p();
            return;
        } else if (i11 == 0) {
            if (q3Var != null) {
                m(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, q3Var.b().toString()), q(q3Var));
                return;
            }
            return;
        }
        if (q3Var != null) {
            m(q3Var.b(), q3Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void g(@androidx.annotation.p0 Bundle bundle) {
        super.g(bundle);
        if (bundle != null) {
            int i10 = 4 >> 0;
            this.f106207c.set(bundle.getBoolean("resolving_error", false) ? new q3(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void j(Bundle bundle) {
        super.j(bundle);
        q3 q3Var = (q3) this.f106207c.get();
        if (q3Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", q3Var.a());
        bundle.putInt("failed_status", q3Var.b().O1());
        bundle.putParcelable("failed_resolution", q3Var.b().b2());
    }

    @Override // com.google.android.gms.common.api.internal.m
    public void k() {
        super.k();
        this.f106206b = true;
    }

    @Override // com.google.android.gms.common.api.internal.m
    public void l() {
        super.l();
        this.f106206b = false;
    }

    protected abstract void n(ConnectionResult connectionResult, int i10);

    protected abstract void o();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m(new ConnectionResult(13, null), q((q3) this.f106207c.get()));
    }

    public final void t(ConnectionResult connectionResult, int i10) {
        AtomicReference atomicReference;
        q3 q3Var = new q3(connectionResult, i10);
        do {
            atomicReference = this.f106207c;
            if (androidx.compose.animation.core.z1.a(atomicReference, null, q3Var)) {
                this.f106208d.post(new s3(this, q3Var));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
