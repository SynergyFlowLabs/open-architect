package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class a0 extends BasePendingResult<Status> {
    @Deprecated
    public a0(@NonNull Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @NonNull
    protected final /* bridge */ /* synthetic */ com.google.android.gms.common.api.v k(@NonNull Status status) {
        return status;
    }

    @g6.a
    public a0(@NonNull com.google.android.gms.common.api.l lVar) {
        super(lVar);
    }
}
