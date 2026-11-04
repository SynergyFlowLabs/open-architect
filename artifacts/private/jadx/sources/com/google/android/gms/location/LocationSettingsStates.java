package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "LocationSettingsStatesCreator")
@SafeParcelable.g({1000})
public final class LocationSettingsStates extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "isGpsUsable", id = 1)
    private final boolean f109601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "isNetworkLocationUsable", id = 2)
    private final boolean f109602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "isBleUsable", id = 3)
    private final boolean f109603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "isGpsPresent", id = 4)
    private final boolean f109604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "isNetworkLocationPresent", id = 5)
    private final boolean f109605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "isBlePresent", id = 6)
    private final boolean f109606f;

    @SafeParcelable.b
    public LocationSettingsStates(@SafeParcelable.e(id = 1) boolean z10, @SafeParcelable.e(id = 2) boolean z11, @SafeParcelable.e(id = 3) boolean z12, @SafeParcelable.e(id = 4) boolean z13, @SafeParcelable.e(id = 5) boolean z14, @SafeParcelable.e(id = 6) boolean z15) {
        this.f109601a = z10;
        this.f109602b = z11;
        this.f109603c = z12;
        this.f109604d = z13;
        this.f109605e = z14;
        this.f109606f = z15;
    }

    @androidx.annotation.p0
    public static LocationSettingsStates O1(@NonNull Intent intent) {
        return (LocationSettingsStates) i6.c.b(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public boolean T1() {
        return this.f109606f;
    }

    public boolean b2() {
        return this.f109603c;
    }

    public boolean e2() {
        return this.f109604d;
    }

    public boolean f2() {
        return this.f109601a;
    }

    public boolean n2() {
        return this.f109604d || this.f109605e;
    }

    public boolean p2() {
        return this.f109601a || this.f109602b;
    }

    public boolean q2() {
        return this.f109605e;
    }

    public boolean s2() {
        return this.f109602b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.g(parcel, 1, f2());
        i6.b.g(parcel, 2, s2());
        i6.b.g(parcel, 3, b2());
        i6.b.g(parcel, 4, e2());
        i6.b.g(parcel, 5, q2());
        i6.b.g(parcel, 6, T1());
        i6.b.b(parcel, iA);
    }
}
