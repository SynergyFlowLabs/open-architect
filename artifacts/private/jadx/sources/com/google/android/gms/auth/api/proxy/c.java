package com.google.android.gms.auth.api.proxy;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
@a0
@g6.a
public interface c extends m<com.google.android.gms.auth.api.c> {
    @NonNull
    @g6.a
    Task<ProxyResponse> S(@NonNull ProxyRequest proxyRequest);

    @NonNull
    @g6.a
    Task<String> m();
}
