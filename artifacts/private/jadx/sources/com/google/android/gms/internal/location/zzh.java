package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "DeviceOrientationRequestInternalCreator")
public final class zzh extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_DEVICE_ORIENTATION_REQUEST", id = 1)
    final DeviceOrientationRequest f108262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_CLIENTS", id = 2)
    final List f108263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = AbstractJsonLexerKt.NULL, id = 3)
    @androidx.annotation.p0
    final String f108264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final List f108260d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final DeviceOrientationRequest f108261e = new DeviceOrientationRequest.a(20000).a();
    public static final Parcelable.Creator<zzh> CREATOR = new f4();

    @SafeParcelable.b
    zzh(@SafeParcelable.e(id = 1) DeviceOrientationRequest deviceOrientationRequest, @SafeParcelable.e(id = 2) List list, @SafeParcelable.e(id = 3) String str) {
        this.f108262a = deviceOrientationRequest;
        this.f108263b = list;
        this.f108264c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        if (!com.google.android.gms.common.internal.u.b(this.f108262a, zzhVar.f108262a) || !com.google.android.gms.common.internal.u.b(this.f108263b, zzhVar.f108263b) || !com.google.android.gms.common.internal.u.b(this.f108264c, zzhVar.f108264c)) {
            return false;
        }
        int i10 = 2 | 1;
        return true;
    }

    public final int hashCode() {
        return this.f108262a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f108262a);
        String strValueOf2 = String.valueOf(this.f108263b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        String str = this.f108264c;
        StringBuilder sb2 = new StringBuilder(length + 68 + length2 + 7 + String.valueOf(str).length() + 2);
        sb2.append("DeviceOrientationRequestInternal[deviceOrientationRequest=");
        sb2.append(strValueOf);
        sb2.append(", clients=");
        sb2.append(strValueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("']");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, this.f108262a, i10, false);
        i6.b.d0(parcel, 2, this.f108263b, false);
        i6.b.Y(parcel, 3, this.f108264c, false);
        i6.b.b(parcel, iA);
    }
}
