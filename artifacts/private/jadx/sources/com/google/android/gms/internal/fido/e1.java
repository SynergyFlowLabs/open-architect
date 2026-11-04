package com.google.android.gms.internal.fido;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 implements com.google.android.gms.fido.u2f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f108011a;

    public e1(PendingIntent pendingIntent) {
        this.f108011a = pendingIntent;
    }

    @Override // com.google.android.gms.fido.u2f.b
    public final void a(Activity activity, int i10) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent = this.f108011a;
        if (pendingIntent == null) {
            throw new IllegalStateException("No PendingIntent available");
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
    }

    @Override // com.google.android.gms.fido.u2f.b
    public final boolean b() {
        return this.f108011a != null;
    }
}
