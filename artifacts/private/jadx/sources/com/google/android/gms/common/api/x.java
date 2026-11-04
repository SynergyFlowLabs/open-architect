package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x<R extends v> implements w<R> {
    @Override // com.google.android.gms.common.api.w
    @g6.a
    public final void a(@NonNull R r10) {
        Status statusT = r10.t();
        if (statusT.q2()) {
            c(r10);
            return;
        }
        b(statusT);
        if (r10 instanceof r) {
            try {
                ((r) r10).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(r10));
            }
        }
    }

    public abstract void b(@NonNull Status status);

    public abstract void c(@NonNull R r10);
}
