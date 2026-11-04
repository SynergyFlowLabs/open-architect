package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ControllerTrackingStatusEvent extends ControllerEvent {
    public static final Parcelable.Creator<ControllerTrackingStatusEvent> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f130012c = 0;

    class a implements Parcelable.Creator<ControllerTrackingStatusEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControllerTrackingStatusEvent createFromParcel(Parcel parcel) {
            return new ControllerTrackingStatusEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControllerTrackingStatusEvent[] newArray(int i10) {
            return new ControllerTrackingStatusEvent[i10];
        }
    }

    public ControllerTrackingStatusEvent() {
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final int a() {
        return super.a() + 8;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final void b(Parcel parcel) {
        int iDataPosition = parcel.dataPosition() + parcel.readInt();
        super.b(parcel);
        this.f130012c = parcel.readInt();
        parcel.setDataPosition(iDataPosition);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        int iA = a();
        parcel.writeInt(iA);
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f130012c);
        if (parcel.dataPosition() - iDataPosition != iA) {
            throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
        }
    }

    public ControllerTrackingStatusEvent(Parcel parcel) {
        b(parcel);
    }
}
