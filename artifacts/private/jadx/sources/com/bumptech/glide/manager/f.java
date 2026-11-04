package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f97202a = "ConnectivityMonitor";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f97203b = "android.permission.ACCESS_NETWORK_STATE";

    @Override // com.bumptech.glide.manager.d
    @NonNull
    public c a(@NonNull Context context, @NonNull c.a aVar) {
        return androidx.core.content.d.a(context, f97203b) == 0 ? new e(context, aVar) : new j();
    }
}
