package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d> f109629a = com.google.android.gms.internal.location.k.f108131o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final b f109630b = new com.google.android.gms.internal.location.g();

    private a() {
    }

    @NonNull
    public static c a(@NonNull Activity activity) {
        return new com.google.android.gms.internal.location.k(activity);
    }

    @NonNull
    public static c b(@NonNull Context context) {
        return new com.google.android.gms.internal.location.k(context);
    }
}
