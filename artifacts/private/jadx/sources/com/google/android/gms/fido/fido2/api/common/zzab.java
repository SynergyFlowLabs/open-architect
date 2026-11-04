package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GoogleSessionIdExtensionCreator")
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getSessionId", id = 1)
    private final long f107300a;

    @SafeParcelable.b
    public zzab(@NonNull @SafeParcelable.e(id = 1) long j10) {
        this.f107300a = ((Long) com.google.android.gms.common.internal.w.r(Long.valueOf(j10))).longValue();
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if ((obj instanceof zzab) && this.f107300a == ((zzab) obj).f107300a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(Long.valueOf(this.f107300a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.K(parcel, 1, this.f107300a);
        i6.b.b(parcel, iA);
    }
}
