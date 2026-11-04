package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.identity.e;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends k {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final Bundle f107498v3;

    public a0(Context context, Looper looper, e eVar, h hVar, f fVar, r rVar) {
        super(context, looper, 219, hVar, fVar, rVar);
        Bundle bundle = new Bundle();
        bundle.putString("session_id", null);
        this.f107498v3 = bundle;
    }

    @Override // com.google.android.gms.common.internal.f
    public final Feature[] C() {
        return s.f107538k;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final Bundle I() {
        return this.f107498v3;
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String N() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String O() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        return iInterfaceQueryLocalInterface instanceof e0 ? (e0) iInterfaceQueryLocalInterface : new e0(iBinder);
    }
}
