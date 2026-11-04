package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
final class b3 implements com.google.android.gms.tasks.c {
    b3() {
    }

    @Override // com.google.android.gms.tasks.c
    public final /* bridge */ /* synthetic */ Object a(@NonNull Task task) throws Exception {
        if (((Boolean) task.q()).booleanValue()) {
            return null;
        }
        throw new com.google.android.gms.common.api.b(new Status(13, "listener already unregistered"));
    }
}
