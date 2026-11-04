package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GoogleMultiAssertionExtensionCreator")
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getRequestForMultiAssertion", id = 1)
    private final boolean f107319a;

    @SafeParcelable.b
    public zzz(@NonNull @SafeParcelable.e(id = 1) boolean z10) {
        this.f107319a = ((Boolean) com.google.android.gms.common.internal.w.r(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzz) && this.f107319a == ((zzz) obj).f107319a;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(Boolean.valueOf(this.f107319a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.g(parcel, 1, this.f107319a);
        i6.b.b(parcel, iA);
    }
}
