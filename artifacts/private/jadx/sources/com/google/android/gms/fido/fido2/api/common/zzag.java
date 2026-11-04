package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GoogleTunnelServerIdExtensionCreator")
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getTunnelServerId", id = 1)
    private final String f107302a;

    @SafeParcelable.b
    public zzag(@NonNull @SafeParcelable.e(id = 1) String str) {
        this.f107302a = (String) com.google.android.gms.common.internal.w.r(str);
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj instanceof zzag) {
            return this.f107302a.equals(((zzag) obj).f107302a);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107302a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 1, this.f107302a, false);
        i6.b.b(parcel, iA);
    }
}
