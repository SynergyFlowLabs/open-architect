package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public interface b extends com.google.android.gms.common.api.m<j> {
    @NonNull
    Task<SaveAccountLinkingTokenResult> Z(@NonNull SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest);

    @NonNull
    Status n(@p0 Intent intent);

    @NonNull
    @Deprecated
    Task<SavePasswordResult> w(@NonNull SavePasswordRequest savePasswordRequest);
}
