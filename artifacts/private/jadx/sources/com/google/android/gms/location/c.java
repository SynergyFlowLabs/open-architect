package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public interface c extends com.google.android.gms.common.api.m<com.google.android.gms.common.api.a.d.C0969d> {
    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    Task<Void> E(@NonNull PendingIntent pendingIntent);

    @NonNull
    Task<Void> W(@NonNull PendingIntent pendingIntent);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    Task<Void> a0(@NonNull PendingIntent pendingIntent);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    Task<Void> b0(long j10, @NonNull PendingIntent pendingIntent);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    Task<Void> f(@NonNull ActivityTransitionRequest activityTransitionRequest, @NonNull PendingIntent pendingIntent);

    @NonNull
    @androidx.annotation.a1(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    Task<Void> y(@NonNull PendingIntent pendingIntent, @NonNull SleepSegmentRequest sleepSegmentRequest);
}
