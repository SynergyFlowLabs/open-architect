package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class x0 implements Parcelable.Creator<RemoteMessage> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f123796a = 0;

    static void c(RemoteMessage remoteMessage, Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.k(parcel, 2, remoteMessage.f123363a, false);
        i6.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @androidx.annotation.p0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        Bundle bundleG = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            if (i6.a.O(iX) != 2) {
                i6.a.h0(parcel, iX);
            } else {
                bundleG = i6.a.g(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new RemoteMessage(bundleG);
    }

    @Override // android.os.Parcelable.Creator
    @androidx.annotation.p0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteMessage[] newArray(int i10) {
        return new RemoteMessage[i10];
    }
}
