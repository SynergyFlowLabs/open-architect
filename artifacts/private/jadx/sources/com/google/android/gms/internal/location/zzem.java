package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "RemoveGeofencingRequestCreator")
@SafeParcelable.g({1000})
public final class zzem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzem> CREATOR = new m3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGeofenceIds", id = 1)
    private final List f108257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPendingIntent", id = 2)
    @androidx.annotation.p0
    private final PendingIntent f108258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "", getter = "getTag", id = 3)
    private final String f108259c;

    @SafeParcelable.b
    zzem(@SafeParcelable.e(id = 1) @androidx.annotation.p0 List list, @SafeParcelable.e(id = 2) @androidx.annotation.p0 PendingIntent pendingIntent, @SafeParcelable.e(id = 3) String str) {
        this.f108257a = list == null ? w3.s() : w3.t(list);
        this.f108258b = pendingIntent;
        this.f108259c = str;
    }

    public static zzem O1(List list) {
        com.google.android.gms.common.internal.w.s(list, "geofence can't be null.");
        com.google.android.gms.common.internal.w.b(!list.isEmpty(), "Geofences must contains at least one id.");
        return new zzem(list, null, "");
    }

    public static zzem T1(PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.w.s(pendingIntent, "PendingIntent can not be null.");
        return new zzem(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f108257a;
        int iA = i6.b.a(parcel);
        i6.b.a0(parcel, 1, list, false);
        i6.b.S(parcel, 2, this.f108258b, i10, false);
        i6.b.Y(parcel, 3, this.f108259c, false);
        i6.b.b(parcel, iA);
    }
}
