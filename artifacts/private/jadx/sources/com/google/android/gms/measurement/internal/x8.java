package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class x8 implements o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h7 f110682a;

    x8(y8 y8Var, h7 h7Var) {
        this.f110682a = h7Var;
        Objects.requireNonNull(y8Var);
    }

    @Override // com.google.android.gms.measurement.internal.o5
    public final boolean a() {
        return Log.isLoggable(this.f110682a.a().z(), 3);
    }
}
