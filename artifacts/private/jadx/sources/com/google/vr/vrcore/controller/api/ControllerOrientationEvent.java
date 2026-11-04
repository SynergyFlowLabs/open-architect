package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ControllerOrientationEvent extends ControllerEvent {
    public static final Parcelable.Creator<ControllerOrientationEvent> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f130001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f130002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f130003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f130004f;

    class a implements Parcelable.Creator<ControllerOrientationEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControllerOrientationEvent createFromParcel(Parcel parcel) {
            return new ControllerOrientationEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControllerOrientationEvent[] newArray(int i10) {
            return new ControllerOrientationEvent[i10];
        }
    }

    public ControllerOrientationEvent() {
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final int a() {
        return super.a() + 16;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final void b(Parcel parcel) {
        super.b(parcel);
        this.f130001c = parcel.readFloat();
        this.f130002d = parcel.readFloat();
        this.f130003e = parcel.readFloat();
        this.f130004f = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f130001c);
        parcel.writeFloat(this.f130002d);
        parcel.writeFloat(this.f130003e);
        parcel.writeFloat(this.f130004f);
    }

    public ControllerOrientationEvent(Parcel parcel) {
        b(parcel);
    }
}
