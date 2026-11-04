package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.g;
import com.google.android.gms.auth.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.k;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends k {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final h f107547v3;

    public y(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, h hVar2, l.b bVar, l.c cVar) {
        super(context, looper, 68, hVar, bVar, cVar);
        g gVar = new g(hVar2 == null ? h.f105426d : hVar2);
        gVar.a(t.a());
        this.f107547v3 = new h(gVar);
    }

    @Override // com.google.android.gms.common.internal.f
    protected final Bundle I() {
        return this.f107547v3.a();
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String N() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String O() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final int n() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof z ? (z) iInterfaceQueryLocalInterface : new z(iBinder);
    }
}
