package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.annotation.p0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final Messenger f105813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final zzd f105814b;

    y(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f105813a = new Messenger(iBinder);
            this.f105814b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, b.L1)) {
                "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
                throw new RemoteException();
            }
            this.f105814b = new zzd(iBinder);
            this.f105813a = null;
        }
    }

    final void a(Message message) throws RemoteException {
        Messenger messenger = this.f105813a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.f105814b;
        if (zzdVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        zzdVar.b(message);
    }
}
