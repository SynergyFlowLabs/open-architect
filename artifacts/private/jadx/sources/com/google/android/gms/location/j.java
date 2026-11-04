package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface j {
    @NonNull
    com.google.android.gms.common.api.p<Status> a(@NonNull com.google.android.gms.common.api.l lVar, @NonNull PendingIntent pendingIntent);

    @NonNull
    @androidx.annotation.a1("android.permission.ACCESS_FINE_LOCATION")
    com.google.android.gms.common.api.p<Status> b(@NonNull com.google.android.gms.common.api.l lVar, @NonNull GeofencingRequest geofencingRequest, @NonNull PendingIntent pendingIntent);

    @NonNull
    com.google.android.gms.common.api.p<Status> c(@NonNull com.google.android.gms.common.api.l lVar, @NonNull List<String> list);

    @NonNull
    @androidx.annotation.a1("android.permission.ACCESS_FINE_LOCATION")
    @Deprecated
    com.google.android.gms.common.api.p<Status> d(@NonNull com.google.android.gms.common.api.l lVar, @NonNull List<h> list, @NonNull PendingIntent pendingIntent);
}
