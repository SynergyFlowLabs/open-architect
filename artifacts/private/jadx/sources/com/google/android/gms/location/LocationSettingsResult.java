package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "LocationSettingsResultCreator")
@SafeParcelable.g({1000})
public final class LocationSettingsResult extends AbstractSafeParcelable implements com.google.android.gms.common.api.v {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStatus", id = 1)
    private final Status f109599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getLocationSettingsStates", id = 2)
    @androidx.annotation.p0
    private final LocationSettingsStates f109600b;

    @SafeParcelable.b
    public LocationSettingsResult(@NonNull @SafeParcelable.e(id = 1) Status status, @SafeParcelable.e(id = 2) @androidx.annotation.p0 LocationSettingsStates locationSettingsStates) {
        this.f109599a = status;
        this.f109600b = locationSettingsStates;
    }

    @androidx.annotation.p0
    public LocationSettingsStates O1() {
        return this.f109600b;
    }

    @Override // com.google.android.gms.common.api.v
    @NonNull
    public Status t() {
        return this.f109599a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, t(), i10, false);
        i6.b.S(parcel, 2, O1(), i10, false);
        i6.b.b(parcel, iA);
    }
}
