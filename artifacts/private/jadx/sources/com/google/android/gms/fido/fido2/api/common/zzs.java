package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "CableAuthenticationExtensionCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getCableAuthentication", id = 1)
    private final List f107317a;

    @SafeParcelable.b
    public zzs(@NonNull @SafeParcelable.e(id = 1) List list) {
        this.f107317a = (List) com.google.android.gms.common.internal.w.r(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        if (!this.f107317a.containsAll(zzsVar.f107317a) || !zzsVar.f107317a.containsAll(this.f107317a)) {
            return false;
        }
        boolean z10 = false | true;
        return true;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(new HashSet(this.f107317a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.d0(parcel, 1, this.f107317a, false);
        i6.b.b(parcel, iA);
    }
}
