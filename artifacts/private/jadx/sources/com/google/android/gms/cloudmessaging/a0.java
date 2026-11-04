package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f105754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.android.gms.tasks.l f105755b = new com.google.android.gms.tasks.l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f105756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Bundle f105757d;

    a0(int i10, int i11, Bundle bundle) {
        this.f105754a = i10;
        this.f105756c = i11;
        this.f105757d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(b0 b0Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            b0Var.toString();
        }
        this.f105755b.b(b0Var);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            String.valueOf(obj);
        }
        this.f105755b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f105756c + " id=" + this.f105754a + " oneWay=" + b() + "}";
    }
}
