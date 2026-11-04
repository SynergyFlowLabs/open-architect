package com.google.android.gms.internal.fido;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class t0 implements com.google.android.gms.fido.fido2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final PendingIntent f108062a;

    public t0(@androidx.annotation.p0 PendingIntent pendingIntent) {
        this.f108062a = pendingIntent;
    }

    @Override // com.google.android.gms.fido.fido2.b
    public final void a(Activity activity, int i10) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent = this.f108062a;
        if (pendingIntent == null) {
            throw new IllegalStateException("No PendingIntent available");
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
    }

    @Override // com.google.android.gms.fido.fido2.b
    public final boolean b() {
        return this.f108062a != null;
    }
}
