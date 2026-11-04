package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
final class j1 extends ContentObserver {
    j1(k1 k1Var, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        z1.c();
    }
}
