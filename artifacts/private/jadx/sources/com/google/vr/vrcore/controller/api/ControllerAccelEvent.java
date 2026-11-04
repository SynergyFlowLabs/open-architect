package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ControllerAccelEvent extends ControllerEvent {
    public static final Parcelable.Creator<ControllerAccelEvent> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f129964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f129965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f129966e;

    class a implements Parcelable.Creator<ControllerAccelEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControllerAccelEvent createFromParcel(Parcel parcel) {
            return new ControllerAccelEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControllerAccelEvent[] newArray(int i10) {
            return new ControllerAccelEvent[i10];
        }
    }

    public ControllerAccelEvent() {
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final int a() {
        return super.a() + 12;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final void b(Parcel parcel) {
        super.b(parcel);
        this.f129964c = parcel.readFloat();
        this.f129965d = parcel.readFloat();
        this.f129966e = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f129964c);
        parcel.writeFloat(this.f129965d);
        parcel.writeFloat(this.f129966e);
    }

    public ControllerAccelEvent(Parcel parcel) {
        b(parcel);
    }
}
