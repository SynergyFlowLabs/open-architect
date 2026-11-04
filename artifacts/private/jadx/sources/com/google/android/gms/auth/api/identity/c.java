package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.p000authapi.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private c() {
    }

    @NonNull
    public static a a(@NonNull Activity activity) {
        return new u0((Activity) com.google.android.gms.common.internal.w.r(activity), new e(null));
    }

    @NonNull
    public static a b(@NonNull Context context) {
        return new u0((Context) com.google.android.gms.common.internal.w.r(context), new e(null));
    }

    @NonNull
    public static b c(@NonNull Activity activity) {
        return new com.google.android.gms.internal.p000authapi.g((Activity) com.google.android.gms.common.internal.w.r(activity), new j());
    }

    @NonNull
    public static b d(@NonNull Context context) {
        return new com.google.android.gms.internal.p000authapi.g((Context) com.google.android.gms.common.internal.w.r(context), new j());
    }

    @NonNull
    public static d e(@NonNull Activity activity) {
        return new com.google.android.gms.internal.p000authapi.q((Activity) com.google.android.gms.common.internal.w.r(activity), new w());
    }

    @NonNull
    public static d f(@NonNull Context context) {
        return new com.google.android.gms.internal.p000authapi.q((Context) com.google.android.gms.common.internal.w.r(context), new w());
    }
}
