package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.location.c2;
import com.google.android.gms.internal.location.e2;
import com.google.android.gms.internal.location.u1;
import com.google.android.gms.internal.location.w1;

/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d> f109680a = com.google.android.gms.internal.location.k0.f108133o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final e f109681b = new com.google.android.gms.internal.location.d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final j f109682c = new u1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final v f109683d = new c2();

    private p() {
    }

    @NonNull
    public static f a(@NonNull Activity activity) {
        return new com.google.android.gms.internal.location.k0(activity);
    }

    @NonNull
    public static f b(@NonNull Context context) {
        return new com.google.android.gms.internal.location.k0(context);
    }

    @NonNull
    public static g c(@NonNull Activity activity) {
        return new com.google.android.gms.internal.location.l1(activity);
    }

    @NonNull
    public static g d(@NonNull Context context) {
        return new com.google.android.gms.internal.location.l1(context);
    }

    @NonNull
    public static k e(@NonNull Activity activity) {
        return new w1(activity);
    }

    @NonNull
    public static k f(@NonNull Context context) {
        return new w1(context);
    }

    @NonNull
    public static w g(@NonNull Activity activity) {
        return new e2(activity);
    }

    @NonNull
    public static w h(@NonNull Context context) {
        return new e2(context);
    }
}
