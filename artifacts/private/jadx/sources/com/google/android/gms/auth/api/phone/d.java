package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.p001authapiphone.u;
import com.google.android.gms.internal.p001authapiphone.y;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final String f105552a = "com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final String f105553b = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final String f105554c = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE_LINE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final String f105555d = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";

    private d() {
    }

    @NonNull
    public static b a(@NonNull Activity activity) {
        return new u(activity);
    }

    @NonNull
    public static b b(@NonNull Context context) {
        return new u(context);
    }

    @NonNull
    public static c c(@NonNull Activity activity) {
        return new y(activity);
    }

    @NonNull
    public static c d(@NonNull Context context) {
        return new y(context);
    }
}
