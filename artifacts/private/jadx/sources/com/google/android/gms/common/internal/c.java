package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class c {
    @NonNull
    @g6.a
    public static com.google.android.gms.common.api.b a(@NonNull Status status) {
        return status.f2() ? new com.google.android.gms.common.api.s(status) : new com.google.android.gms.common.api.b(status);
    }
}
