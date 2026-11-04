package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
final class b7 extends com.google.android.gms.common.internal.k {
    b7(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.r rVar) {
        super(context, looper, 224, hVar, fVar, rVar);
    }

    @Override // com.google.android.gms.common.internal.f
    public final Feature[] C() {
        return new Feature[]{com.google.android.gms.auth.k.f105712l, com.google.android.gms.auth.k.f105711k, com.google.android.gms.auth.k.f105701a};
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String N() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String O() {
        return "com.google.android.gms.auth.account.authapi.START";
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
    public final void e(String str) {
        "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str));
        super.e(str);
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final int n() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.f
    @androidx.annotation.p0
    protected final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return iInterfaceQueryLocalInterface instanceof i7 ? (i7) iInterfaceQueryLocalInterface : new i7(iBinder);
    }
}
