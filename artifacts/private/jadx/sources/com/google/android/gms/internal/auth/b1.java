package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
final class b1 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c1 f107586a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b1(c1 c1Var, Handler handler) {
        super(null);
        this.f107586a = c1Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f107586a.e();
    }
}
