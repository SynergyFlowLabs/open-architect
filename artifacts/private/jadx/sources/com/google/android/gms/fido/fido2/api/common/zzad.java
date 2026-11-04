package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GoogleSilentVerificationExtensionCreator")
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getSilentVerification", id = 1)
    private final boolean f107301a;

    @SafeParcelable.b
    public zzad(@NonNull @SafeParcelable.e(id = 1) boolean z10) {
        this.f107301a = ((Boolean) com.google.android.gms.common.internal.w.r(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if ((obj instanceof zzad) && this.f107301a == ((zzad) obj).f107301a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(Boolean.valueOf(this.f107301a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.g(parcel, 1, this.f107301a);
        i6.b.b(parcel, iA);
    }
}
