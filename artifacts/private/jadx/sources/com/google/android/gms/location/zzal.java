package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "NetworkLocationStatusCreator")
@com.google.android.gms.common.internal.a0
@Deprecated
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 1)
    public final int f109697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 2)
    public final int f109698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 3)
    public final long f109699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 4)
    public final long f109700d;

    @SafeParcelable.b
    zzal(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) long j10, @SafeParcelable.e(id = 4) long j11) {
        this.f109697a = i10;
        this.f109698b = i11;
        this.f109699c = j10;
        this.f109700d = j11;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj instanceof zzal) {
            zzal zzalVar = (zzal) obj;
            if (this.f109697a == zzalVar.f109697a && this.f109698b == zzalVar.f109698b && this.f109699c == zzalVar.f109699c && this.f109700d == zzalVar.f109700d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(this.f109698b), Integer.valueOf(this.f109697a), Long.valueOf(this.f109700d), Long.valueOf(this.f109699c));
    }

    public final String toString() {
        int i10 = this.f109697a;
        int length = String.valueOf(i10).length();
        int i11 = this.f109698b;
        int length2 = String.valueOf(i11).length();
        long j10 = this.f109700d;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f109699c;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j11).length());
        sb2.append("NetworkLocationStatus: Wifi status: ");
        sb2.append(i10);
        sb2.append(" Cell status: ");
        sb2.append(i11);
        sb2.append(" elapsed time NS: ");
        sb2.append(j10);
        sb2.append(" system time ms: ");
        sb2.append(j11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f109697a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        int i12 = 5 >> 2;
        i6.b.F(parcel, 2, this.f109698b);
        i6.b.K(parcel, 3, this.f109699c);
        i6.b.K(parcel, 4, this.f109700d);
        i6.b.b(parcel, iA);
    }
}
