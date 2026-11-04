package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final String f109647a = "com.google.android.location.LOCATION";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final String f109648b = "mockLocation";

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    com.google.android.gms.common.api.p<Status> a(@NonNull com.google.android.gms.common.api.l lVar, @NonNull LocationRequest locationRequest, @NonNull PendingIntent pendingIntent);

    @NonNull
    com.google.android.gms.common.api.p<Status> b(@NonNull com.google.android.gms.common.api.l lVar, @NonNull n nVar);

    @NonNull
    com.google.android.gms.common.api.p<Status> c(@NonNull com.google.android.gms.common.api.l lVar, @NonNull PendingIntent pendingIntent);

    @NonNull
    com.google.android.gms.common.api.p<Status> d(@NonNull com.google.android.gms.common.api.l lVar, @NonNull o oVar);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    com.google.android.gms.common.api.p<Status> e(@NonNull com.google.android.gms.common.api.l lVar, @NonNull Location location);

    @NonNull
    com.google.android.gms.common.api.p<Status> f(@NonNull com.google.android.gms.common.api.l lVar);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    com.google.android.gms.common.api.p<Status> g(@NonNull com.google.android.gms.common.api.l lVar, @NonNull LocationRequest locationRequest, @NonNull n nVar, @NonNull Looper looper);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    com.google.android.gms.common.api.p<Status> h(@NonNull com.google.android.gms.common.api.l lVar, @NonNull LocationRequest locationRequest, @NonNull o oVar);

    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.p0
    LocationAvailability i(@NonNull com.google.android.gms.common.api.l lVar);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    com.google.android.gms.common.api.p<Status> j(@NonNull com.google.android.gms.common.api.l lVar, boolean z10);

    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.p0
    Location k(@NonNull com.google.android.gms.common.api.l lVar);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    com.google.android.gms.common.api.p<Status> l(@NonNull com.google.android.gms.common.api.l lVar, @NonNull LocationRequest locationRequest, @NonNull o oVar, @NonNull Looper looper);
}
