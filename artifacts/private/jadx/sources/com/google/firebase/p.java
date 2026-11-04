package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.z;

/* JADX INFO: loaded from: classes5.dex */
@g6.a
public class p implements z {
    @Override // com.google.android.gms.common.api.internal.z
    @NonNull
    public final Exception a(@NonNull Status status) {
        return status.b2() == 8 ? new o(status.z2()) : new e(status.z2());
    }
}
