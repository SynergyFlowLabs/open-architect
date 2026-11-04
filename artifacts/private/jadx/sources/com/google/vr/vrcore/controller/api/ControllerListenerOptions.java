package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class ControllerListenerOptions implements Parcelable {
    public static final Parcelable.Creator<ControllerListenerOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f129996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f129997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f129998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f129999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f130000e;

    class a implements Parcelable.Creator<ControllerListenerOptions> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControllerListenerOptions createFromParcel(Parcel parcel) {
            return new ControllerListenerOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControllerListenerOptions[] newArray(int i10) {
            return new ControllerListenerOptions[i10];
        }
    }

    public ControllerListenerOptions() {
        this.f129996a = true;
        this.f129999d = true;
    }

    public void a(Parcel parcel) {
        this.f129996a = parcel.readInt() != 0;
        this.f129997b = parcel.readInt() != 0;
        this.f129998c = parcel.readInt() != 0;
        this.f129999d = parcel.readInt() != 0;
        this.f130000e = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format(Locale.US, "ori=%b, gyro=%b, accel=%b, touch=%b, gestures=%b", Boolean.valueOf(this.f129996a), Boolean.valueOf(this.f129997b), Boolean.valueOf(this.f129998c), Boolean.valueOf(this.f129999d), Boolean.valueOf(this.f130000e));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f129996a ? 1 : 0);
        parcel.writeInt(this.f129997b ? 1 : 0);
        parcel.writeInt(this.f129998c ? 1 : 0);
        parcel.writeInt(this.f129999d ? 1 : 0);
        parcel.writeInt(this.f130000e ? 1 : 0);
    }

    public ControllerListenerOptions(int i10) {
        if ((i10 & 1) != 0) {
            this.f129996a = true;
        }
        if ((i10 & 2) != 0) {
            this.f129999d = true;
        }
        if ((i10 & 4) != 0) {
            this.f129997b = true;
        }
        if ((i10 & 8) != 0) {
            this.f129998c = true;
        }
        if ((i10 & 16) != 0) {
            this.f130000e = true;
        }
    }

    protected ControllerListenerOptions(Parcel parcel) {
        a(parcel);
    }
}
