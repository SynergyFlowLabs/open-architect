package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class e9 extends ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e9(g9 g9Var, Handler handler) {
        super(null);
        Objects.requireNonNull(g9Var);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        v9.c();
    }
}
