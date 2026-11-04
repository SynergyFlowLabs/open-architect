package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ControllerTouchEvent extends ControllerEvent {
    public static final Parcelable.Creator<ControllerTouchEvent> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f130008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f130009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f130010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f130011f;

    class a implements Parcelable.Creator<ControllerTouchEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControllerTouchEvent createFromParcel(Parcel parcel) {
            return new ControllerTouchEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControllerTouchEvent[] newArray(int i10) {
            return new ControllerTouchEvent[i10];
        }
    }

    public ControllerTouchEvent() {
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final int a() {
        return super.a() + 16;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final void b(Parcel parcel) {
        super.b(parcel);
        this.f130008c = parcel.readInt();
        this.f130009d = parcel.readInt();
        this.f130010e = parcel.readFloat();
        this.f130011f = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f130008c);
        parcel.writeInt(this.f130009d);
        parcel.writeFloat(this.f130010e);
        parcel.writeFloat(this.f130011f);
    }

    public ControllerTouchEvent(Parcel parcel) {
        b(parcel);
    }
}
