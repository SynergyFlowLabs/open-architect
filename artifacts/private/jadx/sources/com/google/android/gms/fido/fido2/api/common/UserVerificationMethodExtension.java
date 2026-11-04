package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "UserVerificationMethodExtensionCreator")
public class UserVerificationMethodExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UserVerificationMethodExtension> CREATOR = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getUvm", id = 1)
    private final boolean f107251a;

    @SafeParcelable.b
    public UserVerificationMethodExtension(@NonNull @SafeParcelable.e(id = 1) boolean z10) {
        this.f107251a = z10;
    }

    public boolean O1() {
        return this.f107251a;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        return (obj instanceof UserVerificationMethodExtension) && this.f107251a == ((UserVerificationMethodExtension) obj).f107251a;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Boolean.valueOf(this.f107251a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.g(parcel, 1, O1());
        i6.b.b(parcel, iA);
    }
}
