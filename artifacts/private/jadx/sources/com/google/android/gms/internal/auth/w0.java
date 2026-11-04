package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
final class w0 extends ContentObserver {
    w0(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        x0.f107874e.set(true);
    }
}
