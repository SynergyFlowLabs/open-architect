package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ControllerEvent implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f129972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f129973b = 0;

    public int a() {
        return 12;
    }

    public void b(Parcel parcel) {
        this.f129972a = parcel.readLong();
        this.f129973b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f129972a);
        parcel.writeInt(this.f129973b);
    }
}
