package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zze;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "LocationAvailabilityRequestCreator")
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "false", getter = "isBypass", id = 1)
    private final boolean f109695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getImpersonation", id = 2)
    @androidx.annotation.p0
    private final zze f109696b;

    @SafeParcelable.b
    zzad(@SafeParcelable.e(id = 1) boolean z10, @SafeParcelable.e(id = 2) @androidx.annotation.p0 zze zzeVar) {
        this.f109695a = z10;
        this.f109696b = zzeVar;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        return this.f109695a == zzadVar.f109695a && com.google.android.gms.common.internal.u.b(this.f109696b, zzadVar.f109696b);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(Boolean.valueOf(this.f109695a));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LocationAvailabilityRequest[");
        if (this.f109695a) {
            sb2.append("bypass, ");
        }
        if (this.f109696b != null) {
            sb2.append("impersonation=");
            sb2.append(this.f109696b);
            sb2.append(", ");
        }
        sb2.setLength(sb2.length() - 2);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f109695a;
        int iA = i6.b.a(parcel);
        i6.b.g(parcel, 1, z10);
        i6.b.S(parcel, 2, this.f109696b, i10, false);
        i6.b.b(parcel, iA);
    }
}
