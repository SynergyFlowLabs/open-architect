package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.x2;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f105723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f105724b;

    n(String str, Bundle bundle) {
        this.f105723a = str;
        this.f105724b = bundle;
    }

    @Override // com.google.android.gms.auth.q
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws RemoteException, IOException, b {
        Bundle bundleSb = x2.k(iBinder).sb(this.f105723a, this.f105724b);
        r.m(bundleSb);
        String string = bundleSb.getString("Error");
        if (bundleSb.getBoolean("booleanResult")) {
            return null;
        }
        throw new b(string);
    }
}
