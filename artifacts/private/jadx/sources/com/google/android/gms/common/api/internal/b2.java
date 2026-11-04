package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class b2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    Context f105967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a2 f105968b;

    public b2(a2 a2Var) {
        this.f105968b = a2Var;
    }

    public final void a(Context context) {
        this.f105967a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f105967a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f105967a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f105968b.a();
            b();
        }
    }
}
