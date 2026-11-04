package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ControllerGyroEvent extends ControllerEvent {
    public static final Parcelable.Creator<ControllerGyroEvent> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f129993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f129994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f129995e;

    class a implements Parcelable.Creator<ControllerGyroEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControllerGyroEvent createFromParcel(Parcel parcel) {
            return new ControllerGyroEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControllerGyroEvent[] newArray(int i10) {
            return new ControllerGyroEvent[i10];
        }
    }

    public ControllerGyroEvent() {
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final int a() {
        return super.a() + 12;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final void b(Parcel parcel) {
        super.b(parcel);
        this.f129993c = parcel.readFloat();
        this.f129994d = parcel.readFloat();
        this.f129995e = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f129993c);
        parcel.writeFloat(this.f129994d);
        parcel.writeFloat(this.f129995e);
    }

    public ControllerGyroEvent(Parcel parcel) {
        b(parcel);
    }
}
