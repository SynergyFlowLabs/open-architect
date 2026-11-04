package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class w8 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ z8 f108942a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w8(z8 z8Var, Handler handler) {
        super(null);
        Objects.requireNonNull(z8Var);
        this.f108942a = z8Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f108942a.e();
    }
}
