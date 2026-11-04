package com.google.vr.vrcore.performance.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class TimestampedTemperature implements Parcelable {
    public static final Parcelable.Creator<TimestampedTemperature> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f130071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f130072b;

    class a implements Parcelable.Creator<TimestampedTemperature> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimestampedTemperature createFromParcel(Parcel parcel) {
            return new TimestampedTemperature(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimestampedTemperature[] newArray(int i10) {
            return new TimestampedTemperature[i10];
        }
    }

    public TimestampedTemperature() {
    }

    public void a(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int i10 = parcel.readInt();
        this.f130071a = parcel.readLong();
        this.f130072b = parcel.readFloat();
        parcel.setDataPosition(iDataPosition + i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(16);
        parcel.writeLong(this.f130071a);
        parcel.writeFloat(this.f130072b);
        if (parcel.dataPosition() - iDataPosition != 16) {
            throw new IllegalStateException("Parcelable implemented incorrectly, PARCEL_SIZE must include the size of each parcelled field.");
        }
    }

    public TimestampedTemperature(Parcel parcel) {
        a(parcel);
    }
}
