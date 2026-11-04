package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t extends com.google.android.gms.internal.p000authapi.w implements u {
    public t() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.w
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.internal.p000authapi.x.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) com.google.android.gms.internal.p000authapi.x.a(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.x.b(parcel);
                va(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) com.google.android.gms.internal.p000authapi.x.a(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.x.b(parcel);
                t7(status2);
                break;
            case com.planner5d.library.engine.input.f.b.f160733u1 /* 103 */:
                Status status3 = (Status) com.google.android.gms.internal.p000authapi.x.a(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.x.b(parcel);
                Y6(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
