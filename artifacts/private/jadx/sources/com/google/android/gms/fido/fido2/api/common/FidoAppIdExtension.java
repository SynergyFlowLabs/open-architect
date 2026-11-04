package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "FidoAppIdExtensionCreator")
@SafeParcelable.g({1})
public class FidoAppIdExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getAppId", id = 2)
    private final String f107161a;

    @SafeParcelable.b
    public FidoAppIdExtension(@NonNull @SafeParcelable.e(id = 2) String str) {
        this.f107161a = (String) com.google.android.gms.common.internal.w.r(str);
    }

    @NonNull
    public String O1() {
        return this.f107161a;
    }

    public boolean equals(@NonNull Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.f107161a.equals(((FidoAppIdExtension) obj).f107161a);
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107161a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 2, O1(), false);
        i6.b.b(parcel, iA);
    }
}
