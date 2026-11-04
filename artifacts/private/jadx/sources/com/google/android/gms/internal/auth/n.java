package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends com.google.android.gms.common.internal.k {
    public n(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.l.b bVar, com.google.android.gms.common.api.l.c cVar) {
        super(context, looper, 120, hVar, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.f
    public final Feature[] C() {
        return new Feature[]{com.google.android.gms.auth.k.f105714n};
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String N() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String O() {
        return "com.google.android.gms.auth.account.workaccount.START";
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
        return com.google.android.gms.auth.account.g.k(iBinder);
    }
}
