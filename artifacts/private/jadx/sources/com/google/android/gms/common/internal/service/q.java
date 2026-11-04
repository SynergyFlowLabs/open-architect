package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.e0;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends com.google.android.gms.common.internal.k {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final e0 f106636v3;

    public q(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, e0 e0Var, com.google.android.gms.common.api.internal.f fVar, r rVar) {
        super(context, looper, 270, hVar, fVar, rVar);
        this.f106636v3 = e0Var;
    }

    @Override // com.google.android.gms.common.internal.f
    public final Feature[] C() {
        return com.google.android.gms.internal.base.d.f107928b;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final Bundle I() {
        return this.f106636v3.b();
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String N() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String O() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.f
    protected final boolean R() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final int n() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.f
    @p0
    protected final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder);
    }
}
