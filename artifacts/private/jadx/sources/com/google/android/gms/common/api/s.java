package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class s extends b {
    public s(@NonNull Status status) {
        super(status);
    }

    @NonNull
    public PendingIntent d() {
        return a().T1();
    }

    public void e(@NonNull Activity activity, int i10) throws IntentSender.SendIntentException {
        a().s2(activity, i10);
    }
}
