package com.google.android.gms.fido.u2f;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface b {
    void a(@NonNull Activity activity, int i10) throws IntentSender.SendIntentException;

    boolean b();
}
