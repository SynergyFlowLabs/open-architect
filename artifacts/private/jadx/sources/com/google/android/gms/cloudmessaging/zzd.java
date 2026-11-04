package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Messenger f105815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b f105816b;

    public zzd(IBinder iBinder) {
        this.f105815a = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f105815a;
        return messenger != null ? messenger.getBinder() : this.f105816b.asBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f105815a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f105816b.zc(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@p0 Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((zzd) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f105815a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f105816b.asBinder());
        }
    }
}
