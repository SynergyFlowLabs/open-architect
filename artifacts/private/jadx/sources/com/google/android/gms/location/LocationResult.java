package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "LocationResultCreator")
@SafeParcelable.g({1000})
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "LocationResult.DEFAULT_LOCATIONS", getter = "getLocations", id = 1)
    private final List f109592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final List f109591b = Collections.EMPTY_LIST;

    @NonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new d0();

    @SafeParcelable.b
    LocationResult(@SafeParcelable.e(id = 1) List list) {
        this.f109592a = list;
    }

    @NonNull
    public static LocationResult O1(@NonNull List<Location> list) {
        if (list == null) {
            list = f109591b;
        }
        return new LocationResult(list);
    }

    @androidx.annotation.p0
    public static LocationResult T1(@NonNull Intent intent) {
        if (!f2(intent)) {
            return null;
        }
        LocationResult locationResult = (LocationResult) i6.c.b(intent, "com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES", CREATOR);
        return locationResult == null ? (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") : locationResult;
    }

    public static boolean f2(@NonNull Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") || intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES");
    }

    @androidx.annotation.p0
    public Location b2() {
        int size = this.f109592a.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f109592a.get(size - 1);
    }

    @NonNull
    public List<Location> e2() {
        return this.f109592a;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (Build.VERSION.SDK_INT >= 31) {
            return this.f109592a.equals(locationResult.f109592a);
        }
        if (this.f109592a.size() != locationResult.f109592a.size()) {
            return false;
        }
        Iterator it = locationResult.f109592a.iterator();
        for (Location location : this.f109592a) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !com.google.android.gms.common.internal.u.b(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f109592a);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LocationResult");
        int i10 = h0.f109667d;
        List list = this.f109592a;
        sb2.ensureCapacity(list.size() * 100);
        sb2.append("[");
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            h0.a((Location) it.next(), sb2);
            sb2.append(", ");
            z10 = true;
        }
        if (z10) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.d0(parcel, 1, e2(), false);
        i6.b.b(parcel, iA);
    }
}
