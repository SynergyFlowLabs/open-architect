package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public interface d extends com.google.android.gms.common.api.m<w> {
    @NonNull
    String X(@p0 Intent intent) throws com.google.android.gms.common.api.b;

    @NonNull
    @Deprecated
    Task<PendingIntent> c(@NonNull GetSignInIntentRequest getSignInIntentRequest);

    @NonNull
    Task<PendingIntent> c0(@NonNull GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest);

    @NonNull
    @Deprecated
    Task<Void> g0();

    @NonNull
    @Deprecated
    SignInCredential h(@p0 Intent intent) throws com.google.android.gms.common.api.b;

    @NonNull
    @Deprecated
    Task<BeginSignInResult> i0(@NonNull BeginSignInRequest beginSignInRequest);
}
