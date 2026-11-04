package com.google.android.gms.common.moduleinstall;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public interface c extends m<com.google.android.gms.common.api.a.d.C0969d> {
    @NonNull
    Task<ModuleAvailabilityResponse> B(@NonNull n... nVarArr);

    @NonNull
    Task<Void> Y(@NonNull n... nVarArr);

    @NonNull
    Task<Boolean> k(@NonNull a aVar);

    @NonNull
    Task<ModuleInstallIntentResponse> s(@NonNull n... nVarArr);

    @NonNull
    Task<Void> t(@NonNull n... nVarArr);

    @NonNull
    Task<ModuleInstallResponse> x(@NonNull d dVar);
}
