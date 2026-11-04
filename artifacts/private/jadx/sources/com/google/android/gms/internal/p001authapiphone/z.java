package com.google.android.gms.internal.p001authapiphone;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import okhttp3.internal.ws.g;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends k {
    public z(Context context, Looper looper, h hVar, f fVar, r rVar) {
        super(context, looper, g.f334652s, hVar, fVar, rVar);
    }

    @Override // com.google.android.gms.common.internal.f
    public final Feature[] C() {
        return d.f107479e;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String N() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String O() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean b0() {
        return true;
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder);
    }
}
