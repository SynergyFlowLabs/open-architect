package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final String f105556a = "com.google.android.gms.auth.api.phone.permission.SEND";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final String f105557b = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final String f105558c = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final String f105559d = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final String f105560e = "com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public static final String f105561f = "com.google.android.gms.auth.api.phone.EXTRA_SIM_SUBSCRIPTION_ID";

    private e() {
    }

    @NonNull
    public static g a(@NonNull Activity activity) {
        return new com.google.android.gms.internal.p001authapiphone.c(activity);
    }

    @NonNull
    public static g b(@NonNull Context context) {
        return new com.google.android.gms.internal.p001authapiphone.c(context);
    }
}
