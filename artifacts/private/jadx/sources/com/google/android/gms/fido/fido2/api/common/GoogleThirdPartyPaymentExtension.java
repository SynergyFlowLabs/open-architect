package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GoogleThirdPartyPaymentExtensionCreator")
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getThirdPartyPayment", id = 1)
    private final boolean f107168a;

    @SafeParcelable.b
    public GoogleThirdPartyPaymentExtension(@SafeParcelable.e(id = 1) boolean z10) {
        this.f107168a = z10;
    }

    public boolean O1() {
        return this.f107168a;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        return (obj instanceof GoogleThirdPartyPaymentExtension) && this.f107168a == ((GoogleThirdPartyPaymentExtension) obj).O1();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Boolean.valueOf(this.f107168a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.g(parcel, 1, O1());
        i6.b.b(parcel, iA);
    }
}
