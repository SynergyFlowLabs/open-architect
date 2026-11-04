package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class a {
    @NonNull
    @g6.a
    public static final a a(@NonNull Activity activity) {
        return new f1(e0.m(activity));
    }

    @NonNull
    @g6.a
    public abstract a b(@NonNull Runnable runnable);
}
