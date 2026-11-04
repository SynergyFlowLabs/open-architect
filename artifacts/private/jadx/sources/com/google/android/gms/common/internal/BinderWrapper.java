package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes4.dex */
@KeepName
@g6.a
public final class BinderWrapper implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new z1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f106458a;

    @g6.a
    public BinderWrapper(@NonNull IBinder iBinder) {
        this.f106458a = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeStrongBinder(this.f106458a);
    }
}
