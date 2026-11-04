package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public interface f extends com.google.android.gms.common.api.m<com.google.android.gms.common.api.a.d.C0969d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final String f109649a = "mockLocation";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final String f109650b = "verticalAccuracy";

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Task<Location> A(@NonNull LastLocationRequest lastLocationRequest);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Task<LocationAvailability> C();

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Task<Void> H(@NonNull LocationRequest locationRequest, @NonNull n nVar, @androidx.annotation.p0 Looper looper);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Task<Void> I(@NonNull Location location);

    @NonNull
    Task<Void> J(@NonNull o oVar);

    @NonNull
    Task<Void> K(@NonNull n nVar);

    @NonNull
    Task<Void> L(@NonNull PendingIntent pendingIntent);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Task<Void> M(@NonNull LocationRequest locationRequest, @NonNull Executor executor, @NonNull n nVar);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Task<Void> N(@NonNull LocationRequest locationRequest, @NonNull Executor executor, @NonNull o oVar);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Task<Void> R(@NonNull LocationRequest locationRequest, @NonNull o oVar, @androidx.annotation.p0 Looper looper);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Task<Location> d(int i10, @androidx.annotation.p0 com.google.android.gms.tasks.a aVar);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Task<Location> d0();

    @NonNull
    @Deprecated
    Task<Void> f0(@NonNull d dVar);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Task<Void> g(boolean z10);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Task<Location> h0(@NonNull CurrentLocationRequest currentLocationRequest, @androidx.annotation.p0 com.google.android.gms.tasks.a aVar);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Task<Void> l(@NonNull LocationRequest locationRequest, @NonNull PendingIntent pendingIntent);

    @NonNull
    @Deprecated
    Task<Void> p(@NonNull DeviceOrientationRequest deviceOrientationRequest, @NonNull Executor executor, @NonNull d dVar);

    @NonNull
    Task<Void> q();

    @NonNull
    @Deprecated
    Task<Void> v(@NonNull DeviceOrientationRequest deviceOrientationRequest, @NonNull d dVar, @androidx.annotation.p0 Looper looper);
}
