package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends com.google.android.gms.common.api.m<e> {
    @NonNull
    Task<AuthorizationResult> D(@NonNull AuthorizationRequest authorizationRequest);

    @NonNull
    AuthorizationResult i(@p0 Intent intent) throws com.google.android.gms.common.api.b;
}
