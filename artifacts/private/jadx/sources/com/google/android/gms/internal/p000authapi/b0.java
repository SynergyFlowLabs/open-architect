package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.identity.j;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends k {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final Bundle f107501v3;

    public b0(Context context, Looper looper, j jVar, h hVar, f fVar, r rVar) {
        super(context, looper, 223, hVar, fVar, rVar);
        this.f107501v3 = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.f
    public final Feature[] C() {
        return s.f107538k;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final Bundle I() {
        return this.f107501v3;
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String N() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String O() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new h0(iBinder);
    }
}
