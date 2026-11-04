package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface b {
    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    com.google.android.gms.common.api.p<Status> a(@NonNull com.google.android.gms.common.api.l lVar, @NonNull PendingIntent pendingIntent);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    com.google.android.gms.common.api.p<Status> b(@NonNull com.google.android.gms.common.api.l lVar, long j10, @NonNull PendingIntent pendingIntent);
}
