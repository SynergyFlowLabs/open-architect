package com.google.vr.vrcore.logging.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.sdk.deps.c7;

/* JADX INFO: loaded from: classes5.dex */
public class VREventParcelable implements Parcelable {
    public static final Parcelable.Creator<VREventParcelable> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f130069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.common.logging.nano.a.C1088a f130070b;

    class a implements Parcelable.Creator<VREventParcelable> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VREventParcelable createFromParcel(Parcel parcel) {
            return new VREventParcelable(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VREventParcelable[] newArray(int i10) {
            return new VREventParcelable[i10];
        }
    }

    public VREventParcelable(int i10, com.google.common.logging.nano.a.C1088a c1088a) {
        this.f130069a = i10;
        this.f130070b = c1088a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f130069a);
        com.google.common.logging.nano.a.C1088a c1088a = this.f130070b;
        if (c1088a != null) {
            parcel.writeByteArray(c7.j(c1088a));
        }
    }

    private VREventParcelable(Parcel parcel) {
        this.f130069a = parcel.readInt();
        try {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            if (bArrCreateByteArray.length > 0) {
                this.f130070b = com.google.common.logging.nano.a.C1088a.s(bArrCreateByteArray);
            }
        } catch (Exception e10) {
            new StringBuilder(String.valueOf(e10).length() + 35);
        }
    }

    /* synthetic */ VREventParcelable(Parcel parcel, a aVar) {
        this(parcel);
    }
}
