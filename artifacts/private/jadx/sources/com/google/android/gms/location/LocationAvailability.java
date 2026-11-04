package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "LocationAvailabilityCreator")
@SafeParcelable.g({1000})
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", getter = "getCellStatus", id = 1)
    private final int f109552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", getter = "getWifiStatus", id = 2)
    private final int f109553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = com.facebook.appevents.p.f99189d0, getter = "getElapsedRealtimeNs", id = 3)
    private final long f109554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "LocationAvailability.STATUS_UNSUCCESSFUL", id = 4)
    final int f109555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getBatchedStatus", id = 5)
    private final zzal[] f109556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public static final LocationAvailability f109550f = new LocationAvailability(0, 1, 1, 0, null, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public static final LocationAvailability f109551g = new LocationAvailability(1000, 1, 1, 0, null, false);

    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new z();

    @SafeParcelable.b
    LocationAvailability(@SafeParcelable.e(id = 4) int i10, @SafeParcelable.e(id = 1) int i11, @SafeParcelable.e(id = 2) int i12, @SafeParcelable.e(id = 3) long j10, @SafeParcelable.e(id = 5) zzal[] zzalVarArr, @SafeParcelable.e(id = 6) boolean z10) {
        this.f109555d = i10 < 1000 ? 0 : 1000;
        this.f109552a = i11;
        this.f109553b = i12;
        this.f109554c = j10;
        this.f109556e = zzalVarArr;
    }

    @androidx.annotation.p0
    public static LocationAvailability O1(@NonNull Intent intent) {
        if (!T1(intent)) {
            return null;
        }
        try {
            return (LocationAvailability) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @il.e(expression = {"#1"}, result = true)
    public static boolean T1(@androidx.annotation.p0 Intent intent) {
        return intent != null && intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public boolean b2() {
        return this.f109555d < 1000;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f109552a == locationAvailability.f109552a && this.f109553b == locationAvailability.f109553b && this.f109554c == locationAvailability.f109554c && this.f109555d == locationAvailability.f109555d && Arrays.equals(this.f109556e, locationAvailability.f109556e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(this.f109555d));
    }

    @NonNull
    public String toString() {
        boolean zB2 = b2();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zB2).length() + 22);
        sb2.append("LocationAvailability[");
        sb2.append(zB2);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f109552a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.F(parcel, 2, this.f109553b);
        i6.b.K(parcel, 3, this.f109554c);
        i6.b.F(parcel, 4, this.f109555d);
        i6.b.c0(parcel, 5, this.f109556e, i10, false);
        i6.b.g(parcel, 6, b2());
        i6.b.b(parcel, iA);
    }
}
