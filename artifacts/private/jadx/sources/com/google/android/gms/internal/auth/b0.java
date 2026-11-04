package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends com.google.android.gms.common.internal.k {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final Bundle f107585v3;

    public b0(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.auth.api.c cVar, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.r rVar) {
        super(context, looper, 16, hVar, fVar, rVar);
        this.f107585v3 = cVar == null ? new Bundle() : cVar.a();
    }

    @Override // com.google.android.gms.common.internal.f
    protected final Bundle I() {
        return this.f107585v3;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String N() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String O() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean b0() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final boolean h() {
        com.google.android.gms.common.internal.h hVarS0 = s0();
        return (TextUtils.isEmpty(hVarS0.c()) || hVarS0.f(com.google.android.gms.auth.api.b.f105147a).isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final int n() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof e0 ? (e0) iInterfaceQueryLocalInterface : new e0(iBinder);
    }
}
