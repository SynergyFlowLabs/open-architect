package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface d extends IInterface {

    public static abstract class a extends com.google.android.gms.internal.common.r implements d {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @NonNull
        public static d k(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new s(iBinder);
        }
    }
}
