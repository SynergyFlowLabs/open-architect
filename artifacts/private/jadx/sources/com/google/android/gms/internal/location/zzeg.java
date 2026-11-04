package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "LocationRequestInternalCreator")
@SafeParcelable.g({2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1000})
@Deprecated
public final class zzeg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeg> CREATOR = new j3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = AbstractJsonLexerKt.NULL, id = 1)
    LocationRequest f108240a;

    @SafeParcelable.b
    zzeg(@SafeParcelable.e(id = 1) LocationRequest locationRequest, @SafeParcelable.f(defaultValueUnchecked = AbstractJsonLexerKt.NULL, id = 5) @androidx.annotation.p0 List list, @SafeParcelable.f(defaultValue = "false", id = 8) boolean z10, @SafeParcelable.f(defaultValue = "false", id = 9) boolean z11, @SafeParcelable.f(defaultValue = "false", id = 11) boolean z12, @SafeParcelable.f(defaultValue = "false", id = 12) boolean z13, @SafeParcelable.f(defaultValueUnchecked = AbstractJsonLexerKt.NULL, id = 13) @androidx.annotation.p0 String str, @SafeParcelable.f(defaultValueUnchecked = "Long.MAX_VALUE", id = 14) long j10) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    com.google.android.gms.common.util.d0.a(workSource, clientIdentity.f106459a, clientIdentity.f106460b);
                }
            }
            aVar.n(workSource);
        }
        if (z10) {
            aVar.c(1);
        }
        if (z11) {
            aVar.l(2);
        }
        if (z12) {
            aVar.m(true);
        }
        if (z13) {
            aVar.k(true);
        }
        if (j10 != Long.MAX_VALUE) {
            aVar.e(j10);
        }
        this.f108240a = aVar.a();
    }

    @Deprecated
    public static zzeg O1(@androidx.annotation.p0 String str, LocationRequest locationRequest) {
        return new zzeg(locationRequest, null, false, false, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj instanceof zzeg) {
            return com.google.android.gms.common.internal.u.b(this.f108240a, ((zzeg) obj).f108240a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f108240a.hashCode();
    }

    public final String toString() {
        return this.f108240a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, this.f108240a, i10, false);
        i6.b.b(parcel, iA);
    }
}
