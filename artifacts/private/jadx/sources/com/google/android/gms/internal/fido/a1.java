package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends com.google.android.gms.common.internal.k {
    public a1(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.l.b bVar, com.google.android.gms.common.api.l.c cVar) {
        super(context, looper, com.planner5d.library.engine.input.f.b.G1, hVar, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.f
    public final Feature[] C() {
        return new Feature[]{k6.c.f307598h, k6.c.f307597g};
    }

    @Override // com.google.android.gms.common.internal.f
    protected final Bundle I() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String N() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    protected final String O() {
        return "com.google.android.gms.fido.fido2.regular.START";
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof d1 ? (d1) iInterfaceQueryLocalInterface : new d1(iBinder);
    }
}
