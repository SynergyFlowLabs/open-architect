package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.g({1000})
@com.google.android.gms.common.internal.a0
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStartHour", id = 1)
    private final int f109701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStartMinute", id = 2)
    private final int f109702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getEndHour", id = 3)
    private final int f109703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getEndMinute", id = 4)
    private final int f109704d;

    @SafeParcelable.b
    public zzas(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) int i12, @SafeParcelable.e(id = 4) int i13) {
        com.google.android.gms.common.internal.w.y(i10 >= 0 && i10 <= 23, "Start hour must be in range [0, 23].");
        com.google.android.gms.common.internal.w.y(i11 >= 0 && i11 <= 59, "Start minute must be in range [0, 59].");
        com.google.android.gms.common.internal.w.y(i12 >= 0 && i12 <= 23, "End hour must be in range [0, 23].");
        com.google.android.gms.common.internal.w.y(i13 >= 0 && i13 <= 59, "End minute must be in range [0, 59].");
        com.google.android.gms.common.internal.w.y(((i10 + i11) + i12) + i13 > 0, "Parameters can't be all 0.");
        this.f109701a = i10;
        this.f109702b = i11;
        this.f109703c = i12;
        this.f109704d = i13;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        zzas zzasVar = (zzas) obj;
        return this.f109701a == zzasVar.f109701a && this.f109702b == zzasVar.f109702b && this.f109703c == zzasVar.f109703c && this.f109704d == zzasVar.f109704d;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(this.f109701a), Integer.valueOf(this.f109702b), Integer.valueOf(this.f109703c), Integer.valueOf(this.f109704d));
    }

    public final String toString() {
        int i10 = this.f109701a;
        int length = String.valueOf(i10).length();
        int i11 = this.f109702b;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f109703c;
        int length3 = String.valueOf(i12).length();
        int i13 = this.f109704d;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 10 + length3 + 12 + String.valueOf(i13).length() + 1);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(i10);
        sb2.append(", startMinute=");
        sb2.append(i11);
        sb2.append(", endHour=");
        sb2.append(i12);
        sb2.append(", endMinute=");
        sb2.append(i13);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.common.internal.w.r(parcel);
        int i11 = this.f109701a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.F(parcel, 2, this.f109702b);
        i6.b.F(parcel, 3, this.f109703c);
        i6.b.F(parcel, 4, this.f109704d);
        i6.b.b(parcel, iA);
    }
}
