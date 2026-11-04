package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthenticationExtensionsCredPropsOutputsCreator")
public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getIsDiscoverableCredential", id = 1)
    private final boolean f107114a;

    @SafeParcelable.b
    public AuthenticationExtensionsCredPropsOutputs(@SafeParcelable.e(id = 1) boolean z10) {
        this.f107114a = z10;
    }

    public boolean O1() {
        return this.f107114a;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof AuthenticationExtensionsCredPropsOutputs) || this.f107114a != ((AuthenticationExtensionsCredPropsOutputs) obj).f107114a) {
            return false;
        }
        int i10 = 4 << 1;
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Boolean.valueOf(this.f107114a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.g(parcel, 1, O1());
        i6.b.b(parcel, iA);
    }
}
