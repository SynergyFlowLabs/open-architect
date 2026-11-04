package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface k extends com.google.android.gms.common.api.m<com.google.android.gms.common.api.a.d.C0969d> {
    @NonNull
    Task<Void> T(@NonNull PendingIntent pendingIntent);

    @NonNull
    Task<Void> e(@NonNull List<String> list);

    @NonNull
    @androidx.annotation.a1("android.permission.ACCESS_FINE_LOCATION")
    Task<Void> e0(@NonNull GeofencingRequest geofencingRequest, @NonNull PendingIntent pendingIntent);
}
