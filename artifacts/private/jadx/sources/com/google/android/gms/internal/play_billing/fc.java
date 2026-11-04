package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class fc {
    @NonNull
    public static l4 a(@NonNull com.android.billingclient.api.b2 b2Var) {
        bc bcVar = new bc();
        ec ecVar = new ec(bcVar);
        bcVar.f109066b = ecVar;
        bcVar.f109065a = b2Var.getClass();
        try {
            bcVar.f109065a = b2Var.a(bcVar);
            return ecVar;
        } catch (Exception e10) {
            ecVar.b(e10);
            return ecVar;
        }
    }
}
