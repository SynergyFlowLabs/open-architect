package com.google.android.gms.location;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public interface g extends com.google.android.gms.common.api.m<com.google.android.gms.common.api.a.d.C0969d> {
    @NonNull
    Task<Void> G(@NonNull d dVar);

    @NonNull
    Task<Void> r(@NonNull DeviceOrientationRequest deviceOrientationRequest, @NonNull Executor executor, @NonNull d dVar);
}
