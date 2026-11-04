package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.l1
public final class v1 extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private f f106658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f106659b;

    public v1(@NonNull f fVar, int i10) {
        this.f106658a = fVar;
        this.f106659b = i10;
    }

    @Override // com.google.android.gms.common.internal.q
    @androidx.annotation.g
    public final void v6(int i10, @androidx.annotation.p0 Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.q
    @androidx.annotation.g
    public final void w8(int i10, @NonNull IBinder iBinder, @NonNull zzk zzkVar) {
        f fVar = this.f106658a;
        w.s(fVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        w.r(zzkVar);
        f.l0(fVar, zzkVar);
        xa(i10, iBinder, zzkVar.f106694a);
    }

    @Override // com.google.android.gms.common.internal.q
    @androidx.annotation.g
    public final void xa(int i10, @NonNull IBinder iBinder, @androidx.annotation.p0 Bundle bundle) {
        w.s(this.f106658a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f106658a.W(i10, iBinder, bundle, this.f106659b);
        this.f106658a = null;
    }
}
