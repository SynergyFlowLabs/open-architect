package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "FusedLocationProviderResultCreator")
@SafeParcelable.g({1000})
public final class zzl extends AbstractSafeParcelable implements com.google.android.gms.common.api.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStatus", id = 1)
    private final Status f108270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzl f108269b = new zzl(Status.f105886f);
    public static final Parcelable.Creator<zzl> CREATOR = new h4();

    @SafeParcelable.b
    public zzl(@SafeParcelable.e(id = 1) Status status) {
        this.f108270a = status;
    }

    @Override // com.google.android.gms.common.api.v
    public final Status t() {
        return this.f108270a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, this.f108270a, i10, false);
        i6.b.b(parcel, iA);
    }
}
