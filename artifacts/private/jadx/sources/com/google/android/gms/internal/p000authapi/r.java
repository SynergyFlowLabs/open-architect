package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.identity.w;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends k {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final Bundle f107525v3;

    public r(Context context, Looper looper, w wVar, h hVar, f fVar, com.google.android.gms.common.api.internal.r rVar) {
        super(context, looper, 212, hVar, fVar, rVar);
        this.f107525v3 = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.f
    public final Feature[] C() {
        return s.f107538k;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final Bundle I() {
        return this.f107525v3;
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String N() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String O() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // com.google.android.gms.common.internal.f
    protected final boolean R() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean b0() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final int n() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.f
    @p0
    protected final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof q0 ? (q0) iInterfaceQueryLocalInterface : new q0(iBinder);
    }
}
