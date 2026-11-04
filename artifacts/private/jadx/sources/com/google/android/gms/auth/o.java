package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.x2;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AccountChangeEventsRequest f105725a;

    o(AccountChangeEventsRequest accountChangeEventsRequest) {
        this.f105725a = accountChangeEventsRequest;
    }

    @Override // com.google.android.gms.auth.q
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws RemoteException, IOException, b {
        AccountChangeEventsResponse accountChangeEventsResponseHc = x2.k(iBinder).Hc(this.f105725a);
        r.m(accountChangeEventsResponseHc);
        return accountChangeEventsResponseHc.O1();
    }
}
