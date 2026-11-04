package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.u0;
import com.google.android.gms.internal.auth.x2;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f105726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f105727b;

    p(String str, Context context) {
        this.f105726a = str;
        this.f105727b = context;
    }

    @Override // com.google.android.gms.auth.q
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws RemoteException, IOException, b {
        Bundle bundleK7 = x2.k(iBinder).K7(this.f105726a);
        r.m(bundleK7);
        String string = bundleK7.getString("Error");
        Intent intent = (Intent) bundleK7.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundleK7.getParcelable("userRecoveryPendingIntent");
        if (u0.SUCCESS.equals(u0.b(string))) {
            return Boolean.TRUE;
        }
        r.x(this.f105727b, "requestGoogleAccountsAccess", string, intent, pendingIntent);
        throw new b("Invalid state. Shouldn't happen");
    }
}
