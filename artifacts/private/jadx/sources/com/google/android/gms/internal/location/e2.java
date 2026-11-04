package com.google.android.gms.internal.location;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public final class e2 extends com.google.android.gms.common.api.k implements com.google.android.gms.location.w {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f108104n = 0;

    public e2(@NonNull Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) k0.f108133o, com.google.android.gms.common.api.a.d.N1, com.google.android.gms.common.api.k.a.f106306c);
    }

    @Override // com.google.android.gms.location.w
    public final Task<com.google.android.gms.location.q> U(final LocationSettingsRequest locationSettingsRequest) {
        return r0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.f2
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.tasks.l lVar = (com.google.android.gms.tasks.l) obj2;
                d3 d3Var = (d3) obj;
                LocationSettingsRequest locationSettingsRequest2 = locationSettingsRequest;
                com.google.android.gms.common.internal.w.b(locationSettingsRequest2 != null, "locationSettingsRequest can't be null");
                ((q4) d3Var.M()).q8(locationSettingsRequest2, new i2(lVar), null);
            }
        }).f(2426).a());
    }

    @Override // com.google.android.gms.location.w
    public final Task<Boolean> j0() {
        return r0(com.google.android.gms.common.api.internal.b0.a().c(g2.f108113a).f(2444).e(com.google.android.gms.location.b1.f109643m).a());
    }

    public e2(@NonNull Context context) {
        super(context, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) k0.f108133o, com.google.android.gms.common.api.a.d.N1, com.google.android.gms.common.api.k.a.f106306c);
    }
}
