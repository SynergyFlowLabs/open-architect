package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class z1 extends k0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.api.k f106290f;

    public z1(com.google.android.gms.common.api.k kVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f106290f = kVar;
    }

    @Override // com.google.android.gms.common.api.l
    public final void H(e3 e3Var) {
    }

    @Override // com.google.android.gms.common.api.l
    public final void I(e3 e3Var) {
    }

    @Override // com.google.android.gms.common.api.l
    public final <A extends com.google.android.gms.common.api.a.b, R extends com.google.android.gms.common.api.v, T extends e.a<R, A>> T l(@NonNull T t10) {
        return (T) this.f106290f.q0(t10);
    }

    @Override // com.google.android.gms.common.api.l
    public final <A extends com.google.android.gms.common.api.a.b, T extends e.a<? extends com.google.android.gms.common.api.v, A>> T m(@NonNull T t10) {
        return (T) this.f106290f.w0(t10);
    }

    @Override // com.google.android.gms.common.api.l
    public final Context q() {
        return this.f106290f.A0();
    }

    @Override // com.google.android.gms.common.api.l
    public final Looper r() {
        return this.f106290f.D0();
    }
}
