package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ControllerButtonEvent extends ControllerEvent {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f129970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f129971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f129969e = {0, 1, 2, 3, 5, 6};
    public static final Parcelable.Creator<ControllerButtonEvent> CREATOR = new a();

    class a implements Parcelable.Creator<ControllerButtonEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControllerButtonEvent createFromParcel(Parcel parcel) {
            return new ControllerButtonEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControllerButtonEvent[] newArray(int i10) {
            return new ControllerButtonEvent[i10];
        }
    }

    public ControllerButtonEvent() {
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final int a() {
        return super.a() + 8;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final void b(Parcel parcel) {
        super.b(parcel);
        this.f129970c = parcel.readInt();
        this.f129971d = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f129970c);
        parcel.writeInt(this.f129971d ? 1 : 0);
    }

    public ControllerButtonEvent(Parcel parcel) {
        b(parcel);
    }
}
