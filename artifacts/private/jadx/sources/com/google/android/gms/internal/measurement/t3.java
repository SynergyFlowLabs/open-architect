package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
abstract class t3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f108861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f108862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f108863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ f4 f108864d;

    t3(f4 f4Var, boolean z10) {
        Objects.requireNonNull(f4Var);
        this.f108864d = f4Var;
        this.f108861a = f4Var.f108415b.currentTimeMillis();
        this.f108862b = f4Var.f108415b.b();
        this.f108863c = z10;
    }

    abstract void a() throws RemoteException;

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f108864d.p()) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f108864d.n(e10, false, this.f108863c);
            b();
        }
    }
}
