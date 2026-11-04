package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 extends com.google.android.gms.common.internal.k {
    public j1(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.l.b bVar, com.google.android.gms.common.api.l.c cVar) {
        super(context, looper, me.relex.circleindicator.a.f332619e, hVar, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.f
    protected final Bundle I() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.thirdparty.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String N() {
        return "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService";
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String O() {
        return "com.google.android.gms.fido.u2f.thirdparty.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean b0() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final int n() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
        return iInterfaceQueryLocalInterface instanceof h1 ? (h1) iInterfaceQueryLocalInterface : new h1(iBinder);
    }
}
