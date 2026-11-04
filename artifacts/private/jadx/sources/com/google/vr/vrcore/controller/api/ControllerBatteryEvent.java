package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ControllerBatteryEvent extends ControllerEvent {
    public static final Parcelable.Creator<ControllerBatteryEvent> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f129967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f129968d;

    class a implements Parcelable.Creator<ControllerBatteryEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControllerBatteryEvent createFromParcel(Parcel parcel) {
            return new ControllerBatteryEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControllerBatteryEvent[] newArray(int i10) {
            return new ControllerBatteryEvent[i10];
        }
    }

    public ControllerBatteryEvent() {
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final int a() {
        return super.a() + 8;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final void b(Parcel parcel) {
        super.b(parcel);
        this.f129967c = parcel.readInt();
        this.f129968d = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f129967c);
        parcel.writeInt(this.f129968d ? 1 : 0);
    }

    public ControllerBatteryEvent(Parcel parcel) {
        b(parcel);
    }
}
