package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ControllerPositionEvent extends ControllerEvent {
    public static final Parcelable.Creator<ControllerPositionEvent> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f130005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f130006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f130007e;

    class a implements Parcelable.Creator<ControllerPositionEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControllerPositionEvent createFromParcel(Parcel parcel) {
            return new ControllerPositionEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControllerPositionEvent[] newArray(int i10) {
            return new ControllerPositionEvent[i10];
        }
    }

    public ControllerPositionEvent() {
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final int a() {
        return super.a() + 12;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final void b(Parcel parcel) {
        super.b(parcel);
        this.f130005c = parcel.readFloat();
        this.f130006d = parcel.readFloat();
        this.f130007e = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f130005c);
        parcel.writeFloat(this.f130006d);
        parcel.writeFloat(this.f130007e);
    }

    public ControllerPositionEvent(Parcel parcel) {
        b(parcel);
    }
}
