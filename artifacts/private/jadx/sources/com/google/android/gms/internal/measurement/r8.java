package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class r8 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ t8 f108769a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r8(t8 t8Var, Handler handler) {
        super(null);
        Objects.requireNonNull(t8Var);
        this.f108769a = t8Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f108769a.b().set(true);
    }
}
