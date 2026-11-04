package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SignInResponseCreator")
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f110945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getConnectionResult", id = 2)
    private final ConnectionResult f110946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getResolveAccountResponse", id = 3)
    @p0
    private final zav f110947c;

    @SafeParcelable.b
    zak(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) ConnectionResult connectionResult, @SafeParcelable.e(id = 3) @p0 zav zavVar) {
        this.f110945a = i10;
        this.f110946b = connectionResult;
        this.f110947c = zavVar;
    }

    public final ConnectionResult O1() {
        return this.f110946b;
    }

    @p0
    public final zav T1() {
        return this.f110947c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f110945a);
        i6.b.S(parcel, 2, this.f110946b, i10, false);
        i6.b.S(parcel, 3, this.f110947c, i10, false);
        i6.b.b(parcel, iA);
    }
}
