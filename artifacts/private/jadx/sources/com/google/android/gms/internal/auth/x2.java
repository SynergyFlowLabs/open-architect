package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x2 extends x implements y3 {
    public static y3 k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        return iInterfaceQueryLocalInterface instanceof y3 ? (y3) iInterfaceQueryLocalInterface : new w1(iBinder);
    }
}
